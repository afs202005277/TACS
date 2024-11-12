/**
 */
package RDBModel.util;

import RDBModel.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see RDBModel.RDBModelPackage
 * @generated
 */
public class RDBModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RDBModelValidator INSTANCE = new RDBModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "RDBModel";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Name' of 'Table'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TABLE__UNIQUE_NAME = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Column Names' of 'Table'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TABLE__UNIQUE_COLUMN_NAMES = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Must Be Set' of 'Column'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLUMN__TYPE_MUST_BE_SET = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Null' of 'Primary Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIMARY_KEY__NOT_NULL = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid FK' of 'Foreign Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY__VALID_FK = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Column In Source' of 'Foreign Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY__COLUMN_IN_SOURCE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Column In Target' of 'Foreign Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY__COLUMN_IN_TARGET = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Type Keys' of 'Foreign Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY__SAME_TYPE_KEYS = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RDBModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RDBModelPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case RDBModelPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case RDBModelPackage.PRIMARY_KEY:
				return validatePrimaryKey((PrimaryKey)value, diagnostics, context);
			case RDBModelPackage.FOREIGN_KEY:
				return validateForeignKey((ForeignKey)value, diagnostics, context);
			case RDBModelPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(table, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateTable_uniqueColumnNames(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateTable_uniqueName(table, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueColumnNames constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_uniqueColumnNames(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return table.uniqueColumnNames(diagnostics, context);
	}

	/**
	 * Validates the uniqueName constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_uniqueName(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return table.uniqueName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(column, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumn_typeMustBeSet(column, diagnostics, context);
		return result;
	}

	/**
	 * Validates the typeMustBeSet constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_typeMustBeSet(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return column.typeMustBeSet(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKey(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primaryKey, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrimaryKey_notNull(primaryKey, diagnostics, context);
		return result;
	}

	/**
	 * Validates the notNull constraint of '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKey_notNull(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return primaryKey.notNull(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(foreignKey, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKey_sameTypeKeys(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKey_validFK(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKey_columnInSource(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKey_columnInTarget(foreignKey, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sameTypeKeys constraint of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey_sameTypeKeys(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return foreignKey.sameTypeKeys(diagnostics, context);
	}

	/**
	 * Validates the validFK constraint of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey_validFK(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return foreignKey.validFK(diagnostics, context);
	}

	/**
	 * Validates the columnInSource constraint of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey_columnInSource(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return foreignKey.columnInSource(diagnostics, context);
	}

	/**
	 * Validates the columnInTarget constraint of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey_columnInTarget(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return foreignKey.columnInTarget(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RDBModelValidator
