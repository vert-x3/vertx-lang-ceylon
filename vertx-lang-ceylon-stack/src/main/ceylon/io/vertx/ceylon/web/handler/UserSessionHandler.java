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
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "\n This handler should be used if you want to store the User object in the Session so it's available between\n different requests, without you having re-authenticate each time.\n\n It requires that the session handler is already present on previous matching routes.\n\n It requires an Auth provider so, if the user is deserialized from a clustered session it knows which Auth provider\n to associate the session with.\n")
public class UserSessionHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.UserSessionHandler, UserSessionHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.UserSessionHandler, UserSessionHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.UserSessionHandler, UserSessionHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.UserSessionHandler, UserSessionHandler>() {
        public UserSessionHandler convert(io.vertx.ext.web.handler.UserSessionHandler src) {
          return new UserSessionHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<UserSessionHandler, io.vertx.ext.web.handler.UserSessionHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<UserSessionHandler, io.vertx.ext.web.handler.UserSessionHandler>() {
    public io.vertx.ext.web.handler.UserSessionHandler convert(UserSessionHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(UserSessionHandler.class);
  @Ignore private final io.vertx.ext.web.handler.UserSessionHandler delegate;

  public UserSessionHandler(io.vertx.ext.web.handler.UserSessionHandler delegate) {
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
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0") @DocAnnotation$annotation$(description = "todo") RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

}
