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

shared test void testListStringReturn() {
  value list = obj.methodWithListStringReturn();
  assertEquals(list.size, 3);
  assertEquals(list[0], "foo");
  assertEquals(list[1], "bar");
  assertEquals(list[2], "wibble");
}

shared test void testListLongReturn() {
  value list = obj.methodWithListLongReturn();
  assertEquals(list.size, 2);
  assertEquals(list[0], 123);
  assertEquals(list[1], 456);
}

shared test void testListJsonObjectReturn() {
  value list = obj.methodWithListJsonObjectReturn();
  assertEquals(list.size, 2);
  assertEquals(list[0], JsonObject { "foo"->"bar" });
  assertEquals(list[1], JsonObject { "blah"->"eek" });
}

shared test void testListComplexJsonObjectReturn() {
  value list = obj.methodWithListComplexJsonObjectReturn();
  assertEquals(list.size, 1);
  assertEquals(list[0], JsonObject {
    "outer"->JsonObject {
      "socks"->"tartan"
    },
    "list"->JsonArray {
      "yellow",
      "blue"
    }
  });
}

shared test void testListJsonArrayReturn() {
  value list = obj.methodWithListJsonArrayReturn();
  assertEquals(list.size, 2);
  assertEquals(list[0], JsonArray { "foo" });
  assertEquals(list[1], JsonArray { "blah" });
}

shared test void testListComplexJsonArrayReturn() {
  value list = obj.methodWithListComplexJsonArrayReturn();
  assertEquals(list.size, 2);
  assertEquals(list[0], JsonArray { JsonObject { "foo"->"hello" } });
  assertEquals(list[1], JsonArray { JsonObject { "bar"->"bye" } });
}

shared test void testListVertxGenReturn() {
  value list = obj.methodWithListVertxGenReturn();
  assertEquals(list.size, 2);
  value refed1 = list[0];
  assert(is RefedInterface1 refed1);
  assertEquals(refed1.getString(), "foo");
  value refed2 = list[1];
  assert(is RefedInterface1 refed2);
  assertEquals(refed2.getString(), "bar");
}

shared test void testListDataObjectReturn() {
  value list = obj.methodWithListDataObjectReturn();
  assertEquals(list.size, 2);
  value obj1 = list[0];
  assert(is TestDataObject obj1);
  assertEquals(obj1.foo, "String 1");
  assertEquals(obj1.bar, 1);
  assertFloatEquals(obj1.wibble, 1.1);
  value obj2 = list[1];
  assert(is TestDataObject obj2);
  assertEquals(obj2.foo, "String 2");
  assertEquals(obj2.bar, 2);
  assertFloatEquals(obj2.wibble, 2.2);
}

shared test void testSetStringReturn() {
  value set = obj.methodWithSetStringReturn();
  assertEquals(set.size, 3);
  assertTrue(set.contains("foo"));
  assertTrue(set.contains("bar"));
  assertTrue(set.contains("wibble"));
}

shared test void testSetLongReturn() {
  value set = obj.methodWithSetLongReturn();
  assertEquals(set.size, 2);
  assertTrue(set.contains(123));
  assertTrue(set.contains(456));
}

shared test void testSetJsonObjectReturn() {
  value set = obj.methodWithSetJsonObjectReturn();
  assertEquals(set.size, 2);
  assertTrue(set.contains(JsonObject { "foo"->"bar" }));
  assertTrue(set.contains(JsonObject { "blah"->"eek" }));
}

shared test void testSetComplexJsonObjectReturn() {
  value set = obj.methodWithSetComplexJsonObjectReturn();
  assertEquals(set.size, 1);
  assertTrue(set.contains(JsonObject {
    "outer"->JsonObject { "socks"->"tartan" },
    "list"->JsonArray { "yellow", "blue" }
    }));
}

shared test void testSetJsonArrayReturn() {
  value set = obj.methodWithSetJsonArrayReturn();
  assertEquals(set.size, 2);
  assertTrue(set.contains(JsonArray { "foo" }));
  assertTrue(set.contains(JsonArray { "blah" }));
}

shared test void testSetComplexJsonArrayReturn() {
  value set = obj.methodWithSetComplexJsonArrayReturn();
  assertEquals(set.size, 2);
  assertTrue(set.contains(JsonArray { JsonObject { "foo"->"hello" }}));
  assertTrue(set.contains(JsonArray { JsonObject { "bar"->"bye" } }));
}

shared test void testSetVertxGenReturn() {
  value set = obj.methodWithSetVertxGenReturn();
  assertEquals(set.size, 2);
  assert(is RefedInterface1 f=set.first);
  assert(is RefedInterface1 l=set.last);
  if (f.getString() == "foo") {
    assertEquals(l.getString(), "bar");
  } else {
    assertEquals(f.getString(), "bar");
    assertEquals(l.getString(), "foo");
  }
}

shared test void testSetDataObjectReturn() {
  value set = obj.methodWithSetDataObjectReturn();
  assertEquals(set.size, 2);
  assert(is TestDataObject f=set.first);
  assert(is TestDataObject l=set.last);
  JsonObject j1 = f.toJson();
  JsonObject j2 = l.toJson();
  if (is String val = j1["foo"], val == "String 1") {
    assertEquals(j1["bar"], 1);
    assertFloatEquals(j1["wibble"], 1.1);
    assertEquals(j2["foo"], "String 2");
    assertEquals(j2["bar"], 2);
    assertFloatEquals(j2["wibble"], 2.2);
  } else {
    assertEquals(j1["foo"], "String 2");
    assertEquals(j1["bar"], 2);
    assertFloatEquals(j1["wibble"], 2.2);
    assertEquals(j2["foo"], "String 1");
    assertEquals(j2["bar"], 1);
    assertFloatEquals(j2["wibble"], 1.1);
  }
}

void assertFloatEquals(Anything actual, Float expected) {
  assert(is Float actual);
  variable value diff = expected - actual;
  if (diff < 0.float) {
    diff -= diff;
  }
  assertTrue(diff < 0.0001);
}