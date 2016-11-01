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

shared test void testMethodWithUserTypeParameterizedReturn() {
  value ret = genericsTCK.methodWithUserTypeParameterizedReturn();
  value val = ret.getValue();
  assertEquals("foo", val.getString());
  value refed = RefedInterface1(RefedInterface1Impl());
  refed.setString("the_string");
  ret.setValue(refed);
  value val2 = ret.getValue();
  assertEquals("the_string", val2.getString());
}

shared test void testMethodWithClassTypeParameterizedReturn() {
  value ret = genericsTCK.methodWithClassTypeParameterizedReturn<RefedInterface1>();
  value val = ret.getValue();
  assert(exists val);
  assertEquals("foo", val.getString());

  value ret2 = genericsTCK.methodWithClassTypeParameterizedReturn<JsonObject>();
  value val2 = ret2.getValue();
  assert(exists val2);
  assertEquals(JsonObject { "cheese"->"stilton" }, val2);
  ret2.setValue(JsonObject { "wine"->"condrieu" });
  assertEquals(JsonObject { "wine"->"condrieu" }, ret2.getValue());
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
