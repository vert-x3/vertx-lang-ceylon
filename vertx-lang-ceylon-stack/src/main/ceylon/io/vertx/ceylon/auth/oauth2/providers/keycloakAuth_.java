package io.vertx.ceylon.auth.oauth2.providers;

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
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ceylon.auth.oauth2.OAuth2Auth;
import io.vertx.ext.auth.oauth2.OAuth2FlowType;

@Ceylon(major = 8)
@Name("keycloakAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class keycloakAuth_ implements ReifiedType {

  private static final keycloakAuth_ instance = new keycloakAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(keycloakAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.oauth2.providers::keycloakAuth")
  public static keycloakAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Keycloak\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.json::Object") @Name("config")@DocAnnotation$annotation$(description = "the json config file exported from Keycloak admin console\n") ceylon.json.Object config) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.core.json.JsonObject arg_1 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(config);
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.KeycloakAuth.create(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Keycloak\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("flow")@DocAnnotation$annotation$(description = "the oauth2 flow to use\n") ceylon.language.String flow, 
    final @TypeInfo("ceylon.json::Object") @Name("config")@DocAnnotation$annotation$(description = "the json config file exported from Keycloak admin console\n") ceylon.json.Object config) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.auth.oauth2.OAuth2FlowType arg_1 = io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.ext.auth.oauth2.OAuth2FlowType.class).safeConvert(flow);
    io.vertx.core.json.JsonObject arg_2 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(config);
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.KeycloakAuth.create(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Keycloak\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.json::Object") @Name("config")@DocAnnotation$annotation$(description = "the json config file exported from Keycloak admin console\n") ceylon.json.Object config, 
    final @TypeInfo("io.vertx.ceylon.core.http::HttpClientOptions") @Name("httpClientOptions")@DocAnnotation$annotation$(description = "custom http client options\n") io.vertx.ceylon.core.http.HttpClientOptions httpClientOptions) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.core.json.JsonObject arg_1 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(config);
    io.vertx.core.http.HttpClientOptions arg_2 = httpClientOptions == null ? null : new io.vertx.core.http.HttpClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(httpClientOptions.toJson()));
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.KeycloakAuth.create(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Keycloak\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("flow")@DocAnnotation$annotation$(description = "the oauth2 flow to use\n") ceylon.language.String flow, 
    final @TypeInfo("ceylon.json::Object") @Name("config")@DocAnnotation$annotation$(description = "the json config file exported from Keycloak admin console\n") ceylon.json.Object config, 
    final @TypeInfo("io.vertx.ceylon.core.http::HttpClientOptions") @Name("httpClientOptions")@DocAnnotation$annotation$(description = "custom http client options\n") io.vertx.ceylon.core.http.HttpClientOptions httpClientOptions) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.auth.oauth2.OAuth2FlowType arg_1 = io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.ext.auth.oauth2.OAuth2FlowType.class).safeConvert(flow);
    io.vertx.core.json.JsonObject arg_2 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(config);
    io.vertx.core.http.HttpClientOptions arg_3 = httpClientOptions == null ? null : new io.vertx.core.http.HttpClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(httpClientOptions.toJson()));
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.KeycloakAuth.create(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

}
