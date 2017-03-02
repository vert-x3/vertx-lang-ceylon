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
@DocAnnotation$annotation$(description = " A handler which sets the response content type automatically according to the best <code>Accept</code> header match.\n\n The header is set only if:\n <ul>\n <li>no object is stored in the routing context under the name [ResponseContentTypeHandler](../handler/ResponseContentTypeHandler.type.html)</li>\n <li>a match is found</li>\n <li>the header is not present already</li>\n <li>content length header is absent or set to something different than zero</li>\n </ul>\n")
public class ResponseContentTypeHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.ResponseContentTypeHandler, ResponseContentTypeHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.ResponseContentTypeHandler, ResponseContentTypeHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.ResponseContentTypeHandler, ResponseContentTypeHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.ResponseContentTypeHandler, ResponseContentTypeHandler>() {
        public ResponseContentTypeHandler convert(io.vertx.ext.web.handler.ResponseContentTypeHandler src) {
          return new ResponseContentTypeHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<ResponseContentTypeHandler, io.vertx.ext.web.handler.ResponseContentTypeHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<ResponseContentTypeHandler, io.vertx.ext.web.handler.ResponseContentTypeHandler>() {
    public io.vertx.ext.web.handler.ResponseContentTypeHandler convert(ResponseContentTypeHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(ResponseContentTypeHandler.class), io.vertx.ext.web.handler.ResponseContentTypeHandler.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.handler.ResponseContentTypeHandler delegate;

  public ResponseContentTypeHandler(io.vertx.ext.web.handler.ResponseContentTypeHandler delegate) {
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
