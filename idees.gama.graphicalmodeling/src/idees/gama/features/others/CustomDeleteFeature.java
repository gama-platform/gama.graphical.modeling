package idees.gama.features.others;

import gama.EAction;
import gama.EActionLink;
import gama.EAspect;
import gama.EAspectLink;
import gama.EDisplay;
import gama.EDisplayLink;
import gama.EEquation;
import gama.EEquationLink;
import gama.EExperiment;
import gama.EExperimentLink;
import gama.EFacet;
import gama.EGUIExperiment;
import gama.EGamaObject;
import gama.EPerceive;
import gama.EPerceiveLink;
import gama.EPlan;
import gama.EPlanLink;
import gama.EReflex;
import gama.EReflexLink;
import gama.ERule;
import gama.ERuleLink;
import gama.ESpecies;
import gama.EState;
import gama.EStateLink;
import gama.ESubSpeciesLink;
import gama.ETask;
import gama.ETaskLink;
import gama.EWorldAgent;
import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.ExampleUtil;
import idees.gama.features.modelgeneration.ModelGenerator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;

public class CustomDeleteFeature extends DefaultDeleteFeature{

	IFeatureProvider fp;
	
	public CustomDeleteFeature(IFeatureProvider fp) {
		super(fp);
		this.fp = fp;
	}

	public boolean canDelete(IDeleteContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		 Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof EWorldAgent) {
			return false;
		}
		IRemoveContext rc = new RemoveContext(pictogramElement);
		IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(rc);
		boolean ret = (removeFeature != null);
		return ret;
	}
	
	
	public void deleteSpecies(ESpecies ex) {
		deleteBusinessObject(ex.getAspectLinks());
		
		if (ex instanceof EGUIExperiment) {
			EList liste = ((EGUIExperiment) ex).getDisplayLinks();
			List obj = new ArrayList(); obj.addAll(liste);
			for (Object o : obj) {
				deleteBusinessObject(((EDisplayLink)o).getDisplay());
			}
		}
		EList liste = ex.getActionLinks();
		List obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((EActionLink)o).getAction());
		}
		liste = ex.getAspectLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((EAspectLink)o).getAspect());
		}
		liste = ex.getReflexLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((EReflexLink)o).getReflex());
		}
		liste = ex.getStateLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((EStateLink)o).getState());
		}
		liste = ex.getTaskLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((ETaskLink)o).getTask());
		}
		liste = ex.getPerceiveLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((EPerceiveLink)o).getPerceive());
		}
		liste = ex.getPlanLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((EPlanLink)o).getPlan());
		}
		liste = ex.getRuleLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((ERuleLink)o).getRule());
		}
		liste = ex.getEquationLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((EEquationLink)o).getEquation());
		}
		liste = ex.getInheritingLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(o);
		}
		liste = ex.getVariables();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(o);
		}
	
		liste = ex.getExperimentLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((EExperimentLink)o).getExperiment());
		}
		liste = ex.getMicroSpeciesLinks();
		obj = new ArrayList(); obj.addAll(liste);
		for (Object o : obj) {
			deleteBusinessObject(((ESubSpeciesLink)o).getMicro());
		}		
	}

	@Override
	protected void deleteBusinessObject(Object bo) {
		if (bo instanceof EObject) {
			List<PictogramElement> pe = Graphiti.getLinkService().getPictogramElements(getDiagram(), (EObject) bo);
			for (PictogramElement p : pe)  {
				Graphiti.getPeService().deletePictogramElement(p);
			}
		}
		
		
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
		if (bo instanceof EObject)
			diagramEditor.removeEOject((EObject) bo);
		if (bo instanceof EGamaObject)  {
			List liste = ((EGamaObject)bo).getFacets();
			List obj = new ArrayList(); obj.addAll(liste);
			for (Object o : obj) {
				deleteBusinessObject(o);
			}
		}
		if (bo instanceof EAspect) deleteBusinessObject(((EAspect) bo).getAspectLinks().get(0));
		else if (bo instanceof EDisplay) deleteBusinessObject(((EDisplay) bo).getDisplayLink());
		else if (bo instanceof EReflex) deleteBusinessObject(((EReflex) bo).getReflexLinks().get(0));
		else if (bo instanceof EAction) deleteBusinessObject(((EAction) bo).getActionLinks().get(0));
		else if (bo instanceof EState) deleteBusinessObject(((EState) bo).getStateLinks().get(0));
		else if (bo instanceof ETask) deleteBusinessObject(((ETask) bo).getTaskLinks().get(0));
		else if (bo instanceof EPlan) deleteBusinessObject(((EPlan) bo).getPlanLinks().get(0));
		else if (bo instanceof EPerceive) deleteBusinessObject(((EPerceive) bo).getPerceiveLinks().get(0));
		else if (bo instanceof ERule) deleteBusinessObject(((ERule) bo).getRuleLinks().get(0));
		else if (bo instanceof EEquation) deleteBusinessObject(((EEquation) bo).getEquationLinks().get(0));
		else if (bo instanceof ESpecies) {
			deleteSpecies((ESpecies) bo);
		}
		
		super.deleteBusinessObject(bo);
		
	}

	@Override
	public void postDelete(IDeleteContext context) {
		super.postDelete(context);
		
		ModelGenerator.modelValidation(getFeatureProvider(), getDiagram());
	}

	
}
