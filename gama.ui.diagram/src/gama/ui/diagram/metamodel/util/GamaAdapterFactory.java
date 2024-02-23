/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.ui.diagram.metamodel.util;

import gama.*;
import gama.ui.diagram.metamodel.EAction;
import gama.ui.diagram.metamodel.EActionLink;
import gama.ui.diagram.metamodel.EAspect;
import gama.ui.diagram.metamodel.EAspectLink;
import gama.ui.diagram.metamodel.EBatchExperiment;
import gama.ui.diagram.metamodel.EChartLayer;
import gama.ui.diagram.metamodel.EDisplay;
import gama.ui.diagram.metamodel.EDisplayLink;
import gama.ui.diagram.metamodel.EEquation;
import gama.ui.diagram.metamodel.EEquationLink;
import gama.ui.diagram.metamodel.EExperiment;
import gama.ui.diagram.metamodel.EExperimentLink;
import gama.ui.diagram.metamodel.EFacet;
import gama.ui.diagram.metamodel.EGUIExperiment;
import gama.ui.diagram.metamodel.EGamaLink;
import gama.ui.diagram.metamodel.EGamaModel;
import gama.ui.diagram.metamodel.EGamaObject;
import gama.ui.diagram.metamodel.EGrid;
import gama.ui.diagram.metamodel.EInheritLink;
import gama.ui.diagram.metamodel.ELayer;
import gama.ui.diagram.metamodel.ELayerAspect;
import gama.ui.diagram.metamodel.EMonitor;
import gama.ui.diagram.metamodel.EParameter;
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
import gama.ui.diagram.metamodel.EVariable;
import gama.ui.diagram.metamodel.EWorldAgent;
import gama.ui.diagram.metamodel.GamaPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gama.ui.diagram.metamodel.GamaPackage
 * @generated
 */
