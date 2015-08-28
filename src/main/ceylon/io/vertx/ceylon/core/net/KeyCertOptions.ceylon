import ceylon.json {
  JsonObject=Object,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter
}
import io.vertx.core.net {
  KeyCertOptions_=KeyCertOptions
}
/* Generated from io.vertx.core.net.KeyCertOptions */
shared interface KeyCertOptions satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    return json;
  }
}
