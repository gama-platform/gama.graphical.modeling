package gama.ui.diagram.editor;

import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;


public class GamaDiagramBehavior extends DiagramBehavior {
	public GamaDiagramBehavior(IDiagramContainerUI diagramContainer) {
		super(diagramContainer);	
		initDefaultBehaviors();
	}
		
}
