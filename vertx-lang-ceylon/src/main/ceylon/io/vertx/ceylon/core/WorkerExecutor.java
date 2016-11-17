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
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " An executor for executing blocking code in Vert.x .<p>\n\n It provides the same <code>executeBlocking</code> operation than [Context](Context.type.html) and\n [Vertx](Vertx.type.html) but on a separate worker pool.<p>\n")
public class WorkerExecutor implements ReifiedType,  Measured {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.WorkerExecutor, WorkerExecutor> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.WorkerExecutor, WorkerExecutor>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.WorkerExecutor, WorkerExecutor> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.WorkerExecutor, WorkerExecutor>() {
        public WorkerExecutor convert(io.vertx.core.WorkerExecutor src) {
          return new WorkerExecutor(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<WorkerExecutor, io.vertx.core.WorkerExecutor> TO_JAVA = new io.vertx.lang.ceylon.Converter<WorkerExecutor, io.vertx.core.WorkerExecutor>() {
    public io.vertx.core.WorkerExecutor convert(WorkerExecutor src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(WorkerExecutor.class), io.vertx.core.WorkerExecutor.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.WorkerExecutor delegate;

  public WorkerExecutor(io.vertx.core.WorkerExecutor delegate) {
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

  @DocAnnotation$annotation$(description = " Whether the metrics are enabled for this measured object\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Safely execute some blocking code.\n <p>\n Executes the blocking code in the handler <code>blockingCodeHandler</code> using a thread from the worker pool.\n <p>\n When the code is complete the handler <code>resultHandler</code> will be called with the result on the original context\n (e.g. on the original event loop of the caller).\n <p>\n A <code>Future</code> instance is passed into <code>blockingCodeHandler</code>. When the blocking code successfully completes,\n the handler should call the [complete](Future.type.html#complete) or [complete](Future.type.html#complete) method, or the [fail](Future.type.html#fail)\n method if it failed.\n <p>\n In the <code>blockingCodeHandler</code> the current context remains the original context and therefore any task\n scheduled in the <code>blockingCodeHandler</code> will be executed on the this context and not on the worker thread.\n")
  @TypeInfo("ceylon.language::Anything")
  public <T> void executeBlocking(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T?>)") @Name("blockingCodeHandler")@DocAnnotation$annotation$(description = "handler representing the blocking code to run\n") Callable<?> blockingCodeHandler, 
    final @TypeInfo("ceylon.language::Boolean") @Name("ordered")@DocAnnotation$annotation$(description = "if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees\n") boolean ordered, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("resultHandler")@DocAnnotation$annotation$(description = "handler that will be called when the blocking code is complete\n") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>> arg_0 = blockingCodeHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.$call$((Object)io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(event));
      }
    };
    boolean arg_1 = ordered;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Object>(resultHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.executeBlocking(arg_0, arg_1, arg_2);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Like [executeBlocking](WorkerExecutor.type.html#executeBlocking) called with ordered = true.\n")
  @TypeInfo("ceylon.language::Anything")
  public <T> void executeBlocking(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T?>)") @Name("blockingCodeHandler") Callable<?> blockingCodeHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("resultHandler") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>> arg_0 = blockingCodeHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.$call$((Object)io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(event));
      }
    };
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Object>(resultHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.executeBlocking(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Close the executor.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
