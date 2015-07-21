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
  TestInterface_=TestInterface,
  TestDataObject_=TestDataObject,
  AbstractHandlerUserType_=AbstractHandlerUserType,
  ConcreteHandlerUserType_=ConcreteHandlerUserType,
  ConcreteHandlerUserTypeExtension_=ConcreteHandlerUserTypeExtension,
  GenericRefedInterface_=GenericRefedInterface,
  RefedInterface1_=RefedInterface1,
  SuperInterface1_=SuperInterface1,
  RefedInterface2_=RefedInterface2,
  SuperInterface2_=SuperInterface2
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
shared interface TestInterface satisfies SuperInterface2 {

  shared formal Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) methodWithBasicParams;
  shared formal Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character]>) methodWithBasicBoxedParams;
  shared formal Anything(*<[Anything(Byte),Anything(Integer),Anything(Integer),Anything(Integer),Anything(Float),Anything(Float),Anything(Boolean),Anything(Character),Anything(String)]>) methodWithHandlerBasicTypes;
  shared formal Anything(*<[Boolean,Anything(Throwable|Byte)]>) methodWithHandlerAsyncResultByte;
  shared formal Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultShort;
  shared formal Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultInteger;
  shared formal Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultLong;
  shared formal Anything(*<[Boolean,Anything(Throwable|Float)]>) methodWithHandlerAsyncResultFloat;
  shared formal Anything(*<[Boolean,Anything(Throwable|Float)]>) methodWithHandlerAsyncResultDouble;
  shared formal Anything(*<[Boolean,Anything(Throwable|Boolean)]>) methodWithHandlerAsyncResultBoolean;
  shared formal Anything(*<[Boolean,Anything(Throwable|Character)]>) methodWithHandlerAsyncResultCharacter;
  shared formal Anything(*<[Boolean,Anything(Throwable|String)]>) methodWithHandlerAsyncResultString;
  shared formal Anything(*<[Boolean,Anything(Throwable|TestDataObject)]>) methodWithHandlerAsyncResultDataObject;
  shared formal Anything(*<[RefedInterface1]>) methodWithUserTypes;
  shared formal Anything(*<[String,Object]>) methodWithObjectParam;
  shared formal Anything(*<[TestDataObject]>) methodWithDataObjectParam;
  shared formal Anything(*<[TestDataObject]>) methodWithNullDataObjectParam;
  shared formal Anything(*<[List<String>,List<Byte>,List<Integer>,List<Integer>,List<Integer>,List<JsonObject>,List<JsonArray>,List<RefedInterface1>,List<TestDataObject>]>) methodWithListParams;
  shared formal Anything(*<[Set<String>,Set<Byte>,Set<Integer>,Set<Integer>,Set<Integer>,Set<JsonObject>,Set<JsonArray>,Set<RefedInterface1>,Set<TestDataObject>]>) methodWithSetParams;
  shared formal Anything(*<[Map<String,String>,Map<String,Byte>,Map<String,Integer>,Map<String,Integer>,Map<String,Integer>,Map<String,JsonObject>,Map<String,JsonArray>,Map<String,RefedInterface1>]>) methodWithMapParams;
  shared formal Anything(*<[Anything(List<String>),Anything(List<Integer>),Anything(Set<String>),Anything(Set<Integer>)]>) methodWithHandlerListAndSet;
  shared formal Anything(*<[Anything(Throwable|List<String>)]>) methodWithHandlerAsyncResultListString;
  shared formal Anything(*<[Anything(Throwable|List<Integer>)]>) methodWithHandlerAsyncResultListInteger;
  shared formal Anything(*<[Anything(Throwable|Set<String>)]>) methodWithHandlerAsyncResultSetString;
  shared formal Anything(*<[Anything(Throwable|Set<Integer>)]>) methodWithHandlerAsyncResultSetInteger;
  shared formal Anything(*<[Anything(List<RefedInterface1>)]>) methodWithHandlerListVertxGen;
  shared formal Anything(*<[Anything(Set<RefedInterface1>)]>) methodWithHandlerSetVertxGen;
  shared formal Anything(*<[Anything(List<RefedInterface2>)]>) methodWithHandlerListAbstractVertxGen;
  shared formal Anything(*<[Anything(Set<RefedInterface2>)]>) methodWithHandlerSetAbstractVertxGen;
  shared formal Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListJsonObject;
  shared formal Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListNullJsonObject;
  shared formal Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListComplexJsonObject;
  shared formal Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetJsonObject;
  shared formal Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetNullJsonObject;
  shared formal Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetComplexJsonObject;
  shared formal Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListJsonArray;
  shared formal Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListNullJsonArray;
  shared formal Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListComplexJsonArray;
  shared formal Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetJsonArray;
  shared formal Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetNullJsonArray;
  shared formal Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetComplexJsonArray;
  shared formal Anything(*<[Anything(List<TestDataObject>)]>) methodWithHandlerListDataObject;
  shared formal Anything(*<[Anything(List<TestDataObject>)]>) methodWithHandlerListNullDataObject;
  shared formal Anything(*<[Anything(Set<TestDataObject>)]>) methodWithHandlerSetDataObject;
  shared formal Anything(*<[Anything(Set<TestDataObject>)]>) methodWithHandlerSetNullDataObject;
  shared formal Anything(*<[Anything(Throwable|List<RefedInterface1>)]>) methodWithHandlerAsyncResultListVertxGen;
  shared formal Anything(*<[Anything(Throwable|Set<RefedInterface1>)]>) methodWithHandlerAsyncResultSetVertxGen;
  shared formal Anything(*<[Anything(Throwable|List<RefedInterface2>)]>) methodWithHandlerAsyncResultListAbstractVertxGen;
  shared formal Anything(*<[Anything(Throwable|Set<RefedInterface2>)]>) methodWithHandlerAsyncResultSetAbstractVertxGen;
  shared formal Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListJsonObject;
  shared formal Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListNullJsonObject;
  shared formal Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListComplexJsonObject;
  shared formal Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetJsonObject;
  shared formal Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetNullJsonObject;
  shared formal Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetComplexJsonObject;
  shared formal Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListJsonArray;
  shared formal Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListNullJsonArray;
  shared formal Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListComplexJsonArray;
  shared formal Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetJsonArray;
  shared formal Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetNullJsonArray;
  shared formal Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetComplexJsonArray;
  shared formal Anything(*<[Anything(Throwable|List<TestDataObject>)]>) methodWithHandlerAsyncResultListDataObject;
  shared formal Anything(*<[Anything(Throwable|List<TestDataObject>)]>) methodWithHandlerAsyncResultListNullDataObject;
  shared formal Anything(*<[Anything(Throwable|Set<TestDataObject>)]>) methodWithHandlerAsyncResultSetDataObject;
  shared formal Anything(*<[Anything(Throwable|Set<TestDataObject>)]>) methodWithHandlerAsyncResultSetNullDataObject;
  shared formal Anything(*<[Anything(RefedInterface1)]>) methodWithHandlerUserTypes;
  shared formal Anything(*<[Anything(Throwable|RefedInterface1)]>) methodWithHandlerAsyncResultUserTypes;
  shared formal Anything(*<[ConcreteHandlerUserType]>) methodWithConcreteHandlerUserTypeSubtype;
  shared formal Anything(*<[AbstractHandlerUserType]>) methodWithAbstractHandlerUserTypeSubtype;
  shared formal Anything(*<[ConcreteHandlerUserTypeExtension]>) methodWithConcreteHandlerUserTypeSubtypeExtension;
  shared formal Anything(*<[Anything()]>) methodWithHandlerVoid;
  shared formal Anything(*<[Boolean,Anything(Throwable?)]>) methodWithHandlerAsyncResultVoid;
  shared formal Anything(*<[Anything(Throwable)]>) methodWithHandlerThrowable;
  shared formal Anything(*<[Anything(TestDataObject)]>) methodWithHandlerDataObject;
  shared formal Anything(*<[Object,Anything(GenericRefedInterface<Object>)]>) methodWithHandlerGenericUserType;
  shared formal Anything(*<[Object,Anything(Throwable|GenericRefedInterface<Object>)]>) methodWithHandlerAsyncResultGenericUserType;
  shared formal Byte(*<[]>) methodWithByteReturn;
  shared formal Integer(*<[]>) methodWithShortReturn;
  shared formal Integer(*<[]>) methodWithIntReturn;
  shared formal Integer(*<[]>) methodWithLongReturn;
  shared formal Float(*<[]>) methodWithFloatReturn;
  shared formal Float(*<[]>) methodWithDoubleReturn;
  shared formal Boolean(*<[]>) methodWithBooleanReturn;
  shared formal Character(*<[]>) methodWithCharReturn;
  shared formal String(*<[]>) methodWithStringReturn;
  shared formal RefedInterface1(*<[]>) methodWithVertxGenReturn;
  shared formal RefedInterface1(*<[]>) methodWithVertxGenNullReturn;
  shared formal RefedInterface2(*<[]>) methodWithAbstractVertxGenReturn;
  shared formal String(*<[String,Anything(String)]|[String,RefedInterface1]|[String,RefedInterface1,Anything(String)]|[String,RefedInterface1,Integer,Anything(String)]>) overloadedMethod;
  shared formal Object(*<[String]>) methodWithGenericReturn;
  shared formal Anything(*<[String,Object]>) methodWithGenericParam;
  shared formal Anything(*<[String,Anything(Object)]>) methodWithGenericHandler;
  shared formal Anything(*<[String,Anything(Throwable|Object)]>) methodWithGenericHandlerAsyncResult;
  shared formal TestInterface(*<[String]>) fluentMethod;
  shared formal RefedInterface1(*<[String]>) methodWithCachedReturn;
  shared formal Integer(*<[Integer]>) methodWithCachedReturnPrimitive;
  shared formal JsonObject(*<[]>) methodWithJsonObjectReturn;
  shared formal JsonObject(*<[]>) methodWithNullJsonObjectReturn;
  shared formal JsonObject(*<[]>) methodWithComplexJsonObjectReturn;
  shared formal JsonArray(*<[]>) methodWithJsonArrayReturn;
  shared formal JsonArray(*<[]>) methodWithNullJsonArrayReturn;
  shared formal JsonArray(*<[]>) methodWithComplexJsonArrayReturn;
  shared formal Anything(*<[JsonObject,JsonArray]>) methodWithJsonParams;
  shared formal Anything(*<[JsonObject,JsonArray]>) methodWithNullJsonParams;
  shared formal Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerJson;
  shared formal Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerNullJson;
  shared formal Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerComplexJson;
  shared formal Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultJsonObject;
  shared formal Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultNullJsonObject;
  shared formal Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultComplexJsonObject;
  shared formal Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultJsonArray;
  shared formal Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultNullJsonArray;
  shared formal Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultComplexJsonArray;
  shared formal Map<String,String>(*<[Anything(String)]>) methodWithMapReturn;
  shared formal Map<String,String>(*<[Anything(String)]>) methodWithMapStringReturn;
  shared formal Map<String,Integer>(*<[Anything(String)]>) methodWithMapLongReturn;
  shared formal Map<String,Integer>(*<[Anything(String)]>) methodWithMapIntegerReturn;
  shared formal Map<String,Integer>(*<[Anything(String)]>) methodWithMapShortReturn;
  shared formal Map<String,Byte>(*<[Anything(String)]>) methodWithMapByteReturn;
  shared formal Map<String,Character>(*<[Anything(String)]>) methodWithMapCharacterReturn;
  shared formal Map<String,Boolean>(*<[Anything(String)]>) methodWithMapBooleanReturn;
  shared formal Map<String,Float>(*<[Anything(String)]>) methodWithMapFloatReturn;
  shared formal Map<String,Float>(*<[Anything(String)]>) methodWithMapDoubleReturn;
  shared formal Map<String,JsonObject>(*<[Anything(String)]>) methodWithMapJsonObjectReturn;
  shared formal Map<String,JsonObject>(*<[Anything(String)]>) methodWithMapComplexJsonObjectReturn;
  shared formal Map<String,JsonArray>(*<[Anything(String)]>) methodWithMapJsonArrayReturn;
  shared formal Map<String,JsonArray>(*<[Anything(String)]>) methodWithMapComplexJsonArrayReturn;
  shared formal Map<String,String>(*<[]>) methodWithNullMapReturn;
  shared formal List<String>(*<[]>) methodWithListStringReturn;
  shared formal List<Integer>(*<[]>) methodWithListLongReturn;
  shared formal List<RefedInterface1>(*<[]>) methodWithListVertxGenReturn;
  shared formal List<JsonObject>(*<[]>) methodWithListJsonObjectReturn;
  shared formal List<JsonObject>(*<[]>) methodWithListComplexJsonObjectReturn;
  shared formal List<JsonArray>(*<[]>) methodWithListJsonArrayReturn;
  shared formal List<JsonArray>(*<[]>) methodWithListComplexJsonArrayReturn;
  shared formal List<String>(*<[]>) methodWithNullListReturn;
  shared formal Set<String>(*<[]>) methodWithSetStringReturn;
  shared formal Set<Integer>(*<[]>) methodWithSetLongReturn;
  shared formal Set<RefedInterface1>(*<[]>) methodWithSetVertxGenReturn;
  shared formal Set<JsonObject>(*<[]>) methodWithSetJsonObjectReturn;
  shared formal Set<JsonObject>(*<[]>) methodWithSetComplexJsonObjectReturn;
  shared formal Set<JsonArray>(*<[]>) methodWithSetJsonArrayReturn;
  shared formal Set<JsonArray>(*<[]>) methodWithSetComplexJsonArrayReturn;
  shared formal Set<String>(*<[]>) methodWithNullSetReturn;
  shared formal String(*<[String,String]>) methodWithEnumParam;
  shared formal String(*<[String]>) methodWithEnumReturn;
  shared formal Throwable(*<[String]>) methodWithThrowableReturn;
}
/* Generated from io.vertx.codegen.testmodel.TestInterface */

