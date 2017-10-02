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
  " Set the audience list\n"
  shared {String*}? audience = null,
  " Set the audience list\n"
  shared {String*}? audiences = null,
  " Set whether expiration is ignored\n"
  shared Boolean? ignoreExpiration = null,
  " Set the issuer\n"
  shared String? issuer = null,
  shared KeyStoreOptions? keyStore = null,
  " Set the leeway in seconds\n"
  shared Integer? leeway = null,
  shared String? permissionsClaimKey = null,
  shared {PubSecKeyOptions*}? pubSecKeys = null,
  shared {SecretOptions*}? secrets = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists audience) {
      json.put("audience", JsonArray(audience));
    }
    if (exists audiences) {
      json.put("audiences", JsonArray(audiences));
    }
    if (exists ignoreExpiration) {
      json.put("ignoreExpiration", ignoreExpiration);
    }
    if (exists issuer) {
      json.put("issuer", issuer);
    }
    if (exists keyStore) {
      json.put("keyStore", keyStore.toJson());
    }
    if (exists leeway) {
      json.put("leeway", leeway);
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
    {String*}? audience = json.getArrayOrNull("audience")?.strings;
    {String*}? audiences = json.getArrayOrNull("audiences")?.strings;
    Boolean? ignoreExpiration = json.getBooleanOrNull("ignoreExpiration");
    String? issuer = json.getStringOrNull("issuer");
    KeyStoreOptions? keyStore = if (exists tmp = json.getObjectOrNull("keyStore")) then keyStoreOptions_.fromJson(tmp) else null;
    Integer? leeway = json.getIntegerOrNull("leeway");
    String? permissionsClaimKey = json.getStringOrNull("permissionsClaimKey");
    {PubSecKeyOptions*}? pubSecKeys = json.getArrayOrNull("pubSecKeys")?.objects?.map(pubSecKeyOptions_.fromJson);
    {SecretOptions*}? secrets = json.getArrayOrNull("secrets")?.objects?.map(secretOptions_.fromJson);
    return JWTAuthOptions {
      audience = audience;
      audiences = audiences;
      ignoreExpiration = ignoreExpiration;
      issuer = issuer;
      keyStore = keyStore;
      leeway = leeway;
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
