package gama.ui.diagram.features.layout;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import gama.ui.diagram.metamodel.EGamaObject;

public class LayoutESpeciesFeature extends AbstractLayoutFeature {
 
    private static final int MIN_HEIGHT = 50;
 
    private static final int MIN_WIDTH = 150;
 
    public LayoutESpeciesFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canLayout(ILayoutContext context) {
       // return true, if pictogram element is linked to an EClass
       PictogramElement pe = context.getPictogramElement();
       if (!(pe instanceof ContainerShape))
           return false;
       EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
       return businessObjects.size() == 1 
              && businessObjects.get(0) instanceof EGamaObject;
    }
 
    public boolean layout(ILayoutContext context) {
    	  boolean anythingChanged = false;
       IGaService gaService = Graphiti.getGaService();
        ContainerShape containerShape =
            (ContainerShape) context.getPictogramElement();
        GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
        PictogramElement pe = context.getPictogramElement();
        EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
        if (businessObjects != null) {
	        EGamaObject obj =  (EGamaObject) businessObjects.get(0);
	        List<Integer> currentColor = obj.getColorPicto();
	        Color color = gaService.manageColor(getDiagram(), currentColor.get(0), currentColor.get(1), currentColor.get(2));
	        containerGa.setBackground(color);
        }
       
        // height
        if (containerGa.getHeight() < MIN_HEIGHT) {
            containerGa.setHeight(MIN_HEIGHT);
            anythingChanged = true;
        }
 
        // width
        if (containerGa.getWidth() < MIN_WIDTH) {
            containerGa.setWidth(MIN_WIDTH);
            anythingChanged = true;
        }
        int containerWidth = containerGa.getWidth();
       
        for (Shape shape : containerShape.getChildren()){
            GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
           
            IDimension size = 
                 gaService.calculateSize(graphicsAlgorithm);
            if (containerWidth != size.getWidth()) {
            	 if (graphicsAlgorithm instanceof Polyline) {
                    Polyline polyline = (Polyline) graphicsAlgorithm;
                    Point secondPoint = polyline.getPoints().get(1);
                    Point newSecondPoint =
                        gaService.createPoint(containerWidth, secondPoint.getY());
                    polyline.getPoints().set(1, newSecondPoint);
                    anythingChanged = true;
                } else if (graphicsAlgorithm instanceof Image) {
                	Image im = (Image) graphicsAlgorithm;
                	gaService.setLocation(im,  5 + im.getWidth() /2 -size.getWidth()/2, 3);
                	anythingChanged = true;
                } else {
                    
                	gaService.setWidth(graphicsAlgorithm,
                        containerWidth);
                    anythingChanged = true;
                }
            }
        }
        return anythingChanged;
    }

}