public class GamaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GamaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamaSwitch<Adapter> modelSwitch =
		new GamaSwitch<Adapter>() {
			@Override
			public Adapter caseEGamaModel(EGamaModel object) {
				return createEGamaModelAdapter();
			}
			@Override
			public Adapter caseEGamaObject(EGamaObject object) {
				return createEGamaObjectAdapter();
			}
			@Override
			public Adapter caseESpecies(ESpecies object) {
				return createESpeciesAdapter();
			}
			@Override
			public Adapter caseEAction(EAction object) {
				return createEActionAdapter();
			}
			@Override
			public Adapter caseEAspect(EAspect object) {
				return createEAspectAdapter();
			}
			@Override
			public Adapter caseEReflex(EReflex object) {
				return createEReflexAdapter();
			}
			@Override
			public Adapter caseEExperiment(EExperiment object) {
				return createEExperimentAdapter();
			}
			@Override
			public Adapter caseEGUIExperiment(EGUIExperiment object) {
				return createEGUIExperimentAdapter();
			}
			@Override
			public Adapter caseEBatchExperiment(EBatchExperiment object) {
				return createEBatchExperimentAdapter();
			}
			@Override
			public Adapter caseEGamaLink(EGamaLink object) {
				return createEGamaLinkAdapter();
			}
			@Override
			public Adapter caseESubSpeciesLink(ESubSpeciesLink object) {
				return createESubSpeciesLinkAdapter();
			}
			@Override
			public Adapter caseEActionLink(EActionLink object) {
				return createEActionLinkAdapter();
			}
			@Override
			public Adapter caseEAspectLink(EAspectLink object) {
				return createEAspectLinkAdapter();
			}
			@Override
			public Adapter caseEReflexLink(EReflexLink object) {
				return createEReflexLinkAdapter();
			}
			@Override
			public Adapter caseEDisplayLink(EDisplayLink object) {
				return createEDisplayLinkAdapter();
			}
			@Override
			public Adapter caseEDisplay(EDisplay object) {
				return createEDisplayAdapter();
			}
			@Override
			public Adapter caseEVariable(EVariable object) {
				return createEVariableAdapter();
			}
			@Override
			public Adapter caseEWorldAgent(EWorldAgent object) {
				return createEWorldAgentAdapter();
			}
			@Override
			public Adapter caseELayer(ELayer object) {
				return createELayerAdapter();
			}
			@Override
			public Adapter caseEExperimentLink(EExperimentLink object) {
				return createEExperimentLinkAdapter();
			}
			@Override
			public Adapter caseELayerAspect(ELayerAspect object) {
				return createELayerAspectAdapter();
			}
			@Override
			public Adapter caseEInheritLink(EInheritLink object) {
				return createEInheritLinkAdapter();
			}
			@Override
			public Adapter caseEChartLayer(EChartLayer object) {
				return createEChartLayerAdapter();
			}
			@Override
			public Adapter caseEParameter(EParameter object) {
				return createEParameterAdapter();
			}
			@Override
			public Adapter caseEMonitor(EMonitor object) {
				return createEMonitorAdapter();
			}
			@Override
			public Adapter caseEFacet(EFacet object) {
				return createEFacetAdapter();
			}
			@Override
			public Adapter caseEPlan(EPlan object) {
				return createEPlanAdapter();
			}
			@Override
			public Adapter caseEState(EState object) {
				return createEStateAdapter();
			}
			@Override
			public Adapter caseETask(ETask object) {
				return createETaskAdapter();
			}
			@Override
			public Adapter caseEPlanLink(EPlanLink object) {
				return createEPlanLinkAdapter();
			}
			@Override
			public Adapter caseEStateLink(EStateLink object) {
				return createEStateLinkAdapter();
			}
			@Override
			public Adapter caseETaskLink(ETaskLink object) {
				return createETaskLinkAdapter();
			}
			@Override
			public Adapter caseEGrid(EGrid object) {
				return createEGridAdapter();
			}
			@Override
			public Adapter caseEPerceive(EPerceive object) {
				return createEPerceiveAdapter();
			}
			@Override
			public Adapter caseEPerceiveLink(EPerceiveLink object) {
				return createEPerceiveLinkAdapter();
			}
			@Override
			public Adapter caseERule(ERule object) {
				return createERuleAdapter();
			}
			@Override
			public Adapter caseERuleLink(ERuleLink object) {
				return createERuleLinkAdapter();
			}
			@Override
			public Adapter caseEEquation(EEquation object) {
				return createEEquationAdapter();
			}
			@Override
			public Adapter caseEEquationLink(EEquationLink object) {
				return createEEquationLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EGamaModel <em>EGama Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EGamaModel
	 * @generated
	 */
	public Adapter createEGamaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EGamaObject <em>EGama Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EGamaObject
	 * @generated
	 */
	public Adapter createEGamaObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.ESpecies <em>ESpecies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.ESpecies
	 * @generated
	 */
	public Adapter createESpeciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EAction <em>EAction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EAction
	 * @generated
	 */
	public Adapter createEActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EAspect <em>EAspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EAspect
	 * @generated
	 */
	public Adapter createEAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EReflex <em>EReflex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EReflex
	 * @generated
	 */
	public Adapter createEReflexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EExperiment <em>EExperiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EExperiment
	 * @generated
	 */
	public Adapter createEExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EGUIExperiment <em>EGUI Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EGUIExperiment
	 * @generated
	 */
	public Adapter createEGUIExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EBatchExperiment <em>EBatch Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EBatchExperiment
	 * @generated
	 */
	public Adapter createEBatchExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EGamaLink <em>EGama Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EGamaLink
	 * @generated
	 */
	public Adapter createEGamaLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.ESubSpeciesLink <em>ESub Species Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.ESubSpeciesLink
	 * @generated
	 */
	public Adapter createESubSpeciesLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EActionLink <em>EAction Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EActionLink
	 * @generated
	 */
	public Adapter createEActionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EAspectLink <em>EAspect Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EAspectLink
	 * @generated
	 */
	public Adapter createEAspectLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EReflexLink <em>EReflex Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EReflexLink
	 * @generated
	 */
	public Adapter createEReflexLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EDisplayLink <em>EDisplay Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EDisplayLink
	 * @generated
	 */
	public Adapter createEDisplayLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EDisplay <em>EDisplay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EDisplay
	 * @generated
	 */
	public Adapter createEDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EVariable <em>EVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EVariable
	 * @generated
	 */
	public Adapter createEVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EWorldAgent <em>EWorld Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EWorldAgent
	 * @generated
	 */
	public Adapter createEWorldAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.ELayer <em>ELayer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.ELayer
	 * @generated
	 */
	public Adapter createELayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EExperimentLink <em>EExperiment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EExperimentLink
	 * @generated
	 */
	public Adapter createEExperimentLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.ELayerAspect <em>ELayer Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.ELayerAspect
	 * @generated
	 */
	public Adapter createELayerAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EInheritLink <em>EInherit Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EInheritLink
	 * @generated
	 */
	public Adapter createEInheritLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EChartLayer <em>EChart Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EChartLayer
	 * @generated
	 */
	public Adapter createEChartLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EParameter
	 * @generated
	 */
	public Adapter createEParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EMonitor <em>EMonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EMonitor
	 * @generated
	 */
	public Adapter createEMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EFacet <em>EFacet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EFacet
	 * @generated
	 */
	public Adapter createEFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EPlan <em>EPlan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EPlan
	 * @generated
	 */
	public Adapter createEPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EState <em>EState</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EState
	 * @generated
	 */
	public Adapter createEStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.ETask <em>ETask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.ETask
	 * @generated
	 */
	public Adapter createETaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EPlanLink <em>EPlan Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EPlanLink
	 * @generated
	 */
	public Adapter createEPlanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EStateLink <em>EState Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EStateLink
	 * @generated
	 */
	public Adapter createEStateLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.ETaskLink <em>ETask Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.ETaskLink
	 * @generated
	 */
	public Adapter createETaskLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EGrid <em>EGrid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EGrid
	 * @generated
	 */
	public Adapter createEGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EPerceive <em>EPerceive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EPerceive
	 * @generated
	 */
	public Adapter createEPerceiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EPerceiveLink <em>EPerceive Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EPerceiveLink
	 * @generated
	 */
	public Adapter createEPerceiveLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.ERule <em>ERule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.ERule
	 * @generated
	 */
	public Adapter createERuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.ERuleLink <em>ERule Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.ERuleLink
	 * @generated
	 */
	public Adapter createERuleLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EEquation <em>EEquation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EEquation
	 * @generated
	 */
	public Adapter createEEquationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ui.diagram.metamodel.EEquationLink <em>EEquation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ui.diagram.metamodel.EEquationLink
	 * @generated
	 */
	public Adapter createEEquationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GamaAdapterFactory
