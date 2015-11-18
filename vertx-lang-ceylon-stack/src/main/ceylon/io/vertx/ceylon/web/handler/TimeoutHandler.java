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
@DocAnnotation$annotation$(description = " Handler that will timeout requests if the response has not been written after a certain time.\n Timeout requests will be ended with an HTTP status code `408`.\n")
public class TimeoutHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.TimeoutHandler, TimeoutHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.TimeoutHandler, TimeoutHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.TimeoutHandler, TimeoutHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.TimeoutHandler, TimeoutHandler>() {
        public TimeoutHandler convert(io.vertx.ext.web.handler.TimeoutHandler src) {
          return new TimeoutHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<TimeoutHandler, io.vertx.ext.web.handler.TimeoutHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<TimeoutHandler, io.vertx.ext.web.handler.TimeoutHandler>() {
    public io.vertx.ext.web.handler.TimeoutHandler convert(TimeoutHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(TimeoutHandler.class);
  @Ignore private final io.vertx.ext.web.handler.TimeoutHandler delegate;

  public TimeoutHandler(io.vertx.ext.web.handler.TimeoutHandler delegate) {
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

}
