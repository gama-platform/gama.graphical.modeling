/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESpecies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gama.ESpecies#getVariables <em>Variables</em>}</li>
 *   <li>{@link gama.ESpecies#getReflexList <em>Reflex List</em>}</li>
 *   <li>{@link gama.ESpecies#getExperimentLinks <em>Experiment Links</em>}</li>
 *   <li>{@link gama.ESpecies#getAspectLinks <em>Aspect Links</em>}</li>
 *   <li>{@link gama.ESpecies#getActionLinks <em>Action Links</em>}</li>
 *   <li>{@link gama.ESpecies#getReflexLinks <em>Reflex Links</em>}</li>
 *   <li>{@link gama.ESpecies#getMicroSpeciesLinks <em>Micro Species Links</em>}</li>
 *   <li>{@link gama.ESpecies#getMacroSpeciesLinks <em>Macro Species Links</em>}</li>
 *   <li>{@link gama.ESpecies#getSkills <em>Skills</em>}</li>
 *   <li>{@link gama.ESpecies#getInheritsFrom <em>Inherits From</em>}</li>
 *   <li>{@link gama.ESpecies#getInit <em>Init</em>}</li>
 *   <li>{@link gama.ESpecies#getInheritingLinks <em>Inheriting Links</em>}</li>
 *   <li>{@link gama.ESpecies#getPlanLinks <em>Plan Links</em>}</li>
 *   <li>{@link gama.ESpecies#getStateLinks <em>State Links</em>}</li>
 *   <li>{@link gama.ESpecies#getTaskLinks <em>Task Links</em>}</li>
 *   <li>{@link gama.ESpecies#getPerceiveLinks <em>Perceive Links</em>}</li>
 *   <li>{@link gama.ESpecies#getRuleLinks <em>Rule Links</em>}</li>
 *   <li>{@link gama.ESpecies#getEquationLinks <em>Equation Links</em>}</li>
 * </ul>
 *
 * @see gama.GamaPackage#getESpecies()
 * @model
 * @generated
 */
public interface ESpecies extends EGamaObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link gama.EVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see gama.GamaPackage#getESpecies_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<EVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Reflex List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflex List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflex List</em>' attribute list.
	 * @see gama.GamaPackage#getESpecies_ReflexList()
	 * @model
	 * @generated
	 */
	EList<String> getReflexList();

	/**
	 * Returns the value of the '<em><b>Experiment Links</b></em>' reference list.
	 * The list contents are of type {@link gama.EExperimentLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiment Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_ExperimentLinks()
	 * @model
	 * @generated
	 */
	EList<EExperimentLink> getExperimentLinks();

	/**
	 * Returns the value of the '<em><b>Aspect Links</b></em>' reference list.
	 * The list contents are of type {@link gama.EAspectLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_AspectLinks()
	 * @model
	 * @generated
	 */
	EList<EAspectLink> getAspectLinks();

	/**
	 * Returns the value of the '<em><b>Action Links</b></em>' reference list.
	 * The list contents are of type {@link gama.EActionLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_ActionLinks()
	 * @model
	 * @generated
	 */
	EList<EActionLink> getActionLinks();

	/**
	 * Returns the value of the '<em><b>Reflex Links</b></em>' reference list.
	 * The list contents are of type {@link gama.EReflexLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflex Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflex Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_ReflexLinks()
	 * @model
	 * @generated
	 */
	EList<EReflexLink> getReflexLinks();

	/**
	 * Returns the value of the '<em><b>Micro Species Links</b></em>' reference list.
	 * The list contents are of type {@link gama.ESubSpeciesLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Micro Species Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Micro Species Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_MicroSpeciesLinks()
	 * @model
	 * @generated
	 */
	EList<ESubSpeciesLink> getMicroSpeciesLinks();

	/**
	 * Returns the value of the '<em><b>Macro Species Links</b></em>' reference list.
	 * The list contents are of type {@link gama.ESubSpeciesLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macro Species Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro Species Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_MacroSpeciesLinks()
	 * @model
	 * @generated
	 */
	EList<ESubSpeciesLink> getMacroSpeciesLinks();

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' attribute list.
	 * @see gama.GamaPackage#getESpecies_Skills()
	 * @model
	 * @generated
	 */
	EList<String> getSkills();

	/**
	 * Returns the value of the '<em><b>Inherits From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherits From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits From</em>' reference.
	 * @see #setInheritsFrom(ESpecies)
	 * @see gama.GamaPackage#getESpecies_InheritsFrom()
	 * @model
	 * @generated
	 */
	ESpecies getInheritsFrom();

	/**
	 * Sets the value of the '{@link gama.ESpecies#getInheritsFrom <em>Inherits From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherits From</em>' reference.
	 * @see #getInheritsFrom()
	 * @generated
	 */
	void setInheritsFrom(ESpecies value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(String)
	 * @see gama.GamaPackage#getESpecies_Init()
	 * @model
	 * @generated
	 */
	String getInit();

	/**
	 * Sets the value of the '{@link gama.ESpecies#getInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(String value);

	/**
	 * Returns the value of the '<em><b>Inheriting Links</b></em>' reference list.
	 * The list contents are of type {@link gama.EInheritLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheriting Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheriting Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_InheritingLinks()
	 * @model
	 * @generated
	 */
	EList<EInheritLink> getInheritingLinks();

	/**
	 * Returns the value of the '<em><b>Plan Links</b></em>' reference list.
	 * The list contents are of type {@link gama.EPlanLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_PlanLinks()
	 * @model
	 * @generated
	 */
	EList<EPlanLink> getPlanLinks();

	/**
	 * Returns the value of the '<em><b>State Links</b></em>' reference list.
	 * The list contents are of type {@link gama.EStateLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_StateLinks()
	 * @model
	 * @generated
	 */
	EList<EStateLink> getStateLinks();

	/**
	 * Returns the value of the '<em><b>Task Links</b></em>' reference list.
	 * The list contents are of type {@link gama.ETaskLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_TaskLinks()
	 * @model
	 * @generated
	 */
	EList<ETaskLink> getTaskLinks();

	/**
	 * Returns the value of the '<em><b>Perceive Links</b></em>' reference list.
	 * The list contents are of type {@link gama.EPerceiveLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perceive Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perceive Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_PerceiveLinks()
	 * @model
	 * @generated
	 */
	EList<EPerceiveLink> getPerceiveLinks();

	/**
	 * Returns the value of the '<em><b>Rule Links</b></em>' reference list.
	 * The list contents are of type {@link gama.ERuleLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_RuleLinks()
	 * @model
	 * @generated
	 */
	EList<ERuleLink> getRuleLinks();

	/**
	 * Returns the value of the '<em><b>Equation Links</b></em>' reference list.
	 * The list contents are of type {@link gama.EEquationLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equation Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation Links</em>' reference list.
	 * @see gama.GamaPackage#getESpecies_EquationLinks()
	 * @model
	 * @generated
	 */
	EList<EEquationLink> getEquationLinks();

} // ESpecies
