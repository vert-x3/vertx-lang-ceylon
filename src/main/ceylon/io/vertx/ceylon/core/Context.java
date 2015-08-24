package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Handler;

public class Context {

  private final io.vertx.core.Context delegate;

  public Context(io.vertx.core.Context delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Boolean")
  public static boolean isOnWorkerThread() {
    boolean ret = io.vertx.core.Context.isOnWorkerThread();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public static boolean isOnEventLoopThread() {
    boolean ret = io.vertx.core.Context.isOnEventLoopThread();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public static boolean isOnVertxThread() {
    boolean ret = io.vertx.core.Context.isOnVertxThread();
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void runOnContext(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> action) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { action.$call$((Object)null); } };
    delegate.runOnContext(arg_0);
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String deploymentID() {
    ceylon.language.String ret = new ceylon.language.String(delegate.deploymentID());
    return ret;
  }

  @TypeInfo("ceylon.language::JsonObject")
  public JsonObject config() {
    JsonObject ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public List<ceylon.language.String> processArgs() {
    List<ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isEventLoopContext() {
    boolean ret = delegate.isEventLoopContext();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isWorkerContext() {
    boolean ret = delegate.isWorkerContext();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isMultiThreadedWorkerContext() {
    boolean ret = delegate.isMultiThreadedWorkerContext();
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("T")
  public <T> T get(
    final @TypeInfo("ceylon.language::String") ceylon.language.String key) {
    java.lang.String arg_0 = key.toString();
    T ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("ceylon.language::String") ceylon.language.String key, 
    final @TypeInfo("ceylon.language::Object") Object value) {
    java.lang.String arg_0 = key.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(value);
    delegate.put(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean remove(
    final @TypeInfo("ceylon.language::String") ceylon.language.String key) {
    java.lang.String arg_0 = key.toString();
    boolean ret = delegate.remove(arg_0);
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public Vertx owner() {
    Vertx ret = new io.vertx.ceylon.core.Vertx(delegate.owner());
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long getInstanceCount() {
    long ret = delegate.getInstanceCount();
    return ret;
  }

}
