import io.vertx.codegen.testmodel {
  DataObjectCollection_=DataObjectCollection
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
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.codegen.testmodel.DataObjectCollection */
shared class DataObjectCollection(
  shared {Boolean*}? booleanValues = null,
  shared {Float*}? doubleValues = null,
  shared {Float*}? floatValues = null,
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
    if (exists doubleValues) {
      json.put("doubleValues", JsonArray(doubleValues));
    }
    if (exists floatValues) {
      json.put("floatValues", JsonArray(floatValues));
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

shared object dataObject {

  shared object toCeylon extends Converter<DataObjectCollection_, DataObjectCollection>() {
    shared actual DataObjectCollection convert(DataObjectCollection_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      {Boolean*}? booleanValues = json.getArrayOrNull("booleanValues")?.booleans;
      {Float*}? doubleValues = json.getArrayOrNull("doubleValues")?.floats;
      {Float*}? floatValues = json.getArrayOrNull("floatValues")?.floats;
      {Integer*}? integerValues = json.getArrayOrNull("integerValues")?.integers;
      {JsonArray*}? jsonArrayValues = json.getArrayOrNull("jsonArrayValues")?.arrays;
      {JsonObject*}? jsonObjectValues = json.getArrayOrNull("jsonObjectValues")?.objects;
      {Integer*}? longValues = json.getArrayOrNull("longValues")?.integers;
      {Integer*}? shortValues = json.getArrayOrNull("shortValues")?.integers;
      {String*}? stringValues = json.getArrayOrNull("stringValues")?.strings;
      return DataObjectCollection {
        booleanValues = booleanValues;
        doubleValues = doubleValues;
        floatValues = floatValues;
        integerValues = integerValues;
        jsonArrayValues = jsonArrayValues;
        jsonObjectValues = jsonObjectValues;
        longValues = longValues;
        shortValues = shortValues;
        stringValues = stringValues;
      };
    }
  }

  shared object toJava extends Converter<DataObjectCollection, DataObjectCollection_>() {
    shared actual DataObjectCollection_ convert(DataObjectCollection src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DataObjectCollection_(json);
      return ret;
    }
  }
}
