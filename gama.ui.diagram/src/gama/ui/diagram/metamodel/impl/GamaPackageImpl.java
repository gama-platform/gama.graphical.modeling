/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.ui.diagram.metamodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import gama.ui.diagram.metamodel.EAction;
import gama.ui.diagram.metamodel.EActionLink;
import gama.ui.diagram.metamodel.EAspect;
import gama.ui.diagram.metamodel.EAspectLink;
import gama.ui.diagram.metamodel.EBatchExperiment;
import gama.ui.diagram.metamodel.EChartLayer;
import gama.ui.diagram.metamodel.EContinuousTopology;
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
import gama.ui.diagram.metamodel.EGraphLink;
import gama.ui.diagram.metamodel.EGraphTopologyEdge;
import gama.ui.diagram.metamodel.EGraphTopologyNode;
import gama.ui.diagram.metamodel.EGrid;
import gama.ui.diagram.metamodel.EGridTopology;
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
import gama.ui.diagram.metamodel.ETopology;
import gama.ui.diagram.metamodel.EVariable;
import gama.ui.diagram.metamodel.EWorldAgent;
import gama.ui.diagram.metamodel.GamaFactory;
import gama.ui.diagram.metamodel.GamaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamaPackageImpl extends EPackageImpl implements GamaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGamaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGamaObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSpeciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReflexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eExperimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eguiExperimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBatchExperimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGamaLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSubSpeciesLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eActionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAspectLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReflexLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDisplayLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDisplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eWorldAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eExperimentLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLayerAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eInheritLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eChartLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eMonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePlanLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStateLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTaskLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePerceiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePerceiveLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRuleLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEquationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEquationLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gama.ui.diagram.metamodel.GamaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GamaPackageImpl() {
		super(eNS_URI, GamaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GamaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GamaPackage init() {
		if (isInited) return (GamaPackage)EPackage.Registry.INSTANCE.getEPackage(GamaPackage.eNS_URI);

		// Obtain or create and register package
		GamaPackageImpl theGamaPackage = (GamaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GamaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GamaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGamaPackage.createPackageContents();

		// Initialize created meta-data
		theGamaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGamaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GamaPackage.eNS_URI, theGamaPackage);
		return theGamaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGamaModel() {
		return eGamaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGamaModel_Objects() {
		return (EReference)eGamaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGamaModel_Name() {
		return (EAttribute)eGamaModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGamaModel_Links() {
		return (EReference)eGamaModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGamaObject() {
		return eGamaObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGamaObject_Name() {
		return (EAttribute)eGamaObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGamaObject_Model() {
		return (EReference)eGamaObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGamaObject_ColorPicto() {
		return (EAttribute)eGamaObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGamaObject_HasError() {
		return (EAttribute)eGamaObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGamaObject_Error() {
		return (EAttribute)eGamaObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGamaObject_Facets() {
		return (EReference)eGamaObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESpecies() {
		return eSpeciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_Variables() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESpecies_ReflexList() {
		return (EAttribute)eSpeciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_ExperimentLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_AspectLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_ActionLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_ReflexLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_MicroSpeciesLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_MacroSpeciesLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESpecies_Skills() {
		return (EAttribute)eSpeciesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_InheritsFrom() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESpecies_Init() {
		return (EAttribute)eSpeciesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_InheritingLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_PlanLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_StateLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_TaskLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_PerceiveLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_RuleLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESpecies_EquationLinks() {
		return (EReference)eSpeciesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAction() {
		return eActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAction_GamlCode() {
		return (EAttribute)eActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAction_ActionLinks() {
		return (EReference)eActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAction_Variables() {
		return (EReference)eActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAction_ReturnType() {
		return (EAttribute)eActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAspect() {
		return eAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAspect_GamlCode() {
		return (EAttribute)eAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAspect_AspectLinks() {
		return (EReference)eAspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAspect_Layers() {
		return (EReference)eAspectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAspect_DefineGamlCode() {
		return (EAttribute)eAspectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReflex() {
		return eReflexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReflex_GamlCode() {
		return (EAttribute)eReflexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReflex_ReflexLinks() {
		return (EReference)eReflexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEExperiment() {
		return eExperimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEExperiment_ExperimentLink() {
		return (EReference)eExperimentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEExperiment_DisplayLinks() {
		return (EReference)eExperimentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEExperiment_Parameters() {
		return (EReference)eExperimentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEExperiment_Monitors() {
		return (EReference)eExperimentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGUIExperiment() {
		return eguiExperimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEBatchExperiment() {
		return eBatchExperimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGamaLink() {
		return eGamaLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGamaLink_Target() {
		return (EReference)eGamaLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGamaLink_Source() {
		return (EReference)eGamaLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGamaLink_Model() {
		return (EReference)eGamaLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESubSpeciesLink() {
		return eSubSpeciesLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESubSpeciesLink_Macro() {
		return (EReference)eSubSpeciesLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESubSpeciesLink_Micro() {
		return (EReference)eSubSpeciesLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEActionLink() {
		return eActionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEActionLink_Action() {
		return (EReference)eActionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEActionLink_Species() {
		return (EReference)eActionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAspectLink() {
		return eAspectLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAspectLink_Aspect() {
		return (EReference)eAspectLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAspectLink_Species() {
		return (EReference)eAspectLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReflexLink() {
		return eReflexLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReflexLink_Reflex() {
		return (EReference)eReflexLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReflexLink_Species() {
		return (EReference)eReflexLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDisplayLink() {
		return eDisplayLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDisplayLink_Experiment() {
		return (EReference)eDisplayLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDisplayLink_Display() {
		return (EReference)eDisplayLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDisplay() {
		return eDisplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDisplay_Layers() {
		return (EReference)eDisplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDisplay_DisplayLink() {
		return (EReference)eDisplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDisplay_LayerList() {
		return (EAttribute)eDisplayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDisplay_GamlCode() {
		return (EAttribute)eDisplayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDisplay_DefineGamlCode() {
		return (EAttribute)eDisplayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEVariable() {
		return eVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVariable_Init() {
		return (EAttribute)eVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVariable_Min() {
		return (EAttribute)eVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVariable_Max() {
		return (EAttribute)eVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVariable_Update() {
		return (EAttribute)eVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVariable_Function() {
		return (EAttribute)eVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVariable_Type() {
		return (EAttribute)eVariableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVariable_Name() {
		return (EAttribute)eVariableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVariable_HasError() {
		return (EAttribute)eVariableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVariable_Error() {
		return (EAttribute)eVariableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEVariable_Owner() {
		return (EReference)eVariableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEWorldAgent() {
		return eWorldAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELayer() {
		return eLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_GamlCode() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELayer_Display() {
		return (EReference)eLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_Type() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_File() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_Text() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_Size() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_Species() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_Agents() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_Aspect() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_Color() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_IsColorCst() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_ColorRBG() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_Grid() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELayer_Chartlayers() {
		return (EReference)eLayerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_Chart_type() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayer_ShowLines() {
		return (EAttribute)eLayerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEExperimentLink() {
		return eExperimentLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEExperimentLink_Species() {
		return (EReference)eExperimentLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEExperimentLink_Experiment() {
		return (EReference)eExperimentLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELayerAspect() {
		return eLayerAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_GamlCode() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Shape() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Color() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Empty() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Rotate() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Size() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Width() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Heigth() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Radius() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Path() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Text() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Type() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Expression() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Points() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_At() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_ShapeType() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_IsColorCst() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_TextSize() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_ImageSize() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_ColorRBG() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELayerAspect_Aspect() {
		return (EReference)eLayerAspectEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Depth() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELayerAspect_Texture() {
		return (EAttribute)eLayerAspectEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEInheritLink() {
		return eInheritLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEInheritLink_Parent() {
		return (EReference)eInheritLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEInheritLink_Child() {
		return (EReference)eInheritLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEChartLayer() {
		return eChartLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEChartLayer_Style() {
		return (EAttribute)eChartLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEChartLayer_Color() {
		return (EAttribute)eChartLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEChartLayer_Value() {
		return (EAttribute)eChartLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEParameter() {
		return eParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEParameter_Variable() {
		return (EAttribute)eParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEParameter_Min() {
		return (EAttribute)eParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEParameter_Init() {
		return (EAttribute)eParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEParameter_Step() {
		return (EAttribute)eParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEParameter_Max() {
		return (EAttribute)eParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEParameter_Among() {
		return (EAttribute)eParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEParameter_Category() {
		return (EAttribute)eParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMonitor() {
		return eMonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMonitor_Value() {
		return (EAttribute)eMonitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFacet() {
		return eFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEFacet_Name() {
		return (EAttribute)eFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFacet_Owner() {
		return (EReference)eFacetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEFacet_Value() {
		return (EAttribute)eFacetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPlan() {
		return ePlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPlan_GamlCode() {
		return (EAttribute)ePlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPlan_PlanLinks() {
		return (EReference)ePlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEState() {
		return eStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEState_GamlCode() {
		return (EAttribute)eStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEState_StateLinks() {
		return (EReference)eStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETask() {
		return eTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETask_GamlCode() {
		return (EAttribute)eTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETask_TaskLinks() {
		return (EReference)eTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPlanLink() {
		return ePlanLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPlanLink_Plan() {
		return (EReference)ePlanLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPlanLink_Species() {
		return (EReference)ePlanLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStateLink() {
		return eStateLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStateLink_State() {
		return (EReference)eStateLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStateLink_Species() {
		return (EReference)eStateLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETaskLink() {
		return eTaskLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETaskLink_Task() {
		return (EReference)eTaskLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETaskLink_Species() {
		return (EReference)eTaskLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGrid() {
		return eGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPerceive() {
		return ePerceiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPerceive_GamlCode() {
		return (EAttribute)ePerceiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPerceive_PerceiveLinks() {
		return (EReference)ePerceiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPerceiveLink() {
		return ePerceiveLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPerceiveLink_Perceive() {
		return (EReference)ePerceiveLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPerceiveLink_Species() {
		return (EReference)ePerceiveLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERule() {
		return eRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERule_GamlCode() {
		return (EAttribute)eRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERule_RuleLinks() {
		return (EReference)eRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERuleLink() {
		return eRuleLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERuleLink_Rule() {
		return (EReference)eRuleLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERuleLink_Species() {
		return (EReference)eRuleLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEquation() {
		return eEquationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEquation_GamlCode() {
		return (EAttribute)eEquationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEquation_EquationLinks() {
		return (EReference)eEquationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEquationLink() {
		return eEquationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEquationLink_Equation() {
		return (EReference)eEquationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEquationLink_Species() {
		return (EReference)eEquationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamaFactory getGamaFactory() {
		return (GamaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eGamaModelEClass = createEClass(EGAMA_MODEL);
		createEReference(eGamaModelEClass, EGAMA_MODEL__OBJECTS);
		createEAttribute(eGamaModelEClass, EGAMA_MODEL__NAME);
		createEReference(eGamaModelEClass, EGAMA_MODEL__LINKS);

		eGamaObjectEClass = createEClass(EGAMA_OBJECT);
		createEAttribute(eGamaObjectEClass, EGAMA_OBJECT__NAME);
		createEReference(eGamaObjectEClass, EGAMA_OBJECT__MODEL);
		createEAttribute(eGamaObjectEClass, EGAMA_OBJECT__COLOR_PICTO);
		createEAttribute(eGamaObjectEClass, EGAMA_OBJECT__HAS_ERROR);
		createEAttribute(eGamaObjectEClass, EGAMA_OBJECT__ERROR);
		createEReference(eGamaObjectEClass, EGAMA_OBJECT__FACETS);

		eSpeciesEClass = createEClass(ESPECIES);
		createEReference(eSpeciesEClass, ESPECIES__VARIABLES);
		createEAttribute(eSpeciesEClass, ESPECIES__REFLEX_LIST);
		createEReference(eSpeciesEClass, ESPECIES__EXPERIMENT_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__ASPECT_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__ACTION_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__REFLEX_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__MICRO_SPECIES_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__MACRO_SPECIES_LINKS);
		createEAttribute(eSpeciesEClass, ESPECIES__SKILLS);
		createEReference(eSpeciesEClass, ESPECIES__INHERITS_FROM);
		createEAttribute(eSpeciesEClass, ESPECIES__INIT);
		createEReference(eSpeciesEClass, ESPECIES__INHERITING_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__PLAN_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__STATE_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__TASK_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__PERCEIVE_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__RULE_LINKS);
		createEReference(eSpeciesEClass, ESPECIES__EQUATION_LINKS);

		eActionEClass = createEClass(EACTION);
		createEAttribute(eActionEClass, EACTION__GAML_CODE);
		createEReference(eActionEClass, EACTION__ACTION_LINKS);
		createEReference(eActionEClass, EACTION__VARIABLES);
		createEAttribute(eActionEClass, EACTION__RETURN_TYPE);

		eAspectEClass = createEClass(EASPECT);
		createEAttribute(eAspectEClass, EASPECT__GAML_CODE);
		createEReference(eAspectEClass, EASPECT__ASPECT_LINKS);
		createEReference(eAspectEClass, EASPECT__LAYERS);
		createEAttribute(eAspectEClass, EASPECT__DEFINE_GAML_CODE);

		eReflexEClass = createEClass(EREFLEX);
		createEAttribute(eReflexEClass, EREFLEX__GAML_CODE);
		createEReference(eReflexEClass, EREFLEX__REFLEX_LINKS);

		eExperimentEClass = createEClass(EEXPERIMENT);
		createEReference(eExperimentEClass, EEXPERIMENT__EXPERIMENT_LINK);
		createEReference(eExperimentEClass, EEXPERIMENT__DISPLAY_LINKS);
		createEReference(eExperimentEClass, EEXPERIMENT__PARAMETERS);
		createEReference(eExperimentEClass, EEXPERIMENT__MONITORS);

		eguiExperimentEClass = createEClass(EGUI_EXPERIMENT);

		eBatchExperimentEClass = createEClass(EBATCH_EXPERIMENT);

		eGamaLinkEClass = createEClass(EGAMA_LINK);
		createEReference(eGamaLinkEClass, EGAMA_LINK__TARGET);
		createEReference(eGamaLinkEClass, EGAMA_LINK__SOURCE);
		createEReference(eGamaLinkEClass, EGAMA_LINK__MODEL);

		eSubSpeciesLinkEClass = createEClass(ESUB_SPECIES_LINK);
		createEReference(eSubSpeciesLinkEClass, ESUB_SPECIES_LINK__MACRO);
		createEReference(eSubSpeciesLinkEClass, ESUB_SPECIES_LINK__MICRO);

		eActionLinkEClass = createEClass(EACTION_LINK);
		createEReference(eActionLinkEClass, EACTION_LINK__ACTION);
		createEReference(eActionLinkEClass, EACTION_LINK__SPECIES);

		eAspectLinkEClass = createEClass(EASPECT_LINK);
		createEReference(eAspectLinkEClass, EASPECT_LINK__ASPECT);
		createEReference(eAspectLinkEClass, EASPECT_LINK__SPECIES);

		eReflexLinkEClass = createEClass(EREFLEX_LINK);
		createEReference(eReflexLinkEClass, EREFLEX_LINK__REFLEX);
		createEReference(eReflexLinkEClass, EREFLEX_LINK__SPECIES);

		eDisplayLinkEClass = createEClass(EDISPLAY_LINK);
		createEReference(eDisplayLinkEClass, EDISPLAY_LINK__EXPERIMENT);
		createEReference(eDisplayLinkEClass, EDISPLAY_LINK__DISPLAY);

		eDisplayEClass = createEClass(EDISPLAY);
		createEReference(eDisplayEClass, EDISPLAY__LAYERS);
		createEReference(eDisplayEClass, EDISPLAY__DISPLAY_LINK);
		createEAttribute(eDisplayEClass, EDISPLAY__LAYER_LIST);
		createEAttribute(eDisplayEClass, EDISPLAY__GAML_CODE);
		createEAttribute(eDisplayEClass, EDISPLAY__DEFINE_GAML_CODE);

		eVariableEClass = createEClass(EVARIABLE);
		createEAttribute(eVariableEClass, EVARIABLE__INIT);
		createEAttribute(eVariableEClass, EVARIABLE__MIN);
		createEAttribute(eVariableEClass, EVARIABLE__MAX);
		createEAttribute(eVariableEClass, EVARIABLE__UPDATE);
		createEAttribute(eVariableEClass, EVARIABLE__FUNCTION);
		createEAttribute(eVariableEClass, EVARIABLE__TYPE);
		createEAttribute(eVariableEClass, EVARIABLE__NAME);
		createEAttribute(eVariableEClass, EVARIABLE__HAS_ERROR);
		createEAttribute(eVariableEClass, EVARIABLE__ERROR);
		createEReference(eVariableEClass, EVARIABLE__OWNER);

		eWorldAgentEClass = createEClass(EWORLD_AGENT);

		eLayerEClass = createEClass(ELAYER);
		createEAttribute(eLayerEClass, ELAYER__GAML_CODE);
		createEReference(eLayerEClass, ELAYER__DISPLAY);
		createEAttribute(eLayerEClass, ELAYER__TYPE);
		createEAttribute(eLayerEClass, ELAYER__FILE);
		createEAttribute(eLayerEClass, ELAYER__TEXT);
		createEAttribute(eLayerEClass, ELAYER__SIZE);
		createEAttribute(eLayerEClass, ELAYER__SPECIES);
		createEAttribute(eLayerEClass, ELAYER__AGENTS);
		createEAttribute(eLayerEClass, ELAYER__ASPECT);
		createEAttribute(eLayerEClass, ELAYER__COLOR);
		createEAttribute(eLayerEClass, ELAYER__IS_COLOR_CST);
		createEAttribute(eLayerEClass, ELAYER__COLOR_RBG);
		createEAttribute(eLayerEClass, ELAYER__GRID);
		createEReference(eLayerEClass, ELAYER__CHARTLAYERS);
		createEAttribute(eLayerEClass, ELAYER__CHART_TYPE);
		createEAttribute(eLayerEClass, ELAYER__SHOW_LINES);

		eExperimentLinkEClass = createEClass(EEXPERIMENT_LINK);
		createEReference(eExperimentLinkEClass, EEXPERIMENT_LINK__SPECIES);
		createEReference(eExperimentLinkEClass, EEXPERIMENT_LINK__EXPERIMENT);

		eLayerAspectEClass = createEClass(ELAYER_ASPECT);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__GAML_CODE);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__SHAPE);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__COLOR);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__EMPTY);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__ROTATE);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__SIZE);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__WIDTH);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__HEIGTH);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__RADIUS);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__PATH);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__TEXT);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__TYPE);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__EXPRESSION);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__POINTS);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__AT);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__SHAPE_TYPE);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__IS_COLOR_CST);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__TEXT_SIZE);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__IMAGE_SIZE);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__COLOR_RBG);
		createEReference(eLayerAspectEClass, ELAYER_ASPECT__ASPECT);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__DEPTH);
		createEAttribute(eLayerAspectEClass, ELAYER_ASPECT__TEXTURE);

		eInheritLinkEClass = createEClass(EINHERIT_LINK);
		createEReference(eInheritLinkEClass, EINHERIT_LINK__PARENT);
		createEReference(eInheritLinkEClass, EINHERIT_LINK__CHILD);

		eChartLayerEClass = createEClass(ECHART_LAYER);
		createEAttribute(eChartLayerEClass, ECHART_LAYER__STYLE);
		createEAttribute(eChartLayerEClass, ECHART_LAYER__COLOR);
		createEAttribute(eChartLayerEClass, ECHART_LAYER__VALUE);

		eParameterEClass = createEClass(EPARAMETER);
		createEAttribute(eParameterEClass, EPARAMETER__VARIABLE);
		createEAttribute(eParameterEClass, EPARAMETER__MIN);
		createEAttribute(eParameterEClass, EPARAMETER__INIT);
		createEAttribute(eParameterEClass, EPARAMETER__STEP);
		createEAttribute(eParameterEClass, EPARAMETER__MAX);
		createEAttribute(eParameterEClass, EPARAMETER__AMONG);
		createEAttribute(eParameterEClass, EPARAMETER__CATEGORY);

		eMonitorEClass = createEClass(EMONITOR);
		createEAttribute(eMonitorEClass, EMONITOR__VALUE);

		eFacetEClass = createEClass(EFACET);
		createEAttribute(eFacetEClass, EFACET__NAME);
		createEReference(eFacetEClass, EFACET__OWNER);
		createEAttribute(eFacetEClass, EFACET__VALUE);

		ePlanEClass = createEClass(EPLAN);
		createEAttribute(ePlanEClass, EPLAN__GAML_CODE);
		createEReference(ePlanEClass, EPLAN__PLAN_LINKS);

		eStateEClass = createEClass(ESTATE);
		createEAttribute(eStateEClass, ESTATE__GAML_CODE);
		createEReference(eStateEClass, ESTATE__STATE_LINKS);

		eTaskEClass = createEClass(ETASK);
		createEAttribute(eTaskEClass, ETASK__GAML_CODE);
		createEReference(eTaskEClass, ETASK__TASK_LINKS);

		ePlanLinkEClass = createEClass(EPLAN_LINK);
		createEReference(ePlanLinkEClass, EPLAN_LINK__PLAN);
		createEReference(ePlanLinkEClass, EPLAN_LINK__SPECIES);

		eStateLinkEClass = createEClass(ESTATE_LINK);
		createEReference(eStateLinkEClass, ESTATE_LINK__STATE);
		createEReference(eStateLinkEClass, ESTATE_LINK__SPECIES);

		eTaskLinkEClass = createEClass(ETASK_LINK);
		createEReference(eTaskLinkEClass, ETASK_LINK__TASK);
		createEReference(eTaskLinkEClass, ETASK_LINK__SPECIES);

		eGridEClass = createEClass(EGRID);

		ePerceiveEClass = createEClass(EPERCEIVE);
		createEAttribute(ePerceiveEClass, EPERCEIVE__GAML_CODE);
		createEReference(ePerceiveEClass, EPERCEIVE__PERCEIVE_LINKS);

		ePerceiveLinkEClass = createEClass(EPERCEIVE_LINK);
		createEReference(ePerceiveLinkEClass, EPERCEIVE_LINK__PERCEIVE);
		createEReference(ePerceiveLinkEClass, EPERCEIVE_LINK__SPECIES);

		eRuleEClass = createEClass(ERULE);
		createEAttribute(eRuleEClass, ERULE__GAML_CODE);
		createEReference(eRuleEClass, ERULE__RULE_LINKS);

		eRuleLinkEClass = createEClass(ERULE_LINK);
		createEReference(eRuleLinkEClass, ERULE_LINK__RULE);
		createEReference(eRuleLinkEClass, ERULE_LINK__SPECIES);

		eEquationEClass = createEClass(EEQUATION);
		createEAttribute(eEquationEClass, EEQUATION__GAML_CODE);
		createEReference(eEquationEClass, EEQUATION__EQUATION_LINKS);

		eEquationLinkEClass = createEClass(EEQUATION_LINK);
		createEReference(eEquationLinkEClass, EEQUATION_LINK__EQUATION);
		createEReference(eEquationLinkEClass, EEQUATION_LINK__SPECIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eSpeciesEClass.getESuperTypes().add(this.getEGamaObject());
		eActionEClass.getESuperTypes().add(this.getEGamaObject());
		eAspectEClass.getESuperTypes().add(this.getEGamaObject());
		eReflexEClass.getESuperTypes().add(this.getEGamaObject());
		eExperimentEClass.getESuperTypes().add(this.getESpecies());
		eguiExperimentEClass.getESuperTypes().add(this.getEExperiment());
		eBatchExperimentEClass.getESuperTypes().add(this.getEExperiment());
		eSubSpeciesLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eActionLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eAspectLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eReflexLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eDisplayLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eDisplayEClass.getESuperTypes().add(this.getEGamaObject());
		eWorldAgentEClass.getESuperTypes().add(this.getESpecies());
		eLayerEClass.getESuperTypes().add(this.getEGamaObject());
		eExperimentLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eLayerAspectEClass.getESuperTypes().add(this.getEGamaObject());
		eInheritLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eChartLayerEClass.getESuperTypes().add(this.getEGamaObject());
		eParameterEClass.getESuperTypes().add(this.getEGamaObject());
		eMonitorEClass.getESuperTypes().add(this.getEGamaObject());
		ePlanEClass.getESuperTypes().add(this.getEGamaObject());
		eStateEClass.getESuperTypes().add(this.getEGamaObject());
		eTaskEClass.getESuperTypes().add(this.getEGamaObject());
		ePlanLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eStateLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eTaskLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eGridEClass.getESuperTypes().add(this.getESpecies());
		ePerceiveEClass.getESuperTypes().add(this.getEGamaObject());
		ePerceiveLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eRuleEClass.getESuperTypes().add(this.getEGamaObject());
		eRuleLinkEClass.getESuperTypes().add(this.getEGamaLink());
		eEquationEClass.getESuperTypes().add(this.getEGamaObject());
		eEquationLinkEClass.getESuperTypes().add(this.getEGamaLink());

		// Initialize classes and features; add operations and parameters
		initEClass(eGamaModelEClass, EGamaModel.class, "EGamaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEGamaModel_Objects(), this.getEGamaObject(), this.getEGamaObject_Model(), "objects", null, 0, -1, EGamaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEGamaModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, EGamaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGamaModel_Links(), this.getEGamaLink(), this.getEGamaLink_Model(), "links", null, 0, -1, EGamaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eGamaObjectEClass, EGamaObject.class, "EGamaObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEGamaObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, EGamaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGamaObject_Model(), this.getEGamaModel(), this.getEGamaModel_Objects(), "model", null, 1, 1, EGamaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEGamaObject_ColorPicto(), ecorePackage.getEIntegerObject(), "colorPicto", null, 0, 3, EGamaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEGamaObject_HasError(), ecorePackage.getEBooleanObject(), "hasError", "false", 0, 1, EGamaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEGamaObject_Error(), ecorePackage.getEString(), "error", null, 0, 1, EGamaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGamaObject_Facets(), this.getEFacet(), null, "facets", null, 0, -1, EGamaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eSpeciesEClass, ESpecies.class, "ESpecies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESpecies_Variables(), this.getEVariable(), null, "variables", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESpecies_ReflexList(), ecorePackage.getEString(), "reflexList", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_ExperimentLinks(), this.getEExperimentLink(), null, "experimentLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_AspectLinks(), this.getEAspectLink(), null, "aspectLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_ActionLinks(), this.getEActionLink(), null, "actionLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_ReflexLinks(), this.getEReflexLink(), null, "reflexLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_MicroSpeciesLinks(), this.getESubSpeciesLink(), null, "microSpeciesLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_MacroSpeciesLinks(), this.getESubSpeciesLink(), null, "macroSpeciesLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESpecies_Skills(), ecorePackage.getEString(), "skills", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_InheritsFrom(), this.getESpecies(), null, "inheritsFrom", null, 0, 1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESpecies_Init(), ecorePackage.getEString(), "init", null, 0, 1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_InheritingLinks(), this.getEInheritLink(), null, "inheritingLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_PlanLinks(), this.getEPlanLink(), null, "planLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_StateLinks(), this.getEStateLink(), null, "stateLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_TaskLinks(), this.getETaskLink(), null, "taskLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_PerceiveLinks(), this.getEPerceiveLink(), null, "perceiveLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_RuleLinks(), this.getERuleLink(), null, "ruleLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESpecies_EquationLinks(), this.getEEquationLink(), null, "equationLinks", null, 0, -1, ESpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eActionEClass, EAction.class, "EAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAction_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, EAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEAction_ActionLinks(), this.getEActionLink(), null, "actionLinks", null, 0, -1, EAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAction_Variables(), this.getEVariable(), null, "variables", null, 0, -1, EAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAction_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, EAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAspectEClass, EAspect.class, "EAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAspect_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, EAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEAspect_AspectLinks(), this.getEAspectLink(), null, "aspectLinks", null, 0, -1, EAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAspect_Layers(), this.getELayerAspect(), null, "layers", null, 0, -1, EAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAspect_DefineGamlCode(), ecorePackage.getEBoolean(), "defineGamlCode", null, 0, 1, EAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReflexEClass, EReflex.class, "EReflex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEReflex_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, EReflex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEReflex_ReflexLinks(), this.getEReflexLink(), null, "reflexLinks", null, 0, -1, EReflex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eExperimentEClass, EExperiment.class, "EExperiment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEExperiment_ExperimentLink(), this.getEExperimentLink(), null, "experimentLink", null, 0, 1, EExperiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEExperiment_DisplayLinks(), this.getEDisplayLink(), null, "displayLinks", null, 0, -1, EExperiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEExperiment_Parameters(), this.getEParameter(), null, "parameters", null, 0, -1, EExperiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEExperiment_Monitors(), this.getEMonitor(), null, "monitors", null, 0, -1, EExperiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eguiExperimentEClass, EGUIExperiment.class, "EGUIExperiment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eBatchExperimentEClass, EBatchExperiment.class, "EBatchExperiment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eGamaLinkEClass, EGamaLink.class, "EGamaLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEGamaLink_Target(), this.getEGamaObject(), null, "target", null, 1, 1, EGamaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGamaLink_Source(), this.getEGamaObject(), null, "source", null, 1, 1, EGamaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGamaLink_Model(), this.getEGamaModel(), this.getEGamaModel_Links(), "model", null, 1, 1, EGamaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eSubSpeciesLinkEClass, ESubSpeciesLink.class, "ESubSpeciesLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESubSpeciesLink_Macro(), this.getESpecies(), null, "macro", null, 0, 1, ESubSpeciesLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESubSpeciesLink_Micro(), this.getESpecies(), null, "micro", null, 0, 1, ESubSpeciesLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eActionLinkEClass, EActionLink.class, "EActionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEActionLink_Action(), this.getEAction(), null, "action", null, 0, 1, EActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEActionLink_Species(), this.getESpecies(), null, "species", null, 0, 1, EActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAspectLinkEClass, EAspectLink.class, "EAspectLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAspectLink_Aspect(), this.getEAspect(), null, "aspect", null, 0, 1, EAspectLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAspectLink_Species(), this.getESpecies(), null, "species", null, 0, 1, EAspectLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReflexLinkEClass, EReflexLink.class, "EReflexLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEReflexLink_Reflex(), this.getEReflex(), null, "reflex", null, 0, 1, EReflexLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEReflexLink_Species(), this.getESpecies(), null, "species", null, 0, 1, EReflexLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDisplayLinkEClass, EDisplayLink.class, "EDisplayLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDisplayLink_Experiment(), this.getEGUIExperiment(), null, "experiment", null, 0, 1, EDisplayLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDisplayLink_Display(), this.getEDisplay(), null, "display", null, 0, 1, EDisplayLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDisplayEClass, EDisplay.class, "EDisplay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDisplay_Layers(), this.getELayer(), null, "layers", null, 0, -1, EDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDisplay_DisplayLink(), this.getEDisplayLink(), null, "displayLink", null, 0, 1, EDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDisplay_LayerList(), ecorePackage.getEString(), "layerList", null, 0, -1, EDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDisplay_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, EDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDisplay_DefineGamlCode(), ecorePackage.getEBoolean(), "defineGamlCode", null, 0, 1, EDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eVariableEClass, EVariable.class, "EVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEVariable_Init(), ecorePackage.getEString(), "init", null, 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEVariable_Min(), ecorePackage.getEString(), "min", null, 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEVariable_Max(), ecorePackage.getEString(), "max", null, 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEVariable_Update(), ecorePackage.getEString(), "update", null, 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEVariable_Function(), ecorePackage.getEString(), "function", null, 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEVariable_HasError(), ecorePackage.getEBooleanObject(), "hasError", "false", 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEVariable_Error(), ecorePackage.getEString(), "error", null, 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEVariable_Owner(), this.getEGamaObject(), null, "owner", null, 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eWorldAgentEClass, EWorldAgent.class, "EWorldAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eLayerEClass, ELayer.class, "ELayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELayer_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getELayer_Display(), this.getEDisplay(), null, "display", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_Type(), ecorePackage.getEString(), "type", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_File(), ecorePackage.getEString(), "file", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_Text(), ecorePackage.getEString(), "text", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_Size(), ecorePackage.getEString(), "size", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_Species(), ecorePackage.getEString(), "species", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_Agents(), ecorePackage.getEString(), "agents", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_Aspect(), ecorePackage.getEString(), "aspect", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_Color(), ecorePackage.getEString(), "color", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_IsColorCst(), ecorePackage.getEBooleanObject(), "isColorCst", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_ColorRBG(), ecorePackage.getEIntegerObject(), "colorRBG", null, 0, 3, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_Grid(), ecorePackage.getEString(), "grid", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELayer_Chartlayers(), this.getEChartLayer(), null, "chartlayers", null, 0, -1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_Chart_type(), ecorePackage.getEString(), "chart_type", null, 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayer_ShowLines(), ecorePackage.getEBoolean(), "showLines", "false", 0, 1, ELayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eExperimentLinkEClass, EExperimentLink.class, "EExperimentLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEExperimentLink_Species(), this.getESpecies(), null, "species", null, 0, 1, EExperimentLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEExperimentLink_Experiment(), this.getEExperiment(), null, "experiment", null, 0, 1, EExperimentLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eLayerAspectEClass, ELayerAspect.class, "ELayerAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELayerAspect_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Shape(), ecorePackage.getEString(), "shape", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Color(), ecorePackage.getEString(), "color", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Empty(), ecorePackage.getEString(), "empty", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Rotate(), ecorePackage.getEString(), "rotate", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Size(), ecorePackage.getEString(), "size", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Width(), ecorePackage.getEString(), "width", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Heigth(), ecorePackage.getEString(), "heigth", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Radius(), ecorePackage.getEString(), "radius", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Path(), ecorePackage.getEString(), "path", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Text(), ecorePackage.getEString(), "text", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Type(), ecorePackage.getEString(), "type", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Points(), ecorePackage.getEString(), "points", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_At(), ecorePackage.getEString(), "at", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_ShapeType(), ecorePackage.getEString(), "shapeType", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_IsColorCst(), ecorePackage.getEBooleanObject(), "isColorCst", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_TextSize(), ecorePackage.getEString(), "textSize", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_ImageSize(), ecorePackage.getEString(), "imageSize", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_ColorRBG(), ecorePackage.getEIntegerObject(), "colorRBG", null, 0, 3, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELayerAspect_Aspect(), this.getEAspect(), null, "aspect", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Depth(), ecorePackage.getEString(), "depth", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELayerAspect_Texture(), ecorePackage.getEString(), "texture", null, 0, 1, ELayerAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eInheritLinkEClass, EInheritLink.class, "EInheritLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEInheritLink_Parent(), this.getESpecies(), null, "parent", null, 0, 1, EInheritLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEInheritLink_Child(), this.getESpecies(), null, "child", null, 0, 1, EInheritLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eChartLayerEClass, EChartLayer.class, "EChartLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEChartLayer_Style(), ecorePackage.getEString(), "style", null, 0, 1, EChartLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEChartLayer_Color(), ecorePackage.getEString(), "color", null, 0, 1, EChartLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEChartLayer_Value(), ecorePackage.getEString(), "value", null, 0, 1, EChartLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eParameterEClass, EParameter.class, "EParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEParameter_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEParameter_Min(), ecorePackage.getEString(), "min", null, 0, 1, EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEParameter_Init(), ecorePackage.getEString(), "init", null, 0, 1, EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEParameter_Step(), ecorePackage.getEString(), "step", null, 0, 1, EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEParameter_Max(), ecorePackage.getEString(), "max", null, 0, 1, EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEParameter_Among(), ecorePackage.getEString(), "among", null, 0, 1, EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEParameter_Category(), ecorePackage.getEString(), "category", null, 0, 1, EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eMonitorEClass, EMonitor.class, "EMonitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMonitor_Value(), ecorePackage.getEString(), "value", null, 0, 1, EMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eFacetEClass, EFacet.class, "EFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEFacet_Name(), ecorePackage.getEString(), "name", null, 0, 1, EFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFacet_Owner(), this.getEGamaObject(), null, "owner", null, 0, 1, EFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEFacet_Value(), ecorePackage.getEString(), "value", null, 0, 1, EFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ePlanEClass, EPlan.class, "EPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPlan_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, EPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEPlan_PlanLinks(), this.getEPlanLink(), null, "planLinks", null, 0, -1, EPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStateEClass, EState.class, "EState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEState_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, EState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEState_StateLinks(), this.getEStateLink(), null, "stateLinks", null, 0, -1, EState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTaskEClass, ETask.class, "ETask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETask_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, ETask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getETask_TaskLinks(), this.getETaskLink(), null, "taskLinks", null, 0, -1, ETask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ePlanLinkEClass, EPlanLink.class, "EPlanLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEPlanLink_Plan(), this.getEPlan(), null, "plan", null, 0, 1, EPlanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPlanLink_Species(), this.getESpecies(), null, "species", null, 0, 1, EPlanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStateLinkEClass, EStateLink.class, "EStateLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEStateLink_State(), this.getEState(), null, "state", null, 0, 1, EStateLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStateLink_Species(), this.getESpecies(), null, "species", null, 0, 1, EStateLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTaskLinkEClass, ETaskLink.class, "ETaskLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getETaskLink_Task(), this.getETask(), null, "task", null, 0, 1, ETaskLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETaskLink_Species(), this.getESpecies(), null, "species", null, 0, 1, ETaskLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eGridEClass, EGrid.class, "EGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ePerceiveEClass, EPerceive.class, "EPerceive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPerceive_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, EPerceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEPerceive_PerceiveLinks(), this.getEPerceiveLink(), null, "perceiveLinks", null, 0, -1, EPerceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ePerceiveLinkEClass, EPerceiveLink.class, "EPerceiveLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEPerceiveLink_Perceive(), this.getEPerceive(), null, "perceive", null, 0, 1, EPerceiveLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPerceiveLink_Species(), this.getESpecies(), null, "species", null, 0, 1, EPerceiveLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eRuleEClass, ERule.class, "ERule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getERule_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, ERule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getERule_RuleLinks(), this.getERuleLink(), null, "ruleLinks", null, 0, -1, ERule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eRuleLinkEClass, ERuleLink.class, "ERuleLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERuleLink_Rule(), this.getERule(), null, "rule", null, 0, 1, ERuleLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERuleLink_Species(), this.getESpecies(), null, "species", null, 0, 1, ERuleLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEquationEClass, EEquation.class, "EEquation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEquation_GamlCode(), ecorePackage.getEString(), "gamlCode", null, 0, 1, EEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEEquation_EquationLinks(), this.getEEquationLink(), null, "equationLinks", null, 0, -1, EEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEquationLinkEClass, EEquationLink.class, "EEquationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEquationLink_Equation(), this.getEEquation(), null, "equation", null, 0, 1, EEquationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEquationLink_Species(), this.getESpecies(), null, "species", null, 0, 1, EEquationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GamaPackageImpl
