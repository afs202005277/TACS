/**
 */
package ERModel.impl;

import ERModel.Cardinality;
import ERModel.ERModelPackage;
import ERModel.Entity;
import ERModel.Relationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ERModel.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link ERModel.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ERModel.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ERModel.impl.RelationshipImpl#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link ERModel.impl.RelationshipImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Entity source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Entity target;

	/**
	 * The cached value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality sourceCardinality;

	/**
	 * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality targetCardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ERModelPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ERModelPackage.RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Entity)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ERModelPackage.RELATIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Entity newSource) {
		Entity oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ERModelPackage.RELATIONSHIP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Entity)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ERModelPackage.RELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Entity newTarget) {
		Entity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ERModelPackage.RELATIONSHIP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cardinality getSourceCardinality() {
		if (sourceCardinality != null && sourceCardinality.eIsProxy()) {
			InternalEObject oldSourceCardinality = (InternalEObject)sourceCardinality;
			sourceCardinality = (Cardinality)eResolveProxy(oldSourceCardinality);
			if (sourceCardinality != oldSourceCardinality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ERModelPackage.RELATIONSHIP__SOURCE_CARDINALITY, oldSourceCardinality, sourceCardinality));
			}
		}
		return sourceCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality basicGetSourceCardinality() {
		return sourceCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceCardinality(Cardinality newSourceCardinality) {
		Cardinality oldSourceCardinality = sourceCardinality;
		sourceCardinality = newSourceCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ERModelPackage.RELATIONSHIP__SOURCE_CARDINALITY, oldSourceCardinality, sourceCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cardinality getTargetCardinality() {
		if (targetCardinality != null && targetCardinality.eIsProxy()) {
			InternalEObject oldTargetCardinality = (InternalEObject)targetCardinality;
			targetCardinality = (Cardinality)eResolveProxy(oldTargetCardinality);
			if (targetCardinality != oldTargetCardinality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ERModelPackage.RELATIONSHIP__TARGET_CARDINALITY, oldTargetCardinality, targetCardinality));
			}
		}
		return targetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality basicGetTargetCardinality() {
		return targetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetCardinality(Cardinality newTargetCardinality) {
		Cardinality oldTargetCardinality = targetCardinality;
		targetCardinality = newTargetCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ERModelPackage.RELATIONSHIP__TARGET_CARDINALITY, oldTargetCardinality, targetCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ERModelPackage.RELATIONSHIP__NAME:
				return getName();
			case ERModelPackage.RELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ERModelPackage.RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ERModelPackage.RELATIONSHIP__SOURCE_CARDINALITY:
				if (resolve) return getSourceCardinality();
				return basicGetSourceCardinality();
			case ERModelPackage.RELATIONSHIP__TARGET_CARDINALITY:
				if (resolve) return getTargetCardinality();
				return basicGetTargetCardinality();
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
			case ERModelPackage.RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case ERModelPackage.RELATIONSHIP__SOURCE:
				setSource((Entity)newValue);
				return;
			case ERModelPackage.RELATIONSHIP__TARGET:
				setTarget((Entity)newValue);
				return;
			case ERModelPackage.RELATIONSHIP__SOURCE_CARDINALITY:
				setSourceCardinality((Cardinality)newValue);
				return;
			case ERModelPackage.RELATIONSHIP__TARGET_CARDINALITY:
				setTargetCardinality((Cardinality)newValue);
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
			case ERModelPackage.RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ERModelPackage.RELATIONSHIP__SOURCE:
				setSource((Entity)null);
				return;
			case ERModelPackage.RELATIONSHIP__TARGET:
				setTarget((Entity)null);
				return;
			case ERModelPackage.RELATIONSHIP__SOURCE_CARDINALITY:
				setSourceCardinality((Cardinality)null);
				return;
			case ERModelPackage.RELATIONSHIP__TARGET_CARDINALITY:
				setTargetCardinality((Cardinality)null);
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
			case ERModelPackage.RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ERModelPackage.RELATIONSHIP__SOURCE:
				return source != null;
			case ERModelPackage.RELATIONSHIP__TARGET:
				return target != null;
			case ERModelPackage.RELATIONSHIP__SOURCE_CARDINALITY:
				return sourceCardinality != null;
			case ERModelPackage.RELATIONSHIP__TARGET_CARDINALITY:
				return targetCardinality != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
