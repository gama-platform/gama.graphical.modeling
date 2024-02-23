package gama.ui.diagram.features.edit;

import gama.*;
import gama.ui.diagram.editor.MyGamaToolBehaviorProvider;
import gama.ui.diagram.metamodel.EAction;
import gama.ui.diagram.metamodel.ESpecies;
import gama.ui.diagram.swt.editFrame.*;

import java.util.*;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.*;

public class EditActionFeature extends EditFeature {

	public EditActionFeature(final IFeatureProvider fp, final EditFrame frame, final MyGamaToolBehaviorProvider tbp) {
		super(fp, frame, tbp);

	}

	@Override
	public String getDescription() {
		return "Edition of an action";
	}

	@Override
	public boolean canExecute(final ICustomContext context) {
		// allow rename if exactly one pictogram element
		// representing a EClass is selected
		boolean ret = false;
		PictogramElement[] pes = context.getPictogramElements();
		if ( pes != null && pes.length == 1 ) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if ( bo instanceof EAction ) {
				ret = true;
			}
		}
		return ret;
	}

	@Override
	public void execute(final ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if ( pes != null && pes.length == 1 ) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if ( bo instanceof EAction ) {
				EAction eAction = (EAction) bo;
				if ( frame == null || frame.getShell() == null || frame.getShell().isDisposed() ) {
					frame = new EditActionFrame(getDiagram(), getFeatureProvider(), this, eAction, null, speciesList());
					frame.open();
					tbp.getFrames().put(eAction, frame);

				} else {

					frame.getShell().setFocus();
				}

			}
		}
		this.hasDoneChanges = true;
	}

	private List<ESpecies> speciesList() {
		List<ESpecies> species = new ArrayList<ESpecies>();
		List<Shape> contents = getDiagram().getChildren();
		if ( contents != null ) {
			for ( Shape obj : contents ) {
				Object bo = getBusinessObjectForPictogramElement(obj);
				if ( bo instanceof ESpecies ) {
					species.add((ESpecies) bo);
				}
			}
		}
		return species;
	}

}