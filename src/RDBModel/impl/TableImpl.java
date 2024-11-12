/**
 */
package RDBModel.impl;

import RDBModel.Column;
import RDBModel.ForeignKey;
import RDBModel.PrimaryKey;
import RDBModel.RDBModelPackage;
import RDBModel.RDBModelTables;
import RDBModel.Table;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RDBModel.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link RDBModel.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link RDBModel.impl.TableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link RDBModel.impl.TableImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
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
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey primaryKey;

	/**
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> foreignKeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBModelPackage.Literals.TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RDBModelPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, RDBModelPackage.TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
		PrimaryKey oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBModelPackage.TABLE__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		if (newPrimaryKey != primaryKey) {
			NotificationChain msgs = null;
			if (primaryKey != null)
				msgs = ((InternalEObject)primaryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBModelPackage.TABLE__PRIMARY_KEY, null, msgs);
			if (newPrimaryKey != null)
				msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBModelPackage.TABLE__PRIMARY_KEY, null, msgs);
			msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBModelPackage.TABLE__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignKey> getForeignKeys() {
		if (foreignKeys == null) {
			foreignKeys = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, RDBModelPackage.TABLE__FOREIGN_KEYS);
		}
		return foreignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean uniqueName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Table::uniqueName";
		try {
			/**
			 *
			 * inv uniqueName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Table.allInstances()->isUnique(e | e.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RDBModelPackage.Literals.TABLE___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RDBModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_RDBModel_c_c_Table = idResolver.getClass(RDBModelTables.CLSSid_Table, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, RDBModelTables.SET_CLSSid_Table, TYP_RDBModel_c_c_Table);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(RDBModelTables.SET_CLSSid_Table);
				Iterator<Object> ITERATOR_e_0 = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Table e_0 = (Table)ITERATOR_e_0.next();
					/**
					 * e.name
					 */
					final /*@NonInvalid*/ String name = e_0.getName();
					//
					if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(name);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RDBModelTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean uniqueColumnNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Table::uniqueColumnNames";
		try {
			/**
			 *
			 * inv uniqueColumnNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = columns->isUnique(e | e.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RDBModelPackage.Literals.TABLE___UNIQUE_COLUMN_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RDBModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Column> columns = this.getColumns();
				final /*@NonInvalid*/ OrderedSetValue BOXED_columns = idResolver.createOrderedSetOfAll(RDBModelTables.ORD_CLSSid_Column, columns);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(RDBModelTables.ORD_CLSSid_Column);
				Iterator<Object> ITERATOR_e_0 = BOXED_columns.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Column e_0 = (Column)ITERATOR_e_0.next();
					/**
					 * e.name
					 */
					final /*@NonInvalid*/ String name = e_0.getName();
					//
					if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(name);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RDBModelTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDBModelPackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case RDBModelPackage.TABLE__PRIMARY_KEY:
				return basicSetPrimaryKey(null, msgs);
			case RDBModelPackage.TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
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
			case RDBModelPackage.TABLE__NAME:
				return getName();
			case RDBModelPackage.TABLE__COLUMNS:
				return getColumns();
			case RDBModelPackage.TABLE__PRIMARY_KEY:
				return getPrimaryKey();
			case RDBModelPackage.TABLE__FOREIGN_KEYS:
				return getForeignKeys();
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
			case RDBModelPackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case RDBModelPackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case RDBModelPackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
				return;
			case RDBModelPackage.TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends ForeignKey>)newValue);
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
			case RDBModelPackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RDBModelPackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case RDBModelPackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
				return;
			case RDBModelPackage.TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
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
			case RDBModelPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RDBModelPackage.TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case RDBModelPackage.TABLE__PRIMARY_KEY:
				return primaryKey != null;
			case RDBModelPackage.TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RDBModelPackage.TABLE___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP:
				return uniqueName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RDBModelPackage.TABLE___UNIQUE_COLUMN_NAMES__DIAGNOSTICCHAIN_MAP:
				return uniqueColumnNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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

} //TableImpl
