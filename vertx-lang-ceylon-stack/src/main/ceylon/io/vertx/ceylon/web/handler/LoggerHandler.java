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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A handler which logs request information to the Vert.x logger.\n")
public class LoggerHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.LoggerHandler, LoggerHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.LoggerHandler, LoggerHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.LoggerHandler, LoggerHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.LoggerHandler, LoggerHandler>() {
        public LoggerHandler convert(io.vertx.ext.web.handler.LoggerHandler src) {
          return new LoggerHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<LoggerHandler, io.vertx.ext.web.handler.LoggerHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<LoggerHandler, io.vertx.ext.web.handler.LoggerHandler>() {
    public io.vertx.ext.web.handler.LoggerHandler convert(LoggerHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(LoggerHandler.class), io.vertx.ext.web.handler.LoggerHandler.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.handler.LoggerHandler delegate;

  public LoggerHandler(io.vertx.ext.web.handler.LoggerHandler delegate) {
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

}
