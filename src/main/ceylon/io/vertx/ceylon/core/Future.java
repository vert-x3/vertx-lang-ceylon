package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@DocAnnotation$annotation$(description = "todo")
public class Future<T> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Future.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.Future, Future> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.Future, Future>() {
    public Future convert(io.vertx.core.Future src) {
      return new Future(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<Future, io.vertx.core.Future> TO_JAVA = new io.vertx.lang.ceylon.Converter<Future, io.vertx.core.Future>() {
    public io.vertx.core.Future convert(Future src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.Future delegate;

  public Future(io.vertx.core.Future delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> future() {
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.convert(io.vertx.core.Future.future());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> succeededFuture() {
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.convert(io.vertx.core.Future.succeededFuture());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> succeededFuture(
    final @TypeInfo("T") @DocAnnotation$annotation$(description = "todo") T result) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(result);
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.convert(io.vertx.core.Future.succeededFuture(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> failedFuture(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String failureMessage) {
    java.lang.String arg_0 = failureMessage.toString();
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.convert(io.vertx.core.Future.failedFuture(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isComplete() {
    boolean ret = delegate.isComplete();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void setHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(handler) { public Object toCeylon(java.lang.Object event) { return io.vertx.lang.ceylon.ToCeylon.object(event); } };
    delegate.setHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void complete(
    final @TypeInfo("T") @DocAnnotation$annotation$(description = "todo") T result) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(result);
    delegate.complete(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void complete() {
    delegate.complete();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String failureMessage) {
    java.lang.String arg_0 = failureMessage.toString();
    delegate.fail(arg_0);
  }

}
