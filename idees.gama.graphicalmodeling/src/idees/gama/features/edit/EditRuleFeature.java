package idees.gama.features.edit;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import gama.ERule;
import idees.gama.diagram.MyGamaToolBehaviorProvider;
import idees.gama.ui.editFrame.EditFrame;
import idees.gama.ui.editFrame.EditRuleFrame;

public class EditRuleFeature  extends EditFeature {
   
    public EditRuleFeature(IFeatureProvider fp, EditFrame frame, MyGamaToolBehaviorProvider tbp ) {
        super(fp, frame, tbp);
       
    }
 
    @Override
    public String getDescription() {
        return "Edition of a rule";
    }
 
    @Override
    public boolean canExecute(ICustomContext context) {
        // allow rename if exactly one pictogram element
        // representing a EClass is selected
        boolean ret = false;
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof ERule) {
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
            if (bo instanceof ERule) {
            	ERule eRule = (ERule) bo;
            	if (frame == null || frame.getShell() == null || frame.getShell().isDisposed() ) {
            		frame =  new EditRuleFrame(getDiagram(), getFeatureProvider(), this,eRule);
            		frame.open();
            		tbp.getFrames().put(eRule, frame);
            	
            	} else {
            		frame.getShell().setFocus();
            	}
            }
        }
        this.hasDoneChanges = true;
    }
 
}