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
import io.vertx.ceylon.web.sstore.SessionStore;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A handler that maintains a [Session](Session.type.html) for each browser session.\n <p>\n It looks up the session for each request based on a session cookie which contains a session ID. It stores the session\n when the response is ended in the session store.\n <p>\n The session is available on the routing context with .\n <p>\n The session handler requires a [CookieHandler](../handler/CookieHandler.type.html) to be on the routing chain before it.\n")
public class SessionHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.SessionHandler, SessionHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.SessionHandler, SessionHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.SessionHandler, SessionHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.SessionHandler, SessionHandler>() {
        public SessionHandler convert(io.vertx.ext.web.handler.SessionHandler src) {
          return new SessionHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SessionHandler, io.vertx.ext.web.handler.SessionHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<SessionHandler, io.vertx.ext.web.handler.SessionHandler>() {
    public io.vertx.ext.web.handler.SessionHandler convert(SessionHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SessionHandler.class);
  @Ignore private final io.vertx.ext.web.handler.SessionHandler delegate;

  public SessionHandler(io.vertx.ext.web.handler.SessionHandler delegate) {
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
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0")  RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

  @DocAnnotation$annotation$(description = " Set the session timeout\n")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public SessionHandler setSessionTimeout(
    final @TypeInfo("ceylon.language::Integer") @Name("timeout") @DocAnnotation$annotation$(description = "the timeout, in ms.\n") long timeout) {
    long arg_0 = timeout;
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(delegate.setSessionTimeout(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set whether a nagging log warning should be written if the session handler is accessed over HTTP, not\n HTTPS\n")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public SessionHandler setNagHttps(
    final @TypeInfo("ceylon.language::Boolean") @Name("nag") @DocAnnotation$annotation$(description = "true to nag\n") boolean nag) {
    boolean arg_0 = nag;
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(delegate.setNagHttps(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets whether the 'secure' flag should be set for the session cookie. When set this flag instructs browsers to only\n send the cookie over HTTPS. Note that this will probably stop your sessions working if used without HTTPS (e.g. in development).\n")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public SessionHandler setCookieSecureFlag(
    final @TypeInfo("ceylon.language::Boolean") @Name("secure") @DocAnnotation$annotation$(description = "true to set the secure flag on the cookie\n") boolean secure) {
    boolean arg_0 = secure;
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(delegate.setCookieSecureFlag(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets whether the 'HttpOnly' flag should be set for the session cookie. When set this flag instructs browsers to\n prevent Javascript access to the the cookie. Used as a line of defence against the most common XSS attacks.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public SessionHandler setCookieHttpOnlyFlag(
    final @TypeInfo("ceylon.language::Boolean") @Name("httpOnly") @DocAnnotation$annotation$(description = "true to set the HttpOnly flag on the cookie\n") boolean httpOnly) {
    boolean arg_0 = httpOnly;
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(delegate.setCookieHttpOnlyFlag(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the session cookie name\n")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public SessionHandler setSessionCookieName(
    final @TypeInfo("ceylon.language::String") @Name("sessionCookieName") @DocAnnotation$annotation$(description = "the session cookie name\n") ceylon.language.String sessionCookieName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sessionCookieName);
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(delegate.setSessionCookieName(arg_0));
    return this;
  }

}
