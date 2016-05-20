package idees.gama.ui.editFrame;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import gama.EGamaObject;
import gama.EPerceive;
import idees.gama.features.edit.EditFeature;
import idees.gama.features.modelgeneration.ModelGenerator;

public class EditPerceiveFrame extends EditActionFrame {

	/**
	 * Create the application window.
	 */
	public EditPerceiveFrame(final Diagram diagram, final IFeatureProvider fp, final EditFeature erf,
		final EGamaObject reflex) {
		super(diagram, fp, erf, reflex, "Perception definition");
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
		groupGamlCode(container, "Gaml code");
		

		return container;
	}

	protected void groupCondition(final Composite container) {

		// ****** CANVAS CONDITION *********
		groupFacets(container, "perceive",2);

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
						saveFacets();
						if ( modelXText != null ) {
							((EPerceive) eobject).setGamlCode(modelXText.getEditablePart());
						}
					} else if ( name.equals("name") ) {
						eobject.setName(textName.getText());
					} else {
						eobject.setName(textName.getText());
						saveFacets();
						if ( modelXText != null ) {
							((EPerceive) eobject).setGamlCode(modelXText.getEditablePart());
						}
					}
				}
			});
		}

		ef.hasDoneChanges = true;
		ModelGenerator.modelValidation(fp, diagram);
	}

}
