package idees.gama.ui.editFrame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.google.inject.Injector;

import gama.EAction;
import gama.EFacet;
import gama.EGamaObject;
import gama.EReflex;
import gama.ESpecies;
import gama.EWorldAgent;
import idees.gama.diagram.GAMARessourceProvider;
import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.diagram.ModelStructure;
import idees.gama.features.ExampleUtil;
import idees.gama.features.edit.EditFeature;
import idees.gama.features.modelgeneration.ModelGenerator;
import msi.gama.lang.gaml.gaml.Model;
import msi.gama.lang.gaml.gaml.impl.S_ActionImpl;
import msi.gama.lang.gaml.gaml.impl.S_DefinitionImpl;
import msi.gama.lang.gaml.gaml.impl.S_DisplayImpl;
import msi.gama.lang.gaml.gaml.impl.S_ExperimentImpl;
import msi.gama.lang.gaml.gaml.impl.S_ReflexImpl;
import msi.gama.lang.gaml.gaml.impl.S_SpeciesImpl;
import msi.gama.lang.gaml.gaml.impl.VariableRefImpl;
import msi.gama.lang.gaml.ui.internal.GamlActivator;
import msi.gama.lang.utils.EGaml;
import msi.gaml.compilation.GamlCompilationError;
import msi.gaml.descriptions.FacetProto;
import msi.gaml.descriptions.SymbolProto;
import msi.gaml.factories.DescriptionFactory;

public abstract class EditFrame extends ApplicationWindow {

	Diagram diagram;
	EditFeature ef;
	IFeatureProvider fp;
	String name;
	EGamaObject eobject;
	ValidateText textName;
	EditFrame frame;
	Shell shell;
	EmbeddedEditorModelAccess modelXText;
	EmbeddedEditor editor;

	Map<String,Composite> facetsEditor;

	List<String> gridFacets = Arrays.asList("schedules", "frequency", "control", "neighbors","file", "cell_height", "cell_width", "width", "height", "use_regular_agents","use_individual_shapes","use_neighbors_cache");
	List<String> globalFacets = Arrays.asList("schedules", "frequency","control", "torus");
	List<String> speciesFacets = Arrays.asList("schedules", "frequency","control");
	Map<String,List<String>> comboValues;
	GAMARessourceProvider rp ;
	/**
	 * Create the application window.
	 */
	public EditFrame(final Diagram diagram, final IFeatureProvider fp, final EditFeature ef, final EGamaObject eobject,
		final String name) {
		super(null);
		facetsEditor = new Hashtable<String,Composite>();
		this.diagram = diagram;
		frame = this;
		this.fp = fp;
		this.ef = ef;
		this.name = name;
		this.eobject = eobject;
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();

	}

