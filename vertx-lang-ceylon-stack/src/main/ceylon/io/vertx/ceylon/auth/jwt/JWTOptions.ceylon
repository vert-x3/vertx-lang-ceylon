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
" Options related to creation of new tokens.\n\n If any expiresInMinutes, audience, subject, issuer are not provided, there is no default.\n The jwt generated won't include those properties in the payload.\n\n Generated JWTs will include an iat claim by default unless noTimestamp is specified.\n"
shared class JWTOptions(
  " The algorithm to use, it should be one of the alias [HS256, HS384, HS512, RS256, RS384, RS512, ES256, ES384, ES512]\n"
  shared String? algorithm = null,
  " The target audience of this token\n"
  shared {String*}? audience = null,
  " The target audience of this token\n"
  shared {String*}? audiences = null,
  " The expiration time for the token in minutes\n"
  shared Integer? expiresInMinutes = null,
  " The expiration time for the token in seconds\n"
  shared Integer? expiresInSeconds = null,
  shared JsonObject? header = null,
  shared Map<String, String>? headers = null,
  " The issuer of this token\n"
  shared String? issuer = null,
  " Disable the generation of issued at claim\n"
  shared Boolean? noTimestamp = null,
  " The permissions of this token.\n"
  shared {String*}? permissions = null,
  " The subject of this token\n"
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
    if (exists header) {
      json.put("header", header);
    }
    if (exists headers) {
      json.put("headers", JsonObject(headers));
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
    JsonObject? header = json.getObjectOrNull("header");
    Map<String, String>? headers = if (exists tmp = json.getObjectOrNull("headers")) then HashMap { for(key->val in tmp) if (is String val) key->val } else null;
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
      header = header;
      headers = headers;
      issuer = issuer;
      noTimestamp = noTimestamp;
      permissions = permissions;
      subject = subject;
    };
  }

  shared object toCeylon extends Converter<JWTOptions_, JWTOptions>() {
    shared actual JWTOptions convert(JWTOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
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
