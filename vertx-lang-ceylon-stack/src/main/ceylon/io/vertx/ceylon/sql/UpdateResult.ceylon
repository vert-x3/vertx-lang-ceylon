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
" Represents the result of an update/insert/delete operation on the database.\n <p>\n The number of rows updated is available with [getUpdated](UpdateResult.type.html#getUpdated) and any generated\n keys are available with [getKeys](UpdateResult.type.html#getKeys).\n"
shared class UpdateResult(
  " Get any generated keys\n"
  shared JsonArray? keys = null,
  " Get the number of rows updated\n"
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
