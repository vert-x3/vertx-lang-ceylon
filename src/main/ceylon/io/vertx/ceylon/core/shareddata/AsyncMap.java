package io.vertx.ceylon.core.shareddata;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="K",variance=Variance.NONE),
  @TypeParameter(value="V",variance=Variance.NONE)
})
public class AsyncMap<K,V> {

  private final io.vertx.core.shareddata.AsyncMap delegate;

  public AsyncMap(io.vertx.core.shareddata.AsyncMap delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Anything")
  public void get(
    final @TypeInfo("K") K k, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V)") Callable<?> resultHandler) {
    java.lang.Object arg_0 = null;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) { public Object toCeylon(java.lang.Object event) { return null; } };
    delegate.get(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("K") K k, 
    final @TypeInfo("V") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") Callable<?> completionHandler) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.put(arg_0, arg_1, arg_2);
  }

  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("K") K k, 
    final @TypeInfo("V") V v, 
    final @TypeInfo("ceylon.language::Integer") long timeout, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") Callable<?> completionHandler) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    long arg_2 = timeout;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.put(arg_0, arg_1, arg_2, arg_3);
  }

  @TypeInfo("ceylon.language::Anything")
  public void putIfAbsent(
    final @TypeInfo("K") K k, 
    final @TypeInfo("V") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V)") Callable<?> completionHandler) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(completionHandler) { public Object toCeylon(java.lang.Object event) { return null; } };
    delegate.putIfAbsent(arg_0, arg_1, arg_2);
  }

  @TypeInfo("ceylon.language::Anything")
  public void putIfAbsent(
    final @TypeInfo("K") K k, 
    final @TypeInfo("V") V v, 
    final @TypeInfo("ceylon.language::Integer") long timeout, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V)") Callable<?> completionHandler) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    long arg_2 = timeout;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(completionHandler) { public Object toCeylon(java.lang.Object event) { return null; } };
    delegate.putIfAbsent(arg_0, arg_1, arg_2, arg_3);
  }

  @TypeInfo("ceylon.language::Anything")
  public void remove(
    final @TypeInfo("K") K k, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V)") Callable<?> resultHandler) {
    java.lang.Object arg_0 = null;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) { public Object toCeylon(java.lang.Object event) { return null; } };
    delegate.remove(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void removeIfPresent(
    final @TypeInfo("K") K k, 
    final @TypeInfo("V") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") Callable<?> resultHandler) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) { public Object toCeylon(java.lang.Boolean event) { return ceylon.language.Boolean.instance(event); } };
    delegate.removeIfPresent(arg_0, arg_1, arg_2);
  }

  @TypeInfo("ceylon.language::Anything")
  public void replace(
    final @TypeInfo("K") K k, 
    final @TypeInfo("V") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V)") Callable<?> resultHandler) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) { public Object toCeylon(java.lang.Object event) { return null; } };
    delegate.replace(arg_0, arg_1, arg_2);
  }

  @TypeInfo("ceylon.language::Anything")
  public void replaceIfPresent(
    final @TypeInfo("K") K k, 
    final @TypeInfo("V") V oldValue, 
    final @TypeInfo("V") V newValue, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") Callable<?> resultHandler) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    java.lang.Object arg_2 = null;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) { public Object toCeylon(java.lang.Boolean event) { return ceylon.language.Boolean.instance(event); } };
    delegate.replaceIfPresent(arg_0, arg_1, arg_2, arg_3);
  }

  @TypeInfo("ceylon.language::Anything")
  public void clear(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(resultHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.clear(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void size(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Integer>(resultHandler) { public Object toCeylon(java.lang.Integer event) { return ceylon.language.Integer.instance((long)(int)event); } };
    delegate.size(arg_0);
  }

}
