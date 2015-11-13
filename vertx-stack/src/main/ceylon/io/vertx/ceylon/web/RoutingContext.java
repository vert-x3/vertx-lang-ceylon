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
import io.vertx.core.json.JsonObject;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest request() {
    if (cached_request != null) {
      return cached_request;
    }
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.request());
    cached_request = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse response() {
    if (cached_response != null) {
      return cached_response;
    }
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.response());
    cached_response = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void next() {
    delegate.next();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::Integer") @Name("statusCode") @DocAnnotation$annotation$(description = "todo") long statusCode) {
    int arg_0 = (int)statusCode;
    delegate.fail(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::Throwable") @Name("throwable") @DocAnnotation$annotation$(description = "todo") Throwable throwable) {
    java.lang.Throwable arg_0 = null;
    delegate.fail(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::RoutingContext")
  public RoutingContext put(
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "todo") ceylon.language.String key, 
    final @TypeInfo("ceylon.language::Object?") @Name("obj") @DocAnnotation$annotation$(description = "todo") Object obj) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(obj);
    RoutingContext ret = io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(delegate.put(arg_0, arg_1));
    return this;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("T?")
  public <T> T get(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "todo") ceylon.language.String key) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public Vertx vertx() {
    Vertx ret = io.vertx.ceylon.core.Vertx.TO_CEYLON.converter().safeConvert(delegate.vertx());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String mountPoint() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.mountPoint());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Route")
  public Route currentRoute() {
    Route ret = io.vertx.ceylon.web.Route.TO_CEYLON.converter().safeConvert(delegate.currentRoute());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String normalisedPath() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.normalisedPath());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Cookie")
  public Cookie getCookie(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(delegate.getCookie(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::RoutingContext")
  public RoutingContext addCookie(
    final @TypeInfo("io.vertx.ceylon.web::Cookie") @Name("cookie") @DocAnnotation$annotation$(description = "todo") Cookie cookie) {
    io.vertx.ext.web.Cookie arg_0 = io.vertx.ceylon.web.Cookie.TO_JAVA.safeConvert(cookie);
    RoutingContext ret = io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(delegate.addCookie(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Cookie")
  public Cookie removeCookie(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(delegate.removeCookie(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long cookieCount() {
    long ret = delegate.cookieCount();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.web::Cookie>")
  public ceylon.language.Set<Cookie> cookies() {
    ceylon.language.Set<Cookie> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.web.Cookie.$TypeDescriptor$, delegate.cookies(), io.vertx.ceylon.web.Cookie.TO_CEYLON.converter());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getBodyAsString() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getBodyAsString());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getBodyAsString(
    final @TypeInfo("ceylon.language::String") @Name("encoding") @DocAnnotation$annotation$(description = "todo") ceylon.language.String encoding) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(encoding);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getBodyAsString(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object getBodyAsJson() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.getBodyAsJson());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer getBody() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.getBody());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.web::FileUpload>")
  public ceylon.language.Set<FileUpload> fileUploads() {
    ceylon.language.Set<FileUpload> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.web.FileUpload.$TypeDescriptor$, delegate.fileUploads(), io.vertx.ceylon.web.FileUpload.TO_CEYLON.converter());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Session")
  public Session session() {
    Session ret = io.vertx.ceylon.web.Session.TO_CEYLON.converter().safeConvert(delegate.session());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.auth.common::User")
  public User user() {
    User ret = io.vertx.ceylon.auth.common.User.TO_CEYLON.converter().safeConvert(delegate.user());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Throwable")
  public Throwable failure() {
    if (cached_failure != null) {
      return cached_failure;
    }
    Throwable ret = delegate.failure();
    cached_failure = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long statusCode() {
    if (cached_statusCode != null) {
      return cached_statusCode;
    }
    long ret = delegate.statusCode();
    cached_statusCode = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getAcceptableContentType() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getAcceptableContentType());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long addHeadersEndHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    long ret = delegate.addHeadersEndHandler(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean removeHeadersEndHandler(
    final @TypeInfo("ceylon.language::Integer") @Name("handlerID") @DocAnnotation$annotation$(description = "todo") long handlerID) {
    int arg_0 = (int)handlerID;
    boolean ret = delegate.removeHeadersEndHandler(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long addBodyEndHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    long ret = delegate.addBodyEndHandler(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean removeBodyEndHandler(
    final @TypeInfo("ceylon.language::Integer") @Name("handlerID") @DocAnnotation$annotation$(description = "todo") long handlerID) {
    int arg_0 = (int)handlerID;
    boolean ret = delegate.removeBodyEndHandler(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean failed() {
    boolean ret = delegate.failed();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void setBody(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("body") @DocAnnotation$annotation$(description = "todo") Buffer body) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(body);
    delegate.setBody(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void setSession(
    final @TypeInfo("io.vertx.ceylon.web::Session") @Name("session") @DocAnnotation$annotation$(description = "todo") Session session) {
    io.vertx.ext.web.Session arg_0 = io.vertx.ceylon.web.Session.TO_JAVA.safeConvert(session);
    delegate.setSession(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void setUser(
    final @TypeInfo("io.vertx.ceylon.auth.common::User") @Name("user") @DocAnnotation$annotation$(description = "todo") User user) {
    io.vertx.ext.auth.User arg_0 = io.vertx.ceylon.auth.common.User.TO_JAVA.safeConvert(user);
    delegate.setUser(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void clearUser() {
    delegate.clearUser();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void setAcceptableContentType(
    final @TypeInfo("ceylon.language::String") @Name("contentType") @DocAnnotation$annotation$(description = "todo") ceylon.language.String contentType) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(contentType);
    delegate.setAcceptableContentType(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void reroute(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    delegate.reroute(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void reroute(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    delegate.reroute(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.web::Locale>")
  public ceylon.language.List<Locale> acceptableLocales() {
    if (cached_acceptableLocales != null) {
      return cached_acceptableLocales;
    }
    ceylon.language.List<Locale> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.web.Locale.$TypeDescriptor$, delegate.acceptableLocales(), io.vertx.ceylon.web.Locale.TO_CEYLON.converter());
    cached_acceptableLocales = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Locale")
  public Locale preferredLocale() {
    Locale ret = io.vertx.ceylon.web.Locale.TO_CEYLON.converter().safeConvert(delegate.preferredLocale());
    return ret;
  }

}
