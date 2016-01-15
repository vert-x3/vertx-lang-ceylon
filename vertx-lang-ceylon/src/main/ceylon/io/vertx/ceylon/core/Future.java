package io.vertx.ceylon.core;

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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents the result of an action that may, or may not, have occurred yet.\n <p>\n")
public class Future<T> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.Future, Future> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.Future, Future>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.Future, Future> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.Future, Future>() {
        public Future convert(io.vertx.core.Future src) {
          return new Future(descriptors[0], src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Future, io.vertx.core.Future> TO_JAVA = new io.vertx.lang.ceylon.Converter<Future, io.vertx.core.Future>() {
    public io.vertx.core.Future convert(Future src) {
      return src.delegate;
    }
  };

  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$T;
  @Ignore private final io.vertx.core.Future delegate;

  public Future(@Ignore TypeDescriptor $reified$T, io.vertx.core.Future delegate) {
    this.$TypeDescriptor$ = TypeDescriptor.klass(Future.class, $reified$T);
    this.$reified$T = $reified$T;
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

  @DocAnnotation$annotation$(description = " Has the future completed?\n <p>\n It's completed if it's either succeeded or failed.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isComplete() {
    boolean ret = delegate.isComplete();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set a handler for the result.\n <p>\n If the future has already been completed it will be called immediately. Otherwise it will be called when the\n future is completed.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public Future<T> setHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("handler") @DocAnnotation$annotation$(description = "the Handler that will be called with the result\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(handler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$T).safeConvert(delegate.setHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the result. Any handler will be called, if there is one, and the future will be marked as completed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void complete(
    final @TypeInfo("T?") @Name("result") @DocAnnotation$annotation$(description = "the result\n") T result) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(result);
    delegate.complete(arg_0);
  }

  @DocAnnotation$annotation$(description = " Set a null result. Any handler will be called, if there is one, and the future will be marked as completed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void complete() {
    delegate.complete();
  }

  @DocAnnotation$annotation$(description = " Set the failure. Any handler will be called, if there is one, and the future will be marked as completed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::Throwable") @Name("throwable") @DocAnnotation$annotation$(description = "the failure cause\n") Throwable throwable) {
    java.lang.Throwable arg_0 = throwable;
    delegate.fail(arg_0);
  }

  @DocAnnotation$annotation$(description = " Set the failure. Any handler will be called, if there is one, and the future will be marked as completed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::String") @Name("failureMessage") @DocAnnotation$annotation$(description = "the failure message\n") ceylon.language.String failureMessage) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(failureMessage);
    delegate.fail(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Compose this future with another future.\n\n When this future succeeds, the handler will be called with the value.\n\n When this future fails, the failure will be propagated to the <code>next</code> future.\n")
  @TypeInfo("ceylon.language::Anything")
  public <U> void compose(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::Anything(T?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler, 
    final @TypeInfo("io.vertx.ceylon.core::Future<U>") @Name("next") @DocAnnotation$annotation$(description = "the next future\n") Future<U> next) {
    io.vertx.core.Handler<java.lang.Object> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Object>() {
      public void handle(java.lang.Object event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(event));
      }
    };
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(next);
    delegate.compose(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " @return an handler completing this future\n")
  @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)")
  public Callable<?> handler() {
    Callable<?> ret = new io.vertx.lang.ceylon.AsyncResultHandlerCallable(null, delegate.handler());
    return ret;
  }

}
