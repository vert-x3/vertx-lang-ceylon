import io.vertx.ceylon.testmodel {
  GenericsTCK, RefedInterface1, RefedInterface2, TestDataObject,
  Factory, factory, testInterface, AbstractHandlerUserType, ConcreteHandlerUserType, ConcreteHandlerUserTypeExtension,
  GenericRefedInterface, TestGenEnum, mike, bob, leland
}
import io.vertx.codegen.testmodel {
  RefedInterface1Impl, GenericsTCKImpl
}
import ceylon.test {
  test, assertEquals, assertTrue, assertNull, assertNotNull
}
import ceylon.json {
  JsonObject=Object, JsonArray=Array
}
import ceylon.collection {
  HashSet, ArrayList, HashMap
}
import io.vertx.ceylon.core.http {
  HttpServerOptions, httpServerOptions
}

GenericsTCK genericsTCK = GenericsTCK(GenericsTCKImpl());
variable Integer callbacks = 0;

shared void checkParameterized<T>(GenericRefedInterface<T> refed, T expected, T next, Callable<Anything, [Anything, Anything]> asserter = assertEquals) {
  asserter(expected, refed.getValue());
  refed.setValue(next);
  asserter(next, refed.getValue());
}

shared Anything(GenericRefedInterface<T>) parameterizedChecker<T>(T expected, T next, Callable<Anything, [Anything, Anything]> asserter = assertEquals) {
  void f(GenericRefedInterface<T> refed) {
    checkParameterized(refed, expected, next, asserter);
    callbacks++;
  }
  return f;
}

shared Anything(GenericRefedInterface<T>|Throwable) parameterizedAsyncResultChecker<T>(T expected, T next, Callable<Anything, [Anything, Anything]> asserter = assertEquals) {
  void f(GenericRefedInterface<T>|Throwable refed) {
    assert(is GenericRefedInterface<T> refed);
    checkParameterized(refed, expected, next, asserter);
    callbacks++;
  }
  return f;
}

shared test void testMethodWithBasicParameterizedReturn() {
  checkParameterized(genericsTCK.methodWithByteParameterizedReturn(), 123.byte, 124.byte);
  checkParameterized(genericsTCK.methodWithShortParameterizedReturn(), 1234, 12345);
  checkParameterized(genericsTCK.methodWithIntegerParameterizedReturn(), 123456, 1234567);
  checkParameterized(genericsTCK.methodWithLongParameterizedReturn(), 123456789, 1234567890);
  checkParameterized(genericsTCK.methodWithFloatParameterizedReturn(), 0.34, 0.35, assertFloatEquals);
  checkParameterized(genericsTCK.methodWithDoubleParameterizedReturn(), 0.314, 0.315, assertFloatEquals);
  checkParameterized(genericsTCK.methodWithBooleanParameterizedReturn(), true, false);
  checkParameterized(genericsTCK.methodWithCharacterParameterizedReturn(), 'F', 'G');
  checkParameterized(genericsTCK.methodWithStringParameterizedReturn(), "zoumbawe", "agowae");
}

shared test void testMethodWithHandlerBasicParameterized() {
  callbacks = 0;
  genericsTCK.methodWithHandlerByteParameterized(parameterizedChecker(123.byte, 124.byte));
  genericsTCK.methodWithHandlerShortParameterized(parameterizedChecker(1234, 12345));
  genericsTCK.methodWithHandlerIntegerParameterized(parameterizedChecker(123456, 1234567));
  genericsTCK.methodWithHandlerLongParameterized(parameterizedChecker(123456789, 1234567890));
  genericsTCK.methodWithHandlerFloatParameterized(parameterizedChecker(0.34, 0.35, assertFloatEquals));
  genericsTCK.methodWithHandlerDoubleParameterized(parameterizedChecker(0.314, 0.315, assertFloatEquals));
  genericsTCK.methodWithHandlerBooleanParameterized(parameterizedChecker(true, false));
  genericsTCK.methodWithHandlerCharacterParameterized(parameterizedChecker('F', 'G'));
  genericsTCK.methodWithHandlerStringParameterized(parameterizedChecker("zoumbawe", "agowae"));
  assertEquals(9, callbacks);
}

