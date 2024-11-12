/**
 */
package RDBModel.impl;

import RDBModel.Column;
import RDBModel.DataType;
import RDBModel.ForeignKey;
import RDBModel.PrimaryKey;
import RDBModel.RDBModelPackage;
import RDBModel.RDBModelTables;
import RDBModel.Table;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RDBModel.impl.ForeignKeyImpl#getSourceTable <em>Source Table</em>}</li>
 *   <li>{@link RDBModel.impl.ForeignKeyImpl#getTargetTable <em>Target Table</em>}</li>
 *   <li>{@link RDBModel.impl.ForeignKeyImpl#getSourceColumn <em>Source Column</em>}</li>
 *   <li>{@link RDBModel.impl.ForeignKeyImpl#getTargetColumn <em>Target Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends MinimalEObjectImpl.Container implements ForeignKey {
	/**
	 * The cached value of the '{@link #getSourceTable() <em>Source Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTable()
	 * @generated
	 * @ordered
	 */
	protected Table sourceTable;

	/**
	 * The cached value of the '{@link #getTargetTable() <em>Target Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTable()
	 * @generated
	 * @ordered
	 */
	protected Table targetTable;

	/**
	 * The cached value of the '{@link #getSourceColumn() <em>Source Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumn()
	 * @generated
	 * @ordered
	 */
	protected Column sourceColumn;

	/**
	 * The cached value of the '{@link #getTargetColumn() <em>Target Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumn()
	 * @generated
	 * @ordered
	 */
	protected Column targetColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBModelPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getSourceTable() {
		if (sourceTable != null && sourceTable.eIsProxy()) {
			InternalEObject oldSourceTable = (InternalEObject)sourceTable;
			sourceTable = (Table)eResolveProxy(oldSourceTable);
			if (sourceTable != oldSourceTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDBModelPackage.FOREIGN_KEY__SOURCE_TABLE, oldSourceTable, sourceTable));
			}
		}
		return sourceTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetSourceTable() {
		return sourceTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceTable(Table newSourceTable) {
		Table oldSourceTable = sourceTable;
		sourceTable = newSourceTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBModelPackage.FOREIGN_KEY__SOURCE_TABLE, oldSourceTable, sourceTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getTargetTable() {
		if (targetTable != null && targetTable.eIsProxy()) {
			InternalEObject oldTargetTable = (InternalEObject)targetTable;
			targetTable = (Table)eResolveProxy(oldTargetTable);
			if (targetTable != oldTargetTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDBModelPackage.FOREIGN_KEY__TARGET_TABLE, oldTargetTable, targetTable));
			}
		}
		return targetTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTargetTable() {
		return targetTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetTable(Table newTargetTable) {
		Table oldTargetTable = targetTable;
		targetTable = newTargetTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBModelPackage.FOREIGN_KEY__TARGET_TABLE, oldTargetTable, targetTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column getSourceColumn() {
		if (sourceColumn != null && sourceColumn.eIsProxy()) {
			InternalEObject oldSourceColumn = (InternalEObject)sourceColumn;
			sourceColumn = (Column)eResolveProxy(oldSourceColumn);
			if (sourceColumn != oldSourceColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDBModelPackage.FOREIGN_KEY__SOURCE_COLUMN, oldSourceColumn, sourceColumn));
			}
		}
		return sourceColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetSourceColumn() {
		return sourceColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceColumn(Column newSourceColumn) {
		Column oldSourceColumn = sourceColumn;
		sourceColumn = newSourceColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBModelPackage.FOREIGN_KEY__SOURCE_COLUMN, oldSourceColumn, sourceColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column getTargetColumn() {
		if (targetColumn != null && targetColumn.eIsProxy()) {
			InternalEObject oldTargetColumn = (InternalEObject)targetColumn;
			targetColumn = (Column)eResolveProxy(oldTargetColumn);
			if (targetColumn != oldTargetColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDBModelPackage.FOREIGN_KEY__TARGET_COLUMN, oldTargetColumn, targetColumn));
			}
		}
		return targetColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetTargetColumn() {
		return targetColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetColumn(Column newTargetColumn) {
		Column oldTargetColumn = targetColumn;
		targetColumn = newTargetColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBModelPackage.FOREIGN_KEY__TARGET_COLUMN, oldTargetColumn, targetColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validFK(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ForeignKey::validFK";
		try {
			/**
			 *
			 * inv validFK:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not targetColumn.isNullable and targetColumn.isUnique or
			 *         targetTable.primaryKey.columns->select(c | c.name = targetColumn.name)
			 *         ->size() = 1 and
			 *         targetTable.primaryKey.columns->size() = 1 or
			 *         targetTable.primaryKey.columns->select(c | c.name = targetColumn.name)
			 *         ->size() = 1 and targetColumn.isUnique
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RDBModelPackage.Literals.FOREIGN_KEY___VALID_FK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RDBModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_or;
					try {
						/*@Caught*/ Object CAUGHT_and;
						try {
							final /*@NonInvalid*/ Column targetColumn_0 = this.getTargetColumn();
							final /*@NonInvalid*/ boolean isNullable = targetColumn_0.isIsNullable();
							final /*@NonInvalid*/ Boolean not;
							if (!isNullable) {
								not = ValueUtil.TRUE_VALUE;
							}
							else {
								if (isNullable) {
									not = ValueUtil.FALSE_VALUE;
								}
								else {
									not = null;
								}
							}
							final /*@Thrown*/ Boolean and;
							if (not == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean isUnique = targetColumn_0.isIsUnique();
								if (!isUnique) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									if (not == null) {
										and = null;
									}
									else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and = and;
						}
						catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or;
						if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
							or = ValueUtil.TRUE_VALUE;
						}
						else {
							/*@Caught*/ Object CAUGHT_and_0;
							try {
								/*@Caught*/ Object CAUGHT_eq_0;
								try {
									final /*@NonInvalid*/ Table targetTable = this.getTargetTable();
									final /*@NonInvalid*/ PrimaryKey primaryKey = targetTable.getPrimaryKey();
									if (primaryKey == null) {
										throw new InvalidValueException("Null source for \'\'https://org/eclipse/RDBModel\'::PrimaryKey::columns\'");
									}
									final /*@Thrown*/ List<Column> columns = primaryKey.getColumns();
									final /*@Thrown*/ OrderedSetValue BOXED_columns = idResolver.createOrderedSetOfAll(RDBModelTables.ORD_CLSSid_Column, columns);
									/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(RDBModelTables.ORD_CLSSid_Column_0);
									Iterator<Object> ITERATOR_c = BOXED_columns.iterator();
									/*@Thrown*/ OrderedSetValue select;
									while (true) {
										if (!ITERATOR_c.hasNext()) {
											select = accumulator;
											break;
										}
										/*@NonInvalid*/ Column c = (Column)ITERATOR_c.next();
										/**
										 * c.name = targetColumn.name
										 */
										final /*@NonInvalid*/ String name = c.getName();
										final /*@NonInvalid*/ Column targetColumn_1 = this.getTargetColumn();
										final /*@NonInvalid*/ String name_0 = targetColumn_1.getName();
										final /*@NonInvalid*/ boolean eq = name.equals(name_0);
										//
										if (eq) {
											accumulator.add(c);
										}
									}
									final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
									final /*@Thrown*/ boolean eq_0 = size.equals(RDBModelTables.INT_1);
									CAUGHT_eq_0 = eq_0;
								}
								catch (Exception e) {
									CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and_0;
								if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_eq_1;
									try {
										final /*@NonInvalid*/ Table targetTable_0 = this.getTargetTable();
										final /*@NonInvalid*/ PrimaryKey primaryKey_0 = targetTable_0.getPrimaryKey();
										if (primaryKey_0 == null) {
											throw new InvalidValueException("Null source for \'\'https://org/eclipse/RDBModel\'::PrimaryKey::columns\'");
										}
										final /*@Thrown*/ List<Column> columns_0 = primaryKey_0.getColumns();
										final /*@Thrown*/ OrderedSetValue BOXED_columns_0 = idResolver.createOrderedSetOfAll(RDBModelTables.ORD_CLSSid_Column, columns_0);
										final /*@Thrown*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_columns_0);
										final /*@Thrown*/ boolean eq_1 = size_0.equals(RDBModelTables.INT_1);
										CAUGHT_eq_1 = eq_1;
									}
									catch (Exception e) {
										CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
										and_0 = ValueUtil.FALSE_VALUE;
									}
									else {
										if (CAUGHT_eq_0 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_eq_0;
										}
										if (CAUGHT_eq_1 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_eq_1;
										}
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
								CAUGHT_and_0 = and_0;
							}
							catch (Exception e) {
								CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_and instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_and;
								}
								if (CAUGHT_and_0 instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_and_0;
								}
								if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
									or = null;
								}
								else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or = or;
					}
					catch (Exception e) {
						CAUGHT_or = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_and_1;
						try {
							final /*@NonInvalid*/ Column targetColumn_3 = this.getTargetColumn();
							/*@Caught*/ Object CAUGHT_eq_3;
							try {
								final /*@NonInvalid*/ Table targetTable_1 = this.getTargetTable();
								final /*@NonInvalid*/ PrimaryKey primaryKey_1 = targetTable_1.getPrimaryKey();
								if (primaryKey_1 == null) {
									throw new InvalidValueException("Null source for \'\'https://org/eclipse/RDBModel\'::PrimaryKey::columns\'");
								}
								final /*@Thrown*/ List<Column> columns_1 = primaryKey_1.getColumns();
								final /*@Thrown*/ OrderedSetValue BOXED_columns_1 = idResolver.createOrderedSetOfAll(RDBModelTables.ORD_CLSSid_Column, columns_1);
								/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(RDBModelTables.ORD_CLSSid_Column_0);
								Iterator<Object> ITERATOR_c_0 = BOXED_columns_1.iterator();
								/*@Thrown*/ OrderedSetValue select_0;
								while (true) {
									if (!ITERATOR_c_0.hasNext()) {
										select_0 = accumulator_0;
										break;
									}
									/*@NonInvalid*/ Column c_0 = (Column)ITERATOR_c_0.next();
									/**
									 * c.name = targetColumn.name
									 */
									final /*@NonInvalid*/ String name_1 = c_0.getName();
									final /*@NonInvalid*/ String name_2 = targetColumn_3.getName();
									final /*@NonInvalid*/ boolean eq_2 = name_1.equals(name_2);
									//
									if (eq_2) {
										accumulator_0.add(c_0);
									}
								}
								final /*@Thrown*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE.evaluate(select_0);
								final /*@Thrown*/ boolean eq_3 = size_1.equals(RDBModelTables.INT_1);
								CAUGHT_eq_3 = eq_3;
							}
							catch (Exception e) {
								CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_1;
							if (CAUGHT_eq_3 == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean isUnique_0 = targetColumn_3.isIsUnique();
								if (!isUnique_0) {
									and_1 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_eq_3 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_eq_3;
									}
									and_1 = ValueUtil.TRUE_VALUE;
								}
							}
							CAUGHT_and_1 = and_1;
						}
						catch (Exception e) {
							CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_1 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_or instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_or;
							}
							if (CAUGHT_and_1 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_1;
							}
							if ((CAUGHT_or == null) || (CAUGHT_and_1 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, RDBModelTables.INT_0).booleanValue();
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
	public boolean columnInSource(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ForeignKey::columnInSource";
		try {
			/**
			 *
			 * inv columnInSource:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = sourceTable.columns->select(c | c.name = sourceColumn.name)
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RDBModelPackage.Literals.FOREIGN_KEY___COLUMN_IN_SOURCE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RDBModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ Table sourceTable = this.getSourceTable();
				final /*@NonInvalid*/ List<Column> columns = sourceTable.getColumns();
				final /*@NonInvalid*/ OrderedSetValue BOXED_columns = idResolver.createOrderedSetOfAll(RDBModelTables.ORD_CLSSid_Column, columns);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(RDBModelTables.ORD_CLSSid_Column_0);
				Iterator<Object> ITERATOR_c = BOXED_columns.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Column c = (Column)ITERATOR_c.next();
					/**
					 * c.name = sourceColumn.name
					 */
					final /*@NonInvalid*/ String name = c.getName();
					final /*@NonInvalid*/ Column sourceColumn = this.getSourceColumn();
					final /*@NonInvalid*/ String name_0 = sourceColumn.getName();
					final /*@NonInvalid*/ boolean eq = name.equals(name_0);
					//
					if (eq) {
						accumulator.add(c);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = size.equals(RDBModelTables.INT_1);
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
	public boolean columnInTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ForeignKey::columnInTarget";
		try {
			/**
			 *
			 * inv columnInTarget:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = targetTable.columns->select(c | c.name = targetColumn.name)
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RDBModelPackage.Literals.FOREIGN_KEY___COLUMN_IN_TARGET__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RDBModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ Table targetTable = this.getTargetTable();
				final /*@NonInvalid*/ List<Column> columns = targetTable.getColumns();
				final /*@NonInvalid*/ OrderedSetValue BOXED_columns = idResolver.createOrderedSetOfAll(RDBModelTables.ORD_CLSSid_Column, columns);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(RDBModelTables.ORD_CLSSid_Column_0);
				Iterator<Object> ITERATOR_c = BOXED_columns.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Column c = (Column)ITERATOR_c.next();
					/**
					 * c.name = targetColumn.name
					 */
					final /*@NonInvalid*/ String name = c.getName();
					final /*@NonInvalid*/ Column targetColumn = this.getTargetColumn();
					final /*@NonInvalid*/ String name_0 = targetColumn.getName();
					final /*@NonInvalid*/ boolean eq = name.equals(name_0);
					//
					if (eq) {
						accumulator.add(c);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = size.equals(RDBModelTables.INT_1);
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
	public boolean sameTypeKeys(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ForeignKey::sameTypeKeys";
		try {
			/**
			 *
			 * inv sameTypeKeys:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = sourceColumn.type = targetColumn.type
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RDBModelPackage.Literals.FOREIGN_KEY___SAME_TYPE_KEYS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RDBModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ Column sourceColumn = this.getSourceColumn();
				final /*@NonInvalid*/ DataType type = sourceColumn.getType();
				final /*@NonInvalid*/ Column targetColumn = this.getTargetColumn();
				final /*@NonInvalid*/ DataType type_0 = targetColumn.getType();
				final /*@NonInvalid*/ boolean result = type.equals(type_0);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDBModelPackage.FOREIGN_KEY__SOURCE_TABLE:
				if (resolve) return getSourceTable();
				return basicGetSourceTable();
			case RDBModelPackage.FOREIGN_KEY__TARGET_TABLE:
				if (resolve) return getTargetTable();
				return basicGetTargetTable();
			case RDBModelPackage.FOREIGN_KEY__SOURCE_COLUMN:
				if (resolve) return getSourceColumn();
				return basicGetSourceColumn();
			case RDBModelPackage.FOREIGN_KEY__TARGET_COLUMN:
				if (resolve) return getTargetColumn();
				return basicGetTargetColumn();
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
			case RDBModelPackage.FOREIGN_KEY__SOURCE_TABLE:
				setSourceTable((Table)newValue);
				return;
			case RDBModelPackage.FOREIGN_KEY__TARGET_TABLE:
				setTargetTable((Table)newValue);
				return;
			case RDBModelPackage.FOREIGN_KEY__SOURCE_COLUMN:
				setSourceColumn((Column)newValue);
				return;
			case RDBModelPackage.FOREIGN_KEY__TARGET_COLUMN:
				setTargetColumn((Column)newValue);
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
			case RDBModelPackage.FOREIGN_KEY__SOURCE_TABLE:
				setSourceTable((Table)null);
				return;
			case RDBModelPackage.FOREIGN_KEY__TARGET_TABLE:
				setTargetTable((Table)null);
				return;
			case RDBModelPackage.FOREIGN_KEY__SOURCE_COLUMN:
				setSourceColumn((Column)null);
				return;
			case RDBModelPackage.FOREIGN_KEY__TARGET_COLUMN:
				setTargetColumn((Column)null);
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
			case RDBModelPackage.FOREIGN_KEY__SOURCE_TABLE:
				return sourceTable != null;
			case RDBModelPackage.FOREIGN_KEY__TARGET_TABLE:
				return targetTable != null;
			case RDBModelPackage.FOREIGN_KEY__SOURCE_COLUMN:
				return sourceColumn != null;
			case RDBModelPackage.FOREIGN_KEY__TARGET_COLUMN:
				return targetColumn != null;
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
			case RDBModelPackage.FOREIGN_KEY___VALID_FK__DIAGNOSTICCHAIN_MAP:
				return validFK((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RDBModelPackage.FOREIGN_KEY___COLUMN_IN_SOURCE__DIAGNOSTICCHAIN_MAP:
				return columnInSource((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RDBModelPackage.FOREIGN_KEY___COLUMN_IN_TARGET__DIAGNOSTICCHAIN_MAP:
				return columnInTarget((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RDBModelPackage.FOREIGN_KEY___SAME_TYPE_KEYS__DIAGNOSTICCHAIN_MAP:
				return sameTypeKeys((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ForeignKeyImpl
