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
import java.util.function.Function;

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

  @Ignore private Callable<?> cached_completer;
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
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Object>(handler) {
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

  @DocAnnotation$annotation$(description = " The result of the operation. This will be null if the operation failed.\n")
  @TypeInfo("T?")
  public T result() {
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.result());
    return ret;
  }

  @DocAnnotation$annotation$(description = " A Throwable describing failure. This will be null if the operation succeeded.\n")
  @TypeInfo("ceylon.language::Throwable")
  public Throwable cause() {
    Throwable ret = delegate.cause();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Did it succeed?\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean succeeded() {
    boolean ret = delegate.succeeded();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Did it fail?\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean failed() {
    boolean ret = delegate.failed();
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Compose this future with a provided <code>next</code> future.<p>\n\n When this future succeeds, the <code>handler</code> will be called with the completed value, this handler\n should complete the next future.<p>\n\n If the <code>handler</code> throws an exception, the returned future will be failed with this exception.<p>\n\n When this future fails, the failure will be propagated to the <code>next</code> future and the <code>handler</code>\n will not be called.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<U>")
  public <U> Future<U> compose(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::Anything(T?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler, 
    final @TypeInfo("io.vertx.ceylon.core::Future<U>") @Name("composed") @DocAnnotation$annotation$(description = "the composed future\n") Future<U> composed) {
    io.vertx.core.Handler<java.lang.Object> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Object>() {
      public void handle(java.lang.Object event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(event));
      }
    };
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(composed);
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$U).safeConvert(delegate.compose(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Compose this future with a <code>mapper</code> function.<p>\n\n When this future succeeds, the <code>mapper</code> will be called with the completed value and this mapper\n returns a future. This returned future completion will trigger the future returned by this method call.<p>\n\n If the <code>mapper</code> throws an exception, the returned future will be failed with this exception.<p>\n\n When this future fails, the failure will be propagated to the returned future and the <code>mapper</code>\n will not be called.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<U>")
  public <U> Future<U> compose(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("io.vertx.ceylon.core::Future<U>(T?)") @Name("mapper") @DocAnnotation$annotation$(description = "the mapper function\n") Callable<?> mapper) {
    java.util.function.Function<java.lang.Object,io.vertx.core.Future<java.lang.Object>> arg_0 = mapper == null ? null : new java.util.function.Function<java.lang.Object,io.vertx.core.Future<java.lang.Object>>() {
      public io.vertx.core.Future<java.lang.Object> apply(java.lang.Object arg) {
        Future<Object> ret = (Future<Object>)mapper.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(arg));
        return io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(ret);
      }
    };
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$U).safeConvert(delegate.compose(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Apply a <code>mapper</code> function on this future.<p>\n\n When this future succeeds, the <code>mapper</code> will be called with the completed value and this mapper\n returns a value. This value will complete the future returned by this method call.<p>\n\n If the <code>mapper</code> throws an exception, the returned future will be failed with this exception.<p>\n\n When this future fails, the failure will be propagated to the returned future and the <code>mapper</code>\n will not be called.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<U>")
  public <U> Future<U> map(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("U?(T?)") @Name("mapper") @DocAnnotation$annotation$(description = "the mapper function\n") Callable<?> mapper) {
    java.util.function.Function<java.lang.Object,java.lang.Object> arg_0 = mapper == null ? null : new java.util.function.Function<java.lang.Object,java.lang.Object>() {
      public java.lang.Object apply(java.lang.Object arg) {
        Object ret = (Object)mapper.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(arg));
        return io.vertx.lang.ceylon.ToJava.object(ret);
      }
    };
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$U).safeConvert(delegate.map(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="V",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Map the result of a future to a specific <code>value</code>.<p>\n\n When this future succeeds, this <code>value</code> will complete the future returned by this method call.<p>\n\n When this future fails, the failure will be propagated to the returned future.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<V>")
  public <V> Future<V> map(final @Ignore TypeDescriptor $reified$V, 
    final @TypeInfo("V?") @Name("value") @DocAnnotation$annotation$(description = "the value that eventually completes the mapped future\n") V value) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(value);
    Future<V> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$V).safeConvert(delegate.map(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return an handler completing this future\n")
  @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)")
  public Callable<?> completer() {
    if (cached_completer != null) {
      return cached_completer;
    }
    Callable<?> ret = new io.vertx.lang.ceylon.AsyncResultHandlerCallable(io.vertx.lang.ceylon.ToJava.Object, delegate.completer());
    cached_completer = ret;
    return ret;
  }

}
