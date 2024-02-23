/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.ui.diagram.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EGama Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gama.ui.diagram.metamodel.EGamaLink#getTarget <em>Target</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EGamaLink#getSource <em>Source</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EGamaLink#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see gama.ui.diagram.metamodel.GamaPackage#getEGamaLink()
 * @model
 * @generated
 */
public interface EGamaLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EGamaObject)
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEGamaLink_Target()
	 * @model required="true"
	 * @generated
	 */
	EGamaObject getTarget();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.EGamaLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EGamaObject value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EGamaObject)
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEGamaLink_Source()
	 * @model required="true"
	 * @generated
	 */
	EGamaObject getSource();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.EGamaLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EGamaObject value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gama.ui.diagram.metamodel.EGamaModel#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(EGamaModel)
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEGamaLink_Model()
	 * @see gama.ui.diagram.metamodel.EGamaModel#getLinks
	 * @model opposite="links" required="true" transient="false"
	 * @generated
	 */
	EGamaModel getModel();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.EGamaLink#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EGamaModel value);

} // EGamaLink
