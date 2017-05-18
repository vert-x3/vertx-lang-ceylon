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
import io.vertx.ceylon.web.templ.TemplateEngine;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "\n A handler which renders responses using a template engine and where the template name is selected from the URI\n path.\n")
public class TemplateHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.TemplateHandler, TemplateHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.TemplateHandler, TemplateHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.TemplateHandler, TemplateHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.TemplateHandler, TemplateHandler>() {
        public TemplateHandler convert(io.vertx.ext.web.handler.TemplateHandler src) {
          return new TemplateHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<TemplateHandler, io.vertx.ext.web.handler.TemplateHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<TemplateHandler, io.vertx.ext.web.handler.TemplateHandler>() {
    public io.vertx.ext.web.handler.TemplateHandler convert(TemplateHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(TemplateHandler.class), io.vertx.ext.web.handler.TemplateHandler.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.handler.TemplateHandler delegate;

  public TemplateHandler(io.vertx.ext.web.handler.TemplateHandler delegate) {
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

  @DocAnnotation$annotation$(description = " Set the index template\n")
  @TypeInfo("io.vertx.ceylon.web.handler::TemplateHandler")
  public TemplateHandler setIndexTemplate(
    final @TypeInfo("ceylon.language::String") @Name("indexTemplate")@DocAnnotation$annotation$(description = "the index template\n") ceylon.language.String indexTemplate) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(indexTemplate);
    TemplateHandler ret = io.vertx.ceylon.web.handler.TemplateHandler.TO_CEYLON.converter().safeConvert(delegate.setIndexTemplate(arg_0));
    return this;
  }

}
