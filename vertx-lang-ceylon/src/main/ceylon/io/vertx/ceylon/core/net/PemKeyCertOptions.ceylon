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
import io.vertx.core.net {
  PemKeyCertOptions_=PemKeyCertOptions
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.PemKeyCertOptions */
shared class PemKeyCertOptions(
  shared String? certPath = null,
  shared String? keyPath = null) satisfies
  KeyCertOptions & BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists certPath) {
      json.put("certPath", certPath);
    }
    if (exists keyPath) {
      json.put("keyPath", keyPath);
    }
    return json;
  }
}

shared object pemKeyCertOptions {

  shared object toJava extends Converter<PemKeyCertOptions, PemKeyCertOptions_>() {
    shared actual PemKeyCertOptions_ convert(PemKeyCertOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = PemKeyCertOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(PemKeyCertOptions obj) => obj.toJson();
}
