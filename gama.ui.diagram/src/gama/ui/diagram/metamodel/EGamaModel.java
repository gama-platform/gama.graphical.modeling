/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.ui.diagram.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EGama Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gama.ui.diagram.metamodel.EGamaModel#getObjects <em>Objects</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EGamaModel#getName <em>Name</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EGamaModel#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see gama.ui.diagram.metamodel.GamaPackage#getEGamaModel()
 * @model
 * @generated
 */
public interface EGamaModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link gama.ui.diagram.metamodel.EGamaObject}.
	 * It is bidirectional and its opposite is '{@link gama.ui.diagram.metamodel.EGamaObject#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEGamaModel_Objects()
	 * @see gama.ui.diagram.metamodel.EGamaObject#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<EGamaObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEGamaModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.EGamaModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link gama.ui.diagram.metamodel.EGamaLink}.
	 * It is bidirectional and its opposite is '{@link gama.ui.diagram.metamodel.EGamaLink#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEGamaModel_Links()
	 * @see gama.ui.diagram.metamodel.EGamaLink#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<EGamaLink> getLinks();

} // EGamaModel
