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
import java.util.Set;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.ceylon.auth.oauth2.OAuth2Auth;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " An auth handler that provides OAuth2 Authentication support. This handler is suitable for AuthCode flows.\n")
public class OAuth2AuthHandler implements ReifiedType,  AuthHandler {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.OAuth2AuthHandler, OAuth2AuthHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.OAuth2AuthHandler, OAuth2AuthHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.OAuth2AuthHandler, OAuth2AuthHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.OAuth2AuthHandler, OAuth2AuthHandler>() {
        public OAuth2AuthHandler convert(io.vertx.ext.web.handler.OAuth2AuthHandler src) {
          return new OAuth2AuthHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<OAuth2AuthHandler, io.vertx.ext.web.handler.OAuth2AuthHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<OAuth2AuthHandler, io.vertx.ext.web.handler.OAuth2AuthHandler>() {
    public io.vertx.ext.web.handler.OAuth2AuthHandler convert(OAuth2AuthHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(OAuth2AuthHandler.class);
  @Ignore private final io.vertx.ext.web.handler.OAuth2AuthHandler delegate;

  public OAuth2AuthHandler(io.vertx.ext.web.handler.OAuth2AuthHandler delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0")  RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

  @DocAnnotation$annotation$(description = " Add a required authority for this auth handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthority(
    final @TypeInfo("ceylon.language::String") @Name("authority") @DocAnnotation$annotation$(description = "the authority\n") ceylon.language.String authority) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(authority);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(delegate.addAuthority(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Add a set of required authorities for this auth handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthorities(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("authorities") @DocAnnotation$annotation$(description = "the set of authorities\n") ceylon.language.Set<ceylon.language.String> authorities) {
    java.util.Set<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertSet(authorities, io.vertx.lang.ceylon.ToJava.String);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(delegate.addAuthorities(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Build the authorization URL.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String authURI(
    final @TypeInfo("ceylon.language::String") @Name("redirectURL") @DocAnnotation$annotation$(description = "where is the callback mounted.\n") ceylon.language.String redirectURL, 
    final @TypeInfo("ceylon.language::String") @Name("state") @DocAnnotation$annotation$(description = "state opaque token to avoid forged requests\n") ceylon.language.String state) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(redirectURL);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(state);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.authURI(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " add the callback handler to a given route.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::OAuth2AuthHandler")
  public OAuth2AuthHandler setupCallback(
    final @TypeInfo("io.vertx.ceylon.web::Route") @Name("route") @DocAnnotation$annotation$(description = "a given route e.g.: `/callback`\n") Route route) {
    io.vertx.ext.web.Route arg_0 = io.vertx.ceylon.web.Route.TO_JAVA.safeConvert(route);
    OAuth2AuthHandler ret = io.vertx.ceylon.web.handler.OAuth2AuthHandler.TO_CEYLON.converter().safeConvert(delegate.setupCallback(arg_0));
    return this;
  }

}
