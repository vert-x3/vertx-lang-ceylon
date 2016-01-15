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
@DocAnnotation$annotation$(description = " A template engine uses a specific template and the data in a routing context to render a resource into a buffer.\n <p>\n Concrete implementations exist for several well-known template engines.\n")
public class TemplateEngine implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.templ.TemplateEngine, TemplateEngine> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.templ.TemplateEngine, TemplateEngine>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.templ.TemplateEngine, TemplateEngine> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.templ.TemplateEngine, TemplateEngine>() {
        public TemplateEngine convert(io.vertx.ext.web.templ.TemplateEngine src) {
          return new TemplateEngine(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<TemplateEngine, io.vertx.ext.web.templ.TemplateEngine> TO_JAVA = new io.vertx.lang.ceylon.Converter<TemplateEngine, io.vertx.ext.web.templ.TemplateEngine>() {
    public io.vertx.ext.web.templ.TemplateEngine convert(TemplateEngine src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(TemplateEngine.class);
  @Ignore private final io.vertx.ext.web.templ.TemplateEngine delegate;

  public TemplateEngine(io.vertx.ext.web.templ.TemplateEngine delegate) {
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

  @DocAnnotation$annotation$(description = " Render\n")
  @TypeInfo("ceylon.language::Anything")
  public void render(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("context") @DocAnnotation$annotation$(description = "the routing context\n") RoutingContext context, 
    final @TypeInfo("ceylon.language::String") @Name("templateFileName") @DocAnnotation$annotation$(description = "the template file name to use\n") ceylon.language.String templateFileName, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.buffer::Buffer)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called with a result containing the buffer or a failure.\n") Callable<?> handler) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(context);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(templateFileName);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.buffer.Buffer>(handler) {
      public Object toCeylon(io.vertx.core.buffer.Buffer event) {
        return io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.render(arg_0, arg_1, arg_2);
  }

}
