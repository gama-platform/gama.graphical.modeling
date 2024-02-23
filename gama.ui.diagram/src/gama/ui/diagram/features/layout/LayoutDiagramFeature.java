package gama.ui.diagram.features.layout;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.CompoundDirectedGraphLayout;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.EdgeList;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.draw2d.graph.NodeList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class LayoutDiagramFeature  extends AbstractCustomFeature {

	/**
	 * Minimal distance between nodes.
	 */


	public LayoutDiagramFeature(IFeatureProvider fp) {
		super(fp);
	}

	/*public static void execute( Diagram d) {
			
				 DiagramLayoutEngine.Parameters params = new DiagramLayoutEngine.Parameters();
	     params.addLayoutRun().configure(ElkGraphElement.class)
	              .setProperty(CoreOptions.ALGORITHM, ForceOptions.ALGORITHM_ID)
	              .setProperty(CoreOptions.SPACING_COMPONENT_COMPONENT, 50.0);
	     
              .setProperty(CoreOptions.SPACING_COMPONENT_COMPONENT, 50.0)
	              .setProperty(CoreOptions.SPACING_EDGE_EDGE, 10.0)
	              .setProperty(CoreOptions.SPACING_EDGE_NODE, 20.0)
	              .setProperty(CoreOptions.SPACING_NODE_NODE, 30.0)
	              .setProperty(CoreOptions.ASPECT_RATIO, 1.0)
	              .setProperty(CoreOptions.MARGINS, new ElkMargin(20,20,20,20))
	              
	              .setProperty(CoreOptions.EXPAND_NODES, true);
		 DiagramLayoutEngine.invokeLayout(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart(),d,params);
		
	}*/
	

	/**
	 * Minimal distance between nodes.
	 */
	private static final int PADDING = 30;

	@Override
	public String getDescription() {
		return "Layout diagram"; 
	}

	@Override
	public String getName() {
		return "&Layout Diagram";
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		return true;
	}

	@Override
	public void execute(ICustomContext context) {
		final CompoundDirectedGraph graph = mapDiagramToGraph(getDiagram());
		graph.setDefaultPadding(new Insets(PADDING));
		new CompoundDirectedGraphLayout().visit(graph);
		mapGraphCoordinatesToDiagram(graph);
	}
	

	public static void execute(Diagram d) {
		final CompoundDirectedGraph graph = mapDiagramToGraph(d);
		graph.setDefaultPadding(new Insets(PADDING));
		new CompoundDirectedGraphLayout().visit(graph);
		mapGraphCoordinatesToDiagram(graph);
	}



	private static Diagram mapGraphCoordinatesToDiagram(CompoundDirectedGraph graph) {
		NodeList myNodes = new NodeList();
		myNodes.addAll(graph.nodes);
		myNodes.addAll(graph.subgraphs);
		for (Object object : myNodes) {
			Node node = (Node) object;
			Shape shape = (Shape) node.data;
			shape.getGraphicsAlgorithm().setX(node.x);
			shape.getGraphicsAlgorithm().setY(node.y);
			shape.getGraphicsAlgorithm().setWidth(node.width);
			shape.getGraphicsAlgorithm().setHeight(node.height);
		}
		return null;
	}


	private static CompoundDirectedGraph mapDiagramToGraph(Diagram d) {
		Map<AnchorContainer, Node> shapeToNode = new HashMap<AnchorContainer, Node>();
		CompoundDirectedGraph dg = new CompoundDirectedGraph();
		EdgeList edgeList = new EdgeList();
		NodeList nodeList = new NodeList();
		EList<Shape> children = d.getChildren();
		for (Shape shape : children) {
			Node node = new Node();
			GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
			node.x = ga.getX();
			node.y = ga.getY();
			node.width = ga.getWidth();
			node.height = ga.getHeight();
			node.data = shape;
			shapeToNode.put(shape, node);
			nodeList.add(node);
		}
		EList<Connection> connections = d.getConnections();
		for (Connection connection : connections) {
			AnchorContainer source = connection.getStart().getParent();
			AnchorContainer target = connection.getEnd().getParent();
			Edge edge = new Edge(shapeToNode.get(source), shapeToNode.get(target));
			edge.data = connection;
			edgeList.add(edge);
		}
		dg.nodes = nodeList;
		dg.edges = edgeList;
		return dg;
	}



}