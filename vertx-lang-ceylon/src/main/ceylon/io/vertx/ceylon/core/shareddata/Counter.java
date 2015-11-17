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
@DocAnnotation$annotation$(description = " An asynchronous counter that can be used to across the cluster to maintain a consistent count.\n <p>\n")
public class Counter implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.shareddata.Counter, Counter> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.shareddata.Counter, Counter>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.Counter, Counter> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.Counter, Counter>() {
        public Counter convert(io.vertx.core.shareddata.Counter src) {
          return new Counter(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Counter, io.vertx.core.shareddata.Counter> TO_JAVA = new io.vertx.lang.ceylon.Converter<Counter, io.vertx.core.shareddata.Counter>() {
    public io.vertx.core.shareddata.Counter convert(Counter src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Counter.class);
  @Ignore private final io.vertx.core.shareddata.Counter delegate;

  public Counter(io.vertx.core.shareddata.Counter delegate) {
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

  @DocAnnotation$annotation$(description = " Get the current value of the counter\n")
  @TypeInfo("ceylon.language::Anything")
  public void get(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) {
      public Object toCeylon(java.lang.Long event) {
        return io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event);
      }
    };
    delegate.get(arg_0);
  }

  @DocAnnotation$annotation$(description = " Increment the counter atomically and return the new count\n")
  @TypeInfo("ceylon.language::Anything")
  public void incrementAndGet(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) {
      public Object toCeylon(java.lang.Long event) {
        return io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event);
      }
    };
    delegate.incrementAndGet(arg_0);
  }

  @DocAnnotation$annotation$(description = " Increment the counter atomically and return the value before the increment.\n")
  @TypeInfo("ceylon.language::Anything")
  public void getAndIncrement(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) {
      public Object toCeylon(java.lang.Long event) {
        return io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event);
      }
    };
    delegate.getAndIncrement(arg_0);
  }

  @DocAnnotation$annotation$(description = " Decrement the counter atomically and return the new count\n")
  @TypeInfo("ceylon.language::Anything")
  public void decrementAndGet(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) {
      public Object toCeylon(java.lang.Long event) {
        return io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event);
      }
    };
    delegate.decrementAndGet(arg_0);
  }

  @DocAnnotation$annotation$(description = " Add the value to the counter atomically and return the new count\n")
  @TypeInfo("ceylon.language::Anything")
  public void addAndGet(
    final @TypeInfo("ceylon.language::Integer") @Name("value") @DocAnnotation$annotation$(description = "todo") long value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    long arg_0 = value;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) {
      public Object toCeylon(java.lang.Long event) {
        return io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event);
      }
    };
    delegate.addAndGet(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Add the value to the counter atomically and return the value before the add\n")
  @TypeInfo("ceylon.language::Anything")
  public void getAndAdd(
    final @TypeInfo("ceylon.language::Integer") @Name("value") @DocAnnotation$annotation$(description = "todo") long value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    long arg_0 = value;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) {
      public Object toCeylon(java.lang.Long event) {
        return io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event);
      }
    };
    delegate.getAndAdd(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Set the counter to the specified value only if the current value is the expectec value. This happens\n atomically.\n")
  @TypeInfo("ceylon.language::Anything")
  public void compareAndSet(
    final @TypeInfo("ceylon.language::Integer") @Name("expected") @DocAnnotation$annotation$(description = "todo") long expected, 
    final @TypeInfo("ceylon.language::Integer") @Name("value") @DocAnnotation$annotation$(description = "todo") long value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    long arg_0 = expected;
    long arg_1 = value;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.compareAndSet(arg_0, arg_1, arg_2);
  }

}
