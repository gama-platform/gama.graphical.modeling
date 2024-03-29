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
 * A representation of the model object '<em><b>EExperiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gama.ui.diagram.metamodel.EExperiment#getExperimentLink <em>Experiment Link</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EExperiment#getDisplayLinks <em>Display Links</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EExperiment#getParameters <em>Parameters</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.EExperiment#getMonitors <em>Monitors</em>}</li>
 * </ul>
 *
 * @see gama.ui.diagram.metamodel.GamaPackage#getEExperiment()
 * @model
 * @generated
 */
public interface EExperiment extends ESpecies {
	/**
	 * Returns the value of the '<em><b>Experiment Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiment Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Link</em>' reference.
	 * @see #setExperimentLink(EExperimentLink)
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEExperiment_ExperimentLink()
	 * @model
	 * @generated
	 */
	EExperimentLink getExperimentLink();

	/**
	 * Sets the value of the '{@link gama.ui.diagram.metamodel.EExperiment#getExperimentLink <em>Experiment Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment Link</em>' reference.
	 * @see #getExperimentLink()
	 * @generated
	 */
	void setExperimentLink(EExperimentLink value);

	/**
	 * Returns the value of the '<em><b>Display Links</b></em>' reference list.
	 * The list contents are of type {@link gama.ui.diagram.metamodel.EDisplayLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Links</em>' reference list.
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEExperiment_DisplayLinks()
	 * @model
	 * @generated
	 */
	EList<EDisplayLink> getDisplayLinks();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link gama.ui.diagram.metamodel.EParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEExperiment_Parameters()
	 * @model
	 * @generated
	 */
	EList<EParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' reference list.
	 * The list contents are of type {@link gama.ui.diagram.metamodel.EMonitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' reference list.
	 * @see gama.ui.diagram.metamodel.GamaPackage#getEExperiment_Monitors()
	 * @model
	 * @generated
	 */
	EList<EMonitor> getMonitors();

} // EExperiment
