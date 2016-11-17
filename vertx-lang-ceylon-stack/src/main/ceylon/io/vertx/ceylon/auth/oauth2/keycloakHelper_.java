package io.vertx.ceylon.auth.oauth2;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.Set;
import io.vertx.core.json.JsonObject;

@Ceylon(major = 8)
@Name("keycloakHelper")
@com.redhat.ceylon.compiler.java.metadata.Object
public class keycloakHelper_ implements ReifiedType {

  private static final keycloakHelper_ instance = new keycloakHelper_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(keycloakHelper_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.oauth2::keycloakHelper")
  public static keycloakHelper_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Get raw `id_token` string from the principal.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String rawIdToken(
    final @TypeInfo("ceylon.json::Object") @Name("principal")@DocAnnotation$annotation$(description = "user principal\n") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.rawIdToken(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get decoded `id_token` from the principal.\n")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object idToken(
    final @TypeInfo("ceylon.json::Object") @Name("principal")@DocAnnotation$annotation$(description = "user principal\n") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.idToken(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get raw `access_token` string from the principal.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String rawAccessToken(
    final @TypeInfo("ceylon.json::Object") @Name("principal")@DocAnnotation$annotation$(description = "user principal\n") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.rawAccessToken(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get decoded `access_token` from the principal.\n")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object accessToken(
    final @TypeInfo("ceylon.json::Object") @Name("principal")@DocAnnotation$annotation$(description = "user principal\n") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.accessToken(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long authTime(
    final @TypeInfo("ceylon.json::Object") @Name("principal") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    long ret = io.vertx.ext.auth.oauth2.KeycloakHelper.authTime(arg_0);
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String sessionState(
    final @TypeInfo("ceylon.json::Object") @Name("principal") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.sessionState(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String acr(
    final @TypeInfo("ceylon.json::Object") @Name("principal") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.acr(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String name(
    final @TypeInfo("ceylon.json::Object") @Name("principal") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.name(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String email(
    final @TypeInfo("ceylon.json::Object") @Name("principal") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.email(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String preferredUsername(
    final @TypeInfo("ceylon.json::Object") @Name("principal") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.preferredUsername(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String nickName(
    final @TypeInfo("ceylon.json::Object") @Name("principal") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.nickName(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> allowedOrigins(
    final @TypeInfo("ceylon.json::Object") @Name("principal") ceylon.json.Object principal) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(principal);
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, io.vertx.ext.auth.oauth2.KeycloakHelper.allowedOrigins(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Parse the token string with base64 decoder.\n This will only obtain the \"payload\" part of the token.\n")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object parseToken(
    final @TypeInfo("ceylon.language::String") @Name("token")@DocAnnotation$annotation$(description = "token string\n") ceylon.language.String token) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(token);
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(io.vertx.ext.auth.oauth2.KeycloakHelper.parseToken(arg_0));
    return ret;
  }

}
