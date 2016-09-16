import io.vertx.ceylon.testmodel {
  TestInterface, RefedInterface1, RefedInterface2, TestDataObject,
  Factory, factory, testInterface, AbstractHandlerUserType, ConcreteHandlerUserType, ConcreteHandlerUserTypeExtension,
  GenericRefedInterface, TestGenEnum, mike, bob, leland
}
import io.vertx.codegen.testmodel {
  TestInterfaceImpl, RefedInterface1Impl
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

TestInterface obj = TestInterface(TestInterfaceImpl());

Comparison comparingRefedInterface1(RefedInterface1 x, RefedInterface1 y) {
  return x.getString().compare(y.getString());
}

Comparison comparingRefedInterface2(RefedInterface2 x, RefedInterface2 y) {
  return x.getString().compare(y.getString());
}

Comparison comparingTestDataObject(TestDataObject x, TestDataObject y) {
  assert(exists a=x.foo);
  assert(exists b=y.foo);
  return a.compare(b);
}

shared test void testMethodWithBasicParams() {
  obj.methodWithBasicParams(123.byte, 12345, 1234567, 1265615234, 12.345, 12.34566, true, 'X', "foobar");
}

shared test void testMethodWithBasicBoxedParams() {
  value obj = TestInterface(TestInterfaceImpl());
  obj.methodWithBasicBoxedParams(123.byte, 12345, 1234567, 1265615234, 12.345, 12.34566, true, 'X');
}

shared test void testMethodWithHandlerBasicTypes() {
  variable Integer count = 0;
  void byte_function(Byte val) {
    assertEquals(val, 123.byte);
    count++;
  }
  void short_function(Integer val) {
    assertEquals(val, 12345);
    count++;
  }
  void integer_function(Integer val) {
    assertEquals(val, 1234567);
    count++;
  }
  void long_function(Integer val) {
    assertEquals(val, 1265615234);
    count++;
  }
  void float_function(Float val) {
    assertFloatEquals(val, 12.345);
    count++;
  }
  void double_function(Float val) {
    assertFloatEquals(val, 12.34566);
    count++;
  }
  void boolean_function(Boolean val) {
    assertEquals(val, true);
    count++;
  }
  void character_function(Character val) {
    assertEquals(val, 'X');
    count++;
  }
  void string_function(String val) {
    assertEquals(val, "quux!");
    count++;
  }
  obj.methodWithHandlerBasicTypes(
    byte_function,
    short_function,
    integer_function,
    long_function,
    float_function,
    double_function,
    boolean_function,
    character_function,
    string_function);
  assertEquals(count, 9);
}

shared test void testMethodWithHandlerAsyncResultBasicTypes() {
  variable Integer count = 0;
  void function_succeeded<T>(T expected)(T|Throwable result) {
    if (is T result) {
      assertEquals(result, expected);
      count++;
    }
  }
  void float_function_succeeded(Float expected)(Float|Throwable result) {
    if (is Float result) {
      assertFloatEquals(result, expected);
      count++;
    }
  }
  obj.methodWithHandlerAsyncResultByte(false, function_succeeded<Byte>(123.byte));
  obj.methodWithHandlerAsyncResultShort(false, function_succeeded<Integer>(12345));
  obj.methodWithHandlerAsyncResultInteger(false, function_succeeded<Integer>(1234567));
  obj.methodWithHandlerAsyncResultLong(false, function_succeeded<Integer>(1265615234));
  obj.methodWithHandlerAsyncResultFloat(false, float_function_succeeded(12.345));
  obj.methodWithHandlerAsyncResultDouble(false, float_function_succeeded(12.34566));
  obj.methodWithHandlerAsyncResultBoolean(false, function_succeeded<Boolean>(true));
  obj.methodWithHandlerAsyncResultCharacter(false, function_succeeded<Character>('X'));
  obj.methodWithHandlerAsyncResultString(false, function_succeeded<String>("quux!"));
  assertEquals(count, 9);
  void function_fail<T>(T|Throwable result) {
    if (is Throwable result) {
      assertEquals("foobar!", result.message);
      count++;
    }
  }
  obj.methodWithHandlerAsyncResultByte(true, function_fail<Byte>);
  obj.methodWithHandlerAsyncResultShort(true, function_fail<Integer>);
  obj.methodWithHandlerAsyncResultInteger(true, function_fail<Integer>);
  obj.methodWithHandlerAsyncResultLong(true, function_fail<Integer>);
  obj.methodWithHandlerAsyncResultFloat(true, function_fail<Float>);
  obj.methodWithHandlerAsyncResultDouble(true, function_fail<Float>);
  obj.methodWithHandlerAsyncResultBoolean(true, function_fail<Boolean>);
  obj.methodWithHandlerAsyncResultCharacter(true, function_fail<Character>);
  obj.methodWithHandlerAsyncResultString(true, function_fail<String>);
  assertEquals(count, 18);
}

shared test void testMethodWithUserTypes() {
  value refed = RefedInterface1(RefedInterface1Impl());
  refed.setString("aardvarks");
  obj.methodWithUserTypes(refed);
}

shared test void testObjectParam() {
  obj.methodWithObjectParam("null", null);
  obj.methodWithObjectParam("string", "wibble");
  obj.methodWithObjectParam("true", true);
  obj.methodWithObjectParam("false", false);
  obj.methodWithObjectParam("long", 123);
  obj.methodWithObjectParam("double", 123.456);
  obj.methodWithObjectParam("JsonObject", JsonObject { "foo"->"hello", "bar"->123 });
  obj.methodWithObjectParam("JsonArray", JsonArray { "foo", "bar", "wib" });
}

shared test void testMethodWithHandlerDataObject() {
  variable TestDataObject? tmp = null;
  void callback(TestDataObject obj) {
    tmp = obj;
  }
  obj.methodWithHandlerDataObject(callback);
  assert(exists o = tmp);
  assertEquals(o.foo, "foo");
  assertEquals(o.bar, 123);
}

shared test void testMethodWithHandlerAsyncResultDataObject() {
  variable TestDataObject|Throwable|Null tmp = null;
  void callback(TestDataObject|Throwable result) {
    tmp = result;
  }
  obj.methodWithHandlerAsyncResultDataObject(false, callback);
  assert(is TestDataObject o = tmp);
  assertEquals(o.foo, "foo");
  assertEquals(o.bar, 123);
  obj.methodWithHandlerAsyncResultDataObject(true, callback);
  assert(is Throwable t = tmp);
  assertEquals(t.message, "foobar!");
}

shared test void testMethodWithHandlerStringReturn() {
  Anything(String) handler = obj.methodWithHandlerStringReturn("the-result");
  handler("the-result");
  variable Boolean failed = false;
  try {
    handler("not-expected");
  } catch (Throwable err) {
    failed = true;
  }
  assertTrue(failed);
}

shared test void testMethodWithHandlerGenericReturn() {
  variable Anything result = null;
  void callback<T>(T? r) {
    result = r;
  }
  obj.methodWithHandlerGenericReturn<String>(callback)("string-result");
  assertEquals(result, "string-result");
  obj.methodWithHandlerGenericReturn<TestInterface>(callback)(obj);
  assertEquals(result, obj);
}

shared test void testMethodWithHandlerAsyncResultStringReturn() {
  Anything(String|Throwable) succeedingHandler = obj.methodWithHandlerAsyncResultStringReturn("the-result", false);
  succeedingHandler("the-result");
  variable Boolean failed = false;
  try {
    succeedingHandler("not-expected");
  } catch (Throwable err) {
    failed = true;
  }
  assertTrue(failed);
  Anything(String|Throwable) failingHandler = obj.methodWithHandlerAsyncResultStringReturn("an-error", true);
  failingHandler(Exception("an-error"));
  failed = false;
  try {
    failingHandler("not-expected");
  } catch (Throwable err) {
    failed = true;
  }
  assertTrue(failed);
}

shared test void testMethodWithHandlerAsyncResultGenericReturn() {
  variable Anything result = null;
  void callback<T>(T?|Throwable r) {
    result = r;
  }
  obj.methodWithHandlerAsyncResultGenericReturn<String>(callback)("string-result");
  assertEquals(result, "string-result");
  obj.methodWithHandlerAsyncResultGenericReturn<TestInterface>(callback)(obj);
  assertEquals(result, obj);
}

shared test void testMethodWithHandlerUserTypes() {
  variable RefedInterface1? val = null;
  obj.methodWithHandlerUserTypes((RefedInterface1 arg) => val=arg);
  assert(exists u=val);
  assertEquals(u.getString(), "echidnas");
}

shared test void testMethodWithHandlerAsyncResultUserTypes() {
  variable RefedInterface1|Throwable|Null val = null;
  obj.methodWithHandlerAsyncResultUserTypes((RefedInterface1|Throwable arg) => val=arg);
  assert(is RefedInterface1 u=val);
  assertEquals(u.getString(), "cheetahs");
}

shared test void testMethodWithConcreteHandlerUserTypesSubtype() {
  variable RefedInterface1? val = null;
  ConcreteHandlerUserType sub = factory.createConcreteHandlerUserType((RefedInterface1 arg) => val=arg);
  obj.methodWithConcreteHandlerUserTypeSubtype(sub);
  assert(exists u=val);
  assertEquals(u.getString(), "echidnas");
}

shared test void testMethodWithAbstractHandlerUserTypesSubtype() {
  variable RefedInterface1? val = null;
  AbstractHandlerUserType sub = factory.createAbstractHandlerUserType((RefedInterface1 arg) => val=arg);
  obj.methodWithAbstractHandlerUserTypeSubtype(sub);
  assert(exists u=val);
  assertEquals(u.getString(), "echidnas");
}

shared test void testMethodWithConcreteHandlerUserTypesSubtypeExtension() {
  variable RefedInterface1? val = null;
  ConcreteHandlerUserTypeExtension sub = factory.createConcreteHandlerUserTypeExtension((RefedInterface1 arg) => val=arg);
  obj.methodWithConcreteHandlerUserTypeSubtypeExtension(sub);
  assert(exists u=val);
  assertEquals(u.getString(), "echidnas");
}

shared test void testMethodWithHandlerVoid() {
  variable Integer count = 0;
  obj.methodWithHandlerVoid(() => count++);
  assertEquals(count, 1);
}

shared test void testMethodWithHandlerAsyncResultVoid() {
  value arg = ArrayList<Throwable?>();
  obj.methodWithHandlerAsyncResultVoid(false, arg.add);
  assertEquals(arg.size, 1);
  assertEquals(arg[0], null);
}

shared test void testMethodWithHandlerAsyncResultVoidFails() {
  value arg = ArrayList<Throwable?>();
  obj.methodWithHandlerAsyncResultVoid(true, arg.add);
  assertEquals(arg.size, 1);
  assert(exists err=arg[0]);
  assertEquals(err.message, "foo!");
}

shared test void testMethodWithHandlerThrowable() {
  variable Throwable? err = null;
  obj.methodWithHandlerThrowable((Throwable arg) => err=arg);
  assert(exists val=err);
  assertEquals(val.message, "cheese!");
}

shared test void testMethodWithHandlerGenericUserType() {
  variable GenericRefedInterface<String>? gen = null;
  obj.methodWithHandlerGenericUserType<String>("string_value", (GenericRefedInterface<String> arg) => gen=arg);
  assert(is GenericRefedInterface<String> val=gen);
  assertEquals(val.getValue(), "string_value");
}

shared test void testMethodWithHandlerAsyncResultGenericUserType() {
  variable GenericRefedInterface<String>|Throwable|Null gen = null;
  obj.methodWithHandlerGenericUserType<String>("string_value_2", (GenericRefedInterface<String>?|Throwable arg) => gen=arg);
  assert(is GenericRefedInterface<String> val=gen);
  assertEquals(val.getValue(), "string_value_2");
}

shared test void testMethodWithGenericParam() {
  obj.methodWithGenericParam("String", "foo");
  obj.methodWithGenericParam("Boolean", true);
  obj.methodWithGenericParam("Byte", 123.byte);
  obj.methodWithGenericParam("Character", 'x');
  obj.methodWithGenericParam("Long", 1265615234);
  obj.methodWithGenericParam("Double", 12.34566);
  obj.methodWithGenericParam("Ref", RefedInterface1Impl().setString("bar"));
  obj.methodWithGenericParam("JsonObject", JsonObject { "foo"->"hello", "bar"->123 });
  obj.methodWithGenericParam("JsonObjectComplex", JsonObject { "outer" -> JsonObject { "foo"->"hello" }, "bar" -> JsonArray { "this", "that" } });
  obj.methodWithGenericParam("JsonArray", JsonArray { "foo", "bar", "wib" });
}

shared test void testMethodWithGenericHandler() {
  void test<T>(String type, T expected, void compare(Object actual, T expected) => assertEquals(actual, expected)) {
    variable Object? val = null;
    obj.methodWithGenericHandler<Object>(type, (Object? result) => val = result);
    assert(exists actual = val);
    compare(actual, expected);
  }
  test("Ref", RefedInterface1Impl().setString("bar"));
  test("String", "foo");
  test("JsonObject", JsonObject { "foo"->"hello", "bar"->123 });
  test("JsonObjectComplex", JsonObject { "outer" -> JsonObject { "foo"->"hello" }, "bar" -> JsonArray { "this", "that" } });
  test("JsonArray", JsonArray { "foo","bar","wib" });
  test("Boolean", true);
  test("Byte", 123.byte);
  test("Short", 12345);
  test("Integer", 1234567);
  test("Long", 1265615234);
  test("Character", 'x');
  test<Float>("Double", 12.34566, (expected, actual) => { assertFloatEquals(expected, actual) });
  test<Float>("Float", 12.345, (expected, actual) => { assertFloatEquals(expected, actual) });
}

shared test void testMethodWithGenericHandlerAsyncResult() {
  void test<T>(String type, T expected, void compare(Object actual, T expected) => assertEquals(actual, expected)) {
    variable Object|Throwable|Null val = null;
    obj.methodWithGenericHandlerAsyncResult<Object>(type, (Object?|Throwable result) => val = result);
    assert(exists actual = val);
    compare(actual, expected);
  }
  test("Ref", RefedInterface1Impl().setString("bar"));
  test("String", "foo");
  test("JsonObject", JsonObject { "foo"->"hello", "bar"->123 });
  test("JsonObjectComplex", JsonObject { "outer" -> JsonObject { "foo"->"hello" }, "bar" -> JsonArray { "this", "that" } });
  test("JsonArray", JsonArray { "foo","bar","wib" });
  test("Boolean", true);
  test("Byte", 123.byte);
  test("Short", 12345);
  test("Integer", 1234567);
  test("Long", 1265615234);
  test("Character", 'x');
  test<Float>("Double", 12.34566, (expected, actual) => { assertFloatEquals(expected, actual) });
  test<Float>("Float", 12.345, (expected, actual) => { assertFloatEquals(expected, actual) });
}

shared test void testBasicReturns() {
  assertEquals(obj.methodWithByteReturn(), 123.byte);
  assertEquals(obj.methodWithShortReturn(), 12345);
  assertEquals(obj.methodWithIntReturn(), 12345464);
  assertEquals(obj.methodWithLongReturn(), 65675123);
  assertFloatEquals(obj.methodWithFloatReturn(), 1.23);
  assertFloatEquals(obj.methodWithDoubleReturn(), 3.34535);
  assertEquals(obj.methodWithBooleanReturn(), true);
  assertEquals(obj.methodWithCharReturn(), 'Y');
  assertEquals(obj.methodWithStringReturn(), "orangutan");
}

shared test void testVertxGenReturn() {
  value r = obj.methodWithVertxGenReturn();
  assertEquals(r.getString(), "chaffinch");
}

shared test void testVertxAbstractGenReturn() {
  value r = obj.methodWithAbstractVertxGenReturn();
  assertEquals(r.getString(), "abstractchaffinch");
}

shared test void testDataObjectReturn() {
  value r = obj.methodWithDataObjectReturn();
  assertEquals(r.foo, "foo");
  assertEquals(r.bar, 123);
}

shared test void testOverloadedMethods() {
  value refed = RefedInterface1(RefedInterface1Impl());
  refed.setString("dog");
  assertEquals(obj.overloadedMethod("cat", refed), "meth1");
  variable String? callback = null;
  assertEquals(obj.overloadedMethod("cat", refed, 12345, (String arg) => callback = arg), "meth2");
  assertEquals(callback, "giraffe");
  callback = null;
  assertEquals(obj.overloadedMethod("cat", (String arg) => callback = arg), "meth3");
  assertEquals(callback, "giraffe");
  callback = null;
  assertEquals(obj.overloadedMethod("cat", refed, (String arg) => callback = arg), "meth4");
  assertEquals(callback, "giraffe");
}

shared test void testSuperInterfaces() {
  obj.superMethodWithBasicParams(123.byte, 12345, 1234567, 1265615234, 12.345, 12.34566, true, 'X', "foobar");
  obj.otherSuperMethodWithBasicParams(123.byte, 12345, 1234567, 1265615234, 12.345, 12.34566, true, 'X', "foobar");
}

shared test void testMethodWithGenericReturn() {
  value jsonObject = obj.methodWithGenericReturn<JsonObject>("JsonObject");
  assertEquals(jsonObject, JsonObject { "foo"->"hello", "bar"->123 });
  value jsonArray = obj.methodWithGenericReturn<JsonArray>("JsonArray");
  assertEquals(jsonArray, JsonArray { "foo", "bar", "wib" });
}

shared test void testFluentMethod() {
  value ret = obj.fluentMethod("bar");
  assertEquals(ret, obj);
}

shared test void testStaticFactoryMethod() {
  value ret = testInterface.staticFactoryMethod("bar");
  assertEquals(ret.getString(), "bar");
}

shared test void testMethodWithCachedReturn() {
  value ret1 = obj.methodWithCachedReturn("bar");
  assertEquals(ret1.getString(), "bar");
  value ret2 = obj.methodWithCachedReturn("bar");
  assertEquals(ret2, ret1);
  value ret3 = obj.methodWithCachedReturn("bar");
  assertEquals(ret3, ret1);
}

shared test void testJsonReturns() {
  assertEquals(obj.methodWithJsonObjectReturn(), JsonObject { "cheese"->"stilton" });
  assertEquals(obj.methodWithJsonArrayReturn(), JsonArray { "socks", "shoes" });
}

shared test void testComplexJsonReturns() {
  assertEquals(obj.methodWithComplexJsonObjectReturn(), JsonObject { "outer"->JsonObject { "socks"->"tartan" }, "list"->JsonArray { "yellow", "blue" } });
  assertEquals(obj.methodWithComplexJsonArrayReturn(), JsonArray { JsonObject { "foo"->"hello" }, JsonObject { "bar"->"bye" } });
}

shared test void testJsonParams() {
  obj.methodWithJsonParams(JsonObject { "cat"->"lion", "cheese"->"cheddar" }, JsonArray { "house", "spider" });
}

shared test void testJsonHandlerParams() {
  variable JsonObject? jsonObject = null;
  variable JsonArray? jsonArray = null;
  obj.methodWithHandlerJson((JsonObject arg) => jsonObject = arg, (JsonArray arg) => jsonArray = arg);
  assertEquals(jsonObject, JsonObject { "cheese"->"stilton" });
  assertEquals(jsonArray, JsonArray { "socks", "shoes" });
}

shared test void testComplexJsonHandlerParams() {
  variable JsonObject? jsonObject = null;
  variable JsonArray? jsonArray = null;
  obj.methodWithHandlerComplexJson((JsonObject arg) => jsonObject = arg, (JsonArray arg) => jsonArray = arg);
  assertEquals(jsonObject, JsonObject { "outer" -> JsonObject { "socks"->"tartan" }, "list" -> JsonArray { "yellow", "blue" } });
  assertEquals(jsonArray, JsonArray { JsonArray { JsonObject { "foo"->"hello" } }, JsonArray {  JsonObject { "bar"->"bye" } } });
}

shared test void testJsonHandlerAsyncResultParams() {
  variable JsonObject|Throwable|Null jsonObject = null;
  variable JsonArray|Throwable|Null jsonArray = null;
  obj.methodWithHandlerAsyncResultJsonObject((JsonObject|Throwable arg) => jsonObject = arg);
  obj.methodWithHandlerAsyncResultJsonArray((JsonArray|Throwable arg) => jsonArray = arg);
  assertEquals(jsonObject, JsonObject { "cheese"->"stilton" });
  assertEquals(jsonArray, JsonArray { "socks", "shoes" });
}

shared test void testComplexJsonHandlerAsyncResultParams() {
  variable JsonObject|Throwable|Null jsonObject = null;
  variable JsonArray|Throwable|Null jsonArray = null;
  obj.methodWithHandlerAsyncResultComplexJsonObject((JsonObject|Throwable arg) => jsonObject = arg);
  obj.methodWithHandlerAsyncResultComplexJsonArray((JsonArray|Throwable arg) => jsonArray = arg);
  assertEquals(jsonObject, JsonObject { "outer" -> JsonObject { "socks"->"tartan" }, "list" -> JsonArray { "yellow", "blue" } });
  assertEquals(jsonArray, JsonArray { JsonObject { "foo"->"hello" },  JsonObject { "bar"->"bye" } });
}

shared test void testMethodWithEnumParam() {
  value ret = obj.methodWithEnumParam("cabbages", "JULIEN");
  assertEquals(ret, "cabbagesJULIEN");
}

shared test void testMethodWithGenEnumParam() {
  value ret = obj.methodWithGenEnumParam("cabbages", mike);
  assertEquals(ret, "cabbagesMIKE");
}

shared test void testMethodWithEnumReturn() {
  value ret = obj.methodWithEnumReturn("JULIEN");
  assertEquals(ret, "JULIEN");
}

shared test void testMethodWithGenEnumReturn() {
  value ret = obj.methodWithGenEnumReturn("BOB");
  assertEquals(ret, bob);
}

shared test void testMethodWithThrowableReturn() {
  value ret = obj.methodWithThrowableReturn("wibble");
  assertEquals("wibble", ret.message);
}

shared test void testMethodWithThrowableParam() {
  value ret = obj.methodWithThrowableParam(Exception("eek"));
  assertEquals("eek", ret);
}

"Test that HttpServerOptions properly serialize to and deserialize from json"
shared test void testHttpServerOptionsJson() {
  value options = HttpServerOptions {
    compressionSupported = true;
    ssl = true;
    sendBufferSize = 65000;
  };
  value json = options.toJson();
  value actualOptions = httpServerOptions.fromJson(json);
  assertEquals(actualOptions.compressionSupported, options.compressionSupported);
  assertEquals(actualOptions.ssl, options.ssl);
  assertEquals(actualOptions.sendBufferSize, options.sendBufferSize);
}

void assertTestDataObjectEquals(Anything actual, Anything expected) {
  assert(is TestDataObject actual);
  assert(is TestDataObject expected);
  assertEquals(actual.foo, expected.foo);
  assertEquals(actual.bar, expected.bar);
  assertEquals(actual.wibble, expected.wibble);
}

void assertRefedInterface1Equals(Anything actual, Anything expected) {
  assert(is RefedInterface1 actual);
  assert(is RefedInterface1 expected);
  assertEquals(actual.getString(), expected.getString());
}

void assertFloatEquals(Anything actual, Anything expected) {
  assert(is Float actual);
  assert(is Float expected);
  variable value diff = expected - actual;
  if (diff < 0.float) {
    diff -= diff;
  }
  assertTrue(diff < 0.0001);
}
