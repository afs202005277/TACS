/**
 */
package ERModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ERModel.Relationship#getName <em>Name</em>}</li>
 *   <li>{@link ERModel.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link ERModel.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link ERModel.Relationship#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link ERModel.Relationship#getTargetCardinality <em>Target Cardinality</em>}</li>
 * </ul>
 *
 * @see ERModel.ERModelPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ERModel.ERModelPackage#getRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ERModel.Relationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see ERModel.ERModelPackage#getRelationship_Source()
	 * @model
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link ERModel.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see ERModel.ERModelPackage#getRelationship_Target()
	 * @model
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link ERModel.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

	/**
	 * Returns the value of the '<em><b>Source Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cardinality</em>' reference.
	 * @see #setSourceCardinality(Cardinality)
	 * @see ERModel.ERModelPackage#getRelationship_SourceCardinality()
	 * @model
	 * @generated
	 */
	Cardinality getSourceCardinality();

	/**
	 * Sets the value of the '{@link ERModel.Relationship#getSourceCardinality <em>Source Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cardinality</em>' reference.
	 * @see #getSourceCardinality()
	 * @generated
	 */
	void setSourceCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Target Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cardinality</em>' reference.
	 * @see #setTargetCardinality(Cardinality)
	 * @see ERModel.ERModelPackage#getRelationship_TargetCardinality()
	 * @model
	 * @generated
	 */
	Cardinality getTargetCardinality();

	/**
	 * Sets the value of the '{@link ERModel.Relationship#getTargetCardinality <em>Target Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cardinality</em>' reference.
	 * @see #getTargetCardinality()
	 * @generated
	 */
	void setTargetCardinality(Cardinality value);

} // Relationship
