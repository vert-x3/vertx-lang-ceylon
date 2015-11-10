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
  PemTrustOptions_=PemTrustOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.PemTrustOptions */
shared class PemTrustOptions(
  shared {String*}? certPaths = null) satisfies
  TrustOptions & BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists certPaths) {
      json.put("certPaths", JsonArray(certPaths));
    }
    return json;
  }
}

shared object pemTrustOptions {

  shared object toJava extends Converter<PemTrustOptions, PemTrustOptions_>() {
    shared actual PemTrustOptions_ convert(PemTrustOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = PemTrustOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(PemTrustOptions obj) => obj.toJson();
}
