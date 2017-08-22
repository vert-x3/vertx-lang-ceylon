import io.vertx.ext.auth {
  PubSecKeyOptions_=PubSecKeyOptions
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
/* Generated from io.vertx.ext.auth.PubSecKeyOptions */
" Options describing how a Cryptographic Key.\n"
shared class PubSecKeyOptions(
  shared String? publicKey = null,
  shared String? secretKey = null,
  shared String? type = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists publicKey) {
      json.put("publicKey", publicKey);
    }
    if (exists secretKey) {
      json.put("secretKey", secretKey);
    }
    if (exists type) {
      json.put("type", type);
    }
    return json;
  }
}

shared object pubSecKeyOptions {

  shared PubSecKeyOptions fromJson(JsonObject json) {
    String? publicKey = json.getStringOrNull("publicKey");
    String? secretKey = json.getStringOrNull("secretKey");
    String? type = json.getStringOrNull("type");
    return PubSecKeyOptions {
      publicKey = publicKey;
      secretKey = secretKey;
      type = type;
    };
  }

  shared object toJava extends Converter<PubSecKeyOptions, PubSecKeyOptions_>() {
    shared actual PubSecKeyOptions_ convert(PubSecKeyOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = PubSecKeyOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(PubSecKeyOptions obj) => obj.toJson();
}
