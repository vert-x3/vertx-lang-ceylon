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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A template engine that uses the Thymeleaf library.\n")
public class ThymeleafTemplateEngine extends io.vertx.ceylon.web.templ.TemplateEngine implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.templ.ThymeleafTemplateEngine, ThymeleafTemplateEngine> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.templ.ThymeleafTemplateEngine, ThymeleafTemplateEngine>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.templ.ThymeleafTemplateEngine, ThymeleafTemplateEngine> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.templ.ThymeleafTemplateEngine, ThymeleafTemplateEngine>() {
        public ThymeleafTemplateEngine convert(io.vertx.ext.web.templ.ThymeleafTemplateEngine src) {
          return new ThymeleafTemplateEngine(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<ThymeleafTemplateEngine, io.vertx.ext.web.templ.ThymeleafTemplateEngine> TO_JAVA = new io.vertx.lang.ceylon.Converter<ThymeleafTemplateEngine, io.vertx.ext.web.templ.ThymeleafTemplateEngine>() {
    public io.vertx.ext.web.templ.ThymeleafTemplateEngine convert(ThymeleafTemplateEngine src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ThymeleafTemplateEngine.class);
  @Ignore private final io.vertx.ext.web.templ.ThymeleafTemplateEngine delegate;

  public ThymeleafTemplateEngine(io.vertx.ext.web.templ.ThymeleafTemplateEngine delegate) {
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

  @DocAnnotation$annotation$(description = " Set the mode for the engine\n")
  @TypeInfo("io.vertx.ceylon.web.templ::ThymeleafTemplateEngine")
  public ThymeleafTemplateEngine setMode(
    final @TypeInfo("ceylon.language::String") @Name("mode") @DocAnnotation$annotation$(description = "the mode\n") ceylon.language.String mode) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(mode);
    ThymeleafTemplateEngine ret = io.vertx.ceylon.web.templ.ThymeleafTemplateEngine.TO_CEYLON.converter().safeConvert(delegate.setMode(arg_0));
    return ret;
  }

}
