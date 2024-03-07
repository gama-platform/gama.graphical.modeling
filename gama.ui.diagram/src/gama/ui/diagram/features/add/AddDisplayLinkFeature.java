/*******************************************************************************************************
 *
 * AddDisplayLinkFeature.java, in gama.ui.diagram, is part of the source code of the GAMA modeling and
 * simulation platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package gama.ui.diagram.features.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import gama.ui.diagram.metamodel.EDisplayLink;

/**
 * The Class AddDisplayLinkFeature.
 */
public class AddDisplayLinkFeature extends AbstractAddFeature {

	/**
	 * Instantiates a new adds the display link feature.
	 *
	 * @param fp
	 *            the fp
	 */
	public AddDisplayLinkFeature(final IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public PictogramElement add(final IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		EDisplayLink addedEReference = (EDisplayLink) context.getNewObject();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		// CONNECTION WITH POLYLINE
		Connection connection = peCreateService.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPolyline(connection);

		polyline.setLineWidth(1);
		polyline.setForeground(manageColor(IColorConstant.DARK_GRAY));

		// create link and wire it
		link(connection, addedEReference);

		// add dynamic text decorator for the association name
		ConnectionDecorator textDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createText(textDecorator);
		// createDefaultText(textDecorator);
		text.setForeground(manageColor(IColorConstant.BLACK));
		gaService.setLocation(text, 10, 0);
		text.setValue("has display");

		return connection;
	}

	@Override
	public boolean canAdd(final IAddContext context) {
		// return true if given business object is an EReference
		// note, that the context must be an instance of IAddConnectionContext
		if (context instanceof IAddConnectionContext && context.getNewObject() instanceof EDisplayLink) return true;
		return false;
	}

}