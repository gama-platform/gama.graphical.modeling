package idees.gama.features.create;


import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.modelgeneration.ModelGenerator;
import idees.gama.ui.image.GamaImageProvider;
import gama.EEquation;
import gama.EEquationLink;
import gama.ESpecies;
import gama.ESubSpeciesLink;
import idees.gama.features.ExampleUtil;
import idees.gama.features.add.AddEquationFeature;

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

public class CreateEquationLinkFeature extends AbstractCreateSpeciesComponentLinkFeature {

	private static final String TITLE = "Create equation";
	 
    private static final String USER_QUESTION = "Enter new equation name";
 
    public CreateEquationLinkFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "has the equation", "Create equation link");
	}

    private EEquation createEEquation(ICreateConnectionContext context, ESpecies source) {
		String newEquName = ExampleUtil.askString(TITLE, USER_QUESTION, "my_equation");
	    if (newEquName == null || newEquName.trim().length() == 0) {
	    	return null;
	    }  
	    String initName = newEquName;
	    List<String> names = new ArrayList<String>();
	    int cpt = 2;
	    while (names.contains(newEquName)) {
	    	newEquName = initName + cpt;
	    	cpt++;
	    }
	    EEquation newRule = gama.GamaFactory.eINSTANCE.createEEquation();
	    newRule.setError("");
	    newRule.setHasError(false);
		this.getDiagram().eResource().getContents().add(newRule);
		newRule.setName(newEquName);
		CreateContext ac = new CreateContext();
		ac.setLocation(context.getTargetLocation().getX(), context.getTargetLocation().getY());
		ac.setSize(0, 0);
		ac.setTargetContainer(getDiagram());
		return newRule;
	}
	
	private PictogramElement addEEquation(ICreateConnectionContext context, EEquation equation) {
		CreateContext cc = new CreateContext();
		cc.setLocation(context.getTargetLocation().getX() - (int)(AddEquationFeature.INIT_WIDTH/2.0), context.getTargetLocation().getY() - (int)(AddEquationFeature.INIT_HEIGHT/2.0));
		cc.setSize(0, 0);
		cc.setTargetContainer(getDiagram());
		return getFeatureProvider().addIfPossible(new AddContext(cc, equation));
	}
	
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		ESpecies source = getESpecies(context.getSourceAnchor());
		
		EEquation target = createEEquation(context,source);
		if (source != null && target != null) {
			PictogramElement targetpe = addEEquation(context, target);
			// create new business object
			EEquationLink eReference = createEReference(source, target);
			//eReference.setModel(source.getModel());
			getDiagram().eResource().getContents().add(eReference);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), getAnchor(targetpe));
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
			eReference.setSpecies(source);
			eReference.setEquation(target);
			source.getEquationLinks().add(eReference);
			target.getEquationLinks().add(eReference);
		}
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(getFeatureProvider()));
		diagramEditor.addEOject(target);
		
		return newConnection;
	}

	private EEquationLink createEReference(ESpecies source, EEquation target) {
		EEquationLink eReference = gama.GamaFactory.eINSTANCE.createEEquationLink();
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

}
