package idees.gama.features.create;


import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.modelgeneration.ModelGenerator;
import idees.gama.ui.image.GamaImageProvider;
import gama.EFacet;
import gama.ESpecies;
import gama.EState;
import gama.EStateLink;
import idees.gama.features.ExampleUtil;
import idees.gama.features.add.AddStateFeature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class CreateStateLinkFeature extends AbstractCreateSpeciesComponentLinkFeature {

	private static final String TITLE = "Create state";
	 
    private static final String USER_QUESTION = "Enter new state name";
 
    public CreateStateLinkFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "has the state", "Create state link");
	}

    private EState createEState(ICreateConnectionContext context) {
		String newStateName = ExampleUtil.askString(TITLE, USER_QUESTION, "my_state");
	    if (newStateName == null || newStateName.trim().length() == 0) {
	    	return null;
	    }  
	    EState newState = gama.GamaFactory.eINSTANCE.createEState();
	    newState.setError("");
	    newState.setHasError(false);
		this.getDiagram().eResource().getContents().add(newState);
		newState.setName(newStateName);
		CreateContext ac = new CreateContext();
		ac.setLocation(context.getTargetLocation().getX(), context.getTargetLocation().getY());
		ac.setSize(0, 0);
		ac.setTargetContainer(getDiagram());
		return newState;
	}
	
	private PictogramElement addEState(ICreateConnectionContext context, EState action) {
		CreateContext cc = new CreateContext();
		cc.setLocation(context.getTargetLocation().getX() - (int)(AddStateFeature.INIT_WIDTH/2.0), context.getTargetLocation().getY() - (int)(AddStateFeature.INIT_HEIGHT/2.0));
		cc.setSize(0, 0);
		cc.setTargetContainer(getDiagram());
		return getFeatureProvider().addIfPossible(new AddContext(cc, action));
	}
	
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		ESpecies source = getESpecies(context.getSourceAnchor());
		
		EState target = createEState(context);
		if (source != null && target != null) {
			PictogramElement targetpe = addEState(context, target);
			// create new business object
			EStateLink eReference = createEReference(source, target);
			//eReference.setModel(source.getModel());
			getDiagram().eResource().getContents().add(eReference);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), getAnchor(targetpe));
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
			eReference.setSpecies(source);
			eReference.setState(target);
			source.getStateLinks().add(eReference);
			target.getStateLinks().add(eReference);
		}
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(getFeatureProvider()));
		diagramEditor.addEOject(target);
		
		return newConnection;
	}

	private EStateLink createEReference(ESpecies source, EState target) {
		EStateLink eReference = gama.GamaFactory.eINSTANCE.createEStateLink();
		eReference.setSource(source);
		eReference.setTarget(target);
		return eReference;
	}
	
	@Override
	public String getCreateImageId() {
		return GamaImageProvider.IMG_REFLEXLINK;
	}
	public void execute(IContext context) {
		super.execute(context);
		ModelGenerator.modelValidation(getFeatureProvider(), getDiagram());
	}
	
	protected ESpecies getESpecies(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof ESpecies) {
				ESpecies species = (ESpecies) object;
				for (EFacet facet : species.getFacets()) {
					if (facet.getName().equals("control")) {
						if ("fsm".equals(facet.getValue())) return (ESpecies) object;
						else break;
					}
				}	
			}
		}
		return null;
	}

}
