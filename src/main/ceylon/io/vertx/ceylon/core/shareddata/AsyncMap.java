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

@TypeParameters({
  @TypeParameter(value="K",variance=Variance.NONE),
  @TypeParameter(value="V",variance=Variance.NONE)
})
@DocAnnotation$annotation$(description = "todo")
public class AsyncMap<K,V> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(AsyncMap.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.AsyncMap, AsyncMap> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.AsyncMap, AsyncMap>() {
    public AsyncMap convert(io.vertx.core.shareddata.AsyncMap src) {
      return new AsyncMap(src);
    }
  };

  @Ignore
  private final io.vertx.core.shareddata.AsyncMap delegate;

  public AsyncMap(io.vertx.core.shareddata.AsyncMap delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void get(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(k);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) { public Object toCeylon(java.lang.Object event) { return io.vertx.lang.ceylon.ToCeylon.object(event); } };
    delegate.get(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(v);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.put(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long timeout, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(v);
    long arg_2 = timeout;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.put(arg_0, arg_1, arg_2, arg_3);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void putIfAbsent(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V)") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(v);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(completionHandler) { public Object toCeylon(java.lang.Object event) { return io.vertx.lang.ceylon.ToCeylon.object(event); } };
    delegate.putIfAbsent(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void putIfAbsent(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long timeout, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V)") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(v);
    long arg_2 = timeout;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(completionHandler) { public Object toCeylon(java.lang.Object event) { return io.vertx.lang.ceylon.ToCeylon.object(event); } };
    delegate.putIfAbsent(arg_0, arg_1, arg_2, arg_3);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void remove(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(k);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) { public Object toCeylon(java.lang.Object event) { return io.vertx.lang.ceylon.ToCeylon.object(event); } };
    delegate.remove(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void removeIfPresent(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(v);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) { public Object toCeylon(java.lang.Boolean event) { return ceylon.language.Boolean.instance(event); } };
    delegate.removeIfPresent(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void replace(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(v);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) { public Object toCeylon(java.lang.Object event) { return io.vertx.lang.ceylon.ToCeylon.object(event); } };
    delegate.replace(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void replaceIfPresent(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V oldValue, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V newValue, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(oldValue);
    java.lang.Object arg_2 = io.vertx.lang.ceylon.Helper.toJavaObject(newValue);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) { public Object toCeylon(java.lang.Boolean event) { return ceylon.language.Boolean.instance(event); } };
    delegate.replaceIfPresent(arg_0, arg_1, arg_2, arg_3);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void clear(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(resultHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.clear(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void size(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Integer>(resultHandler) { public Object toCeylon(java.lang.Integer event) { return ceylon.language.Integer.instance((long)(int)event); } };
    delegate.size(arg_0);
  }

}
