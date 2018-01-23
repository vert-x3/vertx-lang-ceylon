import io.vertx.ceylon.jwt {
  JWTOptions,
  jwtOptions_=jwtOptions
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
import io.vertx.ceylon.auth.common {
  KeyStoreOptions,
  keyStoreOptions_=keyStoreOptions,
  PubSecKeyOptions,
  pubSecKeyOptions_=pubSecKeyOptions,
  SecretOptions,
  secretOptions_=secretOptions
}
import io.vertx.ext.auth.jwt {
  JWTAuthOptions_=JWTAuthOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.auth.jwt.JWTAuthOptions */
" Options describing how an JWT Auth should behave.\n"
shared class JWTAuthOptions(
  shared JWTOptions? jwtOptions = null,
  shared KeyStoreOptions? keyStore = null,
  shared String? permissionsClaimKey = null,
  shared {PubSecKeyOptions*}? pubSecKeys = null,
  shared {SecretOptions*}? secrets = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists jwtOptions) {
      json.put("jwtOptions", jwtOptions.toJson());
    }
    if (exists keyStore) {
      json.put("keyStore", keyStore.toJson());
    }
    if (exists permissionsClaimKey) {
      json.put("permissionsClaimKey", permissionsClaimKey);
    }
    if (exists pubSecKeys) {
      json.put("pubSecKeys", JsonArray(pubSecKeys.map(pubSecKeyOptions_.toJson)));
    }
    if (exists secrets) {
      json.put("secrets", JsonArray(secrets.map(secretOptions_.toJson)));
    }
    return json;
  }
}

shared object jwtAuthOptions {

  shared JWTAuthOptions fromJson(JsonObject json) {
    JWTOptions? jwtOptions = if (exists tmp = json.getObjectOrNull("jwtOptions")) then jwtOptions_.fromJson(tmp) else null;
    KeyStoreOptions? keyStore = if (exists tmp = json.getObjectOrNull("keyStore")) then keyStoreOptions_.fromJson(tmp) else null;
    String? permissionsClaimKey = json.getStringOrNull("permissionsClaimKey");
    {PubSecKeyOptions*}? pubSecKeys = json.getArrayOrNull("pubSecKeys")?.objects?.map(pubSecKeyOptions_.fromJson);
    {SecretOptions*}? secrets = json.getArrayOrNull("secrets")?.objects?.map(secretOptions_.fromJson);
    return JWTAuthOptions {
      jwtOptions = jwtOptions;
      keyStore = keyStore;
      permissionsClaimKey = permissionsClaimKey;
      pubSecKeys = pubSecKeys;
      secrets = secrets;
    };
  }

  shared object toJava extends Converter<JWTAuthOptions, JWTAuthOptions_>() {
    shared actual JWTAuthOptions_ convert(JWTAuthOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = JWTAuthOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(JWTAuthOptions obj) => obj.toJson();
}
