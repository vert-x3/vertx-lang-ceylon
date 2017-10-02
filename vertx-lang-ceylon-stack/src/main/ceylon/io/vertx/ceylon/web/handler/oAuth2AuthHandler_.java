package io.vertx.ceylon.web.handler;

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
import io.vertx.ceylon.web.Route;
import io.vertx.ceylon.auth.common.User;
import java.util.Set;
import io.vertx.core.json.JsonObject;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.AsyncResult;
import io.vertx.ceylon.auth.oauth2.OAuth2Auth;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("oAuth2AuthHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class oAuth2AuthHandler_ implements ReifiedType {

  private static final oAuth2AuthHandler_ instance = new oAuth2AuthHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(oAuth2AuthHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::oAuth2AuthHandler")
  public static oAuth2AuthHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a OAuth2 auth handler with host pinning\n")
  @TypeInfo("io.vertx.ceylon.web.handler::OAuth2AuthHandler")
  public OAuth2AuthHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth") @Name("authProvider")@DocAnnotation$annotation$(description = "the auth provider to use\n") OAuth2Auth authProvider, 
    final @TypeInfo("ceylon.language::String") @Name("callbackURL")@DocAnnotation$annotation$(description = "the callback URL you entered in your provider admin console, usually it should be something like: `https://myserver:8888/callback`\n") ceylon.language.String callbackURL) {
    io.vertx.ext.auth.oauth2.OAuth2Auth arg_0 = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_JAVA.safeConvert(authProvider);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(callbackURL);
    OAuth2AuthHandler ret = io.vertx.ceylon.web.handler.OAuth2AuthHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.OAuth2AuthHandler.create(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2 auth handler without host pinning.\n Most providers will not look to the redirect url but always redirect to\n the preconfigured callback. So this factory does not provide a callback url.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::OAuth2AuthHandler")
  public OAuth2AuthHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth") @Name("authProvider")@DocAnnotation$annotation$(description = "the auth provider to use\n") OAuth2Auth authProvider) {
    io.vertx.ext.auth.oauth2.OAuth2Auth arg_0 = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_JAVA.safeConvert(authProvider);
    OAuth2AuthHandler ret = io.vertx.ceylon.web.handler.OAuth2AuthHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.OAuth2AuthHandler.create(arg_0));
    return ret;
  }

}
