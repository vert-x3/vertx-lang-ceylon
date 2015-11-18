import io.vertx.ceylon.auth.shiro {
  ShiroAuthRealmType,
  shiroAuthRealmType_=shiroAuthRealmType
}
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
import io.vertx.ext.auth.shiro {
  ShiroAuthOptions_=ShiroAuthOptions
}
import io.vertx.ceylon.auth.common {
  AuthOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.auth.shiro.ShiroAuthOptions */
" Shiro auth configuration options, see Vert.x Auth Shiro component and/or Apache Shiro project.\n"
shared class ShiroAuthOptions(
  shared JsonObject? config = null,
  shared ShiroAuthRealmType? type = null) extends AuthOptions() satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists config) {
      json.put("config", config);
    }
    if (exists type) {
      json.put("type", shiroAuthRealmType_.toString(type));
    }
    return json;
  }
}

shared object shiroAuthOptions {

  shared ShiroAuthOptions fromJson(JsonObject json) {
    JsonObject? config = json.getObjectOrNull("config");
    ShiroAuthRealmType? type = if (exists tmp = json.getStringOrNull("type")) then shiroAuthRealmType_.fromString(tmp) else null;
    return ShiroAuthOptions {
      config = config;
      type = type;
    };
  }

  shared object toJava extends Converter<ShiroAuthOptions, ShiroAuthOptions_>() {
    shared actual ShiroAuthOptions_ convert(ShiroAuthOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = ShiroAuthOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(ShiroAuthOptions obj) => obj.toJson();
}
