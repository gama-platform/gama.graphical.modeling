/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.impl;

import gama.EReflex;
import gama.EReflexLink;
import gama.ESpecies;
import gama.GamaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReflex Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gama.impl.EReflexLinkImpl#getReflex <em>Reflex</em>}</li>
 *   <li>{@link gama.impl.EReflexLinkImpl#getSpecies <em>Species</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EReflexLinkImpl extends EGamaLinkImpl implements EReflexLink {
	/**
	 * The cached value of the '{@link #getReflex() <em>Reflex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflex()
	 * @generated
	 * @ordered
	 */
	protected EReflex reflex;

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
	protected EReflexLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamaPackage.Literals.EREFLEX_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReflex getReflex() {
		if (reflex != null && reflex.eIsProxy()) {
			InternalEObject oldReflex = (InternalEObject)reflex;
			reflex = (EReflex)eResolveProxy(oldReflex);
			if (reflex != oldReflex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamaPackage.EREFLEX_LINK__REFLEX, oldReflex, reflex));
			}
		}
		return reflex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReflex basicGetReflex() {
		return reflex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflex(EReflex newReflex) {
		EReflex oldReflex = reflex;
		reflex = newReflex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamaPackage.EREFLEX_LINK__REFLEX, oldReflex, reflex));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamaPackage.EREFLEX_LINK__SPECIES, oldSpecies, species));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamaPackage.EREFLEX_LINK__SPECIES, oldSpecies, species));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamaPackage.EREFLEX_LINK__REFLEX:
				if (resolve) return getReflex();
				return basicGetReflex();
			case GamaPackage.EREFLEX_LINK__SPECIES:
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
			case GamaPackage.EREFLEX_LINK__REFLEX:
				setReflex((EReflex)newValue);
				return;
			case GamaPackage.EREFLEX_LINK__SPECIES:
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
			case GamaPackage.EREFLEX_LINK__REFLEX:
				setReflex((EReflex)null);
				return;
			case GamaPackage.EREFLEX_LINK__SPECIES:
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
			case GamaPackage.EREFLEX_LINK__REFLEX:
				return reflex != null;
			case GamaPackage.EREFLEX_LINK__SPECIES:
				return species != null;
		}
		return super.eIsSet(featureID);
	}

} //EReflexLinkImpl
