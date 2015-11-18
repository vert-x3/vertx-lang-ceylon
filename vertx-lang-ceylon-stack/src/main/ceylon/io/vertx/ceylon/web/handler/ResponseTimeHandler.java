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
@DocAnnotation$annotation$(description = " Handler which adds a header `x-response-time` in the response of matching requests containing the time taken\n in ms to process the request.\n")
public class ResponseTimeHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.ResponseTimeHandler, ResponseTimeHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.ResponseTimeHandler, ResponseTimeHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.ResponseTimeHandler, ResponseTimeHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.ResponseTimeHandler, ResponseTimeHandler>() {
        public ResponseTimeHandler convert(io.vertx.ext.web.handler.ResponseTimeHandler src) {
          return new ResponseTimeHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<ResponseTimeHandler, io.vertx.ext.web.handler.ResponseTimeHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<ResponseTimeHandler, io.vertx.ext.web.handler.ResponseTimeHandler>() {
    public io.vertx.ext.web.handler.ResponseTimeHandler convert(ResponseTimeHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ResponseTimeHandler.class);
  @Ignore private final io.vertx.ext.web.handler.ResponseTimeHandler delegate;

  public ResponseTimeHandler(io.vertx.ext.web.handler.ResponseTimeHandler delegate) {
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
