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
import io.vertx.core.http {
  GoAway_=GoAway
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.http.GoAway */
" A  frame.\n"
shared class GoAway(
  " @return the  error code\n"
  shared Integer? errorCode = null,
  " Set the last stream id.\n"
  shared Integer? lastStreamId = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists errorCode) {
      json.put("errorCode", errorCode);
    }
    if (exists lastStreamId) {
      json.put("lastStreamId", lastStreamId);
    }
    return json;
  }
}

shared object goAway {

  shared GoAway fromJson(JsonObject json) {
    Integer? errorCode = json.getIntegerOrNull("errorCode");
    Integer? lastStreamId = json.getIntegerOrNull("lastStreamId");
    return GoAway {
      errorCode = errorCode;
      lastStreamId = lastStreamId;
    };
  }

  shared object toCeylon extends Converter<GoAway_, GoAway>() {
    shared actual GoAway convert(GoAway_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<GoAway, GoAway_>() {
    shared actual GoAway_ convert(GoAway src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = GoAway_(json);
      return ret;
    }
  }
  shared JsonObject toJson(GoAway obj) => obj.toJson();
}
