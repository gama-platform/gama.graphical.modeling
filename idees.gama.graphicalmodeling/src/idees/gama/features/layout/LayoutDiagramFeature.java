package idees.gama.features.layout;


import org.eclipse.elk.core.service.DiagramLayoutEngine;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.ui.PlatformUI;

public class LayoutDiagramFeature  extends AbstractCustomFeature {

	/**
	 * Minimal distance between nodes.
	 */


	public LayoutDiagramFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getDescription() {
		return "Layout diagram"; 
	}

	@Override
	public String getName() {
		return "Automatic Diagram Layout"; 
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		return true;
	}

	@Override
	public void execute(ICustomContext context) {
		execute(getDiagram());
	}
	
	public static void execute( Diagram d) {
		 DiagramLayoutEngine.invokeLayout(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart(),d,null);
		
	}

}