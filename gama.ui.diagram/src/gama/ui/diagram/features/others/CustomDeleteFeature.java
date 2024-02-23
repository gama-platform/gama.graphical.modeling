package gama.ui.diagram.features.others;

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

import gama.ui.diagram.editor.GamaDiagramEditor;
import gama.ui.diagram.features.ExampleUtil;
import gama.ui.diagram.features.modelgeneration.ModelGenerator;
import gama.ui.diagram.metamodel.EAction;
import gama.ui.diagram.metamodel.EActionLink;
import gama.ui.diagram.metamodel.EAspect;
import gama.ui.diagram.metamodel.EAspectLink;
import gama.ui.diagram.metamodel.EDisplay;
import gama.ui.diagram.metamodel.EDisplayLink;
import gama.ui.diagram.metamodel.EEquation;
import gama.ui.diagram.metamodel.EEquationLink;
import gama.ui.diagram.metamodel.EExperimentLink;
import gama.ui.diagram.metamodel.EGUIExperiment;
import gama.ui.diagram.metamodel.EGamaObject;
import gama.ui.diagram.metamodel.EPerceive;
import gama.ui.diagram.metamodel.EPerceiveLink;
import gama.ui.diagram.metamodel.EPlan;
import gama.ui.diagram.metamodel.EPlanLink;
import gama.ui.diagram.metamodel.EReflex;
import gama.ui.diagram.metamodel.EReflexLink;
import gama.ui.diagram.metamodel.ERule;
import gama.ui.diagram.metamodel.ERuleLink;
import gama.ui.diagram.metamodel.ESpecies;
import gama.ui.diagram.metamodel.EState;
import gama.ui.diagram.metamodel.EStateLink;
import gama.ui.diagram.metamodel.ESubSpeciesLink;
import gama.ui.diagram.metamodel.ETask;
import gama.ui.diagram.metamodel.ETaskLink;
import gama.ui.diagram.metamodel.EWorldAgent;

public class CustomDeleteFeature extends DefaultDeleteFeature {

	IFeatureProvider fp;

	public CustomDeleteFeature(final IFeatureProvider fp) {
		super(fp);
		this.fp = fp;
	}

	@Override
	public boolean canDelete(final IDeleteContext context) {
		final PictogramElement pictogramElement = context.getPictogramElement();
		final Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof EWorldAgent) {
			return false;
		}
		final IRemoveContext rc = new RemoveContext(pictogramElement);
		final IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(rc);
		final boolean ret = removeFeature != null;
		return ret;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void deleteSpecies(final ESpecies ex) {
		deleteBusinessObject(ex.getAspectLinks());
		 
		
		if (ex instanceof EGUIExperiment) {
			final EList liste = ((EGUIExperiment) ex).getDisplayLinks();
			final List<?> obj = new ArrayList();
			obj.addAll(liste);
			for (final Object o : obj) {
				deleteBusinessObject(((EDisplayLink) o).getDisplay());
			}
		}
		EList<?> liste = ex.getActionLinks();
		List obj = new ArrayList<>();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((EActionLink) o).getAction());
		}
		liste = ex.getAspectLinks();
		obj = new ArrayList<>();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((EAspectLink) o).getAspect());
		}
		liste = ex.getReflexLinks();
		obj = new ArrayList<>();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((EReflexLink) o).getReflex());
		}
		liste = ex.getStateLinks();
		obj = new ArrayList<>();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((EStateLink) o).getState());
		}
		liste = ex.getTaskLinks();
		obj = new ArrayList<>();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((ETaskLink) o).getTask());
		}
		liste = ex.getPerceiveLinks();
		obj = new ArrayList<>();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((EPerceiveLink) o).getPerceive());
		}
		liste = ex.getPlanLinks();
		obj = new ArrayList();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((EPlanLink) o).getPlan());
		}
		liste = ex.getRuleLinks();
		obj = new ArrayList();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((ERuleLink) o).getRule());
		}
		liste = ex.getEquationLinks();
		obj = new ArrayList();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((EEquationLink) o).getEquation());
		}
		liste = ex.getInheritingLinks();
		obj = new ArrayList();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(o);
		}
		liste = ex.getVariables();
		obj = new ArrayList();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(o);
		}

		liste = ex.getExperimentLinks();
		obj = new ArrayList();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((EExperimentLink) o).getExperiment());
		}
		liste = ex.getMicroSpeciesLinks();
		obj = new ArrayList();
		obj.addAll(liste);
		for (final Object o : obj) {
			deleteBusinessObject(((ESubSpeciesLink) o).getMicro());
		}
		if (ex.getMacroSpeciesLinks() != null && !ex.getMacroSpeciesLinks().isEmpty())
		deleteBusinessObject(ex.getMacroSpeciesLinks().get(0));
	
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected void deleteBusinessObject(final Object bo) {
		if (bo instanceof EObject) {
			final List<PictogramElement> pe = Graphiti.getLinkService().getPictogramElements(getDiagram(),
					(EObject) bo);
			for (final PictogramElement p : pe) {
				Graphiti.getPeService().deletePictogramElement(p);
			}
		}

		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
		if (bo instanceof EObject)
			diagramEditor.removeEOject((EObject) bo);
		if (bo instanceof EGamaObject) {
			final List liste = ((EGamaObject) bo).getFacets();
			final List obj = new ArrayList();
			obj.addAll(liste);
			for (final Object o : obj) {
				deleteBusinessObject(o);
			}
		}
		if (bo instanceof EAspect)
			deleteBusinessObject(((EAspect) bo).getAspectLinks().get(0));
		else if (bo instanceof EDisplay)
			deleteBusinessObject(((EDisplay) bo).getDisplayLink());
		else if (bo instanceof EReflex)
			deleteBusinessObject(((EReflex) bo).getReflexLinks().get(0));
		else if (bo instanceof EAction)
			deleteBusinessObject(((EAction) bo).getActionLinks().get(0));
		else if (bo instanceof EState)
			deleteBusinessObject(((EState) bo).getStateLinks().get(0));
		else if (bo instanceof ETask)
			deleteBusinessObject(((ETask) bo).getTaskLinks().get(0));
		else if (bo instanceof EPlan)
			deleteBusinessObject(((EPlan) bo).getPlanLinks().get(0));
		else if (bo instanceof EPerceive)
			deleteBusinessObject(((EPerceive) bo).getPerceiveLinks().get(0));
		else if (bo instanceof ERule)
			deleteBusinessObject(((ERule) bo).getRuleLinks().get(0));
		else if (bo instanceof EEquation)
			deleteBusinessObject(((EEquation) bo).getEquationLinks().get(0));
		else if (bo instanceof ESpecies) {
			deleteSpecies((ESpecies) bo);
		}

		super.deleteBusinessObject(bo);

	}

	@Override
	public void postDelete(final IDeleteContext context) {
		super.postDelete(context);

		ModelGenerator.modelValidation(getFeatureProvider(), getDiagram());
	}

}
