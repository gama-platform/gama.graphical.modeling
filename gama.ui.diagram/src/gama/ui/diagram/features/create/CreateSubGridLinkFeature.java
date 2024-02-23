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
import gama.ui.diagram.features.add.AddSpeciesFeature;
import gama.ui.diagram.features.modelgeneration.ModelGenerator;
import gama.ui.diagram.metamodel.EGrid;
import gama.ui.diagram.metamodel.ESpecies;
import gama.ui.diagram.metamodel.ESubSpeciesLink;
import gama.ui.diagram.swt.image.GamaImageProvider;

public class CreateSubGridLinkFeature extends AbstractCreateSpeciesComponentLinkFeature {

	 private static final String TITLE = "Create a grid";
	  
	 private static final String USER_QUESTION = "Enter new cell name";
	 
	public CreateSubGridLinkFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "is composed of a grid", "Create a new grid");
	}

	private ESpecies createEGrid(ICreateConnectionContext context, ESpecies source) {
		String newSpeciesName = ExampleUtil.askString(TITLE, USER_QUESTION, "my_cell");
	    if (newSpeciesName == null || newSpeciesName.trim().length() == 0) {
	    	return null;
	    } 
	    String initName = newSpeciesName;
	    List<String> names = new ArrayList<String>();
	    for (ESubSpeciesLink li : source.getMicroSpeciesLinks())names.add(li.getMicro().getName());
	    int cpt = 2;
	    while (names.contains(newSpeciesName)) {
	    	newSpeciesName = initName + cpt;
	    	cpt++;
	    }
	    EGrid newSpecies = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEGrid();
	    newSpecies.setError("");
	    newSpecies.setHasError(false);
		
		this.getDiagram().eResource().getContents().add(newSpecies);
		newSpecies.setName(newSpeciesName);
	  	CreateContext ac = new CreateContext();
		ac.setLocation(context.getTargetLocation().getX(), context.getTargetLocation().getY());
		ac.setSize(0, 0);
		ac.setTargetContainer(getDiagram());
		return newSpecies;
	}
	
	private PictogramElement addEGrid(ICreateConnectionContext context, ESpecies species) {
		CreateContext cc = new CreateContext();
		cc.setLocation(context.getTargetLocation().getX() - (int)(AddSpeciesFeature.INIT_WIDTH/2.0), context.getTargetLocation().getY() - (int)(AddSpeciesFeature.INIT_HEIGHT/2.0));
		cc.setSize(0, 0);
		cc.setTargetContainer(getDiagram());
		return getFeatureProvider().addIfPossible(new AddContext(cc, species));
	}
	
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		ESpecies source = getESpecies(context.getSourceAnchor());
		ESpecies target = createEGrid(context,source);
		if (source != null && target != null) {
			PictogramElement targetpe = addEGrid(context, target);
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
		ESubSpeciesLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createESubSpeciesLink();
		return eReference;
	}
	
	@Override
	public String getCreateImageId() {
		return GamaImageProvider.IMG_SUBGRIDLINK;
	}
	
	public void execute(IContext context) {
		super.execute(context);
		ModelGenerator.modelValidation(getFeatureProvider(), getDiagram());
	}
}
