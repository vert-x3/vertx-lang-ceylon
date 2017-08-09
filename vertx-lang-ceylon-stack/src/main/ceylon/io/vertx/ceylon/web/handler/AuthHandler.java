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
import io.vertx.ceylon.auth.common.User;
import java.util.Set;
import io.vertx.core.json.JsonObject;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Base interface for auth handlers.\n <p>\n An auth handler allows your application to provide authentication/authorisation support.\n <p>\n Auth handler requires a [SessionHandler](../handler/SessionHandler.type.html) to be on the routing chain before it.\n")
public interface AuthHandler {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.AuthHandler, AuthHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.AuthHandler, AuthHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.AuthHandler, AuthHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.AuthHandler, AuthHandler>() {
        public AuthHandler convert(io.vertx.ext.web.handler.AuthHandler src) {
          return new AuthHandler.Impl(src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<AuthHandler, io.vertx.ext.web.handler.AuthHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<AuthHandler, io.vertx.ext.web.handler.AuthHandler>() {
    public io.vertx.ext.web.handler.AuthHandler convert(AuthHandler src) {
      return (io.vertx.ext.web.handler.AuthHandler)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(AuthHandler.class);
  @Ignore
  Object getDelegate();

  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0") RoutingContext arg0);

  @DocAnnotation$annotation$(description = " Add a required authority for this auth handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthority(
    final @TypeInfo("ceylon.language::String") @Name("authority")@DocAnnotation$annotation$(description = "the authority\n") ceylon.language.String authority);

  @DocAnnotation$annotation$(description = " Add a set of required authorities for this auth handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthorities(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("authorities")@DocAnnotation$annotation$(description = "the set of authorities\n") ceylon.language.Set<ceylon.language.String> authorities);

  @DocAnnotation$annotation$(description = " Parses the credentials from the request into a JsonObject. The implementation should\n be able to extract the required info for the auth provider in the format the provider\n expects.\n")
  @TypeInfo("ceylon.language::Anything")
  public void parseCredentials(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("context")@DocAnnotation$annotation$(description = "the routing context\n") RoutingContext context, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object)") @Name("handler")@DocAnnotation$annotation$(description = "the handler to be called once the information is available.\n") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Authorizes the given user against all added authorities.\n")
  @TypeInfo("ceylon.language::Anything")
  public void authorize(
    final @TypeInfo("io.vertx.ceylon.auth.common::User") @Name("user")@DocAnnotation$annotation$(description = "a user.\n") User user, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler")@DocAnnotation$annotation$(description = "the handler for the result.\n") Callable<?> handler);

  @Ignore
  public class Impl implements AuthHandler {
    @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(AuthHandler.class), io.vertx.ext.web.handler.AuthHandler.class, TO_JAVA, TO_CEYLON);
    @Ignore private final io.vertx.ext.web.handler.AuthHandler delegate;

    public Impl(io.vertx.ext.web.handler.AuthHandler delegate) {
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
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0") RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
    }

  @DocAnnotation$annotation$(description = " Add a required authority for this auth handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthority(
    final @TypeInfo("ceylon.language::String") @Name("authority")@DocAnnotation$annotation$(description = "the authority\n") ceylon.language.String authority) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(authority);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(delegate.addAuthority(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Add a set of required authorities for this auth handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthorities(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("authorities")@DocAnnotation$annotation$(description = "the set of authorities\n") ceylon.language.Set<ceylon.language.String> authorities) {
    java.util.Set<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertSet(authorities, io.vertx.lang.ceylon.ToJava.String);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(delegate.addAuthorities(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Parses the credentials from the request into a JsonObject. The implementation should\n be able to extract the required info for the auth provider in the format the provider\n expects.\n")
  @TypeInfo("ceylon.language::Anything")
  public void parseCredentials(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("context")@DocAnnotation$annotation$(description = "the routing context\n") RoutingContext context, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object)") @Name("handler")@DocAnnotation$annotation$(description = "the handler to be called once the information is available.\n") Callable<?> handler) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(context);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.json.JsonObject>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonObject event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event);
      }
    };
    delegate.parseCredentials(arg_0, arg_1);
    }

  @DocAnnotation$annotation$(description = " Authorizes the given user against all added authorities.\n")
  @TypeInfo("ceylon.language::Anything")
  public void authorize(
    final @TypeInfo("io.vertx.ceylon.auth.common::User") @Name("user")@DocAnnotation$annotation$(description = "a user.\n") User user, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler")@DocAnnotation$annotation$(description = "the handler for the result.\n") Callable<?> handler) {
    io.vertx.ext.auth.User arg_0 = io.vertx.ceylon.auth.common.User.TO_JAVA.safeConvert(user);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.authorize(arg_0, arg_1);
    }
  }

}
