package io.vertx.ceylon.web.templ;

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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A template engine that uses the Handlebars library.\n")
public class HandlebarsTemplateEngine extends TemplateEngine implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.templ.HandlebarsTemplateEngine, HandlebarsTemplateEngine> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.templ.HandlebarsTemplateEngine, HandlebarsTemplateEngine>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.templ.HandlebarsTemplateEngine, HandlebarsTemplateEngine> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.templ.HandlebarsTemplateEngine, HandlebarsTemplateEngine>() {
        public HandlebarsTemplateEngine convert(io.vertx.ext.web.templ.HandlebarsTemplateEngine src) {
          return new HandlebarsTemplateEngine(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HandlebarsTemplateEngine, io.vertx.ext.web.templ.HandlebarsTemplateEngine> TO_JAVA = new io.vertx.lang.ceylon.Converter<HandlebarsTemplateEngine, io.vertx.ext.web.templ.HandlebarsTemplateEngine>() {
    public io.vertx.ext.web.templ.HandlebarsTemplateEngine convert(HandlebarsTemplateEngine src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HandlebarsTemplateEngine.class);
  @Ignore private final io.vertx.ext.web.templ.HandlebarsTemplateEngine delegate;

  public HandlebarsTemplateEngine(io.vertx.ext.web.templ.HandlebarsTemplateEngine delegate) {
    super(delegate);
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

  @DocAnnotation$annotation$(description = " Set the extension for the engine\n")
  @TypeInfo("io.vertx.ceylon.web.templ::HandlebarsTemplateEngine")
  public HandlebarsTemplateEngine setExtension(
    final @TypeInfo("ceylon.language::String") @Name("extension") @DocAnnotation$annotation$(description = "the extension\n") ceylon.language.String extension) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(extension);
    HandlebarsTemplateEngine ret = io.vertx.ceylon.web.templ.HandlebarsTemplateEngine.TO_CEYLON.converter().safeConvert(delegate.setExtension(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the max cache size for the engine\n")
  @TypeInfo("io.vertx.ceylon.web.templ::HandlebarsTemplateEngine")
  public HandlebarsTemplateEngine setMaxCacheSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxCacheSize") @DocAnnotation$annotation$(description = "the maxCacheSize\n") long maxCacheSize) {
    int arg_0 = (int)maxCacheSize;
    HandlebarsTemplateEngine ret = io.vertx.ceylon.web.templ.HandlebarsTemplateEngine.TO_CEYLON.converter().safeConvert(delegate.setMaxCacheSize(arg_0));
    return ret;
  }

}
