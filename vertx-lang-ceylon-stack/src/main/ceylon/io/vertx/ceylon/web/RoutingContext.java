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
import io.vertx.ceylon.core.Vertx;
import java.util.Set;
import io.vertx.core.json.JsonArray;
import java.util.List;
import io.vertx.ceylon.auth.common.User;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.http.HttpServerResponse;
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
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents the context for the handling of a request in Vert.x-Web.\n <p>\n A new instance is created for each HTTP request that is received in the\n [accept](Router.type.html#accept) of the router.\n <p>\n The same instance is passed to any matching request or failure handlers during the routing of the request or\n failure.\n <p>\n The context provides access to the  and \n and allows you to maintain arbitrary data that lives for the lifetime of the context. Contexts are discarded once they\n have been routed to the handler for the request.\n <p>\n The context also provides access to the [Session](Session.type.html), cookies and body for the request, given the correct handlers\n in the application.\n")
public class RoutingContext implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.RoutingContext, RoutingContext> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.RoutingContext, RoutingContext>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.RoutingContext, RoutingContext> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.RoutingContext, RoutingContext>() {
        public RoutingContext convert(io.vertx.ext.web.RoutingContext src) {
          return new RoutingContext(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<RoutingContext, io.vertx.ext.web.RoutingContext> TO_JAVA = new io.vertx.lang.ceylon.Converter<RoutingContext, io.vertx.ext.web.RoutingContext>() {
    public io.vertx.ext.web.RoutingContext convert(RoutingContext src) {
      return src.delegate;
    }
  };

  @Ignore private HttpServerRequest cached_request;
  @Ignore private HttpServerResponse cached_response;
  @Ignore private Throwable cached_failure;
  @Ignore private java.lang.Long cached_statusCode;
  @Ignore private ceylon.language.List<Locale> cached_acceptableLocales;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(RoutingContext.class);
  @Ignore private final io.vertx.ext.web.RoutingContext delegate;

  public RoutingContext(io.vertx.ext.web.RoutingContext delegate) {
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

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest request() {
    if (cached_request != null) {
      return cached_request;
    }
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.request());
    cached_request = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse response() {
    if (cached_response != null) {
      return cached_response;
    }
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.response());
    cached_response = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Tell the router to route this context to the next matching route (if any).\n This method, if called, does not need to be called during the execution of the handler, it can be called\n some arbitrary time later, if required.\n <p>\n If next is not called for a handler then the handler should make sure it ends the response or no response\n will be sent.\n")
  @TypeInfo("ceylon.language::Anything")
  public void next() {
    delegate.next();
  }

  @DocAnnotation$annotation$(description = " Fail the context with the specified status code.\n <p>\n This will cause the router to route the context to any matching failure handlers for the request. If no failure handlers\n match a default failure response will be sent.\n")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::Integer") @Name("statusCode") @DocAnnotation$annotation$(description = "the HTTP status code\n") long statusCode) {
    int arg_0 = (int)statusCode;
    delegate.fail(arg_0);
  }

  @DocAnnotation$annotation$(description = " Fail the context with the specified throwable.\n <p>\n This will cause the router to route the context to any matching failure handlers for the request. If no failure handlers\n match a default failure response with status code 500 will be sent.\n")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::Throwable") @Name("throwable") @DocAnnotation$annotation$(description = "a throwable representing the failure\n") Throwable throwable) {
    java.lang.Throwable arg_0 = throwable;
    delegate.fail(arg_0);
  }

  @DocAnnotation$annotation$(description = " Put some arbitrary data in the context. This will be available in any handlers that receive the context.\n")
  @TypeInfo("io.vertx.ceylon.web::RoutingContext")
  public RoutingContext put(
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "the key for the data\n") ceylon.language.String key, 
    final @TypeInfo("ceylon.language::Object?") @Name("obj") @DocAnnotation$annotation$(description = "the data\n") Object obj) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(obj);
    RoutingContext ret = io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(delegate.put(arg_0, arg_1));
    return this;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Get some data from the context. The data is available in any handlers that receive the context.\n")
  @TypeInfo("T?")
  public <T> T get(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "the key for the data\n") ceylon.language.String key) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.get(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Remove some data from the context. The data is available in any handlers that receive the context.\n")
  @TypeInfo("T?")
  public <T> T remove(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "the key for the data\n") ceylon.language.String key) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.remove(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public Vertx vertx() {
    Vertx ret = io.vertx.ceylon.core.Vertx.TO_CEYLON.converter().safeConvert(delegate.vertx());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String mountPoint() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.mountPoint());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route currentRoute() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.currentRoute());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return the normalised path for the request.\n <p>\n The normalised path is where the URI path has been decoded, i.e. any unicode or other illegal URL characters that\n were encoded in the original URL with `%` will be returned to their original form. E.g. `%20` will revert to a space.\n Also `+` reverts to a space in a query.\n <p>\n The normalised path will also not contain any `..` character sequences to prevent resources being accessed outside\n of the permitted area.\n <p>\n It's recommended to always use the normalised path as opposed to \n if accessing server resources requested by a client.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String normalisedPath() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.normalisedPath());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the cookie with the specified name. The context must have first been routed to a [CookieHandler](../handler/CookieHandler.type.html)\n for this to work.\n")
  @TypeInfo("io.vertx.ceylon.web::Cookie?")
  public Cookie getCookie(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the cookie name\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(delegate.getCookie(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a cookie. This will be sent back to the client in the response. The context must have first been routed\n to a [CookieHandler](../handler/CookieHandler.type.html) for this to work.\n")
  @TypeInfo("io.vertx.ceylon.web::RoutingContext")
  public RoutingContext addCookie(
    final @TypeInfo("io.vertx.ceylon.web::Cookie") @Name("cookie") @DocAnnotation$annotation$(description = "the cookie\n") Cookie cookie) {
    io.vertx.ext.web.Cookie arg_0 = io.vertx.ceylon.web.Cookie.TO_JAVA.safeConvert(cookie);
    RoutingContext ret = io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(delegate.addCookie(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Remove a cookie. The context must have first been routed to a [CookieHandler](../handler/CookieHandler.type.html)\n for this to work.\n")
  @TypeInfo("io.vertx.ceylon.web::Cookie?")
  public Cookie removeCookie(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name of the cookie\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(delegate.removeCookie(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Integer")
  public long cookieCount() {
    long ret = delegate.cookieCount();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.web::Cookie>")
  public ceylon.language.Set<Cookie> cookies() {
    ceylon.language.Set<Cookie> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.web.Cookie.$TypeDescriptor$, delegate.cookies(), io.vertx.ceylon.web.Cookie.TO_CEYLON.converter());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String $getBodyAsString() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getBodyAsString());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the entire HTTP request body as a string, assuming the specified encoding. The context must have first been routed to a\n [BodyHandler](../handler/BodyHandler.type.html) for this to be populated.\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getBodyAsString(
    final @TypeInfo("ceylon.language::String") @Name("encoding") @DocAnnotation$annotation$(description = "the encoding, e.g. \"UTF-16\"\n") ceylon.language.String encoding) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(encoding);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getBodyAsString(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.json::Object?")
  public ceylon.json.Object $getBodyAsJson() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.getBodyAsJson());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.json::Array?")
  public ceylon.json.Array $getBodyAsJsonArray() {
    ceylon.json.Array ret = io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(delegate.getBodyAsJsonArray());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer?")
  public Buffer $getBody() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.getBody());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.web::FileUpload>")
  public ceylon.language.Set<FileUpload> fileUploads() {
    ceylon.language.Set<FileUpload> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.web.FileUpload.$TypeDescriptor$, delegate.fileUploads(), io.vertx.ceylon.web.FileUpload.TO_CEYLON.converter());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the session. The context must have first been routed to a [SessionHandler](../handler/SessionHandler.type.html)\n for this to be populated.\n Sessions live for a browser session, and are maintained by session cookies.\n")
  @TypeInfo("io.vertx.ceylon.web::Session?")
  public Session session() {
    Session ret = io.vertx.ceylon.web.Session.TO_CEYLON.converter().safeConvert(delegate.session());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the authenticated user (if any). This will usually be injected by an auth handler if authentication if successful.\n")
  @TypeInfo("io.vertx.ceylon.auth.common::User?")
  public User user() {
    User ret = io.vertx.ceylon.auth.common.User.TO_CEYLON.converter().safeConvert(delegate.user());
    return ret;
  }

  @DocAnnotation$annotation$(description = " If the context is being routed to failure handlers after a failure has been triggered by calling\n [fail](RoutingContext.type.html#fail) then this will return that throwable. It can be used by failure handlers to render a response,\n e.g. create a failure response page.\n")
  @TypeInfo("ceylon.language::Throwable?")
  public Throwable failure() {
    if (cached_failure != null) {
      return cached_failure;
    }
    Throwable ret = delegate.failure();
    cached_failure = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " If the context is being routed to failure handlers after a failure has been triggered by calling\n [fail](RoutingContext.type.html#fail)  then this will return that status code.  It can be used by failure handlers to render a response,\n e.g. create a failure response page.\n\n When the status code has not been set yet (it is undefined) its value will be -1.\n")
  @TypeInfo("ceylon.language::Integer")
  public long statusCode() {
    if (cached_statusCode != null) {
      return cached_statusCode;
    }
    long ret = delegate.statusCode();
    cached_statusCode = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " If the route specifies produces matches, e.g. produces `text/html` and `text/plain`, and the `accept` header\n matches one or more of these then this returns the most acceptable match.\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String $getAcceptableContentType() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getAcceptableContentType());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add a handler that will be called just before headers are written to the response. This gives you a hook where\n you can write any extra headers before the response has been written when it will be too late.\n")
  @TypeInfo("ceylon.language::Integer")
  public long addHeadersEndHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    long ret = delegate.addHeadersEndHandler(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Remove a headers end handler\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean removeHeadersEndHandler(
    final @TypeInfo("ceylon.language::Integer") @Name("handlerID") @DocAnnotation$annotation$(description = "the id as returned from [addHeadersEndHandler](RoutingContext.type.html#addHeadersEndHandler).\n") long handlerID) {
    int arg_0 = (int)handlerID;
    boolean ret = delegate.removeHeadersEndHandler(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Provides a handler that will be called after the last part of the body is written to the wire.\n The handler is called asynchronously of when the response has been received by the client.\n This provides a hook allowing you to do more operations once the request has been sent over the wire\n such as resource cleanup.\n")
  @TypeInfo("ceylon.language::Integer")
  public long addBodyEndHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    long ret = delegate.addBodyEndHandler(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Remove a body end handler\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean removeBodyEndHandler(
    final @TypeInfo("ceylon.language::Integer") @Name("handlerID") @DocAnnotation$annotation$(description = "the id as returned from [addBodyEndHandler](RoutingContext.type.html#addBodyEndHandler).\n") long handlerID) {
    int arg_0 = (int)handlerID;
    boolean ret = delegate.removeBodyEndHandler(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean failed() {
    boolean ret = delegate.failed();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the body. Used by the [BodyHandler](../handler/BodyHandler.type.html). You will not normally call this method.\n")
  @TypeInfo("ceylon.language::Anything")
  public void $setBody(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("body") @DocAnnotation$annotation$(description = "the body\n") Buffer body) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(body);
    delegate.setBody(arg_0);
  }

  @DocAnnotation$annotation$(description = " Set the session. Used by the [SessionHandler](../handler/SessionHandler.type.html). You will not normally call this method.\n")
  @TypeInfo("ceylon.language::Anything")
  public void $setSession(
    final @TypeInfo("io.vertx.ceylon.web::Session") @Name("session") @DocAnnotation$annotation$(description = "the session\n") Session session) {
    io.vertx.ext.web.Session arg_0 = io.vertx.ceylon.web.Session.TO_JAVA.safeConvert(session);
    delegate.setSession(arg_0);
  }

  @DocAnnotation$annotation$(description = " Set the user. Usually used by auth handlers to inject a User. You will not normally call this method.\n")
  @TypeInfo("ceylon.language::Anything")
  public void $setUser(
    final @TypeInfo("io.vertx.ceylon.auth.common::User") @Name("user") @DocAnnotation$annotation$(description = "the user\n") User user) {
    io.vertx.ext.auth.User arg_0 = io.vertx.ceylon.auth.common.User.TO_JAVA.safeConvert(user);
    delegate.setUser(arg_0);
  }

  @DocAnnotation$annotation$(description = " Clear the current user object in the context. This usually is used for implementing a log out feature, since the\n current user is unbounded from the routing context.\n")
  @TypeInfo("ceylon.language::Anything")
  public void clearUser() {
    delegate.clearUser();
  }

  @DocAnnotation$annotation$(description = " Set the acceptable content type. Used by\n")
  @TypeInfo("ceylon.language::Anything")
  public void $setAcceptableContentType(
    final @TypeInfo("ceylon.language::String?") @Name("contentType") @DocAnnotation$annotation$(description = "the content type\n") ceylon.language.String contentType) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(contentType);
    delegate.setAcceptableContentType(arg_0);
  }

  @DocAnnotation$annotation$(description = " Restarts the current router with a new path and reusing the original method. All path parameters are then parsed\n and available on the params list.\n")
  @TypeInfo("ceylon.language::Anything")
  public void reroute(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "the new http path.\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    delegate.reroute(arg_0);
  }

  @DocAnnotation$annotation$(description = " Restarts the current router with a new method and path. All path parameters are then parsed and available on the\n params list.\n")
  @TypeInfo("ceylon.language::Anything")
  public void reroute(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "the new http request\n") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "the new http path.\n") ceylon.language.String path) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    delegate.reroute(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Returns the locales for the current request. The locales are determined from the `accept-languages` header and\n sorted on quality.\n\n When 2 or more entries have the same quality then the order used to return the best match is based on the lowest\n index on the original list. For example if a user has en-US and en-GB with same quality and this order the best\n match will be en-US because it was declared as first entry by the client.\n")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.web::Locale>")
  public ceylon.language.List<Locale> acceptableLocales() {
    if (cached_acceptableLocales != null) {
      return cached_acceptableLocales;
    }
    ceylon.language.List<Locale> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.web.Locale.$TypeDescriptor$, delegate.acceptableLocales(), io.vertx.ceylon.web.Locale.TO_CEYLON.converter());
    cached_acceptableLocales = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Helper to return the user preferred locale. It is the same action as returning the first element of the acceptable\n locales.\n")
  @TypeInfo("io.vertx.ceylon.web::Locale")
  public Locale preferredLocale() {
    Locale ret = io.vertx.ceylon.web.Locale.TO_CEYLON.converter().safeConvert(delegate.preferredLocale());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a map of named parameters as defined in path declaration with their actual values\n")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> pathParams() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, delegate.pathParams(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets the value of a single path parameter\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String pathParam(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name of parameter as defined in path declaration\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.pathParam(arg_0));
    return ret;
  }

}
