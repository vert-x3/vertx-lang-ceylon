import io.vertx.ceylon.jwt {
  Io_vertx_ext_jwt_JWTOptions=JWTOptions
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
  String? algorithm = null,
  {String*}? audience = null,
  {String*}? audiences = null,
  Integer? expiresInMinutes = null,
  Integer? expiresInSeconds = null,
  JsonObject? header = null,
  Boolean? ignoreExpiration = null,
  String? issuer = null,
  Integer? leeway = null,
  Boolean? noTimestamp = null,
  {String*}? permissions = null,
  String? subject = null) extends Io_vertx_ext_jwt_JWTOptions(
  algorithm,
  audience,
  audiences,
  expiresInMinutes,
  expiresInSeconds,
  header,
  ignoreExpiration,
  issuer,
  leeway,
  noTimestamp,
  permissions,
  subject) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = super.toJson();
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
    Boolean? ignoreExpiration = json.getBooleanOrNull("ignoreExpiration");
    String? issuer = json.getStringOrNull("issuer");
    Integer? leeway = json.getIntegerOrNull("leeway");
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
      ignoreExpiration = ignoreExpiration;
      issuer = issuer;
      leeway = leeway;
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
