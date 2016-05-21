package idees.gama.features.create;


import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.modelgeneration.ModelGenerator;
import idees.gama.ui.image.GamaImageProvider;
import gama.EFacet;
import gama.EPerceive;
import gama.EPerceiveLink;
import gama.ESpecies;

import idees.gama.features.ExampleUtil;
import idees.gama.features.add.AddPerceiveFeature;

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

public class CreatePerceiveLinkFeature extends AbstractCreateSpeciesComponentLinkFeature {

	private static final String TITLE = "Create perception";
	 
    private static final String USER_QUESTION = "Enter new perception name";
 
    public CreatePerceiveLinkFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "has the perception", "Create perception link");
	}

    private EPerceive createEPerceive(ICreateConnectionContext context,ESpecies source ) {
		String newPerceiveName = ExampleUtil.askString(TITLE, USER_QUESTION, "my_perception");
	    if (newPerceiveName == null || newPerceiveName.trim().length() == 0) {
	    	return null;
	    } 
	    String initName = newPerceiveName;
	    List<String> names = new ArrayList<String>();
	    for (EPerceiveLink li : source.getPerceiveLinks())names.add(li.getPerceive().getName());
	    int cpt = 2;
	    while (names.contains(newPerceiveName)) {
	    	newPerceiveName = initName + cpt;
	    	cpt++;
	    }
	    EPerceive newPerceive = gama.GamaFactory.eINSTANCE.createEPerceive();
	    newPerceive.setError("");
	    newPerceive.setHasError(false);
		this.getDiagram().eResource().getContents().add(newPerceive);
		newPerceive.setName(newPerceiveName);
		CreateContext ac = new CreateContext();
		ac.setLocation(context.getTargetLocation().getX(), context.getTargetLocation().getY());
		ac.setSize(0, 0);
		ac.setTargetContainer(getDiagram());
		return newPerceive;
	}
	
	private PictogramElement addEPerceive(ICreateConnectionContext context, EPerceive plan) {
		CreateContext cc = new CreateContext();
		cc.setLocation(context.getTargetLocation().getX() - (int)(AddPerceiveFeature.INIT_WIDTH/2.0), context.getTargetLocation().getY() - (int)(AddPerceiveFeature.INIT_HEIGHT/2.0));
		cc.setSize(0, 0);
		cc.setTargetContainer(getDiagram());
		return getFeatureProvider().addIfPossible(new AddContext(cc, plan));
	}
	
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		ESpecies source = getESpecies(context.getSourceAnchor());
		
		EPerceive target = createEPerceive(context,source);
		if (source != null && target != null) {
			PictogramElement targetpe = addEPerceive(context, target);
			// create new business object
			EPerceiveLink eReference = createEReference(source, target);
			//eReference.setModel(source.getModel());
			getDiagram().eResource().getContents().add(eReference);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), getAnchor(targetpe));
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
			eReference.setSpecies(source);
			eReference.setPerceive(target);
			source.getPerceiveLinks().add(eReference);
			target.getPerceiveLinks().add(eReference);
		}
		
		
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(getFeatureProvider()));
		diagramEditor.addEOject(target);
		if (source.getStateLinks().size() == 1) {
			EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setValue("[]");
			facet.setName("target");
			facet.setOwner(target);
			target.getFacets().add(facet);
		}
		return newConnection;
	}

	private EPerceiveLink createEReference(ESpecies source, EPerceive target) {
		EPerceiveLink eReference = gama.GamaFactory.eINSTANCE.createEPerceiveLink();
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
						if ("simple_bdi".equals(facet.getValue())) return (ESpecies) object;
						else break;
					}
				}	
			}
		}
		return null;
	}

}
