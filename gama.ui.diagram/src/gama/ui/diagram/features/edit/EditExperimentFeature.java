package gama.ui.diagram.features.edit;

import gama.ui.diagram.editor.MyGamaToolBehaviorProvider;
import gama.ui.diagram.metamodel.EExperiment;
import gama.ui.diagram.metamodel.EGUIExperiment;
import gama.ui.diagram.swt.editFrame.EditBatchExperimentFrame;
import gama.ui.diagram.swt.editFrame.EditFrame;
import gama.ui.diagram.swt.editFrame.EditGUIExperimentFrame;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class EditExperimentFeature  extends EditFeature {
   
    public EditExperimentFeature(IFeatureProvider fp,EditFrame frame, MyGamaToolBehaviorProvider tbp) {
        super(fp,frame, tbp);
    }
 
    @Override
    public String getDescription() {
        return "Edition of an experiment";
    }
 
    @Override
    public boolean canExecute(ICustomContext context) {
        // allow rename if exactly one pictogram element
        // representing a EClass is selected
        boolean ret = false;
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof EExperiment) {
                ret = true;
            }
        }
        return ret;
    }
 
    @Override
    public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof EExperiment) {
            	EExperiment eExperiment = (EExperiment) bo; 
            	
            	if (frame == null || frame.getShell() == null || frame.getShell().isDisposed() ) {
            		if (bo instanceof EGUIExperiment)
            			frame = new EditGUIExperimentFrame(getDiagram(), getFeatureProvider(), this,eExperiment, eExperiment.getName());
            		else 
            			frame = new EditBatchExperimentFrame(getDiagram(), getFeatureProvider(), this,eExperiment, eExperiment.getName());
                	
            		frame.open();

            		frame.getTextName().setText(frame.getTextName().getText());
            		tbp.getFrames().put(eExperiment, frame);
            	
            	} else {
            		frame.getShell().setFocus();
            	}
            }
        }
        this.hasDoneChanges = true;
    }
 
}