/**
 */
package gama.impl;

import gama.EPerceive;
import gama.EPerceiveLink;
import gama.ESpecies;
import gama.GamaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPerceive Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gama.impl.EPerceiveLinkImpl#getPerceive <em>Perceive</em>}</li>
 *   <li>{@link gama.impl.EPerceiveLinkImpl#getSpecies <em>Species</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPerceiveLinkImpl extends EGamaLinkImpl implements EPerceiveLink {
	/**
	 * The cached value of the '{@link #getPerceive() <em>Perceive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceive()
	 * @generated
	 * @ordered
	 */
	protected EPerceive perceive;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected ESpecies species;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPerceiveLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamaPackage.Literals.EPERCEIVE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPerceive getPerceive() {
		if (perceive != null && perceive.eIsProxy()) {
			InternalEObject oldPerceive = (InternalEObject)perceive;
			perceive = (EPerceive)eResolveProxy(oldPerceive);
			if (perceive != oldPerceive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamaPackage.EPERCEIVE_LINK__PERCEIVE, oldPerceive, perceive));
			}
		}
		return perceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPerceive basicGetPerceive() {
		return perceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerceive(EPerceive newPerceive) {
		EPerceive oldPerceive = perceive;
		perceive = newPerceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamaPackage.EPERCEIVE_LINK__PERCEIVE, oldPerceive, perceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESpecies getSpecies() {
		if (species != null && species.eIsProxy()) {
			InternalEObject oldSpecies = (InternalEObject)species;
			species = (ESpecies)eResolveProxy(oldSpecies);
			if (species != oldSpecies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamaPackage.EPERCEIVE_LINK__SPECIES, oldSpecies, species));
			}
		}
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESpecies basicGetSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(ESpecies newSpecies) {
		ESpecies oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamaPackage.EPERCEIVE_LINK__SPECIES, oldSpecies, species));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamaPackage.EPERCEIVE_LINK__PERCEIVE:
				if (resolve) return getPerceive();
				return basicGetPerceive();
			case GamaPackage.EPERCEIVE_LINK__SPECIES:
				if (resolve) return getSpecies();
				return basicGetSpecies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GamaPackage.EPERCEIVE_LINK__PERCEIVE:
				setPerceive((EPerceive)newValue);
				return;
			case GamaPackage.EPERCEIVE_LINK__SPECIES:
				setSpecies((ESpecies)newValue);
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
			case GamaPackage.EPERCEIVE_LINK__PERCEIVE:
				setPerceive((EPerceive)null);
				return;
			case GamaPackage.EPERCEIVE_LINK__SPECIES:
				setSpecies((ESpecies)null);
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
			case GamaPackage.EPERCEIVE_LINK__PERCEIVE:
				return perceive != null;
			case GamaPackage.EPERCEIVE_LINK__SPECIES:
				return species != null;
		}
		return super.eIsSet(featureID);
	}

} //EPerceiveLinkImpl
