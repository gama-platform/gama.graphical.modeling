/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gama.impl;

import gama.EActionLink;
import gama.EAspectLink;
import gama.EEquationLink;
import gama.EExperimentLink;
import gama.EInheritLink;
import gama.EPerceiveLink;
import gama.EPlanLink;
import gama.EReflexLink;
import gama.ERuleLink;
import gama.ESpecies;
import gama.EState;
import gama.EStateLink;
import gama.ESubSpeciesLink;
import gama.ETaskLink;
import gama.ETopology;
import gama.EVariable;
import gama.GamaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESpecies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gama.impl.ESpeciesImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getReflexList <em>Reflex List</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getExperimentLinks <em>Experiment Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getAspectLinks <em>Aspect Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getActionLinks <em>Action Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getReflexLinks <em>Reflex Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getMicroSpeciesLinks <em>Micro Species Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getMacroSpeciesLinks <em>Macro Species Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getInheritsFrom <em>Inherits From</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getInit <em>Init</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getInheritingLinks <em>Inheriting Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getPlanLinks <em>Plan Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getStateLinks <em>State Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getTaskLinks <em>Task Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getPerceiveLinks <em>Perceive Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getRuleLinks <em>Rule Links</em>}</li>
 *   <li>{@link gama.impl.ESpeciesImpl#getEquationLinks <em>Equation Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESpeciesImpl extends EGamaObjectImpl implements ESpecies {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<EVariable> variables;

	/**
	 * The cached value of the '{@link #getReflexList() <em>Reflex List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflexList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> reflexList;

	/**
	 * The cached value of the '{@link #getExperimentLinks() <em>Experiment Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EExperimentLink> experimentLinks;

	/**
	 * The cached value of the '{@link #getAspectLinks() <em>Aspect Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EAspectLink> aspectLinks;

	/**
	 * The cached value of the '{@link #getActionLinks() <em>Action Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EActionLink> actionLinks;

	/**
	 * The cached value of the '{@link #getReflexLinks() <em>Reflex Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflexLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EReflexLink> reflexLinks;

	/**
	 * The cached value of the '{@link #getMicroSpeciesLinks() <em>Micro Species Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroSpeciesLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ESubSpeciesLink> microSpeciesLinks;

	/**
	 * The cached value of the '{@link #getMacroSpeciesLinks() <em>Macro Species Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacroSpeciesLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ESubSpeciesLink> macroSpeciesLinks;

	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<String> skills;

	/**
	 * The cached value of the '{@link #getInheritsFrom() <em>Inherits From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritsFrom()
	 * @generated
	 * @ordered
	 */
	protected ESpecies inheritsFrom;

	/**
	 * The default value of the '{@link #getInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected String init = INIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInheritingLinks() <em>Inheriting Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EInheritLink> inheritingLinks;

	/**
	 * The cached value of the '{@link #getPlanLinks() <em>Plan Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EPlanLink> planLinks;

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
	 * The cached value of the '{@link #getTaskLinks() <em>Task Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ETaskLink> taskLinks;

	/**
	 * The cached value of the '{@link #getPerceiveLinks() <em>Perceive Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceiveLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EPerceiveLink> perceiveLinks;

	/**
	 * The cached value of the '{@link #getRuleLinks() <em>Rule Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ERuleLink> ruleLinks;

	/**
	 * The cached value of the '{@link #getEquationLinks() <em>Equation Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EEquationLink> equationLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESpeciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamaPackage.Literals.ESPECIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<EVariable>(EVariable.class, this, GamaPackage.ESPECIES__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReflexList() {
		if (reflexList == null) {
			reflexList = new EDataTypeUniqueEList<String>(String.class, this, GamaPackage.ESPECIES__REFLEX_LIST);
		}
		return reflexList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EExperimentLink> getExperimentLinks() {
		if (experimentLinks == null) {
			experimentLinks = new EObjectResolvingEList<EExperimentLink>(EExperimentLink.class, this, GamaPackage.ESPECIES__EXPERIMENT_LINKS);
		}
		return experimentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAspectLink> getAspectLinks() {
		if (aspectLinks == null) {
			aspectLinks = new EObjectResolvingEList<EAspectLink>(EAspectLink.class, this, GamaPackage.ESPECIES__ASPECT_LINKS);
		}
		return aspectLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EActionLink> getActionLinks() {
		if (actionLinks == null) {
			actionLinks = new EObjectResolvingEList<EActionLink>(EActionLink.class, this, GamaPackage.ESPECIES__ACTION_LINKS);
		}
		return actionLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReflexLink> getReflexLinks() {
		if (reflexLinks == null) {
			reflexLinks = new EObjectResolvingEList<EReflexLink>(EReflexLink.class, this, GamaPackage.ESPECIES__REFLEX_LINKS);
		}
		return reflexLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESubSpeciesLink> getMicroSpeciesLinks() {
		if (microSpeciesLinks == null) {
			microSpeciesLinks = new EObjectResolvingEList<ESubSpeciesLink>(ESubSpeciesLink.class, this, GamaPackage.ESPECIES__MICRO_SPECIES_LINKS);
		}
		return microSpeciesLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESubSpeciesLink> getMacroSpeciesLinks() {
		if (macroSpeciesLinks == null) {
			macroSpeciesLinks = new EObjectResolvingEList<ESubSpeciesLink>(ESubSpeciesLink.class, this, GamaPackage.ESPECIES__MACRO_SPECIES_LINKS);
		}
		return macroSpeciesLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSkills() {
		if (skills == null) {
			skills = new EDataTypeUniqueEList<String>(String.class, this, GamaPackage.ESPECIES__SKILLS);
		}
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESpecies getInheritsFrom() {
		if (inheritsFrom != null && inheritsFrom.eIsProxy()) {
			InternalEObject oldInheritsFrom = (InternalEObject)inheritsFrom;
			inheritsFrom = (ESpecies)eResolveProxy(oldInheritsFrom);
			if (inheritsFrom != oldInheritsFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamaPackage.ESPECIES__INHERITS_FROM, oldInheritsFrom, inheritsFrom));
			}
		}
		return inheritsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESpecies basicGetInheritsFrom() {
		return inheritsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritsFrom(ESpecies newInheritsFrom) {
		ESpecies oldInheritsFrom = inheritsFrom;
		inheritsFrom = newInheritsFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamaPackage.ESPECIES__INHERITS_FROM, oldInheritsFrom, inheritsFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(String newInit) {
		String oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamaPackage.ESPECIES__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EInheritLink> getInheritingLinks() {
		if (inheritingLinks == null) {
			inheritingLinks = new EObjectResolvingEList<EInheritLink>(EInheritLink.class, this, GamaPackage.ESPECIES__INHERITING_LINKS);
		}
		return inheritingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPlanLink> getPlanLinks() {
		if (planLinks == null) {
			planLinks = new EObjectResolvingEList<EPlanLink>(EPlanLink.class, this, GamaPackage.ESPECIES__PLAN_LINKS);
		}
		return planLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStateLink> getStateLinks() {
		if (stateLinks == null) {
			stateLinks = new EObjectResolvingEList<EStateLink>(EStateLink.class, this, GamaPackage.ESPECIES__STATE_LINKS);
		}
		return stateLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ETaskLink> getTaskLinks() {
		if (taskLinks == null) {
			taskLinks = new EObjectResolvingEList<ETaskLink>(ETaskLink.class, this, GamaPackage.ESPECIES__TASK_LINKS);
		}
		return taskLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPerceiveLink> getPerceiveLinks() {
		if (perceiveLinks == null) {
			perceiveLinks = new EObjectResolvingEList<EPerceiveLink>(EPerceiveLink.class, this, GamaPackage.ESPECIES__PERCEIVE_LINKS);
		}
		return perceiveLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERuleLink> getRuleLinks() {
		if (ruleLinks == null) {
			ruleLinks = new EObjectResolvingEList<ERuleLink>(ERuleLink.class, this, GamaPackage.ESPECIES__RULE_LINKS);
		}
		return ruleLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EEquationLink> getEquationLinks() {
		if (equationLinks == null) {
			equationLinks = new EObjectResolvingEList<EEquationLink>(EEquationLink.class, this, GamaPackage.ESPECIES__EQUATION_LINKS);
		}
		return equationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamaPackage.ESPECIES__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamaPackage.ESPECIES__VARIABLES:
				return getVariables();
			case GamaPackage.ESPECIES__REFLEX_LIST:
				return getReflexList();
			case GamaPackage.ESPECIES__EXPERIMENT_LINKS:
				return getExperimentLinks();
			case GamaPackage.ESPECIES__ASPECT_LINKS:
				return getAspectLinks();
			case GamaPackage.ESPECIES__ACTION_LINKS:
				return getActionLinks();
			case GamaPackage.ESPECIES__REFLEX_LINKS:
				return getReflexLinks();
			case GamaPackage.ESPECIES__MICRO_SPECIES_LINKS:
				return getMicroSpeciesLinks();
			case GamaPackage.ESPECIES__MACRO_SPECIES_LINKS:
				return getMacroSpeciesLinks();
			case GamaPackage.ESPECIES__SKILLS:
				return getSkills();
			case GamaPackage.ESPECIES__INHERITS_FROM:
				if (resolve) return getInheritsFrom();
				return basicGetInheritsFrom();
			case GamaPackage.ESPECIES__INIT:
				return getInit();
			case GamaPackage.ESPECIES__INHERITING_LINKS:
				return getInheritingLinks();
			case GamaPackage.ESPECIES__PLAN_LINKS:
				return getPlanLinks();
			case GamaPackage.ESPECIES__STATE_LINKS:
				return getStateLinks();
			case GamaPackage.ESPECIES__TASK_LINKS:
				return getTaskLinks();
			case GamaPackage.ESPECIES__PERCEIVE_LINKS:
				return getPerceiveLinks();
			case GamaPackage.ESPECIES__RULE_LINKS:
				return getRuleLinks();
			case GamaPackage.ESPECIES__EQUATION_LINKS:
				return getEquationLinks();
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
			case GamaPackage.ESPECIES__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends EVariable>)newValue);
				return;
			case GamaPackage.ESPECIES__REFLEX_LIST:
				getReflexList().clear();
				getReflexList().addAll((Collection<? extends String>)newValue);
				return;
			case GamaPackage.ESPECIES__EXPERIMENT_LINKS:
				getExperimentLinks().clear();
				getExperimentLinks().addAll((Collection<? extends EExperimentLink>)newValue);
				return;
			case GamaPackage.ESPECIES__ASPECT_LINKS:
				getAspectLinks().clear();
				getAspectLinks().addAll((Collection<? extends EAspectLink>)newValue);
				return;
			case GamaPackage.ESPECIES__ACTION_LINKS:
				getActionLinks().clear();
				getActionLinks().addAll((Collection<? extends EActionLink>)newValue);
				return;
			case GamaPackage.ESPECIES__REFLEX_LINKS:
				getReflexLinks().clear();
				getReflexLinks().addAll((Collection<? extends EReflexLink>)newValue);
				return;
			case GamaPackage.ESPECIES__MICRO_SPECIES_LINKS:
				getMicroSpeciesLinks().clear();
				getMicroSpeciesLinks().addAll((Collection<? extends ESubSpeciesLink>)newValue);
				return;
			case GamaPackage.ESPECIES__MACRO_SPECIES_LINKS:
				getMacroSpeciesLinks().clear();
				getMacroSpeciesLinks().addAll((Collection<? extends ESubSpeciesLink>)newValue);
				return;
			case GamaPackage.ESPECIES__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends String>)newValue);
				return;
			case GamaPackage.ESPECIES__INHERITS_FROM:
				setInheritsFrom((ESpecies)newValue);
				return;
			case GamaPackage.ESPECIES__INIT:
				setInit((String)newValue);
				return;
			case GamaPackage.ESPECIES__INHERITING_LINKS:
				getInheritingLinks().clear();
				getInheritingLinks().addAll((Collection<? extends EInheritLink>)newValue);
				return;
			case GamaPackage.ESPECIES__PLAN_LINKS:
				getPlanLinks().clear();
				getPlanLinks().addAll((Collection<? extends EPlanLink>)newValue);
				return;
			case GamaPackage.ESPECIES__STATE_LINKS:
				getStateLinks().clear();
				getStateLinks().addAll((Collection<? extends EStateLink>)newValue);
				return;
			case GamaPackage.ESPECIES__TASK_LINKS:
				getTaskLinks().clear();
				getTaskLinks().addAll((Collection<? extends ETaskLink>)newValue);
				return;
			case GamaPackage.ESPECIES__PERCEIVE_LINKS:
				getPerceiveLinks().clear();
				getPerceiveLinks().addAll((Collection<? extends EPerceiveLink>)newValue);
				return;
			case GamaPackage.ESPECIES__RULE_LINKS:
				getRuleLinks().clear();
				getRuleLinks().addAll((Collection<? extends ERuleLink>)newValue);
				return;
			case GamaPackage.ESPECIES__EQUATION_LINKS:
				getEquationLinks().clear();
				getEquationLinks().addAll((Collection<? extends EEquationLink>)newValue);
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
			case GamaPackage.ESPECIES__VARIABLES:
				getVariables().clear();
				return;
			case GamaPackage.ESPECIES__REFLEX_LIST:
				getReflexList().clear();
				return;
			case GamaPackage.ESPECIES__EXPERIMENT_LINKS:
				getExperimentLinks().clear();
				return;
			case GamaPackage.ESPECIES__ASPECT_LINKS:
				getAspectLinks().clear();
				return;
			case GamaPackage.ESPECIES__ACTION_LINKS:
				getActionLinks().clear();
				return;
			case GamaPackage.ESPECIES__REFLEX_LINKS:
				getReflexLinks().clear();
				return;
			case GamaPackage.ESPECIES__MICRO_SPECIES_LINKS:
				getMicroSpeciesLinks().clear();
				return;
			case GamaPackage.ESPECIES__MACRO_SPECIES_LINKS:
				getMacroSpeciesLinks().clear();
				return;
			case GamaPackage.ESPECIES__SKILLS:
				getSkills().clear();
				return;
			case GamaPackage.ESPECIES__INHERITS_FROM:
				setInheritsFrom((ESpecies)null);
				return;
			case GamaPackage.ESPECIES__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case GamaPackage.ESPECIES__INHERITING_LINKS:
				getInheritingLinks().clear();
				return;
			case GamaPackage.ESPECIES__PLAN_LINKS:
				getPlanLinks().clear();
				return;
			case GamaPackage.ESPECIES__STATE_LINKS:
				getStateLinks().clear();
				return;
			case GamaPackage.ESPECIES__TASK_LINKS:
				getTaskLinks().clear();
				return;
			case GamaPackage.ESPECIES__PERCEIVE_LINKS:
				getPerceiveLinks().clear();
				return;
			case GamaPackage.ESPECIES__RULE_LINKS:
				getRuleLinks().clear();
				return;
			case GamaPackage.ESPECIES__EQUATION_LINKS:
				getEquationLinks().clear();
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
			case GamaPackage.ESPECIES__VARIABLES:
				return variables != null && !variables.isEmpty();
			case GamaPackage.ESPECIES__REFLEX_LIST:
				return reflexList != null && !reflexList.isEmpty();
			case GamaPackage.ESPECIES__EXPERIMENT_LINKS:
				return experimentLinks != null && !experimentLinks.isEmpty();
			case GamaPackage.ESPECIES__ASPECT_LINKS:
				return aspectLinks != null && !aspectLinks.isEmpty();
			case GamaPackage.ESPECIES__ACTION_LINKS:
				return actionLinks != null && !actionLinks.isEmpty();
			case GamaPackage.ESPECIES__REFLEX_LINKS:
				return reflexLinks != null && !reflexLinks.isEmpty();
			case GamaPackage.ESPECIES__MICRO_SPECIES_LINKS:
				return microSpeciesLinks != null && !microSpeciesLinks.isEmpty();
			case GamaPackage.ESPECIES__MACRO_SPECIES_LINKS:
				return macroSpeciesLinks != null && !macroSpeciesLinks.isEmpty();
			case GamaPackage.ESPECIES__SKILLS:
				return skills != null && !skills.isEmpty();
			case GamaPackage.ESPECIES__INHERITS_FROM:
				return inheritsFrom != null;
			case GamaPackage.ESPECIES__INIT:
				return INIT_EDEFAULT == null ? init != null : !INIT_EDEFAULT.equals(init);
			case GamaPackage.ESPECIES__INHERITING_LINKS:
				return inheritingLinks != null && !inheritingLinks.isEmpty();
			case GamaPackage.ESPECIES__PLAN_LINKS:
				return planLinks != null && !planLinks.isEmpty();
			case GamaPackage.ESPECIES__STATE_LINKS:
				return stateLinks != null && !stateLinks.isEmpty();
			case GamaPackage.ESPECIES__TASK_LINKS:
				return taskLinks != null && !taskLinks.isEmpty();
			case GamaPackage.ESPECIES__PERCEIVE_LINKS:
				return perceiveLinks != null && !perceiveLinks.isEmpty();
			case GamaPackage.ESPECIES__RULE_LINKS:
				return ruleLinks != null && !ruleLinks.isEmpty();
			case GamaPackage.ESPECIES__EQUATION_LINKS:
				return equationLinks != null && !equationLinks.isEmpty();
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
		result.append(" (reflexList: ");
		result.append(reflexList);
		result.append(", skills: ");
		result.append(skills);
		result.append(", init: ");
		result.append(init);
		result.append(')');
		return result.toString();
	}

} //ESpeciesImpl
