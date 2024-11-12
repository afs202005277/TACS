/**
 */
package RDBModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see RDBModel.RDBModelPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator {
	/**
	 * The '<em><b>Null</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(0, "Null", "Null"),

	/**
	 * The '<em><b>RDB Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	RDB_INTEGER(1, "RDBInteger", "RDBInteger"),

	/**
	 * The '<em><b>RDB Real</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_REAL_VALUE
	 * @generated
	 * @ordered
	 */
	RDB_REAL(2, "RDBReal", "RDBReal"),

	/**
	 * The '<em><b>RDB String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	RDB_STRING(3, "RDBString", "RDBString"),

	/**
	 * The '<em><b>RDB Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	RDB_BOOLEAN(4, "RDBBoolean", "RDBBoolean"),

	/**
	 * The '<em><b>RDB Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	RDB_DATE(5, "RDBDate", "RDBDate"),

	/**
	 * The '<em><b>RDB Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	RDB_TIME(6, "RDBTime", "RDBTime");

	/**
	 * The '<em><b>Null</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model name="Null"
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 0;

	/**
	 * The '<em><b>RDB Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_INTEGER
	 * @model name="RDBInteger"
	 * @generated
	 * @ordered
	 */
	public static final int RDB_INTEGER_VALUE = 1;

	/**
	 * The '<em><b>RDB Real</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_REAL
	 * @model name="RDBReal"
	 * @generated
	 * @ordered
	 */
	public static final int RDB_REAL_VALUE = 2;

	/**
	 * The '<em><b>RDB String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_STRING
	 * @model name="RDBString"
	 * @generated
	 * @ordered
	 */
	public static final int RDB_STRING_VALUE = 3;

	/**
	 * The '<em><b>RDB Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_BOOLEAN
	 * @model name="RDBBoolean"
	 * @generated
	 * @ordered
	 */
	public static final int RDB_BOOLEAN_VALUE = 4;

	/**
	 * The '<em><b>RDB Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_DATE
	 * @model name="RDBDate"
	 * @generated
	 * @ordered
	 */
	public static final int RDB_DATE_VALUE = 5;

	/**
	 * The '<em><b>RDB Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDB_TIME
	 * @model name="RDBTime"
	 * @generated
	 * @ordered
	 */
	public static final int RDB_TIME_VALUE = 6;

	/**
	 * An array of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataType[] VALUES_ARRAY =
		new DataType[] {
			NULL,
			RDB_INTEGER,
			RDB_REAL,
			RDB_STRING,
			RDB_BOOLEAN,
			RDB_DATE,
			RDB_TIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType get(int value) {
		switch (value) {
			case NULL_VALUE: return NULL;
			case RDB_INTEGER_VALUE: return RDB_INTEGER;
			case RDB_REAL_VALUE: return RDB_REAL;
			case RDB_STRING_VALUE: return RDB_STRING;
			case RDB_BOOLEAN_VALUE: return RDB_BOOLEAN;
			case RDB_DATE_VALUE: return RDB_DATE;
			case RDB_TIME_VALUE: return RDB_TIME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DataType
