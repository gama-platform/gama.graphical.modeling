package idees.gama.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;


public class GamaDiagramBehavior extends DiagramBehavior {
	IDiagramTypeProvider provider;
	Diagram diagram;
	public GamaDiagramBehavior(IDiagramContainerUI diagramContainer) {
		super(diagramContainer);	
		initDefaultBehaviors();
	}
	
	public void init( IDiagramTypeProvider provider) {
		this.provider = provider;
		//initConfigurationProvider(provider);
	}
	
	@Override
	public void refresh() {
		((GamaDiagramEditor) this.getDiagramContainer()).refresh();
		this.refreshPalette();
		super.refresh();

	}

	/*@Override
	public IDiagramTypeProvider getDiagramTypeProvider() {
		
		return provider;
	}*/

	
}
