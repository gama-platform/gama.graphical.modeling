/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gama.GamaPackage
 * @generated
 */
public interface GamaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamaFactory eINSTANCE = gama.impl.GamaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EGama Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EGama Model</em>'.
	 * @generated
	 */
	EGamaModel createEGamaModel();

	/**
	 * Returns a new object of class '<em>EGama Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EGama Object</em>'.
	 * @generated
	 */
	EGamaObject createEGamaObject();

	/**
	 * Returns a new object of class '<em>ESpecies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ESpecies</em>'.
	 * @generated
	 */
	ESpecies createESpecies();

	/**
	 * Returns a new object of class '<em>EAction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAction</em>'.
	 * @generated
	 */
	EAction createEAction();

	/**
	 * Returns a new object of class '<em>EAspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAspect</em>'.
	 * @generated
	 */
	EAspect createEAspect();

	/**
	 * Returns a new object of class '<em>EReflex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EReflex</em>'.
	 * @generated
	 */
	EReflex createEReflex();

	/**
	 * Returns a new object of class '<em>EExperiment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EExperiment</em>'.
	 * @generated
	 */
	EExperiment createEExperiment();

	/**
	 * Returns a new object of class '<em>EGUI Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EGUI Experiment</em>'.
	 * @generated
	 */
	EGUIExperiment createEGUIExperiment();

	/**
	 * Returns a new object of class '<em>EBatch Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EBatch Experiment</em>'.
	 * @generated
	 */
	EBatchExperiment createEBatchExperiment();

	/**
	 * Returns a new object of class '<em>EGama Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EGama Link</em>'.
	 * @generated
	 */
	EGamaLink createEGamaLink();

	/**
	 * Returns a new object of class '<em>ESub Species Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ESub Species Link</em>'.
	 * @generated
	 */
	ESubSpeciesLink createESubSpeciesLink();

	/**
	 * Returns a new object of class '<em>EAction Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAction Link</em>'.
	 * @generated
	 */
	EActionLink createEActionLink();

	/**
	 * Returns a new object of class '<em>EAspect Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAspect Link</em>'.
	 * @generated
	 */
	EAspectLink createEAspectLink();

	/**
	 * Returns a new object of class '<em>EReflex Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EReflex Link</em>'.
	 * @generated
	 */
	EReflexLink createEReflexLink();

	/**
	 * Returns a new object of class '<em>EDisplay Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDisplay Link</em>'.
	 * @generated
	 */
	EDisplayLink createEDisplayLink();

	/**
	 * Returns a new object of class '<em>EDisplay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDisplay</em>'.
	 * @generated
	 */
	EDisplay createEDisplay();

	/**
	 * Returns a new object of class '<em>EVariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EVariable</em>'.
	 * @generated
	 */
	EVariable createEVariable();

	/**
	 * Returns a new object of class '<em>EWorld Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EWorld Agent</em>'.
	 * @generated
	 */
	EWorldAgent createEWorldAgent();

	/**
	 * Returns a new object of class '<em>ELayer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ELayer</em>'.
	 * @generated
	 */
	ELayer createELayer();

	/**
	 * Returns a new object of class '<em>EExperiment Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EExperiment Link</em>'.
	 * @generated
	 */
	EExperimentLink createEExperimentLink();

	/**
	 * Returns a new object of class '<em>ELayer Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ELayer Aspect</em>'.
	 * @generated
	 */
	ELayerAspect createELayerAspect();

	/**
	 * Returns a new object of class '<em>EInherit Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EInherit Link</em>'.
	 * @generated
	 */
	EInheritLink createEInheritLink();

	/**
	 * Returns a new object of class '<em>EChart Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EChart Layer</em>'.
	 * @generated
	 */
	EChartLayer createEChartLayer();

	/**
	 * Returns a new object of class '<em>EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EParameter</em>'.
	 * @generated
	 */
	EParameter createEParameter();

	/**
	 * Returns a new object of class '<em>EMonitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMonitor</em>'.
	 * @generated
	 */
	EMonitor createEMonitor();

	/**
	 * Returns a new object of class '<em>EFacet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFacet</em>'.
	 * @generated
	 */
	EFacet createEFacet();

	/**
	 * Returns a new object of class '<em>EPlan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPlan</em>'.
	 * @generated
	 */
	EPlan createEPlan();

	/**
	 * Returns a new object of class '<em>EState</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EState</em>'.
	 * @generated
	 */
	EState createEState();

	/**
	 * Returns a new object of class '<em>ETask</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETask</em>'.
	 * @generated
	 */
	ETask createETask();

	/**
	 * Returns a new object of class '<em>EPlan Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPlan Link</em>'.
	 * @generated
	 */
	EPlanLink createEPlanLink();

	/**
	 * Returns a new object of class '<em>EState Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EState Link</em>'.
	 * @generated
	 */
	EStateLink createEStateLink();

	/**
	 * Returns a new object of class '<em>ETask Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETask Link</em>'.
	 * @generated
	 */
	ETaskLink createETaskLink();

	/**
	 * Returns a new object of class '<em>EGrid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EGrid</em>'.
	 * @generated
	 */
	EGrid createEGrid();

	/**
	 * Returns a new object of class '<em>EPerceive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPerceive</em>'.
	 * @generated
	 */
	EPerceive createEPerceive();

	/**
	 * Returns a new object of class '<em>EPerceive Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPerceive Link</em>'.
	 * @generated
	 */
	EPerceiveLink createEPerceiveLink();

	/**
	 * Returns a new object of class '<em>ERule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERule</em>'.
	 * @generated
	 */
	ERule createERule();

	/**
	 * Returns a new object of class '<em>ERule Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERule Link</em>'.
	 * @generated
	 */
	ERuleLink createERuleLink();

	/**
	 * Returns a new object of class '<em>EEquation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEquation</em>'.
	 * @generated
	 */
	EEquation createEEquation();

	/**
	 * Returns a new object of class '<em>EEquation Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEquation Link</em>'.
	 * @generated
	 */
	EEquationLink createEEquationLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GamaPackage getGamaPackage();

} //GamaFactory
