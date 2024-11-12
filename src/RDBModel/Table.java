/**
 */
package RDBModel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RDBModel.Table#getName <em>Name</em>}</li>
 *   <li>{@link RDBModel.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link RDBModel.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link RDBModel.Table#getForeignKeys <em>Foreign Keys</em>}</li>
 * </ul>
 *
 * @see RDBModel.RDBModelPackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueColumnNames'"
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RDBModel.RDBModelPackage#getTable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RDBModel.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link RDBModel.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see RDBModel.RDBModelPackage#getTable_Columns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see RDBModel.RDBModelPackage#getTable_PrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link RDBModel.Table#getPrimaryKey <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' containment reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link RDBModel.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see RDBModel.RDBModelPackage#getTable_ForeignKeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getForeignKeys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Table.allInstances()-&gt;isUnique(e | e.name)'"
	 * @generated
	 */
	boolean uniqueName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='columns-&gt;isUnique(e | e.name)'"
	 * @generated
	 */
	boolean uniqueColumnNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Table
