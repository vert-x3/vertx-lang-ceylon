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
  KeyCertOptions_=KeyCertOptions
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.KeyCertOptions */
shared interface KeyCertOptions satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    return json;
  }
}

shared object keyCert {
}
