/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /TACS/model/RDBMetaModel.ecore
 * using:
 *   /TACS/model/RDBModel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package RDBModel;

// import RDBModel.RDBModelPackage;
// import RDBModel.RDBModelTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * RDBModelTables provides the dispatch tables for the RDBModel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class RDBModelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(RDBModelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_org_s_eclipse_s_RDBModel = IdManager.getNsURIPackageId("https://org/eclipse/RDBModel", null, RDBModelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = RDBModelTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Column = RDBModelTables.PACKid_https_c_s_s_org_s_eclipse_s_RDBModel.getClassId("Column", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ForeignKey = RDBModelTables.PACKid_https_c_s_s_org_s_eclipse_s_RDBModel.getClassId("ForeignKey", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PrimaryKey = RDBModelTables.PACKid_https_c_s_s_org_s_eclipse_s_RDBModel.getClassId("PrimaryKey", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Table = RDBModelTables.PACKid_https_c_s_s_org_s_eclipse_s_RDBModel.getClassId("Table", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DataType = RDBModelTables.PACKid_https_c_s_s_org_s_eclipse_s_RDBModel.getEnumerationId("DataType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ForeignKey = TypeId.BAG.getSpecializedId(RDBModelTables.CLSSid_ForeignKey, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PrimaryKey = TypeId.BAG.getSpecializedId(RDBModelTables.CLSSid_PrimaryKey, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Null = RDBModelTables.ENUMid_DataType.getEnumerationLiteralId("Null");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Column = TypeId.ORDERED_SET.getSpecializedId(RDBModelTables.CLSSid_Column, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Column_0 = TypeId.ORDERED_SET.getSpecializedId(RDBModelTables.CLSSid_Column, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ForeignKey = TypeId.ORDERED_SET.getSpecializedId(RDBModelTables.CLSSid_ForeignKey, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Table = TypeId.SET.getSpecializedId(RDBModelTables.CLSSid_Table, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			RDBModelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RDBModelTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Column = new EcoreExecutorType(RDBModelPackage.Literals.COLUMN, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DataType = new EcoreExecutorEnumeration(RDBModelPackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _ForeignKey = new EcoreExecutorType(RDBModelPackage.Literals.FOREIGN_KEY, PACKAGE, 0);
		public static final EcoreExecutorType _PrimaryKey = new EcoreExecutorType(RDBModelPackage.Literals.PRIMARY_KEY, PACKAGE, 0);
		public static final EcoreExecutorType _Table = new EcoreExecutorType(RDBModelPackage.Literals.TABLE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Column,
			_DataType,
			_ForeignKey,
			_PrimaryKey,
			_Table
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RDBModelTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Column__Column = new ExecutorFragment(Types._Column, RDBModelTables.Types._Column);
		private static final ExecutorFragment _Column__OclAny = new ExecutorFragment(Types._Column, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Column__OclElement = new ExecutorFragment(Types._Column, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, RDBModelTables.Types._DataType);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__OclEnumeration = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DataType__OclType = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _ForeignKey__ForeignKey = new ExecutorFragment(Types._ForeignKey, RDBModelTables.Types._ForeignKey);
		private static final ExecutorFragment _ForeignKey__OclAny = new ExecutorFragment(Types._ForeignKey, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ForeignKey__OclElement = new ExecutorFragment(Types._ForeignKey, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PrimaryKey__OclAny = new ExecutorFragment(Types._PrimaryKey, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrimaryKey__OclElement = new ExecutorFragment(Types._PrimaryKey, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrimaryKey__PrimaryKey = new ExecutorFragment(Types._PrimaryKey, RDBModelTables.Types._PrimaryKey);

		private static final ExecutorFragment _Table__OclAny = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Table__OclElement = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Table__Table = new ExecutorFragment(Types._Table, RDBModelTables.Types._Table);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RDBModelTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RDBModelTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RDBModelTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Column__isNullable = new EcoreExecutorProperty(RDBModelPackage.Literals.COLUMN__IS_NULLABLE, Types._Column, 0);
		public static final ExecutorProperty _Column__isUnique = new EcoreExecutorProperty(RDBModelPackage.Literals.COLUMN__IS_UNIQUE, Types._Column, 1);
		public static final ExecutorProperty _Column__name = new EcoreExecutorProperty(RDBModelPackage.Literals.COLUMN__NAME, Types._Column, 2);
		public static final ExecutorProperty _Column__type = new EcoreExecutorProperty(RDBModelPackage.Literals.COLUMN__TYPE, Types._Column, 3);
		public static final ExecutorProperty _Column__ForeignKey__sourceColumn = new ExecutorPropertyWithImplementation("ForeignKey", Types._Column, 4, new EcoreLibraryOppositeProperty(RDBModelPackage.Literals.FOREIGN_KEY__SOURCE_COLUMN));
		public static final ExecutorProperty _Column__ForeignKey__targetColumn = new ExecutorPropertyWithImplementation("ForeignKey", Types._Column, 5, new EcoreLibraryOppositeProperty(RDBModelPackage.Literals.FOREIGN_KEY__TARGET_COLUMN));
		public static final ExecutorProperty _Column__PrimaryKey__columns = new ExecutorPropertyWithImplementation("PrimaryKey", Types._Column, 6, new EcoreLibraryOppositeProperty(RDBModelPackage.Literals.PRIMARY_KEY__COLUMNS));
		public static final ExecutorProperty _Column__Table__columns = new ExecutorPropertyWithImplementation("Table", Types._Column, 7, new EcoreLibraryOppositeProperty(RDBModelPackage.Literals.TABLE__COLUMNS));

		public static final ExecutorProperty _ForeignKey__sourceColumn = new EcoreExecutorProperty(RDBModelPackage.Literals.FOREIGN_KEY__SOURCE_COLUMN, Types._ForeignKey, 0);
		public static final ExecutorProperty _ForeignKey__sourceTable = new EcoreExecutorProperty(RDBModelPackage.Literals.FOREIGN_KEY__SOURCE_TABLE, Types._ForeignKey, 1);
		public static final ExecutorProperty _ForeignKey__targetColumn = new EcoreExecutorProperty(RDBModelPackage.Literals.FOREIGN_KEY__TARGET_COLUMN, Types._ForeignKey, 2);
		public static final ExecutorProperty _ForeignKey__targetTable = new EcoreExecutorProperty(RDBModelPackage.Literals.FOREIGN_KEY__TARGET_TABLE, Types._ForeignKey, 3);
		public static final ExecutorProperty _ForeignKey__Table__foreignKeys = new ExecutorPropertyWithImplementation("Table", Types._ForeignKey, 4, new EcoreLibraryOppositeProperty(RDBModelPackage.Literals.TABLE__FOREIGN_KEYS));

		public static final ExecutorProperty _PrimaryKey__columns = new EcoreExecutorProperty(RDBModelPackage.Literals.PRIMARY_KEY__COLUMNS, Types._PrimaryKey, 0);
		public static final ExecutorProperty _PrimaryKey__Table__primaryKey = new ExecutorPropertyWithImplementation("Table", Types._PrimaryKey, 1, new EcoreLibraryOppositeProperty(RDBModelPackage.Literals.TABLE__PRIMARY_KEY));

		public static final ExecutorProperty _Table__columns = new EcoreExecutorProperty(RDBModelPackage.Literals.TABLE__COLUMNS, Types._Table, 0);
		public static final ExecutorProperty _Table__foreignKeys = new EcoreExecutorProperty(RDBModelPackage.Literals.TABLE__FOREIGN_KEYS, Types._Table, 1);
		public static final ExecutorProperty _Table__name = new EcoreExecutorProperty(RDBModelPackage.Literals.TABLE__NAME, Types._Table, 2);
		public static final ExecutorProperty _Table__primaryKey = new EcoreExecutorProperty(RDBModelPackage.Literals.TABLE__PRIMARY_KEY, Types._Table, 3);
		public static final ExecutorProperty _Table__ForeignKey__sourceTable = new ExecutorPropertyWithImplementation("ForeignKey", Types._Table, 4, new EcoreLibraryOppositeProperty(RDBModelPackage.Literals.FOREIGN_KEY__SOURCE_TABLE));
		public static final ExecutorProperty _Table__ForeignKey__targetTable = new ExecutorPropertyWithImplementation("ForeignKey", Types._Table, 5, new EcoreLibraryOppositeProperty(RDBModelPackage.Literals.FOREIGN_KEY__TARGET_TABLE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RDBModelTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Column =
			{
				Fragments._Column__OclAny /* 0 */,
				Fragments._Column__OclElement /* 1 */,
				Fragments._Column__Column /* 2 */
			};
		private static final int /*@NonNull*/ [] __Column = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__OclType /* 2 */,
				Fragments._DataType__OclEnumeration /* 3 */,
				Fragments._DataType__DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ForeignKey =
			{
				Fragments._ForeignKey__OclAny /* 0 */,
				Fragments._ForeignKey__OclElement /* 1 */,
				Fragments._ForeignKey__ForeignKey /* 2 */
			};
		private static final int /*@NonNull*/ [] __ForeignKey = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrimaryKey =
			{
				Fragments._PrimaryKey__OclAny /* 0 */,
				Fragments._PrimaryKey__OclElement /* 1 */,
				Fragments._PrimaryKey__PrimaryKey /* 2 */
			};
		private static final int /*@NonNull*/ [] __PrimaryKey = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Table =
			{
				Fragments._Table__OclAny /* 0 */,
				Fragments._Table__OclElement /* 1 */,
				Fragments._Table__Table /* 2 */
			};
		private static final int /*@NonNull*/ [] __Table = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Column.initFragments(_Column, __Column);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._ForeignKey.initFragments(_ForeignKey, __ForeignKey);
			Types._PrimaryKey.initFragments(_PrimaryKey, __PrimaryKey);
			Types._Table.initFragments(_Table, __Table);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RDBModelTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Column__Column = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Column__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Column__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__ForeignKey = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__PrimaryKey = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Table__Table = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Column__Column.initOperations(_Column__Column);
			Fragments._Column__OclAny.initOperations(_Column__OclAny);
			Fragments._Column__OclElement.initOperations(_Column__OclElement);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__OclEnumeration.initOperations(_DataType__OclEnumeration);
			Fragments._DataType__OclType.initOperations(_DataType__OclType);

			Fragments._ForeignKey__ForeignKey.initOperations(_ForeignKey__ForeignKey);
			Fragments._ForeignKey__OclAny.initOperations(_ForeignKey__OclAny);
			Fragments._ForeignKey__OclElement.initOperations(_ForeignKey__OclElement);

			Fragments._PrimaryKey__OclAny.initOperations(_PrimaryKey__OclAny);
			Fragments._PrimaryKey__OclElement.initOperations(_PrimaryKey__OclElement);
			Fragments._PrimaryKey__PrimaryKey.initOperations(_PrimaryKey__PrimaryKey);

			Fragments._Table__OclAny.initOperations(_Table__OclAny);
			Fragments._Table__OclElement.initOperations(_Table__OclElement);
			Fragments._Table__Table.initOperations(_Table__Table);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RDBModelTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Column = {
			RDBModelTables.Properties._Column__isNullable,
			RDBModelTables.Properties._Column__isUnique,
			RDBModelTables.Properties._Column__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RDBModelTables.Properties._Column__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ForeignKey = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RDBModelTables.Properties._ForeignKey__sourceColumn,
			RDBModelTables.Properties._ForeignKey__sourceTable,
			RDBModelTables.Properties._ForeignKey__targetColumn,
			RDBModelTables.Properties._ForeignKey__targetTable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrimaryKey = {
			RDBModelTables.Properties._PrimaryKey__columns,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Table = {
			RDBModelTables.Properties._Table__columns,
			RDBModelTables.Properties._Table__foreignKeys,
			RDBModelTables.Properties._Table__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RDBModelTables.Properties._Table__primaryKey
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Column__Column.initProperties(_Column);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._ForeignKey__ForeignKey.initProperties(_ForeignKey);
			Fragments._PrimaryKey__PrimaryKey.initProperties(_PrimaryKey);
			Fragments._Table__Table.initProperties(_Table);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RDBModelTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _DataType__Null = new EcoreExecutorEnumerationLiteral(RDBModelPackage.Literals.DATA_TYPE.getEEnumLiteral("Null"), Types._DataType, 0);
		public static final EcoreExecutorEnumerationLiteral _DataType__RDBInteger = new EcoreExecutorEnumerationLiteral(RDBModelPackage.Literals.DATA_TYPE.getEEnumLiteral("RDBInteger"), Types._DataType, 1);
		public static final EcoreExecutorEnumerationLiteral _DataType__RDBReal = new EcoreExecutorEnumerationLiteral(RDBModelPackage.Literals.DATA_TYPE.getEEnumLiteral("RDBReal"), Types._DataType, 2);
		public static final EcoreExecutorEnumerationLiteral _DataType__RDBString = new EcoreExecutorEnumerationLiteral(RDBModelPackage.Literals.DATA_TYPE.getEEnumLiteral("RDBString"), Types._DataType, 3);
		public static final EcoreExecutorEnumerationLiteral _DataType__RDBBoolean = new EcoreExecutorEnumerationLiteral(RDBModelPackage.Literals.DATA_TYPE.getEEnumLiteral("RDBBoolean"), Types._DataType, 4);
		public static final EcoreExecutorEnumerationLiteral _DataType__RDBDate = new EcoreExecutorEnumerationLiteral(RDBModelPackage.Literals.DATA_TYPE.getEEnumLiteral("RDBDate"), Types._DataType, 5);
		public static final EcoreExecutorEnumerationLiteral _DataType__RDBTime = new EcoreExecutorEnumerationLiteral(RDBModelPackage.Literals.DATA_TYPE.getEEnumLiteral("RDBTime"), Types._DataType, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DataType = {
			_DataType__Null,
			_DataType__RDBInteger,
			_DataType__RDBReal,
			_DataType__RDBString,
			_DataType__RDBBoolean,
			_DataType__RDBDate,
			_DataType__RDBTime
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DataType.initLiterals(_DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RDBModelTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new RDBModelTables();
	}

	private RDBModelTables() {
		super(RDBModelPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		RDBModelPackage.Literals.TABLE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
