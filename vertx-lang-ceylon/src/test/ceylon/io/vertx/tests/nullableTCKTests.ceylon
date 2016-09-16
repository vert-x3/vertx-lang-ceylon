import io.vertx.ceylon.testmodel {
  NullableTCK, RefedInterface1, RefedInterface2, TestDataObject,
  Factory, factory, testInterface, AbstractHandlerUserType, ConcreteHandlerUserType, ConcreteHandlerUserTypeExtension,
  GenericRefedInterface, TestGenEnum, mike, bob, leland
}
import io.vertx.codegen.testmodel {
  RefedInterface1Impl, NullableTCKImpl
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

NullableTCK nullableTCK = NullableTCK(NullableTCKImpl());

shared test void testNullableByte() => testNullable(67.byte, nullableTCK.methodWithNullableByteParam, nullableTCK.methodWithNullableByteHandler, nullableTCK.methodWithNullableByteHandlerAsyncResult, nullableTCK.methodWithNullableByteReturn);
shared test void testNullableShort() => testNullable(1024, nullableTCK.methodWithNullableShortParam, nullableTCK.methodWithNullableShortHandler, nullableTCK.methodWithNullableShortHandlerAsyncResult, nullableTCK.methodWithNullableShortReturn);
shared test void testNullableInteger() => testNullable(1234567, nullableTCK.methodWithNullableIntegerParam, nullableTCK.methodWithNullableIntegerHandler, nullableTCK.methodWithNullableIntegerHandlerAsyncResult, nullableTCK.methodWithNullableIntegerReturn);
shared test void testNullableLong() => testNullable(9876543210, nullableTCK.methodWithNullableLongParam, nullableTCK.methodWithNullableLongHandler, nullableTCK.methodWithNullableLongHandlerAsyncResult, nullableTCK.methodWithNullableLongReturn);
shared test void testNullableFloat() => testNullable(3.14, nullableTCK.methodWithNullableFloatParam, nullableTCK.methodWithNullableFloatHandler, nullableTCK.methodWithNullableFloatHandlerAsyncResult, nullableTCK.methodWithNullableFloatReturn, assertFloatEquals);
shared test void testNullableDouble() => testNullable(3.1415926, nullableTCK.methodWithNullableDoubleParam, nullableTCK.methodWithNullableDoubleHandler, nullableTCK.methodWithNullableDoubleHandlerAsyncResult, nullableTCK.methodWithNullableDoubleReturn);
shared test void testNullableBoolean() => testNullable(true, nullableTCK.methodWithNullableBooleanParam, nullableTCK.methodWithNullableBooleanHandler, nullableTCK.methodWithNullableBooleanHandlerAsyncResult, nullableTCK.methodWithNullableBooleanReturn);
shared test void testNullableString() => testNullable("the_string_value", nullableTCK.methodWithNullableStringParam, nullableTCK.methodWithNullableStringHandler, nullableTCK.methodWithNullableStringHandlerAsyncResult, nullableTCK.methodWithNullableStringReturn);
shared test void testNullableChar() => testNullable('f', nullableTCK.methodWithNullableCharParam, nullableTCK.methodWithNullableCharHandler, nullableTCK.methodWithNullableCharHandlerAsyncResult, nullableTCK.methodWithNullableCharReturn);
shared test void testNullableJsonObject() => testNullable(JsonObject { "foo"->"wibble", "bar"->3 }, nullableTCK.methodWithNullableJsonObjectParam, nullableTCK.methodWithNullableJsonObjectHandler, nullableTCK.methodWithNullableJsonObjectHandlerAsyncResult, nullableTCK.methodWithNullableJsonObjectReturn);
shared test void testNullableJsonArray() => testNullable(JsonArray { "one","two","three" }, nullableTCK.methodWithNullableJsonArrayParam, nullableTCK.methodWithNullableJsonArrayHandler, nullableTCK.methodWithNullableJsonArrayHandlerAsyncResult, nullableTCK.methodWithNullableJsonArrayReturn);
shared test void testNullableApi() => testNullable(RefedInterface1(RefedInterface1Impl().setString("lovely_dae")), nullableTCK.methodWithNullableApiParam, nullableTCK.methodWithNullableApiHandler, nullableTCK.methodWithNullableApiHandlerAsyncResult, nullableTCK.methodWithNullableApiReturn, assertRefedInterface1Equals);
shared test void testNullableDataObject() => testNullable(TestDataObject { foo="foo_value"; bar=12345; wibble=3.5; }, nullableTCK.methodWithNullableDataObjectParam, nullableTCK.methodWithNullableDataObjectHandler, nullableTCK.methodWithNullableDataObjectHandlerAsyncResult, nullableTCK.methodWithNullableDataObjectReturn, assertTestDataObjectEquals);
shared test void testNullableEnum() => testNullable("TIM", nullableTCK.methodWithNullableEnumParam, nullableTCK.methodWithNullableEnumHandler, nullableTCK.methodWithNullableEnumHandlerAsyncResult, nullableTCK.methodWithNullableEnumReturn);
shared test void testNullableGenEnum() => testNullable(mike, nullableTCK.methodWithNullableGenEnumParam, nullableTCK.methodWithNullableGenEnumHandler, nullableTCK.methodWithNullableGenEnumHandlerAsyncResult, nullableTCK.methodWithNullableGenEnumReturn);

shared void testNullable<T>(
    T expected,
    Anything(Boolean,T?) nullableParamFunction,
    Anything(Boolean,Anything(T?)) nullableHandlerFunction,
    Anything(Boolean,Anything(T?|Throwable)) nullableHandlerAsyncResultFunction,
    T?(Boolean) nullableReturnFunction,
    Anything(Anything,Anything) check = assertEquals
    ) {
  nullableParamFunction(true, null);
  nullableParamFunction(false, expected);
  variable Integer count = 0;
  void a(T? val) {
    assertNull(val);
    count++;
  }
  nullableHandlerFunction(false, a);
  void b(T? val) {
    check(expected, val);
    count++;
  }
  nullableHandlerFunction(true, b);
  void c(T?|Throwable val) {
    assertNull(val);
    count++;
  }
  nullableHandlerAsyncResultFunction(false, c);
  void d(T?|Throwable val) {
    check(expected, val);
    count++;
  }
  nullableHandlerAsyncResultFunction(true, d);
  assertNull(nullableReturnFunction(false));
  check(expected, nullableReturnFunction(true));
  assertEquals(4, count);
}

shared void testNullableTypeVariable() {
  nullableTCK.methodWithNullableTypeVariableParam(false, "whatever");
  nullableTCK.methodWithNullableTypeVariableParam(true, null);
  variable Integer count = 0;
  void a(String? val) {
    assertEquals("wibble", val);
    count++;
  }
  nullableTCK.methodWithNullableTypeVariableHandler<String>(true, "wibble", a);
  void b(String? val) {
    assertNull(val);
    count++;
  }
  nullableTCK.methodWithNullableTypeVariableHandler<String>(true, null, b);
  void c(String?|Throwable val) {
    assertEquals("sausages", val);
    count++;
  }
  nullableTCK.methodWithNullableTypeVariableHandlerAsyncResult<String>(true, "sausages", c);
  void d(String?|Throwable val) {
    assertNull(val);
    count++;
  }
  nullableTCK.methodWithNullableTypeVariableHandlerAsyncResult<String>(true, null, d);
  assertEquals("fizz1", nullableTCK.methodWithNullableTypeVariableReturn<String>(true, "fizz1"));
  assertNull(nullableTCK.methodWithNullableTypeVariableReturn(false, "fizz2"));
  assertEquals(4, count);
}

shared void testNullableObjectParam() {
  nullableTCK.methodWithNullableObjectParam(true, null);
  nullableTCK.methodWithNullableObjectParam(false, "object_param");
}

shared test void testNullableListByte() => testNullableList(ArrayList { 12.byte,24.byte,(-12).byte }, nullableTCK.methodWithNullableListByteParam, nullableTCK.methodWithNullableListByteHandler, nullableTCK.methodWithNullableListByteHandlerAsyncResult, nullableTCK.methodWithNullableListByteReturn);
shared test void testNullableListShort() => testNullableList(ArrayList { 520,1040,-520 }, nullableTCK.methodWithNullableListShortParam, nullableTCK.methodWithNullableListShortHandler, nullableTCK.methodWithNullableListShortHandlerAsyncResult, nullableTCK.methodWithNullableListShortReturn);
shared test void testNullableListInteger() => testNullableList(ArrayList { 12345,54321,-12345 }, nullableTCK.methodWithNullableListIntegerParam, nullableTCK.methodWithNullableListIntegerHandler, nullableTCK.methodWithNullableListIntegerHandlerAsyncResult, nullableTCK.methodWithNullableListIntegerReturn);
shared test void testNullableListLong() => testNullableList(ArrayList { 123456789,987654321,-123456789 }, nullableTCK.methodWithNullableListLongParam, nullableTCK.methodWithNullableListLongHandler, nullableTCK.methodWithNullableListLongHandlerAsyncResult, nullableTCK.methodWithNullableListLongReturn);
shared test void testNullableListFloat() => testNullableList(ArrayList { 1.1,2.2,3.3 }, nullableTCK.methodWithNullableListFloatParam, nullableTCK.methodWithNullableListFloatHandler, nullableTCK.methodWithNullableListFloatHandlerAsyncResult, nullableTCK.methodWithNullableListFloatReturn, assertFloatEquals);
shared test void testNullableListDouble() => testNullableList(ArrayList { 1.11,2.22,3.33 }, nullableTCK.methodWithNullableListDoubleParam, nullableTCK.methodWithNullableListDoubleHandler, nullableTCK.methodWithNullableListDoubleHandlerAsyncResult, nullableTCK.methodWithNullableListDoubleReturn, assertFloatEquals);
shared test void testNullableListBoolean() => testNullableList(ArrayList { true,false,true }, nullableTCK.methodWithNullableListBooleanParam, nullableTCK.methodWithNullableListBooleanHandler, nullableTCK.methodWithNullableListBooleanHandlerAsyncResult, nullableTCK.methodWithNullableListBooleanReturn);
shared test void testNullableListString() => testNullableList(ArrayList { "first","second","third" }, nullableTCK.methodWithNullableListStringParam, nullableTCK.methodWithNullableListStringHandler, nullableTCK.methodWithNullableListStringHandlerAsyncResult, nullableTCK.methodWithNullableListStringReturn);
shared test void testNullableListChar() => testNullableList(ArrayList { 'x','y','z' }, nullableTCK.methodWithNullableListCharParam, nullableTCK.methodWithNullableListCharHandler, nullableTCK.methodWithNullableListCharHandlerAsyncResult, nullableTCK.methodWithNullableListCharReturn);
shared test void testNullableListJsonObject() => testNullableList(ArrayList { JsonObject { "foo"->"bar" }, JsonObject { "juu"->3 } }, nullableTCK.methodWithNullableListJsonObjectParam, nullableTCK.methodWithNullableListJsonObjectHandler, nullableTCK.methodWithNullableListJsonObjectHandlerAsyncResult, nullableTCK.methodWithNullableListJsonObjectReturn);
shared test void testNullableListJsonArray() => testNullableList(ArrayList { JsonArray { "foo","bar" }, JsonArray { "juu" } }, nullableTCK.methodWithNullableListJsonArrayParam, nullableTCK.methodWithNullableListJsonArrayHandler, nullableTCK.methodWithNullableListJsonArrayHandlerAsyncResult, nullableTCK.methodWithNullableListJsonArrayReturn);
shared test void testNullableListApi() => testNullableList(ArrayList { RefedInterface1(RefedInterface1Impl().setString("refed_is_here")) }, nullableTCK.methodWithNullableListApiParam, nullableTCK.methodWithNullableListApiHandler, nullableTCK.methodWithNullableListApiHandlerAsyncResult, nullableTCK.methodWithNullableListApiReturn, assertRefedInterface1Equals);
shared test void testNullableListDataObject() => testNullableList(ArrayList { TestDataObject { foo="foo_value"; bar=12345; wibble=5.6; } }, nullableTCK.methodWithNullableListDataObjectParam, nullableTCK.methodWithNullableListDataObjectHandler, nullableTCK.methodWithNullableListDataObjectHandlerAsyncResult, nullableTCK.methodWithNullableListDataObjectReturn, assertTestDataObjectEquals);
shared test void testNullableListEnum() => testNullableList(ArrayList { "TIM", "JULIEN" }, nullableTCK.methodWithNullableListEnumParam, nullableTCK.methodWithNullableListEnumHandler, nullableTCK.methodWithNullableListEnumHandlerAsyncResult, nullableTCK.methodWithNullableListEnumReturn);
shared test void testNullableListGenEnum() => testNullableList(ArrayList { bob, leland }, nullableTCK.methodWithNullableListGenEnumParam, nullableTCK.methodWithNullableListGenEnumHandler, nullableTCK.methodWithNullableListGenEnumHandlerAsyncResult, nullableTCK.methodWithNullableListGenEnumReturn);

shared void testNullableList<T>(
    List<T> expected,
    Anything(Boolean,List<T>?) nullableListParamFunction,
    Anything(Boolean,Anything(List<T>?)) nullableListHandlerFunction,
    Anything(Boolean,Anything(List<T>?|Throwable)) nullableListHandlerAsyncResultFunction,
    List<T>?(Boolean) nullableListReturnFunction,
    Anything(Anything,Anything) check = assertEquals
    ) {
  void checkList(Anything actual) {
    assert(is List<T> actual);
    assertEquals(expected.size, actual.size);
    for (index->item in expected.indexed) {
      check(item, actual[index]);
    }
  }
  nullableListParamFunction(false, expected);
  nullableListParamFunction(true, null);
  variable Integer count = 0;
  void a(List<T>? list) {
    assertNull(list);
    count++;
  }
  nullableListHandlerFunction(false, a);
  void b(List<T>? list) {
    checkList(list);
    count++;
  }
  nullableListHandlerFunction(true, b);
  void c(List<T>?|Throwable list) {
    assertNull(list);
    count++;
  }
  nullableListHandlerAsyncResultFunction(false, c);
  void d(List<T>?|Throwable list) {
    checkList(list);
    count++;
  }
  nullableListHandlerAsyncResultFunction(true, d);
  assertNull(nullableListReturnFunction(false));
  checkList(nullableListReturnFunction(true));
  assertEquals(4, count);
}

shared test void testNullableSetByte() => testNullableSet(HashSet { 12.byte,24.byte,(-12).byte }, nullableTCK.methodWithNullableSetByteParam, nullableTCK.methodWithNullableSetByteHandler, nullableTCK.methodWithNullableSetByteHandlerAsyncResult, nullableTCK.methodWithNullableSetByteReturn);
shared test void testNullableSetShort() => testNullableSet(HashSet { 520,1040,-520 }, nullableTCK.methodWithNullableSetShortParam, nullableTCK.methodWithNullableSetShortHandler, nullableTCK.methodWithNullableSetShortHandlerAsyncResult, nullableTCK.methodWithNullableSetShortReturn);
shared test void testNullableSetInteger() => testNullableSet(HashSet { 12345,54321,-12345 }, nullableTCK.methodWithNullableSetIntegerParam, nullableTCK.methodWithNullableSetIntegerHandler, nullableTCK.methodWithNullableSetIntegerHandlerAsyncResult, nullableTCK.methodWithNullableSetIntegerReturn);
shared test void testNullableSetLong() => testNullableSet(HashSet { 123456789,987654321,-123456789 }, nullableTCK.methodWithNullableSetLongParam, nullableTCK.methodWithNullableSetLongHandler, nullableTCK.methodWithNullableSetLongHandlerAsyncResult, nullableTCK.methodWithNullableSetLongReturn);
shared test void testNullableSetFloat() => testNullableSet(HashSet { 1.1,2.2,3.3 }, nullableTCK.methodWithNullableSetFloatParam, nullableTCK.methodWithNullableSetFloatHandler, nullableTCK.methodWithNullableSetFloatHandlerAsyncResult, nullableTCK.methodWithNullableSetFloatReturn, assertFloatEquals);
shared test void testNullableSetDouble() => testNullableSet(HashSet { 1.11,2.22,3.33 }, nullableTCK.methodWithNullableSetDoubleParam, nullableTCK.methodWithNullableSetDoubleHandler, nullableTCK.methodWithNullableSetDoubleHandlerAsyncResult, nullableTCK.methodWithNullableSetDoubleReturn, assertFloatEquals);
shared test void testNullableSetBoolean() => testNullableSet(HashSet { true,false }, nullableTCK.methodWithNullableSetBooleanParam, nullableTCK.methodWithNullableSetBooleanHandler, nullableTCK.methodWithNullableSetBooleanHandlerAsyncResult, nullableTCK.methodWithNullableSetBooleanReturn);
shared test void testNullableSetString() => testNullableSet(HashSet { "first","second","third" }, nullableTCK.methodWithNullableSetStringParam, nullableTCK.methodWithNullableSetStringHandler, nullableTCK.methodWithNullableSetStringHandlerAsyncResult, nullableTCK.methodWithNullableSetStringReturn);
shared test void testNullableSetChar() => testNullableSet(HashSet { 'x','y','z' }, nullableTCK.methodWithNullableSetCharParam, nullableTCK.methodWithNullableSetCharHandler, nullableTCK.methodWithNullableSetCharHandlerAsyncResult, nullableTCK.methodWithNullableSetCharReturn);
shared test void testNullableSetJsonObject() => testNullableSet(HashSet { JsonObject { "foo"->"bar" }, JsonObject { "juu"->3 } }, nullableTCK.methodWithNullableSetJsonObjectParam, nullableTCK.methodWithNullableSetJsonObjectHandler, nullableTCK.methodWithNullableSetJsonObjectHandlerAsyncResult, nullableTCK.methodWithNullableSetJsonObjectReturn);
shared test void testNullableSetJsonArray() => testNullableSet(HashSet { JsonArray { "foo","bar" }, JsonArray { "juu" } }, nullableTCK.methodWithNullableSetJsonArrayParam, nullableTCK.methodWithNullableSetJsonArrayHandler, nullableTCK.methodWithNullableSetJsonArrayHandlerAsyncResult, nullableTCK.methodWithNullableSetJsonArrayReturn);
shared test void testNullableSetApi() => testNullableSet(HashSet { RefedInterface1(RefedInterface1Impl().setString("refed_is_here")) }, nullableTCK.methodWithNullableSetApiParam, nullableTCK.methodWithNullableSetApiHandler, nullableTCK.methodWithNullableSetApiHandlerAsyncResult, nullableTCK.methodWithNullableSetApiReturn, assertRefedInterface1Equals);
shared test void testNullableSetDataObject() => testNullableSet(HashSet { TestDataObject { foo="foo_value"; bar=12345; wibble=5.6; } }, nullableTCK.methodWithNullableSetDataObjectParam, nullableTCK.methodWithNullableSetDataObjectHandler, nullableTCK.methodWithNullableSetDataObjectHandlerAsyncResult, nullableTCK.methodWithNullableSetDataObjectReturn, assertTestDataObjectEquals);
shared test void testNullableSetEnum() => testNullableSet(HashSet { "TIM", "JULIEN" }, nullableTCK.methodWithNullableSetEnumParam, nullableTCK.methodWithNullableSetEnumHandler, nullableTCK.methodWithNullableSetEnumHandlerAsyncResult, nullableTCK.methodWithNullableSetEnumReturn);
shared test void testNullableSetGenEnum() => testNullableSet(HashSet { bob, leland }, nullableTCK.methodWithNullableSetGenEnumParam, nullableTCK.methodWithNullableSetGenEnumHandler, nullableTCK.methodWithNullableSetGenEnumHandlerAsyncResult, nullableTCK.methodWithNullableSetGenEnumReturn);

shared void testNullableSet<T>(
    Set<T> expected,
    Anything(Boolean,Set<T>?) nullableSetParamFunction,
    Anything(Boolean,Anything(Set<T>?)) nullableSetHandlerFunction,
    Anything(Boolean,Anything(Set<T>?|Throwable)) nullableSetHandlerAsyncResultFunction,
    Set<T>?(Boolean) nullableSetReturnFunction,
    Anything(Anything,Anything) check = assertEquals
    ) {
  void checkSet(Anything actual) {
    assert(is Set<T> actual);
    assertEquals(expected.size, actual.size);
    variable Integer count = 0;
    for (expectedItem in expected) {
      for (actualItem in actual) {
        try {
          check(expectedItem, actualItem);
          count++;
          break;
        } catch (Throwable ignore) {
        }
      }
    }
    assertEquals(expected.size, count);
  }
  nullableSetParamFunction(false, expected);
  nullableSetParamFunction(true, null);
  variable Integer count = 0;
  void a(Set<T>? set) {
    assertNull(set);
    count++;
  }
  nullableSetHandlerFunction(false, a);
  void b(Set<T>? set) {
    checkSet(set);
    count++;
  }
  nullableSetHandlerFunction(true, b);
  void c(Set<T>?|Throwable set) {
    assertNull(set);
    count++;
  }
  nullableSetHandlerAsyncResultFunction(false, c);
  void d(Set<T>?|Throwable set) {
    checkSet(set);
    count++;
  }
  nullableSetHandlerAsyncResultFunction(true, d);
  assertNull(nullableSetReturnFunction(false));
  checkSet(nullableSetReturnFunction(true));
  assertEquals(4, count);
}

shared test void testNullableMapByte() => testNullableMap(ArrayList { 1.byte,2.byte,3.byte }, nullableTCK.methodWithNullableMapByteParam, nullableTCK.methodWithNullableMapByteHandler, nullableTCK.methodWithNullableMapByteHandlerAsyncResult, nullableTCK.methodWithNullableMapByteReturn);
shared test void testNullableMapShort() => testNullableMap(ArrayList { 1,2,3 }, nullableTCK.methodWithNullableMapShortParam, nullableTCK.methodWithNullableMapShortHandler, nullableTCK.methodWithNullableMapShortHandlerAsyncResult, nullableTCK.methodWithNullableMapShortReturn);
shared test void testNullableMapInteger() => testNullableMap(ArrayList { 1,2,3 }, nullableTCK.methodWithNullableMapIntegerParam, nullableTCK.methodWithNullableMapIntegerHandler, nullableTCK.methodWithNullableMapIntegerHandlerAsyncResult, nullableTCK.methodWithNullableMapIntegerReturn);
shared test void testNullableMapLong() => testNullableMap(ArrayList { 1,2,3 }, nullableTCK.methodWithNullableMapLongParam, nullableTCK.methodWithNullableMapLongHandler, nullableTCK.methodWithNullableMapLongHandlerAsyncResult, nullableTCK.methodWithNullableMapLongReturn);
shared test void testNullableMapFloat() => testNullableMap(ArrayList { 1.1,2.2,3.3 }, nullableTCK.methodWithNullableMapFloatParam, nullableTCK.methodWithNullableMapFloatHandler, nullableTCK.methodWithNullableMapFloatHandlerAsyncResult, nullableTCK.methodWithNullableMapFloatReturn, assertFloatEquals);
shared test void testNullableMapDouble() => testNullableMap(ArrayList { 1.11,2.22,3.33 }, nullableTCK.methodWithNullableMapDoubleParam, nullableTCK.methodWithNullableMapDoubleHandler, nullableTCK.methodWithNullableMapDoubleHandlerAsyncResult, nullableTCK.methodWithNullableMapDoubleReturn, assertFloatEquals);
shared test void testNullableMapBoolean() => testNullableMap(ArrayList { true, false, true }, nullableTCK.methodWithNullableMapBooleanParam, nullableTCK.methodWithNullableMapBooleanHandler, nullableTCK.methodWithNullableMapBooleanHandlerAsyncResult, nullableTCK.methodWithNullableMapBooleanReturn);
shared test void testNullableMapString() => testNullableMap(ArrayList { "first","second","third" }, nullableTCK.methodWithNullableMapStringParam, nullableTCK.methodWithNullableMapStringHandler, nullableTCK.methodWithNullableMapStringHandlerAsyncResult, nullableTCK.methodWithNullableMapStringReturn);
shared test void testNullableMapChar() => testNullableMap(ArrayList { 'x','y','z' }, nullableTCK.methodWithNullableMapCharParam, nullableTCK.methodWithNullableMapCharHandler, nullableTCK.methodWithNullableMapCharHandlerAsyncResult, nullableTCK.methodWithNullableMapCharReturn);
shared test void testNullableMapJsonObject() => testNullableMap(ArrayList { JsonObject { "foo"->"bar" }, JsonObject { "juu"->3 } }, nullableTCK.methodWithNullableMapJsonObjectParam, nullableTCK.methodWithNullableMapJsonObjectHandler, nullableTCK.methodWithNullableMapJsonObjectHandlerAsyncResult, nullableTCK.methodWithNullableMapJsonObjectReturn);
shared test void testNullableMapJsonArray() => testNullableMap(ArrayList { JsonArray { "foo","bar" }, JsonArray { "juu" } }, nullableTCK.methodWithNullableMapJsonArrayParam, nullableTCK.methodWithNullableMapJsonArrayHandler, nullableTCK.methodWithNullableMapJsonArrayHandlerAsyncResult, nullableTCK.methodWithNullableMapJsonArrayReturn);
shared test void testNullableMapApi() => testNullableMapIn(ArrayList { RefedInterface1(RefedInterface1Impl().setString("refed_is_here")) }, nullableTCK.methodWithNullableMapApiParam, assertRefedInterface1Equals);

shared void testNullableMap<T>(
    List<T> expected,
    Anything(Boolean,Map<String, T>?) nullableMapParamFunction,
    Anything(Boolean,Anything(Map<String, T>?)) nullableMapHandlerFunction,
    Anything(Boolean,Anything(Map<String, T>?|Throwable)) nullableMapHandlerAsyncResultFunction,
    Map<String, T>?(Boolean) nullableMapReturnFunction,
    Anything(Anything,Anything) check = assertEquals
    ) {
  testNullableMapIn(expected, nullableMapParamFunction, check);
  testNullableMapOut(expected, nullableMapHandlerFunction, nullableMapHandlerAsyncResultFunction, nullableMapReturnFunction, check);
}

shared void testNullableMapIn<T>(
    List<T> expected,
    Anything(Boolean,Map<String, T>?) nullableMapParamFunction,
    Anything(Anything,Anything) check
    ) {
  HashMap<String, T> map = HashMap<String, T>();
  for (index->item in expected.indexed) {
    map.put("``(index + 1)``", item);
  }
  nullableMapParamFunction(false, map);
  nullableMapParamFunction(true, null);
}

shared void testNullableMapOut<T>(
    List<T> expected,
    Anything(Boolean,Anything(Map<String, T>?)) nullableMapHandlerFunction,
    Anything(Boolean,Anything(Map<String, T>?|Throwable)) nullableMapHandlerAsyncResultFunction,
    Map<String, T>?(Boolean) nullableMapReturnFunction,
    Anything(Anything,Anything) check
    ) {
  void checkMap(Anything actual) {
    assert(is Map<String, T> actual);
    assertEquals(expected.size, actual.size);
    for (index->item in expected.indexed) {
      check(item, actual["``(index + 1)``"]);
    }
  }
  variable Integer count = 0;
  void a(Map<String, T>? set) {
    assertNull(set);
    count++;
  }
  nullableMapHandlerFunction(false, a);
  void b(Map<String, T>? set) {
    checkMap(set);
    count++;
  }
  nullableMapHandlerFunction(true, b);
  void c(Map<String, T>?|Throwable set) {
    assertNull(set);
    count++;
  }
  nullableMapHandlerAsyncResultFunction(false, c);
  void d(Map<String, T>?|Throwable set) {
    checkMap(set);
    count++;
  }
  nullableMapHandlerAsyncResultFunction(true, d);
  assertNull(nullableMapReturnFunction(false));
  checkMap(nullableMapReturnFunction(true));
  assertEquals(4, count);
}

shared test void testListNullableByte() => testListNullable(ArrayList { 12.byte,null,24.byte }, nullableTCK.methodWithListNullableByteParam, nullableTCK.methodWithListNullableByteHandler, nullableTCK.methodWithListNullableByteHandlerAsyncResult, nullableTCK.methodWithListNullableByteReturn);
shared test void testListNullableShort() => testListNullable(ArrayList { 520,null,1040 }, nullableTCK.methodWithListNullableShortParam, nullableTCK.methodWithListNullableShortHandler, nullableTCK.methodWithListNullableShortHandlerAsyncResult, nullableTCK.methodWithListNullableShortReturn);
shared test void testListNullableInteger() => testListNullable(ArrayList { 12345,null,54321 }, nullableTCK.methodWithListNullableIntegerParam, nullableTCK.methodWithListNullableIntegerHandler, nullableTCK.methodWithListNullableIntegerHandlerAsyncResult, nullableTCK.methodWithListNullableIntegerReturn);
shared test void testListNullableLong() => testListNullable(ArrayList { 123456789,null,987654321 }, nullableTCK.methodWithListNullableLongParam, nullableTCK.methodWithListNullableLongHandler, nullableTCK.methodWithListNullableLongHandlerAsyncResult, nullableTCK.methodWithListNullableLongReturn);
shared test void testListNullableFloat() => testListNullable(ArrayList { 1.1,null,3.3 }, nullableTCK.methodWithListNullableFloatParam, nullableTCK.methodWithListNullableFloatHandler, nullableTCK.methodWithListNullableFloatHandlerAsyncResult, nullableTCK.methodWithListNullableFloatReturn, assertFloatEquals);
shared test void testListNullableDouble() => testListNullable(ArrayList { 1.11,null,3.33 }, nullableTCK.methodWithListNullableDoubleParam, nullableTCK.methodWithListNullableDoubleHandler, nullableTCK.methodWithListNullableDoubleHandlerAsyncResult, nullableTCK.methodWithListNullableDoubleReturn, assertFloatEquals);
shared test void testListNullableBoolean() => testListNullable(ArrayList { true,null,false }, nullableTCK.methodWithListNullableBooleanParam, nullableTCK.methodWithListNullableBooleanHandler, nullableTCK.methodWithListNullableBooleanHandlerAsyncResult, nullableTCK.methodWithListNullableBooleanReturn);
shared test void testListNullableString() => testListNullable(ArrayList { "first",null,"third" }, nullableTCK.methodWithListNullableStringParam, nullableTCK.methodWithListNullableStringHandler, nullableTCK.methodWithListNullableStringHandlerAsyncResult, nullableTCK.methodWithListNullableStringReturn);
shared test void testListNullableChar() => testListNullable(ArrayList { 'F',null,'R' }, nullableTCK.methodWithListNullableCharParam, nullableTCK.methodWithListNullableCharHandler, nullableTCK.methodWithListNullableCharHandlerAsyncResult, nullableTCK.methodWithListNullableCharReturn);
shared test void testListNullableJsonObject() => testListNullable(ArrayList { JsonObject { "foo"->"bar" }, null, JsonObject { "juu"->3 } }, nullableTCK.methodWithListNullableJsonObjectParam, nullableTCK.methodWithListNullableJsonObjectHandler, nullableTCK.methodWithListNullableJsonObjectHandlerAsyncResult, nullableTCK.methodWithListNullableJsonObjectReturn);
shared test void testListNullableJsonArray() => testListNullable(ArrayList { JsonArray { "foo","bar" }, null, JsonArray { "juu" } }, nullableTCK.methodWithListNullableJsonArrayParam, nullableTCK.methodWithListNullableJsonArrayHandler, nullableTCK.methodWithListNullableJsonArrayHandlerAsyncResult, nullableTCK.methodWithListNullableJsonArrayReturn);
shared test void testListNullableApi() => testListNullable(ArrayList { RefedInterface1(RefedInterface1Impl().setString("first")), null, RefedInterface1(RefedInterface1Impl().setString("third")) }, nullableTCK.methodWithListNullableApiParam, nullableTCK.methodWithListNullableApiHandler, nullableTCK.methodWithListNullableApiHandlerAsyncResult, nullableTCK.methodWithListNullableApiReturn, assertRefedInterface1Equals);
shared test void testListNullableDataObject() => testListNullable(ArrayList { TestDataObject { foo="first"; bar=1; wibble=1.1; }, null, TestDataObject { foo="third"; bar=3; wibble=3.3; } }, nullableTCK.methodWithListNullableDataObjectParam, nullableTCK.methodWithListNullableDataObjectHandler, nullableTCK.methodWithListNullableDataObjectHandlerAsyncResult, nullableTCK.methodWithListNullableDataObjectReturn, assertTestDataObjectEquals);
shared test void testListNullableGenEnum() => testListNullable(ArrayList { bob, null, leland }, nullableTCK.methodWithListNullableGenEnumParam, nullableTCK.methodWithListNullableGenEnumHandler, nullableTCK.methodWithListNullableGenEnumHandlerAsyncResult, nullableTCK.methodWithListNullableGenEnumReturn);

shared void testListNullable<T>(
    List<T?> expected,
    Anything(List<T?>) listNullableParamFunction,
    Anything(Anything(List<T?>)) listNullableHandlerFunction,
    Anything(Anything(List<T?>|Throwable)) listNullableHandlerAsyncResultFunction,
    List<T?>() listNullableReturnFunction,
    Anything(Anything,Anything) check = assertEquals
  ) {
  void checkList(List<T?> actual) {
    assertEquals(expected.size, actual.size);
    for (index->item in expected.indexed) {
      if (exists item) {
        check(item, actual[index]);
      } else {
        assertNull(actual[index]);
      }
    }
  }
  listNullableParamFunction(expected);
  variable Integer count = 0;
  void a(List<T?> list) {
    checkList(list);
    count++;
  }
  listNullableHandlerFunction(a);
  void b(List<T?>|Throwable list) {
    assert(is List<T?> list);
    checkList(list);
    count++;
  }
  listNullableHandlerAsyncResultFunction(b);
  checkList(listNullableReturnFunction());
  assertEquals(2, count);
}

shared test void testSetNullableByte() => testSetNullable(ArrayList { 12.byte,null,24.byte }, nullableTCK.methodWithSetNullableByteParam, nullableTCK.methodWithSetNullableByteHandler, nullableTCK.methodWithSetNullableByteHandlerAsyncResult, nullableTCK.methodWithSetNullableByteReturn);
shared test void testSetNullableShort() => testSetNullable(ArrayList { 520,null,1040 }, nullableTCK.methodWithSetNullableShortParam, nullableTCK.methodWithSetNullableShortHandler, nullableTCK.methodWithSetNullableShortHandlerAsyncResult, nullableTCK.methodWithSetNullableShortReturn);
shared test void testSetNullableInteger() => testSetNullable(ArrayList { 12345,null,54321 }, nullableTCK.methodWithSetNullableIntegerParam, nullableTCK.methodWithSetNullableIntegerHandler, nullableTCK.methodWithSetNullableIntegerHandlerAsyncResult, nullableTCK.methodWithSetNullableIntegerReturn);
shared test void testSetNullableLong() => testSetNullable(ArrayList { 123456789,null,987654321 }, nullableTCK.methodWithSetNullableLongParam, nullableTCK.methodWithSetNullableLongHandler, nullableTCK.methodWithSetNullableLongHandlerAsyncResult, nullableTCK.methodWithSetNullableLongReturn);
shared test void testSetNullableFloat() => testSetNullable(ArrayList { 1.1,null,3.3 }, nullableTCK.methodWithSetNullableFloatParam, nullableTCK.methodWithSetNullableFloatHandler, nullableTCK.methodWithSetNullableFloatHandlerAsyncResult, nullableTCK.methodWithSetNullableFloatReturn, assertFloatEquals);
shared test void testSetNullableDouble() => testSetNullable(ArrayList { 1.11,null,3.33 }, nullableTCK.methodWithSetNullableDoubleParam, nullableTCK.methodWithSetNullableDoubleHandler, nullableTCK.methodWithSetNullableDoubleHandlerAsyncResult, nullableTCK.methodWithSetNullableDoubleReturn, assertFloatEquals);
shared test void testSetNullableBoolean() => testSetNullable(ArrayList { true,null,false }, nullableTCK.methodWithSetNullableBooleanParam, nullableTCK.methodWithSetNullableBooleanHandler, nullableTCK.methodWithSetNullableBooleanHandlerAsyncResult, nullableTCK.methodWithSetNullableBooleanReturn);
shared test void testSetNullableString() => testSetNullable(ArrayList { "first",null,"third" }, nullableTCK.methodWithSetNullableStringParam, nullableTCK.methodWithSetNullableStringHandler, nullableTCK.methodWithSetNullableStringHandlerAsyncResult, nullableTCK.methodWithSetNullableStringReturn);
shared test void testSetNullableChar() => testSetNullable(ArrayList { 'F',null,'R' }, nullableTCK.methodWithSetNullableCharParam, nullableTCK.methodWithSetNullableCharHandler, nullableTCK.methodWithSetNullableCharHandlerAsyncResult, nullableTCK.methodWithSetNullableCharReturn);
shared test void testSetNullableJsonObject() => testSetNullable(ArrayList { JsonObject { "foo"->"bar" }, null, JsonObject { "juu"->3 } }, nullableTCK.methodWithSetNullableJsonObjectParam, nullableTCK.methodWithSetNullableJsonObjectHandler, nullableTCK.methodWithSetNullableJsonObjectHandlerAsyncResult, nullableTCK.methodWithSetNullableJsonObjectReturn);
shared test void testSetNullableJsonArray() => testSetNullable(ArrayList { JsonArray { "foo","bar" }, null, JsonArray { "juu" } }, nullableTCK.methodWithSetNullableJsonArrayParam, nullableTCK.methodWithSetNullableJsonArrayHandler, nullableTCK.methodWithSetNullableJsonArrayHandlerAsyncResult, nullableTCK.methodWithSetNullableJsonArrayReturn);
shared test void testSetNullableApi() => testSetNullable(ArrayList { RefedInterface1(RefedInterface1Impl().setString("first")), null, RefedInterface1(RefedInterface1Impl().setString("third")) }, nullableTCK.methodWithSetNullableApiParam, nullableTCK.methodWithSetNullableApiHandler, nullableTCK.methodWithSetNullableApiHandlerAsyncResult, nullableTCK.methodWithSetNullableApiReturn, assertRefedInterface1Equals);
shared test void testSetNullableDataObject() => testSetNullable(ArrayList { TestDataObject { foo="first"; bar=1; wibble=1.1; }, null, TestDataObject { foo="third"; bar=3; wibble=3.3; } }, nullableTCK.methodWithSetNullableDataObjectParam, nullableTCK.methodWithSetNullableDataObjectHandler, nullableTCK.methodWithSetNullableDataObjectHandlerAsyncResult, nullableTCK.methodWithSetNullableDataObjectReturn, assertTestDataObjectEquals);
shared test void testSetNullableGenEnum() => testSetNullable(ArrayList { bob, null, leland }, nullableTCK.methodWithSetNullableGenEnumParam, nullableTCK.methodWithSetNullableGenEnumHandler, nullableTCK.methodWithSetNullableGenEnumHandlerAsyncResult, nullableTCK.methodWithSetNullableGenEnumReturn);

shared void testSetNullable<T>(
    List<T?> expected,
    Anything(Collection<T?>) setNullableParamFunction,
    Anything(Anything(Collection<T?>)) setNullableHandlerFunction,
    Anything(Anything(Collection<T?>|Throwable)) setNullableHandlerAsyncResultFunction,
    Collection<T?>() setNullableReturnFunction,
    Anything(Anything,Anything) check = assertEquals
  ) {
  void checkSet(Collection<T?> actual) {
    assertEquals(expected.size, actual.size);
    variable Integer count = 0;
    for (expectedItem in expected) {
      for (actualItem in actual) {
        try {
          if (exists expectedItem) {
            check(expectedItem, actualItem);
          } else {
            assertNull(actualItem);
          }
          count++;
          break;
        } catch (Throwable ignore) {
        }
      }
    }
    assertEquals(expected.size, count);
  }
  setNullableParamFunction(expected);
  variable Integer count = 0;
  void a(Collection<T?> set) {
    checkSet(set);
    count++;
  }
  setNullableHandlerFunction(a);
  void b(Collection<T?>|Throwable set) {
    assert(is Collection<T?> set);
    checkSet(set);
    count++;
  }
  setNullableHandlerAsyncResultFunction(b);
  checkSet(setNullableReturnFunction());
  assertEquals(2, count);
}

shared test void testMapNullableByte() => testMapNullable(ArrayList { 12.byte,null,24.byte }, nullableTCK.methodWithMapNullableByteParam, nullableTCK.methodWithMapNullableByteHandler, nullableTCK.methodWithMapNullableByteHandlerAsyncResult, nullableTCK.methodWithMapNullableByteReturn);
shared test void testMapNullableShort() => testMapNullable(ArrayList { 520,null,1040 }, nullableTCK.methodWithMapNullableShortParam, nullableTCK.methodWithMapNullableShortHandler, nullableTCK.methodWithMapNullableShortHandlerAsyncResult, nullableTCK.methodWithMapNullableShortReturn);
shared test void testMapNullableInteger() => testMapNullable(ArrayList { 12345,null,54321 }, nullableTCK.methodWithMapNullableIntegerParam, nullableTCK.methodWithMapNullableIntegerHandler, nullableTCK.methodWithMapNullableIntegerHandlerAsyncResult, nullableTCK.methodWithMapNullableIntegerReturn);
shared test void testMapNullableLong() => testMapNullable(ArrayList { 123456789,null,987654321 }, nullableTCK.methodWithMapNullableLongParam, nullableTCK.methodWithMapNullableLongHandler, nullableTCK.methodWithMapNullableLongHandlerAsyncResult, nullableTCK.methodWithMapNullableLongReturn);
shared test void testMapNullableFloat() => testMapNullable(ArrayList { 1.1,null,3.3 }, nullableTCK.methodWithMapNullableFloatParam, nullableTCK.methodWithMapNullableFloatHandler, nullableTCK.methodWithMapNullableFloatHandlerAsyncResult, nullableTCK.methodWithMapNullableFloatReturn, assertFloatEquals);
shared test void testMapNullableDouble() => testMapNullable(ArrayList { 1.11,null,3.33 }, nullableTCK.methodWithMapNullableDoubleParam, nullableTCK.methodWithMapNullableDoubleHandler, nullableTCK.methodWithMapNullableDoubleHandlerAsyncResult, nullableTCK.methodWithMapNullableDoubleReturn, assertFloatEquals);
shared test void testMapNullableBoolean() => testMapNullable(ArrayList { true, null, false }, nullableTCK.methodWithMapNullableBooleanParam, nullableTCK.methodWithMapNullableBooleanHandler, nullableTCK.methodWithMapNullableBooleanHandlerAsyncResult, nullableTCK.methodWithMapNullableBooleanReturn);
shared test void testMapNullableString() => testMapNullable(ArrayList { "first",null,"third" }, nullableTCK.methodWithMapNullableStringParam, nullableTCK.methodWithMapNullableStringHandler, nullableTCK.methodWithMapNullableStringHandlerAsyncResult, nullableTCK.methodWithMapNullableStringReturn);
shared test void testMapNullableChar() => testMapNullable(ArrayList { 'F',null,'R' }, nullableTCK.methodWithMapNullableCharParam, nullableTCK.methodWithMapNullableCharHandler, nullableTCK.methodWithMapNullableCharHandlerAsyncResult, nullableTCK.methodWithMapNullableCharReturn);
shared test void testMapNullableJsonObject() => testMapNullable(ArrayList { JsonObject { "foo"->"bar" }, null, JsonObject { "juu"->3 } }, nullableTCK.methodWithMapNullableJsonObjectParam, nullableTCK.methodWithMapNullableJsonObjectHandler, nullableTCK.methodWithMapNullableJsonObjectHandlerAsyncResult, nullableTCK.methodWithMapNullableJsonObjectReturn);
shared test void testMapNullableJsonArray() => testMapNullable(ArrayList { JsonArray { "foo","bar" }, null, JsonArray { "juu" } }, nullableTCK.methodWithMapNullableJsonArrayParam, nullableTCK.methodWithMapNullableJsonArrayHandler, nullableTCK.methodWithMapNullableJsonArrayHandlerAsyncResult, nullableTCK.methodWithMapNullableJsonArrayReturn);
shared test void testMapNullableApi() => testMapNullableIn(ArrayList { RefedInterface1(RefedInterface1Impl().setString("first")), null, RefedInterface1(RefedInterface1Impl().setString("third")) }, nullableTCK.methodWithMapNullableApiParam, assertRefedInterface1Equals);

shared void testMapNullable<T>(
    List<T> expected,
    Anything(Map<String, T?>) mapNullableParamFunction,
    Anything(Anything(Map<String, T?>)) mapNullableHandlerFunction,
    Anything(Anything(Map<String, T?>|Throwable)) mapNullableHandlerAsyncResultFunction,
    Map<String, T?>() mapNullableReturnFunction,
    Anything(Anything,Anything) check = assertEquals
    ) {
  testMapNullableIn(expected, mapNullableParamFunction, check);
  testMapNullableOut(expected, mapNullableHandlerFunction, mapNullableHandlerAsyncResultFunction, mapNullableReturnFunction, check);
}

shared void testMapNullableIn<T>(
    List<T> expected,
    Anything(Map<String, T?>) mapNullableParamFunction,
    Anything(Anything,Anything) check
    ) {
  HashMap<String, T> map = HashMap<String, T>();
  for (index->item in expected.indexed) {
    map.put("``(index + 1)``", item);
  }
  mapNullableParamFunction(map);
}

shared void testMapNullableOut<T>(
    List<T> expected,
    Anything(Anything(Map<String, T?>)) mapNullableHandlerFunction,
    Anything(Anything(Map<String, T?>|Throwable)) mapNullableHandlerAsyncResultFunction,
    Map<String, T?>() mapNullableReturnFunction,
    Anything(Anything,Anything) check
    ) {
  void checkMap(Anything actual) {
    assert(is Map<String, T?> actual);
    assertEquals(expected.size, actual.size);
    for (index->item in expected.indexed) {
      if (exists item) {
        check(item, actual["``(index + 1)``"]);
      } else {
        assertNull(actual["``(index + 1)``"]);
      }
    }
  }
  variable Integer count = 0;
  void a(Map<String, T?> set) {
    checkMap(set);
    count++;
  }
  mapNullableHandlerFunction(a);
  void b(Map<String, T?>|Throwable set) {
    checkMap(set);
    count++;
  }
  mapNullableHandlerAsyncResultFunction(b);
  checkMap(mapNullableReturnFunction());
  assertEquals(2, count);
}

shared test void testNullableHandler() {
  variable Integer count = 0;
  nullableTCK.methodWithNullableHandler(true, null);
  void a(String s) {
    assertEquals("the_string_value", s);
    count++;
  }
  nullableTCK.methodWithNullableHandler(false, a);
  nullableTCK.methodWithNullableHandlerAsyncResult(true, null);
  void b(String|Throwable s) {
    assertEquals("the_string_value", s);
    count++;
  }
  nullableTCK.methodWithNullableHandlerAsyncResult(false, b);
  assertEquals(2, count);
}

