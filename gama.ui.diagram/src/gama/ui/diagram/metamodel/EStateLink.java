/**
 */
package gama.ui.diagram.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EState Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gama.ui.diagram.metamodel.EStateLink#getState <em>State</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EStateLink#getSpecies <em>Species</em>}</li>
 * </ul>
 *
 * @see gama.ui.diagram.metamodel.GamaPackage#getEStateLink()
 * @model
 * @generated
 */
public interface EStateLink extends EGamaLink {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(EState)
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEStateLink_State()
	 * @model
	 * @generated
	 */
	EState getState();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.EStateLink#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(EState value);

	/**
	 * Returns the value of the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Species</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' reference.
	 * @see #setSpecies(ESpecies)
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEStateLink_Species()
	 * @model
	 * @generated
	 */
	ESpecies getSpecies();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.EStateLink#getSpecies <em>Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(ESpecies value);

} // EStateLink
