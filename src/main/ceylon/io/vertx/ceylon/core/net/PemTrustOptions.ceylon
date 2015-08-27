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
  PemTrustOptions_=PemTrustOptions
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.net.PemTrustOptions */
shared class PemTrustOptions(
  shared String? certPaths = null,
  shared Buffer? certValues = null) satisfies
  TrustOptions & BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists certPaths) {
      json.put("certPaths", certPaths);
    }
    if (exists certValues) {
    }
    return json;
  }
}
