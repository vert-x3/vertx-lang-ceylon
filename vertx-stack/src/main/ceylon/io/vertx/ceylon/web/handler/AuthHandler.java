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
import java.util.Set;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0") @DocAnnotation$annotation$(description = "todo") RoutingContext arg0);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthority(
    final @TypeInfo("ceylon.language::String") @Name("authority") @DocAnnotation$annotation$(description = "todo") ceylon.language.String authority);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthorities(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("authorities") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> authorities);

  @Ignore
  public class Impl implements AuthHandler {
    @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(AuthHandler.class);
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0") @DocAnnotation$annotation$(description = "todo") RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthority(
    final @TypeInfo("ceylon.language::String") @Name("authority") @DocAnnotation$annotation$(description = "todo") ceylon.language.String authority) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(authority);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(delegate.addAuthority(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthorities(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("authorities") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> authorities) {
    java.util.Set<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertSet(authorities, io.vertx.lang.ceylon.ToJava.String);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(delegate.addAuthorities(arg_0));
      return this;
    }
  }

}
