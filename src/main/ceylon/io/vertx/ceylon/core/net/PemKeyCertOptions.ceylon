import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
import io.vertx.core.net {
  PemKeyCertOptions_=PemKeyCertOptions
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.net.PemKeyCertOptions */
shared class PemKeyCertOptions(
  shared String? certPath = null,
  shared Buffer? certValue = null,
  shared String? keyPath = null,
  shared Buffer? keyValue = null) satisfies
  KeyCertOptions & BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists certPath) {
      json.put("certPath", certPath);
    }
    if (exists certValue) {
    }
    if (exists keyPath) {
      json.put("keyPath", keyPath);
    }
    if (exists keyValue) {
    }
    return json;
  }
}
