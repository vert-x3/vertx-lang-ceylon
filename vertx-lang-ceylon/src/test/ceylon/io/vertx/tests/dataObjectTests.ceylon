import io.vertx.ceylon.codegen.testmodel {
  DataObjectTCK, DataObjectCollection, TestDataObject, \iLAURA, \iBOB, \iMIKE, \iLELAND
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

shared test void testReadDataObjectCollection() {
  value dataObjectCollection = dataObjectTCK.dataObjectCollection;
  assert(exists booleanValues = dataObjectCollection.booleanValues);
  assertEquals(ArrayList{true,false,true}, ArrayList{*booleanValues});
  assert(exists shortValues = dataObjectCollection.shortValues);
  assertEquals(ArrayList{0,520,1040}, ArrayList{*shortValues});
  assert(exists integerValues = dataObjectCollection.integerValues);
  assertEquals(ArrayList{0,123456,654321}, ArrayList{*integerValues});
  assert(exists longValues = dataObjectCollection.longValues);
  assertEquals(ArrayList{0,123456789,987654321}, ArrayList{*longValues});
  assert(exists floatValues = dataObjectCollection.floatValues);
  assertEquals(ArrayList{1.1,2.2,3.3}, ArrayList{*floatValues});
  assert(exists doubleValues = dataObjectCollection.doubleValues);
  assertEquals(ArrayList{1.11,2.22,3.33}, ArrayList{*doubleValues});
  assert(exists stringValues = dataObjectCollection.stringValues);
  assertEquals(ArrayList{"stringValues1","stringValues2","stringValues3"}, ArrayList{*stringValues});
  assert(exists jsonObjectValues = dataObjectCollection.jsonObjectValues);
  assertEquals(ArrayList{JsonObject{"foo"->"eek"},JsonObject{"foo"->"wibble"}}, ArrayList{*jsonObjectValues});
  assert(exists jsonArrayValues = dataObjectCollection.jsonArrayValues);
  assertEquals(ArrayList{JsonArray{"foo"},JsonArray{"bar"}}, ArrayList{*jsonArrayValues});
  assert(exists dataObjectValues = dataObjectCollection.dataObjectValues?.sequence());
  assertEquals(2, dataObjectValues.size);
  assert(exists dataObject1 = dataObjectValues[0]);
  assert(exists dataObject2 = dataObjectValues[1]);
  assert(exists enumValues = dataObjectCollection.enumValues);
  assertEquals(ArrayList{"TIM", "JULIEN"}, ArrayList{*enumValues});
  assert(exists genEnumValues = dataObjectCollection.genEnumValues);
  assertEquals(ArrayList{\iBOB, \iLAURA}, ArrayList{*genEnumValues});
}

shared test void testWriteDataObjectCollection() {
  value dataObjectCollection = DataObjectCollection {
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
  dataObjectTCK.dataObjectCollection = dataObjectCollection;
}