shared test void testMethodWithHandlerAsyncResultBasicParameterized() {
  callbacks = 0;
  genericsTCK.methodWithHandlerAsyncResultByteParameterized(parameterizedAsyncResultChecker(123.byte, 124.byte));
  genericsTCK.methodWithHandlerAsyncResultShortParameterized(parameterizedAsyncResultChecker(1234, 12345));
  genericsTCK.methodWithHandlerAsyncResultIntegerParameterized(parameterizedAsyncResultChecker(123456, 1234567));
  genericsTCK.methodWithHandlerAsyncResultLongParameterized(parameterizedAsyncResultChecker(123456789, 1234567890));
  genericsTCK.methodWithHandlerAsyncResultFloatParameterized(parameterizedAsyncResultChecker(0.34, 0.35, assertFloatEquals));
  genericsTCK.methodWithHandlerAsyncResultDoubleParameterized(parameterizedAsyncResultChecker(0.314, 0.315, assertFloatEquals));
  genericsTCK.methodWithHandlerAsyncResultBooleanParameterized(parameterizedAsyncResultChecker(true, false));
  genericsTCK.methodWithHandlerAsyncResultCharacterParameterized(parameterizedAsyncResultChecker('F', 'G'));
  genericsTCK.methodWithHandlerAsyncResultStringParameterized(parameterizedAsyncResultChecker("zoumbawe", "agowae"));
  assertEquals(9, callbacks);
}

shared test void testMethodWithJsonObjectParameterizedReturn() {
  checkParameterized(genericsTCK.methodWithJsonObjectParameterizedReturn(), JsonObject { "cheese"->"stilton" }, JsonObject { "cheese"->"roquefort" });
  checkParameterized(genericsTCK.methodWithJsonArrayParameterizedReturn(), JsonArray { "cheese", "stilton" }, JsonArray { "cheese", "roquefort" });
}

shared test void testMethodWithHandlerJsonObjectParameterized() {
  callbacks = 0;
  genericsTCK.methodWithHandlerJsonObjectParameterized(parameterizedChecker(JsonObject { "cheese"->"stilton" }, JsonObject { "cheese"->"roquefort" }));
  genericsTCK.methodWithHandlerJsonArrayParameterized(parameterizedChecker(JsonArray { "cheese", "stilton" }, JsonArray { "cheese", "roquefort" }));
  assertEquals(2, callbacks);
}

shared test void testMethodWithHandlerAsyncResultJsonObjectParameterized() {
  callbacks = 0;
  genericsTCK.methodWithHandlerAsyncResultJsonObjectParameterized(parameterizedAsyncResultChecker(JsonObject { "cheese"->"stilton" }, JsonObject { "cheese"->"roquefort" }));
  genericsTCK.methodWithHandlerAsyncResultJsonArrayParameterized(parameterizedAsyncResultChecker(JsonArray { "cheese", "stilton" }, JsonArray { "cheese", "roquefort" }));
  assertEquals(2, callbacks);
}

shared test void testMethodWithDataObjectParameterizedReturn() {
  checkParameterized(genericsTCK.methodWithDataObjectParameterizedReturn(), TestDataObject { bar = 123456; wibble = 3.14; foo = "foo_value"; }, TestDataObject { bar = 1234567; wibble = 3.141; foo = "other_value"; }, assertTestDataObjectEquals);
}

shared test void testMethodWithHandlerDataObjectParameterized() {
  callbacks = 0;
  genericsTCK.methodWithHandlerDataObjectParameterized(parameterizedChecker(TestDataObject { bar = 123456; wibble = 3.14; foo = "foo_value"; }, TestDataObject { bar = 1234567; wibble = 3.141; foo = "other_value"; }, assertTestDataObjectEquals));
  assertEquals(1, callbacks);
}

shared test void testMethodWithHandlerAsyncResultDataObjectParameterized() {
  callbacks = 0;
  genericsTCK.methodWithHandlerAsyncResultDataObjectParameterized(parameterizedAsyncResultChecker(TestDataObject { bar = 123456; wibble = 3.14; foo = "foo_value"; }, TestDataObject { bar = 1234567; wibble = 3.141; foo = "other_value"; }, assertTestDataObjectEquals));
  assertEquals(1, callbacks);
}

shared test void testMethodWithEnumParameterizedReturn() {
  checkParameterized(genericsTCK.methodWithEnumParameterizedReturn(), "WESTON", "TIM");
  checkParameterized(genericsTCK.methodWithGenEnumParameterizedReturn(), leland, bob);
}

shared test void testMethodWithHandlerEnumParameterized() {
  callbacks = 0;
  genericsTCK.methodWithHandlerEnumParameterized(parameterizedChecker("WESTON", "TIM"));
  genericsTCK.methodWithHandlerGenEnumParameterized(parameterizedChecker(leland, bob));
  assertEquals(2, callbacks);
}

shared test void testMethodWithHandlerAsyncResultEnumParameterized() {
  callbacks = 0;
  genericsTCK.methodWithHandlerAsyncResultEnumParameterized(parameterizedAsyncResultChecker("WESTON", "TIM"));
  genericsTCK.methodWithHandlerAsyncResultGenEnumParameterized(parameterizedAsyncResultChecker(leland, bob));
  assertEquals(2, callbacks);
}

