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
@DocAnnotation$annotation$(description = " A handler which gathers the entire request body and sets it on the .\n <p>\n It also handles HTTP file uploads and can be used to limit body sizes.\n")
public class BodyHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.BodyHandler, BodyHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.BodyHandler, BodyHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.BodyHandler, BodyHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.BodyHandler, BodyHandler>() {
        public BodyHandler convert(io.vertx.ext.web.handler.BodyHandler src) {
          return new BodyHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<BodyHandler, io.vertx.ext.web.handler.BodyHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<BodyHandler, io.vertx.ext.web.handler.BodyHandler>() {
    public io.vertx.ext.web.handler.BodyHandler convert(BodyHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(BodyHandler.class);
  @Ignore private final io.vertx.ext.web.handler.BodyHandler delegate;

  public BodyHandler(io.vertx.ext.web.handler.BodyHandler delegate) {
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

  @DocAnnotation$annotation$(description = " Set the maximum body size -1 means unlimited\n")
  @TypeInfo("io.vertx.ceylon.web.handler::BodyHandler")
  public BodyHandler setBodyLimit(
    final @TypeInfo("ceylon.language::Integer") @Name("bodyLimit") @DocAnnotation$annotation$(description = "the max size\n") long bodyLimit) {
    long arg_0 = bodyLimit;
    BodyHandler ret = io.vertx.ceylon.web.handler.BodyHandler.TO_CEYLON.converter().safeConvert(delegate.setBodyLimit(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the uploads directory to use\n")
  @TypeInfo("io.vertx.ceylon.web.handler::BodyHandler")
  public BodyHandler setUploadsDirectory(
    final @TypeInfo("ceylon.language::String") @Name("uploadsDirectory") @DocAnnotation$annotation$(description = "the uploads directory\n") ceylon.language.String uploadsDirectory) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(uploadsDirectory);
    BodyHandler ret = io.vertx.ceylon.web.handler.BodyHandler.TO_CEYLON.converter().safeConvert(delegate.setUploadsDirectory(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set whether form attributes will be added to the request parameters\n")
  @TypeInfo("io.vertx.ceylon.web.handler::BodyHandler")
  public BodyHandler setMergeFormAttributes(
    final @TypeInfo("ceylon.language::Boolean") @Name("mergeFormAttributes") @DocAnnotation$annotation$(description = "true if they should be merged\n") boolean mergeFormAttributes) {
    boolean arg_0 = mergeFormAttributes;
    BodyHandler ret = io.vertx.ceylon.web.handler.BodyHandler.TO_CEYLON.converter().safeConvert(delegate.setMergeFormAttributes(arg_0));
    return this;
  }

}
