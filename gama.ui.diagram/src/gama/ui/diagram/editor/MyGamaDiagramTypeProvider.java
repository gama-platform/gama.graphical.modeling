package gama.ui.diagram.editor;


import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class MyGamaDiagramTypeProvider extends AbstractDiagramTypeProvider implements IDiagramTypeProvider {
	private IToolBehaviorProvider[] toolBehaviorProviders;
	 
	public MyGamaDiagramTypeProvider() {
		super();
		setFeatureProvider(new GamaFeatureProvider(this));
	}
	
	 @Override
	    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
	        if (toolBehaviorProviders == null) {
	            toolBehaviorProviders =
	                new IToolBehaviorProvider[] { new MyGamaToolBehaviorProvider(
	                    this) }; 
	        }
	        return toolBehaviorProviders;
	    }
	 
	
}
	 