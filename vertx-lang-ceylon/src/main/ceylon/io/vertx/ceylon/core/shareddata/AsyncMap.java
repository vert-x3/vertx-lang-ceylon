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

@TypeParameters({
  @TypeParameter(value="K",variance=Variance.NONE),
  @TypeParameter(value="V",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class AsyncMap<K,V> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.shareddata.AsyncMap, AsyncMap> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.shareddata.AsyncMap, AsyncMap>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.AsyncMap, AsyncMap> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.AsyncMap, AsyncMap>() {
        public AsyncMap convert(io.vertx.core.shareddata.AsyncMap src) {
          return new AsyncMap(descriptors[0], descriptors[1], src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<AsyncMap, io.vertx.core.shareddata.AsyncMap> TO_JAVA = new io.vertx.lang.ceylon.Converter<AsyncMap, io.vertx.core.shareddata.AsyncMap>() {
    public io.vertx.core.shareddata.AsyncMap convert(AsyncMap src) {
      return src.delegate;
    }
  };

  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$K;
  @Ignore private final TypeDescriptor $reified$V;
  @Ignore private final io.vertx.core.shareddata.AsyncMap delegate;

  public AsyncMap(@Ignore TypeDescriptor $reified$K, @Ignore TypeDescriptor $reified$V, io.vertx.core.shareddata.AsyncMap delegate) {
    this.$TypeDescriptor$ = TypeDescriptor.klass(AsyncMap.class, $reified$K, $reified$V);
    this.$reified$K = $reified$K;
    this.$reified$V = $reified$V;
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void get(
    final @TypeInfo("K?") @Name("k") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(k);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.get(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("K?") @Name("k") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V?") @Name("v") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(v);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.put(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("K?") @Name("k") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V?") @Name("v") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Integer") @Name("ttl") @DocAnnotation$annotation$(description = "todo") long ttl, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(v);
    long arg_2 = ttl;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.put(arg_0, arg_1, arg_2, arg_3);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void putIfAbsent(
    final @TypeInfo("K?") @Name("k") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V?") @Name("v") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(v);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(completionHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.putIfAbsent(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void putIfAbsent(
    final @TypeInfo("K?") @Name("k") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V?") @Name("v") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Integer") @Name("ttl") @DocAnnotation$annotation$(description = "todo") long ttl, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(v);
    long arg_2 = ttl;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_3 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(completionHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.putIfAbsent(arg_0, arg_1, arg_2, arg_3);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void remove(
    final @TypeInfo("K?") @Name("k") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(k);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.remove(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void removeIfPresent(
    final @TypeInfo("K?") @Name("k") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V?") @Name("v") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(v);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.removeIfPresent(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void replace(
    final @TypeInfo("K?") @Name("k") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V?") @Name("v") @DocAnnotation$annotation$(description = "todo") V v, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|V?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(v);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.replace(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void replaceIfPresent(
    final @TypeInfo("K?") @Name("k") @DocAnnotation$annotation$(description = "todo") K k, 
    final @TypeInfo("V?") @Name("oldValue") @DocAnnotation$annotation$(description = "todo") V oldValue, 
    final @TypeInfo("V?") @Name("newValue") @DocAnnotation$annotation$(description = "todo") V newValue, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(k);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(oldValue);
    java.lang.Object arg_2 = io.vertx.lang.ceylon.ToJava.object(newValue);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_3 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.replaceIfPresent(arg_0, arg_1, arg_2, arg_3);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void clear(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.clear(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void size(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> arg_0 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Integer>(resultHandler) {
      public Object toCeylon(java.lang.Integer event) {
        return io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(event);
      }
    };
    delegate.size(arg_0);
  }

}
