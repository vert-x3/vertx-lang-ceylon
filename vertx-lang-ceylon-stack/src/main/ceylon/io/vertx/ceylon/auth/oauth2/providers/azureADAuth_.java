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
import io.vertx.ceylon.auth.oauth2.OAuth2Auth;

@Ceylon(major = 8)
@Name("azureADAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class azureADAuth_ implements ReifiedType {

  private static final azureADAuth_ instance = new azureADAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(azureADAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.oauth2.providers::azureADAuth")
  public static azureADAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Microsoft Azure Active Directory\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("clientId")@DocAnnotation$annotation$(description = "the client id given to you by Azure\n") ceylon.language.String clientId, 
    final @TypeInfo("ceylon.language::String") @Name("clientSecret")@DocAnnotation$annotation$(description = "the client secret given to you by Azure\n") ceylon.language.String clientSecret, 
    final @TypeInfo("ceylon.language::String") @Name("guid")@DocAnnotation$annotation$(description = "the guid of your application given to you by Azure\n") ceylon.language.String guid) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientId);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientSecret);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(guid);
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.AzureADAuth.create(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Microsoft Azure Active Directory\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("clientId")@DocAnnotation$annotation$(description = "the client id given to you by Azure\n") ceylon.language.String clientId, 
    final @TypeInfo("ceylon.language::String") @Name("clientSecret")@DocAnnotation$annotation$(description = "the client secret given to you by Azure\n") ceylon.language.String clientSecret, 
    final @TypeInfo("ceylon.language::String") @Name("guid")@DocAnnotation$annotation$(description = "the guid of your application given to you by Azure\n") ceylon.language.String guid, 
    final @TypeInfo("io.vertx.ceylon.core.http::HttpClientOptions") @Name("httpClientOptions")@DocAnnotation$annotation$(description = "custom http client options\n") io.vertx.ceylon.core.http.HttpClientOptions httpClientOptions) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientId);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientSecret);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(guid);
    io.vertx.core.http.HttpClientOptions arg_4 = httpClientOptions == null ? null : new io.vertx.core.http.HttpClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(httpClientOptions.toJson()));
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.AzureADAuth.create(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

}