shared abstract class TestInterface_Impl(TestInterface_ delegate) satisfies TestInterface & Delegating<TestInterface_> {

  shared actual Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) methodWithBasicParams => flatten(methodWithBasicParams_impl);
  shared actual Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character]>) methodWithBasicBoxedParams => flatten(methodWithBasicBoxedParams_impl);
  shared actual Anything(*<[Anything(Byte),Anything(Integer),Anything(Integer),Anything(Integer),Anything(Float),Anything(Float),Anything(Boolean),Anything(Character),Anything(String)]>) methodWithHandlerBasicTypes => flatten(methodWithHandlerBasicTypes_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable|Byte)]>) methodWithHandlerAsyncResultByte => flatten(methodWithHandlerAsyncResultByte_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultShort => flatten(methodWithHandlerAsyncResultShort_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultInteger => flatten(methodWithHandlerAsyncResultInteger_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultLong => flatten(methodWithHandlerAsyncResultLong_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable|Float)]>) methodWithHandlerAsyncResultFloat => flatten(methodWithHandlerAsyncResultFloat_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable|Float)]>) methodWithHandlerAsyncResultDouble => flatten(methodWithHandlerAsyncResultDouble_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable|Boolean)]>) methodWithHandlerAsyncResultBoolean => flatten(methodWithHandlerAsyncResultBoolean_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable|Character)]>) methodWithHandlerAsyncResultCharacter => flatten(methodWithHandlerAsyncResultCharacter_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable|String)]>) methodWithHandlerAsyncResultString => flatten(methodWithHandlerAsyncResultString_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable|TestDataObject)]>) methodWithHandlerAsyncResultDataObject => flatten(methodWithHandlerAsyncResultDataObject_impl);
  shared actual Anything(*<[RefedInterface1]>) methodWithUserTypes => flatten(methodWithUserTypes_impl);
  shared actual Anything(*<[String,Object]>) methodWithObjectParam => flatten(methodWithObjectParam_impl);
  shared actual Anything(*<[TestDataObject]>) methodWithDataObjectParam => flatten(methodWithDataObjectParam_impl);
  shared actual Anything(*<[TestDataObject]>) methodWithNullDataObjectParam => flatten(methodWithNullDataObjectParam_impl);
  shared actual Anything(*<[List<String>,List<Byte>,List<Integer>,List<Integer>,List<Integer>,List<JsonObject>,List<JsonArray>,List<RefedInterface1>,List<TestDataObject>]>) methodWithListParams => flatten(methodWithListParams_impl);
  shared actual Anything(*<[Set<String>,Set<Byte>,Set<Integer>,Set<Integer>,Set<Integer>,Set<JsonObject>,Set<JsonArray>,Set<RefedInterface1>,Set<TestDataObject>]>) methodWithSetParams => flatten(methodWithSetParams_impl);
  shared actual Anything(*<[Map<String,String>,Map<String,Byte>,Map<String,Integer>,Map<String,Integer>,Map<String,Integer>,Map<String,JsonObject>,Map<String,JsonArray>,Map<String,RefedInterface1>]>) methodWithMapParams => flatten(methodWithMapParams_impl);
  shared actual Anything(*<[Anything(List<String>),Anything(List<Integer>),Anything(Set<String>),Anything(Set<Integer>)]>) methodWithHandlerListAndSet => flatten(methodWithHandlerListAndSet_impl);
  shared actual Anything(*<[Anything(Throwable|List<String>)]>) methodWithHandlerAsyncResultListString => flatten(methodWithHandlerAsyncResultListString_impl);
  shared actual Anything(*<[Anything(Throwable|List<Integer>)]>) methodWithHandlerAsyncResultListInteger => flatten(methodWithHandlerAsyncResultListInteger_impl);
  shared actual Anything(*<[Anything(Throwable|Set<String>)]>) methodWithHandlerAsyncResultSetString => flatten(methodWithHandlerAsyncResultSetString_impl);
  shared actual Anything(*<[Anything(Throwable|Set<Integer>)]>) methodWithHandlerAsyncResultSetInteger => flatten(methodWithHandlerAsyncResultSetInteger_impl);
  shared actual Anything(*<[Anything(List<RefedInterface1>)]>) methodWithHandlerListVertxGen => flatten(methodWithHandlerListVertxGen_impl);
  shared actual Anything(*<[Anything(Set<RefedInterface1>)]>) methodWithHandlerSetVertxGen => flatten(methodWithHandlerSetVertxGen_impl);
  shared actual Anything(*<[Anything(List<RefedInterface2>)]>) methodWithHandlerListAbstractVertxGen => flatten(methodWithHandlerListAbstractVertxGen_impl);
  shared actual Anything(*<[Anything(Set<RefedInterface2>)]>) methodWithHandlerSetAbstractVertxGen => flatten(methodWithHandlerSetAbstractVertxGen_impl);
  shared actual Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListJsonObject => flatten(methodWithHandlerListJsonObject_impl);
  shared actual Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListNullJsonObject => flatten(methodWithHandlerListNullJsonObject_impl);
  shared actual Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListComplexJsonObject => flatten(methodWithHandlerListComplexJsonObject_impl);
  shared actual Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetJsonObject => flatten(methodWithHandlerSetJsonObject_impl);
  shared actual Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetNullJsonObject => flatten(methodWithHandlerSetNullJsonObject_impl);
  shared actual Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetComplexJsonObject => flatten(methodWithHandlerSetComplexJsonObject_impl);
  shared actual Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListJsonArray => flatten(methodWithHandlerListJsonArray_impl);
  shared actual Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListNullJsonArray => flatten(methodWithHandlerListNullJsonArray_impl);
  shared actual Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListComplexJsonArray => flatten(methodWithHandlerListComplexJsonArray_impl);
  shared actual Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetJsonArray => flatten(methodWithHandlerSetJsonArray_impl);
  shared actual Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetNullJsonArray => flatten(methodWithHandlerSetNullJsonArray_impl);
  shared actual Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetComplexJsonArray => flatten(methodWithHandlerSetComplexJsonArray_impl);
  shared actual Anything(*<[Anything(List<TestDataObject>)]>) methodWithHandlerListDataObject => flatten(methodWithHandlerListDataObject_impl);
  shared actual Anything(*<[Anything(List<TestDataObject>)]>) methodWithHandlerListNullDataObject => flatten(methodWithHandlerListNullDataObject_impl);
  shared actual Anything(*<[Anything(Set<TestDataObject>)]>) methodWithHandlerSetDataObject => flatten(methodWithHandlerSetDataObject_impl);
  shared actual Anything(*<[Anything(Set<TestDataObject>)]>) methodWithHandlerSetNullDataObject => flatten(methodWithHandlerSetNullDataObject_impl);
  shared actual Anything(*<[Anything(Throwable|List<RefedInterface1>)]>) methodWithHandlerAsyncResultListVertxGen => flatten(methodWithHandlerAsyncResultListVertxGen_impl);
  shared actual Anything(*<[Anything(Throwable|Set<RefedInterface1>)]>) methodWithHandlerAsyncResultSetVertxGen => flatten(methodWithHandlerAsyncResultSetVertxGen_impl);
  shared actual Anything(*<[Anything(Throwable|List<RefedInterface2>)]>) methodWithHandlerAsyncResultListAbstractVertxGen => flatten(methodWithHandlerAsyncResultListAbstractVertxGen_impl);
  shared actual Anything(*<[Anything(Throwable|Set<RefedInterface2>)]>) methodWithHandlerAsyncResultSetAbstractVertxGen => flatten(methodWithHandlerAsyncResultSetAbstractVertxGen_impl);
  shared actual Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListJsonObject => flatten(methodWithHandlerAsyncResultListJsonObject_impl);
  shared actual Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListNullJsonObject => flatten(methodWithHandlerAsyncResultListNullJsonObject_impl);
  shared actual Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListComplexJsonObject => flatten(methodWithHandlerAsyncResultListComplexJsonObject_impl);
  shared actual Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetJsonObject => flatten(methodWithHandlerAsyncResultSetJsonObject_impl);
  shared actual Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetNullJsonObject => flatten(methodWithHandlerAsyncResultSetNullJsonObject_impl);
  shared actual Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetComplexJsonObject => flatten(methodWithHandlerAsyncResultSetComplexJsonObject_impl);
  shared actual Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListJsonArray => flatten(methodWithHandlerAsyncResultListJsonArray_impl);
  shared actual Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListNullJsonArray => flatten(methodWithHandlerAsyncResultListNullJsonArray_impl);
  shared actual Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListComplexJsonArray => flatten(methodWithHandlerAsyncResultListComplexJsonArray_impl);
  shared actual Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetJsonArray => flatten(methodWithHandlerAsyncResultSetJsonArray_impl);
  shared actual Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetNullJsonArray => flatten(methodWithHandlerAsyncResultSetNullJsonArray_impl);
  shared actual Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetComplexJsonArray => flatten(methodWithHandlerAsyncResultSetComplexJsonArray_impl);
  shared actual Anything(*<[Anything(Throwable|List<TestDataObject>)]>) methodWithHandlerAsyncResultListDataObject => flatten(methodWithHandlerAsyncResultListDataObject_impl);
  shared actual Anything(*<[Anything(Throwable|List<TestDataObject>)]>) methodWithHandlerAsyncResultListNullDataObject => flatten(methodWithHandlerAsyncResultListNullDataObject_impl);
  shared actual Anything(*<[Anything(Throwable|Set<TestDataObject>)]>) methodWithHandlerAsyncResultSetDataObject => flatten(methodWithHandlerAsyncResultSetDataObject_impl);
  shared actual Anything(*<[Anything(Throwable|Set<TestDataObject>)]>) methodWithHandlerAsyncResultSetNullDataObject => flatten(methodWithHandlerAsyncResultSetNullDataObject_impl);
  shared actual Anything(*<[Anything(RefedInterface1)]>) methodWithHandlerUserTypes => flatten(methodWithHandlerUserTypes_impl);
  shared actual Anything(*<[Anything(Throwable|RefedInterface1)]>) methodWithHandlerAsyncResultUserTypes => flatten(methodWithHandlerAsyncResultUserTypes_impl);
  shared actual Anything(*<[ConcreteHandlerUserType]>) methodWithConcreteHandlerUserTypeSubtype => flatten(methodWithConcreteHandlerUserTypeSubtype_impl);
  shared actual Anything(*<[AbstractHandlerUserType]>) methodWithAbstractHandlerUserTypeSubtype => flatten(methodWithAbstractHandlerUserTypeSubtype_impl);
  shared actual Anything(*<[ConcreteHandlerUserTypeExtension]>) methodWithConcreteHandlerUserTypeSubtypeExtension => flatten(methodWithConcreteHandlerUserTypeSubtypeExtension_impl);
  shared actual Anything(*<[Anything()]>) methodWithHandlerVoid => flatten(methodWithHandlerVoid_impl);
  shared actual Anything(*<[Boolean,Anything(Throwable?)]>) methodWithHandlerAsyncResultVoid => flatten(methodWithHandlerAsyncResultVoid_impl);
  shared actual Anything(*<[Anything(Throwable)]>) methodWithHandlerThrowable => flatten(methodWithHandlerThrowable_impl);
  shared actual Anything(*<[Anything(TestDataObject)]>) methodWithHandlerDataObject => flatten(methodWithHandlerDataObject_impl);
  shared actual Anything(*<[Object,Anything(GenericRefedInterface<Object>)]>) methodWithHandlerGenericUserType => flatten(methodWithHandlerGenericUserType_impl);
  shared actual Anything(*<[Object,Anything(Throwable|GenericRefedInterface<Object>)]>) methodWithHandlerAsyncResultGenericUserType => flatten(methodWithHandlerAsyncResultGenericUserType_impl);
  shared actual Byte(*<[]>) methodWithByteReturn => flatten(methodWithByteReturn_impl);
  shared actual Integer(*<[]>) methodWithShortReturn => flatten(methodWithShortReturn_impl);
  shared actual Integer(*<[]>) methodWithIntReturn => flatten(methodWithIntReturn_impl);
  shared actual Integer(*<[]>) methodWithLongReturn => flatten(methodWithLongReturn_impl);
  shared actual Float(*<[]>) methodWithFloatReturn => flatten(methodWithFloatReturn_impl);
  shared actual Float(*<[]>) methodWithDoubleReturn => flatten(methodWithDoubleReturn_impl);
  shared actual Boolean(*<[]>) methodWithBooleanReturn => flatten(methodWithBooleanReturn_impl);
  shared actual Character(*<[]>) methodWithCharReturn => flatten(methodWithCharReturn_impl);
  shared actual String(*<[]>) methodWithStringReturn => flatten(methodWithStringReturn_impl);
  shared actual RefedInterface1(*<[]>) methodWithVertxGenReturn => flatten(methodWithVertxGenReturn_impl);
  shared actual RefedInterface1(*<[]>) methodWithVertxGenNullReturn => flatten(methodWithVertxGenNullReturn_impl);
  shared actual RefedInterface2(*<[]>) methodWithAbstractVertxGenReturn => flatten(methodWithAbstractVertxGenReturn_impl);
  shared actual String(*<[String,Anything(String)]|[String,RefedInterface1]|[String,RefedInterface1,Anything(String)]|[String,RefedInterface1,Integer,Anything(String)]>) overloadedMethod => flatten(overloadedMethod_impl);
  shared actual Object(*<[String]>) methodWithGenericReturn => flatten(methodWithGenericReturn_impl);
  shared actual Anything(*<[String,Object]>) methodWithGenericParam => flatten(methodWithGenericParam_impl);
  shared actual Anything(*<[String,Anything(Object)]>) methodWithGenericHandler => flatten(methodWithGenericHandler_impl);
  shared actual Anything(*<[String,Anything(Throwable|Object)]>) methodWithGenericHandlerAsyncResult => flatten(methodWithGenericHandlerAsyncResult_impl);
  shared actual TestInterface(*<[String]>) fluentMethod => flatten(fluentMethod_impl);
  shared actual RefedInterface1(*<[String]>) methodWithCachedReturn => flatten(methodWithCachedReturn_impl);
  shared actual Integer(*<[Integer]>) methodWithCachedReturnPrimitive => flatten(methodWithCachedReturnPrimitive_impl);
  shared actual JsonObject(*<[]>) methodWithJsonObjectReturn => flatten(methodWithJsonObjectReturn_impl);
  shared actual JsonObject(*<[]>) methodWithNullJsonObjectReturn => flatten(methodWithNullJsonObjectReturn_impl);
  shared actual JsonObject(*<[]>) methodWithComplexJsonObjectReturn => flatten(methodWithComplexJsonObjectReturn_impl);
  shared actual JsonArray(*<[]>) methodWithJsonArrayReturn => flatten(methodWithJsonArrayReturn_impl);
  shared actual JsonArray(*<[]>) methodWithNullJsonArrayReturn => flatten(methodWithNullJsonArrayReturn_impl);
  shared actual JsonArray(*<[]>) methodWithComplexJsonArrayReturn => flatten(methodWithComplexJsonArrayReturn_impl);
  shared actual Anything(*<[JsonObject,JsonArray]>) methodWithJsonParams => flatten(methodWithJsonParams_impl);
  shared actual Anything(*<[JsonObject,JsonArray]>) methodWithNullJsonParams => flatten(methodWithNullJsonParams_impl);
  shared actual Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerJson => flatten(methodWithHandlerJson_impl);
  shared actual Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerNullJson => flatten(methodWithHandlerNullJson_impl);
  shared actual Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerComplexJson => flatten(methodWithHandlerComplexJson_impl);
  shared actual Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultJsonObject => flatten(methodWithHandlerAsyncResultJsonObject_impl);
  shared actual Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultNullJsonObject => flatten(methodWithHandlerAsyncResultNullJsonObject_impl);
  shared actual Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultComplexJsonObject => flatten(methodWithHandlerAsyncResultComplexJsonObject_impl);
  shared actual Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultJsonArray => flatten(methodWithHandlerAsyncResultJsonArray_impl);
  shared actual Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultNullJsonArray => flatten(methodWithHandlerAsyncResultNullJsonArray_impl);
  shared actual Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultComplexJsonArray => flatten(methodWithHandlerAsyncResultComplexJsonArray_impl);
  shared actual Map<String,String>(*<[Anything(String)]>) methodWithMapReturn => flatten(methodWithMapReturn_impl);
  shared actual Map<String,String>(*<[Anything(String)]>) methodWithMapStringReturn => flatten(methodWithMapStringReturn_impl);
  shared actual Map<String,Integer>(*<[Anything(String)]>) methodWithMapLongReturn => flatten(methodWithMapLongReturn_impl);
  shared actual Map<String,Integer>(*<[Anything(String)]>) methodWithMapIntegerReturn => flatten(methodWithMapIntegerReturn_impl);
  shared actual Map<String,Integer>(*<[Anything(String)]>) methodWithMapShortReturn => flatten(methodWithMapShortReturn_impl);
  shared actual Map<String,Byte>(*<[Anything(String)]>) methodWithMapByteReturn => flatten(methodWithMapByteReturn_impl);
  shared actual Map<String,Character>(*<[Anything(String)]>) methodWithMapCharacterReturn => flatten(methodWithMapCharacterReturn_impl);
  shared actual Map<String,Boolean>(*<[Anything(String)]>) methodWithMapBooleanReturn => flatten(methodWithMapBooleanReturn_impl);
  shared actual Map<String,Float>(*<[Anything(String)]>) methodWithMapFloatReturn => flatten(methodWithMapFloatReturn_impl);
  shared actual Map<String,Float>(*<[Anything(String)]>) methodWithMapDoubleReturn => flatten(methodWithMapDoubleReturn_impl);
  shared actual Map<String,JsonObject>(*<[Anything(String)]>) methodWithMapJsonObjectReturn => flatten(methodWithMapJsonObjectReturn_impl);
  shared actual Map<String,JsonObject>(*<[Anything(String)]>) methodWithMapComplexJsonObjectReturn => flatten(methodWithMapComplexJsonObjectReturn_impl);
  shared actual Map<String,JsonArray>(*<[Anything(String)]>) methodWithMapJsonArrayReturn => flatten(methodWithMapJsonArrayReturn_impl);
  shared actual Map<String,JsonArray>(*<[Anything(String)]>) methodWithMapComplexJsonArrayReturn => flatten(methodWithMapComplexJsonArrayReturn_impl);
  shared actual Map<String,String>(*<[]>) methodWithNullMapReturn => flatten(methodWithNullMapReturn_impl);
  shared actual List<String>(*<[]>) methodWithListStringReturn => flatten(methodWithListStringReturn_impl);
  shared actual List<Integer>(*<[]>) methodWithListLongReturn => flatten(methodWithListLongReturn_impl);
  shared actual List<RefedInterface1>(*<[]>) methodWithListVertxGenReturn => flatten(methodWithListVertxGenReturn_impl);
  shared actual List<JsonObject>(*<[]>) methodWithListJsonObjectReturn => flatten(methodWithListJsonObjectReturn_impl);
  shared actual List<JsonObject>(*<[]>) methodWithListComplexJsonObjectReturn => flatten(methodWithListComplexJsonObjectReturn_impl);
  shared actual List<JsonArray>(*<[]>) methodWithListJsonArrayReturn => flatten(methodWithListJsonArrayReturn_impl);
  shared actual List<JsonArray>(*<[]>) methodWithListComplexJsonArrayReturn => flatten(methodWithListComplexJsonArrayReturn_impl);
  shared actual List<String>(*<[]>) methodWithNullListReturn => flatten(methodWithNullListReturn_impl);
  shared actual Set<String>(*<[]>) methodWithSetStringReturn => flatten(methodWithSetStringReturn_impl);
  shared actual Set<Integer>(*<[]>) methodWithSetLongReturn => flatten(methodWithSetLongReturn_impl);
  shared actual Set<RefedInterface1>(*<[]>) methodWithSetVertxGenReturn => flatten(methodWithSetVertxGenReturn_impl);
  shared actual Set<JsonObject>(*<[]>) methodWithSetJsonObjectReturn => flatten(methodWithSetJsonObjectReturn_impl);
  shared actual Set<JsonObject>(*<[]>) methodWithSetComplexJsonObjectReturn => flatten(methodWithSetComplexJsonObjectReturn_impl);
  shared actual Set<JsonArray>(*<[]>) methodWithSetJsonArrayReturn => flatten(methodWithSetJsonArrayReturn_impl);
  shared actual Set<JsonArray>(*<[]>) methodWithSetComplexJsonArrayReturn => flatten(methodWithSetComplexJsonArrayReturn_impl);
  shared actual Set<String>(*<[]>) methodWithNullSetReturn => flatten(methodWithNullSetReturn_impl);
  shared actual String(*<[String,String]>) methodWithEnumParam => flatten(methodWithEnumParam_impl);
  shared actual String(*<[String]>) methodWithEnumReturn => flatten(methodWithEnumReturn_impl);
  shared actual Throwable(*<[String]>) methodWithThrowableReturn => flatten(methodWithThrowableReturn_impl);

  Anything methodWithBasicParams_impl([Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String] args) {
    Nothing arg_0 = nothing;
    Integer arg_1 = args[1];
    Integer arg_2 = args[2];
    Integer arg_3 = args[3];
    Float arg_4 = args[4];
    Float arg_5 = args[5];
    Boolean arg_6 = args[6];
    Character arg_7 = args[7];
    String arg_8 = args[8];
    Anything v = delegate.methodWithBasicParams(arg_0,arg_1,arg_2,arg_3,arg_4,arg_5,arg_6,arg_7,arg_8);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithBasicBoxedParams_impl([Byte,Integer,Integer,Integer,Float,Float,Boolean,Character] args) {
    Nothing arg_0 = nothing;
    Integer arg_1 = args[1];
    Integer arg_2 = args[2];
    Integer arg_3 = args[3];
    Float arg_4 = args[4];
    Float arg_5 = args[5];
    Boolean arg_6 = args[6];
    Character arg_7 = args[7];
    Anything v = delegate.methodWithBasicBoxedParams(arg_0,arg_1,arg_2,arg_3,arg_4,arg_5,arg_6,arg_7);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerBasicTypes_impl([Anything(Byte),Anything(Integer),Anything(Integer),Anything(Integer),Anything(Float),Anything(Float),Anything(Boolean),Anything(Character),Anything(String)] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Nothing arg_2 = nothing;
    Nothing arg_3 = nothing;
    Nothing arg_4 = nothing;
    Nothing arg_5 = nothing;
    Nothing arg_6 = nothing;
    Nothing arg_7 = nothing;
    Nothing arg_8 = nothing;
    Anything v = delegate.methodWithHandlerBasicTypes(arg_0,arg_1,arg_2,arg_3,arg_4,arg_5,arg_6,arg_7,arg_8);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultByte_impl([Boolean,Anything(Throwable|Byte)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultByte(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultShort_impl([Boolean,Anything(Throwable|Integer)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultShort(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultInteger_impl([Boolean,Anything(Throwable|Integer)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultInteger(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultLong_impl([Boolean,Anything(Throwable|Integer)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultLong(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultFloat_impl([Boolean,Anything(Throwable|Float)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultFloat(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultDouble_impl([Boolean,Anything(Throwable|Float)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultDouble(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultBoolean_impl([Boolean,Anything(Throwable|Boolean)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultBoolean(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultCharacter_impl([Boolean,Anything(Throwable|Character)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultCharacter(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultString_impl([Boolean,Anything(Throwable|String)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultString(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultDataObject_impl([Boolean,Anything(Throwable|TestDataObject)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultDataObject(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithUserTypes_impl([RefedInterface1] args) {
    assert(is Delegating<RefedInterface1_> arg_0 = args[0]);
    Anything v = delegate.methodWithUserTypes(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithObjectParam_impl([String,Object] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithObjectParam(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithDataObjectParam_impl([TestDataObject] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithDataObjectParam(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithNullDataObjectParam_impl([TestDataObject] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithNullDataObjectParam(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithListParams_impl([List<String>,List<Byte>,List<Integer>,List<Integer>,List<Integer>,List<JsonObject>,List<JsonArray>,List<RefedInterface1>,List<TestDataObject>] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Nothing arg_2 = nothing;
    Nothing arg_3 = nothing;
    Nothing arg_4 = nothing;
    Nothing arg_5 = nothing;
    Nothing arg_6 = nothing;
    Nothing arg_7 = nothing;
    Nothing arg_8 = nothing;
    Anything v = delegate.methodWithListParams(arg_0,arg_1,arg_2,arg_3,arg_4,arg_5,arg_6,arg_7,arg_8);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithSetParams_impl([Set<String>,Set<Byte>,Set<Integer>,Set<Integer>,Set<Integer>,Set<JsonObject>,Set<JsonArray>,Set<RefedInterface1>,Set<TestDataObject>] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Nothing arg_2 = nothing;
    Nothing arg_3 = nothing;
    Nothing arg_4 = nothing;
    Nothing arg_5 = nothing;
    Nothing arg_6 = nothing;
    Nothing arg_7 = nothing;
    Nothing arg_8 = nothing;
    Anything v = delegate.methodWithSetParams(arg_0,arg_1,arg_2,arg_3,arg_4,arg_5,arg_6,arg_7,arg_8);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithMapParams_impl([Map<String,String>,Map<String,Byte>,Map<String,Integer>,Map<String,Integer>,Map<String,Integer>,Map<String,JsonObject>,Map<String,JsonArray>,Map<String,RefedInterface1>] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Nothing arg_2 = nothing;
    Nothing arg_3 = nothing;
    Nothing arg_4 = nothing;
    Nothing arg_5 = nothing;
    Nothing arg_6 = nothing;
    Nothing arg_7 = nothing;
    Anything v = delegate.methodWithMapParams(arg_0,arg_1,arg_2,arg_3,arg_4,arg_5,arg_6,arg_7);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListAndSet_impl([Anything(List<String>),Anything(List<Integer>),Anything(Set<String>),Anything(Set<Integer>)] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Nothing arg_2 = nothing;
    Nothing arg_3 = nothing;
    Anything v = delegate.methodWithHandlerListAndSet(arg_0,arg_1,arg_2,arg_3);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListString_impl([Anything(Throwable|List<String>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListString(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListInteger_impl([Anything(Throwable|List<Integer>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListInteger(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetString_impl([Anything(Throwable|Set<String>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetString(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetInteger_impl([Anything(Throwable|Set<Integer>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetInteger(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListVertxGen_impl([Anything(List<RefedInterface1>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerListVertxGen(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetVertxGen_impl([Anything(Set<RefedInterface1>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerSetVertxGen(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListAbstractVertxGen_impl([Anything(List<RefedInterface2>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerListAbstractVertxGen(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetAbstractVertxGen_impl([Anything(Set<RefedInterface2>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerSetAbstractVertxGen(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListJsonObject_impl([Anything(List<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerListJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListNullJsonObject_impl([Anything(List<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerListNullJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListComplexJsonObject_impl([Anything(List<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerListComplexJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetJsonObject_impl([Anything(Set<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerSetJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetNullJsonObject_impl([Anything(Set<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerSetNullJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetComplexJsonObject_impl([Anything(Set<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerSetComplexJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListJsonArray_impl([Anything(List<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerListJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListNullJsonArray_impl([Anything(List<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerListNullJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListComplexJsonArray_impl([Anything(List<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerListComplexJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetJsonArray_impl([Anything(Set<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerSetJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetNullJsonArray_impl([Anything(Set<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerSetNullJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetComplexJsonArray_impl([Anything(Set<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerSetComplexJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListDataObject_impl([Anything(List<TestDataObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerListDataObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerListNullDataObject_impl([Anything(List<TestDataObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerListNullDataObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetDataObject_impl([Anything(Set<TestDataObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerSetDataObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerSetNullDataObject_impl([Anything(Set<TestDataObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerSetNullDataObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListVertxGen_impl([Anything(Throwable|List<RefedInterface1>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListVertxGen(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetVertxGen_impl([Anything(Throwable|Set<RefedInterface1>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetVertxGen(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListAbstractVertxGen_impl([Anything(Throwable|List<RefedInterface2>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListAbstractVertxGen(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetAbstractVertxGen_impl([Anything(Throwable|Set<RefedInterface2>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetAbstractVertxGen(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListJsonObject_impl([Anything(Throwable|List<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListNullJsonObject_impl([Anything(Throwable|List<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListNullJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListComplexJsonObject_impl([Anything(Throwable|List<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListComplexJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetJsonObject_impl([Anything(Throwable|Set<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetNullJsonObject_impl([Anything(Throwable|Set<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetNullJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetComplexJsonObject_impl([Anything(Throwable|Set<JsonObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetComplexJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListJsonArray_impl([Anything(Throwable|List<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListNullJsonArray_impl([Anything(Throwable|List<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListNullJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListComplexJsonArray_impl([Anything(Throwable|List<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListComplexJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetJsonArray_impl([Anything(Throwable|Set<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetNullJsonArray_impl([Anything(Throwable|Set<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetNullJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetComplexJsonArray_impl([Anything(Throwable|Set<JsonArray>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetComplexJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListDataObject_impl([Anything(Throwable|List<TestDataObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListDataObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultListNullDataObject_impl([Anything(Throwable|List<TestDataObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultListNullDataObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetDataObject_impl([Anything(Throwable|Set<TestDataObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetDataObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultSetNullDataObject_impl([Anything(Throwable|Set<TestDataObject>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultSetNullDataObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerUserTypes_impl([Anything(RefedInterface1)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerUserTypes(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultUserTypes_impl([Anything(Throwable|RefedInterface1)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultUserTypes(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithConcreteHandlerUserTypeSubtype_impl([ConcreteHandlerUserType] args) {
    assert(is Delegating<ConcreteHandlerUserType_> arg_0 = args[0]);
    Anything v = delegate.methodWithConcreteHandlerUserTypeSubtype(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithAbstractHandlerUserTypeSubtype_impl([AbstractHandlerUserType] args) {
    assert(is Delegating<AbstractHandlerUserType_> arg_0 = args[0]);
    Anything v = delegate.methodWithAbstractHandlerUserTypeSubtype(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithConcreteHandlerUserTypeSubtypeExtension_impl([ConcreteHandlerUserTypeExtension] args) {
    assert(is Delegating<ConcreteHandlerUserTypeExtension_> arg_0 = args[0]);
    Anything v = delegate.methodWithConcreteHandlerUserTypeSubtypeExtension(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerVoid_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerVoid(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultVoid_impl([Boolean,Anything(Throwable?)] args) {
    Boolean arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultVoid(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerThrowable_impl([Anything(Throwable)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerThrowable(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerDataObject_impl([Anything(TestDataObject)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerDataObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerGenericUserType_impl([Object,Anything(GenericRefedInterface<Object>)] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerGenericUserType(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultGenericUserType_impl([Object,Anything(Throwable|GenericRefedInterface<Object>)] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultGenericUserType(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Byte methodWithByteReturn_impl([] args) {
    Anything v = delegate.methodWithByteReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer methodWithShortReturn_impl([] args) {
    Anything v = delegate.methodWithShortReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer methodWithIntReturn_impl([] args) {
    Anything v = delegate.methodWithIntReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer methodWithLongReturn_impl([] args) {
    Anything v = delegate.methodWithLongReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Float methodWithFloatReturn_impl([] args) {
    Anything v = delegate.methodWithFloatReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Float methodWithDoubleReturn_impl([] args) {
    Anything v = delegate.methodWithDoubleReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean methodWithBooleanReturn_impl([] args) {
    Anything v = delegate.methodWithBooleanReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Character methodWithCharReturn_impl([] args) {
    Anything v = delegate.methodWithCharReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String methodWithStringReturn_impl([] args) {
    Anything v = delegate.methodWithStringReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface1 methodWithVertxGenReturn_impl([] args) {
    Anything v = delegate.methodWithVertxGenReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface1 methodWithVertxGenNullReturn_impl([] args) {
    Anything v = delegate.methodWithVertxGenNullReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface2 methodWithAbstractVertxGenReturn_impl([] args) {
    Anything v = delegate.methodWithAbstractVertxGenReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String overloadedMethod_impl([String,Anything(String)]|[String,RefedInterface1]|[String,RefedInterface1,Anything(String)]|[String,RefedInterface1,Integer,Anything(String)] args) {
    if (is [String,Anything(String)] args) {
    }
    if (is [String,RefedInterface1] args) {
    }
    if (is [String,RefedInterface1,Anything(String)] args) {
    }
    if (is [String,RefedInterface1,Integer,Anything(String)] args) {
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Object methodWithGenericReturn_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.methodWithGenericReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithGenericParam_impl([String,Object] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithGenericParam(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithGenericHandler_impl([String,Anything(Object)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithGenericHandler(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithGenericHandlerAsyncResult_impl([String,Anything(Throwable|Object)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithGenericHandlerAsyncResult(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TestInterface fluentMethod_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.fluentMethod(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface1 methodWithCachedReturn_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.methodWithCachedReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer methodWithCachedReturnPrimitive_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.methodWithCachedReturnPrimitive(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonObject methodWithJsonObjectReturn_impl([] args) {
    Anything v = delegate.methodWithJsonObjectReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonObject methodWithNullJsonObjectReturn_impl([] args) {
    Anything v = delegate.methodWithNullJsonObjectReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonObject methodWithComplexJsonObjectReturn_impl([] args) {
    Anything v = delegate.methodWithComplexJsonObjectReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonArray methodWithJsonArrayReturn_impl([] args) {
    Anything v = delegate.methodWithJsonArrayReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonArray methodWithNullJsonArrayReturn_impl([] args) {
    Anything v = delegate.methodWithNullJsonArrayReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonArray methodWithComplexJsonArrayReturn_impl([] args) {
    Anything v = delegate.methodWithComplexJsonArrayReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithJsonParams_impl([JsonObject,JsonArray] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithJsonParams(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithNullJsonParams_impl([JsonObject,JsonArray] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithNullJsonParams(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerJson_impl([Anything(JsonObject),Anything(JsonArray)] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerJson(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerNullJson_impl([Anything(JsonObject),Anything(JsonArray)] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerNullJson(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerComplexJson_impl([Anything(JsonObject),Anything(JsonArray)] args) {
    Nothing arg_0 = nothing;
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithHandlerComplexJson(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultJsonObject_impl([Anything(Throwable|JsonObject)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultNullJsonObject_impl([Anything(Throwable|JsonObject)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultNullJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultComplexJsonObject_impl([Anything(Throwable|JsonObject)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultComplexJsonObject(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultJsonArray_impl([Anything(Throwable|JsonArray)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultNullJsonArray_impl([Anything(Throwable|JsonArray)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultNullJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything methodWithHandlerAsyncResultComplexJsonArray_impl([Anything(Throwable|JsonArray)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithHandlerAsyncResultComplexJsonArray(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,String> methodWithMapReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,String> methodWithMapStringReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapStringReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Integer> methodWithMapLongReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapLongReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Integer> methodWithMapIntegerReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapIntegerReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Integer> methodWithMapShortReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapShortReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Byte> methodWithMapByteReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapByteReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Character> methodWithMapCharacterReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapCharacterReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Boolean> methodWithMapBooleanReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapBooleanReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Float> methodWithMapFloatReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapFloatReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,Float> methodWithMapDoubleReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapDoubleReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,JsonObject> methodWithMapJsonObjectReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapJsonObjectReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,JsonObject> methodWithMapComplexJsonObjectReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapComplexJsonObjectReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,JsonArray> methodWithMapJsonArrayReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapJsonArrayReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,JsonArray> methodWithMapComplexJsonArrayReturn_impl([Anything(String)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.methodWithMapComplexJsonArrayReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Map<String,String> methodWithNullMapReturn_impl([] args) {
    Anything v = delegate.methodWithNullMapReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> methodWithListStringReturn_impl([] args) {
    Anything v = delegate.methodWithListStringReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<Integer> methodWithListLongReturn_impl([] args) {
    Anything v = delegate.methodWithListLongReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<RefedInterface1> methodWithListVertxGenReturn_impl([] args) {
    Anything v = delegate.methodWithListVertxGenReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<JsonObject> methodWithListJsonObjectReturn_impl([] args) {
    Anything v = delegate.methodWithListJsonObjectReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<JsonObject> methodWithListComplexJsonObjectReturn_impl([] args) {
    Anything v = delegate.methodWithListComplexJsonObjectReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<JsonArray> methodWithListJsonArrayReturn_impl([] args) {
    Anything v = delegate.methodWithListJsonArrayReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<JsonArray> methodWithListComplexJsonArrayReturn_impl([] args) {
    Anything v = delegate.methodWithListComplexJsonArrayReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> methodWithNullListReturn_impl([] args) {
    Anything v = delegate.methodWithNullListReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<String> methodWithSetStringReturn_impl([] args) {
    Anything v = delegate.methodWithSetStringReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<Integer> methodWithSetLongReturn_impl([] args) {
    Anything v = delegate.methodWithSetLongReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<RefedInterface1> methodWithSetVertxGenReturn_impl([] args) {
    Anything v = delegate.methodWithSetVertxGenReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<JsonObject> methodWithSetJsonObjectReturn_impl([] args) {
    Anything v = delegate.methodWithSetJsonObjectReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<JsonObject> methodWithSetComplexJsonObjectReturn_impl([] args) {
    Anything v = delegate.methodWithSetComplexJsonObjectReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<JsonArray> methodWithSetJsonArrayReturn_impl([] args) {
    Anything v = delegate.methodWithSetJsonArrayReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<JsonArray> methodWithSetComplexJsonArrayReturn_impl([] args) {
    Anything v = delegate.methodWithSetComplexJsonArrayReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<String> methodWithNullSetReturn_impl([] args) {
    Anything v = delegate.methodWithNullSetReturn();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String methodWithEnumParam_impl([String,String] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.methodWithEnumParam(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String methodWithEnumReturn_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.methodWithEnumReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Throwable methodWithThrowableReturn_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.methodWithThrowableReturn(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
