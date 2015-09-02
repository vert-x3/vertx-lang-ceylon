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
public class SharedData {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SharedData.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.SharedData, SharedData> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.SharedData, SharedData>() {
    public SharedData convert(io.vertx.core.shareddata.SharedData src) {
      return new SharedData(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<SharedData, io.vertx.core.shareddata.SharedData> TO_JAVA = new io.vertx.lang.ceylon.Converter<SharedData, io.vertx.core.shareddata.SharedData>() {
    public io.vertx.core.shareddata.SharedData convert(SharedData src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.shareddata.SharedData delegate;

  public SharedData(io.vertx.core.shareddata.SharedData delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @TypeParameters({
    @TypeParameter(value="K",variance=Variance.NONE),
    @TypeParameter(value="V",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <K,V> void getClusterWideMap(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::AsyncMap<K,V>)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object>>(resultHandler) { public Object toCeylon(io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object> event) { return io.vertx.ceylon.core.shareddata.AsyncMap.TO_CEYLON.convert(event); } };
    delegate.getClusterWideMap(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void getLock(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::Lock)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.shareddata.Lock>(resultHandler) { public Object toCeylon(io.vertx.core.shareddata.Lock event) { return io.vertx.ceylon.core.shareddata.Lock.TO_CEYLON.convert(event); } };
    delegate.getLock(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void getLockWithTimeout(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long timeout, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::Lock)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = name.toString();
    long arg_1 = timeout;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.shareddata.Lock>(resultHandler) { public Object toCeylon(io.vertx.core.shareddata.Lock event) { return io.vertx.ceylon.core.shareddata.Lock.TO_CEYLON.convert(event); } };
    delegate.getLockWithTimeout(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void getCounter(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::Counter)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Counter>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.shareddata.Counter>(resultHandler) { public Object toCeylon(io.vertx.core.shareddata.Counter event) { return io.vertx.ceylon.core.shareddata.Counter.TO_CEYLON.convert(event); } };
    delegate.getCounter(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="K",variance=Variance.NONE),
    @TypeParameter(value="V",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.shareddata::LocalMap<K,V>")
  public <K,V> LocalMap<K,V> getLocalMap(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = name.toString();
    LocalMap<K,V> ret = io.vertx.ceylon.core.shareddata.LocalMap.TO_CEYLON.convert(delegate.getLocalMap(arg_0));
    return ret;
  }

}
