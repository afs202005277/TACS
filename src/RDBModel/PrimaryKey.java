/**
 */
package RDBModel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RDBModel.PrimaryKey#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see RDBModel.RDBModelPackage#getPrimaryKey()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='notNull'"
 * @generated
 */
public interface PrimaryKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link RDBModel.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see RDBModel.RDBModelPackage#getPrimaryKey_Columns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='columns-&gt;size() = columns-&gt;select(not isNullable)-&gt;size()'"
	 * @generated
	 */
	boolean notNull(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PrimaryKey
