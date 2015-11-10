import io.vertx.codegen.testmodel {
  DataObjectWithMaps_=DataObjectWithMaps
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
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.codegen.testmodel.DataObjectWithMaps */
shared class DataObjectWithMaps(
  shared Map<String, Boolean>? booleanValues = null,
  shared Map<String, TestDataObject>? dataObjectValues = null,
  shared Map<String, Float>? doubleValues = null,
  shared Map<String, String>? enumValues = null,
  shared Map<String, Float>? floatValues = null,
  shared Map<String, TestGenEnum>? genEnumValues = null,
  shared Map<String, Integer>? integerValues = null,
  shared Map<String, JsonArray>? jsonArrayValues = null,
  shared Map<String, JsonObject>? jsonObjectValues = null,
  shared Map<String, Integer>? longValues = null,
  shared Map<String, Integer>? shortValues = null,
  shared Map<String, String>? stringValues = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists booleanValues) {
      json.put("booleanValues", JsonObject(booleanValues));
    }
    if (exists dataObjectValues) {
      json.put("dataObjectValues", JsonObject{for(k->v in dataObjectValues) k->testDataObject_.toJson(v)});
    }
    if (exists doubleValues) {
      json.put("doubleValues", JsonObject(doubleValues));
    }
    if (exists enumValues) {
      json.put("enumValues", JsonObject(enumValues));
    }
    if (exists floatValues) {
      json.put("floatValues", JsonObject(floatValues));
    }
    if (exists genEnumValues) {
      json.put("genEnumValues", JsonObject{for(k->v in genEnumValues) k->testGenEnum_.toString(v)});
    }
    if (exists integerValues) {
      json.put("integerValues", JsonObject(integerValues));
    }
    if (exists jsonArrayValues) {
      json.put("jsonArrayValues", JsonObject(jsonArrayValues));
    }
    if (exists jsonObjectValues) {
      json.put("jsonObjectValues", JsonObject(jsonObjectValues));
    }
    if (exists longValues) {
      json.put("longValues", JsonObject(longValues));
    }
    if (exists shortValues) {
      json.put("shortValues", JsonObject(shortValues));
    }
    if (exists stringValues) {
      json.put("stringValues", JsonObject(stringValues));
    }
    return json;
  }
}

shared object dataObjectWithMaps {

  shared DataObjectWithMaps fromJson(JsonObject json) {
    Map<String, Boolean>? booleanValues = if (exists tmp = json.getObjectOrNull("booleanValues")) then HashMap { for(key->val in tmp) if (is Boolean val) key->val } else null;
    Map<String, TestDataObject>? dataObjectValues = if (exists tmp = json.getObjectOrNull("dataObjectValues")) then HashMap { for(key->val in tmp) if (is JsonObject val) key->testDataObject_.fromJson(val) } else null;
    Map<String, Float>? doubleValues = if (exists tmp = json.getObjectOrNull("doubleValues")) then HashMap { for(key->val in tmp) if (is Float val) key->val } else null;
    Map<String, String>? enumValues = if (exists tmp = json.getObjectOrNull("enumValues")) then HashMap { for(key->val in tmp) if (is String val) key->val } else null;
    Map<String, Float>? floatValues = if (exists tmp = json.getObjectOrNull("floatValues")) then HashMap { for(key->val in tmp) if (is Float val) key->val } else null;
    Map<String, TestGenEnum>? genEnumValues = if (exists tmp = json.getObjectOrNull("genEnumValues")) then HashMap { for(key->val in tmp) if (is String val) key->testGenEnum_.fromString(val) } else null;
    Map<String, Integer>? integerValues = if (exists tmp = json.getObjectOrNull("integerValues")) then HashMap { for(key->val in tmp) if (is Integer val) key->val } else null;
    Map<String, JsonArray>? jsonArrayValues = if (exists tmp = json.getObjectOrNull("jsonArrayValues")) then HashMap { for(key->val in tmp) if (is JsonArray val) key->val } else null;
    Map<String, JsonObject>? jsonObjectValues = if (exists tmp = json.getObjectOrNull("jsonObjectValues")) then HashMap { for(key->val in tmp) if (is JsonObject val) key->val } else null;
    Map<String, Integer>? longValues = if (exists tmp = json.getObjectOrNull("longValues")) then HashMap { for(key->val in tmp) if (is Integer val) key->val } else null;
    Map<String, Integer>? shortValues = if (exists tmp = json.getObjectOrNull("shortValues")) then HashMap { for(key->val in tmp) if (is Integer val) key->val } else null;
    Map<String, String>? stringValues = if (exists tmp = json.getObjectOrNull("stringValues")) then HashMap { for(key->val in tmp) if (is String val) key->val } else null;
    return DataObjectWithMaps {
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

  shared object toCeylon extends Converter<DataObjectWithMaps_, DataObjectWithMaps>() {
    shared actual DataObjectWithMaps convert(DataObjectWithMaps_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DataObjectWithMaps, DataObjectWithMaps_>() {
    shared actual DataObjectWithMaps_ convert(DataObjectWithMaps src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DataObjectWithMaps_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DataObjectWithMaps obj) => obj.toJson();
}
