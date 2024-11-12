/**
 */
package RDBModel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RDBModel.Column#getName <em>Name</em>}</li>
 *   <li>{@link RDBModel.Column#getType <em>Type</em>}</li>
 *   <li>{@link RDBModel.Column#isIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link RDBModel.Column#isIsUnique <em>Is Unique</em>}</li>
 * </ul>
 *
 * @see RDBModel.RDBModelPackage#getColumn()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeMustBeSet'"
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RDBModel.RDBModelPackage#getColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RDBModel.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link RDBModel.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see RDBModel.DataType
	 * @see #setType(DataType)
	 * @see RDBModel.RDBModelPackage#getColumn_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link RDBModel.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see RDBModel.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nullable</em>' attribute.
	 * @see #setIsNullable(boolean)
	 * @see RDBModel.RDBModelPackage#getColumn_IsNullable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsNullable();

	/**
	 * Sets the value of the '{@link RDBModel.Column#isIsNullable <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nullable</em>' attribute.
	 * @see #isIsNullable()
	 * @generated
	 */
	void setIsNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see RDBModel.RDBModelPackage#getColumn_IsUnique()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link RDBModel.Column#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='type &lt;&gt; DataType::Null'"
	 * @generated
	 */
	boolean typeMustBeSet(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Column
