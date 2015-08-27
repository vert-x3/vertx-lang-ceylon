import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
import io.vertx.core.net {
  PfxOptions_=PfxOptions
}
/* Generated from io.vertx.core.net.PfxOptions */
shared class PfxOptions(
  shared String? password = null,
  shared String? path = null) satisfies
  KeyCertOptions &
  TrustOptions & BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists password) {
      json.put("password", password);
    }
    if (exists path) {
      json.put("path", path);
    }
    return json;
  }
}
shared PfxOptions toPfxOptions(JsonObject json) {
  String? password = json.getStringOrNull("password");
  String? path = json.getStringOrNull("path");
  return PfxOptions {
    password = password;
    path = path;
  };
}
