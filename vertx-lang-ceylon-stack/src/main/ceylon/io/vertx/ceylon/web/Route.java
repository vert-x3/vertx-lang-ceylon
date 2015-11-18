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
@DocAnnotation$annotation$(description = " A route is a holder for a set of criteria which determine whether an HTTP request or failure should be routed\n to a handler.\n")
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

  @DocAnnotation$annotation$(description = " Add an HTTP method for this route. By default a route will match all HTTP methods. If any are specified then the route\n will only match any of the specified methods\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route method(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "the HTTP method to add\n") io.vertx.ceylon.core.http.HttpMethod method) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.method(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the path prefix for this route. If set then this route will only match request URI paths which start with this\n path prefix. Only a single path or path regex can be set for a route.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route path(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "the path prefix\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.path(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the path prefix as a regular expression. If set then this route will only match request URI paths, the beginning\n of which match the regex. Only a single path or path regex can be set for a route.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route pathRegex(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "the path regex\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.pathRegex(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Add a content type produced by this route. Used for content based routing.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route produces(
    final @TypeInfo("ceylon.language::String") @Name("contentType") @DocAnnotation$annotation$(description = "the content type\n") ceylon.language.String contentType) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(contentType);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.produces(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Add a content type consumed by this route. Used for content based routing.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route consumes(
    final @TypeInfo("ceylon.language::String") @Name("contentType") @DocAnnotation$annotation$(description = "the content type\n") ceylon.language.String contentType) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(contentType);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.consumes(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Specify the order for this route. The router tests routes in that order.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route order(
    final @TypeInfo("ceylon.language::Integer") @Name("order") @DocAnnotation$annotation$(description = "the order\n") long order) {
    int arg_0 = (int)order;
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.order(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Specify this is the last route for the router.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route last() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.last());
    return this;
  }

  @DocAnnotation$annotation$(description = " Specify a request handler for the route. The router routes requests to handlers depending on whether the various\n criteria such as method, path, etc match. There can be only one request handler for a route. If you set this more\n than once it will overwrite the previous handler.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web::RoutingContext)") @Name("requestHandler") @DocAnnotation$annotation$(description = "the request handler\n") Callable<?> requestHandler) {
    io.vertx.core.Handler<io.vertx.ext.web.RoutingContext> arg_0 = requestHandler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.RoutingContext>() {
      public void handle(io.vertx.ext.web.RoutingContext event) {
        requestHandler.$call$((Object)io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [blockingHandler](Route.type.html#blockingHandler) called with ordered = true\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route blockingHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web::RoutingContext)") @Name("requestHandler")  Callable<?> requestHandler) {
    io.vertx.core.Handler<io.vertx.ext.web.RoutingContext> arg_0 = requestHandler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.RoutingContext>() {
      public void handle(io.vertx.ext.web.RoutingContext event) {
        requestHandler.$call$((Object)io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.blockingHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Specify a blocking request handler for the route.\n This method works just like [handler](Route.type.html#handler) excepted that it will run the blocking handler on a worker thread\n so that it won't block the event loop. Note that it's safe to call context.next() from the\n blocking handler as it will be executed on the event loop context (and not on the worker thread.\n\n If the blocking handler is ordered it means that any blocking handlers for the same context are never executed\n concurrently but always in the order they were called. The default value of ordered is true. If you do not want this\n behaviour and don't mind if your blocking handlers are executed in parallel you can set ordered to false.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route blockingHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web::RoutingContext)") @Name("requestHandler") @DocAnnotation$annotation$(description = "the blocking request handler\n") Callable<?> requestHandler, 
    final @TypeInfo("ceylon.language::Boolean") @Name("ordered") @DocAnnotation$annotation$(description = "if true handlers are executed in sequence, otherwise are run in parallel\n") boolean ordered) {
    io.vertx.core.Handler<io.vertx.ext.web.RoutingContext> arg_0 = requestHandler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.RoutingContext>() {
      public void handle(io.vertx.ext.web.RoutingContext event) {
        requestHandler.$call$((Object)io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    boolean arg_1 = ordered;
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.blockingHandler(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Specify a failure handler for the route. The router routes failures to failurehandlers depending on whether the various\n criteria such as method, path, etc match. There can be only one failure handler for a route. If you set this more\n than once it will overwrite the previous handler.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route failureHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web::RoutingContext)") @Name("failureHandler") @DocAnnotation$annotation$(description = "the request handler\n") Callable<?> failureHandler) {
    io.vertx.core.Handler<io.vertx.ext.web.RoutingContext> arg_0 = failureHandler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.RoutingContext>() {
      public void handle(io.vertx.ext.web.RoutingContext event) {
        failureHandler.$call$((Object)io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.failureHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Remove this route from the router\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route remove() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.remove());
    return this;
  }

  @DocAnnotation$annotation$(description = " Disable this route. While disabled the router will not route any requests or failures to it.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route disable() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.disable());
    return this;
  }

  @DocAnnotation$annotation$(description = " Enable this route.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route enable() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.enable());
    return this;
  }

  @DocAnnotation$annotation$(description = " If true then the normalised request path will be used when routing (e.g. removing duplicate /)\n Default is true\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route useNormalisedPath(
    final @TypeInfo("ceylon.language::Boolean") @Name("useNormalisedPath") @DocAnnotation$annotation$(description = "use normalised path for routing?\n") boolean useNormalisedPath) {
    boolean arg_0 = useNormalisedPath;
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.useNormalisedPath(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return the path prefix (if any) for this route\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getPath() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getPath());
    return ret;
  }

}
