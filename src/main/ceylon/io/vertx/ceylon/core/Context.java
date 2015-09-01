package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class Context {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Context.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.Context, Context> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.Context, Context>() {
    public Context convert(io.vertx.core.Context src) {
      return new Context(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<Context, io.vertx.core.Context> TO_JAVA = new io.vertx.lang.ceylon.Converter<Context, io.vertx.core.Context>() {
    public io.vertx.core.Context convert(Context src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.Context delegate;

  public Context(io.vertx.core.Context delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public static boolean isOnWorkerThread() {
    boolean ret = io.vertx.core.Context.isOnWorkerThread();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public static boolean isOnEventLoopThread() {
    boolean ret = io.vertx.core.Context.isOnEventLoopThread();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public static boolean isOnVertxThread() {
    boolean ret = io.vertx.core.Context.isOnVertxThread();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void runOnContext(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> action) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { action.$call$(); } };
    delegate.runOnContext(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String deploymentID() {
    ceylon.language.String ret = new ceylon.language.String(delegate.deploymentID());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object config() {
    ceylon.json.Object ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> processArgs() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, delegate.processArgs(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isEventLoopContext() {
    boolean ret = delegate.isEventLoopContext();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isWorkerContext() {
    boolean ret = delegate.isWorkerContext();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMultiThreadedWorkerContext() {
    boolean ret = delegate.isMultiThreadedWorkerContext();
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("T")
  public <T> T get(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String key) {
    java.lang.String arg_0 = key.toString();
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String key, 
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object value) {
    java.lang.String arg_0 = key.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(value);
    delegate.put(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean remove(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String key) {
    java.lang.String arg_0 = key.toString();
    boolean ret = delegate.remove(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public Vertx owner() {
    Vertx ret = new io.vertx.ceylon.core.Vertx(delegate.owner());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getInstanceCount() {
    long ret = delegate.getInstanceCount();
    return ret;
  }

}
