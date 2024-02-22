/*******************************************************************************************************
 *
 * EditFrame.java, in idees.gama.graphicalmodeling, is part of the source code of the GAMA modeling and simulation
 * platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package idees.gama.ui.editFrame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
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
import gama.gaml.compilation.GamlCompilationError;
import gama.gaml.descriptions.FacetProto;
import gama.gaml.descriptions.SymbolProto;
import gama.gaml.factories.DescriptionFactory;
import gama.ui.editor.internal.EditorActivator;
import gaml.compiler.gaml.Model;
import gaml.compiler.gaml.impl.S_ActionImpl;
import gaml.compiler.gaml.impl.S_DefinitionImpl;
import gaml.compiler.gaml.impl.S_DisplayImpl;
import gaml.compiler.gaml.impl.S_ExperimentImpl;
import gaml.compiler.gaml.impl.S_ReflexImpl;
import gaml.compiler.gaml.impl.S_SpeciesImpl;
import gaml.compiler.gaml.impl.VariableRefImpl;
import idees.gama.diagram.GAMARessourceProvider;
import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.diagram.ModelStructure;
import idees.gama.features.ExampleUtil;
import idees.gama.features.edit.EditFeature;
import idees.gama.features.modelgeneration.ModelGenerator;

/**
 * The Class EditFrame.
 */
public abstract class EditFrame extends ApplicationWindow {

	/** The diagram. */
	Diagram diagram;

	/** The ef. */
	EditFeature ef;

	/** The fp. */
	IFeatureProvider fp;

	/** The name. */
	String name;

	/** The eobject. */
	EGamaObject eobject;

	/** The text name. */
	ValidateText textName;

	/** The frame. */
	EditFrame frame;

	/** The shell. */
	Shell shell;

	/** The model X text. */
	EmbeddedEditorModelAccess modelXText;

	/** The editor. */
	EmbeddedEditor editor;

	/** The radio gaml. */
	Button radioGaml;

	/** The radio edit. */
	Button radioEdit;

	/** The combos. */
	List<CCombo> combos;

	/** The facets editor. */
	Map<String, Composite> facetsEditor;

	/** The facets to remove. */
	List<String> facetsToRemove;

	/** The grid facets. */
	List<String> gridFacets = Arrays.asList("schedules", "frequency", "control", "neighbors", "file", "cell_height",
			"cell_width", "width", "height", "use_regular_agents", "use_individual_shapes", "use_neighbors_cache");

	/** The global facets. */
	List<String> globalFacets = Arrays.asList("schedules", "frequency", "control", "torus");

	/** The species facets. */
	List<String> speciesFacets = Arrays.asList("schedules", "frequency", "control");

	/** The combo values. */
	Map<String, List<String>> comboValues;

	/** The rp. */
	GAMARessourceProvider rp;

	/**
	 * Instantiates a new edits the frame.
	 *
	 * @param diagram
	 *            the diagram
	 * @param fp
	 *            the fp
	 * @param ef
	 *            the ef
	 * @param eobject
	 *            the eobject
	 * @param name
	 *            the name
	 * @param facetsToRemove
	 *            the facets to remove
	 */
	public EditFrame(final Diagram diagram, final IFeatureProvider fp, final EditFeature ef, final EGamaObject eobject,
			final String name, final List<String> facetsToRemove) {
		super(null);
		this.facetsToRemove = facetsToRemove;
		facetsEditor = new Hashtable<>();
		combos = new ArrayList<>();
		this.diagram = diagram;
		frame = this;
		this.fp = fp;
		this.ef = ef;
		this.name = name;
		this.eobject = eobject;
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
		ModelGenerator.modelValidation(fp, diagram);
	}

	/**
	 * Create the application window.
	 */
	public EditFrame(final Diagram diagram, final IFeatureProvider fp, final EditFeature ef, final EGamaObject eobject,
			final String name) {
		super(null);
		facetsToRemove = new ArrayList<>();
		facetsEditor = new Hashtable<>();
		combos = new ArrayList<>();
		this.diagram = diagram;
		frame = this;
		this.fp = fp;
		this.ef = ef;
		this.name = name;
		this.eobject = eobject;
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
		ModelGenerator.modelValidation(fp, diagram);
	}

	/**
	 * Gets the facets to remove.
	 *
	 * @return the facets to remove
	 */
	public List<String> getFacetsToRemove() { return facetsToRemove; }

