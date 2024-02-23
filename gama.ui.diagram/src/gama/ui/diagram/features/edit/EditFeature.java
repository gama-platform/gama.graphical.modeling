package gama.ui.diagram.features.edit;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;

import gama.ui.diagram.editor.MyGamaToolBehaviorProvider;
import gama.ui.diagram.swt.editFrame.EditFrame;

public abstract class EditFeature extends AbstractCustomFeature {
 
	protected EditFrame frame;
	MyGamaToolBehaviorProvider tbp;
   
    public boolean hasDoneChanges = false;
     
    public EditFeature(IFeatureProvider fp,EditFrame frame, MyGamaToolBehaviorProvider tbp) {
        super(fp);
        this.frame = frame;
        this.tbp = tbp;
    }
 
    @Override
    public String getName() {
        return "Edit";
    }
 
 
    @Override
    public boolean hasDoneChanges() {
           return this.hasDoneChanges;
    }
    
    
}