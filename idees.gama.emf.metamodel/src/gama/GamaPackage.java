/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gama.GamaFactory
 * @model kind="package"
 * @generated
 */
public interface GamaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gama";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gama/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gama";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamaPackage eINSTANCE = gama.impl.GamaPackageImpl.init();

	/**
	 * The meta object id for the '{@link gama.impl.EGamaModelImpl <em>EGama Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EGamaModelImpl
	 * @see gama.impl.GamaPackageImpl#getEGamaModel()
	 * @generated
	 */
	int EGAMA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_MODEL__OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_MODEL__LINKS = 2;

	/**
	 * The number of structural features of the '<em>EGama Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gama.impl.EGamaObjectImpl <em>EGama Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EGamaObjectImpl
	 * @see gama.impl.GamaPackageImpl#getEGamaObject()
	 * @generated
	 */
	int EGAMA_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_OBJECT__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_OBJECT__COLOR_PICTO = 2;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_OBJECT__HAS_ERROR = 3;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_OBJECT__ERROR = 4;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_OBJECT__FACETS = 5;

	/**
	 * The number of structural features of the '<em>EGama Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_OBJECT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gama.impl.ESpeciesImpl <em>ESpecies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.ESpeciesImpl
	 * @see gama.impl.GamaPackageImpl#getESpecies()
	 * @generated
	 */
	int ESPECIES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__VARIABLES = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reflex List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__REFLEX_LIST = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Experiment Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__EXPERIMENT_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aspect Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__ASPECT_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__ACTION_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reflex Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__REFLEX_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Micro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__MICRO_SPECIES_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Macro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__MACRO_SPECIES_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__SKILLS = EGAMA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Inherits From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__INHERITS_FROM = EGAMA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__INIT = EGAMA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Inheriting Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__INHERITING_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Plan Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__PLAN_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>State Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__STATE_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__TASK_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Perceive Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__PERCEIVE_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Rule Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__RULE_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Equation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES__EQUATION_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>ESpecies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPECIES_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link gama.impl.EActionImpl <em>EAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EActionImpl
	 * @see gama.impl.GamaPackageImpl#getEAction()
	 * @generated
	 */
	int EACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__ACTION_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__VARIABLES = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__RETURN_TYPE = EGAMA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gama.impl.EAspectImpl <em>EAspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EAspectImpl
	 * @see gama.impl.GamaPackageImpl#getEAspect()
	 * @generated
	 */
	int EASPECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aspect Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT__ASPECT_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT__LAYERS = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Define Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT__DEFINE_GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EAspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gama.impl.EReflexImpl <em>EReflex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EReflexImpl
	 * @see gama.impl.GamaPackageImpl#getEReflex()
	 * @generated
	 */
	int EREFLEX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reflex Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX__REFLEX_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EReflex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EExperimentImpl <em>EExperiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EExperimentImpl
	 * @see gama.impl.GamaPackageImpl#getEExperiment()
	 * @generated
	 */
	int EEXPERIMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__NAME = ESPECIES__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__MODEL = ESPECIES__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__COLOR_PICTO = ESPECIES__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__HAS_ERROR = ESPECIES__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__ERROR = ESPECIES__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__FACETS = ESPECIES__FACETS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__VARIABLES = ESPECIES__VARIABLES;

	/**
	 * The feature id for the '<em><b>Reflex List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__REFLEX_LIST = ESPECIES__REFLEX_LIST;

	/**
	 * The feature id for the '<em><b>Experiment Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__EXPERIMENT_LINKS = ESPECIES__EXPERIMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Aspect Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__ASPECT_LINKS = ESPECIES__ASPECT_LINKS;

	/**
	 * The feature id for the '<em><b>Action Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__ACTION_LINKS = ESPECIES__ACTION_LINKS;

	/**
	 * The feature id for the '<em><b>Reflex Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__REFLEX_LINKS = ESPECIES__REFLEX_LINKS;

	/**
	 * The feature id for the '<em><b>Micro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__MICRO_SPECIES_LINKS = ESPECIES__MICRO_SPECIES_LINKS;

	/**
	 * The feature id for the '<em><b>Macro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__MACRO_SPECIES_LINKS = ESPECIES__MACRO_SPECIES_LINKS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__SKILLS = ESPECIES__SKILLS;

	/**
	 * The feature id for the '<em><b>Inherits From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__INHERITS_FROM = ESPECIES__INHERITS_FROM;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__INIT = ESPECIES__INIT;

	/**
	 * The feature id for the '<em><b>Inheriting Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__INHERITING_LINKS = ESPECIES__INHERITING_LINKS;

	/**
	 * The feature id for the '<em><b>Plan Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__PLAN_LINKS = ESPECIES__PLAN_LINKS;

	/**
	 * The feature id for the '<em><b>State Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__STATE_LINKS = ESPECIES__STATE_LINKS;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__TASK_LINKS = ESPECIES__TASK_LINKS;

	/**
	 * The feature id for the '<em><b>Perceive Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__PERCEIVE_LINKS = ESPECIES__PERCEIVE_LINKS;

	/**
	 * The feature id for the '<em><b>Rule Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__RULE_LINKS = ESPECIES__RULE_LINKS;

	/**
	 * The feature id for the '<em><b>Equation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__EQUATION_LINKS = ESPECIES__EQUATION_LINKS;

	/**
	 * The feature id for the '<em><b>Experiment Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__EXPERIMENT_LINK = ESPECIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__DISPLAY_LINKS = ESPECIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__PARAMETERS = ESPECIES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT__MONITORS = ESPECIES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EExperiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT_FEATURE_COUNT = ESPECIES_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gama.impl.EGUIExperimentImpl <em>EGUI Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EGUIExperimentImpl
	 * @see gama.impl.GamaPackageImpl#getEGUIExperiment()
	 * @generated
	 */
	int EGUI_EXPERIMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__NAME = EEXPERIMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__MODEL = EEXPERIMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__COLOR_PICTO = EEXPERIMENT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__HAS_ERROR = EEXPERIMENT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__ERROR = EEXPERIMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__FACETS = EEXPERIMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__VARIABLES = EEXPERIMENT__VARIABLES;

	/**
	 * The feature id for the '<em><b>Reflex List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__REFLEX_LIST = EEXPERIMENT__REFLEX_LIST;

	/**
	 * The feature id for the '<em><b>Experiment Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__EXPERIMENT_LINKS = EEXPERIMENT__EXPERIMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Aspect Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__ASPECT_LINKS = EEXPERIMENT__ASPECT_LINKS;

	/**
	 * The feature id for the '<em><b>Action Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__ACTION_LINKS = EEXPERIMENT__ACTION_LINKS;

	/**
	 * The feature id for the '<em><b>Reflex Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__REFLEX_LINKS = EEXPERIMENT__REFLEX_LINKS;

	/**
	 * The feature id for the '<em><b>Micro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__MICRO_SPECIES_LINKS = EEXPERIMENT__MICRO_SPECIES_LINKS;

	/**
	 * The feature id for the '<em><b>Macro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__MACRO_SPECIES_LINKS = EEXPERIMENT__MACRO_SPECIES_LINKS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__SKILLS = EEXPERIMENT__SKILLS;

	/**
	 * The feature id for the '<em><b>Inherits From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__INHERITS_FROM = EEXPERIMENT__INHERITS_FROM;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__INIT = EEXPERIMENT__INIT;

	/**
	 * The feature id for the '<em><b>Inheriting Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__INHERITING_LINKS = EEXPERIMENT__INHERITING_LINKS;

	/**
	 * The feature id for the '<em><b>Plan Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__PLAN_LINKS = EEXPERIMENT__PLAN_LINKS;

	/**
	 * The feature id for the '<em><b>State Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__STATE_LINKS = EEXPERIMENT__STATE_LINKS;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__TASK_LINKS = EEXPERIMENT__TASK_LINKS;

	/**
	 * The feature id for the '<em><b>Perceive Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__PERCEIVE_LINKS = EEXPERIMENT__PERCEIVE_LINKS;

	/**
	 * The feature id for the '<em><b>Rule Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__RULE_LINKS = EEXPERIMENT__RULE_LINKS;

	/**
	 * The feature id for the '<em><b>Equation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__EQUATION_LINKS = EEXPERIMENT__EQUATION_LINKS;

	/**
	 * The feature id for the '<em><b>Experiment Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__EXPERIMENT_LINK = EEXPERIMENT__EXPERIMENT_LINK;

	/**
	 * The feature id for the '<em><b>Display Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__DISPLAY_LINKS = EEXPERIMENT__DISPLAY_LINKS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__PARAMETERS = EEXPERIMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT__MONITORS = EEXPERIMENT__MONITORS;

	/**
	 * The number of structural features of the '<em>EGUI Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGUI_EXPERIMENT_FEATURE_COUNT = EEXPERIMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gama.impl.EBatchExperimentImpl <em>EBatch Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EBatchExperimentImpl
	 * @see gama.impl.GamaPackageImpl#getEBatchExperiment()
	 * @generated
	 */
	int EBATCH_EXPERIMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__NAME = EEXPERIMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__MODEL = EEXPERIMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__COLOR_PICTO = EEXPERIMENT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__HAS_ERROR = EEXPERIMENT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__ERROR = EEXPERIMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__FACETS = EEXPERIMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__VARIABLES = EEXPERIMENT__VARIABLES;

	/**
	 * The feature id for the '<em><b>Reflex List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__REFLEX_LIST = EEXPERIMENT__REFLEX_LIST;

	/**
	 * The feature id for the '<em><b>Experiment Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__EXPERIMENT_LINKS = EEXPERIMENT__EXPERIMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Aspect Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__ASPECT_LINKS = EEXPERIMENT__ASPECT_LINKS;

	/**
	 * The feature id for the '<em><b>Action Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__ACTION_LINKS = EEXPERIMENT__ACTION_LINKS;

	/**
	 * The feature id for the '<em><b>Reflex Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__REFLEX_LINKS = EEXPERIMENT__REFLEX_LINKS;

	/**
	 * The feature id for the '<em><b>Micro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__MICRO_SPECIES_LINKS = EEXPERIMENT__MICRO_SPECIES_LINKS;

	/**
	 * The feature id for the '<em><b>Macro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__MACRO_SPECIES_LINKS = EEXPERIMENT__MACRO_SPECIES_LINKS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__SKILLS = EEXPERIMENT__SKILLS;

	/**
	 * The feature id for the '<em><b>Inherits From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__INHERITS_FROM = EEXPERIMENT__INHERITS_FROM;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__INIT = EEXPERIMENT__INIT;

	/**
	 * The feature id for the '<em><b>Inheriting Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__INHERITING_LINKS = EEXPERIMENT__INHERITING_LINKS;

	/**
	 * The feature id for the '<em><b>Plan Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__PLAN_LINKS = EEXPERIMENT__PLAN_LINKS;

	/**
	 * The feature id for the '<em><b>State Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__STATE_LINKS = EEXPERIMENT__STATE_LINKS;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__TASK_LINKS = EEXPERIMENT__TASK_LINKS;

	/**
	 * The feature id for the '<em><b>Perceive Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__PERCEIVE_LINKS = EEXPERIMENT__PERCEIVE_LINKS;

	/**
	 * The feature id for the '<em><b>Rule Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__RULE_LINKS = EEXPERIMENT__RULE_LINKS;

	/**
	 * The feature id for the '<em><b>Equation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__EQUATION_LINKS = EEXPERIMENT__EQUATION_LINKS;

	/**
	 * The feature id for the '<em><b>Experiment Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__EXPERIMENT_LINK = EEXPERIMENT__EXPERIMENT_LINK;

	/**
	 * The feature id for the '<em><b>Display Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__DISPLAY_LINKS = EEXPERIMENT__DISPLAY_LINKS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__PARAMETERS = EEXPERIMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT__MONITORS = EEXPERIMENT__MONITORS;

	/**
	 * The number of structural features of the '<em>EBatch Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBATCH_EXPERIMENT_FEATURE_COUNT = EEXPERIMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gama.impl.EGamaLinkImpl <em>EGama Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EGamaLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEGamaLink()
	 * @generated
	 */
	int EGAMA_LINK = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_LINK__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_LINK__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_LINK__MODEL = 2;

	/**
	 * The number of structural features of the '<em>EGama Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGAMA_LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gama.impl.ESubSpeciesLinkImpl <em>ESub Species Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.ESubSpeciesLinkImpl
	 * @see gama.impl.GamaPackageImpl#getESubSpeciesLink()
	 * @generated
	 */
	int ESUB_SPECIES_LINK = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESUB_SPECIES_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESUB_SPECIES_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESUB_SPECIES_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Macro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESUB_SPECIES_LINK__MACRO = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Micro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESUB_SPECIES_LINK__MICRO = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ESub Species Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESUB_SPECIES_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EActionLinkImpl <em>EAction Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EActionLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEActionLink()
	 * @generated
	 */
	int EACTION_LINK = 11;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION_LINK__ACTION = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION_LINK__SPECIES = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EAction Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EAspectLinkImpl <em>EAspect Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EAspectLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEAspectLink()
	 * @generated
	 */
	int EASPECT_LINK = 12;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT_LINK__ASPECT = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT_LINK__SPECIES = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EAspect Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASPECT_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EReflexLinkImpl <em>EReflex Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EReflexLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEReflexLink()
	 * @generated
	 */
	int EREFLEX_LINK = 13;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Reflex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX_LINK__REFLEX = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX_LINK__SPECIES = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EReflex Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFLEX_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EDisplayLinkImpl <em>EDisplay Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EDisplayLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEDisplayLink()
	 * @generated
	 */
	int EDISPLAY_LINK = 14;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Experiment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY_LINK__EXPERIMENT = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY_LINK__DISPLAY = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EDisplay Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EDisplayImpl <em>EDisplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EDisplayImpl
	 * @see gama.impl.GamaPackageImpl#getEDisplay()
	 * @generated
	 */
	int EDISPLAY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__LAYERS = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__DISPLAY_LINK = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layer List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__LAYER_LIST = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Define Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY__DEFINE_GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EDisplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISPLAY_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link gama.impl.EVariableImpl <em>EVariable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EVariableImpl
	 * @see gama.impl.GamaPackageImpl#getEVariable()
	 * @generated
	 */
	int EVARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE__INIT = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE__MIN = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE__MAX = 2;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE__UPDATE = 3;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE__FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE__HAS_ERROR = 7;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE__ERROR = 8;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE__OWNER = 9;

	/**
	 * The number of structural features of the '<em>EVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARIABLE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link gama.impl.EWorldAgentImpl <em>EWorld Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EWorldAgentImpl
	 * @see gama.impl.GamaPackageImpl#getEWorldAgent()
	 * @generated
	 */
	int EWORLD_AGENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__NAME = ESPECIES__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__MODEL = ESPECIES__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__COLOR_PICTO = ESPECIES__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__HAS_ERROR = ESPECIES__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__ERROR = ESPECIES__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__FACETS = ESPECIES__FACETS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__VARIABLES = ESPECIES__VARIABLES;

	/**
	 * The feature id for the '<em><b>Reflex List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__REFLEX_LIST = ESPECIES__REFLEX_LIST;

	/**
	 * The feature id for the '<em><b>Experiment Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__EXPERIMENT_LINKS = ESPECIES__EXPERIMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Aspect Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__ASPECT_LINKS = ESPECIES__ASPECT_LINKS;

	/**
	 * The feature id for the '<em><b>Action Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__ACTION_LINKS = ESPECIES__ACTION_LINKS;

	/**
	 * The feature id for the '<em><b>Reflex Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__REFLEX_LINKS = ESPECIES__REFLEX_LINKS;

	/**
	 * The feature id for the '<em><b>Micro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__MICRO_SPECIES_LINKS = ESPECIES__MICRO_SPECIES_LINKS;

	/**
	 * The feature id for the '<em><b>Macro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__MACRO_SPECIES_LINKS = ESPECIES__MACRO_SPECIES_LINKS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__SKILLS = ESPECIES__SKILLS;

	/**
	 * The feature id for the '<em><b>Inherits From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__INHERITS_FROM = ESPECIES__INHERITS_FROM;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__INIT = ESPECIES__INIT;

	/**
	 * The feature id for the '<em><b>Inheriting Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__INHERITING_LINKS = ESPECIES__INHERITING_LINKS;

	/**
	 * The feature id for the '<em><b>Plan Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__PLAN_LINKS = ESPECIES__PLAN_LINKS;

	/**
	 * The feature id for the '<em><b>State Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__STATE_LINKS = ESPECIES__STATE_LINKS;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__TASK_LINKS = ESPECIES__TASK_LINKS;

	/**
	 * The feature id for the '<em><b>Perceive Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__PERCEIVE_LINKS = ESPECIES__PERCEIVE_LINKS;

	/**
	 * The feature id for the '<em><b>Rule Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__RULE_LINKS = ESPECIES__RULE_LINKS;

	/**
	 * The feature id for the '<em><b>Equation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT__EQUATION_LINKS = ESPECIES__EQUATION_LINKS;

	/**
	 * The number of structural features of the '<em>EWorld Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWORLD_AGENT_FEATURE_COUNT = ESPECIES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gama.impl.ELayerImpl <em>ELayer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.ELayerImpl
	 * @see gama.impl.GamaPackageImpl#getELayer()
	 * @generated
	 */
	int ELAYER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__DISPLAY = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__TYPE = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__FILE = EGAMA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__TEXT = EGAMA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__SIZE = EGAMA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__SPECIES = EGAMA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__AGENTS = EGAMA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__ASPECT = EGAMA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__COLOR = EGAMA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Color Cst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__IS_COLOR_CST = EGAMA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Color RBG</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__COLOR_RBG = EGAMA_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__GRID = EGAMA_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Chartlayers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__CHARTLAYERS = EGAMA_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Chart type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__CHART_TYPE = EGAMA_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Show Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER__SHOW_LINES = EGAMA_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>ELayer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link gama.impl.EExperimentLinkImpl <em>EExperiment Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EExperimentLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEExperimentLink()
	 * @generated
	 */
	int EEXPERIMENT_LINK = 19;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT_LINK__SPECIES = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Experiment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT_LINK__EXPERIMENT = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EExperiment Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXPERIMENT_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.ELayerAspectImpl <em>ELayer Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.ELayerAspectImpl
	 * @see gama.impl.GamaPackageImpl#getELayerAspect()
	 * @generated
	 */
	int ELAYER_ASPECT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__SHAPE = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__COLOR = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__EMPTY = EGAMA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__ROTATE = EGAMA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__SIZE = EGAMA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__WIDTH = EGAMA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__HEIGTH = EGAMA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__RADIUS = EGAMA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__PATH = EGAMA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__TEXT = EGAMA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__TYPE = EGAMA_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__EXPRESSION = EGAMA_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__POINTS = EGAMA_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__AT = EGAMA_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Shape Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__SHAPE_TYPE = EGAMA_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Color Cst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__IS_COLOR_CST = EGAMA_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Text Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__TEXT_SIZE = EGAMA_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__IMAGE_SIZE = EGAMA_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Color RBG</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__COLOR_RBG = EGAMA_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__ASPECT = EGAMA_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__DEPTH = EGAMA_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT__TEXTURE = EGAMA_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>ELayer Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELAYER_ASPECT_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link gama.impl.EInheritLinkImpl <em>EInherit Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EInheritLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEInheritLink()
	 * @generated
	 */
	int EINHERIT_LINK = 21;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINHERIT_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINHERIT_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINHERIT_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINHERIT_LINK__PARENT = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINHERIT_LINK__CHILD = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EInherit Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINHERIT_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EChartLayerImpl <em>EChart Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EChartLayerImpl
	 * @see gama.impl.GamaPackageImpl#getEChartLayer()
	 * @generated
	 */
	int ECHART_LAYER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_LAYER__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_LAYER__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_LAYER__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_LAYER__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_LAYER__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_LAYER__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_LAYER__STYLE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_LAYER__COLOR = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_LAYER__VALUE = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EChart Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_LAYER_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gama.impl.EParameterImpl <em>EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EParameterImpl
	 * @see gama.impl.GamaPackageImpl#getEParameter()
	 * @generated
	 */
	int EPARAMETER = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__VARIABLE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__MIN = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__INIT = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__STEP = EGAMA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__MAX = EGAMA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Among</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__AMONG = EGAMA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__CATEGORY = EGAMA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 7;


	/**
	 * The meta object id for the '{@link gama.impl.EMonitorImpl <em>EMonitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EMonitorImpl
	 * @see gama.impl.GamaPackageImpl#getEMonitor()
	 * @generated
	 */
	int EMONITOR = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMONITOR__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMONITOR__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMONITOR__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMONITOR__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMONITOR__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMONITOR__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMONITOR__VALUE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMonitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMONITOR_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link gama.impl.EFacetImpl <em>EFacet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EFacetImpl
	 * @see gama.impl.GamaPackageImpl#getEFacet()
	 * @generated
	 */
	int EFACET = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACET__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACET__VALUE = 2;

	/**
	 * The number of structural features of the '<em>EFacet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gama.impl.EPlanImpl <em>EPlan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EPlanImpl
	 * @see gama.impl.GamaPackageImpl#getEPlan()
	 * @generated
	 */
	int EPLAN = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plan Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN__PLAN_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EPlan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EStateImpl <em>EState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EStateImpl
	 * @see gama.impl.GamaPackageImpl#getEState()
	 * @generated
	 */
	int ESTATE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__STATE_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.ETaskImpl <em>ETask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.ETaskImpl
	 * @see gama.impl.GamaPackageImpl#getETask()
	 * @generated
	 */
	int ETASK = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK__TASK_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ETask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EPlanLinkImpl <em>EPlan Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EPlanLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEPlanLink()
	 * @generated
	 */
	int EPLAN_LINK = 29;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN_LINK__PLAN = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN_LINK__SPECIES = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EPlan Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPLAN_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EStateLinkImpl <em>EState Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EStateLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEStateLink()
	 * @generated
	 */
	int ESTATE_LINK = 30;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_LINK__STATE = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_LINK__SPECIES = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EState Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.ETaskLinkImpl <em>ETask Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.ETaskLinkImpl
	 * @see gama.impl.GamaPackageImpl#getETaskLink()
	 * @generated
	 */
	int ETASK_LINK = 31;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK_LINK__TASK = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK_LINK__SPECIES = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ETask Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETASK_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link gama.impl.EGridImpl <em>EGrid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EGridImpl
	 * @see gama.impl.GamaPackageImpl#getEGrid()
	 * @generated
	 */
	int EGRID = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__NAME = ESPECIES__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__MODEL = ESPECIES__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__COLOR_PICTO = ESPECIES__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__HAS_ERROR = ESPECIES__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__ERROR = ESPECIES__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__FACETS = ESPECIES__FACETS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__VARIABLES = ESPECIES__VARIABLES;

	/**
	 * The feature id for the '<em><b>Reflex List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__REFLEX_LIST = ESPECIES__REFLEX_LIST;

	/**
	 * The feature id for the '<em><b>Experiment Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__EXPERIMENT_LINKS = ESPECIES__EXPERIMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Aspect Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__ASPECT_LINKS = ESPECIES__ASPECT_LINKS;

	/**
	 * The feature id for the '<em><b>Action Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__ACTION_LINKS = ESPECIES__ACTION_LINKS;

	/**
	 * The feature id for the '<em><b>Reflex Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__REFLEX_LINKS = ESPECIES__REFLEX_LINKS;

	/**
	 * The feature id for the '<em><b>Micro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__MICRO_SPECIES_LINKS = ESPECIES__MICRO_SPECIES_LINKS;

	/**
	 * The feature id for the '<em><b>Macro Species Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__MACRO_SPECIES_LINKS = ESPECIES__MACRO_SPECIES_LINKS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__SKILLS = ESPECIES__SKILLS;

	/**
	 * The feature id for the '<em><b>Inherits From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__INHERITS_FROM = ESPECIES__INHERITS_FROM;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__INIT = ESPECIES__INIT;

	/**
	 * The feature id for the '<em><b>Inheriting Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__INHERITING_LINKS = ESPECIES__INHERITING_LINKS;

	/**
	 * The feature id for the '<em><b>Plan Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__PLAN_LINKS = ESPECIES__PLAN_LINKS;

	/**
	 * The feature id for the '<em><b>State Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__STATE_LINKS = ESPECIES__STATE_LINKS;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__TASK_LINKS = ESPECIES__TASK_LINKS;

	/**
	 * The feature id for the '<em><b>Perceive Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__PERCEIVE_LINKS = ESPECIES__PERCEIVE_LINKS;

	/**
	 * The feature id for the '<em><b>Rule Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__RULE_LINKS = ESPECIES__RULE_LINKS;

	/**
	 * The feature id for the '<em><b>Equation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID__EQUATION_LINKS = ESPECIES__EQUATION_LINKS;

	/**
	 * The number of structural features of the '<em>EGrid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_FEATURE_COUNT = ESPECIES_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link gama.impl.EPerceiveImpl <em>EPerceive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EPerceiveImpl
	 * @see gama.impl.GamaPackageImpl#getEPerceive()
	 * @generated
	 */
	int EPERCEIVE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Perceive Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE__PERCEIVE_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EPerceive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EPerceiveLinkImpl <em>EPerceive Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EPerceiveLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEPerceiveLink()
	 * @generated
	 */
	int EPERCEIVE_LINK = 34;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Perceive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE_LINK__PERCEIVE = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE_LINK__SPECIES = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EPerceive Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPERCEIVE_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.ERuleImpl <em>ERule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.ERuleImpl
	 * @see gama.impl.GamaPackageImpl#getERule()
	 * @generated
	 */
	int ERULE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE__RULE_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ERule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.ERuleLinkImpl <em>ERule Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.ERuleLinkImpl
	 * @see gama.impl.GamaPackageImpl#getERuleLink()
	 * @generated
	 */
	int ERULE_LINK = 36;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE_LINK__RULE = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE_LINK__SPECIES = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ERule Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERULE_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link gama.impl.EEquationImpl <em>EEquation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EEquationImpl
	 * @see gama.impl.GamaPackageImpl#getEEquation()
	 * @generated
	 */
	int EEQUATION = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION__NAME = EGAMA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION__MODEL = EGAMA_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Color Picto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION__COLOR_PICTO = EGAMA_OBJECT__COLOR_PICTO;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION__HAS_ERROR = EGAMA_OBJECT__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION__ERROR = EGAMA_OBJECT__ERROR;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION__FACETS = EGAMA_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION__GAML_CODE = EGAMA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION__EQUATION_LINKS = EGAMA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEquation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION_FEATURE_COUNT = EGAMA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gama.impl.EEquationLinkImpl <em>EEquation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.impl.EEquationLinkImpl
	 * @see gama.impl.GamaPackageImpl#getEEquationLink()
	 * @generated
	 */
	int EEQUATION_LINK = 38;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION_LINK__TARGET = EGAMA_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION_LINK__SOURCE = EGAMA_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION_LINK__MODEL = EGAMA_LINK__MODEL;

	/**
	 * The feature id for the '<em><b>Equation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION_LINK__EQUATION = EGAMA_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION_LINK__SPECIES = EGAMA_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEquation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEQUATION_LINK_FEATURE_COUNT = EGAMA_LINK_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link gama.EGamaModel <em>EGama Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGama Model</em>'.
	 * @see gama.EGamaModel
	 * @generated
	 */
	EClass getEGamaModel();

	/**
	 * Returns the meta object for the containment reference list '{@link gama.EGamaModel#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see gama.EGamaModel#getObjects()
	 * @see #getEGamaModel()
	 * @generated
	 */
	EReference getEGamaModel_Objects();

	/**
	 * Returns the meta object for the attribute '{@link gama.EGamaModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gama.EGamaModel#getName()
	 * @see #getEGamaModel()
	 * @generated
	 */
	EAttribute getEGamaModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gama.EGamaModel#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see gama.EGamaModel#getLinks()
	 * @see #getEGamaModel()
	 * @generated
	 */
	EReference getEGamaModel_Links();

	/**
	 * Returns the meta object for class '{@link gama.EGamaObject <em>EGama Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGama Object</em>'.
	 * @see gama.EGamaObject
	 * @generated
	 */
	EClass getEGamaObject();

	/**
	 * Returns the meta object for the attribute '{@link gama.EGamaObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gama.EGamaObject#getName()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EAttribute getEGamaObject_Name();

	/**
	 * Returns the meta object for the container reference '{@link gama.EGamaObject#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see gama.EGamaObject#getModel()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EReference getEGamaObject_Model();

	/**
	 * Returns the meta object for the attribute list '{@link gama.EGamaObject#getColorPicto <em>Color Picto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Color Picto</em>'.
	 * @see gama.EGamaObject#getColorPicto()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EAttribute getEGamaObject_ColorPicto();

	/**
	 * Returns the meta object for the attribute '{@link gama.EGamaObject#getHasError <em>Has Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Error</em>'.
	 * @see gama.EGamaObject#getHasError()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EAttribute getEGamaObject_HasError();

	/**
	 * Returns the meta object for the attribute '{@link gama.EGamaObject#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see gama.EGamaObject#getError()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EAttribute getEGamaObject_Error();

	/**
	 * Returns the meta object for the containment reference list '{@link gama.EGamaObject#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facets</em>'.
	 * @see gama.EGamaObject#getFacets()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EReference getEGamaObject_Facets();

	/**
	 * Returns the meta object for class '{@link gama.ESpecies <em>ESpecies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESpecies</em>'.
	 * @see gama.ESpecies
	 * @generated
	 */
	EClass getESpecies();

	/**
	 * Returns the meta object for the containment reference list '{@link gama.ESpecies#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see gama.ESpecies#getVariables()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_Variables();

	/**
	 * Returns the meta object for the attribute list '{@link gama.ESpecies#getReflexList <em>Reflex List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reflex List</em>'.
	 * @see gama.ESpecies#getReflexList()
	 * @see #getESpecies()
	 * @generated
	 */
	EAttribute getESpecies_ReflexList();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getExperimentLinks <em>Experiment Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Experiment Links</em>'.
	 * @see gama.ESpecies#getExperimentLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_ExperimentLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getAspectLinks <em>Aspect Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aspect Links</em>'.
	 * @see gama.ESpecies#getAspectLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_AspectLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getActionLinks <em>Action Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Links</em>'.
	 * @see gama.ESpecies#getActionLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_ActionLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getReflexLinks <em>Reflex Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reflex Links</em>'.
	 * @see gama.ESpecies#getReflexLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_ReflexLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getMicroSpeciesLinks <em>Micro Species Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Micro Species Links</em>'.
	 * @see gama.ESpecies#getMicroSpeciesLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_MicroSpeciesLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getMacroSpeciesLinks <em>Macro Species Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Macro Species Links</em>'.
	 * @see gama.ESpecies#getMacroSpeciesLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_MacroSpeciesLinks();

	/**
	 * Returns the meta object for the attribute list '{@link gama.ESpecies#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Skills</em>'.
	 * @see gama.ESpecies#getSkills()
	 * @see #getESpecies()
	 * @generated
	 */
	EAttribute getESpecies_Skills();

	/**
	 * Returns the meta object for the reference '{@link gama.ESpecies#getInheritsFrom <em>Inherits From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inherits From</em>'.
	 * @see gama.ESpecies#getInheritsFrom()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_InheritsFrom();

	/**
	 * Returns the meta object for the attribute '{@link gama.ESpecies#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see gama.ESpecies#getInit()
	 * @see #getESpecies()
	 * @generated
	 */
	EAttribute getESpecies_Init();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getInheritingLinks <em>Inheriting Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inheriting Links</em>'.
	 * @see gama.ESpecies#getInheritingLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_InheritingLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getPlanLinks <em>Plan Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plan Links</em>'.
	 * @see gama.ESpecies#getPlanLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_PlanLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getStateLinks <em>State Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Links</em>'.
	 * @see gama.ESpecies#getStateLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_StateLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getTaskLinks <em>Task Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Links</em>'.
	 * @see gama.ESpecies#getTaskLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_TaskLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getPerceiveLinks <em>Perceive Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perceive Links</em>'.
	 * @see gama.ESpecies#getPerceiveLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_PerceiveLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getRuleLinks <em>Rule Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rule Links</em>'.
	 * @see gama.ESpecies#getRuleLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_RuleLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ESpecies#getEquationLinks <em>Equation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equation Links</em>'.
	 * @see gama.ESpecies#getEquationLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_EquationLinks();

	/**
	 * Returns the meta object for class '{@link gama.EAction <em>EAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAction</em>'.
	 * @see gama.EAction
	 * @generated
	 */
	EClass getEAction();

	/**
	 * Returns the meta object for the attribute '{@link gama.EAction#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.EAction#getGamlCode()
	 * @see #getEAction()
	 * @generated
	 */
	EAttribute getEAction_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.EAction#getActionLinks <em>Action Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Links</em>'.
	 * @see gama.EAction#getActionLinks()
	 * @see #getEAction()
	 * @generated
	 */
	EReference getEAction_ActionLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link gama.EAction#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see gama.EAction#getVariables()
	 * @see #getEAction()
	 * @generated
	 */
	EReference getEAction_Variables();

	/**
	 * Returns the meta object for the attribute '{@link gama.EAction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see gama.EAction#getReturnType()
	 * @see #getEAction()
	 * @generated
	 */
	EAttribute getEAction_ReturnType();

	/**
	 * Returns the meta object for class '{@link gama.EAspect <em>EAspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAspect</em>'.
	 * @see gama.EAspect
	 * @generated
	 */
	EClass getEAspect();

	/**
	 * Returns the meta object for the attribute '{@link gama.EAspect#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.EAspect#getGamlCode()
	 * @see #getEAspect()
	 * @generated
	 */
	EAttribute getEAspect_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.EAspect#getAspectLinks <em>Aspect Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aspect Links</em>'.
	 * @see gama.EAspect#getAspectLinks()
	 * @see #getEAspect()
	 * @generated
	 */
	EReference getEAspect_AspectLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.EAspect#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layers</em>'.
	 * @see gama.EAspect#getLayers()
	 * @see #getEAspect()
	 * @generated
	 */
	EReference getEAspect_Layers();

	/**
	 * Returns the meta object for the attribute '{@link gama.EAspect#isDefineGamlCode <em>Define Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Define Gaml Code</em>'.
	 * @see gama.EAspect#isDefineGamlCode()
	 * @see #getEAspect()
	 * @generated
	 */
	EAttribute getEAspect_DefineGamlCode();

	/**
	 * Returns the meta object for class '{@link gama.EReflex <em>EReflex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReflex</em>'.
	 * @see gama.EReflex
	 * @generated
	 */
	EClass getEReflex();

	/**
	 * Returns the meta object for the attribute '{@link gama.EReflex#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.EReflex#getGamlCode()
	 * @see #getEReflex()
	 * @generated
	 */
	EAttribute getEReflex_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.EReflex#getReflexLinks <em>Reflex Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reflex Links</em>'.
	 * @see gama.EReflex#getReflexLinks()
	 * @see #getEReflex()
	 * @generated
	 */
	EReference getEReflex_ReflexLinks();

	/**
	 * Returns the meta object for class '{@link gama.EExperiment <em>EExperiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EExperiment</em>'.
	 * @see gama.EExperiment
	 * @generated
	 */
	EClass getEExperiment();

	/**
	 * Returns the meta object for the reference '{@link gama.EExperiment#getExperimentLink <em>Experiment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Experiment Link</em>'.
	 * @see gama.EExperiment#getExperimentLink()
	 * @see #getEExperiment()
	 * @generated
	 */
	EReference getEExperiment_ExperimentLink();

	/**
	 * Returns the meta object for the reference list '{@link gama.EExperiment#getDisplayLinks <em>Display Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Display Links</em>'.
	 * @see gama.EExperiment#getDisplayLinks()
	 * @see #getEExperiment()
	 * @generated
	 */
	EReference getEExperiment_DisplayLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.EExperiment#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see gama.EExperiment#getParameters()
	 * @see #getEExperiment()
	 * @generated
	 */
	EReference getEExperiment_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link gama.EExperiment#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitors</em>'.
	 * @see gama.EExperiment#getMonitors()
	 * @see #getEExperiment()
	 * @generated
	 */
	EReference getEExperiment_Monitors();

	/**
	 * Returns the meta object for class '{@link gama.EGUIExperiment <em>EGUI Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGUI Experiment</em>'.
	 * @see gama.EGUIExperiment
	 * @generated
	 */
	EClass getEGUIExperiment();

	/**
	 * Returns the meta object for class '{@link gama.EBatchExperiment <em>EBatch Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBatch Experiment</em>'.
	 * @see gama.EBatchExperiment
	 * @generated
	 */
	EClass getEBatchExperiment();

	/**
	 * Returns the meta object for class '{@link gama.EGamaLink <em>EGama Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGama Link</em>'.
	 * @see gama.EGamaLink
	 * @generated
	 */
	EClass getEGamaLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EGamaLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see gama.EGamaLink#getTarget()
	 * @see #getEGamaLink()
	 * @generated
	 */
	EReference getEGamaLink_Target();

	/**
	 * Returns the meta object for the reference '{@link gama.EGamaLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see gama.EGamaLink#getSource()
	 * @see #getEGamaLink()
	 * @generated
	 */
	EReference getEGamaLink_Source();

	/**
	 * Returns the meta object for the container reference '{@link gama.EGamaLink#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see gama.EGamaLink#getModel()
	 * @see #getEGamaLink()
	 * @generated
	 */
	EReference getEGamaLink_Model();

	/**
	 * Returns the meta object for class '{@link gama.ESubSpeciesLink <em>ESub Species Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESub Species Link</em>'.
	 * @see gama.ESubSpeciesLink
	 * @generated
	 */
	EClass getESubSpeciesLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ESubSpeciesLink#getMacro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Macro</em>'.
	 * @see gama.ESubSpeciesLink#getMacro()
	 * @see #getESubSpeciesLink()
	 * @generated
	 */
	EReference getESubSpeciesLink_Macro();

	/**
	 * Returns the meta object for the reference '{@link gama.ESubSpeciesLink#getMicro <em>Micro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Micro</em>'.
	 * @see gama.ESubSpeciesLink#getMicro()
	 * @see #getESubSpeciesLink()
	 * @generated
	 */
	EReference getESubSpeciesLink_Micro();

	/**
	 * Returns the meta object for class '{@link gama.EActionLink <em>EAction Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAction Link</em>'.
	 * @see gama.EActionLink
	 * @generated
	 */
	EClass getEActionLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EActionLink#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see gama.EActionLink#getAction()
	 * @see #getEActionLink()
	 * @generated
	 */
	EReference getEActionLink_Action();

	/**
	 * Returns the meta object for the reference '{@link gama.EActionLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.EActionLink#getSpecies()
	 * @see #getEActionLink()
	 * @generated
	 */
	EReference getEActionLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.EAspectLink <em>EAspect Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAspect Link</em>'.
	 * @see gama.EAspectLink
	 * @generated
	 */
	EClass getEAspectLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EAspectLink#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aspect</em>'.
	 * @see gama.EAspectLink#getAspect()
	 * @see #getEAspectLink()
	 * @generated
	 */
	EReference getEAspectLink_Aspect();

	/**
	 * Returns the meta object for the reference '{@link gama.EAspectLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.EAspectLink#getSpecies()
	 * @see #getEAspectLink()
	 * @generated
	 */
	EReference getEAspectLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.EReflexLink <em>EReflex Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReflex Link</em>'.
	 * @see gama.EReflexLink
	 * @generated
	 */
	EClass getEReflexLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EReflexLink#getReflex <em>Reflex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reflex</em>'.
	 * @see gama.EReflexLink#getReflex()
	 * @see #getEReflexLink()
	 * @generated
	 */
	EReference getEReflexLink_Reflex();

	/**
	 * Returns the meta object for the reference '{@link gama.EReflexLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.EReflexLink#getSpecies()
	 * @see #getEReflexLink()
	 * @generated
	 */
	EReference getEReflexLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.EDisplayLink <em>EDisplay Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDisplay Link</em>'.
	 * @see gama.EDisplayLink
	 * @generated
	 */
	EClass getEDisplayLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EDisplayLink#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Experiment</em>'.
	 * @see gama.EDisplayLink#getExperiment()
	 * @see #getEDisplayLink()
	 * @generated
	 */
	EReference getEDisplayLink_Experiment();

	/**
	 * Returns the meta object for the reference '{@link gama.EDisplayLink#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see gama.EDisplayLink#getDisplay()
	 * @see #getEDisplayLink()
	 * @generated
	 */
	EReference getEDisplayLink_Display();

	/**
	 * Returns the meta object for class '{@link gama.EDisplay <em>EDisplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDisplay</em>'.
	 * @see gama.EDisplay
	 * @generated
	 */
	EClass getEDisplay();

	/**
	 * Returns the meta object for the reference list '{@link gama.EDisplay#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layers</em>'.
	 * @see gama.EDisplay#getLayers()
	 * @see #getEDisplay()
	 * @generated
	 */
	EReference getEDisplay_Layers();

	/**
	 * Returns the meta object for the reference '{@link gama.EDisplay#getDisplayLink <em>Display Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display Link</em>'.
	 * @see gama.EDisplay#getDisplayLink()
	 * @see #getEDisplay()
	 * @generated
	 */
	EReference getEDisplay_DisplayLink();

	/**
	 * Returns the meta object for the attribute list '{@link gama.EDisplay#getLayerList <em>Layer List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Layer List</em>'.
	 * @see gama.EDisplay#getLayerList()
	 * @see #getEDisplay()
	 * @generated
	 */
	EAttribute getEDisplay_LayerList();

	/**
	 * Returns the meta object for the attribute '{@link gama.EDisplay#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.EDisplay#getGamlCode()
	 * @see #getEDisplay()
	 * @generated
	 */
	EAttribute getEDisplay_GamlCode();

	/**
	 * Returns the meta object for the attribute '{@link gama.EDisplay#isDefineGamlCode <em>Define Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Define Gaml Code</em>'.
	 * @see gama.EDisplay#isDefineGamlCode()
	 * @see #getEDisplay()
	 * @generated
	 */
	EAttribute getEDisplay_DefineGamlCode();

	/**
	 * Returns the meta object for class '{@link gama.EVariable <em>EVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EVariable</em>'.
	 * @see gama.EVariable
	 * @generated
	 */
	EClass getEVariable();

	/**
	 * Returns the meta object for the attribute '{@link gama.EVariable#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see gama.EVariable#getInit()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Init();

	/**
	 * Returns the meta object for the attribute '{@link gama.EVariable#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see gama.EVariable#getMin()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Min();

	/**
	 * Returns the meta object for the attribute '{@link gama.EVariable#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see gama.EVariable#getMax()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Max();

	/**
	 * Returns the meta object for the attribute '{@link gama.EVariable#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see gama.EVariable#getUpdate()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Update();

	/**
	 * Returns the meta object for the attribute '{@link gama.EVariable#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see gama.EVariable#getFunction()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Function();

	/**
	 * Returns the meta object for the attribute '{@link gama.EVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gama.EVariable#getType()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link gama.EVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gama.EVariable#getName()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link gama.EVariable#getHasError <em>Has Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Error</em>'.
	 * @see gama.EVariable#getHasError()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_HasError();

	/**
	 * Returns the meta object for the attribute '{@link gama.EVariable#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see gama.EVariable#getError()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Error();

	/**
	 * Returns the meta object for the reference '{@link gama.EVariable#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see gama.EVariable#getOwner()
	 * @see #getEVariable()
	 * @generated
	 */
	EReference getEVariable_Owner();

	/**
	 * Returns the meta object for class '{@link gama.EWorldAgent <em>EWorld Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EWorld Agent</em>'.
	 * @see gama.EWorldAgent
	 * @generated
	 */
	EClass getEWorldAgent();

	/**
	 * Returns the meta object for class '{@link gama.ELayer <em>ELayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELayer</em>'.
	 * @see gama.ELayer
	 * @generated
	 */
	EClass getELayer();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ELayer#getGamlCode()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_GamlCode();

	/**
	 * Returns the meta object for the reference '{@link gama.ELayer#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see gama.ELayer#getDisplay()
	 * @see #getELayer()
	 * @generated
	 */
	EReference getELayer_Display();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gama.ELayer#getType()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Type();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see gama.ELayer#getFile()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_File();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gama.ELayer#getText()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Text();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see gama.ELayer#getSize()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Size();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Species</em>'.
	 * @see gama.ELayer#getSpecies()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Species();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agents</em>'.
	 * @see gama.ELayer#getAgents()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Agents();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect</em>'.
	 * @see gama.ELayer#getAspect()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Aspect();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see gama.ELayer#getColor()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Color();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getIsColorCst <em>Is Color Cst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Color Cst</em>'.
	 * @see gama.ELayer#getIsColorCst()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_IsColorCst();

	/**
	 * Returns the meta object for the attribute list '{@link gama.ELayer#getColorRBG <em>Color RBG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Color RBG</em>'.
	 * @see gama.ELayer#getColorRBG()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_ColorRBG();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid</em>'.
	 * @see gama.ELayer#getGrid()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Grid();

	/**
	 * Returns the meta object for the reference list '{@link gama.ELayer#getChartlayers <em>Chartlayers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chartlayers</em>'.
	 * @see gama.ELayer#getChartlayers()
	 * @see #getELayer()
	 * @generated
	 */
	EReference getELayer_Chartlayers();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#getChart_type <em>Chart type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chart type</em>'.
	 * @see gama.ELayer#getChart_type()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Chart_type();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayer#isShowLines <em>Show Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Lines</em>'.
	 * @see gama.ELayer#isShowLines()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_ShowLines();

	/**
	 * Returns the meta object for class '{@link gama.EExperimentLink <em>EExperiment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EExperiment Link</em>'.
	 * @see gama.EExperimentLink
	 * @generated
	 */
	EClass getEExperimentLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EExperimentLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.EExperimentLink#getSpecies()
	 * @see #getEExperimentLink()
	 * @generated
	 */
	EReference getEExperimentLink_Species();

	/**
	 * Returns the meta object for the reference '{@link gama.EExperimentLink#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Experiment</em>'.
	 * @see gama.EExperimentLink#getExperiment()
	 * @see #getEExperimentLink()
	 * @generated
	 */
	EReference getEExperimentLink_Experiment();

	/**
	 * Returns the meta object for class '{@link gama.ELayerAspect <em>ELayer Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELayer Aspect</em>'.
	 * @see gama.ELayerAspect
	 * @generated
	 */
	EClass getELayerAspect();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ELayerAspect#getGamlCode()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_GamlCode();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gama.ELayerAspect#getShape()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Shape();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see gama.ELayerAspect#getColor()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Color();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty</em>'.
	 * @see gama.ELayerAspect#getEmpty()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Empty();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getRotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotate</em>'.
	 * @see gama.ELayerAspect#getRotate()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Rotate();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see gama.ELayerAspect#getSize()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Size();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see gama.ELayerAspect#getWidth()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Width();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see gama.ELayerAspect#getHeigth()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see gama.ELayerAspect#getRadius()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Radius();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see gama.ELayerAspect#getPath()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Path();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gama.ELayerAspect#getText()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Text();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gama.ELayerAspect#getType()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Type();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see gama.ELayerAspect#getExpression()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Expression();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see gama.ELayerAspect#getPoints()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Points();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At</em>'.
	 * @see gama.ELayerAspect#getAt()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_At();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getShapeType <em>Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Type</em>'.
	 * @see gama.ELayerAspect#getShapeType()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_ShapeType();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getIsColorCst <em>Is Color Cst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Color Cst</em>'.
	 * @see gama.ELayerAspect#getIsColorCst()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_IsColorCst();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Size</em>'.
	 * @see gama.ELayerAspect#getTextSize()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_TextSize();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getImageSize <em>Image Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Size</em>'.
	 * @see gama.ELayerAspect#getImageSize()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_ImageSize();

	/**
	 * Returns the meta object for the attribute list '{@link gama.ELayerAspect#getColorRBG <em>Color RBG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Color RBG</em>'.
	 * @see gama.ELayerAspect#getColorRBG()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_ColorRBG();

	/**
	 * Returns the meta object for the reference '{@link gama.ELayerAspect#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aspect</em>'.
	 * @see gama.ELayerAspect#getAspect()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EReference getELayerAspect_Aspect();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see gama.ELayerAspect#getDepth()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Depth();

	/**
	 * Returns the meta object for the attribute '{@link gama.ELayerAspect#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture</em>'.
	 * @see gama.ELayerAspect#getTexture()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Texture();

	/**
	 * Returns the meta object for class '{@link gama.EInheritLink <em>EInherit Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EInherit Link</em>'.
	 * @see gama.EInheritLink
	 * @generated
	 */
	EClass getEInheritLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EInheritLink#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see gama.EInheritLink#getParent()
	 * @see #getEInheritLink()
	 * @generated
	 */
	EReference getEInheritLink_Parent();

	/**
	 * Returns the meta object for the reference '{@link gama.EInheritLink#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see gama.EInheritLink#getChild()
	 * @see #getEInheritLink()
	 * @generated
	 */
	EReference getEInheritLink_Child();

	/**
	 * Returns the meta object for class '{@link gama.EChartLayer <em>EChart Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EChart Layer</em>'.
	 * @see gama.EChartLayer
	 * @generated
	 */
	EClass getEChartLayer();

	/**
	 * Returns the meta object for the attribute '{@link gama.EChartLayer#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see gama.EChartLayer#getStyle()
	 * @see #getEChartLayer()
	 * @generated
	 */
	EAttribute getEChartLayer_Style();

	/**
	 * Returns the meta object for the attribute '{@link gama.EChartLayer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see gama.EChartLayer#getColor()
	 * @see #getEChartLayer()
	 * @generated
	 */
	EAttribute getEChartLayer_Color();

	/**
	 * Returns the meta object for the attribute '{@link gama.EChartLayer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gama.EChartLayer#getValue()
	 * @see #getEChartLayer()
	 * @generated
	 */
	EAttribute getEChartLayer_Value();

	/**
	 * Returns the meta object for class '{@link gama.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EParameter</em>'.
	 * @see gama.EParameter
	 * @generated
	 */
	EClass getEParameter();

	/**
	 * Returns the meta object for the attribute '{@link gama.EParameter#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see gama.EParameter#getVariable()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Variable();

	/**
	 * Returns the meta object for the attribute '{@link gama.EParameter#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see gama.EParameter#getMin()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Min();

	/**
	 * Returns the meta object for the attribute '{@link gama.EParameter#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see gama.EParameter#getInit()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Init();

	/**
	 * Returns the meta object for the attribute '{@link gama.EParameter#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see gama.EParameter#getStep()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Step();

	/**
	 * Returns the meta object for the attribute '{@link gama.EParameter#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see gama.EParameter#getMax()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Max();

	/**
	 * Returns the meta object for the attribute '{@link gama.EParameter#getAmong <em>Among</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Among</em>'.
	 * @see gama.EParameter#getAmong()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Among();

	/**
	 * Returns the meta object for the attribute '{@link gama.EParameter#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see gama.EParameter#getCategory()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Category();

	/**
	 * Returns the meta object for class '{@link gama.EMonitor <em>EMonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMonitor</em>'.
	 * @see gama.EMonitor
	 * @generated
	 */
	EClass getEMonitor();

	/**
	 * Returns the meta object for the attribute '{@link gama.EMonitor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gama.EMonitor#getValue()
	 * @see #getEMonitor()
	 * @generated
	 */
	EAttribute getEMonitor_Value();

	/**
	 * Returns the meta object for class '{@link gama.EFacet <em>EFacet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFacet</em>'.
	 * @see gama.EFacet
	 * @generated
	 */
	EClass getEFacet();

	/**
	 * Returns the meta object for the attribute '{@link gama.EFacet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gama.EFacet#getName()
	 * @see #getEFacet()
	 * @generated
	 */
	EAttribute getEFacet_Name();

	/**
	 * Returns the meta object for the reference '{@link gama.EFacet#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see gama.EFacet#getOwner()
	 * @see #getEFacet()
	 * @generated
	 */
	EReference getEFacet_Owner();

	/**
	 * Returns the meta object for the attribute '{@link gama.EFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gama.EFacet#getValue()
	 * @see #getEFacet()
	 * @generated
	 */
	EAttribute getEFacet_Value();

	/**
	 * Returns the meta object for class '{@link gama.EPlan <em>EPlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPlan</em>'.
	 * @see gama.EPlan
	 * @generated
	 */
	EClass getEPlan();

	/**
	 * Returns the meta object for the attribute '{@link gama.EPlan#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.EPlan#getGamlCode()
	 * @see #getEPlan()
	 * @generated
	 */
	EAttribute getEPlan_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.EPlan#getPlanLinks <em>Plan Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plan Links</em>'.
	 * @see gama.EPlan#getPlanLinks()
	 * @see #getEPlan()
	 * @generated
	 */
	EReference getEPlan_PlanLinks();

	/**
	 * Returns the meta object for class '{@link gama.EState <em>EState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EState</em>'.
	 * @see gama.EState
	 * @generated
	 */
	EClass getEState();

	/**
	 * Returns the meta object for the attribute '{@link gama.EState#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.EState#getGamlCode()
	 * @see #getEState()
	 * @generated
	 */
	EAttribute getEState_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.EState#getStateLinks <em>State Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Links</em>'.
	 * @see gama.EState#getStateLinks()
	 * @see #getEState()
	 * @generated
	 */
	EReference getEState_StateLinks();

	/**
	 * Returns the meta object for class '{@link gama.ETask <em>ETask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETask</em>'.
	 * @see gama.ETask
	 * @generated
	 */
	EClass getETask();

	/**
	 * Returns the meta object for the attribute '{@link gama.ETask#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ETask#getGamlCode()
	 * @see #getETask()
	 * @generated
	 */
	EAttribute getETask_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ETask#getTaskLinks <em>Task Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Links</em>'.
	 * @see gama.ETask#getTaskLinks()
	 * @see #getETask()
	 * @generated
	 */
	EReference getETask_TaskLinks();

	/**
	 * Returns the meta object for class '{@link gama.EPlanLink <em>EPlan Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPlan Link</em>'.
	 * @see gama.EPlanLink
	 * @generated
	 */
	EClass getEPlanLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EPlanLink#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan</em>'.
	 * @see gama.EPlanLink#getPlan()
	 * @see #getEPlanLink()
	 * @generated
	 */
	EReference getEPlanLink_Plan();

	/**
	 * Returns the meta object for the reference '{@link gama.EPlanLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.EPlanLink#getSpecies()
	 * @see #getEPlanLink()
	 * @generated
	 */
	EReference getEPlanLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.EStateLink <em>EState Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EState Link</em>'.
	 * @see gama.EStateLink
	 * @generated
	 */
	EClass getEStateLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EStateLink#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see gama.EStateLink#getState()
	 * @see #getEStateLink()
	 * @generated
	 */
	EReference getEStateLink_State();

	/**
	 * Returns the meta object for the reference '{@link gama.EStateLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.EStateLink#getSpecies()
	 * @see #getEStateLink()
	 * @generated
	 */
	EReference getEStateLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.ETaskLink <em>ETask Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETask Link</em>'.
	 * @see gama.ETaskLink
	 * @generated
	 */
	EClass getETaskLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ETaskLink#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see gama.ETaskLink#getTask()
	 * @see #getETaskLink()
	 * @generated
	 */
	EReference getETaskLink_Task();

	/**
	 * Returns the meta object for the reference '{@link gama.ETaskLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ETaskLink#getSpecies()
	 * @see #getETaskLink()
	 * @generated
	 */
	EReference getETaskLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.EGrid <em>EGrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGrid</em>'.
	 * @see gama.EGrid
	 * @generated
	 */
	EClass getEGrid();

	/**
	 * Returns the meta object for class '{@link gama.EPerceive <em>EPerceive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPerceive</em>'.
	 * @see gama.EPerceive
	 * @generated
	 */
	EClass getEPerceive();

	/**
	 * Returns the meta object for the attribute '{@link gama.EPerceive#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.EPerceive#getGamlCode()
	 * @see #getEPerceive()
	 * @generated
	 */
	EAttribute getEPerceive_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.EPerceive#getPerceiveLinks <em>Perceive Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perceive Links</em>'.
	 * @see gama.EPerceive#getPerceiveLinks()
	 * @see #getEPerceive()
	 * @generated
	 */
	EReference getEPerceive_PerceiveLinks();

	/**
	 * Returns the meta object for class '{@link gama.EPerceiveLink <em>EPerceive Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPerceive Link</em>'.
	 * @see gama.EPerceiveLink
	 * @generated
	 */
	EClass getEPerceiveLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EPerceiveLink#getPerceive <em>Perceive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perceive</em>'.
	 * @see gama.EPerceiveLink#getPerceive()
	 * @see #getEPerceiveLink()
	 * @generated
	 */
	EReference getEPerceiveLink_Perceive();

	/**
	 * Returns the meta object for the reference '{@link gama.EPerceiveLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.EPerceiveLink#getSpecies()
	 * @see #getEPerceiveLink()
	 * @generated
	 */
	EReference getEPerceiveLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.ERule <em>ERule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERule</em>'.
	 * @see gama.ERule
	 * @generated
	 */
	EClass getERule();

	/**
	 * Returns the meta object for the attribute '{@link gama.ERule#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ERule#getGamlCode()
	 * @see #getERule()
	 * @generated
	 */
	EAttribute getERule_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ERule#getRuleLinks <em>Rule Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rule Links</em>'.
	 * @see gama.ERule#getRuleLinks()
	 * @see #getERule()
	 * @generated
	 */
	EReference getERule_RuleLinks();

	/**
	 * Returns the meta object for class '{@link gama.ERuleLink <em>ERule Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERule Link</em>'.
	 * @see gama.ERuleLink
	 * @generated
	 */
	EClass getERuleLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ERuleLink#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see gama.ERuleLink#getRule()
	 * @see #getERuleLink()
	 * @generated
	 */
	EReference getERuleLink_Rule();

	/**
	 * Returns the meta object for the reference '{@link gama.ERuleLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ERuleLink#getSpecies()
	 * @see #getERuleLink()
	 * @generated
	 */
	EReference getERuleLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.EEquation <em>EEquation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEquation</em>'.
	 * @see gama.EEquation
	 * @generated
	 */
	EClass getEEquation();

	/**
	 * Returns the meta object for the attribute '{@link gama.EEquation#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.EEquation#getGamlCode()
	 * @see #getEEquation()
	 * @generated
	 */
	EAttribute getEEquation_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.EEquation#getEquationLinks <em>Equation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equation Links</em>'.
	 * @see gama.EEquation#getEquationLinks()
	 * @see #getEEquation()
	 * @generated
	 */
	EReference getEEquation_EquationLinks();

	/**
	 * Returns the meta object for class '{@link gama.EEquationLink <em>EEquation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEquation Link</em>'.
	 * @see gama.EEquationLink
	 * @generated
	 */
	EClass getEEquationLink();

	/**
	 * Returns the meta object for the reference '{@link gama.EEquationLink#getEquation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equation</em>'.
	 * @see gama.EEquationLink#getEquation()
	 * @see #getEEquationLink()
	 * @generated
	 */
	EReference getEEquationLink_Equation();

	/**
	 * Returns the meta object for the reference '{@link gama.EEquationLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.EEquationLink#getSpecies()
	 * @see #getEEquationLink()
	 * @generated
	 */
	EReference getEEquationLink_Species();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GamaFactory getGamaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gama.impl.EGamaModelImpl <em>EGama Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EGamaModelImpl
		 * @see gama.impl.GamaPackageImpl#getEGamaModel()
		 * @generated
		 */
		EClass EGAMA_MODEL = eINSTANCE.getEGamaModel();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGAMA_MODEL__OBJECTS = eINSTANCE.getEGamaModel_Objects();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EGAMA_MODEL__NAME = eINSTANCE.getEGamaModel_Name();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGAMA_MODEL__LINKS = eINSTANCE.getEGamaModel_Links();

		/**
		 * The meta object literal for the '{@link gama.impl.EGamaObjectImpl <em>EGama Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EGamaObjectImpl
		 * @see gama.impl.GamaPackageImpl#getEGamaObject()
		 * @generated
		 */
		EClass EGAMA_OBJECT = eINSTANCE.getEGamaObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EGAMA_OBJECT__NAME = eINSTANCE.getEGamaObject_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGAMA_OBJECT__MODEL = eINSTANCE.getEGamaObject_Model();

		/**
		 * The meta object literal for the '<em><b>Color Picto</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EGAMA_OBJECT__COLOR_PICTO = eINSTANCE.getEGamaObject_ColorPicto();

		/**
		 * The meta object literal for the '<em><b>Has Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EGAMA_OBJECT__HAS_ERROR = eINSTANCE.getEGamaObject_HasError();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EGAMA_OBJECT__ERROR = eINSTANCE.getEGamaObject_Error();

		/**
		 * The meta object literal for the '<em><b>Facets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGAMA_OBJECT__FACETS = eINSTANCE.getEGamaObject_Facets();

		/**
		 * The meta object literal for the '{@link gama.impl.ESpeciesImpl <em>ESpecies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.ESpeciesImpl
		 * @see gama.impl.GamaPackageImpl#getESpecies()
		 * @generated
		 */
		EClass ESPECIES = eINSTANCE.getESpecies();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__VARIABLES = eINSTANCE.getESpecies_Variables();

		/**
		 * The meta object literal for the '<em><b>Reflex List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESPECIES__REFLEX_LIST = eINSTANCE.getESpecies_ReflexList();

		/**
		 * The meta object literal for the '<em><b>Experiment Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__EXPERIMENT_LINKS = eINSTANCE.getESpecies_ExperimentLinks();

		/**
		 * The meta object literal for the '<em><b>Aspect Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__ASPECT_LINKS = eINSTANCE.getESpecies_AspectLinks();

		/**
		 * The meta object literal for the '<em><b>Action Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__ACTION_LINKS = eINSTANCE.getESpecies_ActionLinks();

		/**
		 * The meta object literal for the '<em><b>Reflex Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__REFLEX_LINKS = eINSTANCE.getESpecies_ReflexLinks();

		/**
		 * The meta object literal for the '<em><b>Micro Species Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__MICRO_SPECIES_LINKS = eINSTANCE.getESpecies_MicroSpeciesLinks();

		/**
		 * The meta object literal for the '<em><b>Macro Species Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__MACRO_SPECIES_LINKS = eINSTANCE.getESpecies_MacroSpeciesLinks();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESPECIES__SKILLS = eINSTANCE.getESpecies_Skills();

		/**
		 * The meta object literal for the '<em><b>Inherits From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__INHERITS_FROM = eINSTANCE.getESpecies_InheritsFrom();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESPECIES__INIT = eINSTANCE.getESpecies_Init();

		/**
		 * The meta object literal for the '<em><b>Inheriting Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__INHERITING_LINKS = eINSTANCE.getESpecies_InheritingLinks();

		/**
		 * The meta object literal for the '<em><b>Plan Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__PLAN_LINKS = eINSTANCE.getESpecies_PlanLinks();

		/**
		 * The meta object literal for the '<em><b>State Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__STATE_LINKS = eINSTANCE.getESpecies_StateLinks();

		/**
		 * The meta object literal for the '<em><b>Task Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__TASK_LINKS = eINSTANCE.getESpecies_TaskLinks();

		/**
		 * The meta object literal for the '<em><b>Perceive Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__PERCEIVE_LINKS = eINSTANCE.getESpecies_PerceiveLinks();

		/**
		 * The meta object literal for the '<em><b>Rule Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__RULE_LINKS = eINSTANCE.getESpecies_RuleLinks();

		/**
		 * The meta object literal for the '<em><b>Equation Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPECIES__EQUATION_LINKS = eINSTANCE.getESpecies_EquationLinks();

		/**
		 * The meta object literal for the '{@link gama.impl.EActionImpl <em>EAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EActionImpl
		 * @see gama.impl.GamaPackageImpl#getEAction()
		 * @generated
		 */
		EClass EACTION = eINSTANCE.getEAction();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EACTION__GAML_CODE = eINSTANCE.getEAction_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Action Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EACTION__ACTION_LINKS = eINSTANCE.getEAction_ActionLinks();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EACTION__VARIABLES = eINSTANCE.getEAction_Variables();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EACTION__RETURN_TYPE = eINSTANCE.getEAction_ReturnType();

		/**
		 * The meta object literal for the '{@link gama.impl.EAspectImpl <em>EAspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EAspectImpl
		 * @see gama.impl.GamaPackageImpl#getEAspect()
		 * @generated
		 */
		EClass EASPECT = eINSTANCE.getEAspect();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASPECT__GAML_CODE = eINSTANCE.getEAspect_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Aspect Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASPECT__ASPECT_LINKS = eINSTANCE.getEAspect_AspectLinks();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASPECT__LAYERS = eINSTANCE.getEAspect_Layers();

		/**
		 * The meta object literal for the '<em><b>Define Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASPECT__DEFINE_GAML_CODE = eINSTANCE.getEAspect_DefineGamlCode();

		/**
		 * The meta object literal for the '{@link gama.impl.EReflexImpl <em>EReflex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EReflexImpl
		 * @see gama.impl.GamaPackageImpl#getEReflex()
		 * @generated
		 */
		EClass EREFLEX = eINSTANCE.getEReflex();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFLEX__GAML_CODE = eINSTANCE.getEReflex_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Reflex Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFLEX__REFLEX_LINKS = eINSTANCE.getEReflex_ReflexLinks();

		/**
		 * The meta object literal for the '{@link gama.impl.EExperimentImpl <em>EExperiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EExperimentImpl
		 * @see gama.impl.GamaPackageImpl#getEExperiment()
		 * @generated
		 */
		EClass EEXPERIMENT = eINSTANCE.getEExperiment();

		/**
		 * The meta object literal for the '<em><b>Experiment Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEXPERIMENT__EXPERIMENT_LINK = eINSTANCE.getEExperiment_ExperimentLink();

		/**
		 * The meta object literal for the '<em><b>Display Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEXPERIMENT__DISPLAY_LINKS = eINSTANCE.getEExperiment_DisplayLinks();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEXPERIMENT__PARAMETERS = eINSTANCE.getEExperiment_Parameters();

		/**
		 * The meta object literal for the '<em><b>Monitors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEXPERIMENT__MONITORS = eINSTANCE.getEExperiment_Monitors();

		/**
		 * The meta object literal for the '{@link gama.impl.EGUIExperimentImpl <em>EGUI Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EGUIExperimentImpl
		 * @see gama.impl.GamaPackageImpl#getEGUIExperiment()
		 * @generated
		 */
		EClass EGUI_EXPERIMENT = eINSTANCE.getEGUIExperiment();

		/**
		 * The meta object literal for the '{@link gama.impl.EBatchExperimentImpl <em>EBatch Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EBatchExperimentImpl
		 * @see gama.impl.GamaPackageImpl#getEBatchExperiment()
		 * @generated
		 */
		EClass EBATCH_EXPERIMENT = eINSTANCE.getEBatchExperiment();

		/**
		 * The meta object literal for the '{@link gama.impl.EGamaLinkImpl <em>EGama Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EGamaLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEGamaLink()
		 * @generated
		 */
		EClass EGAMA_LINK = eINSTANCE.getEGamaLink();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGAMA_LINK__TARGET = eINSTANCE.getEGamaLink_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGAMA_LINK__SOURCE = eINSTANCE.getEGamaLink_Source();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGAMA_LINK__MODEL = eINSTANCE.getEGamaLink_Model();

		/**
		 * The meta object literal for the '{@link gama.impl.ESubSpeciesLinkImpl <em>ESub Species Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.ESubSpeciesLinkImpl
		 * @see gama.impl.GamaPackageImpl#getESubSpeciesLink()
		 * @generated
		 */
		EClass ESUB_SPECIES_LINK = eINSTANCE.getESubSpeciesLink();

		/**
		 * The meta object literal for the '<em><b>Macro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESUB_SPECIES_LINK__MACRO = eINSTANCE.getESubSpeciesLink_Macro();

		/**
		 * The meta object literal for the '<em><b>Micro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESUB_SPECIES_LINK__MICRO = eINSTANCE.getESubSpeciesLink_Micro();

		/**
		 * The meta object literal for the '{@link gama.impl.EActionLinkImpl <em>EAction Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EActionLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEActionLink()
		 * @generated
		 */
		EClass EACTION_LINK = eINSTANCE.getEActionLink();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EACTION_LINK__ACTION = eINSTANCE.getEActionLink_Action();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EACTION_LINK__SPECIES = eINSTANCE.getEActionLink_Species();

		/**
		 * The meta object literal for the '{@link gama.impl.EAspectLinkImpl <em>EAspect Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EAspectLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEAspectLink()
		 * @generated
		 */
		EClass EASPECT_LINK = eINSTANCE.getEAspectLink();

		/**
		 * The meta object literal for the '<em><b>Aspect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASPECT_LINK__ASPECT = eINSTANCE.getEAspectLink_Aspect();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASPECT_LINK__SPECIES = eINSTANCE.getEAspectLink_Species();

		/**
		 * The meta object literal for the '{@link gama.impl.EReflexLinkImpl <em>EReflex Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EReflexLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEReflexLink()
		 * @generated
		 */
		EClass EREFLEX_LINK = eINSTANCE.getEReflexLink();

		/**
		 * The meta object literal for the '<em><b>Reflex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFLEX_LINK__REFLEX = eINSTANCE.getEReflexLink_Reflex();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFLEX_LINK__SPECIES = eINSTANCE.getEReflexLink_Species();

		/**
		 * The meta object literal for the '{@link gama.impl.EDisplayLinkImpl <em>EDisplay Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EDisplayLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEDisplayLink()
		 * @generated
		 */
		EClass EDISPLAY_LINK = eINSTANCE.getEDisplayLink();

		/**
		 * The meta object literal for the '<em><b>Experiment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDISPLAY_LINK__EXPERIMENT = eINSTANCE.getEDisplayLink_Experiment();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDISPLAY_LINK__DISPLAY = eINSTANCE.getEDisplayLink_Display();

		/**
		 * The meta object literal for the '{@link gama.impl.EDisplayImpl <em>EDisplay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EDisplayImpl
		 * @see gama.impl.GamaPackageImpl#getEDisplay()
		 * @generated
		 */
		EClass EDISPLAY = eINSTANCE.getEDisplay();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDISPLAY__LAYERS = eINSTANCE.getEDisplay_Layers();

		/**
		 * The meta object literal for the '<em><b>Display Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDISPLAY__DISPLAY_LINK = eINSTANCE.getEDisplay_DisplayLink();

		/**
		 * The meta object literal for the '<em><b>Layer List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDISPLAY__LAYER_LIST = eINSTANCE.getEDisplay_LayerList();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDISPLAY__GAML_CODE = eINSTANCE.getEDisplay_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Define Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDISPLAY__DEFINE_GAML_CODE = eINSTANCE.getEDisplay_DefineGamlCode();

		/**
		 * The meta object literal for the '{@link gama.impl.EVariableImpl <em>EVariable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EVariableImpl
		 * @see gama.impl.GamaPackageImpl#getEVariable()
		 * @generated
		 */
		EClass EVARIABLE = eINSTANCE.getEVariable();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVARIABLE__INIT = eINSTANCE.getEVariable_Init();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVARIABLE__MIN = eINSTANCE.getEVariable_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVARIABLE__MAX = eINSTANCE.getEVariable_Max();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVARIABLE__UPDATE = eINSTANCE.getEVariable_Update();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVARIABLE__FUNCTION = eINSTANCE.getEVariable_Function();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVARIABLE__TYPE = eINSTANCE.getEVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVARIABLE__NAME = eINSTANCE.getEVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Has Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVARIABLE__HAS_ERROR = eINSTANCE.getEVariable_HasError();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVARIABLE__ERROR = eINSTANCE.getEVariable_Error();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVARIABLE__OWNER = eINSTANCE.getEVariable_Owner();

		/**
		 * The meta object literal for the '{@link gama.impl.EWorldAgentImpl <em>EWorld Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EWorldAgentImpl
		 * @see gama.impl.GamaPackageImpl#getEWorldAgent()
		 * @generated
		 */
		EClass EWORLD_AGENT = eINSTANCE.getEWorldAgent();

		/**
		 * The meta object literal for the '{@link gama.impl.ELayerImpl <em>ELayer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.ELayerImpl
		 * @see gama.impl.GamaPackageImpl#getELayer()
		 * @generated
		 */
		EClass ELAYER = eINSTANCE.getELayer();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__GAML_CODE = eINSTANCE.getELayer_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELAYER__DISPLAY = eINSTANCE.getELayer_Display();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__TYPE = eINSTANCE.getELayer_Type();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__FILE = eINSTANCE.getELayer_File();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__TEXT = eINSTANCE.getELayer_Text();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__SIZE = eINSTANCE.getELayer_Size();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__SPECIES = eINSTANCE.getELayer_Species();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__AGENTS = eINSTANCE.getELayer_Agents();

		/**
		 * The meta object literal for the '<em><b>Aspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__ASPECT = eINSTANCE.getELayer_Aspect();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__COLOR = eINSTANCE.getELayer_Color();

		/**
		 * The meta object literal for the '<em><b>Is Color Cst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__IS_COLOR_CST = eINSTANCE.getELayer_IsColorCst();

		/**
		 * The meta object literal for the '<em><b>Color RBG</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__COLOR_RBG = eINSTANCE.getELayer_ColorRBG();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__GRID = eINSTANCE.getELayer_Grid();

		/**
		 * The meta object literal for the '<em><b>Chartlayers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELAYER__CHARTLAYERS = eINSTANCE.getELayer_Chartlayers();

		/**
		 * The meta object literal for the '<em><b>Chart type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__CHART_TYPE = eINSTANCE.getELayer_Chart_type();

		/**
		 * The meta object literal for the '<em><b>Show Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER__SHOW_LINES = eINSTANCE.getELayer_ShowLines();

		/**
		 * The meta object literal for the '{@link gama.impl.EExperimentLinkImpl <em>EExperiment Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EExperimentLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEExperimentLink()
		 * @generated
		 */
		EClass EEXPERIMENT_LINK = eINSTANCE.getEExperimentLink();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEXPERIMENT_LINK__SPECIES = eINSTANCE.getEExperimentLink_Species();

		/**
		 * The meta object literal for the '<em><b>Experiment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEXPERIMENT_LINK__EXPERIMENT = eINSTANCE.getEExperimentLink_Experiment();

		/**
		 * The meta object literal for the '{@link gama.impl.ELayerAspectImpl <em>ELayer Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.ELayerAspectImpl
		 * @see gama.impl.GamaPackageImpl#getELayerAspect()
		 * @generated
		 */
		EClass ELAYER_ASPECT = eINSTANCE.getELayerAspect();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__GAML_CODE = eINSTANCE.getELayerAspect_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__SHAPE = eINSTANCE.getELayerAspect_Shape();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__COLOR = eINSTANCE.getELayerAspect_Color();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__EMPTY = eINSTANCE.getELayerAspect_Empty();

		/**
		 * The meta object literal for the '<em><b>Rotate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__ROTATE = eINSTANCE.getELayerAspect_Rotate();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__SIZE = eINSTANCE.getELayerAspect_Size();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__WIDTH = eINSTANCE.getELayerAspect_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__HEIGTH = eINSTANCE.getELayerAspect_Heigth();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__RADIUS = eINSTANCE.getELayerAspect_Radius();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__PATH = eINSTANCE.getELayerAspect_Path();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__TEXT = eINSTANCE.getELayerAspect_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__TYPE = eINSTANCE.getELayerAspect_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__EXPRESSION = eINSTANCE.getELayerAspect_Expression();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__POINTS = eINSTANCE.getELayerAspect_Points();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__AT = eINSTANCE.getELayerAspect_At();

		/**
		 * The meta object literal for the '<em><b>Shape Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__SHAPE_TYPE = eINSTANCE.getELayerAspect_ShapeType();

		/**
		 * The meta object literal for the '<em><b>Is Color Cst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__IS_COLOR_CST = eINSTANCE.getELayerAspect_IsColorCst();

		/**
		 * The meta object literal for the '<em><b>Text Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__TEXT_SIZE = eINSTANCE.getELayerAspect_TextSize();

		/**
		 * The meta object literal for the '<em><b>Image Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__IMAGE_SIZE = eINSTANCE.getELayerAspect_ImageSize();

		/**
		 * The meta object literal for the '<em><b>Color RBG</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__COLOR_RBG = eINSTANCE.getELayerAspect_ColorRBG();

		/**
		 * The meta object literal for the '<em><b>Aspect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELAYER_ASPECT__ASPECT = eINSTANCE.getELayerAspect_Aspect();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__DEPTH = eINSTANCE.getELayerAspect_Depth();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELAYER_ASPECT__TEXTURE = eINSTANCE.getELayerAspect_Texture();

		/**
		 * The meta object literal for the '{@link gama.impl.EInheritLinkImpl <em>EInherit Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EInheritLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEInheritLink()
		 * @generated
		 */
		EClass EINHERIT_LINK = eINSTANCE.getEInheritLink();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINHERIT_LINK__PARENT = eINSTANCE.getEInheritLink_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINHERIT_LINK__CHILD = eINSTANCE.getEInheritLink_Child();

		/**
		 * The meta object literal for the '{@link gama.impl.EChartLayerImpl <em>EChart Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EChartLayerImpl
		 * @see gama.impl.GamaPackageImpl#getEChartLayer()
		 * @generated
		 */
		EClass ECHART_LAYER = eINSTANCE.getEChartLayer();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECHART_LAYER__STYLE = eINSTANCE.getEChartLayer_Style();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECHART_LAYER__COLOR = eINSTANCE.getEChartLayer_Color();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECHART_LAYER__VALUE = eINSTANCE.getEChartLayer_Value();

		/**
		 * The meta object literal for the '{@link gama.impl.EParameterImpl <em>EParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EParameterImpl
		 * @see gama.impl.GamaPackageImpl#getEParameter()
		 * @generated
		 */
		EClass EPARAMETER = eINSTANCE.getEParameter();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPARAMETER__VARIABLE = eINSTANCE.getEParameter_Variable();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPARAMETER__MIN = eINSTANCE.getEParameter_Min();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPARAMETER__INIT = eINSTANCE.getEParameter_Init();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPARAMETER__STEP = eINSTANCE.getEParameter_Step();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPARAMETER__MAX = eINSTANCE.getEParameter_Max();

		/**
		 * The meta object literal for the '<em><b>Among</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPARAMETER__AMONG = eINSTANCE.getEParameter_Among();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPARAMETER__CATEGORY = eINSTANCE.getEParameter_Category();

		/**
		 * The meta object literal for the '{@link gama.impl.EMonitorImpl <em>EMonitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EMonitorImpl
		 * @see gama.impl.GamaPackageImpl#getEMonitor()
		 * @generated
		 */
		EClass EMONITOR = eINSTANCE.getEMonitor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMONITOR__VALUE = eINSTANCE.getEMonitor_Value();

		/**
		 * The meta object literal for the '{@link gama.impl.EFacetImpl <em>EFacet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EFacetImpl
		 * @see gama.impl.GamaPackageImpl#getEFacet()
		 * @generated
		 */
		EClass EFACET = eINSTANCE.getEFacet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFACET__NAME = eINSTANCE.getEFacet_Name();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFACET__OWNER = eINSTANCE.getEFacet_Owner();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFACET__VALUE = eINSTANCE.getEFacet_Value();

		/**
		 * The meta object literal for the '{@link gama.impl.EPlanImpl <em>EPlan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EPlanImpl
		 * @see gama.impl.GamaPackageImpl#getEPlan()
		 * @generated
		 */
		EClass EPLAN = eINSTANCE.getEPlan();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPLAN__GAML_CODE = eINSTANCE.getEPlan_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Plan Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPLAN__PLAN_LINKS = eINSTANCE.getEPlan_PlanLinks();

		/**
		 * The meta object literal for the '{@link gama.impl.EStateImpl <em>EState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EStateImpl
		 * @see gama.impl.GamaPackageImpl#getEState()
		 * @generated
		 */
		EClass ESTATE = eINSTANCE.getEState();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE__GAML_CODE = eINSTANCE.getEState_GamlCode();

		/**
		 * The meta object literal for the '<em><b>State Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTATE__STATE_LINKS = eINSTANCE.getEState_StateLinks();

		/**
		 * The meta object literal for the '{@link gama.impl.ETaskImpl <em>ETask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.ETaskImpl
		 * @see gama.impl.GamaPackageImpl#getETask()
		 * @generated
		 */
		EClass ETASK = eINSTANCE.getETask();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETASK__GAML_CODE = eINSTANCE.getETask_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Task Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETASK__TASK_LINKS = eINSTANCE.getETask_TaskLinks();

		/**
		 * The meta object literal for the '{@link gama.impl.EPlanLinkImpl <em>EPlan Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EPlanLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEPlanLink()
		 * @generated
		 */
		EClass EPLAN_LINK = eINSTANCE.getEPlanLink();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPLAN_LINK__PLAN = eINSTANCE.getEPlanLink_Plan();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPLAN_LINK__SPECIES = eINSTANCE.getEPlanLink_Species();

		/**
		 * The meta object literal for the '{@link gama.impl.EStateLinkImpl <em>EState Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EStateLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEStateLink()
		 * @generated
		 */
		EClass ESTATE_LINK = eINSTANCE.getEStateLink();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTATE_LINK__STATE = eINSTANCE.getEStateLink_State();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTATE_LINK__SPECIES = eINSTANCE.getEStateLink_Species();

		/**
		 * The meta object literal for the '{@link gama.impl.ETaskLinkImpl <em>ETask Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.ETaskLinkImpl
		 * @see gama.impl.GamaPackageImpl#getETaskLink()
		 * @generated
		 */
		EClass ETASK_LINK = eINSTANCE.getETaskLink();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETASK_LINK__TASK = eINSTANCE.getETaskLink_Task();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETASK_LINK__SPECIES = eINSTANCE.getETaskLink_Species();

		/**
		 * The meta object literal for the '{@link gama.impl.EGridImpl <em>EGrid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EGridImpl
		 * @see gama.impl.GamaPackageImpl#getEGrid()
		 * @generated
		 */
		EClass EGRID = eINSTANCE.getEGrid();

		/**
		 * The meta object literal for the '{@link gama.impl.EPerceiveImpl <em>EPerceive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EPerceiveImpl
		 * @see gama.impl.GamaPackageImpl#getEPerceive()
		 * @generated
		 */
		EClass EPERCEIVE = eINSTANCE.getEPerceive();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPERCEIVE__GAML_CODE = eINSTANCE.getEPerceive_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Perceive Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPERCEIVE__PERCEIVE_LINKS = eINSTANCE.getEPerceive_PerceiveLinks();

		/**
		 * The meta object literal for the '{@link gama.impl.EPerceiveLinkImpl <em>EPerceive Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EPerceiveLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEPerceiveLink()
		 * @generated
		 */
		EClass EPERCEIVE_LINK = eINSTANCE.getEPerceiveLink();

		/**
		 * The meta object literal for the '<em><b>Perceive</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPERCEIVE_LINK__PERCEIVE = eINSTANCE.getEPerceiveLink_Perceive();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPERCEIVE_LINK__SPECIES = eINSTANCE.getEPerceiveLink_Species();

		/**
		 * The meta object literal for the '{@link gama.impl.ERuleImpl <em>ERule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.ERuleImpl
		 * @see gama.impl.GamaPackageImpl#getERule()
		 * @generated
		 */
		EClass ERULE = eINSTANCE.getERule();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERULE__GAML_CODE = eINSTANCE.getERule_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Rule Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERULE__RULE_LINKS = eINSTANCE.getERule_RuleLinks();

		/**
		 * The meta object literal for the '{@link gama.impl.ERuleLinkImpl <em>ERule Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.ERuleLinkImpl
		 * @see gama.impl.GamaPackageImpl#getERuleLink()
		 * @generated
		 */
		EClass ERULE_LINK = eINSTANCE.getERuleLink();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERULE_LINK__RULE = eINSTANCE.getERuleLink_Rule();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERULE_LINK__SPECIES = eINSTANCE.getERuleLink_Species();

		/**
		 * The meta object literal for the '{@link gama.impl.EEquationImpl <em>EEquation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EEquationImpl
		 * @see gama.impl.GamaPackageImpl#getEEquation()
		 * @generated
		 */
		EClass EEQUATION = eINSTANCE.getEEquation();

		/**
		 * The meta object literal for the '<em><b>Gaml Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEQUATION__GAML_CODE = eINSTANCE.getEEquation_GamlCode();

		/**
		 * The meta object literal for the '<em><b>Equation Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEQUATION__EQUATION_LINKS = eINSTANCE.getEEquation_EquationLinks();

		/**
		 * The meta object literal for the '{@link gama.impl.EEquationLinkImpl <em>EEquation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.impl.EEquationLinkImpl
		 * @see gama.impl.GamaPackageImpl#getEEquationLink()
		 * @generated
		 */
		EClass EEQUATION_LINK = eINSTANCE.getEEquationLink();

		/**
		 * The meta object literal for the '<em><b>Equation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEQUATION_LINK__EQUATION = eINSTANCE.getEEquationLink_Equation();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEQUATION_LINK__SPECIES = eINSTANCE.getEEquationLink_Species();

	}

} //GamaPackage