	/**
	 * From error to string.
	 *
	 * @param error
	 *            the error
	 * @return the string
	 */
	static public String fromErrorToString(final GamlCompilationError error) {
		StringBuilder result = new StringBuilder("Error concerning: ");
		EObject toto = error.getStatement();
		final java.util.List<String> ids = new ArrayList<>();
		do {
			if (toto instanceof final VariableRefImpl vv) {
				ids.add(0, vv.getRef().getName());
			} else if (toto instanceof final S_ReflexImpl vv) {
				if (vv.getName() != null) {
					ids.add(0, vv.getName());
				} else {
					ids.add(0, "init");
				}
			} else if ( (toto instanceof final S_ExperimentImpl vv)) {
				ids.add(0, vv.getName());
			}  else if ((toto instanceof final S_DisplayImpl vv)) {
				ids.add(0, vv.getName());
			}  else if ( (toto instanceof final S_ActionImpl vv)) {
				ids.add(0, vv.getName());
			}  else if ((toto instanceof final S_SpeciesImpl vv) ) {
				ids.add(0, vv.getName());
			} else if (toto instanceof final S_DefinitionImpl vv) { ids.add(0, vv.getName()); }
			toto = toto.eContainer();
		} while (!(toto instanceof Model));
		for (final String id : ids) { result.append("->").append(id); }
		result.append(" : ").append(error.toString());
		return result.toString();
	}

