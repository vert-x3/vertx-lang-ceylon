import io.vertx.ceylon.codegen.testmodel {
  TestInterface, RefedInterface1, TestDataObject
}
import io.vertx.codegen.testmodel {
  TestInterfaceImpl, RefedInterface1Impl
}
import ceylon.test {
  test, assertEquals, assertTrue
}
import ceylon.json {
  JsonObject=Object, JsonArray=Array
}

TestInterface obj = TestInterface(TestInterfaceImpl());

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

shared test void testDataObjectParam() {
  value dataObject = TestDataObject {
    foo="hello";
    bar=123;
    wibble=1.23;
  };
  obj.methodWithDataObjectParam(dataObject);
}

shared test void testNullDataObjectParam() {
  obj.methodWithNullDataObjectParam(null);
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

void assertFloatEquals(Float actual, Float expected) {
  variable value diff = expected - actual;
  if (diff < 0.float) {
    diff -= diff;
  }
  assertTrue(diff < 0.0001);
}