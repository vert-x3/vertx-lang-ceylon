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
@DocAnnotation$annotation$(description = "todo")
public class CSRFHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.CSRFHandler, CSRFHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.CSRFHandler, CSRFHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.CSRFHandler, CSRFHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.CSRFHandler, CSRFHandler>() {
        public CSRFHandler convert(io.vertx.ext.web.handler.CSRFHandler src) {
          return new CSRFHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<CSRFHandler, io.vertx.ext.web.handler.CSRFHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<CSRFHandler, io.vertx.ext.web.handler.CSRFHandler>() {
    public io.vertx.ext.web.handler.CSRFHandler convert(CSRFHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(CSRFHandler.class);
  @Ignore private final io.vertx.ext.web.handler.CSRFHandler delegate;

  public CSRFHandler(io.vertx.ext.web.handler.CSRFHandler delegate) {
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
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public CSRFHandler setCookieName(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(delegate.setCookieName(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public CSRFHandler setHeaderName(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(delegate.setHeaderName(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public CSRFHandler setNagHttps(
    final @TypeInfo("ceylon.language::Boolean") @Name("nag") @DocAnnotation$annotation$(description = "todo") boolean nag) {
    boolean arg_0 = nag;
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(delegate.setNagHttps(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public CSRFHandler setTimeout(
    final @TypeInfo("ceylon.language::Integer") @Name("timeout") @DocAnnotation$annotation$(description = "todo") long timeout) {
    long arg_0 = timeout;
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(delegate.setTimeout(arg_0));
    return this;
  }

}
