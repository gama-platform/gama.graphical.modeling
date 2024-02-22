/*******************************************************************************************************
 *
 * MyGamaToolBehaviorProvider.java, in idees.gama.graphicalmodeling, is part of the source code of the GAMA modeling and
 * simulation platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package idees.gama.diagram;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;

import gama.EAction;
import gama.EAspect;
import gama.EDisplay;
import gama.EEquation;
import gama.EExperiment;
import gama.EPerceive;
import gama.EPlan;
import gama.EReflex;
import gama.ERule;
import gama.ESpecies;
import gama.EState;
import gama.ETask;
import gama.core.util.GamaMapFactory;
import idees.gama.features.create.CreateActionLinkFeature;
import idees.gama.features.create.CreateAspectLinkFeature;
import idees.gama.features.create.CreateEquationLinkFeature;
import idees.gama.features.create.CreateInheritingLinkFeature;
import idees.gama.features.create.CreatePerceiveLinkFeature;
import idees.gama.features.create.CreatePlanLinkFeature;
import idees.gama.features.create.CreateReflexLinkFeature;
import idees.gama.features.create.CreateRuleLinkFeature;
import idees.gama.features.create.CreateStateLinkFeature;
import idees.gama.features.create.CreateSubGridLinkFeature;
import idees.gama.features.create.CreateSubSpeciesLinkFeature;
import idees.gama.features.create.CreateTaskLinkFeature;
import idees.gama.features.edit.EditActionFeature;
import idees.gama.features.edit.EditAspectFeature;
import idees.gama.features.edit.EditDisplayFeature;
import idees.gama.features.edit.EditEquationFeature;
import idees.gama.features.edit.EditExperimentFeature;
import idees.gama.features.edit.EditPerceiveFeature;
import idees.gama.features.edit.EditPlanFeature;
import idees.gama.features.edit.EditReflexFeature;
import idees.gama.features.edit.EditRuleFeature;
import idees.gama.features.edit.EditSpeciesFeature;
import idees.gama.features.edit.EditStateFeature;
import idees.gama.features.edit.EditTaskFeature;
import idees.gama.ui.editFrame.EditFrame;

/**
 * The Class MyGamaToolBehaviorProvider.
 */
public class MyGamaToolBehaviorProvider extends DefaultToolBehaviorProvider {

	/** The frames. */
	final Map<EObject, EditFrame> frames;

	/**
	 * Instantiates a new my gama tool behavior provider.
	 *
	 * @param diagramTypeProvider
	 *            the diagram type provider
	 */
	public MyGamaToolBehaviorProvider(final IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
		frames = GamaMapFactory.create();
	}

	@Override
	public ICustomFeature getDoubleClickFeature(final IDoubleClickContext context) {
		ICustomFeature customFeature = null;
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getDiagramTypeProvider().getFeatureProvider().getBusinessObjectForPictogramElement(pes[0]);
			if (bo instanceof EExperiment) {
				customFeature = new EditExperimentFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof ESpecies) {
				customFeature = new EditSpeciesFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof EAction) {
				customFeature = new EditActionFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof EReflex) {
				customFeature = new EditReflexFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof EPlan) {
				customFeature = new EditPlanFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof EPerceive) {
				customFeature = new EditPerceiveFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof ERule) {
				customFeature = new EditRuleFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof ETask) {
				customFeature = new EditTaskFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof EState) {
				customFeature = new EditStateFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof EAspect) {
				customFeature = new EditAspectFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof EEquation) {
				customFeature = new EditEquationFeature(getFeatureProvider(), frames.get(bo), this);
			} else if (bo instanceof EDisplay) {
				customFeature = new EditDisplayFeature(getFeatureProvider(), frames.get(bo), this);
			} /*
				 * else { customFeature = new RenameEGamaObjectFeature(getFeatureProvider()); }
				 */
			// canExecute() tests especially if the context contains a EClass
			if (customFeature != null && customFeature.canExecute(context)) return customFeature;
		}

		return super.getDoubleClickFeature(context);
	}

	@Override
	public IPaletteCompartmentEntry[] getPalette() {
		List<IPaletteCompartmentEntry> ret = new ArrayList<>();

		// add new compartment at the end of the existing compartments
		PaletteCompartmentEntry compartmentAgentEntry = new PaletteCompartmentEntry("Agents", null);
		PaletteCompartmentEntry compartmentAgentFeatureEntry = new PaletteCompartmentEntry("Agent features", null);
		PaletteCompartmentEntry compartmentExperimentEntry = new PaletteCompartmentEntry("Experiments", null);
		PaletteCompartmentEntry compartmentBDI = new PaletteCompartmentEntry("BDI Architecture", null);
		PaletteCompartmentEntry compartmentFSM = new PaletteCompartmentEntry("Finite State Machine", null);
		PaletteCompartmentEntry compartmentTask = new PaletteCompartmentEntry("Task-based Architecture", null);
		ret.add(compartmentAgentEntry);
		ret.add(compartmentAgentFeatureEntry);
		ret.add(compartmentExperimentEntry);
		ret.add(compartmentBDI);
		ret.add(compartmentFSM);
		ret.add(compartmentTask);

		IFeatureProvider featureProvider = getFeatureProvider();
		ICreateConnectionFeature[] createConnectionFeatures = featureProvider.getCreateConnectionFeatures();
		for (ICreateConnectionFeature cf : createConnectionFeatures) {
			ConnectionCreationToolEntry connectionCreationToolEntry = new ConnectionCreationToolEntry(
					cf.getCreateName(), cf.getCreateDescription(), cf.getCreateImageId(), cf.getCreateLargeImageId());
			connectionCreationToolEntry.addCreateConnectionFeature(cf);
			if (cf instanceof CreateSubSpeciesLinkFeature || cf instanceof CreateSubGridLinkFeature
					|| cf instanceof CreateInheritingLinkFeature) {
				compartmentAgentEntry.addToolEntry(connectionCreationToolEntry);
			} else if (cf instanceof CreateActionLinkFeature || cf instanceof CreateAspectLinkFeature
					|| cf instanceof CreateReflexLinkFeature || cf instanceof CreateEquationLinkFeature) {
				compartmentAgentFeatureEntry.addToolEntry(connectionCreationToolEntry);
			} else if (cf instanceof CreatePerceiveLinkFeature || cf instanceof CreateRuleLinkFeature
					|| cf instanceof CreatePlanLinkFeature) {
				compartmentBDI.addToolEntry(connectionCreationToolEntry);
			} else if (cf instanceof CreateStateLinkFeature) {
				compartmentFSM.addToolEntry(connectionCreationToolEntry);
			} else if (cf instanceof CreateTaskLinkFeature) {
				compartmentTask.addToolEntry(connectionCreationToolEntry);
			} else {
				compartmentExperimentEntry.addToolEntry(connectionCreationToolEntry);
			}
		}
		ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
		for (ICreateFeature cf : createFeatures) {
			ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(cf.getCreateName(),
					cf.getCreateDescription(), cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);
			compartmentExperimentEntry.addToolEntry(objectCreationToolEntry);
		}

		return ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
	}

	/**
	 * Gets the frames.
	 *
	 * @return the frames
	 */
	public Map<EObject, EditFrame> getFrames() { return frames; }

}
