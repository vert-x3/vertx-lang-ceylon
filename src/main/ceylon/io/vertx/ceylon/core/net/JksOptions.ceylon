import ceylon.json {
  JsonObject=Object,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter,
  ToJava
}
import io.vertx.core.net {
  JksOptions_=JksOptions
}
import io.vertx.core.json {
  JsonObject_=JsonObject
}
/* Generated from io.vertx.core.net.JksOptions */
shared class JksOptions(
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

shared object toJavaJksOptions extends Converter<JksOptions, JksOptions_>() {
  shared actual JksOptions_ convert(JksOptions src) {
    // Todo : make optimized version without json
    value json = JsonObject_(src.toJson().string);
    value ret = JksOptions_(json);
    return ret;
  }
}
