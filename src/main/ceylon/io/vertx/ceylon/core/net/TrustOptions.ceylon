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
  TrustOptions_=TrustOptions
}
/* Generated from io.vertx.core.net.TrustOptions */
shared interface TrustOptions satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    return json;
  }
}
