package gama.ui.diagram.features.others;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.util.ColorConstant;

import gama.ui.diagram.metamodel.EGamaObject;
import gama.ui.diagram.metamodel.ESpecies;
import gama.ui.diagram.metamodel.EVariable;

public class UpdateEGamaObjectFeature extends AbstractUpdateFeature {

	public UpdateEGamaObjectFeature(final IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(final IUpdateContext context) {
		// return true, if linked business object is a EClass
		final Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return bo instanceof EGamaObject;
	}

	@Override
	public IReason updateNeeded(final IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		String pictogramVar = "";
		final PictogramElement pictogramElement = context.getPictogramElement();
		final Object bo = getBusinessObjectForPictogramElement(pictogramElement);

		if (pictogramElement instanceof ContainerShape) {
			final ContainerShape cs = (ContainerShape) pictogramElement;
			if (bo instanceof EGamaObject) {
				final EGamaObject eClass = (EGamaObject) bo;
				final boolean error = eClass.getHasError() != null && eClass.getHasError();
				if (cs.getGraphicsAlgorithm() != null && cs.getGraphicsAlgorithm().getForeground() != null) {
					if (cs.getGraphicsAlgorithm().getForeground().getGreen() == 255 == error) {
						return Reason.createTrueReason("Foreground color is out of date");
					}

				}
			}
			for (final Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					final Text text = (Text) shape.getGraphicsAlgorithm();

					if (text.getY() != 25)
						pictogramName = text.getValue();
					else
						pictogramVar = text.getValue();
				}
			}
		}

		// retrieve name from business model
		String businessName = null;
		String varNames = "";

		if (bo instanceof EGamaObject) {
			final EGamaObject eClass = (EGamaObject) bo;
			businessName = eClass.getName();
			if (bo instanceof ESpecies) {
				for (final EVariable var : ((ESpecies) eClass).getVariables()) {
					final String type = var.getType() == null || var.getType().isEmpty() ? "var" : var.getType();
					varNames += type + " " + var.getName() + "\n";
				}
			}
		}

		// update needed, if names are different
		final boolean updateNameNeeded = pictogramName == null && businessName != null
				|| pictogramName != null && !pictogramName.equals(businessName);
		if (updateNameNeeded) {
			return Reason.createTrueReason("Name is out of date");
		} else {
			final boolean updateVarNeeded = !pictogramVar.equals(varNames);
			if (updateVarNeeded) {
				return Reason.createTrueReason("Variables are out of date");
			} else {
				return Reason.createFalseReason();
			}
		}
	}

	@Override
	public boolean update(final IUpdateContext context) {
		// retrieve name from business model
		String businessName = null;
		String varNames = "";
		final PictogramElement pictogramElement = context.getPictogramElement();
		final Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		int cpt = 0;
		boolean error = true;

		if (bo instanceof EGamaObject) {
			final EGamaObject eClass = (EGamaObject) bo;
			error = eClass.getHasError() != null && eClass.getHasError();
			businessName = eClass.getName();
			if (bo instanceof ESpecies) {
				for (final EVariable var : ((ESpecies) eClass).getVariables()) {
					final String type = var.getType() == null || var.getType().isEmpty() ? "var" : var.getType();
					varNames += type + " " + var.getName() + "\n";

				}

				cpt = ((ESpecies) eClass).getVariables().size();
			}
		}

		// Set name in pictogram model
		boolean update = false;
		if (pictogramElement instanceof ContainerShape) {
			final ContainerShape cs = (ContainerShape) pictogramElement;
			cs.getGraphicsAlgorithm().setForeground(
					error ? manageColor(new ColorConstant(255, 0, 0)) : manageColor(new ColorConstant(0, 255, 0)));
			cs.getGraphicsAlgorithm().setLineWidth(error ? 4 : 2);
			update = true;

			for (final Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					final Text text = (Text) shape.getGraphicsAlgorithm();

					if (text.getY() < 25)
						text.setValue(businessName);
					else {
						text.setValue(varNames);
						Graphiti.getGaService().setLocationAndSize(text, 5, 25, text.getWidth(), 25 + cpt * 20);
					}

				}
			}
		}
		return update;
	}
}