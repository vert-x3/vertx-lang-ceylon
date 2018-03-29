import io.vertx.ext.web {
  Http2PushMapping_=Http2PushMapping
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
/* Generated from io.vertx.ext.web.Http2PushMapping */
shared class Http2PushMapping(
  shared String? extensionTarget = null,
  shared String? filePath = null,
  shared Boolean? noPush = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists extensionTarget) {
      json.put("extensionTarget", extensionTarget);
    }
    if (exists filePath) {
      json.put("filePath", filePath);
    }
    if (exists noPush) {
      json.put("noPush", noPush);
    }
    return json;
  }
}

shared object http2PushMapping {

  shared Http2PushMapping fromJson(JsonObject json) {
    String? extensionTarget = json.getStringOrNull("extensionTarget");
    String? filePath = json.getStringOrNull("filePath");
    Boolean? noPush = json.getBooleanOrNull("noPush");
    return Http2PushMapping {
      extensionTarget = extensionTarget;
      filePath = filePath;
      noPush = noPush;
    };
  }

  shared object toJava extends Converter<Http2PushMapping, Http2PushMapping_>() {
    shared actual Http2PushMapping_ convert(Http2PushMapping src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = Http2PushMapping_(json);
      return ret;
    }
  }
  shared JsonObject toJson(Http2PushMapping obj) => obj.toJson();
}
