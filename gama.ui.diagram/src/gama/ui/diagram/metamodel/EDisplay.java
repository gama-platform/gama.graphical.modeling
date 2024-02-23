/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.ui.diagram.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDisplay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gama.ui.diagram.metamodel.EDisplay#getLayers <em>Layers</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EDisplay#getDisplayLink <em>Display Link</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EDisplay#getLayerList <em>Layer List</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EDisplay#getGamlCode <em>Gaml Code</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EDisplay#isDefineGamlCode <em>Define Gaml Code</em>}</li>
 * </ul>
 *
 * @see gama.ui.diagram.metamodel.GamaPackage#getEDisplay()
 * @model
 * @generated
 */
public interface EDisplay extends EGamaObject {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' reference list.
	 * The list contents are of type {@link gama.ui.diagram.metamodel.ELayer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' reference list.
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEDisplay_Layers()
	 * @model
	 * @generated
	 */
	EList<ELayer> getLayers();

	/**
	 * Returns the value of the '<em><b>Display Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Link</em>' reference.
	 * @see #setDisplayLink(EDisplayLink)
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEDisplay_DisplayLink()
	 * @model
	 * @generated
	 */
	EDisplayLink getDisplayLink();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.EDisplay#getDisplayLink <em>Display Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Link</em>' reference.
	 * @see #getDisplayLink()
	 * @generated
	 */
	void setDisplayLink(EDisplayLink value);

	/**
	 * Returns the value of the '<em><b>Layer List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer List</em>' attribute list.
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEDisplay_LayerList()
	 * @model
	 * @generated
	 */
	EList<String> getLayerList();

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
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEDisplay_GamlCode()
	 * @model derived="true"
	 * @generated
	 */
	String getGamlCode();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.EDisplay#getGamlCode <em>Gaml Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gaml Code</em>' attribute.
	 * @see #getGamlCode()
	 * @generated
	 */
	void setGamlCode(String value);

	/**
	 * Returns the value of the '<em><b>Define Gaml Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Define Gaml Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define Gaml Code</em>' attribute.
	 * @see #setDefineGamlCode(boolean)
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEDisplay_DefineGamlCode()
	 * @model
	 * @generated
	 */
	boolean isDefineGamlCode();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.EDisplay#isDefineGamlCode <em>Define Gaml Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Define Gaml Code</em>' attribute.
	 * @see #isDefineGamlCode()
	 * @generated
	 */
	void setDefineGamlCode(boolean value);

} // EDisplay
