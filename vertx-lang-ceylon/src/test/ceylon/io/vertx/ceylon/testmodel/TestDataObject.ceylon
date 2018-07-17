import io.vertx.codegen.testmodel {
  TestDataObject_=TestDataObject
}
import ceylon.time.iso8601 {
  parseZoneDateTime
}
import ceylon.json {
  JsonObject=Object,
  JsonArray=Array,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter,
  ToJava
}
import ceylon.collection {
  HashMap
}
import ceylon.time {
  Instant
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.codegen.testmodel.TestDataObject */
""
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

shared object testDataObject {

  shared TestDataObject fromJson(JsonObject json) {
    Integer? bar = json.getIntegerOrNull("bar");
    String? foo = json.getStringOrNull("foo");
    Float? wibble = json.getFloatOrNull("wibble");
    return TestDataObject {
      bar = bar;
      foo = foo;
      wibble = wibble;
    };
  }

  shared object toCeylon extends Converter<TestDataObject_, TestDataObject>() {
    shared actual TestDataObject convert(TestDataObject_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<TestDataObject, TestDataObject_>() {
    shared actual TestDataObject_ convert(TestDataObject src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = TestDataObject_(json);
      return ret;
    }
  }
  shared JsonObject toJson(TestDataObject obj) => obj.toJson();
}