	static public String fromErrorToString(final GamlCompilationError error) {
		String result = "Error concerning: ";
		EObject toto = error.getStatement();
		java.util.List<String> ids = new ArrayList<String>();
		do {
			if ( toto instanceof VariableRefImpl ) {
				VariableRefImpl vv = (VariableRefImpl) toto;
				ids.add(0, vv.getRef().getName());
			} else if ( toto instanceof S_ReflexImpl ) {
				S_ReflexImpl vv = (S_ReflexImpl) toto;
				if ( vv.getName() != null ) {
					ids.add(0, vv.getName());
				} else {
					ids.add(0, "init");
				}
			} else if ( toto instanceof S_SpeciesImpl ) {
				S_SpeciesImpl vv = (S_SpeciesImpl) toto;
				ids.add(0, vv.getName());
			} else if ( toto instanceof S_ActionImpl ) {
				S_ActionImpl vv = (S_ActionImpl) toto;
				ids.add(0, vv.getName());
			} else if ( toto instanceof S_DisplayImpl ) {
				S_DisplayImpl vv = (S_DisplayImpl) toto;
				ids.add(0, vv.getName());
			} else if ( toto instanceof S_ExperimentImpl ) {
				S_ExperimentImpl vv = (S_ExperimentImpl) toto;
				ids.add(0, vv.getName());
			} else if ( toto instanceof S_DefinitionImpl ) {
				S_DefinitionImpl vv = (S_DefinitionImpl) toto;
				ids.add(0, vv.getName());
			}
			toto = toto.eContainer();
		} while (!(toto instanceof Model));
		for ( int i = 0; i < ids.size(); i++ ) {
			String id = ids.get(i);
			result += "->" + id;
		}
		result += " : " + error.toString();
		return result;
	}

	
	protected Group groupFacets(final Composite container, String gamlName, int nbCol) {
		SymbolProto proto = "layer".equals(gamlName) ? DescriptionFactory.getStatementProto("display_population"): DescriptionFactory.getStatementProto(gamlName);
		Group group = new Group(container, SWT.NONE);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(nbCol, false));
		List<String> facets ;
		if ("grid".equals(gamlName)) {
			facets = gridFacets;
		}else if ("global".equals(gamlName)) {
			facets = globalFacets;
		}else if ("species".equals(gamlName)) {
			facets = speciesFacets;
		} else facets = new ArrayList<String>(proto.getPossibleFacets().keySet());
		for (String facet : facets) {
			FacetProto pt =  proto.getFacet(facet);
			if( pt.deprecated != null) continue;
			if( pt.internal ) continue;
			if ((!"name".equals(gamlName) && "name".equals(facet)) ) continue;
			if ("layer".equals(gamlName) && ("aspect".equals(facet) || "species".equals(facet))) continue;
			if (comboValues != null && comboValues.containsKey(facet))
				groupFacetCombo(group,facet,comboValues.get(facet),pt.doc);
			else groupFacet(group,facet,pt.typesToString(),pt.doc);
		}
		return group;
	}
	
	protected void groupFacetCombo(final Composite container, final String facetName, final List<String> values, final String doc) {
		Group group = new Group(container, SWT.NONE);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);
		
		group.setLayout(new GridLayout(2, false));

		CLabel lblName = new CLabel(group, SWT.NONE);
		lblName.setText(facetName +":");
		
		CCombo textFacet = new CCombo(group, SWT.BORDER);
		String[] items = new String[values.size()];
		for (int i = 0; i< values.size(); i++) 
			items[i] = values.get(i);
		textFacet.setItems(items);
		textFacet.setText(values.get(0));
			
		textFacet.setToolTipText(doc);
		String val = facetValue(facetName);
		if (val != null && ! val.isEmpty()) textFacet.setText(val);
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		textFacet.setLayoutData(gridData2);
		facetsEditor.put(facetName, textFacet);
		textFacet.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				save(null);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});

	}
	protected void groupFacet(final Composite container, final String facetName, final String type, final String doc) {
		Group group = new Group(container, SWT.NONE);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(2, false));

		CLabel lblName = new CLabel(group, SWT.NONE);
		lblName.setText(facetName + " ("+type.replaceFirst(" ", "") +")"+":");
		
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
		
		List<String> uselessName = null;
		String nm = "";
		if (!facetName.equals("name")) {
			uselessName = new ArrayList<String>();
			uselessName.add("name");
		}
		else {
			nm = "name";
		}
		
		ValidateText textFacet = new ValidateText(group, SWT.BORDER, diagram, fp, this, diagramEditor, nm, uselessName, null);
		textFacet.setToolTipText(doc);
		String val = facetValue(facetName);
		if (val != null) textFacet.setText(val);
		else textFacet.setText("");
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		textFacet.setLayoutData(gridData2);
		if ( eobject instanceof EWorldAgent && facetName.equals("name")) {
			textFacet.setEditable(false);
		}
		textFacet.setSaveData(true);
		facetsEditor.put(facetName, textFacet);

	}
	
	protected void groupGamlCode(final Composite container, final String title) {
		Group group = new Group(container, SWT.NONE);

		group.setLayout(new FillLayout(SWT.HORIZONTAL));
		group.setText(title);

		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(1, false));

		final Injector injector = GamlActivator.getInstance().getInjector("msi.gama.lang.gaml.Gaml");
		
		rp = injector.getInstance(GAMARessourceProvider.class);
		rp.setName(((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp)).getTitle(), fp, diagram);
		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
		
		editor = factory.newEditor(rp).showErrorAndWarningAnnotations().withParent(group);
		
		XtextResourceSet rs = EGaml.getInstance(XtextResourceSet.class);
		rs.setClasspathURIContext(ModelGenerator.class);
		ModelStructure struct= new ModelStructure(diagram, fp);
		struct.writeModelWithoutElement(this.eobject);
		
		
		modelXText = editor.createPartialEditor(struct.getPrefix(), struct.getText(), struct.getSuffix(),true);
		
	}
	
	
	protected void groupName(final Composite container) {
		groupName(container, true);
	}

	
	protected void groupName(final Composite container, final boolean hasNameFaeture) {
		Group group = new Group(container, SWT.NONE);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);

		group.setLayout(new GridLayout(2, false));

		CLabel lblName = new CLabel(group, SWT.NONE);
		lblName.setText("Name:");

		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
		textName = new ValidateText(group, SWT.BORDER, diagram, fp, this, diagramEditor, "name", null, null);
		textName.setNameFeature(hasNameFaeture);
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		textName.setLayoutData(gridData2);
		textName.setText(eobject.getName());
		if ( eobject instanceof EWorldAgent ) {
			textName.setEditable(false);
		}
		textName.setSaveData(true);

	}

	protected Canvas canvasName(final Composite container) {
		return canvasName(container, true);
	}

	protected Canvas canvasName(final Composite container, final boolean hasNameFaeture) {
		Canvas canvasName = new Canvas(container, SWT.BORDER);
		
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
		textName = new ValidateText(canvasName, SWT.BORDER, diagram, fp, this, diagramEditor, "name", null, null);
		textName.setNameFeature(hasNameFaeture);
		UtilEditFrame.buildCanvasName(container, canvasName, textName, eobject, ef);
		canvasName.setBounds(10, 10, 720, 30);
		textName.setSaveData(true);
		return canvasName;
	}

	
	/**
	 * Create the menu manager.
	 * @return the menu manager
	 */
	@Override
	protected MenuManager createMenuManager() {
		MenuManager menuManager = new MenuManager("menu");
		return menuManager;
	}

	/**
	 * Create the toolbar manager.
	 * @return the toolbar manager
	 */
	@Override
	protected ToolBarManager createToolBarManager(final int style) {
		ToolBarManager toolBarManager = new ToolBarManager(style);
		return toolBarManager;
	}

	/**
	 * Create the status line manager.
	 * @return the status line manager
	 */
	@Override
	protected StatusLineManager createStatusLineManager() {
		StatusLineManager statusLineManager = new StatusLineManager();
		return statusLineManager;
	}

	/**
	 * Configure the shell.
	 * @param newShell
	 */
	@Override
	protected void configureShell(final Shell newShell) {
		super.configureShell(newShell);

		newShell.setText(name);
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(743, 727);
	}

	
	protected abstract void save(String name);

	@Override
	protected void handleShellCloseEvent() {
		// create dialog with ok and cancel button and info icon
		frame.clean();
		this.save(null);
		this.close();
	}

	@Override
	public void create() {
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE);
		super.create();
		shell = getShell();

	}

	protected void clean() {
		
	}

	
	public void updateError() {

	}
	
	public String facetValue(String facetName) {
		for (EFacet facet : eobject.getFacets()) {
			if (facet.getName().equals(facetName)) {
				return facet.getValue();
			}
		}
		return null;
	}
	
	
	public void saveFacets(){
		for (String facet : facetsEditor.keySet()) {
			Composite vt = facetsEditor.get(facet);
			if (vt == null) continue;
			if (vt instanceof ValidateText)
				saveFacetValue(facet, ((ValidateText) facetsEditor.get(facet)).getText());
			else if (vt instanceof CCombo)
				saveFacetValue(facet, ((CCombo) facetsEditor.get(facet)).getText());
		}
	}

	public void saveFacetValue(String facetName, String facetValue){
		for (EFacet facet : eobject.getFacets()) {
			if (facet.getName().equals(facetName)) {
				facet.setValue(facetValue);
				return;
			}
		}
		final EFacet eFacet = gama.GamaFactory.eINSTANCE.createEFacet();
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
		if ( domain != null ) {
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {
					eFacet.setName(facetName);
					eFacet.setValue(facetValue);
					diagram.eResource().getContents().add(eFacet);
					eobject.getFacets().add(eFacet);
				}
			});
		}
	}
	
	
	public void saveEditorCode(){
		if (modelXText == null) return;
		if (eobject instanceof ESpecies) ((ESpecies) eobject).setInit(modelXText.getEditablePart());
		else if (eobject instanceof EAction) ((EAction) eobject).setGamlCode(modelXText.getEditablePart());
		else if (eobject instanceof EReflex) ((EReflex) eobject).setGamlCode(modelXText.getEditablePart());
	}
	
	public void updateEditor(){
		if (modelXText == null) return;
		saveEditorCode();
		XtextResourceSet rs = EGaml.getInstance(XtextResourceSet.class);
		rs.setClasspathURIContext(ModelGenerator.class);
		ModelStructure struct= new ModelStructure(diagram, fp);
		struct.writeModelWithoutElement(this.eobject);
		modelXText.updateModel(struct.getPrefix(), struct.getText(), struct.getSuffix());
	}
}
