/**
 */
package ERModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ERModel.Cardinality#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link ERModel.Cardinality#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @see ERModel.ERModelPackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(int)
	 * @see ERModel.ERModelPackage#getCardinality_MinValue()
	 * @model
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link ERModel.Cardinality#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(int value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see ERModel.ERModelPackage#getCardinality_MaxValue()
	 * @model
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link ERModel.Cardinality#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

} // Cardinality
