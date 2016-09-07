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
import io.vertx.ceylon.core.http.HttpServerRequest;
import java.util.List;
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
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A router receives request from an `io.vertx.core.http.HttpServer` and routes it to the first matching\n [Route](Route.type.html) that it contains. A router can contain many routes.\n <p>\n Routers are also used for routing failures.\n")
public class Router implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.Router, Router> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.Router, Router>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.Router, Router> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.Router, Router>() {
        public Router convert(io.vertx.ext.web.Router src) {
          return new Router(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Router, io.vertx.ext.web.Router> TO_JAVA = new io.vertx.lang.ceylon.Converter<Router, io.vertx.ext.web.Router>() {
    public io.vertx.ext.web.Router convert(Router src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Router.class);
  @Ignore private final io.vertx.ext.web.Router delegate;

  public Router(io.vertx.ext.web.Router delegate) {
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

  @DocAnnotation$annotation$(description = " This method is used to provide a request to the router. Usually you take request from the\n `requestHandler` and pass it to this method. The\n router then routes it to matching routes.\n")
  @TypeInfo("ceylon.language::Anything")
  public void accept(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest") @Name("request") @DocAnnotation$annotation$(description = "the request\n") HttpServerRequest request) {
    io.vertx.core.http.HttpServerRequest arg_0 = io.vertx.ceylon.core.http.HttpServerRequest.TO_JAVA.safeConvert(request);
    delegate.accept(arg_0);
  }

  @DocAnnotation$annotation$(description = " Add a route with no matching criteria, i.e. it matches all requests or failures.\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route route() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.route());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches the specified HTTP method and path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route route(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "the HTTP method to match\n") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.route(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches the specified path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route route(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.route(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches the specified HTTP method and path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route routeWithRegex(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "the HTTP method to match\n") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.routeWithRegex(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches the specified path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route routeWithRegex(
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.routeWithRegex(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches any HTTP GET request\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route get() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.get());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP GET request and the specified path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route get(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP GET request and the specified path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route getWithRegex(
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.getWithRegex(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches any HTTP HEAD request\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route head() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.head());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP HEAD request and the specified path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route head(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.head(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP HEAD request and the specified path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route headWithRegex(
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.headWithRegex(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches any HTTP OPTIONS request\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route options() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.options());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP OPTIONS request and the specified path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route options(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.options(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP OPTIONS request and the specified path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route optionsWithRegex(
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.optionsWithRegex(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches any HTTP PUT request\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route put() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.put());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP PUT request and the specified path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route put(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.put(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP PUT request and the specified path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route putWithRegex(
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.putWithRegex(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches any HTTP POST request\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route post() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.post());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP POST request and the specified path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route post(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.post(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP POST request and the specified path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route postWithRegex(
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.postWithRegex(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches any HTTP DELETE request\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route delete() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.delete());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP DELETE request and the specified path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route delete(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.delete(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP DELETE request and the specified path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route deleteWithRegex(
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.deleteWithRegex(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches any HTTP TRACE request\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route trace() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.trace());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP TRACE request and the specified path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route trace(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.trace(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP TRACE request and the specified path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route traceWithRegex(
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.traceWithRegex(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches any HTTP CONNECT request\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route connect() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.connect());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP CONNECT request and the specified path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route connect(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.connect(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP CONNECT request and the specified path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route connectWithRegex(
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.connectWithRegex(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches any HTTP PATCH request\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route patch() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.patch());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP PATCH request and the specified path\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route patch(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "URI paths that begin with this path will match\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.patch(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a route that matches a HTTP PATCH request and the specified path regex\n")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route patchWithRegex(
    final @TypeInfo("ceylon.language::String") @Name("regex") @DocAnnotation$annotation$(description = "URI paths that begin with a match for this regex will match\n") ceylon.language.String regex) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(regex);
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.patchWithRegex(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.web::Route>")
  public ceylon.language.List<Route> $getRoutes() {
    ceylon.language.List<Route> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.web.Route.$TypeDescriptor$, delegate.getRoutes(), io.vertx.ceylon.web.Route.TO_CEYLON.converter());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Remove all the routes from this router\n")
  @TypeInfo("io.vertx.ceylon.web::Router")
  public Router clear() {
    Router ret = io.vertx.ceylon.web.Router.TO_CEYLON.converter().safeConvert(delegate.clear());
    return this;
  }

  @DocAnnotation$annotation$(description = " Mount a sub router on this router\n")
  @TypeInfo("io.vertx.ceylon.web::Router")
  public Router mountSubRouter(
    final @TypeInfo("ceylon.language::String") @Name("mountPoint") @DocAnnotation$annotation$(description = "the mount point (path prefix) to mount it on\n") ceylon.language.String mountPoint, 
    final @TypeInfo("io.vertx.ceylon.web::Router") @Name("subRouter") @DocAnnotation$annotation$(description = "the router to mount as a sub router\n") Router subRouter) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(mountPoint);
    io.vertx.ext.web.Router arg_1 = io.vertx.ceylon.web.Router.TO_JAVA.safeConvert(subRouter);
    Router ret = io.vertx.ceylon.web.Router.TO_CEYLON.converter().safeConvert(delegate.mountSubRouter(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Specify a handler for any unhandled exceptions on this router. The handler will be called for exceptions thrown\n from handlers. This does not affect the normal failure routing logic.\n")
  @TypeInfo("io.vertx.ceylon.web::Router")
  public Router exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("exceptionHandler") @DocAnnotation$annotation$(description = "the exception handler\n") Callable<?> exceptionHandler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = exceptionHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        exceptionHandler.$call$((Object)event);
      }
    };
    Router ret = io.vertx.ceylon.web.Router.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Used to route a context to the router. Used for sub-routers. You wouldn't normally call this method directly.\n")
  @TypeInfo("ceylon.language::Anything")
  public void handleContext(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("context") @DocAnnotation$annotation$(description = "the routing context\n") RoutingContext context) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(context);
    delegate.handleContext(arg_0);
  }

  @DocAnnotation$annotation$(description = " Used to route a failure to the router. Used for sub-routers. You wouldn't normally call this method directly.\n")
  @TypeInfo("ceylon.language::Anything")
  public void handleFailure(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("context") @DocAnnotation$annotation$(description = "the routing context\n") RoutingContext context) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(context);
    delegate.handleFailure(arg_0);
  }

}
