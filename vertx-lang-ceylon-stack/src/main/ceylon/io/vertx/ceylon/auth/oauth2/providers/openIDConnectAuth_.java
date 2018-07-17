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
import io.vertx.core.AsyncResult;
import io.vertx.ceylon.auth.oauth2.OAuth2Auth;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("openIDConnectAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class openIDConnectAuth_ implements ReifiedType {

  private static final openIDConnectAuth_ instance = new openIDConnectAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(openIDConnectAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.oauth2.providers::openIDConnectAuth")
  public static openIDConnectAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a OAuth2Auth provider for OpenID Connect Discovery. The discovery will use the given site in the\n configuration options and attempt to load the well known descriptor.\n\n If the discovered config includes a json web key url, it will be also fetched and the JWKs will be loaded\n into the OAuth provider so tokens can be decoded.\n")
  @TypeInfo("ceylon.language::Anything")
  public void discover(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx")@DocAnnotation$annotation$(description = "the vertx instance\n") Vertx vertx, 
    final @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2ClientOptions") @Name("config")@DocAnnotation$annotation$(description = "the initial config, it should contain a site url\n") io.vertx.ceylon.auth.oauth2.OAuth2ClientOptions config, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.oauth2::OAuth2Auth)") @Name("handler")@DocAnnotation$annotation$(description = "the instantiated Oauth2 provider instance handler\n") Callable<?> handler) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.auth.oauth2.OAuth2ClientOptions arg_1 = config == null ? null : new io.vertx.ext.auth.oauth2.OAuth2ClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(config.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.oauth2.OAuth2Auth>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.auth.oauth2.OAuth2Auth>(handler) {
      public Object toCeylon(io.vertx.ext.auth.oauth2.OAuth2Auth event) {
        return io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(event);
      }
    };
    io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth.discover(arg_0, arg_1, arg_2);
  }

}
