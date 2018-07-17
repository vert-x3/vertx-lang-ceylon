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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("salesforceAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class salesforceAuth_ implements ReifiedType {

  private static final salesforceAuth_ instance = new salesforceAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(salesforceAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.oauth2.providers::salesforceAuth")
  public static salesforceAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Salesforce\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("clientId")@DocAnnotation$annotation$(description = "the client id given to you by Salesforce\n") ceylon.language.String clientId, 
    final @TypeInfo("ceylon.language::String") @Name("clientSecret")@DocAnnotation$annotation$(description = "the client secret given to you by Salesforce\n") ceylon.language.String clientSecret) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientId);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientSecret);
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.SalesforceAuth.create(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for Salesforce\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("clientId")@DocAnnotation$annotation$(description = "the client id given to you by Salesforce\n") ceylon.language.String clientId, 
    final @TypeInfo("ceylon.language::String") @Name("clientSecret")@DocAnnotation$annotation$(description = "the client secret given to you by Salesforce\n") ceylon.language.String clientSecret, 
    final @TypeInfo("io.vertx.ceylon.core.http::HttpClientOptions") @Name("httpClientOptions")@DocAnnotation$annotation$(description = "custom http client options\n") io.vertx.ceylon.core.http.HttpClientOptions httpClientOptions) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientId);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(clientSecret);
    io.vertx.core.http.HttpClientOptions arg_3 = httpClientOptions == null ? null : new io.vertx.core.http.HttpClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(httpClientOptions.toJson()));
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.providers.SalesforceAuth.create(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for OpenID Connect Discovery. The discovery will use the default site in the\n configuration options and attempt to load the well known descriptor. If a site is provided (for example when\n running on a custom instance) that site will be used to do the lookup.\n <p>\n If the discovered config includes a json web key url, it will be also fetched and the JWKs will be loaded\n into the OAuth provider so tokens can be decoded.\n")
  @TypeInfo("ceylon.language::Anything")
  public void discover(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx")@DocAnnotation$annotation$(description = "the vertx instance\n") Vertx vertx, 
    final @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2ClientOptions") @Name("config")@DocAnnotation$annotation$(description = "the initial config\n") io.vertx.ceylon.auth.oauth2.OAuth2ClientOptions config, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.oauth2::OAuth2Auth)") @Name("handler")@DocAnnotation$annotation$(description = "the instantiated Oauth2 provider instance handler\n") Callable<?> handler) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.auth.oauth2.OAuth2ClientOptions arg_1 = config == null ? null : new io.vertx.ext.auth.oauth2.OAuth2ClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(config.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.oauth2.OAuth2Auth>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.auth.oauth2.OAuth2Auth>(handler) {
      public Object toCeylon(io.vertx.ext.auth.oauth2.OAuth2Auth event) {
        return io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(event);
      }
    };
    io.vertx.ext.auth.oauth2.providers.SalesforceAuth.discover(arg_0, arg_1, arg_2);
  }

}
