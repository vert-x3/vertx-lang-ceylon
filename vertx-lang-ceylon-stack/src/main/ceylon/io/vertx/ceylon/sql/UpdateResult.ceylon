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
import io.vertx.ext.sql {
  UpdateResult_=UpdateResult
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.sql.UpdateResult */
shared class UpdateResult(
  shared JsonArray? keys = null,
  shared Integer? updated = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists keys) {
      json.put("keys", keys);
    }
    if (exists updated) {
      json.put("updated", updated);
    }
    return json;
  }
}

shared object updateResult {

  shared UpdateResult fromJson(JsonObject json) {
    JsonArray? keys = json.getArrayOrNull("keys");
    Integer? updated = json.getIntegerOrNull("updated");
    return UpdateResult {
      keys = keys;
      updated = updated;
    };
  }

  shared object toCeylon extends Converter<UpdateResult_, UpdateResult>() {
    shared actual UpdateResult convert(UpdateResult_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<UpdateResult, UpdateResult_>() {
    shared actual UpdateResult_ convert(UpdateResult src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = UpdateResult_(json);
      return ret;
    }
  }
  shared JsonObject toJson(UpdateResult obj) => obj.toJson();
}
