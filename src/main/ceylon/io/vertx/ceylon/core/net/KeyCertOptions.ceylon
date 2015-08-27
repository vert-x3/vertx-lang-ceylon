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
  KeyCertOptions_=KeyCertOptions
}
/* Generated from io.vertx.core.net.KeyCertOptions */
shared interface KeyCertOptions satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    return json;
  }
}
