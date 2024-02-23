/**
 */
package gama.ui.diagram.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gama.ui.diagram.metamodel.ETask#getGamlCode <em>Gaml Code</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.ETask#getTaskLinks <em>Task Links</em>}</li>
 * </ul>
 *
 * @see gama.ui.diagram.metamodel.GamaPackage#getETask()
 * @model
 * @generated
 */
public interface ETask extends EGamaObject {
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
	 * @see gama.ui.diagram.metamodel.GamaPackage#getETask_GamlCode()
	 * @model derived="true"
	 * @generated
	 */
	String getGamlCode();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.ETask#getGamlCode <em>Gaml Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gaml Code</em>' attribute.
	 * @see #getGamlCode()
	 * @generated
	 */
	void setGamlCode(String value);

	/**
	 * Returns the value of the '<em><b>Task Links</b></em>' reference list.
	 * The list contents are of type {@link gama.ui.diagram.metamodel.ETaskLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Links</em>' reference list.
	 * @see gama.ui.diagram.metamodel.GamaPackage#getETask_TaskLinks()
	 * @model
	 * @generated
	 */
	EList<ETaskLink> getTaskLinks();

} // ETask
