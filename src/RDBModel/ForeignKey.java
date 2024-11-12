/**
 */
package RDBModel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RDBModel.ForeignKey#getSourceTable <em>Source Table</em>}</li>
 *   <li>{@link RDBModel.ForeignKey#getTargetTable <em>Target Table</em>}</li>
 *   <li>{@link RDBModel.ForeignKey#getSourceColumn <em>Source Column</em>}</li>
 *   <li>{@link RDBModel.ForeignKey#getTargetColumn <em>Target Column</em>}</li>
 * </ul>
 *
 * @see RDBModel.RDBModelPackage#getForeignKey()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sameTypeKeys'"
 * @generated
 */
public interface ForeignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Table</em>' reference.
	 * @see #setSourceTable(Table)
	 * @see RDBModel.RDBModelPackage#getForeignKey_SourceTable()
	 * @model required="true"
	 * @generated
	 */
	Table getSourceTable();

	/**
	 * Sets the value of the '{@link RDBModel.ForeignKey#getSourceTable <em>Source Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Table</em>' reference.
	 * @see #getSourceTable()
	 * @generated
	 */
	void setSourceTable(Table value);

	/**
	 * Returns the value of the '<em><b>Target Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Table</em>' reference.
	 * @see #setTargetTable(Table)
	 * @see RDBModel.RDBModelPackage#getForeignKey_TargetTable()
	 * @model required="true"
	 * @generated
	 */
	Table getTargetTable();

	/**
	 * Sets the value of the '{@link RDBModel.ForeignKey#getTargetTable <em>Target Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Table</em>' reference.
	 * @see #getTargetTable()
	 * @generated
	 */
	void setTargetTable(Table value);

	/**
	 * Returns the value of the '<em><b>Source Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Column</em>' reference.
	 * @see #setSourceColumn(Column)
	 * @see RDBModel.RDBModelPackage#getForeignKey_SourceColumn()
	 * @model required="true"
	 * @generated
	 */
	Column getSourceColumn();

	/**
	 * Sets the value of the '{@link RDBModel.ForeignKey#getSourceColumn <em>Source Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Column</em>' reference.
	 * @see #getSourceColumn()
	 * @generated
	 */
	void setSourceColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Target Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Column</em>' reference.
	 * @see #setTargetColumn(Column)
	 * @see RDBModel.RDBModelPackage#getForeignKey_TargetColumn()
	 * @model required="true"
	 * @generated
	 */
	Column getTargetColumn();

	/**
	 * Sets the value of the '{@link RDBModel.ForeignKey#getTargetColumn <em>Target Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Column</em>' reference.
	 * @see #getTargetColumn()
	 * @generated
	 */
	void setTargetColumn(Column value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(not targetColumn.isNullable and targetColumn.isUnique)\n\t\t\t\t\t\t\tor (targetTable.primaryKey.columns-&gt;select(c | c.name = targetColumn.name)-&gt;size() = 1 and targetTable.primaryKey.columns-&gt;size() = 1)\n\t\t\t\t\t\t\tor (targetTable.primaryKey.columns-&gt;select(c | c.name = targetColumn.name)-&gt;size() = 1 and targetColumn.isUnique)'"
	 * @generated
	 */
	boolean validFK(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='sourceTable.columns-&gt;select(c | c.name = sourceColumn.name)-&gt;size() = 1'"
	 * @generated
	 */
	boolean columnInSource(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='targetTable.columns-&gt;select(c | c.name = targetColumn.name)-&gt;size() = 1'"
	 * @generated
	 */
	boolean columnInTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='sourceColumn.type = targetColumn.type'"
	 * @generated
	 */
	boolean sameTypeKeys(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ForeignKey
