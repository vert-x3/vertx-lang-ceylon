import ceylon.json {
  JsonObject=Object,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter
}
import io.vertx.core.net {
  PemTrustOptions_=PemTrustOptions
}
/* Generated from io.vertx.core.net.PemTrustOptions */
shared class PemTrustOptions(
  shared String? certPaths = null) satisfies
  TrustOptions & BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists certPaths) {
      json.put("certPaths", certPaths);
    }
    return json;
  }
}
