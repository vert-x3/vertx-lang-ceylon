import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
import io.vertx.core.net {
  PemKeyCertOptions_=PemKeyCertOptions
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
