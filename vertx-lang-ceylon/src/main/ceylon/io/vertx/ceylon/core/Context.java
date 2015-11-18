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
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " The execution context of a `handler` execution.\n <p>\n When Vert.x provides an event to a handler or calls the start or stop methods of a `io.vertx.core.Verticle`,\n the execution is associated with a <code>Context</code>.\n <p>\n Usually a context is an *event-loop context* and is tied to a specific event loop thread. So executions for that\n context always occur on that exact same event loop thread.\n <p>\n In the case of worker verticles and running inline blocking code a worker context will be associated with the execution\n which will use a thread from the worker thread pool.\n <p>\n When a handler is set by a thread associated with a specific context, the Vert.x will guarantee that when that handler\n is executed, that execution will be associated with the same context.\n <p>\n If a handler is set by a thread not associated with a context (i.e. a non Vert.x thread). Then a new context will\n be created for that handler.\n <p>\n In other words, a context is propagated.\n <p>\n This means that when a verticle is deployed, any handlers it sets will be associated with the same context - the context\n of the verticle.\n <p>\n This means (in the case of a standard verticle) that the verticle code will always be executed with the exact same\n thread, so you don't have to worry about multi-threaded acccess to the verticle state and you can code your application\n as single threaded.\n <p>\n This class also allows arbitrary data to be [put](Context.type.html#put) and [get](Context.type.html#get) on the context so it can be shared easily\n amongst different handlers of, for example, a verticle instance.\n <p>\n This class also provides [runOnContext](Context.type.html#runOnContext) which allows an action to be executed asynchronously using the same context.\n")
public class Context implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.Context, Context> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.Context, Context>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.Context, Context> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.Context, Context>() {
        public Context convert(io.vertx.core.Context src) {
          return new Context(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Context, io.vertx.core.Context> TO_JAVA = new io.vertx.lang.ceylon.Converter<Context, io.vertx.core.Context>() {
    public io.vertx.core.Context convert(Context src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Context.class);
  @Ignore private final io.vertx.core.Context delegate;

  public Context(io.vertx.core.Context delegate) {
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

  @DocAnnotation$annotation$(description = " Run the specified action asynchronously on the same context, some time after the current execution has completed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void runOnContext(
    final @TypeInfo("ceylon.language::Anything()") @Name("action") @DocAnnotation$annotation$(description = "the action to run\n") Callable<?> action) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = action == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        action.$call$();
      }
    };
    delegate.runOnContext(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Safely execute some blocking code.\n <p>\n Executes the blocking code in the handler <code>blockingCodeHandler</code> using a thread from the worker pool.\n <p>\n When the code is complete the handler <code>resultHandler</code> will be called with the result on the original context\n (e.g. on the original event loop of the caller).\n <p>\n A <code>Future</code> instance is passed into <code>blockingCodeHandler</code>. When the blocking code successfully completes,\n the handler should call the [complete](Future.type.html#complete) or [complete](Future.type.html#complete) method, or the [fail](Future.type.html#fail)\n method if it failed.\n")
  @TypeInfo("ceylon.language::Anything")
  public <T> void executeBlocking(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T>)") @Name("blockingCodeHandler") @DocAnnotation$annotation$(description = "handler representing the blocking code to run\n") Callable<?> blockingCodeHandler, 
    final @TypeInfo("ceylon.language::Boolean") @Name("ordered") @DocAnnotation$annotation$(description = "if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees\n") boolean ordered, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "handler that will be called when the blocking code is complete\n") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>> arg_0 = blockingCodeHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.$call$((Object)io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$T).safeConvert(event));
      }
    };
    boolean arg_1 = ordered;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.executeBlocking(arg_0, arg_1, arg_2);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Invoke [executeBlocking](Context.type.html#executeBlocking) with order = true.\n")
  @TypeInfo("ceylon.language::Anything")
  public <T> void executeBlocking(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T>)") @Name("blockingCodeHandler") @DocAnnotation$annotation$(description = "handler representing the blocking code to run\n") Callable<?> blockingCodeHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "handler that will be called when the blocking code is complete\n") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>> arg_0 = blockingCodeHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.$call$((Object)io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$T).safeConvert(event));
      }
    };
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.executeBlocking(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " If the context is associated with a Verticle deployment, this returns the deployment ID of that deployment.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String deploymentID() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.deploymentID());
    return ret;
  }

  @DocAnnotation$annotation$(description = " If the context is associated with a Verticle deployment, this returns the configuration that was specified when\n the verticle was deployed.\n")
  @TypeInfo("ceylon.json::Object?")
  public ceylon.json.Object config() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.config());
    return ret;
  }

  @DocAnnotation$annotation$(description = " The process args\n")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> processArgs() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.processArgs(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Is the current context an event loop context?\n <p>\n NOTE! when running blocking code using [executeBlocking](Vertx.type.html#executeBlocking) from a\n standard (not worker) verticle, the context will still an event loop context and this \n will return true.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isEventLoopContext() {
    boolean ret = delegate.isEventLoopContext();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Is the current context a worker context?\n <p>\n NOTE! when running blocking code using [executeBlocking](Vertx.type.html#executeBlocking) from a\n standard (not worker) verticle, the context will still an event loop context and this \n will return false.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isWorkerContext() {
    boolean ret = delegate.isWorkerContext();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Is the current context a multi-threaded worker context?\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMultiThreadedWorkerContext() {
    boolean ret = delegate.isMultiThreadedWorkerContext();
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Get some data from the context.\n")
  @TypeInfo("T?")
  public <T> T get(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "the key of the data\n") ceylon.language.String key) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Put some data in the context.\n <p>\n This can be used to share data between different handlers that share a context\n")
  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "the key of the data\n") ceylon.language.String key, 
    final @TypeInfo("ceylon.language::Object?") @Name("value") @DocAnnotation$annotation$(description = "the data\n") Object value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    delegate.put(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Remove some data from the context.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean remove(
    final @TypeInfo("ceylon.language::String") @Name("key") @DocAnnotation$annotation$(description = "the key to remove\n") ceylon.language.String key) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    boolean ret = delegate.remove(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return The Vertx instance that created the context\n")
  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public Vertx owner() {
    Vertx ret = io.vertx.ceylon.core.Vertx.TO_CEYLON.converter().safeConvert(delegate.owner());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return  the number of instances of the verticle that were deployed in the deployment (if any) related\n to this context\n")
  @TypeInfo("ceylon.language::Integer")
  public long getInstanceCount() {
    long ret = delegate.getInstanceCount();
    return ret;
  }

}
