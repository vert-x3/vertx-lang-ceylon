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
  JWTOptions_=JWTOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.auth.jwt.JWTOptions */
shared class JWTOptions(
  shared String? algorithm = null,
  shared {String*}? audience = null,
  shared {String*}? audiences = null,
  shared Integer? expiresInMinutes = null,
  shared Integer? expiresInSeconds = null,
  shared String? issuer = null,
  shared Boolean? noTimestamp = null,
  shared {String*}? permissions = null,
  shared String? subject = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists algorithm) {
      json.put("algorithm", algorithm);
    }
    if (exists audience) {
      json.put("audience", JsonArray(audience));
    }
    if (exists audiences) {
      json.put("audiences", JsonArray(audiences));
    }
    if (exists expiresInMinutes) {
      json.put("expiresInMinutes", expiresInMinutes);
    }
    if (exists expiresInSeconds) {
      json.put("expiresInSeconds", expiresInSeconds);
    }
    if (exists issuer) {
      json.put("issuer", issuer);
    }
    if (exists noTimestamp) {
      json.put("noTimestamp", noTimestamp);
    }
    if (exists permissions) {
      json.put("permissions", JsonArray(permissions));
    }
    if (exists subject) {
      json.put("subject", subject);
    }
    return json;
  }
}

shared object jwtOptions {

  shared JWTOptions fromJson(JsonObject json) {
    String? algorithm = json.getStringOrNull("algorithm");
    {String*}? audience = json.getArrayOrNull("audience")?.strings;
    {String*}? audiences = json.getArrayOrNull("audiences")?.strings;
    Integer? expiresInMinutes = json.getIntegerOrNull("expiresInMinutes");
    Integer? expiresInSeconds = json.getIntegerOrNull("expiresInSeconds");
    String? issuer = json.getStringOrNull("issuer");
    Boolean? noTimestamp = json.getBooleanOrNull("noTimestamp");
    {String*}? permissions = json.getArrayOrNull("permissions")?.strings;
    String? subject = json.getStringOrNull("subject");
    return JWTOptions {
      algorithm = algorithm;
      audience = audience;
      audiences = audiences;
      expiresInMinutes = expiresInMinutes;
      expiresInSeconds = expiresInSeconds;
      issuer = issuer;
      noTimestamp = noTimestamp;
      permissions = permissions;
      subject = subject;
    };
  }

  shared object toJava extends Converter<JWTOptions, JWTOptions_>() {
    shared actual JWTOptions_ convert(JWTOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = JWTOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(JWTOptions obj) => obj.toJson();
}
