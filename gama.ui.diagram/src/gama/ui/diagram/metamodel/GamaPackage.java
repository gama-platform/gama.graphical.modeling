/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.ui.diagram.metamodel;

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
 * @see gama.ui.diagram.metamodel.GamaFactory
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
	GamaPackage eINSTANCE = gama.ui.diagram.metamodel.impl.GamaPackageImpl.init();

	/**
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EGamaModelImpl <em>EGama Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EGamaModelImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEGamaModel()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EGamaObjectImpl <em>EGama Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EGamaObjectImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEGamaObject()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.ESpeciesImpl <em>ESpecies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.ESpeciesImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getESpecies()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EActionImpl <em>EAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EActionImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEAction()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EAspectImpl <em>EAspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EAspectImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEAspect()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EReflexImpl <em>EReflex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EReflexImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEReflex()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EExperimentImpl <em>EExperiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EExperimentImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEExperiment()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EGUIExperimentImpl <em>EGUI Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EGUIExperimentImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEGUIExperiment()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EBatchExperimentImpl <em>EBatch Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EBatchExperimentImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEBatchExperiment()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EGamaLinkImpl <em>EGama Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EGamaLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEGamaLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.ESubSpeciesLinkImpl <em>ESub Species Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.ESubSpeciesLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getESubSpeciesLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EActionLinkImpl <em>EAction Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EActionLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEActionLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EAspectLinkImpl <em>EAspect Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EAspectLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEAspectLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EReflexLinkImpl <em>EReflex Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EReflexLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEReflexLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EDisplayLinkImpl <em>EDisplay Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EDisplayLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEDisplayLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EDisplayImpl <em>EDisplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EDisplayImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEDisplay()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EVariableImpl <em>EVariable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EVariableImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEVariable()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EWorldAgentImpl <em>EWorld Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EWorldAgentImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEWorldAgent()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.ELayerImpl <em>ELayer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.ELayerImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getELayer()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EExperimentLinkImpl <em>EExperiment Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EExperimentLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEExperimentLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.ELayerAspectImpl <em>ELayer Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.ELayerAspectImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getELayerAspect()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EInheritLinkImpl <em>EInherit Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EInheritLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEInheritLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EChartLayerImpl <em>EChart Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EChartLayerImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEChartLayer()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EParameterImpl <em>EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EParameterImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEParameter()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EMonitorImpl <em>EMonitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EMonitorImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEMonitor()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EFacetImpl <em>EFacet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EFacetImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEFacet()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EPlanImpl <em>EPlan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EPlanImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEPlan()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EStateImpl <em>EState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EStateImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEState()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.ETaskImpl <em>ETask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.ETaskImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getETask()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EPlanLinkImpl <em>EPlan Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EPlanLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEPlanLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EStateLinkImpl <em>EState Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EStateLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEStateLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.ETaskLinkImpl <em>ETask Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.ETaskLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getETaskLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EGridImpl <em>EGrid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EGridImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEGrid()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EPerceiveImpl <em>EPerceive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EPerceiveImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEPerceive()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EPerceiveLinkImpl <em>EPerceive Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EPerceiveLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEPerceiveLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.ERuleImpl <em>ERule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.ERuleImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getERule()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.ERuleLinkImpl <em>ERule Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.ERuleLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getERuleLink()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EEquationImpl <em>EEquation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EEquationImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEEquation()
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
	 * The meta object id for the '{@link gama.ui.diagram.metamodel.impl.EEquationLinkImpl <em>EEquation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gama.ui.diagram.metamodel.impl.EEquationLinkImpl
	 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEEquationLink()
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
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EGamaModel <em>EGama Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGama Model</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaModel
	 * @generated
	 */
	EClass getEGamaModel();

	/**
	 * Returns the meta object for the containment reference list '{@link gama.ui.diagram.metamodel.EGamaModel#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaModel#getObjects()
	 * @see #getEGamaModel()
	 * @generated
	 */
	EReference getEGamaModel_Objects();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EGamaModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaModel#getName()
	 * @see #getEGamaModel()
	 * @generated
	 */
	EAttribute getEGamaModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gama.ui.diagram.metamodel.EGamaModel#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaModel#getLinks()
	 * @see #getEGamaModel()
	 * @generated
	 */
	EReference getEGamaModel_Links();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EGamaObject <em>EGama Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGama Object</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaObject
	 * @generated
	 */
	EClass getEGamaObject();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EGamaObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaObject#getName()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EAttribute getEGamaObject_Name();

	/**
	 * Returns the meta object for the container reference '{@link gama.ui.diagram.metamodel.EGamaObject#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaObject#getModel()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EReference getEGamaObject_Model();

	/**
	 * Returns the meta object for the attribute list '{@link gama.ui.diagram.metamodel.EGamaObject#getColorPicto <em>Color Picto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Color Picto</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaObject#getColorPicto()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EAttribute getEGamaObject_ColorPicto();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EGamaObject#getHasError <em>Has Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Error</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaObject#getHasError()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EAttribute getEGamaObject_HasError();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EGamaObject#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaObject#getError()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EAttribute getEGamaObject_Error();

	/**
	 * Returns the meta object for the containment reference list '{@link gama.ui.diagram.metamodel.EGamaObject#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facets</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaObject#getFacets()
	 * @see #getEGamaObject()
	 * @generated
	 */
	EReference getEGamaObject_Facets();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.ESpecies <em>ESpecies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESpecies</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies
	 * @generated
	 */
	EClass getESpecies();

	/**
	 * Returns the meta object for the containment reference list '{@link gama.ui.diagram.metamodel.ESpecies#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getVariables()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_Variables();

	/**
	 * Returns the meta object for the attribute list '{@link gama.ui.diagram.metamodel.ESpecies#getReflexList <em>Reflex List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reflex List</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getReflexList()
	 * @see #getESpecies()
	 * @generated
	 */
	EAttribute getESpecies_ReflexList();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getExperimentLinks <em>Experiment Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Experiment Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getExperimentLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_ExperimentLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getAspectLinks <em>Aspect Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aspect Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getAspectLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_AspectLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getActionLinks <em>Action Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getActionLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_ActionLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getReflexLinks <em>Reflex Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reflex Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getReflexLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_ReflexLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getMicroSpeciesLinks <em>Micro Species Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Micro Species Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getMicroSpeciesLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_MicroSpeciesLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getMacroSpeciesLinks <em>Macro Species Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Macro Species Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getMacroSpeciesLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_MacroSpeciesLinks();

	/**
	 * Returns the meta object for the attribute list '{@link gama.ui.diagram.metamodel.ESpecies#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Skills</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getSkills()
	 * @see #getESpecies()
	 * @generated
	 */
	EAttribute getESpecies_Skills();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.ESpecies#getInheritsFrom <em>Inherits From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inherits From</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getInheritsFrom()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_InheritsFrom();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ESpecies#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getInit()
	 * @see #getESpecies()
	 * @generated
	 */
	EAttribute getESpecies_Init();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getInheritingLinks <em>Inheriting Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inheriting Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getInheritingLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_InheritingLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getPlanLinks <em>Plan Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plan Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getPlanLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_PlanLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getStateLinks <em>State Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getStateLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_StateLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getTaskLinks <em>Task Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getTaskLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_TaskLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getPerceiveLinks <em>Perceive Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perceive Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getPerceiveLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_PerceiveLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getRuleLinks <em>Rule Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rule Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getRuleLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_RuleLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ESpecies#getEquationLinks <em>Equation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equation Links</em>'.
	 * @see gama.ui.diagram.metamodel.ESpecies#getEquationLinks()
	 * @see #getESpecies()
	 * @generated
	 */
	EReference getESpecies_EquationLinks();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EAction <em>EAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAction</em>'.
	 * @see gama.ui.diagram.metamodel.EAction
	 * @generated
	 */
	EClass getEAction();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EAction#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.EAction#getGamlCode()
	 * @see #getEAction()
	 * @generated
	 */
	EAttribute getEAction_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EAction#getActionLinks <em>Action Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Links</em>'.
	 * @see gama.ui.diagram.metamodel.EAction#getActionLinks()
	 * @see #getEAction()
	 * @generated
	 */
	EReference getEAction_ActionLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link gama.ui.diagram.metamodel.EAction#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see gama.ui.diagram.metamodel.EAction#getVariables()
	 * @see #getEAction()
	 * @generated
	 */
	EReference getEAction_Variables();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EAction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see gama.ui.diagram.metamodel.EAction#getReturnType()
	 * @see #getEAction()
	 * @generated
	 */
	EAttribute getEAction_ReturnType();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EAspect <em>EAspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAspect</em>'.
	 * @see gama.ui.diagram.metamodel.EAspect
	 * @generated
	 */
	EClass getEAspect();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EAspect#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.EAspect#getGamlCode()
	 * @see #getEAspect()
	 * @generated
	 */
	EAttribute getEAspect_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EAspect#getAspectLinks <em>Aspect Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aspect Links</em>'.
	 * @see gama.ui.diagram.metamodel.EAspect#getAspectLinks()
	 * @see #getEAspect()
	 * @generated
	 */
	EReference getEAspect_AspectLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EAspect#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layers</em>'.
	 * @see gama.ui.diagram.metamodel.EAspect#getLayers()
	 * @see #getEAspect()
	 * @generated
	 */
	EReference getEAspect_Layers();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EAspect#isDefineGamlCode <em>Define Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Define Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.EAspect#isDefineGamlCode()
	 * @see #getEAspect()
	 * @generated
	 */
	EAttribute getEAspect_DefineGamlCode();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EReflex <em>EReflex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReflex</em>'.
	 * @see gama.ui.diagram.metamodel.EReflex
	 * @generated
	 */
	EClass getEReflex();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EReflex#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.EReflex#getGamlCode()
	 * @see #getEReflex()
	 * @generated
	 */
	EAttribute getEReflex_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EReflex#getReflexLinks <em>Reflex Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reflex Links</em>'.
	 * @see gama.ui.diagram.metamodel.EReflex#getReflexLinks()
	 * @see #getEReflex()
	 * @generated
	 */
	EReference getEReflex_ReflexLinks();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EExperiment <em>EExperiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EExperiment</em>'.
	 * @see gama.ui.diagram.metamodel.EExperiment
	 * @generated
	 */
	EClass getEExperiment();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EExperiment#getExperimentLink <em>Experiment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Experiment Link</em>'.
	 * @see gama.ui.diagram.metamodel.EExperiment#getExperimentLink()
	 * @see #getEExperiment()
	 * @generated
	 */
	EReference getEExperiment_ExperimentLink();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EExperiment#getDisplayLinks <em>Display Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Display Links</em>'.
	 * @see gama.ui.diagram.metamodel.EExperiment#getDisplayLinks()
	 * @see #getEExperiment()
	 * @generated
	 */
	EReference getEExperiment_DisplayLinks();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EExperiment#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see gama.ui.diagram.metamodel.EExperiment#getParameters()
	 * @see #getEExperiment()
	 * @generated
	 */
	EReference getEExperiment_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EExperiment#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitors</em>'.
	 * @see gama.ui.diagram.metamodel.EExperiment#getMonitors()
	 * @see #getEExperiment()
	 * @generated
	 */
	EReference getEExperiment_Monitors();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EGUIExperiment <em>EGUI Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGUI Experiment</em>'.
	 * @see gama.ui.diagram.metamodel.EGUIExperiment
	 * @generated
	 */
	EClass getEGUIExperiment();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EBatchExperiment <em>EBatch Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBatch Experiment</em>'.
	 * @see gama.ui.diagram.metamodel.EBatchExperiment
	 * @generated
	 */
	EClass getEBatchExperiment();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EGamaLink <em>EGama Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGama Link</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaLink
	 * @generated
	 */
	EClass getEGamaLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EGamaLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaLink#getTarget()
	 * @see #getEGamaLink()
	 * @generated
	 */
	EReference getEGamaLink_Target();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EGamaLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaLink#getSource()
	 * @see #getEGamaLink()
	 * @generated
	 */
	EReference getEGamaLink_Source();

	/**
	 * Returns the meta object for the container reference '{@link gama.ui.diagram.metamodel.EGamaLink#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see gama.ui.diagram.metamodel.EGamaLink#getModel()
	 * @see #getEGamaLink()
	 * @generated
	 */
	EReference getEGamaLink_Model();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.ESubSpeciesLink <em>ESub Species Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESub Species Link</em>'.
	 * @see gama.ui.diagram.metamodel.ESubSpeciesLink
	 * @generated
	 */
	EClass getESubSpeciesLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.ESubSpeciesLink#getMacro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Macro</em>'.
	 * @see gama.ui.diagram.metamodel.ESubSpeciesLink#getMacro()
	 * @see #getESubSpeciesLink()
	 * @generated
	 */
	EReference getESubSpeciesLink_Macro();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.ESubSpeciesLink#getMicro <em>Micro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Micro</em>'.
	 * @see gama.ui.diagram.metamodel.ESubSpeciesLink#getMicro()
	 * @see #getESubSpeciesLink()
	 * @generated
	 */
	EReference getESubSpeciesLink_Micro();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EActionLink <em>EAction Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAction Link</em>'.
	 * @see gama.ui.diagram.metamodel.EActionLink
	 * @generated
	 */
	EClass getEActionLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EActionLink#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see gama.ui.diagram.metamodel.EActionLink#getAction()
	 * @see #getEActionLink()
	 * @generated
	 */
	EReference getEActionLink_Action();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EActionLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.EActionLink#getSpecies()
	 * @see #getEActionLink()
	 * @generated
	 */
	EReference getEActionLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EAspectLink <em>EAspect Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAspect Link</em>'.
	 * @see gama.ui.diagram.metamodel.EAspectLink
	 * @generated
	 */
	EClass getEAspectLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EAspectLink#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aspect</em>'.
	 * @see gama.ui.diagram.metamodel.EAspectLink#getAspect()
	 * @see #getEAspectLink()
	 * @generated
	 */
	EReference getEAspectLink_Aspect();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EAspectLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.EAspectLink#getSpecies()
	 * @see #getEAspectLink()
	 * @generated
	 */
	EReference getEAspectLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EReflexLink <em>EReflex Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReflex Link</em>'.
	 * @see gama.ui.diagram.metamodel.EReflexLink
	 * @generated
	 */
	EClass getEReflexLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EReflexLink#getReflex <em>Reflex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reflex</em>'.
	 * @see gama.ui.diagram.metamodel.EReflexLink#getReflex()
	 * @see #getEReflexLink()
	 * @generated
	 */
	EReference getEReflexLink_Reflex();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EReflexLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.EReflexLink#getSpecies()
	 * @see #getEReflexLink()
	 * @generated
	 */
	EReference getEReflexLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EDisplayLink <em>EDisplay Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDisplay Link</em>'.
	 * @see gama.ui.diagram.metamodel.EDisplayLink
	 * @generated
	 */
	EClass getEDisplayLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EDisplayLink#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Experiment</em>'.
	 * @see gama.ui.diagram.metamodel.EDisplayLink#getExperiment()
	 * @see #getEDisplayLink()
	 * @generated
	 */
	EReference getEDisplayLink_Experiment();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EDisplayLink#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see gama.ui.diagram.metamodel.EDisplayLink#getDisplay()
	 * @see #getEDisplayLink()
	 * @generated
	 */
	EReference getEDisplayLink_Display();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EDisplay <em>EDisplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDisplay</em>'.
	 * @see gama.ui.diagram.metamodel.EDisplay
	 * @generated
	 */
	EClass getEDisplay();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EDisplay#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layers</em>'.
	 * @see gama.ui.diagram.metamodel.EDisplay#getLayers()
	 * @see #getEDisplay()
	 * @generated
	 */
	EReference getEDisplay_Layers();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EDisplay#getDisplayLink <em>Display Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display Link</em>'.
	 * @see gama.ui.diagram.metamodel.EDisplay#getDisplayLink()
	 * @see #getEDisplay()
	 * @generated
	 */
	EReference getEDisplay_DisplayLink();

	/**
	 * Returns the meta object for the attribute list '{@link gama.ui.diagram.metamodel.EDisplay#getLayerList <em>Layer List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Layer List</em>'.
	 * @see gama.ui.diagram.metamodel.EDisplay#getLayerList()
	 * @see #getEDisplay()
	 * @generated
	 */
	EAttribute getEDisplay_LayerList();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EDisplay#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.EDisplay#getGamlCode()
	 * @see #getEDisplay()
	 * @generated
	 */
	EAttribute getEDisplay_GamlCode();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EDisplay#isDefineGamlCode <em>Define Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Define Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.EDisplay#isDefineGamlCode()
	 * @see #getEDisplay()
	 * @generated
	 */
	EAttribute getEDisplay_DefineGamlCode();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EVariable <em>EVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EVariable</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable
	 * @generated
	 */
	EClass getEVariable();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EVariable#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable#getInit()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Init();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EVariable#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable#getMin()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Min();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EVariable#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable#getMax()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Max();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EVariable#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable#getUpdate()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Update();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EVariable#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable#getFunction()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Function();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable#getType()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable#getName()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EVariable#getHasError <em>Has Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Error</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable#getHasError()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_HasError();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EVariable#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable#getError()
	 * @see #getEVariable()
	 * @generated
	 */
	EAttribute getEVariable_Error();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EVariable#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see gama.ui.diagram.metamodel.EVariable#getOwner()
	 * @see #getEVariable()
	 * @generated
	 */
	EReference getEVariable_Owner();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EWorldAgent <em>EWorld Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EWorld Agent</em>'.
	 * @see gama.ui.diagram.metamodel.EWorldAgent
	 * @generated
	 */
	EClass getEWorldAgent();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.ELayer <em>ELayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELayer</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer
	 * @generated
	 */
	EClass getELayer();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getGamlCode()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_GamlCode();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.ELayer#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getDisplay()
	 * @see #getELayer()
	 * @generated
	 */
	EReference getELayer_Display();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getType()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Type();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getFile()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_File();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getText()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Text();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getSize()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Size();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getSpecies()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Species();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agents</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getAgents()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Agents();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getAspect()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Aspect();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getColor()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Color();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getIsColorCst <em>Is Color Cst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Color Cst</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getIsColorCst()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_IsColorCst();

	/**
	 * Returns the meta object for the attribute list '{@link gama.ui.diagram.metamodel.ELayer#getColorRBG <em>Color RBG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Color RBG</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getColorRBG()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_ColorRBG();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getGrid()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Grid();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ELayer#getChartlayers <em>Chartlayers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chartlayers</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getChartlayers()
	 * @see #getELayer()
	 * @generated
	 */
	EReference getELayer_Chartlayers();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#getChart_type <em>Chart type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chart type</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#getChart_type()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_Chart_type();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayer#isShowLines <em>Show Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Lines</em>'.
	 * @see gama.ui.diagram.metamodel.ELayer#isShowLines()
	 * @see #getELayer()
	 * @generated
	 */
	EAttribute getELayer_ShowLines();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EExperimentLink <em>EExperiment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EExperiment Link</em>'.
	 * @see gama.ui.diagram.metamodel.EExperimentLink
	 * @generated
	 */
	EClass getEExperimentLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EExperimentLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.EExperimentLink#getSpecies()
	 * @see #getEExperimentLink()
	 * @generated
	 */
	EReference getEExperimentLink_Species();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EExperimentLink#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Experiment</em>'.
	 * @see gama.ui.diagram.metamodel.EExperimentLink#getExperiment()
	 * @see #getEExperimentLink()
	 * @generated
	 */
	EReference getEExperimentLink_Experiment();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.ELayerAspect <em>ELayer Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELayer Aspect</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect
	 * @generated
	 */
	EClass getELayerAspect();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getGamlCode()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_GamlCode();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getShape()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Shape();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getColor()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Color();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getEmpty()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Empty();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getRotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotate</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getRotate()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Rotate();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getSize()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Size();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getWidth()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Width();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getHeigth()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getRadius()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Radius();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getPath()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Path();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getText()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Text();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getType()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Type();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getExpression()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Expression();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getPoints()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Points();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getAt()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_At();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getShapeType <em>Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Type</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getShapeType()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_ShapeType();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getIsColorCst <em>Is Color Cst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Color Cst</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getIsColorCst()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_IsColorCst();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Size</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getTextSize()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_TextSize();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getImageSize <em>Image Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Size</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getImageSize()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_ImageSize();

	/**
	 * Returns the meta object for the attribute list '{@link gama.ui.diagram.metamodel.ELayerAspect#getColorRBG <em>Color RBG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Color RBG</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getColorRBG()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_ColorRBG();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.ELayerAspect#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aspect</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getAspect()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EReference getELayerAspect_Aspect();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getDepth()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Depth();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ELayerAspect#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture</em>'.
	 * @see gama.ui.diagram.metamodel.ELayerAspect#getTexture()
	 * @see #getELayerAspect()
	 * @generated
	 */
	EAttribute getELayerAspect_Texture();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EInheritLink <em>EInherit Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EInherit Link</em>'.
	 * @see gama.ui.diagram.metamodel.EInheritLink
	 * @generated
	 */
	EClass getEInheritLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EInheritLink#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see gama.ui.diagram.metamodel.EInheritLink#getParent()
	 * @see #getEInheritLink()
	 * @generated
	 */
	EReference getEInheritLink_Parent();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EInheritLink#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see gama.ui.diagram.metamodel.EInheritLink#getChild()
	 * @see #getEInheritLink()
	 * @generated
	 */
	EReference getEInheritLink_Child();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EChartLayer <em>EChart Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EChart Layer</em>'.
	 * @see gama.ui.diagram.metamodel.EChartLayer
	 * @generated
	 */
	EClass getEChartLayer();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EChartLayer#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see gama.ui.diagram.metamodel.EChartLayer#getStyle()
	 * @see #getEChartLayer()
	 * @generated
	 */
	EAttribute getEChartLayer_Style();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EChartLayer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see gama.ui.diagram.metamodel.EChartLayer#getColor()
	 * @see #getEChartLayer()
	 * @generated
	 */
	EAttribute getEChartLayer_Color();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EChartLayer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gama.ui.diagram.metamodel.EChartLayer#getValue()
	 * @see #getEChartLayer()
	 * @generated
	 */
	EAttribute getEChartLayer_Value();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EParameter</em>'.
	 * @see gama.ui.diagram.metamodel.EParameter
	 * @generated
	 */
	EClass getEParameter();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EParameter#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see gama.ui.diagram.metamodel.EParameter#getVariable()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Variable();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EParameter#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see gama.ui.diagram.metamodel.EParameter#getMin()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Min();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EParameter#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see gama.ui.diagram.metamodel.EParameter#getInit()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Init();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EParameter#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see gama.ui.diagram.metamodel.EParameter#getStep()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Step();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EParameter#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see gama.ui.diagram.metamodel.EParameter#getMax()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Max();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EParameter#getAmong <em>Among</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Among</em>'.
	 * @see gama.ui.diagram.metamodel.EParameter#getAmong()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Among();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EParameter#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see gama.ui.diagram.metamodel.EParameter#getCategory()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Category();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EMonitor <em>EMonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMonitor</em>'.
	 * @see gama.ui.diagram.metamodel.EMonitor
	 * @generated
	 */
	EClass getEMonitor();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EMonitor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gama.ui.diagram.metamodel.EMonitor#getValue()
	 * @see #getEMonitor()
	 * @generated
	 */
	EAttribute getEMonitor_Value();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EFacet <em>EFacet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFacet</em>'.
	 * @see gama.ui.diagram.metamodel.EFacet
	 * @generated
	 */
	EClass getEFacet();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EFacet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gama.ui.diagram.metamodel.EFacet#getName()
	 * @see #getEFacet()
	 * @generated
	 */
	EAttribute getEFacet_Name();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EFacet#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see gama.ui.diagram.metamodel.EFacet#getOwner()
	 * @see #getEFacet()
	 * @generated
	 */
	EReference getEFacet_Owner();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gama.ui.diagram.metamodel.EFacet#getValue()
	 * @see #getEFacet()
	 * @generated
	 */
	EAttribute getEFacet_Value();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EPlan <em>EPlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPlan</em>'.
	 * @see gama.ui.diagram.metamodel.EPlan
	 * @generated
	 */
	EClass getEPlan();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EPlan#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.EPlan#getGamlCode()
	 * @see #getEPlan()
	 * @generated
	 */
	EAttribute getEPlan_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EPlan#getPlanLinks <em>Plan Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plan Links</em>'.
	 * @see gama.ui.diagram.metamodel.EPlan#getPlanLinks()
	 * @see #getEPlan()
	 * @generated
	 */
	EReference getEPlan_PlanLinks();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EState <em>EState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EState</em>'.
	 * @see gama.ui.diagram.metamodel.EState
	 * @generated
	 */
	EClass getEState();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EState#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.EState#getGamlCode()
	 * @see #getEState()
	 * @generated
	 */
	EAttribute getEState_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EState#getStateLinks <em>State Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Links</em>'.
	 * @see gama.ui.diagram.metamodel.EState#getStateLinks()
	 * @see #getEState()
	 * @generated
	 */
	EReference getEState_StateLinks();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.ETask <em>ETask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETask</em>'.
	 * @see gama.ui.diagram.metamodel.ETask
	 * @generated
	 */
	EClass getETask();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ETask#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.ETask#getGamlCode()
	 * @see #getETask()
	 * @generated
	 */
	EAttribute getETask_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ETask#getTaskLinks <em>Task Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Links</em>'.
	 * @see gama.ui.diagram.metamodel.ETask#getTaskLinks()
	 * @see #getETask()
	 * @generated
	 */
	EReference getETask_TaskLinks();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EPlanLink <em>EPlan Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPlan Link</em>'.
	 * @see gama.ui.diagram.metamodel.EPlanLink
	 * @generated
	 */
	EClass getEPlanLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EPlanLink#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan</em>'.
	 * @see gama.ui.diagram.metamodel.EPlanLink#getPlan()
	 * @see #getEPlanLink()
	 * @generated
	 */
	EReference getEPlanLink_Plan();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EPlanLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.EPlanLink#getSpecies()
	 * @see #getEPlanLink()
	 * @generated
	 */
	EReference getEPlanLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EStateLink <em>EState Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EState Link</em>'.
	 * @see gama.ui.diagram.metamodel.EStateLink
	 * @generated
	 */
	EClass getEStateLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EStateLink#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see gama.ui.diagram.metamodel.EStateLink#getState()
	 * @see #getEStateLink()
	 * @generated
	 */
	EReference getEStateLink_State();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EStateLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.EStateLink#getSpecies()
	 * @see #getEStateLink()
	 * @generated
	 */
	EReference getEStateLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.ETaskLink <em>ETask Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETask Link</em>'.
	 * @see gama.ui.diagram.metamodel.ETaskLink
	 * @generated
	 */
	EClass getETaskLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.ETaskLink#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see gama.ui.diagram.metamodel.ETaskLink#getTask()
	 * @see #getETaskLink()
	 * @generated
	 */
	EReference getETaskLink_Task();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.ETaskLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.ETaskLink#getSpecies()
	 * @see #getETaskLink()
	 * @generated
	 */
	EReference getETaskLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EGrid <em>EGrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGrid</em>'.
	 * @see gama.ui.diagram.metamodel.EGrid
	 * @generated
	 */
	EClass getEGrid();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EPerceive <em>EPerceive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPerceive</em>'.
	 * @see gama.ui.diagram.metamodel.EPerceive
	 * @generated
	 */
	EClass getEPerceive();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EPerceive#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.EPerceive#getGamlCode()
	 * @see #getEPerceive()
	 * @generated
	 */
	EAttribute getEPerceive_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EPerceive#getPerceiveLinks <em>Perceive Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perceive Links</em>'.
	 * @see gama.ui.diagram.metamodel.EPerceive#getPerceiveLinks()
	 * @see #getEPerceive()
	 * @generated
	 */
	EReference getEPerceive_PerceiveLinks();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EPerceiveLink <em>EPerceive Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPerceive Link</em>'.
	 * @see gama.ui.diagram.metamodel.EPerceiveLink
	 * @generated
	 */
	EClass getEPerceiveLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EPerceiveLink#getPerceive <em>Perceive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perceive</em>'.
	 * @see gama.ui.diagram.metamodel.EPerceiveLink#getPerceive()
	 * @see #getEPerceiveLink()
	 * @generated
	 */
	EReference getEPerceiveLink_Perceive();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EPerceiveLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.EPerceiveLink#getSpecies()
	 * @see #getEPerceiveLink()
	 * @generated
	 */
	EReference getEPerceiveLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.ERule <em>ERule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERule</em>'.
	 * @see gama.ui.diagram.metamodel.ERule
	 * @generated
	 */
	EClass getERule();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.ERule#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.ERule#getGamlCode()
	 * @see #getERule()
	 * @generated
	 */
	EAttribute getERule_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.ERule#getRuleLinks <em>Rule Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rule Links</em>'.
	 * @see gama.ui.diagram.metamodel.ERule#getRuleLinks()
	 * @see #getERule()
	 * @generated
	 */
	EReference getERule_RuleLinks();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.ERuleLink <em>ERule Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERule Link</em>'.
	 * @see gama.ui.diagram.metamodel.ERuleLink
	 * @generated
	 */
	EClass getERuleLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.ERuleLink#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see gama.ui.diagram.metamodel.ERuleLink#getRule()
	 * @see #getERuleLink()
	 * @generated
	 */
	EReference getERuleLink_Rule();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.ERuleLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.ERuleLink#getSpecies()
	 * @see #getERuleLink()
	 * @generated
	 */
	EReference getERuleLink_Species();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EEquation <em>EEquation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEquation</em>'.
	 * @see gama.ui.diagram.metamodel.EEquation
	 * @generated
	 */
	EClass getEEquation();

	/**
	 * Returns the meta object for the attribute '{@link gama.ui.diagram.metamodel.EEquation#getGamlCode <em>Gaml Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gaml Code</em>'.
	 * @see gama.ui.diagram.metamodel.EEquation#getGamlCode()
	 * @see #getEEquation()
	 * @generated
	 */
	EAttribute getEEquation_GamlCode();

	/**
	 * Returns the meta object for the reference list '{@link gama.ui.diagram.metamodel.EEquation#getEquationLinks <em>Equation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equation Links</em>'.
	 * @see gama.ui.diagram.metamodel.EEquation#getEquationLinks()
	 * @see #getEEquation()
	 * @generated
	 */
	EReference getEEquation_EquationLinks();

	/**
	 * Returns the meta object for class '{@link gama.ui.diagram.metamodel.EEquationLink <em>EEquation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEquation Link</em>'.
	 * @see gama.ui.diagram.metamodel.EEquationLink
	 * @generated
	 */
	EClass getEEquationLink();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EEquationLink#getEquation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equation</em>'.
	 * @see gama.ui.diagram.metamodel.EEquationLink#getEquation()
	 * @see #getEEquationLink()
	 * @generated
	 */
	EReference getEEquationLink_Equation();

	/**
	 * Returns the meta object for the reference '{@link gama.ui.diagram.metamodel.EEquationLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see gama.ui.diagram.metamodel.EEquationLink#getSpecies()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EGamaModelImpl <em>EGama Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EGamaModelImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEGamaModel()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EGamaObjectImpl <em>EGama Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EGamaObjectImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEGamaObject()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.ESpeciesImpl <em>ESpecies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.ESpeciesImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getESpecies()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EActionImpl <em>EAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EActionImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEAction()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EAspectImpl <em>EAspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EAspectImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEAspect()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EReflexImpl <em>EReflex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EReflexImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEReflex()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EExperimentImpl <em>EExperiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EExperimentImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEExperiment()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EGUIExperimentImpl <em>EGUI Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EGUIExperimentImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEGUIExperiment()
		 * @generated
		 */
		EClass EGUI_EXPERIMENT = eINSTANCE.getEGUIExperiment();

		/**
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EBatchExperimentImpl <em>EBatch Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EBatchExperimentImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEBatchExperiment()
		 * @generated
		 */
		EClass EBATCH_EXPERIMENT = eINSTANCE.getEBatchExperiment();

		/**
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EGamaLinkImpl <em>EGama Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EGamaLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEGamaLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.ESubSpeciesLinkImpl <em>ESub Species Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.ESubSpeciesLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getESubSpeciesLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EActionLinkImpl <em>EAction Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EActionLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEActionLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EAspectLinkImpl <em>EAspect Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EAspectLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEAspectLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EReflexLinkImpl <em>EReflex Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EReflexLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEReflexLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EDisplayLinkImpl <em>EDisplay Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EDisplayLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEDisplayLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EDisplayImpl <em>EDisplay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EDisplayImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEDisplay()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EVariableImpl <em>EVariable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EVariableImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEVariable()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EWorldAgentImpl <em>EWorld Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EWorldAgentImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEWorldAgent()
		 * @generated
		 */
		EClass EWORLD_AGENT = eINSTANCE.getEWorldAgent();

		/**
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.ELayerImpl <em>ELayer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.ELayerImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getELayer()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EExperimentLinkImpl <em>EExperiment Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EExperimentLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEExperimentLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.ELayerAspectImpl <em>ELayer Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.ELayerAspectImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getELayerAspect()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EInheritLinkImpl <em>EInherit Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EInheritLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEInheritLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EChartLayerImpl <em>EChart Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EChartLayerImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEChartLayer()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EParameterImpl <em>EParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EParameterImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEParameter()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EMonitorImpl <em>EMonitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EMonitorImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEMonitor()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EFacetImpl <em>EFacet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EFacetImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEFacet()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EPlanImpl <em>EPlan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EPlanImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEPlan()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EStateImpl <em>EState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EStateImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEState()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.ETaskImpl <em>ETask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.ETaskImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getETask()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EPlanLinkImpl <em>EPlan Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EPlanLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEPlanLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EStateLinkImpl <em>EState Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EStateLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEStateLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.ETaskLinkImpl <em>ETask Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.ETaskLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getETaskLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EGridImpl <em>EGrid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EGridImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEGrid()
		 * @generated
		 */
		EClass EGRID = eINSTANCE.getEGrid();

		/**
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EPerceiveImpl <em>EPerceive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EPerceiveImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEPerceive()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EPerceiveLinkImpl <em>EPerceive Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EPerceiveLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEPerceiveLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.ERuleImpl <em>ERule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.ERuleImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getERule()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.ERuleLinkImpl <em>ERule Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.ERuleLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getERuleLink()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EEquationImpl <em>EEquation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EEquationImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEEquation()
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
		 * The meta object literal for the '{@link gama.ui.diagram.metamodel.impl.EEquationLinkImpl <em>EEquation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gama.ui.diagram.metamodel.impl.EEquationLinkImpl
		 * @see gama.ui.diagram.metamodel.impl.GamaPackageImpl#getEEquationLink()
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
