/*******************************************************************************************************
 *
 * CreateActionLinkFeature.java, in gama.ui.diagram, is part of the source code of the GAMA modeling and simulation
 * platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package gama.ui.diagram.features.create;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import gama.ui.diagram.editor.GamaDiagramEditor;
import gama.ui.diagram.features.ExampleUtil;
import gama.ui.diagram.features.add.AddActionFeature;
import gama.ui.diagram.features.modelgeneration.ModelGenerator;
import gama.ui.diagram.metamodel.EAction;
import gama.ui.diagram.metamodel.EActionLink;
import gama.ui.diagram.metamodel.ESpecies;
import gama.ui.diagram.swt.image.GamaImageProvider;

/**
 * The Class CreateActionLinkFeature.
 */
public class CreateActionLinkFeature extends AbstractCreateSpeciesComponentLinkFeature {

	/** The Constant TITLE. */
	private static final String TITLE = "Create action";

	/** The Constant USER_QUESTION. */
	private static final String USER_QUESTION = "Enter new action name";

	/**
	 * Instantiates a new creates the action link feature.
	 *
	 * @param fp
	 *            the fp
	 */
	public CreateActionLinkFeature(final IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "has the action", "Create action link");
	}

	/**
	 * Creates the E action.
	 *
	 * @param context
	 *            the context
	 * @param source
	 *            the source
	 * @return the e action
	 */
	private EAction createEAction(final ICreateConnectionContext context, final ESpecies source) {
		String newActionName = ExampleUtil.askString(TITLE, USER_QUESTION, "my_action");
		if (newActionName == null || newActionName.trim().length() == 0) return null;
		String initName = newActionName;
		List<String> names = new ArrayList<>();
		for (EActionLink li : source.getActionLinks()) { names.add(li.getAction().getName()); }
		int cpt = 2;
		while (names.contains(newActionName)) {
			newActionName = initName + cpt;
			cpt++;
		}
		EAction newAction = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEAction();
		newAction.setError("");
		newAction.setHasError(false);
		this.getDiagram().eResource().getContents().add(newAction);
		newAction.setName(newActionName);
		CreateContext ac = new CreateContext();
		ac.setLocation(context.getTargetLocation().getX(), context.getTargetLocation().getY());
		ac.setSize(0, 0);
		ac.setTargetContainer(getDiagram());
		return newAction;
	}

	/**
	 * Adds the E action.
	 *
	 * @param context
	 *            the context
	 * @param action
	 *            the action
	 * @return the pictogram element
	 */
	private PictogramElement addEAction(final ICreateConnectionContext context, final EAction action) {
		CreateContext cc = new CreateContext();
		cc.setLocation(context.getTargetLocation().getX() - (int) (AddActionFeature.INIT_WIDTH / 2.0),
				context.getTargetLocation().getY() - (int) (AddActionFeature.INIT_HEIGHT / 2.0));
		cc.setSize(0, 0);
		cc.setTargetContainer(getDiagram());
		return getFeatureProvider().addIfPossible(new AddContext(cc, action));
	}

	@Override
	public Connection create(final ICreateConnectionContext context) {
		Connection newConnection = null;
		ESpecies source = getESpecies(context.getSourceAnchor());

		EAction target = createEAction(context, source);
		if (source != null && target != null) {
			PictogramElement targetpe = addEAction(context, target);
			// create new business object
			EActionLink eReference = createEReference(source, target);
			// eReference.setModel(source.getModel());
			getDiagram().eResource().getContents().add(eReference);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), getAnchor(targetpe));
			addContext.setNewObject(eReference);

			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
			eReference.setSpecies(source);
			eReference.setAction(target);

			source.getActionLinks().add(eReference);
			target.getActionLinks().add(eReference);
		}
		GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(getFeatureProvider());
		diagramEditor.addEOject(target);

		return newConnection;
	}

	/**
	 * Creates the E reference.
	 *
	 * @param source
	 *            the source
	 * @param target
	 *            the target
	 * @return the e action link
	 */
	private EActionLink createEReference(final ESpecies source, final EAction target) {
		EActionLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEActionLink();
		eReference.setSource(source);
		eReference.setTarget(target);
		return eReference;
	}

	@Override
	public String getCreateImageId() { return GamaImageProvider.IMG_ACTIONLINK; }

	@Override
	public void execute(final IContext context) {
		super.execute(context);
		ModelGenerator.modelValidation(getFeatureProvider(), getDiagram());
	}

}