	/**
	 * Group facets.
	 *
	 * @param container
	 *            the container
	 * @param gamlName
	 *            the gaml name
	 * @param nbCol
	 *            the nb col
	 * @return the group
	 */
	protected Group groupFacets(final Composite container, final String gamlName, final int nbCol) {
		final SymbolProto proto = "layer".equals(gamlName) ? DescriptionFactory.getStatementProto("display_population")
				: DescriptionFactory.getStatementProto(gamlName);
		if (gamlName == "experiment") { System.out.println("proto: " + proto); }
		final Group group = new Group(container, SWT.NONE);
		final GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(nbCol, false));
		List<String> facets;
		if ("grid".equals(gamlName)) {
			facets = gridFacets;
		} else if ("global".equals(gamlName)) {
			facets = globalFacets;
		} else if ("species".equals(gamlName)) {
			facets = speciesFacets;
		} else {
			facets = new ArrayList<>(proto.getPossibleFacets().keySet());
			facets.removeAll(facetsToRemove);
			Collections.sort(facets);

		}
		for (final String facet : facets) {
			final FacetProto pt = proto.getFacet(facet);
			if (pt.deprecated != null || pt.internal || !"name".equals(gamlName) && "name".equals(facet)) { continue; }
			if ("layer".equals(gamlName) && ("aspect".equals(facet) || "species".equals(facet))) { continue; }
			if (comboValues != null && comboValues.containsKey(facet)) {
				combos.add(groupFacetCombo(group, facet, comboValues.get(facet), pt.doc));
			} else {
				groupFacet(group, facet, pt.typesToString(), pt.doc);
			}
		}
		return group;
	}

	/**
	 * Group facet combo.
	 *
	 * @param container
	 *            the container
	 * @param facetName
	 *            the facet name
	 * @param values
	 *            the values
	 * @param doc
	 *            the doc
	 * @return the c combo
	 */
	protected CCombo groupFacetCombo(final Composite container, final String facetName, final List<String> values,
			final String doc) {
		final Group group = new Group(container, SWT.NONE);
		final GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);

		group.setLayout(new GridLayout(2, false));

		final CLabel lblName = new CLabel(group, SWT.NONE);
		lblName.setText(facetName + ":");

		final CCombo textFacet = new CCombo(group, SWT.BORDER);
		final String[] items = new String[values.size()];
		for (int i = 0; i < values.size(); i++) { items[i] = values.get(i); }
		textFacet.setItems(items);
		textFacet.setText(values.get(0));

		textFacet.setToolTipText(doc);
		final String val = facetValue(facetName);
		if (val != null && !val.isEmpty()) { textFacet.setText(val); }
		final GridData gridData2 = new GridData();
		gridData2.heightHint = 20;
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		textFacet.setLayoutData(gridData2);
		facetsEditor.put(facetName, textFacet);
		textFacet.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				save(null);
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {}
		});
		return textFacet;

	}

	/**
	 * Group facet.
	 *
	 * @param container
	 *            the container
	 * @param facetName
	 *            the facet name
	 * @param type
	 *            the type
	 * @param doc
	 *            the doc
	 */
	protected void groupFacet(final Composite container, final String facetName, final String type, final String doc) {
		final Group group = new Group(container, SWT.NONE);
		final GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(2, false));

		final CLabel lblName = new CLabel(group, SWT.NONE);
		lblName.setText(facetName + " (" + type.replaceFirst(" ", "") + ")" + ":");

		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);

		List<String> uselessName = null;
		String nm = "";
		if (!"name".equals(facetName)) {
			uselessName = new ArrayList<>();
			uselessName.add("name");
		} else {
			nm = "name";
		}
		final ValidateText textFacet =
				new ValidateText(group, SWT.BORDER, diagram, fp, this, diagramEditor, nm, uselessName, null);
		textFacet.setToolTipText(doc);
		final String val = facetValue(facetName);
		if (val != null) {
			textFacet.setText(val);
		} else {
			textFacet.setText("");
		}
		final GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		textFacet.setLayoutData(gridData2);
		if (eobject instanceof EWorldAgent && "name".equals(facetName)) { textFacet.setEditable(false); }
		textFacet.setSaveData(true);
		facetsEditor.put(facetName, textFacet);

	}

	/**
	 * Group radio gaml code.
	 *
	 * @param container
	 *            the container
	 * @param title
	 *            the title
	 */
	protected void groupRadioGamlCode(final Composite container, final String title) {
		final Group group = new Group(container, SWT.NONE);

		group.setLayout(new FillLayout(SWT.HORIZONTAL));
		final CLabel lblName = new CLabel(group, SWT.NONE);
		lblName.setText("Define " + title + " through GAML code: ");

		final GridData gridData = new GridData();
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(3, false));
		radioGaml = new Button(group, SWT.RADIO);
		radioGaml.setText("Yes");
		radioGaml.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				removeOther();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {}
		});
		radioEdit = new Button(group, SWT.RADIO);
		radioEdit.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				removeGaml();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {}
		});
		radioEdit.setText("No");

	}

	/**
	 * Recursive set enabled.
	 *
	 * @param control
	 *            the control
	 * @param enabled
	 *            the enabled
	 */
	public static void recursiveSetEnabled(final Control control, final boolean enabled) {
		if (control instanceof final Composite comp) {
			for (final Control c : comp.getChildren()) { recursiveSetEnabled(c, enabled); }
		}
		if (enabled) {
			control.setForeground(new Color(control.getDisplay(), 0, 0, 0));
		} else {
			control.setForeground(new Color(control.getDisplay(), 200, 200, 200));
		}
		control.setEnabled(enabled);
	}

	/**
	 * Removes the gaml.
	 */
	public void removeGaml() {}

	/**
	 * Removes the other.
	 */
	public void removeOther() {}

	/**
	 * Group gaml code.
	 *
	 * @param container
	 *            the container
	 * @param title
	 *            the title
	 * @return the group
	 */
	protected Group groupGamlCode(final Composite container, final String title) {
		final Group group = new Group(container, SWT.NONE);

		group.setLayout(new FillLayout(SWT.HORIZONTAL));
		group.setText(title);

		final GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(1, false));

		final Injector injector = EditorActivator.getInstance().getInjector("msi.gama.lang.gaml.Gaml");

		rp = injector.getInstance(GAMARessourceProvider.class);
		rp.setName(ExampleUtil.getDiagramEditor(fp), fp, diagram);
		final EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);

		editor = factory.newEditor(rp).showErrorAndWarningAnnotations().withParent(group);

		final XtextResourceSet rs = new SynchronizedXtextResourceSet();
		rs.setClasspathURIContext(ModelGenerator.class);
		final ModelStructure struct = new ModelStructure(diagram, fp);
		struct.writeModelWithoutElement(this.eobject);

		modelXText = editor.createPartialEditor(struct.getPrefix(), struct.getText(), struct.getSuffix(), true);
		return group;
	}

	/**
	 * Group name.
	 *
	 * @param container
	 *            the container
	 */
	protected void groupName(final Composite container) {
		groupName(container, true);
	}

	/**
	 * Group name.
	 *
	 * @param container
	 *            the container
	 * @param hasNameFaeture
	 *            the has name faeture
	 */
	protected void groupName(final Composite container, final boolean hasNameFaeture) {
		final Group group = new Group(container, SWT.NONE);
		final GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);

		group.setLayout(new GridLayout(2, false));

		final CLabel lblName = new CLabel(group, SWT.NONE);
		lblName.setText("Name:");

		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
		textName = new ValidateText(group, SWT.BORDER, diagram, fp, this, diagramEditor, "name", null, null);
		textName.setNameFeature(hasNameFaeture);
		final GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		textName.setLayoutData(gridData2);
		textName.setText(eobject.getName());
		if (eobject instanceof EWorldAgent) { textName.setEditable(false); }
		textName.setSaveData(true);

	}

	/**
	 * Canvas name.
	 *
	 * @param container
	 *            the container
	 * @return the canvas
	 */
	protected Canvas canvasName(final Composite container) {
		return canvasName(container, true);
	}

	/**
	 * Canvas name.
	 *
	 * @param container
	 *            the container
	 * @param hasNameFeature
	 *            the has name feature
	 * @return the canvas
	 */
	protected Canvas canvasName(final Composite container, final boolean hasNameFeature) {
		final Canvas canvasName = new Canvas(container, SWT.BORDER);

		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
		textName = new ValidateText(canvasName, SWT.BORDER, diagram, fp, this, diagramEditor, "name", null, null);
		textName.setNameFeature(hasNameFeature);
		UtilEditFrame.buildCanvasName(container, canvasName, textName, eobject, ef);
		canvasName.setBounds(10, 10, 720, 30);
		textName.setSaveData(true);
		return canvasName;
	}

	/**
	 * Create the menu manager.
	 *
	 * @return the menu manager
	 */
	@Override
	protected MenuManager createMenuManager() {
		final MenuManager menuManager = new MenuManager("menu");
		return menuManager;
	}

	/**
	 * Create the toolbar manager.
	 *
	 * @return the toolbar manager
	 */
	@Override
	protected ToolBarManager createToolBarManager(final int style) {
		final ToolBarManager toolBarManager = new ToolBarManager(style);
		return toolBarManager;
	}

	/**
	 * Create the status line manager.
	 *
	 * @return the status line manager
	 */
	@Override
	protected StatusLineManager createStatusLineManager() {
		final StatusLineManager statusLineManager = new StatusLineManager();
		return statusLineManager;
	}

	/**
	 * Configure the shell.
	 *
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
	protected Point getInitialSize() { return new Point(743, 727); }

	/**
	 * Save.
	 *
	 * @param name
	 *            the name
	 */
	protected abstract void save(String name);

	/**
	 * Clean close.
	 */
	protected void clean_close() {
		frame.clean();
		this.save(null);
		for (CCombo c : combos) {
			if (c != null) { c.dispose(); }
			c = null;
		}
		combos.clear();
		setReturnCode(CANCEL);
	}

	@Override
	protected void handleShellCloseEvent() {
		// create dialog with ok and cancel button and info icon
		frame.clean();
		this.save(null);
		super.handleShellCloseEvent();
	}

	@Override
	public void create() {
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE);
		super.create();
		shell = getShell();

	}

	/**
	 * Clean.
	 */
	protected void clean() {

	}

	/**
	 * Update error.
	 */
	public void updateError() {

	}

	/**
	 * Facet value.
	 *
	 * @param facetName
	 *            the facet name
	 * @return the string
	 */
	public String facetValue(final String facetName) {
		for (final EFacet facet : eobject.getFacets()) {
			if (facet.getName().equals(facetName)) return facet.getValue();
		}
		return null;
	}

	/**
	 * Save facets.
	 */
	public void saveFacets() {
		for (final String facet : facetsEditor.keySet()) {
			final Composite vt = facetsEditor.get(facet);
			if (vt == null) { continue; }
			if (vt instanceof ValidateText) {
				saveFacetValue(facet, ((ValidateText) facetsEditor.get(facet)).getText());
			} else if (vt instanceof CCombo) { saveFacetValue(facet, ((CCombo) facetsEditor.get(facet)).getText()); }
		}
	}

	/**
	 * Save facet value.
	 *
	 * @param facetName
	 *            the facet name
	 * @param facetValue
	 *            the facet value
	 */
	public void saveFacetValue(final String facetName, final String facetValue) {
		for (final EFacet facet : eobject.getFacets()) {
			if (facet.getName().equals(facetName)) {
				facet.setValue(facetValue);
				return;
			}
		}
		final EFacet eFacet = gama.GamaFactory.eINSTANCE.createEFacet();
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
		if (domain != null) {
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

	/**
	 * Save editor code.
	 */
	public void saveEditorCode() {
		if (modelXText == null) return;
		if (eobject instanceof ESpecies) {
			((ESpecies) eobject).setInit(modelXText.getEditablePart());
		} else if (eobject instanceof EAction) {
			((EAction) eobject).setGamlCode(modelXText.getEditablePart());
		} else if (eobject instanceof EReflex) { ((EReflex) eobject).setGamlCode(modelXText.getEditablePart()); }
	}

	/**
	 * Update editor.
	 */
	public void updateEditor() {
		if (modelXText == null) return;
		saveEditorCode();
		final XtextResourceSet rs = new SynchronizedXtextResourceSet();
		rs.setClasspathURIContext(ModelGenerator.class);
		final ModelStructure struct = new ModelStructure(diagram, fp);
		struct.writeModelWithoutElement(this.eobject);
		modelXText.updateModel(struct.getPrefix(), struct.getText(), struct.getSuffix());
	}

	/**
	 * Gets the text name.
	 *
	 * @return the text name
	 */
	public ValidateText getTextName() { return textName; }

}
