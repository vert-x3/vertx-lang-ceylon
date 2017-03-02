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
import java.util.List;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import java.util.function.Function;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " The composite future wraps a list of [futures](Future.type.html), it is useful when several futures\n needs to be coordinated.\n")
public class CompositeFuture extends Future<CompositeFuture> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.CompositeFuture, CompositeFuture> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.CompositeFuture, CompositeFuture>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.CompositeFuture, CompositeFuture> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.CompositeFuture, CompositeFuture>() {
        public CompositeFuture convert(io.vertx.core.CompositeFuture src) {
          return new CompositeFuture(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<CompositeFuture, io.vertx.core.CompositeFuture> TO_JAVA = new io.vertx.lang.ceylon.Converter<CompositeFuture, io.vertx.core.CompositeFuture>() {
    public io.vertx.core.CompositeFuture convert(CompositeFuture src) {
      return src.delegate;
    }
  };

  @Ignore private Callable<?> cached_completer;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(CompositeFuture.class), io.vertx.core.CompositeFuture.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.CompositeFuture delegate;

  public CompositeFuture(io.vertx.core.CompositeFuture delegate) {
    super(TypeDescriptor.klass(io.vertx.core.CompositeFuture.class), delegate);
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

  @DocAnnotation$annotation$(description = " Set the result. Any handler will be called, if there is one, and the future will be marked as completed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void complete(
    final @TypeInfo("io.vertx.ceylon.core::CompositeFuture") @Name("result")@DocAnnotation$annotation$(description = "the result\n") CompositeFuture result) {
    io.vertx.core.CompositeFuture arg_0 = io.vertx.ceylon.core.CompositeFuture.TO_JAVA.safeConvert(result);
    delegate.complete(arg_0);
  }

  @DocAnnotation$annotation$(description = " Set the failure. Any handler will be called, if there is one, and the future will be marked as completed.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean tryComplete(
    final @TypeInfo("io.vertx.ceylon.core::CompositeFuture") @Name("result")@DocAnnotation$annotation$(description = "the result\n") CompositeFuture result) {
    io.vertx.core.CompositeFuture arg_0 = io.vertx.ceylon.core.CompositeFuture.TO_JAVA.safeConvert(result);
    boolean ret = delegate.tryComplete(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " The result of the operation. This will be null if the operation failed.\n")
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public CompositeFuture result() {
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(delegate.result());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Compose this future with a provided <code>next</code> future.<p>\n\n When this (the one on which <code>compose</code> is called) future succeeds, the <code>handler</code> will be called with\n the completed value, this handler should complete the next future.<p>\n\n If the <code>handler</code> throws an exception, the returned future will be failed with this exception.<p>\n\n When this future fails, the failure will be propagated to the <code>next</code> future and the <code>handler</code>\n will not be called.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<U?>")
  public <U> Future<U> compose(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::CompositeFuture)") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler, 
    final @TypeInfo("io.vertx.ceylon.core::Future<U?>") @Name("next")@DocAnnotation$annotation$(description = "the next future\n") Future<U> next) {
    io.vertx.core.Handler<io.vertx.core.CompositeFuture> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.CompositeFuture>() {
      public void handle(io.vertx.core.CompositeFuture event) {
        handler.$call$((Object)io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(next);
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.compose(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Compose this future with a <code>mapper</code> function.<p>\n\n When this future (the one on which <code>compose</code> is called) succeeds, the <code>mapper</code> will be called with\n the completed value and this mapper returns another future object. This returned future completion will complete\n the future returned by this method call.<p>\n\n If the <code>mapper</code> throws an exception, the returned future will be failed with this exception.<p>\n\n When this future fails, the failure will be propagated to the returned future and the <code>mapper</code>\n will not be called.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<U?>")
  public <U> Future<U> compose(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("io.vertx.ceylon.core::Future<U?>(io.vertx.ceylon.core::CompositeFuture)") @Name("mapper")@DocAnnotation$annotation$(description = "the mapper function\n") Callable<?> mapper) {
    java.util.function.Function<io.vertx.core.CompositeFuture,io.vertx.core.Future<java.lang.Object>> arg_0 = mapper == null ? null : new java.util.function.Function<io.vertx.core.CompositeFuture,io.vertx.core.Future<java.lang.Object>>() {
      public io.vertx.core.Future<java.lang.Object> apply(io.vertx.core.CompositeFuture arg) {
        Future<Object> ret = (Future<Object>)mapper.$call$((Object)io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(arg));
        return io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(ret);
      }
    };
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.compose(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Apply a <code>mapper</code> function on this future.<p>\n\n When this future succeeds, the <code>mapper</code> will be called with the completed value and this mapper\n returns a value. This value will complete the future returned by this method call.<p>\n\n If the <code>mapper</code> throws an exception, the returned future will be failed with this exception.<p>\n\n When this future fails, the failure will be propagated to the returned future and the <code>mapper</code>\n will not be called.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<U?>")
  public <U> Future<U> map(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("U?(io.vertx.ceylon.core::CompositeFuture)") @Name("mapper")@DocAnnotation$annotation$(description = "the mapper function\n") Callable<?> mapper) {
    java.util.function.Function<io.vertx.core.CompositeFuture,java.lang.Object> arg_0 = mapper == null ? null : new java.util.function.Function<io.vertx.core.CompositeFuture,java.lang.Object>() {
      public java.lang.Object apply(io.vertx.core.CompositeFuture arg) {
        Object ret = (Object)mapper.$call$((Object)io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.object(ret);
      }
    };
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.map(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core::CompositeFuture)")
  public Callable<?> completer() {
    if (cached_completer != null) {
      return cached_completer;
    }
    Callable<?> ret = new io.vertx.lang.ceylon.AsyncResultHandlerCallable(io.vertx.ceylon.core.CompositeFuture.TO_JAVA, delegate.completer());
    cached_completer = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Handles a failure of this Future by returning the result of another Future.\n If the mapper fails, then the returned future will be failed with this failure.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<io.vertx.ceylon.core::CompositeFuture>")
  public Future<CompositeFuture> recover(
    final @TypeInfo("io.vertx.ceylon.core::Future<io.vertx.ceylon.core::CompositeFuture>(ceylon.language::Throwable)") @Name("mapper")@DocAnnotation$annotation$(description = "A function which takes the exception of a failure and returns a new future.\n") Callable<?> mapper) {
    java.util.function.Function<java.lang.Throwable,io.vertx.core.Future<io.vertx.core.CompositeFuture>> arg_0 = mapper == null ? null : new java.util.function.Function<java.lang.Throwable,io.vertx.core.Future<io.vertx.core.CompositeFuture>>() {
      public io.vertx.core.Future<io.vertx.core.CompositeFuture> apply(java.lang.Throwable arg) {
        Future<CompositeFuture> ret = (Future<CompositeFuture>)mapper.$call$((Object)arg);
        return io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(ret);
      }
    };
    Future<CompositeFuture> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(CompositeFuture.$TypeDescriptor$).safeConvert(delegate.recover(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Apply a <code>mapper</code> function on this future.<p>\n\n When this future fails, the <code>mapper</code> will be called with the completed value and this mapper\n returns a value. This value will complete the future returned by this method call.<p>\n\n If the <code>mapper</code> throws an exception, the returned future will be failed with this exception.<p>\n\n When this future succeeds, the result will be propagated to the returned future and the <code>mapper</code>\n will not be called.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<io.vertx.ceylon.core::CompositeFuture>")
  public Future<CompositeFuture> otherwise(
    final @TypeInfo("io.vertx.ceylon.core::CompositeFuture(ceylon.language::Throwable)") @Name("mapper")@DocAnnotation$annotation$(description = "the mapper function\n") Callable<?> mapper) {
    java.util.function.Function<java.lang.Throwable,io.vertx.core.CompositeFuture> arg_0 = mapper == null ? null : new java.util.function.Function<java.lang.Throwable,io.vertx.core.CompositeFuture>() {
      public io.vertx.core.CompositeFuture apply(java.lang.Throwable arg) {
        CompositeFuture ret = (CompositeFuture)mapper.$call$((Object)arg);
        return io.vertx.ceylon.core.CompositeFuture.TO_JAVA.safeConvert(ret);
      }
    };
    Future<CompositeFuture> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(CompositeFuture.$TypeDescriptor$).safeConvert(delegate.otherwise(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Map the failure of a future to a specific <code>value</code>.<p>\n\n When this future fails, this <code>value</code> will complete the future returned by this method call.<p>\n\n When this future succeeds, the result will be propagated to the returned future.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<io.vertx.ceylon.core::CompositeFuture>")
  public Future<CompositeFuture> otherwise(
    final @TypeInfo("io.vertx.ceylon.core::CompositeFuture") @Name("value")@DocAnnotation$annotation$(description = "the value that eventually completes the mapped future\n") CompositeFuture value) {
    io.vertx.core.CompositeFuture arg_0 = io.vertx.ceylon.core.CompositeFuture.TO_JAVA.safeConvert(value);
    Future<CompositeFuture> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(CompositeFuture.$TypeDescriptor$).safeConvert(delegate.otherwise(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Map the failure of a future to <code>null</code>.<p>\n\n This is a convenience for <code>future.otherwise((T) null)</code>.<p>\n\n When this future fails, the <code>null</code> value will complete the future returned by this method call.<p>\n\n When this future succeeds, the result will be propagated to the returned future.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<io.vertx.ceylon.core::CompositeFuture>")
  public Future<CompositeFuture> otherwiseEmpty() {
    Future<CompositeFuture> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(CompositeFuture.$TypeDescriptor$).safeConvert(delegate.otherwiseEmpty());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public CompositeFuture setHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core::CompositeFuture)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.CompositeFuture>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.CompositeFuture>(handler) {
      public Object toCeylon(io.vertx.core.CompositeFuture event) {
        return io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(event);
      }
    };
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(delegate.setHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set this instance as result. Any handler will be called, if there is one, and the future will be marked as completed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void complete() {
    delegate.complete();
  }

  @DocAnnotation$annotation$(description = " Try to set this instance as result. When it happens, any handler will be called, if there is one, and the future will be marked as completed.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean tryComplete() {
    boolean ret = delegate.tryComplete();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a cause of a wrapped future\n")
  @TypeInfo("ceylon.language::Throwable")
  public Throwable cause(
    final @TypeInfo("ceylon.language::Integer") @Name("index")@DocAnnotation$annotation$(description = "the wrapped future index\n") long index) {
    int arg_0 = (int)index;
    Throwable ret = delegate.cause(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns true if a wrapped future is succeeded\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean succeeded(
    final @TypeInfo("ceylon.language::Integer") @Name("index")@DocAnnotation$annotation$(description = "the wrapped future index\n") long index) {
    int arg_0 = (int)index;
    boolean ret = delegate.succeeded(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns true if a wrapped future is failed\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean failed(
    final @TypeInfo("ceylon.language::Integer") @Name("index")@DocAnnotation$annotation$(description = "the wrapped future index\n") long index) {
    int arg_0 = (int)index;
    boolean ret = delegate.failed(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns true if a wrapped future is completed\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isComplete(
    final @TypeInfo("ceylon.language::Integer") @Name("index")@DocAnnotation$annotation$(description = "the wrapped future index\n") long index) {
    int arg_0 = (int)index;
    boolean ret = delegate.isComplete(arg_0);
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Returns the result of a wrapped future\n")
  @TypeInfo("T?")
  public <T> T resultAt(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Integer") @Name("index")@DocAnnotation$annotation$(description = "the wrapped future index\n") long index) {
    int arg_0 = (int)index;
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.resultAt(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

}
