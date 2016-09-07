import io.vertx.ceylon.testmodel {
  TestDataObject,
  testDataObject_=testDataObject,
  TestGenEnum,
  testGenEnum_=testGenEnum
}
import io.vertx.codegen.testmodel {
  DataObjectWithValues_=DataObjectWithValues
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
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.codegen.testmodel.DataObjectWithValues */
""
shared class DataObjectWithValues(
  shared Boolean? booleanValue = null,
  shared Boolean? boxedBooleanValue = null,
  shared Float? boxedDoubleValue = null,
  shared Float? boxedFloatValue = null,
  shared Integer? boxedIntValue = null,
  shared Integer? boxedLongValue = null,
  shared Integer? boxedShortValue = null,
  shared TestDataObject? dataObjectValue = null,
  shared Float? doubleValue = null,
  shared String? enumValue = null,
  shared Float? floatValue = null,
  shared TestGenEnum? genEnumValue = null,
  shared Integer? intValue = null,
  shared JsonArray? jsonArrayValue = null,
  shared JsonObject? jsonObjectValue = null,
  shared Integer? longValue = null,
  shared Integer? shortValue = null,
  shared String? stringValue = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists booleanValue) {
      json.put("booleanValue", booleanValue);
    }
    if (exists boxedBooleanValue) {
      json.put("boxedBooleanValue", boxedBooleanValue);
    }
    if (exists boxedDoubleValue) {
      json.put("boxedDoubleValue", boxedDoubleValue);
    }
    if (exists boxedFloatValue) {
      json.put("boxedFloatValue", boxedFloatValue);
    }
    if (exists boxedIntValue) {
      json.put("boxedIntValue", boxedIntValue);
    }
    if (exists boxedLongValue) {
      json.put("boxedLongValue", boxedLongValue);
    }
    if (exists boxedShortValue) {
      json.put("boxedShortValue", boxedShortValue);
    }
    if (exists dataObjectValue) {
      json.put("dataObjectValue", dataObjectValue.toJson());
    }
    if (exists doubleValue) {
      json.put("doubleValue", doubleValue);
    }
    if (exists enumValue) {
      json.put("enumValue", enumValue);
    }
    if (exists floatValue) {
      json.put("floatValue", floatValue);
    }
    if (exists genEnumValue) {
      json.put("genEnumValue", testGenEnum_.toString(genEnumValue));
    }
    if (exists intValue) {
      json.put("intValue", intValue);
    }
    if (exists jsonArrayValue) {
      json.put("jsonArrayValue", jsonArrayValue);
    }
    if (exists jsonObjectValue) {
      json.put("jsonObjectValue", jsonObjectValue);
    }
    if (exists longValue) {
      json.put("longValue", longValue);
    }
    if (exists shortValue) {
      json.put("shortValue", shortValue);
    }
    if (exists stringValue) {
      json.put("stringValue", stringValue);
    }
    return json;
  }
}

shared object dataObjectWithValues {

  shared DataObjectWithValues fromJson(JsonObject json) {
    Boolean? booleanValue = json.getBooleanOrNull("booleanValue");
    Boolean? boxedBooleanValue = json.getBooleanOrNull("boxedBooleanValue");
    Float? boxedDoubleValue = json.getFloatOrNull("boxedDoubleValue");
    Float? boxedFloatValue = json.getFloatOrNull("boxedFloatValue");
    Integer? boxedIntValue = json.getIntegerOrNull("boxedIntValue");
    Integer? boxedLongValue = json.getIntegerOrNull("boxedLongValue");
    Integer? boxedShortValue = json.getIntegerOrNull("boxedShortValue");
    TestDataObject? dataObjectValue = if (exists tmp = json.getObjectOrNull("dataObjectValue")) then testDataObject_.fromJson(tmp) else null;
    Float? doubleValue = json.getFloatOrNull("doubleValue");
    String? enumValue = json.getStringOrNull("enumValue");
    Float? floatValue = json.getFloatOrNull("floatValue");
    TestGenEnum? genEnumValue = if (exists tmp = json.getStringOrNull("genEnumValue")) then testGenEnum_.fromString(tmp) else null;
    Integer? intValue = json.getIntegerOrNull("intValue");
    JsonArray? jsonArrayValue = json.getArrayOrNull("jsonArrayValue");
    JsonObject? jsonObjectValue = json.getObjectOrNull("jsonObjectValue");
    Integer? longValue = json.getIntegerOrNull("longValue");
    Integer? shortValue = json.getIntegerOrNull("shortValue");
    String? stringValue = json.getStringOrNull("stringValue");
    return DataObjectWithValues {
      booleanValue = booleanValue;
      boxedBooleanValue = boxedBooleanValue;
      boxedDoubleValue = boxedDoubleValue;
      boxedFloatValue = boxedFloatValue;
      boxedIntValue = boxedIntValue;
      boxedLongValue = boxedLongValue;
      boxedShortValue = boxedShortValue;
      dataObjectValue = dataObjectValue;
      doubleValue = doubleValue;
      enumValue = enumValue;
      floatValue = floatValue;
      genEnumValue = genEnumValue;
      intValue = intValue;
      jsonArrayValue = jsonArrayValue;
      jsonObjectValue = jsonObjectValue;
      longValue = longValue;
      shortValue = shortValue;
      stringValue = stringValue;
    };
  }

  shared object toCeylon extends Converter<DataObjectWithValues_, DataObjectWithValues>() {
    shared actual DataObjectWithValues convert(DataObjectWithValues_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DataObjectWithValues, DataObjectWithValues_>() {
    shared actual DataObjectWithValues_ convert(DataObjectWithValues src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DataObjectWithValues_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DataObjectWithValues obj) => obj.toJson();
}
