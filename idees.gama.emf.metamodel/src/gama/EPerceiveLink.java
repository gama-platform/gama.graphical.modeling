/**
 */
package gama;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPerceive Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gama.EPerceiveLink#getPerceive <em>Perceive</em>}</li>
 *   <li>{@link gama.EPerceiveLink#getSpecies <em>Species</em>}</li>
 * </ul>
 *
 * @see gama.GamaPackage#getEPerceiveLink()
 * @model
 * @generated
 */
public interface EPerceiveLink extends EGamaLink {
	/**
	 * Returns the value of the '<em><b>Perceive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perceive</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perceive</em>' reference.
	 * @see #setPerceive(EPerceive)
	 * @see gama.GamaPackage#getEPerceiveLink_Perceive()
	 * @model
	 * @generated
	 */
	EPerceive getPerceive();

	/**
	 * Sets the value of the '{@link gama.EPerceiveLink#getPerceive <em>Perceive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perceive</em>' reference.
	 * @see #getPerceive()
	 * @generated
	 */
	void setPerceive(EPerceive value);

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
	 * @see gama.GamaPackage#getEPerceiveLink_Species()
	 * @model
	 * @generated
	 */
	ESpecies getSpecies();

	/**
	 * Sets the value of the '{@link gama.EPerceiveLink#getSpecies <em>Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(ESpecies value);

} // EPerceiveLink
