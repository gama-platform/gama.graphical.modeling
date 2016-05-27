package idees.gama.features.add;

import gama.*;
import idees.gama.ui.image.GamaImageProvider;
import java.util.*;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.algorithms.styles.*;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.services.*;

public class AddWorldFeature extends AbstractAddShapeFeature {

	public static final int INIT_WIDTH = 220;
	public static final int INIT_HEIGHT = 100;

	private static final List<Integer> CLASS_BACKGROUND = Arrays.asList(255, 255, 210);

	public AddWorldFeature(final IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(final IAddContext context) {
		// check if user wants to add a EClass
		if ( context.getNewObject() instanceof EWorldAgent ) {
			// check if user wants to add to a diagram
			if ( context.getTargetContainer() instanceof Diagram ) { return true; }
		}
		return false;
	}

	@Override
	public PictogramElement add(final IAddContext context) {
		EWorldAgent addedClass = (EWorldAgent) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		boolean error = addedClass.getHasError() != null && addedClass.getHasError();
		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);

		// check whether the context has a size (e.g. from a create feature)
		// otherwise define a default size for the shape
		int width = context.getWidth() <= 0 ? INIT_WIDTH : context.getWidth();
		int height = context.getHeight() <= 0 ? Math.max(INIT_HEIGHT,addedClass.getVariables().size() * 15 + 40): context.getHeight();
		
		IGaService gaService = Graphiti.getGaService();

		{
			// create and set graphics algorithm
			RoundedRectangle roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
			roundedRectangle.setForeground(manageColor(error ? ColorDisplay.CLASS_FOREGROUND_ERROR
				: ColorDisplay.CLASS_FOREGROUND_OK));
			if ( addedClass.getColorPicto().isEmpty() ) {
				addedClass.getColorPicto().addAll(CLASS_BACKGROUND);
			}
			List<Integer> currentColor = addedClass.getColorPicto();
			Color color =
				gaService.manageColor(getDiagram(), currentColor.get(0), currentColor.get(1), currentColor.get(2));
			roundedRectangle.setBackground(color);
			roundedRectangle.setLineWidth(error ? 4 : 2);
			gaService.setLocationAndSize(roundedRectangle, context.getX(), context.getY(), width, height);

			// if added Class has no resource we add it to the resource
			// of the diagram
			// in a real scenario the business model would have its own resource
			if ( addedClass.eResource() == null ) {
				getDiagram().eResource().getContents().add(addedClass);
			}
			// create link and wire it
			link(containerShape, addedClass);
		}

		// SHAPE WITH LINE
		{
			// create shape for line
			Shape shape = peCreateService.createShape(containerShape, false);

			// create and set graphics algorithm
			Polyline polyline = gaService.createPolyline(shape, new int[] { 0, 20, width, 20 });
			polyline.setForeground(manageColor(ColorDisplay.BLACK));
			polyline.setLineWidth(2);
		}

		// SHAPE WITH TEXT
		{
			// create shape for text
			Shape shape = peCreateService.createShape(containerShape, false);

			// create and set text graphics algorithm
			Text text = gaService.createDefaultText(getDiagram(), shape, addedClass.getName());
			text.setForeground(manageColor(ColorDisplay.CLASS_TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setFont(gaService.manageFont(getDiagram(), "Arial", 12, false, true));

			gaService.setLocationAndSize(text, 0, 0, width, 20);

			// create link and wire it
			link(shape, addedClass);
		}
		{
			// create shape for text
			Shape shape2 = peCreateService.createShape(containerShape, false);
			// create and set text graphics algorithm
			String variables = "";
			for ( EVariable var : addedClass.getVariables() ) {
				variables += (var.getType().isEmpty() ? "var" : var.getType()) + " " + var.getName() + "\n";
			}
			Text text2 = gaService.createDefaultText(getDiagram(), shape2, variables);
			text2.setForeground(manageColor(ColorDisplay.CLASS_TEXT_FOREGROUND));
			text2.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			text2.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
			text2.setFont(gaService.manageFont(getDiagram(), "Arial", 12, false, false));
			gaService.setLocationAndSize(text2, 5, 25, text2.getWidth(), 15 + addedClass.getVariables().size() * 15);

			// create link and wire it
			link(shape2, addedClass);
		}
		{

			Shape shape3 = peCreateService.createShape(containerShape, false);

			Image icon1 = gaService.createImage(shape3, GamaImageProvider.IMG_SUBSPECIESLINK);
			gaService.setLocationAndSize(icon1, 20 - width / 2, 3, 30, 15);

			link(shape3, addedClass);

		}
		// add a chopbox anchor to the shape
		peCreateService.createChopboxAnchor(containerShape);

		// call the layout feature
		layoutPictogramElement(containerShape);
		return containerShape;
	}

}