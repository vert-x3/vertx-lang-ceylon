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
shared abstract class TestInterface() extends SuperInterface1() satisfies SuperInterface2 {
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
