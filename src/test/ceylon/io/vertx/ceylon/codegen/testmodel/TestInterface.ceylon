import java.lang {
  Float_=Float,
  Double_=Double,
  Integer_=Integer,
  Character_=Character,
  Long_=Long,
  Short_=Short,
  Boolean_=Boolean,
  String_=String,
  Byte_=Byte
}
import io.vertx.codegen.testmodel {
  TestInterface_=TestInterface
}
import io.vertx.lang.ceylon {
  Delegating
}
import ceylon.json {
  JsonObject=Object,
  JsonArray=Array
}
import io.vertx.ceylon.codegen.testmodel {
  TestDataObject,
  AbstractHandlerUserType,
  ConcreteHandlerUserType,
  ConcreteHandlerUserTypeExtension,
  GenericRefedInterface,
  RefedInterface1,
  SuperInterface1,
  RefedInterface2,
  SuperInterface2
}
/* Generated from io.vertx.codegen.testmodel.TestInterface */
shared abstract class TestInterface(TestInterface_ delegate) extends SuperInterface1(delegate) satisfies Delegating
  & SuperInterface2 {

  shared  Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) methodWithBasicParams => flatten(methodWithBasicParams_impl);

  shared  Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character]>) methodWithBasicBoxedParams => flatten(methodWithBasicBoxedParams_impl);

  shared  Anything(*<[Anything(Byte),Anything(Integer),Anything(Integer),Anything(Integer),Anything(Float),Anything(Float),Anything(Boolean),Anything(Character),Anything(String)]>) methodWithHandlerBasicTypes => flatten(methodWithHandlerBasicTypes_impl);

  shared  Anything(*<[Boolean,Anything(Throwable|Byte)]>) methodWithHandlerAsyncResultByte => flatten(methodWithHandlerAsyncResultByte_impl);

  shared  Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultShort => flatten(methodWithHandlerAsyncResultShort_impl);

  shared  Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultInteger => flatten(methodWithHandlerAsyncResultInteger_impl);

  shared  Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultLong => flatten(methodWithHandlerAsyncResultLong_impl);

  shared  Anything(*<[Boolean,Anything(Throwable|Float)]>) methodWithHandlerAsyncResultFloat => flatten(methodWithHandlerAsyncResultFloat_impl);

  shared  Anything(*<[Boolean,Anything(Throwable|Float)]>) methodWithHandlerAsyncResultDouble => flatten(methodWithHandlerAsyncResultDouble_impl);

  shared  Anything(*<[Boolean,Anything(Throwable|Boolean)]>) methodWithHandlerAsyncResultBoolean => flatten(methodWithHandlerAsyncResultBoolean_impl);

  shared  Anything(*<[Boolean,Anything(Throwable|Character)]>) methodWithHandlerAsyncResultCharacter => flatten(methodWithHandlerAsyncResultCharacter_impl);

  shared  Anything(*<[Boolean,Anything(Throwable|String)]>) methodWithHandlerAsyncResultString => flatten(methodWithHandlerAsyncResultString_impl);

  shared  Anything(*<[Boolean,Anything(Throwable|TestDataObject)]>) methodWithHandlerAsyncResultDataObject => flatten(methodWithHandlerAsyncResultDataObject_impl);

  shared  Anything(*<[RefedInterface1]>) methodWithUserTypes => flatten(methodWithUserTypes_impl);

  shared  Anything(*<[String,Object]>) methodWithObjectParam => flatten(methodWithObjectParam_impl);

  shared  Anything(*<[TestDataObject]>) methodWithDataObjectParam => flatten(methodWithDataObjectParam_impl);

  shared  Anything(*<[TestDataObject]>) methodWithNullDataObjectParam => flatten(methodWithNullDataObjectParam_impl);

  shared  Anything(*<[List<String>,List<Byte>,List<Integer>,List<Integer>,List<Integer>,List<JsonObject>,List<JsonArray>,List<RefedInterface1>,List<TestDataObject>]>) methodWithListParams => flatten(methodWithListParams_impl);

  shared  Anything(*<[Set<String>,Set<Byte>,Set<Integer>,Set<Integer>,Set<Integer>,Set<JsonObject>,Set<JsonArray>,Set<RefedInterface1>,Set<TestDataObject>]>) methodWithSetParams => flatten(methodWithSetParams_impl);

  shared  Anything(*<[Map<String,String>,Map<String,Byte>,Map<String,Integer>,Map<String,Integer>,Map<String,Integer>,Map<String,JsonObject>,Map<String,JsonArray>,Map<String,RefedInterface1>]>) methodWithMapParams => flatten(methodWithMapParams_impl);

  shared  Anything(*<[Anything(List<String>),Anything(List<Integer>),Anything(Set<String>),Anything(Set<Integer>)]>) methodWithHandlerListAndSet => flatten(methodWithHandlerListAndSet_impl);

  shared  Anything(*<[Anything(Throwable|List<String>)]>) methodWithHandlerAsyncResultListString => flatten(methodWithHandlerAsyncResultListString_impl);

  shared  Anything(*<[Anything(Throwable|List<Integer>)]>) methodWithHandlerAsyncResultListInteger => flatten(methodWithHandlerAsyncResultListInteger_impl);

  shared  Anything(*<[Anything(Throwable|Set<String>)]>) methodWithHandlerAsyncResultSetString => flatten(methodWithHandlerAsyncResultSetString_impl);

  shared  Anything(*<[Anything(Throwable|Set<Integer>)]>) methodWithHandlerAsyncResultSetInteger => flatten(methodWithHandlerAsyncResultSetInteger_impl);

  shared  Anything(*<[Anything(List<RefedInterface1>)]>) methodWithHandlerListVertxGen => flatten(methodWithHandlerListVertxGen_impl);

  shared  Anything(*<[Anything(Set<RefedInterface1>)]>) methodWithHandlerSetVertxGen => flatten(methodWithHandlerSetVertxGen_impl);

  shared  Anything(*<[Anything(List<RefedInterface2>)]>) methodWithHandlerListAbstractVertxGen => flatten(methodWithHandlerListAbstractVertxGen_impl);

  shared  Anything(*<[Anything(Set<RefedInterface2>)]>) methodWithHandlerSetAbstractVertxGen => flatten(methodWithHandlerSetAbstractVertxGen_impl);

  shared  Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListJsonObject => flatten(methodWithHandlerListJsonObject_impl);

  shared  Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListNullJsonObject => flatten(methodWithHandlerListNullJsonObject_impl);

  shared  Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListComplexJsonObject => flatten(methodWithHandlerListComplexJsonObject_impl);

  shared  Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetJsonObject => flatten(methodWithHandlerSetJsonObject_impl);

  shared  Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetNullJsonObject => flatten(methodWithHandlerSetNullJsonObject_impl);

  shared  Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetComplexJsonObject => flatten(methodWithHandlerSetComplexJsonObject_impl);

  shared  Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListJsonArray => flatten(methodWithHandlerListJsonArray_impl);

  shared  Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListNullJsonArray => flatten(methodWithHandlerListNullJsonArray_impl);

  shared  Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListComplexJsonArray => flatten(methodWithHandlerListComplexJsonArray_impl);

  shared  Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetJsonArray => flatten(methodWithHandlerSetJsonArray_impl);

  shared  Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetNullJsonArray => flatten(methodWithHandlerSetNullJsonArray_impl);

  shared  Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetComplexJsonArray => flatten(methodWithHandlerSetComplexJsonArray_impl);

  shared  Anything(*<[Anything(List<TestDataObject>)]>) methodWithHandlerListDataObject => flatten(methodWithHandlerListDataObject_impl);

  shared  Anything(*<[Anything(List<TestDataObject>)]>) methodWithHandlerListNullDataObject => flatten(methodWithHandlerListNullDataObject_impl);

  shared  Anything(*<[Anything(Set<TestDataObject>)]>) methodWithHandlerSetDataObject => flatten(methodWithHandlerSetDataObject_impl);

  shared  Anything(*<[Anything(Set<TestDataObject>)]>) methodWithHandlerSetNullDataObject => flatten(methodWithHandlerSetNullDataObject_impl);

  shared  Anything(*<[Anything(Throwable|List<RefedInterface1>)]>) methodWithHandlerAsyncResultListVertxGen => flatten(methodWithHandlerAsyncResultListVertxGen_impl);

  shared  Anything(*<[Anything(Throwable|Set<RefedInterface1>)]>) methodWithHandlerAsyncResultSetVertxGen => flatten(methodWithHandlerAsyncResultSetVertxGen_impl);

  shared  Anything(*<[Anything(Throwable|List<RefedInterface2>)]>) methodWithHandlerAsyncResultListAbstractVertxGen => flatten(methodWithHandlerAsyncResultListAbstractVertxGen_impl);

  shared  Anything(*<[Anything(Throwable|Set<RefedInterface2>)]>) methodWithHandlerAsyncResultSetAbstractVertxGen => flatten(methodWithHandlerAsyncResultSetAbstractVertxGen_impl);

  shared  Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListJsonObject => flatten(methodWithHandlerAsyncResultListJsonObject_impl);

  shared  Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListNullJsonObject => flatten(methodWithHandlerAsyncResultListNullJsonObject_impl);

  shared  Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListComplexJsonObject => flatten(methodWithHandlerAsyncResultListComplexJsonObject_impl);

  shared  Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetJsonObject => flatten(methodWithHandlerAsyncResultSetJsonObject_impl);

  shared  Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetNullJsonObject => flatten(methodWithHandlerAsyncResultSetNullJsonObject_impl);

  shared  Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetComplexJsonObject => flatten(methodWithHandlerAsyncResultSetComplexJsonObject_impl);

  shared  Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListJsonArray => flatten(methodWithHandlerAsyncResultListJsonArray_impl);

  shared  Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListNullJsonArray => flatten(methodWithHandlerAsyncResultListNullJsonArray_impl);

  shared  Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListComplexJsonArray => flatten(methodWithHandlerAsyncResultListComplexJsonArray_impl);

  shared  Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetJsonArray => flatten(methodWithHandlerAsyncResultSetJsonArray_impl);

  shared  Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetNullJsonArray => flatten(methodWithHandlerAsyncResultSetNullJsonArray_impl);

  shared  Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetComplexJsonArray => flatten(methodWithHandlerAsyncResultSetComplexJsonArray_impl);

  shared  Anything(*<[Anything(Throwable|List<TestDataObject>)]>) methodWithHandlerAsyncResultListDataObject => flatten(methodWithHandlerAsyncResultListDataObject_impl);

  shared  Anything(*<[Anything(Throwable|List<TestDataObject>)]>) methodWithHandlerAsyncResultListNullDataObject => flatten(methodWithHandlerAsyncResultListNullDataObject_impl);

  shared  Anything(*<[Anything(Throwable|Set<TestDataObject>)]>) methodWithHandlerAsyncResultSetDataObject => flatten(methodWithHandlerAsyncResultSetDataObject_impl);

  shared  Anything(*<[Anything(Throwable|Set<TestDataObject>)]>) methodWithHandlerAsyncResultSetNullDataObject => flatten(methodWithHandlerAsyncResultSetNullDataObject_impl);

  shared  Anything(*<[Anything(RefedInterface1)]>) methodWithHandlerUserTypes => flatten(methodWithHandlerUserTypes_impl);

  shared  Anything(*<[Anything(Throwable|RefedInterface1)]>) methodWithHandlerAsyncResultUserTypes => flatten(methodWithHandlerAsyncResultUserTypes_impl);

  shared  Anything(*<[ConcreteHandlerUserType]>) methodWithConcreteHandlerUserTypeSubtype => flatten(methodWithConcreteHandlerUserTypeSubtype_impl);

  shared  Anything(*<[AbstractHandlerUserType]>) methodWithAbstractHandlerUserTypeSubtype => flatten(methodWithAbstractHandlerUserTypeSubtype_impl);

  shared  Anything(*<[ConcreteHandlerUserTypeExtension]>) methodWithConcreteHandlerUserTypeSubtypeExtension => flatten(methodWithConcreteHandlerUserTypeSubtypeExtension_impl);

  shared  Anything(*<[Anything()]>) methodWithHandlerVoid => flatten(methodWithHandlerVoid_impl);

  shared  Anything(*<[Boolean,Anything(Throwable?)]>) methodWithHandlerAsyncResultVoid => flatten(methodWithHandlerAsyncResultVoid_impl);

  shared  Anything(*<[Anything(Throwable)]>) methodWithHandlerThrowable => flatten(methodWithHandlerThrowable_impl);

  shared  Anything(*<[Anything(TestDataObject)]>) methodWithHandlerDataObject => flatten(methodWithHandlerDataObject_impl);

  shared  Anything(*<[Object,Anything(GenericRefedInterface<Object>)]>) methodWithHandlerGenericUserType => flatten(methodWithHandlerGenericUserType_impl);

  shared  Anything(*<[Object,Anything(Throwable|GenericRefedInterface<Object>)]>) methodWithHandlerAsyncResultGenericUserType => flatten(methodWithHandlerAsyncResultGenericUserType_impl);

  shared  Byte(*<[]>) methodWithByteReturn => flatten(methodWithByteReturn_impl);

  shared  Integer(*<[]>) methodWithShortReturn => flatten(methodWithShortReturn_impl);

  shared  Integer(*<[]>) methodWithIntReturn => flatten(methodWithIntReturn_impl);

  shared  Integer(*<[]>) methodWithLongReturn => flatten(methodWithLongReturn_impl);

  shared  Float(*<[]>) methodWithFloatReturn => flatten(methodWithFloatReturn_impl);

  shared  Float(*<[]>) methodWithDoubleReturn => flatten(methodWithDoubleReturn_impl);

  shared  Boolean(*<[]>) methodWithBooleanReturn => flatten(methodWithBooleanReturn_impl);

  shared  Character(*<[]>) methodWithCharReturn => flatten(methodWithCharReturn_impl);

  shared  String(*<[]>) methodWithStringReturn => flatten(methodWithStringReturn_impl);

  shared  RefedInterface1(*<[]>) methodWithVertxGenReturn => flatten(methodWithVertxGenReturn_impl);

  shared  RefedInterface1(*<[]>) methodWithVertxGenNullReturn => flatten(methodWithVertxGenNullReturn_impl);

  shared  RefedInterface2(*<[]>) methodWithAbstractVertxGenReturn => flatten(methodWithAbstractVertxGenReturn_impl);

  shared  String(*<[String,Anything(String)]|[String,RefedInterface1]|[String,RefedInterface1,Anything(String)]|[String,RefedInterface1,Integer,Anything(String)]>) overloadedMethod => flatten(overloadedMethod_impl);

  shared  Object(*<[String]>) methodWithGenericReturn => flatten(methodWithGenericReturn_impl);

  shared  Anything(*<[String,Object]>) methodWithGenericParam => flatten(methodWithGenericParam_impl);

  shared  Anything(*<[String,Anything(Object)]>) methodWithGenericHandler => flatten(methodWithGenericHandler_impl);

  shared  Anything(*<[String,Anything(Throwable|Object)]>) methodWithGenericHandlerAsyncResult => flatten(methodWithGenericHandlerAsyncResult_impl);

  shared  TestInterface(*<[String]>) fluentMethod => flatten(fluentMethod_impl);

  shared  RefedInterface1(*<[String]>) methodWithCachedReturn => flatten(methodWithCachedReturn_impl);

  shared  Integer(*<[Integer]>) methodWithCachedReturnPrimitive => flatten(methodWithCachedReturnPrimitive_impl);

  shared  JsonObject(*<[]>) methodWithJsonObjectReturn => flatten(methodWithJsonObjectReturn_impl);

  shared  JsonObject(*<[]>) methodWithNullJsonObjectReturn => flatten(methodWithNullJsonObjectReturn_impl);

  shared  JsonObject(*<[]>) methodWithComplexJsonObjectReturn => flatten(methodWithComplexJsonObjectReturn_impl);

  shared  JsonArray(*<[]>) methodWithJsonArrayReturn => flatten(methodWithJsonArrayReturn_impl);

  shared  JsonArray(*<[]>) methodWithNullJsonArrayReturn => flatten(methodWithNullJsonArrayReturn_impl);

  shared  JsonArray(*<[]>) methodWithComplexJsonArrayReturn => flatten(methodWithComplexJsonArrayReturn_impl);

  shared  Anything(*<[JsonObject,JsonArray]>) methodWithJsonParams => flatten(methodWithJsonParams_impl);

  shared  Anything(*<[JsonObject,JsonArray]>) methodWithNullJsonParams => flatten(methodWithNullJsonParams_impl);

  shared  Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerJson => flatten(methodWithHandlerJson_impl);

  shared  Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerNullJson => flatten(methodWithHandlerNullJson_impl);

  shared  Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerComplexJson => flatten(methodWithHandlerComplexJson_impl);

  shared  Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultJsonObject => flatten(methodWithHandlerAsyncResultJsonObject_impl);

  shared  Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultNullJsonObject => flatten(methodWithHandlerAsyncResultNullJsonObject_impl);

  shared  Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultComplexJsonObject => flatten(methodWithHandlerAsyncResultComplexJsonObject_impl);

  shared  Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultJsonArray => flatten(methodWithHandlerAsyncResultJsonArray_impl);

  shared  Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultNullJsonArray => flatten(methodWithHandlerAsyncResultNullJsonArray_impl);

  shared  Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultComplexJsonArray => flatten(methodWithHandlerAsyncResultComplexJsonArray_impl);

  shared  Map<String,String>(*<[Anything(String)]>) methodWithMapReturn => flatten(methodWithMapReturn_impl);

  shared  Map<String,String>(*<[Anything(String)]>) methodWithMapStringReturn => flatten(methodWithMapStringReturn_impl);

  shared  Map<String,Integer>(*<[Anything(String)]>) methodWithMapLongReturn => flatten(methodWithMapLongReturn_impl);

  shared  Map<String,Integer>(*<[Anything(String)]>) methodWithMapIntegerReturn => flatten(methodWithMapIntegerReturn_impl);

  shared  Map<String,Integer>(*<[Anything(String)]>) methodWithMapShortReturn => flatten(methodWithMapShortReturn_impl);

  shared  Map<String,Byte>(*<[Anything(String)]>) methodWithMapByteReturn => flatten(methodWithMapByteReturn_impl);

  shared  Map<String,Character>(*<[Anything(String)]>) methodWithMapCharacterReturn => flatten(methodWithMapCharacterReturn_impl);

  shared  Map<String,Boolean>(*<[Anything(String)]>) methodWithMapBooleanReturn => flatten(methodWithMapBooleanReturn_impl);

  shared  Map<String,Float>(*<[Anything(String)]>) methodWithMapFloatReturn => flatten(methodWithMapFloatReturn_impl);

  shared  Map<String,Float>(*<[Anything(String)]>) methodWithMapDoubleReturn => flatten(methodWithMapDoubleReturn_impl);

  shared  Map<String,JsonObject>(*<[Anything(String)]>) methodWithMapJsonObjectReturn => flatten(methodWithMapJsonObjectReturn_impl);

  shared  Map<String,JsonObject>(*<[Anything(String)]>) methodWithMapComplexJsonObjectReturn => flatten(methodWithMapComplexJsonObjectReturn_impl);

  shared  Map<String,JsonArray>(*<[Anything(String)]>) methodWithMapJsonArrayReturn => flatten(methodWithMapJsonArrayReturn_impl);

  shared  Map<String,JsonArray>(*<[Anything(String)]>) methodWithMapComplexJsonArrayReturn => flatten(methodWithMapComplexJsonArrayReturn_impl);

  shared  Map<String,String>(*<[]>) methodWithNullMapReturn => flatten(methodWithNullMapReturn_impl);

  shared  List<String>(*<[]>) methodWithListStringReturn => flatten(methodWithListStringReturn_impl);

  shared  List<Integer>(*<[]>) methodWithListLongReturn => flatten(methodWithListLongReturn_impl);

  shared  List<RefedInterface1>(*<[]>) methodWithListVertxGenReturn => flatten(methodWithListVertxGenReturn_impl);

  shared  List<JsonObject>(*<[]>) methodWithListJsonObjectReturn => flatten(methodWithListJsonObjectReturn_impl);

  shared  List<JsonObject>(*<[]>) methodWithListComplexJsonObjectReturn => flatten(methodWithListComplexJsonObjectReturn_impl);

  shared  List<JsonArray>(*<[]>) methodWithListJsonArrayReturn => flatten(methodWithListJsonArrayReturn_impl);

  shared  List<JsonArray>(*<[]>) methodWithListComplexJsonArrayReturn => flatten(methodWithListComplexJsonArrayReturn_impl);

  shared  List<String>(*<[]>) methodWithNullListReturn => flatten(methodWithNullListReturn_impl);

  shared  Set<String>(*<[]>) methodWithSetStringReturn => flatten(methodWithSetStringReturn_impl);

  shared  Set<Integer>(*<[]>) methodWithSetLongReturn => flatten(methodWithSetLongReturn_impl);

  shared  Set<RefedInterface1>(*<[]>) methodWithSetVertxGenReturn => flatten(methodWithSetVertxGenReturn_impl);

  shared  Set<JsonObject>(*<[]>) methodWithSetJsonObjectReturn => flatten(methodWithSetJsonObjectReturn_impl);

  shared  Set<JsonObject>(*<[]>) methodWithSetComplexJsonObjectReturn => flatten(methodWithSetComplexJsonObjectReturn_impl);

  shared  Set<JsonArray>(*<[]>) methodWithSetJsonArrayReturn => flatten(methodWithSetJsonArrayReturn_impl);

  shared  Set<JsonArray>(*<[]>) methodWithSetComplexJsonArrayReturn => flatten(methodWithSetComplexJsonArrayReturn_impl);

  shared  Set<String>(*<[]>) methodWithNullSetReturn => flatten(methodWithNullSetReturn_impl);

  shared  String(*<[String,String]>) methodWithEnumParam => flatten(methodWithEnumParam_impl);

  shared  String(*<[String]>) methodWithEnumReturn => flatten(methodWithEnumReturn_impl);

  shared  Throwable(*<[String]>) methodWithThrowableReturn => flatten(methodWithThrowableReturn_impl);

  Anything methodWithBasicParams_impl([Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithBasicBoxedParams_impl([Byte,Integer,Integer,Integer,Float,Float,Boolean,Character] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerBasicTypes_impl([Anything(Byte),Anything(Integer),Anything(Integer),Anything(Integer),Anything(Float),Anything(Float),Anything(Boolean),Anything(Character),Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultByte_impl([Boolean,Anything(Throwable|Byte)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultShort_impl([Boolean,Anything(Throwable|Integer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultInteger_impl([Boolean,Anything(Throwable|Integer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultLong_impl([Boolean,Anything(Throwable|Integer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultFloat_impl([Boolean,Anything(Throwable|Float)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultDouble_impl([Boolean,Anything(Throwable|Float)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultBoolean_impl([Boolean,Anything(Throwable|Boolean)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultCharacter_impl([Boolean,Anything(Throwable|Character)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultString_impl([Boolean,Anything(Throwable|String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultDataObject_impl([Boolean,Anything(Throwable|TestDataObject)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithUserTypes_impl([RefedInterface1] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithObjectParam_impl([String,Object] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithDataObjectParam_impl([TestDataObject] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithNullDataObjectParam_impl([TestDataObject] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithListParams_impl([List<String>,List<Byte>,List<Integer>,List<Integer>,List<Integer>,List<JsonObject>,List<JsonArray>,List<RefedInterface1>,List<TestDataObject>] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithSetParams_impl([Set<String>,Set<Byte>,Set<Integer>,Set<Integer>,Set<Integer>,Set<JsonObject>,Set<JsonArray>,Set<RefedInterface1>,Set<TestDataObject>] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithMapParams_impl([Map<String,String>,Map<String,Byte>,Map<String,Integer>,Map<String,Integer>,Map<String,Integer>,Map<String,JsonObject>,Map<String,JsonArray>,Map<String,RefedInterface1>] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListAndSet_impl([Anything(List<String>),Anything(List<Integer>),Anything(Set<String>),Anything(Set<Integer>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListString_impl([Anything(Throwable|List<String>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListInteger_impl([Anything(Throwable|List<Integer>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetString_impl([Anything(Throwable|Set<String>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetInteger_impl([Anything(Throwable|Set<Integer>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListVertxGen_impl([Anything(List<RefedInterface1>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetVertxGen_impl([Anything(Set<RefedInterface1>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListAbstractVertxGen_impl([Anything(List<RefedInterface2>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetAbstractVertxGen_impl([Anything(Set<RefedInterface2>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListJsonObject_impl([Anything(List<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListNullJsonObject_impl([Anything(List<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListComplexJsonObject_impl([Anything(List<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetJsonObject_impl([Anything(Set<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetNullJsonObject_impl([Anything(Set<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetComplexJsonObject_impl([Anything(Set<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListJsonArray_impl([Anything(List<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListNullJsonArray_impl([Anything(List<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListComplexJsonArray_impl([Anything(List<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetJsonArray_impl([Anything(Set<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetNullJsonArray_impl([Anything(Set<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetComplexJsonArray_impl([Anything(Set<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListDataObject_impl([Anything(List<TestDataObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListNullDataObject_impl([Anything(List<TestDataObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetDataObject_impl([Anything(Set<TestDataObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetNullDataObject_impl([Anything(Set<TestDataObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListVertxGen_impl([Anything(Throwable|List<RefedInterface1>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetVertxGen_impl([Anything(Throwable|Set<RefedInterface1>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListAbstractVertxGen_impl([Anything(Throwable|List<RefedInterface2>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetAbstractVertxGen_impl([Anything(Throwable|Set<RefedInterface2>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListJsonObject_impl([Anything(Throwable|List<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListNullJsonObject_impl([Anything(Throwable|List<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListComplexJsonObject_impl([Anything(Throwable|List<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetJsonObject_impl([Anything(Throwable|Set<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetNullJsonObject_impl([Anything(Throwable|Set<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetComplexJsonObject_impl([Anything(Throwable|Set<JsonObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListJsonArray_impl([Anything(Throwable|List<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListNullJsonArray_impl([Anything(Throwable|List<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListComplexJsonArray_impl([Anything(Throwable|List<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetJsonArray_impl([Anything(Throwable|Set<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetNullJsonArray_impl([Anything(Throwable|Set<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetComplexJsonArray_impl([Anything(Throwable|Set<JsonArray>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListDataObject_impl([Anything(Throwable|List<TestDataObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListNullDataObject_impl([Anything(Throwable|List<TestDataObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetDataObject_impl([Anything(Throwable|Set<TestDataObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetNullDataObject_impl([Anything(Throwable|Set<TestDataObject>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerUserTypes_impl([Anything(RefedInterface1)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultUserTypes_impl([Anything(Throwable|RefedInterface1)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithConcreteHandlerUserTypeSubtype_impl([ConcreteHandlerUserType] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithAbstractHandlerUserTypeSubtype_impl([AbstractHandlerUserType] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithConcreteHandlerUserTypeSubtypeExtension_impl([ConcreteHandlerUserTypeExtension] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerVoid_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultVoid_impl([Boolean,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerThrowable_impl([Anything(Throwable)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerDataObject_impl([Anything(TestDataObject)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerGenericUserType_impl([Object,Anything(GenericRefedInterface<Object>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultGenericUserType_impl([Object,Anything(Throwable|GenericRefedInterface<Object>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Byte methodWithByteReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer methodWithShortReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer methodWithIntReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer methodWithLongReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Float methodWithFloatReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Float methodWithDoubleReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean methodWithBooleanReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Character methodWithCharReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String methodWithStringReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface1 methodWithVertxGenReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface1 methodWithVertxGenNullReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface2 methodWithAbstractVertxGenReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String overloadedMethod_impl([String,Anything(String)]|[String,RefedInterface1]|[String,RefedInterface1,Anything(String)]|[String,RefedInterface1,Integer,Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Object methodWithGenericReturn_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithGenericParam_impl([String,Object] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithGenericHandler_impl([String,Anything(Object)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithGenericHandlerAsyncResult_impl([String,Anything(Throwable|Object)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TestInterface fluentMethod_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface1 methodWithCachedReturn_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer methodWithCachedReturnPrimitive_impl([Integer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonObject methodWithJsonObjectReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonObject methodWithNullJsonObjectReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonObject methodWithComplexJsonObjectReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonArray methodWithJsonArrayReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonArray methodWithNullJsonArrayReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonArray methodWithComplexJsonArrayReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithJsonParams_impl([JsonObject,JsonArray] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithNullJsonParams_impl([JsonObject,JsonArray] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerJson_impl([Anything(JsonObject),Anything(JsonArray)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerNullJson_impl([Anything(JsonObject),Anything(JsonArray)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerComplexJson_impl([Anything(JsonObject),Anything(JsonArray)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultJsonObject_impl([Anything(Throwable|JsonObject)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultNullJsonObject_impl([Anything(Throwable|JsonObject)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultComplexJsonObject_impl([Anything(Throwable|JsonObject)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultJsonArray_impl([Anything(Throwable|JsonArray)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultNullJsonArray_impl([Anything(Throwable|JsonArray)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultComplexJsonArray_impl([Anything(Throwable|JsonArray)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,String> methodWithMapReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,String> methodWithMapStringReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Integer> methodWithMapLongReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Integer> methodWithMapIntegerReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Integer> methodWithMapShortReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Byte> methodWithMapByteReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Character> methodWithMapCharacterReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Boolean> methodWithMapBooleanReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Float> methodWithMapFloatReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Float> methodWithMapDoubleReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,JsonObject> methodWithMapJsonObjectReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,JsonObject> methodWithMapComplexJsonObjectReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,JsonArray> methodWithMapJsonArrayReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,JsonArray> methodWithMapComplexJsonArrayReturn_impl([Anything(String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,String> methodWithNullMapReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> methodWithListStringReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<Integer> methodWithListLongReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<RefedInterface1> methodWithListVertxGenReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<JsonObject> methodWithListJsonObjectReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<JsonObject> methodWithListComplexJsonObjectReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<JsonArray> methodWithListJsonArrayReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<JsonArray> methodWithListComplexJsonArrayReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> methodWithNullListReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<String> methodWithSetStringReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<Integer> methodWithSetLongReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<RefedInterface1> methodWithSetVertxGenReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<JsonObject> methodWithSetJsonObjectReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<JsonObject> methodWithSetComplexJsonObjectReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<JsonArray> methodWithSetJsonArrayReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<JsonArray> methodWithSetComplexJsonArrayReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<String> methodWithNullSetReturn_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String methodWithEnumParam_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String methodWithEnumReturn_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Throwable methodWithThrowableReturn_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
