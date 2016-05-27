package idees.gama.features.layout;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.CompoundDirectedGraphLayout;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.EdgeList;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.draw2d.graph.NodeList;
import org.eclipse.elk.alg.graphiti.GraphitiDiagramLayoutConnector;
import org.eclipse.elk.core.options.CoreOptions;
import org.eclipse.elk.core.options.Direction;
import org.eclipse.elk.core.service.DiagramLayoutEngine;
import org.eclipse.elk.core.service.LayoutMapping;
import org.eclipse.elk.graph.properties.MapPropertyHolder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class LayoutDiagramFeature  extends AbstractCustomFeature {

	/**
	 * Minimal distance between nodes.
	 */
	private static final int PADDING = 30;


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
		final Injector injector = Guice.createInjector( new GamaGraphIndicatorModuleGuice());
		GraphitiDiagramLayoutConnector connector = injector.getInstance(GraphitiDiagramLayoutConnector.class);
		
		DiagramLayoutEngine.Parameters param  = new DiagramLayoutEngine.Parameters();
		param.getGlobalSettings().setProperty(CoreOptions.ALGORITHM, "de.cau.cs.kieler.klay.force");
		param.getGlobalSettings().setProperty(CoreOptions.ZOOM_TO_FIT,true);
		param.getGlobalSettings().setProperty(CoreOptions.SPACING_NODE, 250.0f);
		LayoutMapping layout = DiagramLayoutEngine.invokeLayout(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart(),d,param);
		
		connector.applyLayout(layout, param.getGlobalSettings());
		
	}

}