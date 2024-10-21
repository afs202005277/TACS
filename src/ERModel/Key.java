/**
 */
package ERModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ERModel.Key#getName <em>Name</em>}</li>
 *   <li>{@link ERModel.Key#isIsPrimary <em>Is Primary</em>}</li>
 * </ul>
 *
 * @see ERModel.ERModelPackage#getKey()
 * @model
 * @generated
 */
public interface Key extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ERModel.ERModelPackage#getKey_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ERModel.Key#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary</em>' attribute.
	 * @see #setIsPrimary(boolean)
	 * @see ERModel.ERModelPackage#getKey_IsPrimary()
	 * @model
	 * @generated
	 */
	boolean isIsPrimary();

	/**
	 * Sets the value of the '{@link ERModel.Key#isIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary</em>' attribute.
	 * @see #isIsPrimary()
	 * @generated
	 */
	void setIsPrimary(boolean value);

} // Key
