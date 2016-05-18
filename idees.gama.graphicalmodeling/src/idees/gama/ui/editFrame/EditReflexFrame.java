package idees.gama.ui.editFrame;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;

import com.google.inject.Injector;

import gama.EGamaObject;
import gama.EReflex;
import idees.gama.diagram.GAMARessourceProvider;
import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.diagram.ModelStructure;
import idees.gama.features.ExampleUtil;
import idees.gama.features.edit.EditFeature;
import idees.gama.features.modelgeneration.ModelGenerator;
import msi.gama.lang.gaml.ui.internal.GamlActivator;
import msi.gama.lang.utils.EGaml;

public class EditReflexFrame extends EditActionFrame {

	ValidateText conditionCode;

	/**
	 * Create the application window.
	 */
	public EditReflexFrame(final Diagram diagram, final IFeatureProvider fp, final EditFeature erf,
		final EGamaObject reflex) {
		super(diagram, fp, erf, reflex, "Reflex definition");
	}

	/**
	 * Create contents of the application window.
	 * @param parent
	 */
	@Override
	protected Control createContents(final Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		// ****** CANVAS NAME *********
		groupName(container);

		// ****** CANVAS GAMLCODE *********
		groupCondition(container);

		// ****** CANVAS GAMLCODE *********
		groupGamlCode(container);

		// ****** CANVAS OK/CANCEL *********
		// groupOkCancel(container);

		return container;
	}

	protected void groupCondition(final Composite container) {

		// ****** CANVAS CONDITION *********
		Group group = new Group(container, SWT.NONE);

		group.setLayout(new FillLayout(SWT.HORIZONTAL));
		group.setText("Condition");

		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(1, false));

		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;

		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
		List<String> uselessName = new ArrayList<String>();
		uselessName.add("name");
		conditionCode = new ValidateText(group, SWT.BORDER, diagram, fp, this, diagramEditor, "", uselessName, null);
		conditionCode.setLayoutData(gridData2);

		if ( ((EReflex) eobject).getCondition() != null ) {
			conditionCode.setText(((EReflex) eobject).getCondition());
		}

		conditionCode.setSaveData(true);
		textName.getLinkedVts().add(conditionCode);

	}

	@Override
	protected void groupGamlCode(final Composite container) {

		// ****** CANVAS GAMLCODE *********
		Group group = new Group(container, SWT.NONE);

		group.setLayout(new FillLayout(SWT.HORIZONTAL));
		group.setText("Gaml code");

		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(1, false));

		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.verticalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.grabExcessVerticalSpace = true;

		final Injector injector = GamlActivator.getInstance().getInjector("msi.gama.lang.gaml.Gaml");
		
		GAMARessourceProvider provider = injector.getInstance(GAMARessourceProvider.class);
		provider.setName(((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp)).getTitle(), fp, diagram);
		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
		
		editor = factory.newEditor(provider).showErrorAndWarningAnnotations().withParent(group);
		
		XtextResourceSet rs = EGaml.getInstance(XtextResourceSet.class);
		rs.setClasspathURIContext(ModelGenerator.class);
		ModelStructure struct= new ModelStructure(diagram, fp);
		struct.writeModelWithoutElement(this.eobject);
			
		modelXText = editor.createPartialEditor(struct.getPrefix(), struct.getText(), struct.getSuffix(),true);
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(743, 490);
	}

	@Override
	protected void save(final String name) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
		if ( domain != null ) {
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {
					if ( name == null) {
						eobject.setName(textName.getText());
						if ( modelXText != null ) {
							((EReflex) eobject).setGamlCode(modelXText.getEditablePart());
						}
						if ( conditionCode != null ) {
							((EReflex) eobject).setCondition(conditionCode.getText());
						}
					} else if ( name.equals("name") ) {
						eobject.setName(textName.getText());
					} else {
						if ( modelXText != null ) {
							((EReflex) eobject).setGamlCode(modelXText.getEditablePart());
						}
						if ( conditionCode != null ) {
							((EReflex) eobject).setCondition(conditionCode.getText());
						}
					}
				}
			});
		}

		ef.hasDoneChanges = true;
		ModelGenerator.modelValidation(fp, diagram);
	}

}
