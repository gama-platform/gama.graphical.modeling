/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.impl;

import gama.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamaFactoryImpl extends EFactoryImpl implements GamaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GamaFactory init() {
		try {
			GamaFactory theGamaFactory = (GamaFactory)EPackage.Registry.INSTANCE.getEFactory(GamaPackage.eNS_URI);
			if (theGamaFactory != null) {
				return theGamaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GamaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GamaPackage.EGAMA_MODEL: return createEGamaModel();
			case GamaPackage.EGAMA_OBJECT: return createEGamaObject();
			case GamaPackage.ESPECIES: return createESpecies();
			case GamaPackage.EACTION: return createEAction();
			case GamaPackage.EASPECT: return createEAspect();
			case GamaPackage.EREFLEX: return createEReflex();
			case GamaPackage.EEXPERIMENT: return createEExperiment();
			case GamaPackage.EGUI_EXPERIMENT: return createEGUIExperiment();
			case GamaPackage.EBATCH_EXPERIMENT: return createEBatchExperiment();
			case GamaPackage.EGAMA_LINK: return createEGamaLink();
			case GamaPackage.ESUB_SPECIES_LINK: return createESubSpeciesLink();
			case GamaPackage.EACTION_LINK: return createEActionLink();
			case GamaPackage.EASPECT_LINK: return createEAspectLink();
			case GamaPackage.EREFLEX_LINK: return createEReflexLink();
			case GamaPackage.EDISPLAY_LINK: return createEDisplayLink();
			case GamaPackage.EDISPLAY: return createEDisplay();
			case GamaPackage.EVARIABLE: return createEVariable();
			case GamaPackage.EWORLD_AGENT: return createEWorldAgent();
			case GamaPackage.ELAYER: return createELayer();
			case GamaPackage.EEXPERIMENT_LINK: return createEExperimentLink();
			case GamaPackage.ELAYER_ASPECT: return createELayerAspect();
			case GamaPackage.EINHERIT_LINK: return createEInheritLink();
			case GamaPackage.ECHART_LAYER: return createEChartLayer();
			case GamaPackage.EPARAMETER: return createEParameter();
			case GamaPackage.EMONITOR: return createEMonitor();
			case GamaPackage.EFACET: return createEFacet();
			case GamaPackage.EPLAN: return createEPlan();
			case GamaPackage.ESTATE: return createEState();
			case GamaPackage.ETASK: return createETask();
			case GamaPackage.EPLAN_LINK: return createEPlanLink();
			case GamaPackage.ESTATE_LINK: return createEStateLink();
			case GamaPackage.ETASK_LINK: return createETaskLink();
			case GamaPackage.EGRID: return createEGrid();
			case GamaPackage.EPERCEIVE: return createEPerceive();
			case GamaPackage.EPERCEIVE_LINK: return createEPerceiveLink();
			case GamaPackage.ERULE: return createERule();
			case GamaPackage.ERULE_LINK: return createERuleLink();
			case GamaPackage.EEQUATION: return createEEquation();
			case GamaPackage.EEQUATION_LINK: return createEEquationLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGamaModel createEGamaModel() {
		EGamaModelImpl eGamaModel = new EGamaModelImpl();
		return eGamaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGamaObject createEGamaObject() {
		EGamaObjectImpl eGamaObject = new EGamaObjectImpl();
		return eGamaObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESpecies createESpecies() {
		ESpeciesImpl eSpecies = new ESpeciesImpl();
		return eSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAction createEAction() {
		EActionImpl eAction = new EActionImpl();
		return eAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAspect createEAspect() {
		EAspectImpl eAspect = new EAspectImpl();
		return eAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReflex createEReflex() {
		EReflexImpl eReflex = new EReflexImpl();
		return eReflex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EExperiment createEExperiment() {
		EExperimentImpl eExperiment = new EExperimentImpl();
		return eExperiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGUIExperiment createEGUIExperiment() {
		EGUIExperimentImpl eguiExperiment = new EGUIExperimentImpl();
		return eguiExperiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBatchExperiment createEBatchExperiment() {
		EBatchExperimentImpl eBatchExperiment = new EBatchExperimentImpl();
		return eBatchExperiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGamaLink createEGamaLink() {
		EGamaLinkImpl eGamaLink = new EGamaLinkImpl();
		return eGamaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESubSpeciesLink createESubSpeciesLink() {
		ESubSpeciesLinkImpl eSubSpeciesLink = new ESubSpeciesLinkImpl();
		return eSubSpeciesLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EActionLink createEActionLink() {
		EActionLinkImpl eActionLink = new EActionLinkImpl();
		return eActionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAspectLink createEAspectLink() {
		EAspectLinkImpl eAspectLink = new EAspectLinkImpl();
		return eAspectLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReflexLink createEReflexLink() {
		EReflexLinkImpl eReflexLink = new EReflexLinkImpl();
		return eReflexLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDisplayLink createEDisplayLink() {
		EDisplayLinkImpl eDisplayLink = new EDisplayLinkImpl();
		return eDisplayLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDisplay createEDisplay() {
		EDisplayImpl eDisplay = new EDisplayImpl();
		return eDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVariable createEVariable() {
		EVariableImpl eVariable = new EVariableImpl();
		return eVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EWorldAgent createEWorldAgent() {
		EWorldAgentImpl eWorldAgent = new EWorldAgentImpl();
		return eWorldAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELayer createELayer() {
		ELayerImpl eLayer = new ELayerImpl();
		return eLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EExperimentLink createEExperimentLink() {
		EExperimentLinkImpl eExperimentLink = new EExperimentLinkImpl();
		return eExperimentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELayerAspect createELayerAspect() {
		ELayerAspectImpl eLayerAspect = new ELayerAspectImpl();
		return eLayerAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInheritLink createEInheritLink() {
		EInheritLinkImpl eInheritLink = new EInheritLinkImpl();
		return eInheritLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EChartLayer createEChartLayer() {
		EChartLayerImpl eChartLayer = new EChartLayerImpl();
		return eChartLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter createEParameter() {
		EParameterImpl eParameter = new EParameterImpl();
		return eParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMonitor createEMonitor() {
		EMonitorImpl eMonitor = new EMonitorImpl();
		return eMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFacet createEFacet() {
		EFacetImpl eFacet = new EFacetImpl();
		return eFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPlan createEPlan() {
		EPlanImpl ePlan = new EPlanImpl();
		return ePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EState createEState() {
		EStateImpl eState = new EStateImpl();
		return eState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETask createETask() {
		ETaskImpl eTask = new ETaskImpl();
		return eTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPlanLink createEPlanLink() {
		EPlanLinkImpl ePlanLink = new EPlanLinkImpl();
		return ePlanLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStateLink createEStateLink() {
		EStateLinkImpl eStateLink = new EStateLinkImpl();
		return eStateLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETaskLink createETaskLink() {
		ETaskLinkImpl eTaskLink = new ETaskLinkImpl();
		return eTaskLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGrid createEGrid() {
		EGridImpl eGrid = new EGridImpl();
		return eGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPerceive createEPerceive() {
		EPerceiveImpl ePerceive = new EPerceiveImpl();
		return ePerceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPerceiveLink createEPerceiveLink() {
		EPerceiveLinkImpl ePerceiveLink = new EPerceiveLinkImpl();
		return ePerceiveLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERule createERule() {
		ERuleImpl eRule = new ERuleImpl();
		return eRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERuleLink createERuleLink() {
		ERuleLinkImpl eRuleLink = new ERuleLinkImpl();
		return eRuleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEquation createEEquation() {
		EEquationImpl eEquation = new EEquationImpl();
		return eEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEquationLink createEEquationLink() {
		EEquationLinkImpl eEquationLink = new EEquationLinkImpl();
		return eEquationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamaPackage getGamaPackage() {
		return (GamaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GamaPackage getPackage() {
		return GamaPackage.eINSTANCE;
	}

} //GamaFactoryImpl
