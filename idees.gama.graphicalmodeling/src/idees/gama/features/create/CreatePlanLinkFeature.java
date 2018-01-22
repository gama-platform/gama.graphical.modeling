package idees.gama.features.create;


import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.modelgeneration.ModelGenerator;
import idees.gama.ui.image.GamaImageProvider;
import gama.EFacet;
import gama.EPlan;
import gama.EPlanLink;
import gama.ESpecies;
import gama.ESubSpeciesLink;
import idees.gama.features.ExampleUtil;
import idees.gama.features.add.AddPlanFeature;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class CreatePlanLinkFeature extends AbstractCreateSpeciesComponentLinkFeature {

	private static final String TITLE = "Create plan";
	 
    private static final String USER_QUESTION = "Enter new plan name";
 
    public CreatePlanLinkFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "has the plan", "Create plan link");
	}

    private EPlan createEPlan(ICreateConnectionContext context, ESpecies source) {
		String newPlanName = ExampleUtil.askString(TITLE, USER_QUESTION, "my_plan");
	    if (newPlanName == null || newPlanName.trim().length() == 0) {
	    	return null;
	    }  
	    String initName = newPlanName;
	    List<String> names = new ArrayList<String>();
	    for (EPlanLink li : source.getPlanLinks())names.add(li.getPlan().getName());
	    int cpt = 2;
	    while (names.contains(newPlanName)) {
	    	newPlanName = initName + cpt;
	    	cpt++;
	    }
	    EPlan newPlan = gama.GamaFactory.eINSTANCE.createEPlan();
	    newPlan.setError("");
	    newPlan.setHasError(false);
		this.getDiagram().eResource().getContents().add(newPlan);
		newPlan.setName(newPlanName);
		CreateContext ac = new CreateContext();
		ac.setLocation(context.getTargetLocation().getX(), context.getTargetLocation().getY());
		ac.setSize(0, 0);
		ac.setTargetContainer(getDiagram());
		return newPlan;
	}
	
	private PictogramElement addEPlan(ICreateConnectionContext context, EPlan plan) {
		CreateContext cc = new CreateContext();
		cc.setLocation(context.getTargetLocation().getX() - (int)(AddPlanFeature.INIT_WIDTH/2.0), context.getTargetLocation().getY() - (int)(AddPlanFeature.INIT_HEIGHT/2.0));
		cc.setSize(0, 0);
		cc.setTargetContainer(getDiagram());
		return getFeatureProvider().addIfPossible(new AddContext(cc, plan));
	}
	
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		ESpecies source = getESpecies(context.getSourceAnchor());
		
		EPlan target = createEPlan(context,source);
		if (source != null && target != null) {
			PictogramElement targetpe = addEPlan(context, target);
			// create new business object
			EPlanLink eReference = createEReference(source, target);
			//eReference.setModel(source.getModel());
			getDiagram().eResource().getContents().add(eReference);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), getAnchor(targetpe));
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
			eReference.setSpecies(source);
			eReference.setPlan(target);
			source.getPlanLinks().add(eReference);
			target.getPlanLinks().add(eReference);
		}
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(getFeatureProvider()));
		diagramEditor.addEOject(target);
		
		return newConnection;
	}

	private EPlanLink createEReference(ESpecies source, EPlan target) {
		EPlanLink eReference = gama.GamaFactory.eINSTANCE.createEPlanLink();
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
						if ("simple_bdi".equals(facet.getValue()) ||
								"parallel_bdi".equals(facet.getValue())) return (ESpecies) object;
						else break;
					}
				}	
			}
		}
		return null;
	}
}
