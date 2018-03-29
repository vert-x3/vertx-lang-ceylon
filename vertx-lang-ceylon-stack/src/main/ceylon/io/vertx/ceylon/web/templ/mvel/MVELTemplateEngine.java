package io.vertx.ceylon.web.templ.mvel;

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
import io.vertx.ceylon.web.templ.TemplateEngine;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A template engine that uses the Handlebars library.\n")
public class MVELTemplateEngine extends TemplateEngine implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.templ.mvel.MVELTemplateEngine, MVELTemplateEngine> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.templ.mvel.MVELTemplateEngine, MVELTemplateEngine>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.templ.mvel.MVELTemplateEngine, MVELTemplateEngine> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.templ.mvel.MVELTemplateEngine, MVELTemplateEngine>() {
        public MVELTemplateEngine convert(io.vertx.ext.web.templ.mvel.MVELTemplateEngine src) {
          return new MVELTemplateEngine(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<MVELTemplateEngine, io.vertx.ext.web.templ.mvel.MVELTemplateEngine> TO_JAVA = new io.vertx.lang.ceylon.Converter<MVELTemplateEngine, io.vertx.ext.web.templ.mvel.MVELTemplateEngine>() {
    public io.vertx.ext.web.templ.mvel.MVELTemplateEngine convert(MVELTemplateEngine src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(MVELTemplateEngine.class), io.vertx.ext.web.templ.mvel.MVELTemplateEngine.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.templ.mvel.MVELTemplateEngine delegate;

  public MVELTemplateEngine(io.vertx.ext.web.templ.mvel.MVELTemplateEngine delegate) {
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
  @TypeInfo("io.vertx.ceylon.web.templ.mvel::MVELTemplateEngine")
  public MVELTemplateEngine setExtension(
    final @TypeInfo("ceylon.language::String") @Name("extension")@DocAnnotation$annotation$(description = "the extension\n") ceylon.language.String extension) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(extension);
    MVELTemplateEngine ret = io.vertx.ceylon.web.templ.mvel.MVELTemplateEngine.TO_CEYLON.converter().safeConvert(delegate.setExtension(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the max cache size for the engine\n")
  @TypeInfo("io.vertx.ceylon.web.templ.mvel::MVELTemplateEngine")
  public MVELTemplateEngine setMaxCacheSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxCacheSize")@DocAnnotation$annotation$(description = "the maxCacheSize\n") long maxCacheSize) {
    int arg_0 = (int)maxCacheSize;
    MVELTemplateEngine ret = io.vertx.ceylon.web.templ.mvel.MVELTemplateEngine.TO_CEYLON.converter().safeConvert(delegate.setMaxCacheSize(arg_0));
    return this;
  }

}
