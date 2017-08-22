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
import io.vertx.ext.auth.jwt {
  JWTKeyStoreOptions_=JWTKeyStoreOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.auth.jwt.JWTKeyStoreOptions */
" Options describing how an JWT KeyStore should behave.\n"
shared class JWTKeyStoreOptions(
  shared String? password = null,
  shared String? path = null,
  shared String? type = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists password) {
      json.put("password", password);
    }
    if (exists path) {
      json.put("path", path);
    }
    if (exists type) {
      json.put("type", type);
    }
    return json;
  }
}

shared object jwtKeyStoreOptions {

  shared JWTKeyStoreOptions fromJson(JsonObject json) {
    String? password = json.getStringOrNull("password");
    String? path = json.getStringOrNull("path");
    String? type = json.getStringOrNull("type");
    return JWTKeyStoreOptions {
      password = password;
      path = path;
      type = type;
    };
  }

  shared object toJava extends Converter<JWTKeyStoreOptions, JWTKeyStoreOptions_>() {
    shared actual JWTKeyStoreOptions_ convert(JWTKeyStoreOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = JWTKeyStoreOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(JWTKeyStoreOptions obj) => obj.toJson();
}
