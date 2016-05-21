package idees.gama.features.create;


import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.modelgeneration.ModelGenerator;
import idees.gama.ui.image.GamaImageProvider;
import gama.ETask;
import gama.ETaskLink;
import gama.EFacet;
import gama.ESpecies;
import gama.ESubSpeciesLink;
import idees.gama.features.ExampleUtil;
import idees.gama.features.add.AddTaskFeature;

import java.util.ArrayList;
import java.util.Arrays;
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

public class CreateTaskLinkFeature extends AbstractCreateSpeciesComponentLinkFeature {

	private static final String TITLE = "Create task";
	 
    private static final String USER_QUESTION = "Enter new task name";
 
    public CreateTaskLinkFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "has the task", "Create task link");
	}

    private ETask createETask(ICreateConnectionContext context, ESpecies source) {
		String newTaskName = ExampleUtil.askString(TITLE, USER_QUESTION, "my_task");
	    if (newTaskName == null || newTaskName.trim().length() == 0) {
	    	return null;
	    }  
	    String initName = newTaskName;
	    List<String> names = new ArrayList<String>();
	    for (ETaskLink li : source.getTaskLinks())names.add(li.getTask().getName());
	    int cpt = 2;
	    while (names.contains(newTaskName)) {
	    	newTaskName = initName + cpt;
	    	cpt++;
	    }
	    ETask newTask = gama.GamaFactory.eINSTANCE.createETask();
	    newTask.setError("");
	    newTask.setHasError(false);
		this.getDiagram().eResource().getContents().add(newTask);
		newTask.setName(newTaskName);
		CreateContext ac = new CreateContext();
		ac.setLocation(context.getTargetLocation().getX(), context.getTargetLocation().getY());
		ac.setSize(0, 0);
		ac.setTargetContainer(getDiagram());
		return newTask;
	}
	
	private PictogramElement addETask(ICreateConnectionContext context, ETask task) {
		CreateContext cc = new CreateContext();
		cc.setLocation(context.getTargetLocation().getX() - (int)(AddTaskFeature.INIT_WIDTH/2.0), context.getTargetLocation().getY() - (int)(AddTaskFeature.INIT_HEIGHT/2.0));
		cc.setSize(0, 0);
		cc.setTargetContainer(getDiagram());
		return getFeatureProvider().addIfPossible(new AddContext(cc, task));
	}
	
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		ESpecies source = getESpecies(context.getSourceAnchor());
		
		ETask target = createETask(context,source);
		if (source != null && target != null) {
			PictogramElement targetpe = addETask(context, target);
			// create new business object
			ETaskLink eReference = createEReference(source, target);
			//eReference.setModel(source.getModel());
			getDiagram().eResource().getContents().add(eReference);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), getAnchor(targetpe));
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
			eReference.setSpecies(source);
			eReference.setTask(target);
			source.getTaskLinks().add(eReference);
			target.getTaskLinks().add(eReference);
		}
		
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(getFeatureProvider()));
		diagramEditor.addEOject(target);
		if (source.getStateLinks().size() == 1) {
			EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setValue("1");
			facet.setName("weight");
			facet.setOwner(target);
			target.getFacets().add(facet);
		}
		return newConnection;
	}

	private ETaskLink createEReference(ESpecies source, ETask target) {
		ETaskLink eReference = gama.GamaFactory.eINSTANCE.createETaskLink();
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
	
	List<String> archiName = Arrays.asList("probabilistic_tasks", "sorted_tasks", "weighted_tasks");
	
	protected ESpecies getESpecies(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof ESpecies) {
				ESpecies species = (ESpecies) object;
				for (EFacet facet : species.getFacets()) {
					if (facet.getName().equals("control")) {
						if (archiName.contains(facet.getValue())) return (ESpecies) object;
						else break;
					}
				}	
			}
		}
		return null;
	}

}
