package io.vertx.ceylon.core.shareddata;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void getClusterWideMap(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::AsyncMap<ceylon.language::Object,ceylon.language::Object>)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object>>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object>>(resultHandler) {
      public Object toCeylon(io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object> event) {
        return io.vertx.ceylon.core.shareddata.AsyncMap.TO_CEYLON.safeConvert(event);
      }
    };
    delegate.getClusterWideMap(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void getLock(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::Lock)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.shareddata.Lock>(resultHandler) {
      public Object toCeylon(io.vertx.core.shareddata.Lock event) {
        return io.vertx.ceylon.core.shareddata.Lock.TO_CEYLON.safeConvert(event);
      }
    };
    delegate.getLock(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void getLockWithTimeout(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Integer") @Name("timeout") @DocAnnotation$annotation$(description = "todo") long timeout, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::Lock)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    long arg_1 = timeout;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.shareddata.Lock>(resultHandler) {
      public Object toCeylon(io.vertx.core.shareddata.Lock event) {
        return io.vertx.ceylon.core.shareddata.Lock.TO_CEYLON.safeConvert(event);
      }
    };
    delegate.getLockWithTimeout(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void getCounter(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.shareddata::Counter)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Counter>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.shareddata.Counter>(resultHandler) {
      public Object toCeylon(io.vertx.core.shareddata.Counter event) {
        return io.vertx.ceylon.core.shareddata.Counter.TO_CEYLON.safeConvert(event);
      }
    };
    delegate.getCounter(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.shareddata::LocalMap<ceylon.language::Object,ceylon.language::Object>")
  public LocalMap getLocalMap(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    LocalMap ret = io.vertx.ceylon.core.shareddata.LocalMap.TO_CEYLON.safeConvert(delegate.getLocalMap(arg_0));
    return ret;
  }

}
