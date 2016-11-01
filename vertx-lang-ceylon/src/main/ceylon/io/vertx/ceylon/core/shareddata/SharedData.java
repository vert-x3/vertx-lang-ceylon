package io.vertx.ceylon.core.shareddata;

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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Shared data allows you to share data safely between different parts of your application in a safe way.\n <p>\n Shared data provides:\n <ul>\n   <li>Cluster wide maps which can be accessed from any node of the cluster</li>\n   <li>Cluster wide locks which can be used to give exclusive access to resources across the cluster</li>\n   <li>Cluster wide counters used to maintain counts consistently across the cluster</li>\n   <li>Local maps for sharing data safely in the same Vert.x instance</li>\n </ul>\n <p>\n Please see the documentation for more information.\n")
public class SharedData implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.shareddata.SharedData, SharedData> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.shareddata.SharedData, SharedData>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.SharedData, SharedData> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.SharedData, SharedData>() {
        public SharedData convert(io.vertx.core.shareddata.SharedData src) {
          return new SharedData(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SharedData, io.vertx.core.shareddata.SharedData> TO_JAVA = new io.vertx.lang.ceylon.Converter<SharedData, io.vertx.core.shareddata.SharedData>() {
    public io.vertx.core.shareddata.SharedData convert(SharedData src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(SharedData.class), io.vertx.core.shareddata.SharedData.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.shareddata.SharedData delegate;

  public SharedData(io.vertx.core.shareddata.SharedData delegate) {
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

  @TypeParameters({
    @TypeParameter(value="K",variance=Variance.NONE),
    @TypeParameter(value="V",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Get the cluster wide map with the specified name. The map is accessible to all nodes in the cluster and data\n put into the map from any node is visible to to any other node.\n")
  @TypeInfo("ceylon.language::Anything")
  public <K,V> void getClusterWideMap(final @Ignore TypeDescriptor $reified$K, final @Ignore TypeDescriptor $reified$V, 
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "the name of the map\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::AsyncMap<K?,V?>)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the map will be returned asynchronously in this handler\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object>>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object>>(resultHandler) {
      public Object toCeylon(io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object> event) {
        return io.vertx.ceylon.core.shareddata.AsyncMap.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$K), io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$V)).safeConvert(event);
      }
    };
    delegate.getClusterWideMap(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Get a cluster wide lock with the specified name. The lock will be passed to the handler when it is available.\n")
  @TypeInfo("ceylon.language::Anything")
  public void getLock(
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "the name of the lock\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::Lock)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.shareddata.Lock>(resultHandler) {
      public Object toCeylon(io.vertx.core.shareddata.Lock event) {
        return io.vertx.ceylon.core.shareddata.Lock.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.getLock(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Like [getLock](../shareddata/SharedData.type.html#getLock) but specifying a timeout. If the lock is not obtained within the timeout\n a failure will be sent to the handler\n")
  @TypeInfo("ceylon.language::Anything")
  public void getLockWithTimeout(
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "the name of the lock\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Integer") @Name("timeout")@DocAnnotation$annotation$(description = "the timeout in ms\n") long timeout, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::Lock)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    long arg_1 = timeout;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.shareddata.Lock>(resultHandler) {
      public Object toCeylon(io.vertx.core.shareddata.Lock event) {
        return io.vertx.ceylon.core.shareddata.Lock.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.getLockWithTimeout(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = " Get a cluster wide counter. The counter will be passed to the handler.\n")
  @TypeInfo("ceylon.language::Anything")
  public void getCounter(
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "the name of the counter.\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::Counter)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Counter>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.shareddata.Counter>(resultHandler) {
      public Object toCeylon(io.vertx.core.shareddata.Counter event) {
        return io.vertx.ceylon.core.shareddata.Counter.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.getCounter(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="K",variance=Variance.NONE),
    @TypeParameter(value="V",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Return a <code>LocalMap</code> with the specific <code>name</code>.\n")
  @TypeInfo("io.vertx.ceylon.core.shareddata::LocalMap<K?,V?>")
  public <K,V> LocalMap<K,V> getLocalMap(final @Ignore TypeDescriptor $reified$K, final @Ignore TypeDescriptor $reified$V, 
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "the name of the map\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    LocalMap<K,V> ret = io.vertx.ceylon.core.shareddata.LocalMap.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$K), io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$V)).safeConvert(delegate.getLocalMap(arg_0));
    return ret;
  }

}
