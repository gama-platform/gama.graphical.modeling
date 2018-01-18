package idees.gama.features.create;

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

import gama.ESpecies;
import gama.ESubSpeciesLink;
import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.ExampleUtil;
import idees.gama.features.add.AddSpeciesFeature;
import idees.gama.ui.image.GamaImageProvider;

public class CreateSubSpeciesLinkFeature extends AbstractCreateSpeciesComponentLinkFeature {

	 private static final String TITLE = "Create species";
	  
	 private static final String USER_QUESTION = "Enter new species name";
	
   
	public CreateSubSpeciesLinkFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "is composed of a species", "Create a new species");
	}

	private ESpecies createESpecies(ICreateConnectionContext context,ESpecies source) {
		String newSpeciesName = ExampleUtil.askString(TITLE, USER_QUESTION, "my_species");
	    if (newSpeciesName == null || newSpeciesName.trim().length() == 0) {
	    	return null;
	    }  
	    String initName = newSpeciesName;
	    List<String> names = new ArrayList<String>();
	    for (ESubSpeciesLink li : source.getMicroSpeciesLinks()){
	    	if (li.getMicro() == null) continue;
	    	names.add(li.getMicro().getName());
	    }
	    int cpt = 2;
	    while (names.contains(newSpeciesName)) {
	    	newSpeciesName = initName + cpt;
	    	cpt++;
	    }
	    ESpecies newSpecies = gama.GamaFactory.eINSTANCE.createESpecies();
	    newSpecies.setError("");
	    newSpecies.setHasError(false);
		
	  	this.getDiagram().eResource().getContents().add(newSpecies);
	  	this.updatePictogramElement(getDiagram());
	  	System.out.println("this.getDiagram().eResource().getContents(): " + this.getDiagram().eResource().getContents());
		newSpecies.setName(newSpeciesName);
		CreateContext ac = new CreateContext();
		ac.setLocation(context.getTargetLocation().getX(), context.getTargetLocation().getY());
		ac.setSize(0, 0);
		ac.setTargetContainer(getDiagram());
		return newSpecies;
	}
	
	private PictogramElement addESpecies(ICreateConnectionContext context, ESpecies species) {
		CreateContext cc = new CreateContext();
		cc.setLocation(context.getTargetLocation().getX() - (int)(AddSpeciesFeature.INIT_WIDTH/2.0), context.getTargetLocation().getY() - (int)(AddSpeciesFeature.INIT_HEIGHT/2.0));
		cc.setSize(0, 0);
		cc.setTargetContainer(getDiagram());
		return getFeatureProvider().addIfPossible(new AddContext(cc, species));
	}
	
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		ESpecies source = getESpecies(context.getSourceAnchor());
		ESpecies target = createESpecies(context,source);
		if (source != null && target != null) {
			PictogramElement targetpe = addESpecies(context, target);
			// create new business object
			ESubSpeciesLink eReference = createEReference(source, target);
			//eReference.setModel(source.getModel());
			getDiagram().eResource().getContents().add(eReference);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), getAnchor(targetpe));
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
			eReference.setMacro(source);
			eReference.setMicro(target);
			source.getMicroSpeciesLinks().add(eReference);
			target.getMacroSpeciesLinks().add(eReference);
		}
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(getFeatureProvider()));
		
		diagramEditor.addEOject(target);
		
		return newConnection;
	}


	/**
	 * Creates a EReference between two EClasses.
	 */
	private ESubSpeciesLink createEReference(ESpecies source, ESpecies target) {
		ESubSpeciesLink eReference = gama.GamaFactory.eINSTANCE.createESubSpeciesLink();
		return eReference;
	}

	@Override
	public String getCreateImageId() {
		return GamaImageProvider.IMG_SUBSPECIESLINK;
	}
	
	public void execute(IContext context) {
		super.execute(context);
		//ModelGenerator.modelValidation(getFeatureProvider(), getDiagram());
	}
	
	

}
