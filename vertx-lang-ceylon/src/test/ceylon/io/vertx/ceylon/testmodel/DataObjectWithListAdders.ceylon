import io.vertx.ceylon.testmodel {
  TestDataObject,
  testDataObject_=testDataObject,
  TestGenEnum,
  testGenEnum_=testGenEnum
}
import io.vertx.codegen.testmodel {
  DataObjectWithListAdders_=DataObjectWithListAdders
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
/* Generated from io.vertx.codegen.testmodel.DataObjectWithListAdders */
""
shared class DataObjectWithListAdders(
  shared {Boolean*}? booleanValues = null,
  shared {TestDataObject*}? dataObjectValues = null,
  shared {Float*}? doubleValues = null,
  shared {String*}? enumValues = null,
  shared {Float*}? floatValues = null,
  shared {TestGenEnum*}? genEnumValues = null,
  shared {String*}? instantValues = null,
  shared {Integer*}? integerValues = null,
  shared {JsonArray*}? jsonArrayValues = null,
  shared {JsonObject*}? jsonObjectValues = null,
  shared {Integer*}? longValues = null,
  shared {Integer*}? shortValues = null,
  shared {String*}? stringValues = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists booleanValues) {
      json.put("booleanValues", JsonArray(booleanValues));
    }
    if (exists dataObjectValues) {
      json.put("dataObjectValues", JsonArray(dataObjectValues.map(testDataObject_.toJson)));
    }
    if (exists doubleValues) {
      json.put("doubleValues", JsonArray(doubleValues));
    }
    if (exists enumValues) {
      json.put("enumValues", JsonArray(enumValues));
    }
    if (exists floatValues) {
      json.put("floatValues", JsonArray(floatValues));
    }
    if (exists genEnumValues) {
      json.put("genEnumValues", JsonArray(genEnumValues.map(testGenEnum_.toString)));
    }
    if (exists instantValues) {
      json.put("instantValues", JsonArray(instantValues));
    }
    if (exists integerValues) {
      json.put("integerValues", JsonArray(integerValues));
    }
    if (exists jsonArrayValues) {
      json.put("jsonArrayValues", JsonArray(jsonArrayValues));
    }
    if (exists jsonObjectValues) {
      json.put("jsonObjectValues", JsonArray(jsonObjectValues));
    }
    if (exists longValues) {
      json.put("longValues", JsonArray(longValues));
    }
    if (exists shortValues) {
      json.put("shortValues", JsonArray(shortValues));
    }
    if (exists stringValues) {
      json.put("stringValues", JsonArray(stringValues));
    }
    return json;
  }
}

shared object dataObjectWithListAdders {

  shared DataObjectWithListAdders fromJson(JsonObject json) {
    {Boolean*}? booleanValues = json.getArrayOrNull("booleanValues")?.booleans;
    {TestDataObject*}? dataObjectValues = json.getArrayOrNull("dataObjectValues")?.objects?.map(testDataObject_.fromJson);
    {Float*}? doubleValues = json.getArrayOrNull("doubleValues")?.floats;
    {String*}? enumValues = json.getArrayOrNull("enumValues")?.strings;
    {Float*}? floatValues = json.getArrayOrNull("floatValues")?.floats;
    {TestGenEnum*}? genEnumValues = json.getArrayOrNull("genEnumValues")?.strings?.map(testGenEnum_.fromString);
    {String*}? instantValues = json.getArrayOrNull("instantValues")?.strings;
    {Integer*}? integerValues = json.getArrayOrNull("integerValues")?.integers;
    {JsonArray*}? jsonArrayValues = json.getArrayOrNull("jsonArrayValues")?.arrays;
    {JsonObject*}? jsonObjectValues = json.getArrayOrNull("jsonObjectValues")?.objects;
    {Integer*}? longValues = json.getArrayOrNull("longValues")?.integers;
    {Integer*}? shortValues = json.getArrayOrNull("shortValues")?.integers;
    {String*}? stringValues = json.getArrayOrNull("stringValues")?.strings;
    return DataObjectWithListAdders {
      booleanValues = booleanValues;
      dataObjectValues = dataObjectValues;
      doubleValues = doubleValues;
      enumValues = enumValues;
      floatValues = floatValues;
      genEnumValues = genEnumValues;
      instantValues = instantValues;
      integerValues = integerValues;
      jsonArrayValues = jsonArrayValues;
      jsonObjectValues = jsonObjectValues;
      longValues = longValues;
      shortValues = shortValues;
      stringValues = stringValues;
    };
  }

  shared object toCeylon extends Converter<DataObjectWithListAdders_, DataObjectWithListAdders>() {
    shared actual DataObjectWithListAdders convert(DataObjectWithListAdders_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DataObjectWithListAdders, DataObjectWithListAdders_>() {
    shared actual DataObjectWithListAdders_ convert(DataObjectWithListAdders src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DataObjectWithListAdders_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DataObjectWithListAdders obj) => obj.toJson();
}
