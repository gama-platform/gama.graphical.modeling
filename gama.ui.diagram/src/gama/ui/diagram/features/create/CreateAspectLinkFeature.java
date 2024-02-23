package gama.ui.diagram.features.create;


import gama.ui.diagram.editor.GamaDiagramEditor;
import gama.ui.diagram.features.ExampleUtil;
import gama.ui.diagram.features.add.AddAspectFeature;
import gama.ui.diagram.features.modelgeneration.ModelGenerator;
import gama.ui.diagram.metamodel.EActionLink;
import gama.ui.diagram.metamodel.EAspect;
import gama.ui.diagram.metamodel.EAspectLink;
import gama.ui.diagram.metamodel.ESpecies;
import gama.ui.diagram.swt.image.GamaImageProvider;

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

public class CreateAspectLinkFeature extends AbstractCreateSpeciesComponentLinkFeature {

	 private static final String TITLE = "Create aspect";
	 
	 private static final String USER_QUESTION = "Enter new aspect name";
	    
	public CreateAspectLinkFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "has the aspect", "Create aspect link");
	}
	
	private EAspect createEAspect(ICreateConnectionContext context, ESpecies source) {
		String newAspectName = ExampleUtil.askString(TITLE, USER_QUESTION, "my_aspect");
	    if (newAspectName == null || newAspectName.trim().length() == 0) {
	    	return null;
	    }  
	    String initName = newAspectName;
	    List<String> names = new ArrayList<String>();
	    for (EAspectLink li : source.getAspectLinks())names.add(li.getAspect().getName());
	    int cpt = 2;
	    while (names.contains(newAspectName)) {
	    	newAspectName = initName + cpt;
	    	cpt++;
	    }
	    EAspect newAspect = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEAspect();
	    newAspect.setDefineGamlCode(false);
	    newAspect.setError("");
	    newAspect.setHasError(false);
		this.getDiagram().eResource().getContents().add(newAspect);
		newAspect.setName(newAspectName);
		CreateContext ac = new CreateContext();
		ac.setLocation(context.getTargetLocation().getX(), context.getTargetLocation().getY());
		ac.setSize(0, 0);
		ac.setTargetContainer(getDiagram());
		return newAspect;
	}
	
	private PictogramElement addEAspect(ICreateConnectionContext context, EAspect aspect) {
		CreateContext cc = new CreateContext();
		cc.setLocation(context.getTargetLocation().getX() - (int)(AddAspectFeature.INIT_WIDTH/2.0), context.getTargetLocation().getY() - (int)(AddAspectFeature.INIT_HEIGHT/2.0));
		cc.setSize(0, 0);
		cc.setTargetContainer(getDiagram());
		return getFeatureProvider().addIfPossible(new AddContext(cc, aspect));
	}
	
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		ESpecies source = getESpecies(context.getSourceAnchor());
		
		EAspect target = createEAspect(context,source);
		if (source != null && target != null) {
			PictogramElement targetpe = addEAspect(context, target);
			// create new business object
			EAspectLink eReference = createEReference(source, target);
			//eReference.setModel(source.getModel());
			getDiagram().eResource().getContents().add(eReference);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), getAnchor(targetpe));
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
			eReference.setSpecies(source);
			eReference.setAspect(target);
			
			source.getAspectLinks().add(eReference);
			target.getAspectLinks().add(eReference);
		}
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(getFeatureProvider()));
		diagramEditor.addEOject(target);
		
		return newConnection;
	}

	private EAspectLink createEReference(ESpecies source, EAspect target) {
		EAspectLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEAspectLink();
		eReference.setSource(source);
		eReference.setTarget(target);
		return eReference;
	}
	
	@Override
	public String getCreateImageId() {
		return GamaImageProvider.IMG_ASPECTLINK;
	}
	
	public void execute(IContext context) {
		super.execute(context);
		ModelGenerator.modelValidation(getFeatureProvider(), getDiagram());
	}

}
