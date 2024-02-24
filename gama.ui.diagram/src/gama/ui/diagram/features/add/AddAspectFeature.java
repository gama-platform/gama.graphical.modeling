/*******************************************************************************************************
 *
 * AddAspectFeature.java, in gama.ui.diagram, is part of the source code of the GAMA modeling and simulation platform
 * (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package gama.ui.diagram.features.add;

import java.util.Arrays;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import gama.ui.diagram.metamodel.EAspect;
import gama.ui.diagram.swt.image.GamaImageProvider;

/**
 * The Class AddAspectFeature.
 */
public class AddAspectFeature extends AbstractAddShapeFeature {

	/** The Constant INIT_WIDTH. */
	public static final int INIT_WIDTH = 150;

	/** The Constant INIT_HEIGHT. */
	public static final int INIT_HEIGHT = 50;

	/** The Constant CLASS_BACKGROUND. */
	private static final List<Integer> CLASS_BACKGROUND = Arrays.asList(152, 251, 152);

	/**
	 * Instantiates a new adds the aspect feature.
	 *
	 * @param fp
	 *            the fp
	 */
	public AddAspectFeature(final IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(final IAddContext context) {
		// check if user wants to add a EClass
		// check if user wants to add to a diagram
		if ((context.getNewObject() instanceof EAspect) && (context.getTargetContainer() instanceof Diagram))
			return true;
		return false;
	}

	@Override
	public PictogramElement add(final IAddContext context) {
		EAspect addedClass = (EAspect) context.getNewObject();
		boolean error = addedClass.getHasError() != null && addedClass.getHasError();

		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);

		int width = context.getWidth() <= 0 ? INIT_WIDTH : context.getWidth();
		int height = context.getHeight() <= 0 ? INIT_HEIGHT : context.getHeight();

		IGaService gaService = Graphiti.getGaService();
		gaService.findStyle(targetDiagram, "");

		{
			// create and set graphics algorithm
			Ellipse ellipse = gaService.createEllipse(containerShape);
			ellipse.setForeground(
					manageColor(error ? ColorDisplay.CLASS_FOREGROUND_ERROR : ColorDisplay.CLASS_FOREGROUND_OK));
			if (addedClass.getColorPicto().isEmpty()) { addedClass.getColorPicto().addAll(CLASS_BACKGROUND); }
			List<Integer> currentColor = addedClass.getColorPicto();
			Color color =
					gaService.manageColor(getDiagram(), currentColor.get(0), currentColor.get(1), currentColor.get(2));
			ellipse.setBackground(color);
			ellipse.setLineWidth(error ? 4 : 2);
			gaService.setLocationAndSize(ellipse, context.getX(), context.getY(), width, height);

			if (addedClass.eResource() == null) { getDiagram().eResource().getContents().add(addedClass); }
			// create link and wire it
			link(containerShape, addedClass);
		}

		// SHAPE WITH TEXT
		{
			// create shape for text
			Shape shape = peCreateService.createShape(containerShape, false);

			// create and set text graphics algorithm
			Text text = gaService.createDefaultText(getDiagram(), shape, addedClass.getName());
			text.setForeground(manageColor(ColorDisplay.CLASS_TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setFont(gaService.manageFont(getDiagram(), "Arial", 12, false, false));
			// text.getFont().setBold(true);
			gaService.setLocationAndSize(text, 0, 0, width, height);

			// create link and wire it
			link(shape, addedClass);
		}
		{

			Shape shape3 = peCreateService.createShape(containerShape, false);

			Image icon1 = gaService.createImage(shape3, GamaImageProvider.IMG_ASPECTLINK);
			gaService.setLocationAndSize(icon1, 100, 100, 15, 15);

			link(shape3, addedClass);

		}

		// add a chopbox anchor to the shape
		peCreateService.createChopboxAnchor(containerShape);

		// call the layout feature
		layoutPictogramElement(containerShape);
		return containerShape;
	}
}