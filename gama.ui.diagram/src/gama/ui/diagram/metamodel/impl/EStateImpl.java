/**
 */
package gama.ui.diagram.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import gama.ui.diagram.metamodel.EReflexLink;
import gama.ui.diagram.metamodel.EState;
import gama.ui.diagram.metamodel.EStateLink;
import gama.ui.diagram.metamodel.GamaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EState</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gama.ui.diagram.metamodel.impl.EStateImpl#getGamlCode <em>Gaml Code</em>}</li>
 *   <li>{@link gama.ui.diagram.metamodel.impl.EStateImpl#getStateLinks <em>State Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EStateImpl extends EGamaObjectImpl implements EState {
	/**
	 * The default value of the '{@link #getGamlCode() <em>Gaml Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamlCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GAML_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGamlCode() <em>Gaml Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamlCode()
	 * @generated
	 * @ordered
	 */
	protected String gamlCode = GAML_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateLinks() <em>State Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EStateLink> stateLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamaPackage.Literals.ESTATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGamlCode() {
		return gamlCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamlCode(String newGamlCode) {
		String oldGamlCode = gamlCode;
		gamlCode = newGamlCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamaPackage.ESTATE__GAML_CODE, oldGamlCode, gamlCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStateLink> getStateLinks() {
		if (stateLinks == null) {
			stateLinks = new EObjectResolvingEList<EStateLink>(EStateLink.class, this, GamaPackage.ESTATE__STATE_LINKS);
		}
		return stateLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamaPackage.ESTATE__GAML_CODE:
				return getGamlCode();
			case GamaPackage.ESTATE__STATE_LINKS:
				return getStateLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GamaPackage.ESTATE__GAML_CODE:
				setGamlCode((String)newValue);
				return;
			case GamaPackage.ESTATE__STATE_LINKS:
				getStateLinks().clear();
				getStateLinks().addAll((Collection<? extends EStateLink>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GamaPackage.ESTATE__GAML_CODE:
				setGamlCode(GAML_CODE_EDEFAULT);
				return;
			case GamaPackage.ESTATE__STATE_LINKS:
				getStateLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GamaPackage.ESTATE__GAML_CODE:
				return GAML_CODE_EDEFAULT == null ? gamlCode != null : !GAML_CODE_EDEFAULT.equals(gamlCode);
			case GamaPackage.ESTATE__STATE_LINKS:
				return stateLinks != null && !stateLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (gamlCode: ");
		result.append(gamlCode);
		result.append(')');
		return result.toString();
	}

} //EStateImpl
