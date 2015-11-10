import io.vertx.codegen.testmodel {
  DataObjectWithLists_=DataObjectWithLists
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
import io.vertx.ceylon.codegen.testmodel {
  TestDataObject,
  testDataObject_=testDataObject,
  TestGenEnum,
  testGenEnum_=testGenEnum
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.codegen.testmodel.DataObjectWithLists */
shared class DataObjectWithLists(
  shared {Boolean*}? booleanValues = null,
  shared {TestDataObject*}? dataObjectValues = null,
  shared {Float*}? doubleValues = null,
  shared {String*}? enumValues = null,
  shared {Float*}? floatValues = null,
  shared {TestGenEnum*}? genEnumValues = null,
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

shared object dataObjectWithLists {

  shared DataObjectWithLists fromJson(JsonObject json) {
    {Boolean*}? booleanValues = json.getArrayOrNull("booleanValues")?.booleans;
    {TestDataObject*}? dataObjectValues = json.getArrayOrNull("dataObjectValues")?.objects?.map(testDataObject.fromJson);
    {Float*}? doubleValues = json.getArrayOrNull("doubleValues")?.floats;
    {String*}? enumValues = json.getArrayOrNull("enumValues")?.strings;
    {Float*}? floatValues = json.getArrayOrNull("floatValues")?.floats;
    {TestGenEnum*}? genEnumValues = json.getArrayOrNull("genEnumValues")?.strings?.map(testGenEnum.fromString);
    {Integer*}? integerValues = json.getArrayOrNull("integerValues")?.integers;
    {JsonArray*}? jsonArrayValues = json.getArrayOrNull("jsonArrayValues")?.arrays;
    {JsonObject*}? jsonObjectValues = json.getArrayOrNull("jsonObjectValues")?.objects;
    {Integer*}? longValues = json.getArrayOrNull("longValues")?.integers;
    {Integer*}? shortValues = json.getArrayOrNull("shortValues")?.integers;
    {String*}? stringValues = json.getArrayOrNull("stringValues")?.strings;
    return DataObjectWithLists {
      booleanValues = booleanValues;
      dataObjectValues = dataObjectValues;
      doubleValues = doubleValues;
      enumValues = enumValues;
      floatValues = floatValues;
      genEnumValues = genEnumValues;
      integerValues = integerValues;
      jsonArrayValues = jsonArrayValues;
      jsonObjectValues = jsonObjectValues;
      longValues = longValues;
      shortValues = shortValues;
      stringValues = stringValues;
    };
  }

  shared object toCeylon extends Converter<DataObjectWithLists_, DataObjectWithLists>() {
    shared actual DataObjectWithLists convert(DataObjectWithLists_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DataObjectWithLists, DataObjectWithLists_>() {
    shared actual DataObjectWithLists_ convert(DataObjectWithLists src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DataObjectWithLists_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DataObjectWithLists obj) => obj.toJson();
}
