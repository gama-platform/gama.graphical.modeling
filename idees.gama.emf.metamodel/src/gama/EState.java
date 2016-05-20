/**
 */
package gama;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EState</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gama.EState#getGamlCode <em>Gaml Code</em>}</li>
 *   <li>{@link gama.EState#getStateLinks <em>State Links</em>}</li>
 * </ul>
 *
 * @see gama.GamaPackage#getEState()
 * @model
 * @generated
 */
public interface EState extends EGamaObject {
	/**
	 * Returns the value of the '<em><b>Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gaml Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gaml Code</em>' attribute.
	 * @see #setGamlCode(String)
	 * @see gama.GamaPackage#getEState_GamlCode()
	 * @model derived="true"
	 * @generated
	 */
	String getGamlCode();

	/**
	 * Sets the value of the '{@link gama.EState#getGamlCode <em>Gaml Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gaml Code</em>' attribute.
	 * @see #getGamlCode()
	 * @generated
	 */
	void setGamlCode(String value);

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
	 * @see gama.GamaPackage#getEState_StateLinks()
	 * @model
	 * @generated
	 */
	EList<EStateLink> getStateLinks();

} // EState
