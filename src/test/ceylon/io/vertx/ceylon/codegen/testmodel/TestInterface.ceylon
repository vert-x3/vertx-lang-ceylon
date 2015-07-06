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

  Anything methodWithBasicParams_impl([Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) methodWithBasicParams = flatten(methodWithBasicParams_impl);

  Anything methodWithBasicBoxedParams_impl([Byte,Integer,Integer,Integer,Float,Float,Boolean,Character] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character]>) methodWithBasicBoxedParams = flatten(methodWithBasicBoxedParams_impl);

  Anything methodWithHandlerBasicTypes_impl([Anything(Byte),Anything(Integer),Anything(Integer),Anything(Integer),Anything(Float),Anything(Float),Anything(Boolean),Anything(Character),Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Byte),Anything(Integer),Anything(Integer),Anything(Integer),Anything(Float),Anything(Float),Anything(Boolean),Anything(Character),Anything(String)]>) methodWithHandlerBasicTypes = flatten(methodWithHandlerBasicTypes_impl);

  Anything methodWithHandlerAsyncResultByte_impl([Boolean,Anything(Throwable|Byte)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable|Byte)]>) methodWithHandlerAsyncResultByte = flatten(methodWithHandlerAsyncResultByte_impl);

  Anything methodWithHandlerAsyncResultShort_impl([Boolean,Anything(Throwable|Integer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultShort = flatten(methodWithHandlerAsyncResultShort_impl);

  Anything methodWithHandlerAsyncResultInteger_impl([Boolean,Anything(Throwable|Integer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultInteger = flatten(methodWithHandlerAsyncResultInteger_impl);

  Anything methodWithHandlerAsyncResultLong_impl([Boolean,Anything(Throwable|Integer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable|Integer)]>) methodWithHandlerAsyncResultLong = flatten(methodWithHandlerAsyncResultLong_impl);

  Anything methodWithHandlerAsyncResultFloat_impl([Boolean,Anything(Throwable|Float)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable|Float)]>) methodWithHandlerAsyncResultFloat = flatten(methodWithHandlerAsyncResultFloat_impl);

  Anything methodWithHandlerAsyncResultDouble_impl([Boolean,Anything(Throwable|Float)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable|Float)]>) methodWithHandlerAsyncResultDouble = flatten(methodWithHandlerAsyncResultDouble_impl);

  Anything methodWithHandlerAsyncResultBoolean_impl([Boolean,Anything(Throwable|Boolean)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable|Boolean)]>) methodWithHandlerAsyncResultBoolean = flatten(methodWithHandlerAsyncResultBoolean_impl);

  Anything methodWithHandlerAsyncResultCharacter_impl([Boolean,Anything(Throwable|Character)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable|Character)]>) methodWithHandlerAsyncResultCharacter = flatten(methodWithHandlerAsyncResultCharacter_impl);

  Anything methodWithHandlerAsyncResultString_impl([Boolean,Anything(Throwable|String)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable|String)]>) methodWithHandlerAsyncResultString = flatten(methodWithHandlerAsyncResultString_impl);

  Anything methodWithHandlerAsyncResultDataObject_impl([Boolean,Anything(Throwable|TestDataObject)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable|TestDataObject)]>) methodWithHandlerAsyncResultDataObject = flatten(methodWithHandlerAsyncResultDataObject_impl);

  Anything methodWithUserTypes_impl([RefedInterface1] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[RefedInterface1]>) methodWithUserTypes = flatten(methodWithUserTypes_impl);

  Anything methodWithObjectParam_impl([String,Object] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String,Object]>) methodWithObjectParam = flatten(methodWithObjectParam_impl);

  Anything methodWithDataObjectParam_impl([TestDataObject] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[TestDataObject]>) methodWithDataObjectParam = flatten(methodWithDataObjectParam_impl);

  Anything methodWithNullDataObjectParam_impl([TestDataObject] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[TestDataObject]>) methodWithNullDataObjectParam = flatten(methodWithNullDataObjectParam_impl);

  Anything methodWithListParams_impl([List<String>,List<Byte>,List<Integer>,List<Integer>,List<Integer>,List<JsonObject>,List<JsonArray>,List<RefedInterface1>,List<TestDataObject>] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[List<String>,List<Byte>,List<Integer>,List<Integer>,List<Integer>,List<JsonObject>,List<JsonArray>,List<RefedInterface1>,List<TestDataObject>]>) methodWithListParams = flatten(methodWithListParams_impl);

  Anything methodWithSetParams_impl([Set<String>,Set<Byte>,Set<Integer>,Set<Integer>,Set<Integer>,Set<JsonObject>,Set<JsonArray>,Set<RefedInterface1>,Set<TestDataObject>] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Set<String>,Set<Byte>,Set<Integer>,Set<Integer>,Set<Integer>,Set<JsonObject>,Set<JsonArray>,Set<RefedInterface1>,Set<TestDataObject>]>) methodWithSetParams = flatten(methodWithSetParams_impl);

  Anything methodWithMapParams_impl([Map<String,String>,Map<String,Byte>,Map<String,Integer>,Map<String,Integer>,Map<String,Integer>,Map<String,JsonObject>,Map<String,JsonArray>,Map<String,RefedInterface1>] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Map<String,String>,Map<String,Byte>,Map<String,Integer>,Map<String,Integer>,Map<String,Integer>,Map<String,JsonObject>,Map<String,JsonArray>,Map<String,RefedInterface1>]>) methodWithMapParams = flatten(methodWithMapParams_impl);

  Anything methodWithHandlerListAndSet_impl([Anything(List<String>),Anything(List<Integer>),Anything(Set<String>),Anything(Set<Integer>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<String>),Anything(List<Integer>),Anything(Set<String>),Anything(Set<Integer>)]>) methodWithHandlerListAndSet = flatten(methodWithHandlerListAndSet_impl);

  Anything methodWithHandlerAsyncResultListString_impl([Anything(Throwable|List<String>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<String>)]>) methodWithHandlerAsyncResultListString = flatten(methodWithHandlerAsyncResultListString_impl);

  Anything methodWithHandlerAsyncResultListInteger_impl([Anything(Throwable|List<Integer>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<Integer>)]>) methodWithHandlerAsyncResultListInteger = flatten(methodWithHandlerAsyncResultListInteger_impl);

  Anything methodWithHandlerAsyncResultSetString_impl([Anything(Throwable|Set<String>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<String>)]>) methodWithHandlerAsyncResultSetString = flatten(methodWithHandlerAsyncResultSetString_impl);

  Anything methodWithHandlerAsyncResultSetInteger_impl([Anything(Throwable|Set<Integer>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<Integer>)]>) methodWithHandlerAsyncResultSetInteger = flatten(methodWithHandlerAsyncResultSetInteger_impl);

  Anything methodWithHandlerListVertxGen_impl([Anything(List<RefedInterface1>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<RefedInterface1>)]>) methodWithHandlerListVertxGen = flatten(methodWithHandlerListVertxGen_impl);

  Anything methodWithHandlerSetVertxGen_impl([Anything(Set<RefedInterface1>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Set<RefedInterface1>)]>) methodWithHandlerSetVertxGen = flatten(methodWithHandlerSetVertxGen_impl);

  Anything methodWithHandlerListAbstractVertxGen_impl([Anything(List<RefedInterface2>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<RefedInterface2>)]>) methodWithHandlerListAbstractVertxGen = flatten(methodWithHandlerListAbstractVertxGen_impl);

  Anything methodWithHandlerSetAbstractVertxGen_impl([Anything(Set<RefedInterface2>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Set<RefedInterface2>)]>) methodWithHandlerSetAbstractVertxGen = flatten(methodWithHandlerSetAbstractVertxGen_impl);

  Anything methodWithHandlerListJsonObject_impl([Anything(List<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListJsonObject = flatten(methodWithHandlerListJsonObject_impl);

  Anything methodWithHandlerListNullJsonObject_impl([Anything(List<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListNullJsonObject = flatten(methodWithHandlerListNullJsonObject_impl);

  Anything methodWithHandlerListComplexJsonObject_impl([Anything(List<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<JsonObject>)]>) methodWithHandlerListComplexJsonObject = flatten(methodWithHandlerListComplexJsonObject_impl);

  Anything methodWithHandlerSetJsonObject_impl([Anything(Set<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetJsonObject = flatten(methodWithHandlerSetJsonObject_impl);

  Anything methodWithHandlerSetNullJsonObject_impl([Anything(Set<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetNullJsonObject = flatten(methodWithHandlerSetNullJsonObject_impl);

  Anything methodWithHandlerSetComplexJsonObject_impl([Anything(Set<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Set<JsonObject>)]>) methodWithHandlerSetComplexJsonObject = flatten(methodWithHandlerSetComplexJsonObject_impl);

  Anything methodWithHandlerListJsonArray_impl([Anything(List<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListJsonArray = flatten(methodWithHandlerListJsonArray_impl);

  Anything methodWithHandlerListNullJsonArray_impl([Anything(List<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListNullJsonArray = flatten(methodWithHandlerListNullJsonArray_impl);

  Anything methodWithHandlerListComplexJsonArray_impl([Anything(List<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<JsonArray>)]>) methodWithHandlerListComplexJsonArray = flatten(methodWithHandlerListComplexJsonArray_impl);

  Anything methodWithHandlerSetJsonArray_impl([Anything(Set<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetJsonArray = flatten(methodWithHandlerSetJsonArray_impl);

  Anything methodWithHandlerSetNullJsonArray_impl([Anything(Set<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetNullJsonArray = flatten(methodWithHandlerSetNullJsonArray_impl);

  Anything methodWithHandlerSetComplexJsonArray_impl([Anything(Set<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Set<JsonArray>)]>) methodWithHandlerSetComplexJsonArray = flatten(methodWithHandlerSetComplexJsonArray_impl);

  Anything methodWithHandlerListDataObject_impl([Anything(List<TestDataObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<TestDataObject>)]>) methodWithHandlerListDataObject = flatten(methodWithHandlerListDataObject_impl);

  Anything methodWithHandlerListNullDataObject_impl([Anything(List<TestDataObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(List<TestDataObject>)]>) methodWithHandlerListNullDataObject = flatten(methodWithHandlerListNullDataObject_impl);

  Anything methodWithHandlerSetDataObject_impl([Anything(Set<TestDataObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Set<TestDataObject>)]>) methodWithHandlerSetDataObject = flatten(methodWithHandlerSetDataObject_impl);

  Anything methodWithHandlerSetNullDataObject_impl([Anything(Set<TestDataObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Set<TestDataObject>)]>) methodWithHandlerSetNullDataObject = flatten(methodWithHandlerSetNullDataObject_impl);

  Anything methodWithHandlerAsyncResultListVertxGen_impl([Anything(Throwable|List<RefedInterface1>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<RefedInterface1>)]>) methodWithHandlerAsyncResultListVertxGen = flatten(methodWithHandlerAsyncResultListVertxGen_impl);

  Anything methodWithHandlerAsyncResultSetVertxGen_impl([Anything(Throwable|Set<RefedInterface1>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<RefedInterface1>)]>) methodWithHandlerAsyncResultSetVertxGen = flatten(methodWithHandlerAsyncResultSetVertxGen_impl);

  Anything methodWithHandlerAsyncResultListAbstractVertxGen_impl([Anything(Throwable|List<RefedInterface2>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<RefedInterface2>)]>) methodWithHandlerAsyncResultListAbstractVertxGen = flatten(methodWithHandlerAsyncResultListAbstractVertxGen_impl);

  Anything methodWithHandlerAsyncResultSetAbstractVertxGen_impl([Anything(Throwable|Set<RefedInterface2>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<RefedInterface2>)]>) methodWithHandlerAsyncResultSetAbstractVertxGen = flatten(methodWithHandlerAsyncResultSetAbstractVertxGen_impl);

  Anything methodWithHandlerAsyncResultListJsonObject_impl([Anything(Throwable|List<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListJsonObject = flatten(methodWithHandlerAsyncResultListJsonObject_impl);

  Anything methodWithHandlerAsyncResultListNullJsonObject_impl([Anything(Throwable|List<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListNullJsonObject = flatten(methodWithHandlerAsyncResultListNullJsonObject_impl);

  Anything methodWithHandlerAsyncResultListComplexJsonObject_impl([Anything(Throwable|List<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<JsonObject>)]>) methodWithHandlerAsyncResultListComplexJsonObject = flatten(methodWithHandlerAsyncResultListComplexJsonObject_impl);

  Anything methodWithHandlerAsyncResultSetJsonObject_impl([Anything(Throwable|Set<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetJsonObject = flatten(methodWithHandlerAsyncResultSetJsonObject_impl);

  Anything methodWithHandlerAsyncResultSetNullJsonObject_impl([Anything(Throwable|Set<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetNullJsonObject = flatten(methodWithHandlerAsyncResultSetNullJsonObject_impl);

  Anything methodWithHandlerAsyncResultSetComplexJsonObject_impl([Anything(Throwable|Set<JsonObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<JsonObject>)]>) methodWithHandlerAsyncResultSetComplexJsonObject = flatten(methodWithHandlerAsyncResultSetComplexJsonObject_impl);

  Anything methodWithHandlerAsyncResultListJsonArray_impl([Anything(Throwable|List<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListJsonArray = flatten(methodWithHandlerAsyncResultListJsonArray_impl);

  Anything methodWithHandlerAsyncResultListNullJsonArray_impl([Anything(Throwable|List<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListNullJsonArray = flatten(methodWithHandlerAsyncResultListNullJsonArray_impl);

  Anything methodWithHandlerAsyncResultListComplexJsonArray_impl([Anything(Throwable|List<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<JsonArray>)]>) methodWithHandlerAsyncResultListComplexJsonArray = flatten(methodWithHandlerAsyncResultListComplexJsonArray_impl);

  Anything methodWithHandlerAsyncResultSetJsonArray_impl([Anything(Throwable|Set<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetJsonArray = flatten(methodWithHandlerAsyncResultSetJsonArray_impl);

  Anything methodWithHandlerAsyncResultSetNullJsonArray_impl([Anything(Throwable|Set<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetNullJsonArray = flatten(methodWithHandlerAsyncResultSetNullJsonArray_impl);

  Anything methodWithHandlerAsyncResultSetComplexJsonArray_impl([Anything(Throwable|Set<JsonArray>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<JsonArray>)]>) methodWithHandlerAsyncResultSetComplexJsonArray = flatten(methodWithHandlerAsyncResultSetComplexJsonArray_impl);

  Anything methodWithHandlerAsyncResultListDataObject_impl([Anything(Throwable|List<TestDataObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<TestDataObject>)]>) methodWithHandlerAsyncResultListDataObject = flatten(methodWithHandlerAsyncResultListDataObject_impl);

  Anything methodWithHandlerAsyncResultListNullDataObject_impl([Anything(Throwable|List<TestDataObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|List<TestDataObject>)]>) methodWithHandlerAsyncResultListNullDataObject = flatten(methodWithHandlerAsyncResultListNullDataObject_impl);

  Anything methodWithHandlerAsyncResultSetDataObject_impl([Anything(Throwable|Set<TestDataObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<TestDataObject>)]>) methodWithHandlerAsyncResultSetDataObject = flatten(methodWithHandlerAsyncResultSetDataObject_impl);

  Anything methodWithHandlerAsyncResultSetNullDataObject_impl([Anything(Throwable|Set<TestDataObject>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Set<TestDataObject>)]>) methodWithHandlerAsyncResultSetNullDataObject = flatten(methodWithHandlerAsyncResultSetNullDataObject_impl);

  Anything methodWithHandlerUserTypes_impl([Anything(RefedInterface1)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(RefedInterface1)]>) methodWithHandlerUserTypes = flatten(methodWithHandlerUserTypes_impl);

  Anything methodWithHandlerAsyncResultUserTypes_impl([Anything(Throwable|RefedInterface1)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|RefedInterface1)]>) methodWithHandlerAsyncResultUserTypes = flatten(methodWithHandlerAsyncResultUserTypes_impl);

  Anything methodWithConcreteHandlerUserTypeSubtype_impl([ConcreteHandlerUserType] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[ConcreteHandlerUserType]>) methodWithConcreteHandlerUserTypeSubtype = flatten(methodWithConcreteHandlerUserTypeSubtype_impl);

  Anything methodWithAbstractHandlerUserTypeSubtype_impl([AbstractHandlerUserType] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[AbstractHandlerUserType]>) methodWithAbstractHandlerUserTypeSubtype = flatten(methodWithAbstractHandlerUserTypeSubtype_impl);

  Anything methodWithConcreteHandlerUserTypeSubtypeExtension_impl([ConcreteHandlerUserTypeExtension] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[ConcreteHandlerUserTypeExtension]>) methodWithConcreteHandlerUserTypeSubtypeExtension = flatten(methodWithConcreteHandlerUserTypeSubtypeExtension_impl);

  Anything methodWithHandlerVoid_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything()]>) methodWithHandlerVoid = flatten(methodWithHandlerVoid_impl);

  Anything methodWithHandlerAsyncResultVoid_impl([Boolean,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Boolean,Anything(Throwable?)]>) methodWithHandlerAsyncResultVoid = flatten(methodWithHandlerAsyncResultVoid_impl);

  Anything methodWithHandlerThrowable_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable)]>) methodWithHandlerThrowable = flatten(methodWithHandlerThrowable_impl);

  Anything methodWithHandlerDataObject_impl([Anything(TestDataObject)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(TestDataObject)]>) methodWithHandlerDataObject = flatten(methodWithHandlerDataObject_impl);

  Anything methodWithHandlerGenericUserType_impl([Object,Anything(GenericRefedInterface<Object>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Object,Anything(GenericRefedInterface<Object>)]>) methodWithHandlerGenericUserType = flatten(methodWithHandlerGenericUserType_impl);

  Anything methodWithHandlerAsyncResultGenericUserType_impl([Object,Anything(Throwable|GenericRefedInterface<Object>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Object,Anything(Throwable|GenericRefedInterface<Object>)]>) methodWithHandlerAsyncResultGenericUserType = flatten(methodWithHandlerAsyncResultGenericUserType_impl);

  Byte methodWithByteReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Byte(*<[]>) methodWithByteReturn = flatten(methodWithByteReturn_impl);

  Integer methodWithShortReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) methodWithShortReturn = flatten(methodWithShortReturn_impl);

  Integer methodWithIntReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) methodWithIntReturn = flatten(methodWithIntReturn_impl);

  Integer methodWithLongReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) methodWithLongReturn = flatten(methodWithLongReturn_impl);

  Float methodWithFloatReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Float(*<[]>) methodWithFloatReturn = flatten(methodWithFloatReturn_impl);

  Float methodWithDoubleReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Float(*<[]>) methodWithDoubleReturn = flatten(methodWithDoubleReturn_impl);

  Boolean methodWithBooleanReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) methodWithBooleanReturn = flatten(methodWithBooleanReturn_impl);

  Character methodWithCharReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Character(*<[]>) methodWithCharReturn = flatten(methodWithCharReturn_impl);

  String methodWithStringReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) methodWithStringReturn = flatten(methodWithStringReturn_impl);

  RefedInterface1 methodWithVertxGenReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  RefedInterface1(*<[]>) methodWithVertxGenReturn = flatten(methodWithVertxGenReturn_impl);

  RefedInterface1 methodWithVertxGenNullReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  RefedInterface1(*<[]>) methodWithVertxGenNullReturn = flatten(methodWithVertxGenNullReturn_impl);

  RefedInterface2 methodWithAbstractVertxGenReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  RefedInterface2(*<[]>) methodWithAbstractVertxGenReturn = flatten(methodWithAbstractVertxGenReturn_impl);

  String overloadedMethod_impl([String,Anything(String)]|[String,RefedInterface1]|[String,RefedInterface1,Anything(String)]|[String,RefedInterface1,Integer,Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String,Anything(String)]|[String,RefedInterface1]|[String,RefedInterface1,Anything(String)]|[String,RefedInterface1,Integer,Anything(String)]>) overloadedMethod = flatten(overloadedMethod_impl);

  Object methodWithGenericReturn_impl([String] args) {
    throw Exception("implement me");
  }

  shared  Object(*<[String]>) methodWithGenericReturn = flatten(methodWithGenericReturn_impl);

  Anything methodWithGenericParam_impl([String,Object] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String,Object]>) methodWithGenericParam = flatten(methodWithGenericParam_impl);

  Anything methodWithGenericHandler_impl([String,Anything(Object)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String,Anything(Object)]>) methodWithGenericHandler = flatten(methodWithGenericHandler_impl);

  Anything methodWithGenericHandlerAsyncResult_impl([String,Anything(Throwable|Object)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String,Anything(Throwable|Object)]>) methodWithGenericHandlerAsyncResult = flatten(methodWithGenericHandlerAsyncResult_impl);

  TestInterface fluentMethod_impl([String] args) {
    throw Exception("implement me");
  }

  shared  TestInterface(*<[String]>) fluentMethod = flatten(fluentMethod_impl);

  RefedInterface1 methodWithCachedReturn_impl([String] args) {
    throw Exception("implement me");
  }

  shared  RefedInterface1(*<[String]>) methodWithCachedReturn = flatten(methodWithCachedReturn_impl);

  Integer methodWithCachedReturnPrimitive_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[Integer]>) methodWithCachedReturnPrimitive = flatten(methodWithCachedReturnPrimitive_impl);

  JsonObject methodWithJsonObjectReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  JsonObject(*<[]>) methodWithJsonObjectReturn = flatten(methodWithJsonObjectReturn_impl);

  JsonObject methodWithNullJsonObjectReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  JsonObject(*<[]>) methodWithNullJsonObjectReturn = flatten(methodWithNullJsonObjectReturn_impl);

  JsonObject methodWithComplexJsonObjectReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  JsonObject(*<[]>) methodWithComplexJsonObjectReturn = flatten(methodWithComplexJsonObjectReturn_impl);

  JsonArray methodWithJsonArrayReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  JsonArray(*<[]>) methodWithJsonArrayReturn = flatten(methodWithJsonArrayReturn_impl);

  JsonArray methodWithNullJsonArrayReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  JsonArray(*<[]>) methodWithNullJsonArrayReturn = flatten(methodWithNullJsonArrayReturn_impl);

  JsonArray methodWithComplexJsonArrayReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  JsonArray(*<[]>) methodWithComplexJsonArrayReturn = flatten(methodWithComplexJsonArrayReturn_impl);

  Anything methodWithJsonParams_impl([JsonObject,JsonArray] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[JsonObject,JsonArray]>) methodWithJsonParams = flatten(methodWithJsonParams_impl);

  Anything methodWithNullJsonParams_impl([JsonObject,JsonArray] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[JsonObject,JsonArray]>) methodWithNullJsonParams = flatten(methodWithNullJsonParams_impl);

  Anything methodWithHandlerJson_impl([Anything(JsonObject),Anything(JsonArray)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerJson = flatten(methodWithHandlerJson_impl);

  Anything methodWithHandlerNullJson_impl([Anything(JsonObject),Anything(JsonArray)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerNullJson = flatten(methodWithHandlerNullJson_impl);

  Anything methodWithHandlerComplexJson_impl([Anything(JsonObject),Anything(JsonArray)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(JsonObject),Anything(JsonArray)]>) methodWithHandlerComplexJson = flatten(methodWithHandlerComplexJson_impl);

  Anything methodWithHandlerAsyncResultJsonObject_impl([Anything(Throwable|JsonObject)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultJsonObject = flatten(methodWithHandlerAsyncResultJsonObject_impl);

  Anything methodWithHandlerAsyncResultNullJsonObject_impl([Anything(Throwable|JsonObject)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultNullJsonObject = flatten(methodWithHandlerAsyncResultNullJsonObject_impl);

  Anything methodWithHandlerAsyncResultComplexJsonObject_impl([Anything(Throwable|JsonObject)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|JsonObject)]>) methodWithHandlerAsyncResultComplexJsonObject = flatten(methodWithHandlerAsyncResultComplexJsonObject_impl);

  Anything methodWithHandlerAsyncResultJsonArray_impl([Anything(Throwable|JsonArray)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultJsonArray = flatten(methodWithHandlerAsyncResultJsonArray_impl);

  Anything methodWithHandlerAsyncResultNullJsonArray_impl([Anything(Throwable|JsonArray)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultNullJsonArray = flatten(methodWithHandlerAsyncResultNullJsonArray_impl);

  Anything methodWithHandlerAsyncResultComplexJsonArray_impl([Anything(Throwable|JsonArray)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|JsonArray)]>) methodWithHandlerAsyncResultComplexJsonArray = flatten(methodWithHandlerAsyncResultComplexJsonArray_impl);

  Map<String,String> methodWithMapReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,String>(*<[Anything(String)]>) methodWithMapReturn = flatten(methodWithMapReturn_impl);

  Map<String,String> methodWithMapStringReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,String>(*<[Anything(String)]>) methodWithMapStringReturn = flatten(methodWithMapStringReturn_impl);

  Map<String,Integer> methodWithMapLongReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,Integer>(*<[Anything(String)]>) methodWithMapLongReturn = flatten(methodWithMapLongReturn_impl);

  Map<String,Integer> methodWithMapIntegerReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,Integer>(*<[Anything(String)]>) methodWithMapIntegerReturn = flatten(methodWithMapIntegerReturn_impl);

  Map<String,Integer> methodWithMapShortReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,Integer>(*<[Anything(String)]>) methodWithMapShortReturn = flatten(methodWithMapShortReturn_impl);

  Map<String,Byte> methodWithMapByteReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,Byte>(*<[Anything(String)]>) methodWithMapByteReturn = flatten(methodWithMapByteReturn_impl);

  Map<String,Character> methodWithMapCharacterReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,Character>(*<[Anything(String)]>) methodWithMapCharacterReturn = flatten(methodWithMapCharacterReturn_impl);

  Map<String,Boolean> methodWithMapBooleanReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,Boolean>(*<[Anything(String)]>) methodWithMapBooleanReturn = flatten(methodWithMapBooleanReturn_impl);

  Map<String,Float> methodWithMapFloatReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,Float>(*<[Anything(String)]>) methodWithMapFloatReturn = flatten(methodWithMapFloatReturn_impl);

  Map<String,Float> methodWithMapDoubleReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,Float>(*<[Anything(String)]>) methodWithMapDoubleReturn = flatten(methodWithMapDoubleReturn_impl);

  Map<String,JsonObject> methodWithMapJsonObjectReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,JsonObject>(*<[Anything(String)]>) methodWithMapJsonObjectReturn = flatten(methodWithMapJsonObjectReturn_impl);

  Map<String,JsonObject> methodWithMapComplexJsonObjectReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,JsonObject>(*<[Anything(String)]>) methodWithMapComplexJsonObjectReturn = flatten(methodWithMapComplexJsonObjectReturn_impl);

  Map<String,JsonArray> methodWithMapJsonArrayReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,JsonArray>(*<[Anything(String)]>) methodWithMapJsonArrayReturn = flatten(methodWithMapJsonArrayReturn_impl);

  Map<String,JsonArray> methodWithMapComplexJsonArrayReturn_impl([Anything(String)] args) {
    throw Exception("implement me");
  }

  shared  Map<String,JsonArray>(*<[Anything(String)]>) methodWithMapComplexJsonArrayReturn = flatten(methodWithMapComplexJsonArrayReturn_impl);

  Map<String,String> methodWithNullMapReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Map<String,String>(*<[]>) methodWithNullMapReturn = flatten(methodWithNullMapReturn_impl);

  List<String> methodWithListStringReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  List<String>(*<[]>) methodWithListStringReturn = flatten(methodWithListStringReturn_impl);

  List<Integer> methodWithListLongReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  List<Integer>(*<[]>) methodWithListLongReturn = flatten(methodWithListLongReturn_impl);

  List<RefedInterface1> methodWithListVertxGenReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  List<RefedInterface1>(*<[]>) methodWithListVertxGenReturn = flatten(methodWithListVertxGenReturn_impl);

  List<JsonObject> methodWithListJsonObjectReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  List<JsonObject>(*<[]>) methodWithListJsonObjectReturn = flatten(methodWithListJsonObjectReturn_impl);

  List<JsonObject> methodWithListComplexJsonObjectReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  List<JsonObject>(*<[]>) methodWithListComplexJsonObjectReturn = flatten(methodWithListComplexJsonObjectReturn_impl);

  List<JsonArray> methodWithListJsonArrayReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  List<JsonArray>(*<[]>) methodWithListJsonArrayReturn = flatten(methodWithListJsonArrayReturn_impl);

  List<JsonArray> methodWithListComplexJsonArrayReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  List<JsonArray>(*<[]>) methodWithListComplexJsonArrayReturn = flatten(methodWithListComplexJsonArrayReturn_impl);

  List<String> methodWithNullListReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  List<String>(*<[]>) methodWithNullListReturn = flatten(methodWithNullListReturn_impl);

  Set<String> methodWithSetStringReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Set<String>(*<[]>) methodWithSetStringReturn = flatten(methodWithSetStringReturn_impl);

  Set<Integer> methodWithSetLongReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Set<Integer>(*<[]>) methodWithSetLongReturn = flatten(methodWithSetLongReturn_impl);

  Set<RefedInterface1> methodWithSetVertxGenReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Set<RefedInterface1>(*<[]>) methodWithSetVertxGenReturn = flatten(methodWithSetVertxGenReturn_impl);

  Set<JsonObject> methodWithSetJsonObjectReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Set<JsonObject>(*<[]>) methodWithSetJsonObjectReturn = flatten(methodWithSetJsonObjectReturn_impl);

  Set<JsonObject> methodWithSetComplexJsonObjectReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Set<JsonObject>(*<[]>) methodWithSetComplexJsonObjectReturn = flatten(methodWithSetComplexJsonObjectReturn_impl);

  Set<JsonArray> methodWithSetJsonArrayReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Set<JsonArray>(*<[]>) methodWithSetJsonArrayReturn = flatten(methodWithSetJsonArrayReturn_impl);

  Set<JsonArray> methodWithSetComplexJsonArrayReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Set<JsonArray>(*<[]>) methodWithSetComplexJsonArrayReturn = flatten(methodWithSetComplexJsonArrayReturn_impl);

  Set<String> methodWithNullSetReturn_impl([] args) {
    throw Exception("implement me");
  }

  shared  Set<String>(*<[]>) methodWithNullSetReturn = flatten(methodWithNullSetReturn_impl);

  String methodWithEnumParam_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String,String]>) methodWithEnumParam = flatten(methodWithEnumParam_impl);

  String methodWithEnumReturn_impl([String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String]>) methodWithEnumReturn = flatten(methodWithEnumReturn_impl);

  Throwable methodWithThrowableReturn_impl([String] args) {
    throw Exception("implement me");
  }

  shared  Throwable(*<[String]>) methodWithThrowableReturn = flatten(methodWithThrowableReturn_impl);

}
