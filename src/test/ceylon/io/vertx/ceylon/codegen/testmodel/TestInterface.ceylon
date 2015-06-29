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
  RefedInterface2
}
/* Generated from io.vertx.codegen.testmodel.TestInterface */
shared class TestInterface() extends SuperInterface1 satisfies SuperInterface2 {
  shared default void otherSuperMethodWithBasicParams() {
    /* [io.vertx.codegen.testmodel.SuperInterface2] */
  }
  shared default void methodWithBasicParams() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithBasicBoxedParams() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerBasicTypes() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultByte() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultShort() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultInteger() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultLong() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultFloat() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultDouble() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultBoolean() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultCharacter() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultString() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultDataObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithUserTypes() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithObjectParam() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithDataObjectParam() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithNullDataObjectParam() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithListParams() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithSetParams() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapParams() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListAndSet() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListString() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListInteger() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetString() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetInteger() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListVertxGen() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerSetVertxGen() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListAbstractVertxGen() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerSetAbstractVertxGen() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListNullJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListComplexJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerSetJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerSetNullJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerSetComplexJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListNullJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListComplexJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerSetJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerSetNullJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerSetComplexJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListDataObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerListNullDataObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerSetDataObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerSetNullDataObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListVertxGen() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetVertxGen() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListAbstractVertxGen() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetAbstractVertxGen() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListNullJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListComplexJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetNullJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetComplexJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListNullJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListComplexJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetNullJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetComplexJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListDataObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultListNullDataObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetDataObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultSetNullDataObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerUserTypes() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultUserTypes() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithConcreteHandlerUserTypeSubtype() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithAbstractHandlerUserTypeSubtype() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithConcreteHandlerUserTypeSubtypeExtension() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerVoid() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultVoid() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerThrowable() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerDataObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerGenericUserType() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultGenericUserType() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithByteReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithShortReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithIntReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithLongReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithFloatReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithDoubleReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithBooleanReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithCharReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithStringReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithVertxGenReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithVertxGenNullReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithAbstractVertxGenReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void overloadedMethod() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithGenericReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithGenericParam() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithGenericHandler() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithGenericHandlerAsyncResult() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void fluentMethod() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithCachedReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithCachedReturnPrimitive() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithJsonObjectReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithNullJsonObjectReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithComplexJsonObjectReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithJsonArrayReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithNullJsonArrayReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithComplexJsonArrayReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithJsonParams() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithNullJsonParams() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerJson() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerNullJson() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerComplexJson() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultNullJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultComplexJsonObject() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultNullJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithHandlerAsyncResultComplexJsonArray() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapStringReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapLongReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapIntegerReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapShortReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapByteReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapCharacterReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapBooleanReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapFloatReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapDoubleReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapJsonObjectReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapComplexJsonObjectReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapJsonArrayReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithMapComplexJsonArrayReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithNullMapReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithListStringReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithListLongReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithListVertxGenReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithListJsonObjectReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithListComplexJsonObjectReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithListJsonArrayReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithListComplexJsonArrayReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithNullListReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithSetStringReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithSetLongReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithSetVertxGenReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithSetJsonObjectReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithSetComplexJsonObjectReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithSetJsonArrayReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithSetComplexJsonArrayReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithNullSetReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithEnumParam() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithEnumReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
  shared default void methodWithThrowableReturn() {
    /* [io.vertx.codegen.testmodel.TestInterface] */
  }
}
