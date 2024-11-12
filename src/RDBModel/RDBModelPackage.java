/**
 */
package RDBModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RDBModel.RDBModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface RDBModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RDBModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org/eclipse/RDBModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RDBModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RDBModelPackage eINSTANCE = RDBModel.impl.RDBModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link RDBModel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RDBModel.impl.TableImpl
	 * @see RDBModel.impl.RDBModelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRIMARY_KEY = 2;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FOREIGN_KEYS = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Unique Column Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___UNIQUE_COLUMN_NAMES__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link RDBModel.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RDBModel.impl.ColumnImpl
	 * @see RDBModel.impl.RDBModelPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_NULLABLE = 2;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_UNIQUE = 3;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Type Must Be Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN___TYPE_MUST_BE_SET__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RDBModel.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RDBModel.impl.PrimaryKeyImpl
	 * @see RDBModel.impl.RDBModelPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Not Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY___NOT_NULL__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RDBModel.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RDBModel.impl.ForeignKeyImpl
	 * @see RDBModel.impl.RDBModelPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 3;

	/**
	 * The feature id for the '<em><b>Source Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__SOURCE_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Target Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TARGET_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Source Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__SOURCE_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Target Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TARGET_COLUMN = 3;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Valid FK</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY___VALID_FK__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Column In Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY___COLUMN_IN_SOURCE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Column In Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY___COLUMN_IN_TARGET__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Same Type Keys</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY___SAME_TYPE_KEYS__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link RDBModel.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RDBModel.DataType
	 * @see RDBModel.impl.RDBModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link RDBModel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see RDBModel.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link RDBModel.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RDBModel.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link RDBModel.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see RDBModel.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link RDBModel.Table#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key</em>'.
	 * @see RDBModel.Table#getPrimaryKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link RDBModel.Table#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see RDBModel.Table#getForeignKeys()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ForeignKeys();

	/**
	 * Returns the meta object for the '{@link RDBModel.Table#uniqueName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Name</em>' operation.
	 * @see RDBModel.Table#uniqueName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTable__UniqueName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link RDBModel.Table#uniqueColumnNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Column Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Column Names</em>' operation.
	 * @see RDBModel.Table#uniqueColumnNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTable__UniqueColumnNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link RDBModel.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see RDBModel.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link RDBModel.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RDBModel.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link RDBModel.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see RDBModel.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link RDBModel.Column#isIsNullable <em>Is Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable</em>'.
	 * @see RDBModel.Column#isIsNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsNullable();

	/**
	 * Returns the meta object for the attribute '{@link RDBModel.Column#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see RDBModel.Column#isIsUnique()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsUnique();

	/**
	 * Returns the meta object for the '{@link RDBModel.Column#typeMustBeSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Type Must Be Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Must Be Set</em>' operation.
	 * @see RDBModel.Column#typeMustBeSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getColumn__TypeMustBeSet__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link RDBModel.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see RDBModel.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the reference list '{@link RDBModel.PrimaryKey#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see RDBModel.PrimaryKey#getColumns()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Columns();

	/**
	 * Returns the meta object for the '{@link RDBModel.PrimaryKey#notNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Null</em>' operation.
	 * @see RDBModel.PrimaryKey#notNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrimaryKey__NotNull__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link RDBModel.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see RDBModel.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link RDBModel.ForeignKey#getSourceTable <em>Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Table</em>'.
	 * @see RDBModel.ForeignKey#getSourceTable()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_SourceTable();

	/**
	 * Returns the meta object for the reference '{@link RDBModel.ForeignKey#getTargetTable <em>Target Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Table</em>'.
	 * @see RDBModel.ForeignKey#getTargetTable()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_TargetTable();

	/**
	 * Returns the meta object for the reference '{@link RDBModel.ForeignKey#getSourceColumn <em>Source Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Column</em>'.
	 * @see RDBModel.ForeignKey#getSourceColumn()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_SourceColumn();

	/**
	 * Returns the meta object for the reference '{@link RDBModel.ForeignKey#getTargetColumn <em>Target Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Column</em>'.
	 * @see RDBModel.ForeignKey#getTargetColumn()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_TargetColumn();

	/**
	 * Returns the meta object for the '{@link RDBModel.ForeignKey#validFK(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid FK</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid FK</em>' operation.
	 * @see RDBModel.ForeignKey#validFK(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getForeignKey__ValidFK__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link RDBModel.ForeignKey#columnInSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Column In Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Column In Source</em>' operation.
	 * @see RDBModel.ForeignKey#columnInSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getForeignKey__ColumnInSource__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link RDBModel.ForeignKey#columnInTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Column In Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Column In Target</em>' operation.
	 * @see RDBModel.ForeignKey#columnInTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getForeignKey__ColumnInTarget__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link RDBModel.ForeignKey#sameTypeKeys(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Same Type Keys</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Same Type Keys</em>' operation.
	 * @see RDBModel.ForeignKey#sameTypeKeys(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getForeignKey__SameTypeKeys__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link RDBModel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see RDBModel.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RDBModelFactory getRDBModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RDBModel.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RDBModel.impl.TableImpl
		 * @see RDBModel.impl.RDBModelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FOREIGN_KEYS = eINSTANCE.getTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTable__UniqueName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Column Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___UNIQUE_COLUMN_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTable__UniqueColumnNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link RDBModel.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RDBModel.impl.ColumnImpl
		 * @see RDBModel.impl.RDBModelPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_NULLABLE = eINSTANCE.getColumn_IsNullable();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_UNIQUE = eINSTANCE.getColumn_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Type Must Be Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN___TYPE_MUST_BE_SET__DIAGNOSTICCHAIN_MAP = eINSTANCE.getColumn__TypeMustBeSet__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link RDBModel.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RDBModel.impl.PrimaryKeyImpl
		 * @see RDBModel.impl.RDBModelPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__COLUMNS = eINSTANCE.getPrimaryKey_Columns();

		/**
		 * The meta object literal for the '<em><b>Not Null</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMARY_KEY___NOT_NULL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPrimaryKey__NotNull__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link RDBModel.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RDBModel.impl.ForeignKeyImpl
		 * @see RDBModel.impl.RDBModelPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Source Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__SOURCE_TABLE = eINSTANCE.getForeignKey_SourceTable();

		/**
		 * The meta object literal for the '<em><b>Target Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__TARGET_TABLE = eINSTANCE.getForeignKey_TargetTable();

		/**
		 * The meta object literal for the '<em><b>Source Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__SOURCE_COLUMN = eINSTANCE.getForeignKey_SourceColumn();

		/**
		 * The meta object literal for the '<em><b>Target Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__TARGET_COLUMN = eINSTANCE.getForeignKey_TargetColumn();

		/**
		 * The meta object literal for the '<em><b>Valid FK</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOREIGN_KEY___VALID_FK__DIAGNOSTICCHAIN_MAP = eINSTANCE.getForeignKey__ValidFK__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Column In Source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOREIGN_KEY___COLUMN_IN_SOURCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getForeignKey__ColumnInSource__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Column In Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOREIGN_KEY___COLUMN_IN_TARGET__DIAGNOSTICCHAIN_MAP = eINSTANCE.getForeignKey__ColumnInTarget__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Same Type Keys</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOREIGN_KEY___SAME_TYPE_KEYS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getForeignKey__SameTypeKeys__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link RDBModel.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RDBModel.DataType
		 * @see RDBModel.impl.RDBModelPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //RDBModelPackage
