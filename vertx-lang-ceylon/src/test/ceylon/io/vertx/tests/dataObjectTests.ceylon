import io.vertx.ceylon.codegen.testmodel {
  DataObjectTCK, DataObjectWithLists, TestDataObject, \iLAURA, \iBOB, \iMIKE, \iLELAND
}
import io.vertx.codegen.testmodel {
  DataObjectTCKImpl
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

DataObjectTCK dataObjectTCK = DataObjectTCK(DataObjectTCKImpl());

shared test void testReadDataObjectWithLists() {
  value dataObject = dataObjectTCK.dataObjectWithLists;
  assert(exists booleanValues = dataObject.booleanValues);
  assertEquals(ArrayList{true,false,true}, ArrayList{*booleanValues});
  assert(exists shortValues = dataObject.shortValues);
  assertEquals(ArrayList{0,520,1040}, ArrayList{*shortValues});
  assert(exists integerValues = dataObject.integerValues);
  assertEquals(ArrayList{0,123456,654321}, ArrayList{*integerValues});
  assert(exists longValues = dataObject.longValues);
  assertEquals(ArrayList{0,123456789,987654321}, ArrayList{*longValues});
  assert(exists floatValues = dataObject.floatValues);
  assertEquals(ArrayList{1.1,2.2,3.3}, ArrayList{*floatValues});
  assert(exists doubleValues = dataObject.doubleValues);
  assertEquals(ArrayList{1.11,2.22,3.33}, ArrayList{*doubleValues});
  assert(exists stringValues = dataObject.stringValues);
  assertEquals(ArrayList{"stringValues1","stringValues2","stringValues3"}, ArrayList{*stringValues});
  assert(exists jsonObjectValues = dataObject.jsonObjectValues);
  assertEquals(ArrayList{JsonObject{"foo"->"eek"},JsonObject{"foo"->"wibble"}}, ArrayList{*jsonObjectValues});
  assert(exists jsonArrayValues = dataObject.jsonArrayValues);
  assertEquals(ArrayList{JsonArray{"foo"},JsonArray{"bar"}}, ArrayList{*jsonArrayValues});
  assert(exists dataObjectValues = dataObject.dataObjectValues?.sequence());
  assertEquals(2, dataObjectValues.size);
  assert(exists dataObject1 = dataObjectValues[0]);
  assert(exists dataObject2 = dataObjectValues[1]);
  assert(exists enumValues = dataObject.enumValues);
  assertEquals(ArrayList{"TIM", "JULIEN"}, ArrayList{*enumValues});
  assert(exists genEnumValues = dataObject.genEnumValues);
  assertEquals(ArrayList{\iBOB, \iLAURA}, ArrayList{*genEnumValues});
}

shared test void testWriteDataObjectWithLists() {
  value dataObject = DataObjectWithLists {
    booleanValues = { true, false, true };
    shortValues = { 0, 520, 1040 };
    integerValues = { 0, 123456, 654321 };
    longValues = { 0, 123456789, 987654321 };
    floatValues = { 1.1, 2.2, 3.3 };
    doubleValues = { 1.11, 2.22, 3.33 };
    jsonObjectValues = {JsonObject{"foo"->"eek"},JsonObject{"foo"->"wibble"}};
    jsonArrayValues = {JsonArray{"foo"},JsonArray{"bar"}};
    stringValues = { "stringValues1", "stringValues2", "stringValues3" };
    dataObjectValues = { TestDataObject { foo="1"; bar=1; wibble=1.1; }, TestDataObject { foo="2"; bar=2; wibble=2.2; } };
    enumValues = { "TIM", "JULIEN" };
    genEnumValues = { \iBOB, \iLAURA };
  };
  dataObjectTCK.dataObjectWithLists = dataObject;
}
