package idees.gama.features.create;


import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.modelgeneration.ModelGenerator;
import idees.gama.ui.image.GamaImageProvider;
import gama.EFacet;
import gama.ERule;
import gama.ERuleLink;
import gama.ESpecies;
import gama.ESubSpeciesLink;
import idees.gama.features.ExampleUtil;
import idees.gama.features.add.AddRuleFeature;

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

public class CreateRuleLinkFeature extends AbstractCreateSpeciesComponentLinkFeature {

	private static final String TITLE = "Create rule";
	 
    private static final String USER_QUESTION = "Enter new rule name";
 
    public CreateRuleLinkFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "has the rule", "Create rule link");
	}

    private ERule createERule(ICreateConnectionContext context, ESpecies source) {
		String newRuleName = ExampleUtil.askString(TITLE, USER_QUESTION, "my_rule");
	    if (newRuleName == null || newRuleName.trim().length() == 0) {
	    	return null;
	    }  
	    String initName = newRuleName;
	    List<String> names = new ArrayList<String>();
	    for (ERuleLink li : source.getRuleLinks())names.add(li.getRule().getName());
	    int cpt = 2;
	    while (names.contains(newRuleName)) {
	    	newRuleName = initName + cpt;
	    	cpt++;
	    }
	    ERule newRule = gama.GamaFactory.eINSTANCE.createERule();
	    newRule.setError("");
	    newRule.setHasError(false);
		this.getDiagram().eResource().getContents().add(newRule);
		newRule.setName(newRuleName);
		CreateContext ac = new CreateContext();
		ac.setLocation(context.getTargetLocation().getX(), context.getTargetLocation().getY());
		ac.setSize(0, 0);
		ac.setTargetContainer(getDiagram());
		return newRule;
	}
	
	private PictogramElement addERule(ICreateConnectionContext context, ERule plan) {
		CreateContext cc = new CreateContext();
		cc.setLocation(context.getTargetLocation().getX() - (int)(AddRuleFeature.INIT_WIDTH/2.0), context.getTargetLocation().getY() - (int)(AddRuleFeature.INIT_HEIGHT/2.0));
		cc.setSize(0, 0);
		cc.setTargetContainer(getDiagram());
		return getFeatureProvider().addIfPossible(new AddContext(cc, plan));
	}
	
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		ESpecies source = getESpecies(context.getSourceAnchor());
		
		ERule target = createERule(context,source);
		if (source != null && target != null) {
			PictogramElement targetpe = addERule(context, target);
			// create new business object
			ERuleLink eReference = createEReference(source, target);
			//eReference.setModel(source.getModel());
			getDiagram().eResource().getContents().add(eReference);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), getAnchor(targetpe));
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
			eReference.setSpecies(source);
			eReference.setRule(target);
			source.getRuleLinks().add(eReference);
			target.getRuleLinks().add(eReference);
		}
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(getFeatureProvider()));
		diagramEditor.addEOject(target);
		
		return newConnection;
	}

	private ERuleLink createEReference(ESpecies source, ERule target) {
		ERuleLink eReference = gama.GamaFactory.eINSTANCE.createERuleLink();
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