shared test void testMethodWithUserTypeParameterizedReturn() {
  checkMethodWithUserTypeParameterized(genericsTCK.methodWithUserTypeParameterizedReturn());
}

shared test void testMethodWithHandlerUserTypeParameterized() {
  callbacks = 0;
  genericsTCK.methodWithHandlerUserTypeParameterized {
    void handler(GenericRefedInterface<RefedInterface1> ret) {
      checkMethodWithUserTypeParameterized(ret);
      callbacks++;
    }
  };
  assertEquals(1, callbacks);
}

shared test void testMethodWithHandlerAsyncResultUserTypeParameterized() {
  callbacks = 0;
  genericsTCK.methodWithHandlerAsyncResultUserTypeParameterized {
    void handler(GenericRefedInterface<RefedInterface1>|Throwable ret) {
      assert(is GenericRefedInterface<RefedInterface1> ret);
      checkMethodWithUserTypeParameterized(ret);
      callbacks++;
    }
  };
  assertEquals(1, callbacks);
}

void checkMethodWithUserTypeParameterized(GenericRefedInterface<RefedInterface1> ret) {
  value val = ret.getValue();
  assertEquals("foo", val.getString());
  value refed = RefedInterface1(RefedInterface1Impl());
  refed.setString("the_string");
  ret.setValue(refed);
  value val2 = ret.getValue();
  assertEquals("the_string", val2.getString());
}

shared test void testMethodWithClassTypeParameterizedReturn() {
  checkParameterized(genericsTCK.methodWithClassTypeParameterizedReturn<Byte>(), 123.byte, 124.byte);
  checkParameterized(genericsTCK.methodWithClassTypeParameterizedReturn<Integer>(), 123456789, 1234567890);
  checkParameterized(genericsTCK.methodWithClassTypeParameterizedReturn<Float>(), 0.314, 0.3146);
  checkParameterized(genericsTCK.methodWithClassTypeParameterizedReturn<Boolean>(), true, false);
  checkParameterized(genericsTCK.methodWithClassTypeParameterizedReturn<Character>(), 'F', 'G');
  checkParameterized(genericsTCK.methodWithClassTypeParameterizedReturn<String>(), "zoumbawe", "agowae");
  checkParameterized(genericsTCK.methodWithClassTypeParameterizedReturn<JsonObject>(), JsonObject { "cheese"->"stilton" }, JsonObject { "wine"->"condrieu" });
  checkParameterized(genericsTCK.methodWithClassTypeParameterizedReturn<JsonArray>(), JsonArray { "cheese", "stilton" }, JsonArray { "wine", "condrieu" });
  value ret = genericsTCK.methodWithClassTypeParameterizedReturn<RefedInterface1>();
  value val = ret.getValue();
  assert(exists val);
  assertEquals("foo", val.getString());
}

shared test void testMethodWithHandlerClassTypeParameterized() {
  variable Integer count = 0;
  void check1(GenericRefedInterface<RefedInterface1?> ret) {
    value val = ret.getValue();
    assert(exists val);
    assertEquals("foo", val.getString());
    value refed = RefedInterface1(RefedInterface1Impl());
    refed.setString("the_string");
    ret.setValue(refed);
    count++;
  }
  genericsTCK.methodWithHandlerClassTypeParameterized<RefedInterface1>(check1);
  void check2(GenericRefedInterface<JsonObject?> ret) {
    value val = ret.getValue();
    assert(exists val);
    assertEquals(JsonObject { "cheese"->"stilton" }, val);
    ret.setValue(JsonObject { "wine"->"condrieu" });
    assertEquals(JsonObject { "wine"->"condrieu" }, ret.getValue());
    count++;
  }
  genericsTCK.methodWithHandlerClassTypeParameterized<JsonObject>(check2);
  assertEquals(2, count);
}

shared test void testInterfaceWithStringArg() {
  value ret = genericsTCK.interfaceWithStringArg("the_string_value");
  value val = ret.getValue();
  assertEquals("the_string_value", val);
}

shared test void testInterfaceWithVariableArg() {
  value refed = RefedInterface1(RefedInterface1Impl());
  refed.setString("the_string");
  value ret = genericsTCK.interfaceWithVariableArg("whatever", refed);
  value val = ret.getValue();
  assert(exists val);
  assertEquals("the_string", val.getString());

  value ret2 = genericsTCK.interfaceWithVariableArg("whatever", "the_string_arg");
  value val2 = ret2.getValue();
  assert(exists val2);
  assertEquals("the_string_arg", val2);
}

shared test void testInterfaceWithApiArg() {
  value refed = RefedInterface1(RefedInterface1Impl());
  refed.setString("the_string");
  value ret = genericsTCK.interfaceWithApiArg(refed);
  value val = ret.getValue();
  assertEquals("the_string", val.getString());
}
