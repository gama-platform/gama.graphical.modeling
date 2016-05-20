/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.util;

import gama.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gama.GamaPackage
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
	 * Creates a new adapter for an object of class '{@link gama.EGamaModel <em>EGama Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EGamaModel
	 * @generated
	 */
	public Adapter createEGamaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EGamaObject <em>EGama Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EGamaObject
	 * @generated
	 */
	public Adapter createEGamaObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ESpecies <em>ESpecies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ESpecies
	 * @generated
	 */
	public Adapter createESpeciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EAction <em>EAction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EAction
	 * @generated
	 */
	public Adapter createEActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EAspect <em>EAspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EAspect
	 * @generated
	 */
	public Adapter createEAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EReflex <em>EReflex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EReflex
	 * @generated
	 */
	public Adapter createEReflexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EExperiment <em>EExperiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EExperiment
	 * @generated
	 */
	public Adapter createEExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EGUIExperiment <em>EGUI Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EGUIExperiment
	 * @generated
	 */
	public Adapter createEGUIExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EBatchExperiment <em>EBatch Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EBatchExperiment
	 * @generated
	 */
	public Adapter createEBatchExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EGamaLink <em>EGama Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EGamaLink
	 * @generated
	 */
	public Adapter createEGamaLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ESubSpeciesLink <em>ESub Species Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ESubSpeciesLink
	 * @generated
	 */
	public Adapter createESubSpeciesLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EActionLink <em>EAction Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EActionLink
	 * @generated
	 */
	public Adapter createEActionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EAspectLink <em>EAspect Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EAspectLink
	 * @generated
	 */
	public Adapter createEAspectLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EReflexLink <em>EReflex Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EReflexLink
	 * @generated
	 */
	public Adapter createEReflexLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EDisplayLink <em>EDisplay Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EDisplayLink
	 * @generated
	 */
	public Adapter createEDisplayLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EDisplay <em>EDisplay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EDisplay
	 * @generated
	 */
	public Adapter createEDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EVariable <em>EVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EVariable
	 * @generated
	 */
	public Adapter createEVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EWorldAgent <em>EWorld Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EWorldAgent
	 * @generated
	 */
	public Adapter createEWorldAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ELayer <em>ELayer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ELayer
	 * @generated
	 */
	public Adapter createELayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EExperimentLink <em>EExperiment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EExperimentLink
	 * @generated
	 */
	public Adapter createEExperimentLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ELayerAspect <em>ELayer Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ELayerAspect
	 * @generated
	 */
	public Adapter createELayerAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EInheritLink <em>EInherit Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EInheritLink
	 * @generated
	 */
	public Adapter createEInheritLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EChartLayer <em>EChart Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EChartLayer
	 * @generated
	 */
	public Adapter createEChartLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EParameter
	 * @generated
	 */
	public Adapter createEParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EMonitor <em>EMonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EMonitor
	 * @generated
	 */
	public Adapter createEMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EFacet <em>EFacet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EFacet
	 * @generated
	 */
	public Adapter createEFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EPlan <em>EPlan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EPlan
	 * @generated
	 */
	public Adapter createEPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EState <em>EState</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EState
	 * @generated
	 */
	public Adapter createEStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ETask <em>ETask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ETask
	 * @generated
	 */
	public Adapter createETaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EPlanLink <em>EPlan Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EPlanLink
	 * @generated
	 */
	public Adapter createEPlanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EStateLink <em>EState Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EStateLink
	 * @generated
	 */
	public Adapter createEStateLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ETaskLink <em>ETask Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ETaskLink
	 * @generated
	 */
	public Adapter createETaskLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EGrid <em>EGrid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EGrid
	 * @generated
	 */
	public Adapter createEGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EPerceive <em>EPerceive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EPerceive
	 * @generated
	 */
	public Adapter createEPerceiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EPerceiveLink <em>EPerceive Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EPerceiveLink
	 * @generated
	 */
	public Adapter createEPerceiveLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ERule <em>ERule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ERule
	 * @generated
	 */
	public Adapter createERuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.ERuleLink <em>ERule Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.ERuleLink
	 * @generated
	 */
	public Adapter createERuleLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EEquation <em>EEquation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EEquation
	 * @generated
	 */
	public Adapter createEEquationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gama.EEquationLink <em>EEquation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gama.EEquationLink
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
