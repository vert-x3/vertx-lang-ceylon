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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a browser session.\n <p>\n Sessions persist between HTTP requests for a single browser session. They are deleted when the browser is closed, or\n they time-out. Session cookies are used to maintain sessions using a secure UUID.\n <p>\n Sessions can be used to maintain data for a browser session, e.g. a shopping basket.\n <p>\n The context must have first been routed to a todo_link\n for sessions to be available.\n")
public class Session implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.Session, Session> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.Session, Session>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.Session, Session> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.Session, Session>() {
        public Session convert(io.vertx.ext.web.Session src) {
          return new Session(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Session, io.vertx.ext.web.Session> TO_JAVA = new io.vertx.lang.ceylon.Converter<Session, io.vertx.ext.web.Session>() {
    public io.vertx.ext.web.Session convert(Session src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Session.class);
  @Ignore private final io.vertx.ext.web.Session delegate;

  public Session(io.vertx.ext.web.Session delegate) {
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

  @DocAnnotation$annotation$(description = " @return The unique ID of the session. This is generated using a random secure UUID.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String id() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.id());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Put some data in a session\n")
  @TypeInfo("io.vertx.ceylon.web::Session")
  public Session put(
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "todo") ceylon.language.String key, 
    final @TypeInfo("ceylon.language::Object?") @Name("obj") @DocAnnotation$annotation$(description = "todo") Object obj) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(obj);
    Session ret = io.vertx.ceylon.web.Session.TO_CEYLON.converter().safeConvert(delegate.put(arg_0, arg_1));
    return this;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Get some data from the session\n")
  @TypeInfo("T?")
  public <T> T get(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "todo") ceylon.language.String key) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.get(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Remove some data from the session\n")
  @TypeInfo("T?")
  public <T> T remove(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "todo") ceylon.language.String key) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.remove(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the time the session was last accessed\n")
  @TypeInfo("ceylon.language::Integer")
  public long lastAccessed() {
    long ret = delegate.lastAccessed();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Destroy the session\n")
  @TypeInfo("ceylon.language::Anything")
  public void destroy() {
    delegate.destroy();
  }

  @DocAnnotation$annotation$(description = " @return has the session been destroyed?\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isDestroyed() {
    boolean ret = delegate.isDestroyed();
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the amount of time in ms, after which the session will expire, if not accessed.\n")
  @TypeInfo("ceylon.language::Integer")
  public long timeout() {
    long ret = delegate.timeout();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Mark the session as being accessed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void setAccessed() {
    delegate.setAccessed();
  }

}
