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

@Ceylon(major = 8)
@Name("googleAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class googleAuth_ implements ReifiedType {

  private static final googleAuth_ instance = new googleAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(googleAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.oauth2.providers::googleAuth")
  public static googleAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Google\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("clientId")@DocAnnotation$annotation$(description = "the client id given to you by Google\n") ceylon.language.String clientId, 
    final @TypeInfo("ceylon.language::String") @Name("clientSecret")@DocAnnotation$annotation$(description = "the client secret given to you by Google\n") ceylon.language.String clientSecret) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientId);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientSecret);
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.GoogleAuth.create(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Google\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("clientId")@DocAnnotation$annotation$(description = "the client id given to you by Google\n") ceylon.language.String clientId, 
    final @TypeInfo("ceylon.language::String") @Name("clientSecret")@DocAnnotation$annotation$(description = "the client secret given to you by Google\n") ceylon.language.String clientSecret, 
    final @TypeInfo("io.vertx.ceylon.core.http::HttpClientOptions") @Name("httpClientOptions")@DocAnnotation$annotation$(description = "custom http client options\n") io.vertx.ceylon.core.http.HttpClientOptions httpClientOptions) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientId);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientSecret);
    io.vertx.core.http.HttpClientOptions arg_3 = httpClientOptions == null ? null : new io.vertx.core.http.HttpClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(httpClientOptions.toJson()));
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.GoogleAuth.create(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Google Service Account (Server to Server)\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.json::Object") @Name("serviceAccountJson")@DocAnnotation$annotation$(description = "the configuration json file from your Google API page\n") ceylon.json.Object serviceAccountJson) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.core.json.JsonObject arg_1 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(serviceAccountJson);
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.GoogleAuth.create(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Google Service Account (Server to Server)\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.json::Object") @Name("serviceAccountJson")@DocAnnotation$annotation$(description = "the configuration json file from your Google API page\n") ceylon.json.Object serviceAccountJson, 
    final @TypeInfo("io.vertx.ceylon.core.http::HttpClientOptions") @Name("httpClientOptions")@DocAnnotation$annotation$(description = "custom http client options\n") io.vertx.ceylon.core.http.HttpClientOptions httpClientOptions) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.core.json.JsonObject arg_1 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(serviceAccountJson);
    io.vertx.core.http.HttpClientOptions arg_2 = httpClientOptions == null ? null : new io.vertx.core.http.HttpClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(httpClientOptions.toJson()));
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.GoogleAuth.create(arg_0, arg_1, arg_2));
    return ret;
  }

}
