package io.vertx.ceylon.core.shareddata;

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

@DocAnnotation$annotation$(description = "todo")
public class Counter {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Counter.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.Counter, Counter> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.Counter, Counter>() {
    public Counter convert(io.vertx.core.shareddata.Counter src) {
      return new Counter(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<Counter, io.vertx.core.shareddata.Counter> TO_JAVA = new io.vertx.lang.ceylon.Converter<Counter, io.vertx.core.shareddata.Counter>() {
    public io.vertx.core.shareddata.Counter convert(Counter src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.shareddata.Counter delegate;

  public Counter(io.vertx.core.shareddata.Counter delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void get(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.get(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void incrementAndGet(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.incrementAndGet(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void getAndIncrement(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.getAndIncrement(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void decrementAndGet(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.decrementAndGet(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void addAndGet(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    long arg_0 = value;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.addAndGet(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void getAndAdd(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    long arg_0 = value;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.getAndAdd(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void compareAndSet(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long expected, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    long arg_0 = expected;
    long arg_1 = value;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) { public Object toCeylon(java.lang.Boolean event) { return ceylon.language.Boolean.instance(event); } };
    delegate.compareAndSet(arg_0, arg_1, arg_2);
  }

}
