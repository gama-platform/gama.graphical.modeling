/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.util;

import gama.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gama.GamaPackage
 * @generated
 */
public class GamaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamaSwitch() {
		if (modelPackage == null) {
			modelPackage = GamaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GamaPackage.EGAMA_MODEL: {
				EGamaModel eGamaModel = (EGamaModel)theEObject;
				T result = caseEGamaModel(eGamaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EGAMA_OBJECT: {
				EGamaObject eGamaObject = (EGamaObject)theEObject;
				T result = caseEGamaObject(eGamaObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ESPECIES: {
				ESpecies eSpecies = (ESpecies)theEObject;
				T result = caseESpecies(eSpecies);
				if (result == null) result = caseEGamaObject(eSpecies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EACTION: {
				EAction eAction = (EAction)theEObject;
				T result = caseEAction(eAction);
				if (result == null) result = caseEGamaObject(eAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EASPECT: {
				EAspect eAspect = (EAspect)theEObject;
				T result = caseEAspect(eAspect);
				if (result == null) result = caseEGamaObject(eAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EREFLEX: {
				EReflex eReflex = (EReflex)theEObject;
				T result = caseEReflex(eReflex);
				if (result == null) result = caseEGamaObject(eReflex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EEXPERIMENT: {
				EExperiment eExperiment = (EExperiment)theEObject;
				T result = caseEExperiment(eExperiment);
				if (result == null) result = caseESpecies(eExperiment);
				if (result == null) result = caseEGamaObject(eExperiment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EGUI_EXPERIMENT: {
				EGUIExperiment eguiExperiment = (EGUIExperiment)theEObject;
				T result = caseEGUIExperiment(eguiExperiment);
				if (result == null) result = caseEExperiment(eguiExperiment);
				if (result == null) result = caseESpecies(eguiExperiment);
				if (result == null) result = caseEGamaObject(eguiExperiment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EBATCH_EXPERIMENT: {
				EBatchExperiment eBatchExperiment = (EBatchExperiment)theEObject;
				T result = caseEBatchExperiment(eBatchExperiment);
				if (result == null) result = caseEExperiment(eBatchExperiment);
				if (result == null) result = caseESpecies(eBatchExperiment);
				if (result == null) result = caseEGamaObject(eBatchExperiment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EGAMA_LINK: {
				EGamaLink eGamaLink = (EGamaLink)theEObject;
				T result = caseEGamaLink(eGamaLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ESUB_SPECIES_LINK: {
				ESubSpeciesLink eSubSpeciesLink = (ESubSpeciesLink)theEObject;
				T result = caseESubSpeciesLink(eSubSpeciesLink);
				if (result == null) result = caseEGamaLink(eSubSpeciesLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EACTION_LINK: {
				EActionLink eActionLink = (EActionLink)theEObject;
				T result = caseEActionLink(eActionLink);
				if (result == null) result = caseEGamaLink(eActionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EASPECT_LINK: {
				EAspectLink eAspectLink = (EAspectLink)theEObject;
				T result = caseEAspectLink(eAspectLink);
				if (result == null) result = caseEGamaLink(eAspectLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EREFLEX_LINK: {
				EReflexLink eReflexLink = (EReflexLink)theEObject;
				T result = caseEReflexLink(eReflexLink);
				if (result == null) result = caseEGamaLink(eReflexLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EDISPLAY_LINK: {
				EDisplayLink eDisplayLink = (EDisplayLink)theEObject;
				T result = caseEDisplayLink(eDisplayLink);
				if (result == null) result = caseEGamaLink(eDisplayLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EDISPLAY: {
				EDisplay eDisplay = (EDisplay)theEObject;
				T result = caseEDisplay(eDisplay);
				if (result == null) result = caseEGamaObject(eDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EVARIABLE: {
				EVariable eVariable = (EVariable)theEObject;
				T result = caseEVariable(eVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EWORLD_AGENT: {
				EWorldAgent eWorldAgent = (EWorldAgent)theEObject;
				T result = caseEWorldAgent(eWorldAgent);
				if (result == null) result = caseESpecies(eWorldAgent);
				if (result == null) result = caseEGamaObject(eWorldAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ELAYER: {
				ELayer eLayer = (ELayer)theEObject;
				T result = caseELayer(eLayer);
				if (result == null) result = caseEGamaObject(eLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EEXPERIMENT_LINK: {
				EExperimentLink eExperimentLink = (EExperimentLink)theEObject;
				T result = caseEExperimentLink(eExperimentLink);
				if (result == null) result = caseEGamaLink(eExperimentLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ELAYER_ASPECT: {
				ELayerAspect eLayerAspect = (ELayerAspect)theEObject;
				T result = caseELayerAspect(eLayerAspect);
				if (result == null) result = caseEGamaObject(eLayerAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EINHERIT_LINK: {
				EInheritLink eInheritLink = (EInheritLink)theEObject;
				T result = caseEInheritLink(eInheritLink);
				if (result == null) result = caseEGamaLink(eInheritLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ECHART_LAYER: {
				EChartLayer eChartLayer = (EChartLayer)theEObject;
				T result = caseEChartLayer(eChartLayer);
				if (result == null) result = caseEGamaObject(eChartLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EPARAMETER: {
				EParameter eParameter = (EParameter)theEObject;
				T result = caseEParameter(eParameter);
				if (result == null) result = caseEGamaObject(eParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EMONITOR: {
				EMonitor eMonitor = (EMonitor)theEObject;
				T result = caseEMonitor(eMonitor);
				if (result == null) result = caseEGamaObject(eMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EFACET: {
				EFacet eFacet = (EFacet)theEObject;
				T result = caseEFacet(eFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EPLAN: {
				EPlan ePlan = (EPlan)theEObject;
				T result = caseEPlan(ePlan);
				if (result == null) result = caseEGamaObject(ePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ESTATE: {
				EState eState = (EState)theEObject;
				T result = caseEState(eState);
				if (result == null) result = caseEGamaObject(eState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ETASK: {
				ETask eTask = (ETask)theEObject;
				T result = caseETask(eTask);
				if (result == null) result = caseEGamaObject(eTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EPLAN_LINK: {
				EPlanLink ePlanLink = (EPlanLink)theEObject;
				T result = caseEPlanLink(ePlanLink);
				if (result == null) result = caseEGamaLink(ePlanLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ESTATE_LINK: {
				EStateLink eStateLink = (EStateLink)theEObject;
				T result = caseEStateLink(eStateLink);
				if (result == null) result = caseEGamaLink(eStateLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ETASK_LINK: {
				ETaskLink eTaskLink = (ETaskLink)theEObject;
				T result = caseETaskLink(eTaskLink);
				if (result == null) result = caseEGamaLink(eTaskLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EGRID: {
				EGrid eGrid = (EGrid)theEObject;
				T result = caseEGrid(eGrid);
				if (result == null) result = caseESpecies(eGrid);
				if (result == null) result = caseEGamaObject(eGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EPERCEIVE: {
				EPerceive ePerceive = (EPerceive)theEObject;
				T result = caseEPerceive(ePerceive);
				if (result == null) result = caseEGamaObject(ePerceive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EPERCEIVE_LINK: {
				EPerceiveLink ePerceiveLink = (EPerceiveLink)theEObject;
				T result = caseEPerceiveLink(ePerceiveLink);
				if (result == null) result = caseEGamaLink(ePerceiveLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ERULE: {
				ERule eRule = (ERule)theEObject;
				T result = caseERule(eRule);
				if (result == null) result = caseEGamaObject(eRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.ERULE_LINK: {
				ERuleLink eRuleLink = (ERuleLink)theEObject;
				T result = caseERuleLink(eRuleLink);
				if (result == null) result = caseEGamaLink(eRuleLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EEQUATION: {
				EEquation eEquation = (EEquation)theEObject;
				T result = caseEEquation(eEquation);
				if (result == null) result = caseEGamaObject(eEquation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamaPackage.EEQUATION_LINK: {
				EEquationLink eEquationLink = (EEquationLink)theEObject;
				T result = caseEEquationLink(eEquationLink);
				if (result == null) result = caseEGamaLink(eEquationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGama Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGama Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGamaModel(EGamaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGama Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGama Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGamaObject(EGamaObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESpecies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESpecies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESpecies(ESpecies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAction(EAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAspect(EAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReflex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReflex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReflex(EReflex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EExperiment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EExperiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEExperiment(EExperiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGUI Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGUI Experiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGUIExperiment(EGUIExperiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EBatch Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EBatch Experiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEBatchExperiment(EBatchExperiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGama Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGama Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGamaLink(EGamaLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESub Species Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESub Species Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESubSpeciesLink(ESubSpeciesLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAction Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAction Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEActionLink(EActionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAspect Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAspect Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAspectLink(EAspectLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReflex Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReflex Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReflexLink(EReflexLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDisplay Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDisplay Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDisplayLink(EDisplayLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDisplay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDisplay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDisplay(EDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EVariable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EVariable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEVariable(EVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EWorld Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EWorld Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEWorldAgent(EWorldAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELayer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELayer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELayer(ELayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EExperiment Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EExperiment Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEExperimentLink(EExperimentLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELayer Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELayer Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELayerAspect(ELayerAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EInherit Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EInherit Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEInheritLink(EInheritLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EChart Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EChart Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEChartLayer(EChartLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEParameter(EParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMonitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMonitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMonitor(EMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFacet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFacet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFacet(EFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPlan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPlan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPlan(EPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EState</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EState</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEState(EState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETask(ETask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPlan Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPlan Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPlanLink(EPlanLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EState Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EState Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStateLink(EStateLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETask Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETask Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETaskLink(ETaskLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGrid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGrid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGrid(EGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPerceive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPerceive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPerceive(EPerceive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPerceive Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPerceive Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPerceiveLink(EPerceiveLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERule(ERule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERule Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERule Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERuleLink(ERuleLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEquation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEquation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEquation(EEquation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEquation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEquation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEquationLink(EEquationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GamaSwitch
