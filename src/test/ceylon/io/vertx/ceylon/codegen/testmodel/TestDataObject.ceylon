import io.vertx.codegen.testmodel {
  TestDataObject_=TestDataObject
}
import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
/* Generated from io.vertx.codegen.testmodel.TestDataObject */
shared class TestDataObject(
  shared Integer? bar = null,
  shared String? foo = null,
  shared Float? wibble = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists bar) {
      json.put("bar", bar);
    }
    if (exists foo) {
      json.put("foo", foo);
    }
    if (exists wibble) {
      json.put("wibble", wibble);
    }
    return json;
  }
}
