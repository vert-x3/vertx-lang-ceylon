package io.vertx.ceylon.web;

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
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class Route implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.Route, Route> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.Route, Route>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.Route, Route> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.Route, Route>() {
        public Route convert(io.vertx.ext.web.Route src) {
          return new Route(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Route, io.vertx.ext.web.Route> TO_JAVA = new io.vertx.lang.ceylon.Converter<Route, io.vertx.ext.web.Route>() {
    public io.vertx.ext.web.Route convert(Route src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Route.class);
  @Ignore private final io.vertx.ext.web.Route delegate;

  public Route(io.vertx.ext.web.Route delegate) {
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
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route method(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.method(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route path(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.path(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route pathRegex(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.pathRegex(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route produces(
    final @TypeInfo("ceylon.language::String") @Name("contentType") @DocAnnotation$annotation$(description = "todo") ceylon.language.String contentType) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(contentType);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.produces(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route consumes(
    final @TypeInfo("ceylon.language::String") @Name("contentType") @DocAnnotation$annotation$(description = "todo") ceylon.language.String contentType) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(contentType);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.consumes(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route order(
    final @TypeInfo("ceylon.language::Integer") @Name("order") @DocAnnotation$annotation$(description = "todo") long order) {
    int arg_0 = (int)order;
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.order(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route last() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.last());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web::RoutingContext)") @Name("requestHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> requestHandler) {
    io.vertx.core.Handler<io.vertx.ext.web.RoutingContext> arg_0 = requestHandler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.RoutingContext>() {
      public void handle(io.vertx.ext.web.RoutingContext event) {
        requestHandler.$call$((Object)io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route blockingHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web::RoutingContext)") @Name("requestHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> requestHandler) {
    io.vertx.core.Handler<io.vertx.ext.web.RoutingContext> arg_0 = requestHandler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.RoutingContext>() {
      public void handle(io.vertx.ext.web.RoutingContext event) {
        requestHandler.$call$((Object)io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.blockingHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route blockingHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web::RoutingContext)") @Name("requestHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> requestHandler, 
    final @TypeInfo("ceylon.language::Boolean") @Name("ordered") @DocAnnotation$annotation$(description = "todo") boolean ordered) {
    io.vertx.core.Handler<io.vertx.ext.web.RoutingContext> arg_0 = requestHandler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.RoutingContext>() {
      public void handle(io.vertx.ext.web.RoutingContext event) {
        requestHandler.$call$((Object)io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    boolean arg_1 = ordered;
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.blockingHandler(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route failureHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web::RoutingContext)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    io.vertx.core.Handler<io.vertx.ext.web.RoutingContext> arg_0 = failureHandler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.RoutingContext>() {
      public void handle(io.vertx.ext.web.RoutingContext event) {
        failureHandler.$call$((Object)io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.failureHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route remove() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.remove());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route disable() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.disable());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route enable() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.enable());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route useNormalisedPath(
    final @TypeInfo("ceylon.language::Boolean") @Name("useNormalisedPath") @DocAnnotation$annotation$(description = "todo") boolean useNormalisedPath) {
    boolean arg_0 = useNormalisedPath;
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.useNormalisedPath(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getPath() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getPath());
    return ret;
  }

}
