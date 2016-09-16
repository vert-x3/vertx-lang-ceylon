import io.vertx.ceylon.testmodel {
  CollectionTCK, RefedInterface1, RefedInterface2, TestDataObject,
  Factory, factory, testInterface, AbstractHandlerUserType, ConcreteHandlerUserType, ConcreteHandlerUserTypeExtension,
  GenericRefedInterface, TestGenEnum, mike, bob, leland
}
import io.vertx.codegen.testmodel {
  RefedInterface1Impl, CollectionTCKImpl
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

CollectionTCK collectionTCK = CollectionTCK(CollectionTCKImpl());

shared test void testMethodWithHandlerListAndSet() {
  variable List<String>? arg0 = null;
  variable List<Integer>? arg1 = null;
  variable Set<String>? arg2 = null;
  variable Set<Integer>? arg3 = null;
  collectionTCK.methodWithHandlerListAndSet(
    (List<String> arg) => arg0 = arg,
    (List<Integer> arg) => arg1 = arg,
    (Set<String> arg) => arg2 = arg,
    (Set<Integer> arg) => arg3 = arg);
  assertEquals(arg0, ArrayList { "foo", "bar", "wibble" });
  assertEquals(arg1, ArrayList { 5, 12, 100 });
  assertEquals(arg2, HashSet { "foo", "bar", "wibble" });
  assertEquals(arg3, HashSet { 5, 12, 100 });
}

shared test void testMethodWithHandlerAsyncResultListAndSet() {
  variable List<String>|Throwable|Null arg0 = null;
  variable List<Integer>|Throwable|Null arg1 = null;
  variable Set<String>|Throwable|Null arg2 = null;
  variable Set<Integer>|Throwable|Null arg3 = null;
  collectionTCK.methodWithHandlerAsyncResultListString((List<String>|Throwable arg) => arg0 = arg);
  collectionTCK.methodWithHandlerAsyncResultListInteger((List<Integer>|Throwable arg) => arg1 = arg);
  collectionTCK.methodWithHandlerAsyncResultSetString((Set<String>|Throwable arg) => arg2 = arg);
  collectionTCK.methodWithHandlerAsyncResultSetInteger((Set<Integer>|Throwable arg) => arg3 = arg);
  assertEquals(arg0, ArrayList { "foo", "bar", "wibble" });
  assertEquals(arg1, ArrayList { 5, 12, 100 });
  assertEquals(arg2, HashSet { "foo", "bar", "wibble" });
  assertEquals(arg3, HashSet { 5, 12, 100 });
}

shared test void testMethodWithHandlerListVertxGen() {
  variable List<RefedInterface1>|Null arg = null;
  collectionTCK.methodWithHandlerListVertxGen((List<RefedInterface1> arg_) => arg=arg_);
  assert(is List<RefedInterface1> val=arg);
  assertEquals(val.size, 2);
  assert(exists v0=val[0]);
  assertEquals(v0.getString(), "foo");
  assert(exists v1=val[1]);
  assertEquals(v1.getString(), "bar");
}

shared test void testMethodWithHandlerListAbstractVertxGen() {
  variable List<RefedInterface2>|Null arg = null;
  collectionTCK.methodWithHandlerListAbstractVertxGen((List<RefedInterface2> arg_) => arg=arg_);
  assert(is List<RefedInterface2> val=arg);
  assertEquals(val.size, 2);
  assert(exists v0=val[0]);
  assertEquals(v0.getString(), "abstractfoo");
  assert(exists v1=val[1]);
  assertEquals(v1.getString(), "abstractbar");
}

shared test void testMethodWithHandlerAsyncResultListVertxGen() {
  variable List<RefedInterface1>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultListVertxGen((List<RefedInterface1>|Throwable arg_) => arg=arg_);
  assert(is List<RefedInterface1> val=arg);
  assertEquals(val.size, 2);
  assert(exists v0=val[0]);
  assertEquals(v0.getString(), "foo");
  assert(exists v1=val[1]);
  assertEquals(v1.getString(), "bar");
}

shared test void testMethodWithHandlerAsyncResultListAbstractVertxGen() {
  variable List<RefedInterface2>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultListAbstractVertxGen((List<RefedInterface2>|Throwable arg_) => arg=arg_);
  assert(is List<RefedInterface2> val=arg);
  assertEquals(val.size, 2);
  assert(exists v0=val[0]);
  assertEquals(v0.getString(), "abstractfoo");
  assert(exists v1=val[1]);
  assertEquals(v1.getString(), "abstractbar");
}

shared test void testMethodWithHandlerSetVertxGen() {
  variable RefedInterface1[]|Null arg = null;
  collectionTCK.methodWithHandlerSetVertxGen((Set<RefedInterface1> arg_) => arg=arg_.sort(comparingRefedInterface1));
  assert(is RefedInterface1[] val=arg);
  assertEquals(val.size, 2);
  assert(exists v0=val[0]);
  assertEquals(v0.getString(), "bar");
  assert(exists v1=val[1]);
  assertEquals(v1.getString(), "foo");
}

shared test void testMethodWithHandlerSetAbstractVertxGen() {
  variable RefedInterface2[]|Null arg = null;
  collectionTCK.methodWithHandlerSetAbstractVertxGen((Set<RefedInterface2> arg_) => arg=arg_.sort(comparingRefedInterface2));
  assert(is RefedInterface2[] val=arg);
  assertEquals(val.size, 2);
  assert(exists v0=val[0]);
  assertEquals(v0.getString(), "abstractbar");
  assert(exists v1=val[1]);
  assertEquals(v1.getString(), "abstractfoo");
}

shared test void testMethodWithHandlerAsyncResultSetVertxGen() {
  variable Set<RefedInterface1>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultSetVertxGen((Set<RefedInterface1>|Throwable arg_) => arg=arg_);
  assert(is Set<RefedInterface1> tmp = arg);
  value val = tmp.sort(comparingRefedInterface1);
  assertEquals(val.size, 2);
  assert(exists v0=val[0]);
  assertEquals(v0.getString(), "bar");
  assert(exists v1=val[1]);
  assertEquals(v1.getString(), "foo");
}

shared test void testMethodWithHandlerAsyncResultSetAbstractVertxGen() {
  variable Set<RefedInterface2>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultSetAbstractVertxGen((Set<RefedInterface2>|Throwable arg_) => arg=arg_);
  assert(is Set<RefedInterface2> tmp = arg);
  value val = tmp.sort(comparingRefedInterface2);
  assertEquals(val.size, 2);
  assert(exists v0=val[0]);
  assertEquals(v0.getString(), "abstractbar");
  assert(exists v1=val[1]);
  assertEquals(v1.getString(), "abstractfoo");
}

shared test void testMethodWithHandlerListJsonObject() {
  variable List<JsonObject>|Null arg = null;
  collectionTCK.methodWithHandlerListJsonObject((List<JsonObject> arg_) => arg=arg_);
  assertEquals(arg, ArrayList { JsonObject { "cheese"->"stilton" }, JsonObject { "socks"->"tartan" } });
}

shared test void testMethodWithHandlerListNullJsonObject() {
  // Todo
}

shared test void testMethodWithHandlerListComplexJsonObject() {
  variable List<JsonObject>|Null arg = null;
  collectionTCK.methodWithHandlerListComplexJsonObject((List<JsonObject> arg_) => arg=arg_);
  assertEquals(arg, ArrayList { JsonObject { "outer" -> JsonObject { "socks"->"tartan" }, "list" -> JsonArray { "yellow", "blue" } } });
}

shared test void testMethodWithHandlerAsyncResultListJsonObject() {
  variable List<JsonObject>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultListJsonObject((List<JsonObject>|Throwable arg_) => arg=arg_);
  assertEquals(arg, ArrayList { JsonObject { "cheese"->"stilton" }, JsonObject { "socks"->"tartan" } });
}

shared test void testMethodWithHandlerAsyncResultListNullJsonObject() {
  // Todo
}

shared test void testMethodWithHandlerAsyncResultListComplexJsonObject() {
  variable List<JsonObject>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerListComplexJsonObject((List<JsonObject>|Throwable arg_) => arg=arg_);
  assertEquals(arg, ArrayList { JsonObject { "outer" -> JsonObject { "socks"->"tartan" }, "list" -> JsonArray { "yellow", "blue" } } });
}

shared test void testMethodWithHandlerSetJsonObject() {
  variable Set<JsonObject>|Null arg = null;
  collectionTCK.methodWithHandlerSetJsonObject((Set<JsonObject> arg_) => arg=arg_);
  assertEquals(arg, HashSet { JsonObject { "cheese"->"stilton" }, JsonObject { "socks"->"tartan" } });
}

shared test void testMethodWithHandlerSetNullJsonObject() {
  // Todo
}

shared test void testMethodWithHandlerSetComplexJsonObject() {
  variable Set<JsonObject>|Null arg = null;
  collectionTCK.methodWithHandlerSetComplexJsonObject((Set<JsonObject> arg_) => arg=arg_);
  assertEquals(arg, HashSet { JsonObject { "outer" -> JsonObject { "socks"->"tartan" }, "list" -> JsonArray { "yellow", "blue" } } });
}

shared test void testMethodWithHandlerAsyncResultSetJsonObject() {
  variable Set<JsonObject>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultSetJsonObject((Set<JsonObject>|Throwable arg_) => arg=arg_);
  assertEquals(arg, HashSet { JsonObject { "cheese"->"stilton"}, JsonObject { "socks"->"tartan" } });
}

shared test void testMethodWithHandlerAsyncResultSetNullJsonObject() {
  // Todo
}

shared test void testMethodWithHandlerAsyncResultSetComplexJsonObject() {
  variable Set<JsonObject>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultSetComplexJsonObject((Set<JsonObject>|Throwable arg_) => arg=arg_);
  assertEquals(arg, HashSet { JsonObject { "outer" -> JsonObject { "socks"->"tartan" }, "list" -> JsonArray { "yellow", "blue" } } });
}

shared test void testMethodWithHandlerListJsonArray() {
  variable List<JsonArray>|Null arg = null;
  collectionTCK.methodWithHandlerListJsonArray((List<JsonArray> arg_) => arg=arg_);
  assertEquals(arg, ArrayList { JsonArray { "green", "blue" }, JsonArray { "yellow", "purple" } });
}

shared test void testMethodWithHandlerListNullJsonArray() {
  // Todo
}

shared test void testMethodWithHandlerListComplexJsonArray() {
  variable List<JsonArray>|Null arg = null;
  collectionTCK.methodWithHandlerListComplexJsonArray((List<JsonArray> arg_) => arg=arg_);
  assertEquals(arg, ArrayList { JsonArray { JsonObject { "foo"->"hello" } }, JsonArray {  JsonObject { "bar"->"bye" } } });
}

shared test void testMethodWithHandlerListDataObject() {
  variable List<TestDataObject>|Null arg = null;
  collectionTCK.methodWithHandlerListDataObject((List<TestDataObject> arg_) => arg=arg_);
  assert(is List<TestDataObject> list=arg);
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

shared test void testMethodWithHandlerNullListDataObject() {
  // Todo
}

shared test void testMethodWithHandlerSetDataObject() {
  variable TestDataObject[]|Null arg = null;
  collectionTCK.methodWithHandlerSetDataObject((Set<TestDataObject> arg_) => arg=arg_.sort(comparingTestDataObject));
  assert(is TestDataObject[] set=arg);
  assertEquals(set.size, 2);
  value obj1 = set[0];
  assert(is TestDataObject obj1);
  assertEquals(obj1.foo, "String 1");
  assertEquals(obj1.bar, 1);
  assertFloatEquals(obj1.wibble, 1.1);
  value obj2 = set[1];
  assert(is TestDataObject obj2);
  assertEquals(obj2.foo, "String 2");
  assertEquals(obj2.bar, 2);
  assertFloatEquals(obj2.wibble, 2.2);
}

shared test void testMethodWithHandlerNullSetDataObject() {
  // Todo
}

shared test void testMethodWithHandlerAsyncResultListJsonArray() {
  variable List<JsonArray>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultListJsonArray((List<JsonArray>|Throwable arg_) => arg=arg_);
  assertEquals(arg, ArrayList { JsonArray { "green", "blue" }, JsonArray { "yellow", "purple" } });
}

shared test void testMethodWithHandlerAsyncResultListNullJsonArray() {
  // Todo
}

shared test void testMethodWithHandlerAsyncResultListComplexJsonArray() {
  variable List<JsonArray>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultListComplexJsonArray((List<JsonArray>|Throwable arg_) => arg=arg_);
  assertEquals(arg, ArrayList { JsonArray { JsonObject { "foo"->"hello" } }, JsonArray {  JsonObject { "bar"->"bye" } } });
}

shared test void testMethodWithHandlerSetJsonArray() {
  variable Set<JsonArray>|Null arg = null;
  collectionTCK.methodWithHandlerSetJsonArray((Set<JsonArray> arg_) => arg=arg_);
  assertEquals(arg, HashSet { JsonArray { "green", "blue" }, JsonArray { "yellow", "purple" } });
}

shared test void testMethodWithHandlerSetNullJsonArray() {
  // Todo
}

shared test void testMethodWithHandlerSetComplexJsonArray() {
  variable Set<JsonArray>|Null arg = null;
  collectionTCK.methodWithHandlerSetComplexJsonArray((Set<JsonArray> arg_) => arg=arg_);
  assertEquals(arg, HashSet { JsonArray { JsonObject { "foo"->"hello" } }, JsonArray {  JsonObject { "bar"->"bye" } } });
}

shared test void testMethodWithHandlerAsyncResultSetJsonArray() {
  variable Set<JsonArray>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultSetJsonArray((Set<JsonArray>|Throwable arg_) => arg=arg_);
  assertEquals(arg, HashSet { JsonArray { "green", "blue" }, JsonArray { "yellow", "purple" } });
}

shared test void testMethodWithHandlerAsyncResultNullSetJsonArray() {
  // Todo
}

shared test void testMethodWithHandlerAsyncResultSetComplexJsonArray() {
  variable Set<JsonArray>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultSetComplexJsonArray((Set<JsonArray>|Throwable arg_) => arg=arg_);
  assertEquals(arg, HashSet { JsonArray { JsonObject { "foo"->"hello" } }, JsonArray {  JsonObject { "bar"->"bye" } } });
}

shared test void testMethodWithHandlerAsyncResultListDataObject() {
  variable List<TestDataObject>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultListDataObject((List<TestDataObject>|Throwable arg_) => arg=arg_);
  assert(is List<TestDataObject> list=arg);
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

shared test void testMethodWithHandlerAsyncResultNullListDataObject() {
  // Null
}

shared test void testMethodWithHandlerAsyncResultSetDataObject() {
  variable Set<TestDataObject>|Throwable|Null arg = null;
  collectionTCK.methodWithHandlerAsyncResultSetDataObject((Set<TestDataObject>|Throwable arg_) => arg=arg_);
  assert(is Set<TestDataObject> val=arg);
  value set = val.sort(comparingTestDataObject);
  assertEquals(set.size, 2);
  value obj1 = set[0];
  assert(is TestDataObject obj1);
  assertEquals(obj1.foo, "String 1");
  assertEquals(obj1.bar, 1);
  assertFloatEquals(obj1.wibble, 1.1);
  value obj2 = set[1];
  assert(is TestDataObject obj2);
  assertEquals(obj2.foo, "String 2");
  assertEquals(obj2.bar, 2);
  assertFloatEquals(obj2.wibble, 2.2);
}

shared test void testMethodWithHandlerAsyncResultNullSetDataObject() {
  // Null
}

shared test void testMethodListParams() {
  value refed1 = RefedInterface1(RefedInterface1Impl().setString("foo"));
  value refed2 = RefedInterface1(RefedInterface1Impl().setString("bar"));
  collectionTCK.methodWithListParams(
    ArrayList { "foo", "bar" },
    ArrayList { 2.byte, 3.byte },
    ArrayList { 12, 13 },
    ArrayList { 1234, 1345 },
    ArrayList { 123, 456 },
    ArrayList { JsonObject { "foo"->"bar" }, JsonObject { "eek"->"wibble" } },
    ArrayList { JsonArray { "foo" }, JsonArray { "blah" } },
    ArrayList { refed1, refed2 },
    ArrayList { TestDataObject { foo="String 1"; bar=1; wibble=1.1; }, TestDataObject { foo="String 2"; bar=2; wibble=2.2; } },
    ArrayList { "JULIEN", "TIM" }
  );
}

shared test void testMethodSetParams() {
  value refed1 = RefedInterface1(RefedInterface1Impl().setString("foo"));
  value refed2 = RefedInterface1(RefedInterface1Impl().setString("bar"));
  collectionTCK.methodWithSetParams(
    HashSet { "foo", "bar" },
    HashSet { 2.byte, 3.byte },
    HashSet { 12, 13 },
    HashSet { 1234, 1345 },
    HashSet { 123, 456 },
    HashSet { JsonObject { "foo"->"bar" }, JsonObject { "eek"->"wibble" } },
    HashSet { JsonArray { "foo" }, JsonArray { "blah" } },
    HashSet { refed1, refed2 },
    HashSet { TestDataObject { foo="String 1"; bar=1; wibble=1.1; }, TestDataObject { foo="String 2"; bar=2; wibble=2.2; } },
    HashSet { "JULIEN", "TIM" }
  );
}

shared test void testMethodMapParams() {
  value refed1 = RefedInterface1(RefedInterface1Impl().setString("foo"));
  value refed2 = RefedInterface1(RefedInterface1Impl().setString("bar"));
  collectionTCK.methodWithMapParams(
    HashMap { "foo"->"bar", "eek"->"wibble" },
    HashMap { "foo"->2.byte, "eek"->3.byte },
    HashMap { "foo"->12, "eek"->13 },
    HashMap { "foo"->1234, "eek"->1345 },
    HashMap { "foo"->123, "eek"->456 },
    HashMap { "foo"->JsonObject { "foo"->"bar" }, "eek"->JsonObject { "eek"->"wibble" } },
    HashMap { "foo"->JsonArray { "foo" }, "eek"->JsonArray { "blah" } },
    HashMap { "foo"->refed1, "eek"->refed2 }
  );
}

shared test void testListStringReturn() {
  value list = collectionTCK.methodWithListStringReturn();
  assertEquals(list.size, 3);
  assertEquals(list[0], "foo");
  assertEquals(list[1], "bar");
  assertEquals(list[2], "wibble");
}

shared test void testListLongReturn() {
  value list = collectionTCK.methodWithListLongReturn();
  assertEquals(list.size, 2);
  assertEquals(list[0], 123);
  assertEquals(list[1], 456);
}

shared test void testListJsonObjectReturn() {
  value list = collectionTCK.methodWithListJsonObjectReturn();
  assertEquals(list.size, 2);
  assertEquals(list[0], JsonObject { "foo"->"bar" });
  assertEquals(list[1], JsonObject { "blah"->"eek" });
}

shared test void testListComplexJsonObjectReturn() {
  value list = collectionTCK.methodWithListComplexJsonObjectReturn();
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
  value list = collectionTCK.methodWithListJsonArrayReturn();
  assertEquals(list.size, 2);
  assertEquals(list[0], JsonArray { "foo" });
  assertEquals(list[1], JsonArray { "blah" });
}

shared test void testListComplexJsonArrayReturn() {
  value list = collectionTCK.methodWithListComplexJsonArrayReturn();
  assertEquals(list.size, 2);
  assertEquals(list[0], JsonArray { JsonObject { "foo"->"hello" } });
  assertEquals(list[1], JsonArray { JsonObject { "bar"->"bye" } });
}

shared test void testListVertxGenReturn() {
  value list = collectionTCK.methodWithListVertxGenReturn();
  assertEquals(list.size, 2);
  value refed1 = list[0];
  assert(is RefedInterface1 refed1);
  assertEquals(refed1.getString(), "foo");
  value refed2 = list[1];
  assert(is RefedInterface1 refed2);
  assertEquals(refed2.getString(), "bar");
}

shared test void testListDataObjectReturn() {
  value list = collectionTCK.methodWithListDataObjectReturn();
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
  value set = collectionTCK.methodWithSetStringReturn();
  assertEquals(set.size, 3);
  assertTrue(set.contains("foo"));
  assertTrue(set.contains("bar"));
  assertTrue(set.contains("wibble"));
}

shared test void testSetLongReturn() {
  value set = collectionTCK.methodWithSetLongReturn();
  assertEquals(set.size, 2);
  assertTrue(set.contains(123));
  assertTrue(set.contains(456));
}

shared test void testSetJsonObjectReturn() {
  value set = collectionTCK.methodWithSetJsonObjectReturn();
  assertEquals(set.size, 2);
  assertTrue(set.contains(JsonObject { "foo"->"bar" }));
  assertTrue(set.contains(JsonObject { "blah"->"eek" }));
}

shared test void testSetComplexJsonObjectReturn() {
  value set = collectionTCK.methodWithSetComplexJsonObjectReturn();
  assertEquals(set.size, 1);
  assertTrue(set.contains(JsonObject {
    "outer"->JsonObject { "socks"->"tartan" },
    "list"->JsonArray { "yellow", "blue" }
    }));
}

shared test void testSetJsonArrayReturn() {
  value set = collectionTCK.methodWithSetJsonArrayReturn();
  assertEquals(set.size, 2);
  assertTrue(set.contains(JsonArray { "foo" }));
  assertTrue(set.contains(JsonArray { "blah" }));
}

shared test void testSetComplexJsonArrayReturn() {
  value set = collectionTCK.methodWithSetComplexJsonArrayReturn();
  assertEquals(set.size, 2);
  assertTrue(set.contains(JsonArray { JsonObject { "foo"->"hello" }}));
  assertTrue(set.contains(JsonArray { JsonObject { "bar"->"bye" } }));
}

shared test void testSetVertxGenReturn() {
  value set = collectionTCK.methodWithSetVertxGenReturn().sort(comparingRefedInterface1);
  assertEquals(set.size, 2);
  assert(is RefedInterface1 f=set[0]);
  assert(is RefedInterface1 l=set[1]);
  assertEquals(f.getString(), "bar");
  assertEquals(l.getString(), "foo");
}

shared test void testSetDataObjectReturn() {
  value set = collectionTCK.methodWithSetDataObjectReturn().sort(comparingTestDataObject);
  assertEquals(set.size, 2);
  assert(is TestDataObject f=set[0]);
  assert(is TestDataObject l=set[1]);
  JsonObject j1 = f.toJson();
  JsonObject j2 = l.toJson();
  assertEquals(j1["foo"], "String 1");
  assertEquals(j1["bar"], 1);
  assertFloatEquals(j1["wibble"], 1.1);
  assertEquals(j2["foo"], "String 2");
  assertEquals(j2["bar"], 2);
  assertFloatEquals(j2["wibble"], 2.2);
}

shared test void testMapStringReturn() {
  Map<String, String> map = collectionTCK.methodWithMapStringReturn((String arg) => {});
  assertEquals(map, HashMap { "foo"->"bar" });
}

shared test void testMapLongReturn() {
  Map<String, Integer> map = collectionTCK.methodWithMapLongReturn((String arg) => {});
  assertEquals(map, HashMap { "foo"->123 });
}

shared test void testMapJsonObjectReturn() {
  Map<String, JsonObject> map = collectionTCK.methodWithMapJsonObjectReturn((String arg) => {});
  assertEquals(map, HashMap { "foo"->JsonObject { "wibble"->"eek" } });
}

shared test void testMapComplexJsonObjectReturn() {
  Map<String, JsonObject> map = collectionTCK.methodWithMapComplexJsonObjectReturn((String arg) => {});
  assertEquals(map, HashMap { "foo"->JsonObject { "outer"->JsonObject { "socks"->"tartan" }, "list"->JsonArray { "yellow", "blue" } } });
}

shared test void testMapJsonArrayReturn() {
  Map<String, JsonArray> map = collectionTCK.methodWithMapJsonArrayReturn((String arg) => {});
  assertEquals(map, HashMap { "foo"->JsonArray { "wibble" } });
}

shared test void testMapComplexJsonArrayReturn() {
  Map<String, JsonArray> map = collectionTCK.methodWithMapComplexJsonArrayReturn((String arg) => {});
  assertEquals(map, HashMap { "foo"->JsonArray { JsonObject { "foo"->"hello" }, JsonObject { "bar"->"bye" } } });
}

