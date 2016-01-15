package io.vertx.ceylon.web.sstore;

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
import io.vertx.ceylon.web.Session;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A session store is used to store sessions for an Vert.x-Web web app\n")
public class SessionStore implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.sstore.SessionStore, SessionStore> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.sstore.SessionStore, SessionStore>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.sstore.SessionStore, SessionStore> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.sstore.SessionStore, SessionStore>() {
        public SessionStore convert(io.vertx.ext.web.sstore.SessionStore src) {
          return new SessionStore(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SessionStore, io.vertx.ext.web.sstore.SessionStore> TO_JAVA = new io.vertx.lang.ceylon.Converter<SessionStore, io.vertx.ext.web.sstore.SessionStore>() {
    public io.vertx.ext.web.sstore.SessionStore convert(SessionStore src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SessionStore.class);
  @Ignore private final io.vertx.ext.web.sstore.SessionStore delegate;

  public SessionStore(io.vertx.ext.web.sstore.SessionStore delegate) {
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

  @DocAnnotation$annotation$(description = " The retry timeout value in milli seconds used by the session handler when it retrieves a value from the store.<p/>\n\n A non positive value means there is no retry at all.\n")
  @TypeInfo("ceylon.language::Integer")
  public long retryTimeout() {
    long ret = delegate.retryTimeout();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a new session\n")
  @TypeInfo("io.vertx.ceylon.web::Session")
  public Session createSession(
    final @TypeInfo("ceylon.language::Integer") @Name("timeout") @DocAnnotation$annotation$(description = "- the session timeout, in ms\n") long timeout) {
    long arg_0 = timeout;
    Session ret = io.vertx.ceylon.web.Session.TO_CEYLON.converter().safeConvert(delegate.createSession(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the session with the specified ID\n")
  @TypeInfo("ceylon.language::Anything")
  public void get(
    final @TypeInfo("ceylon.language::String") @Name("id") @DocAnnotation$annotation$(description = "the unique ID of the session\n") ceylon.language.String id, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.web::Session)") @Name("resultHandler") @DocAnnotation$annotation$(description = "will be called with a result holding the session, or a failure\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(id);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.web.Session>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.web.Session>(resultHandler) {
      public Object toCeylon(io.vertx.ext.web.Session event) {
        return io.vertx.ceylon.web.Session.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.get(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Delete the session with the specified ID\n")
  @TypeInfo("ceylon.language::Anything")
  public void delete(
    final @TypeInfo("ceylon.language::String") @Name("id") @DocAnnotation$annotation$(description = "the unique ID of the session\n") ceylon.language.String id, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("resultHandler") @DocAnnotation$annotation$(description = "will be called with a result true/false, or a failure\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(id);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Boolean>(resultHandler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.delete(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Add a session with the specified ID\n")
  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("io.vertx.ceylon.web::Session") @Name("session") @DocAnnotation$annotation$(description = "the session\n") Session session, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("resultHandler") @DocAnnotation$annotation$(description = "will be called with a result true/false, or a failure\n") Callable<?> resultHandler) {
    io.vertx.ext.web.Session arg_0 = io.vertx.ceylon.web.Session.TO_JAVA.safeConvert(session);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Boolean>(resultHandler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.put(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Remove all sessions from the store\n")
  @TypeInfo("ceylon.language::Anything")
  public void clear(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("resultHandler") @DocAnnotation$annotation$(description = "will be called with a result true/false, or a failure\n") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_0 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Boolean>(resultHandler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.clear(arg_0);
  }

  @DocAnnotation$annotation$(description = " Get the number of sessions in the store\n")
  @TypeInfo("ceylon.language::Anything")
  public void size(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("resultHandler") @DocAnnotation$annotation$(description = "will be called with the number, or a failure\n") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> arg_0 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Integer>(resultHandler) {
      public Object toCeylon(java.lang.Integer event) {
        return io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(event);
      }
    };
    delegate.size(arg_0);
  }

  @DocAnnotation$annotation$(description = " Close the store\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
