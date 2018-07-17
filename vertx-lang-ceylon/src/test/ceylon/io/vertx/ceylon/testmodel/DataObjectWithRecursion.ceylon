import io.vertx.ceylon.testmodel {
  DataObjectWithRecursion,
  dataObjectWithRecursion_=dataObjectWithRecursion
}
import io.vertx.codegen.testmodel {
  DataObjectWithRecursion_=DataObjectWithRecursion
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
/* Generated from io.vertx.codegen.testmodel.DataObjectWithRecursion */
""
shared class DataObjectWithRecursion(
  shared String? data = null,
  shared DataObjectWithRecursion? next = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists data) {
      json.put("data", data);
    }
    if (exists next) {
      json.put("next", next.toJson());
    }
    return json;
  }
}

shared object dataObjectWithRecursion {

  shared DataObjectWithRecursion fromJson(JsonObject json) {
    String? data = json.getStringOrNull("data");
    DataObjectWithRecursion? next = if (exists tmp = json.getObjectOrNull("next")) then this.fromJson(tmp) else null;
    return DataObjectWithRecursion {
      data = data;
      next = next;
    };
  }

  shared object toCeylon extends Converter<DataObjectWithRecursion_, DataObjectWithRecursion>() {
    shared actual DataObjectWithRecursion convert(DataObjectWithRecursion_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DataObjectWithRecursion, DataObjectWithRecursion_>() {
    shared actual DataObjectWithRecursion_ convert(DataObjectWithRecursion src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DataObjectWithRecursion_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DataObjectWithRecursion obj) => obj.toJson();
}
