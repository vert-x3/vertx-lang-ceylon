package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.Set;
import io.vertx.core.json.JsonArray;
import java.util.List;
import io.vertx.codegen.testmodel.TestEnum;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class NullableTCK {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(NullableTCK.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.NullableTCK, NullableTCK> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.NullableTCK, NullableTCK>() {
    public NullableTCK convert(io.vertx.codegen.testmodel.NullableTCK src) {
      return new NullableTCK(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<NullableTCK, io.vertx.codegen.testmodel.NullableTCK> TO_JAVA = new io.vertx.lang.ceylon.Converter<NullableTCK, io.vertx.codegen.testmodel.NullableTCK>() {
    public io.vertx.codegen.testmodel.NullableTCK convert(NullableTCK src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.codegen.testmodel.NullableTCK delegate;

  public NullableTCK(io.vertx.codegen.testmodel.NullableTCK delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableByteParam(
    final @TypeInfo("ceylon.language::Byte") @DocAnnotation$annotation$(description = "todo") ceylon.language.Byte param) {
    java.lang.Byte arg_0 = io.vertx.lang.ceylon.ToJava.Byte.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableByteParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableByteParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Byte?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Byte param) {
    boolean arg_0 = expectNull;
    java.lang.Byte arg_1 = io.vertx.lang.ceylon.ToJava.Byte.safeConvert(param);
    delegate.methodWithNullableByteParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableByteHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Byte?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.lang.Byte> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Byte>() {
      public void handle(java.lang.Byte event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Byte.safeConvert(event));
      }
    };
    delegate.methodWithNullableByteHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableByteHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Byte?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Byte>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Byte>(handler) {
      public Object toCeylon(java.lang.Byte event) {
        return io.vertx.lang.ceylon.ToCeylon.Byte.safeConvert(event);
      }
    };
    delegate.methodWithNullableByteHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Byte?")
  public ceylon.language.Byte methodWithNullableByteReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Byte ret = io.vertx.lang.ceylon.ToCeylon.Byte.safeConvert(delegate.methodWithNullableByteReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableShortParam(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") ceylon.language.Integer param) {
    java.lang.Short arg_0 = io.vertx.lang.ceylon.ToJava.Short.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableShortParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableShortParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Integer?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Integer param) {
    boolean arg_0 = expectNull;
    java.lang.Short arg_1 = io.vertx.lang.ceylon.ToJava.Short.safeConvert(param);
    delegate.methodWithNullableShortParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableShortHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.lang.Short> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Short>() {
      public void handle(java.lang.Short event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Short.safeConvert(event));
      }
    };
    delegate.methodWithNullableShortHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableShortHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Short>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Short>(handler) {
      public Object toCeylon(java.lang.Short event) {
        return io.vertx.lang.ceylon.ToCeylon.Short.safeConvert(event);
      }
    };
    delegate.methodWithNullableShortHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer?")
  public ceylon.language.Integer methodWithNullableShortReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Integer ret = io.vertx.lang.ceylon.ToCeylon.Short.safeConvert(delegate.methodWithNullableShortReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableIntegerParam(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") ceylon.language.Integer param) {
    java.lang.Integer arg_0 = io.vertx.lang.ceylon.ToJava.Integer.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableIntegerParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableIntegerParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Integer?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Integer param) {
    boolean arg_0 = expectNull;
    java.lang.Integer arg_1 = io.vertx.lang.ceylon.ToJava.Integer.safeConvert(param);
    delegate.methodWithNullableIntegerParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableIntegerHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.lang.Integer> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Integer>() {
      public void handle(java.lang.Integer event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(event));
      }
    };
    delegate.methodWithNullableIntegerHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableIntegerHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Integer>(handler) {
      public Object toCeylon(java.lang.Integer event) {
        return io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(event);
      }
    };
    delegate.methodWithNullableIntegerHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer?")
  public ceylon.language.Integer methodWithNullableIntegerReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Integer ret = io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(delegate.methodWithNullableIntegerReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableLongParam(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") ceylon.language.Integer param) {
    java.lang.Long arg_0 = io.vertx.lang.ceylon.ToJava.Long.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableLongParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableLongParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Integer?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Integer param) {
    boolean arg_0 = expectNull;
    java.lang.Long arg_1 = io.vertx.lang.ceylon.ToJava.Long.safeConvert(param);
    delegate.methodWithNullableLongParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableLongHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.lang.Long> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Long>() {
      public void handle(java.lang.Long event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event));
      }
    };
    delegate.methodWithNullableLongHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableLongHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(handler) {
      public Object toCeylon(java.lang.Long event) {
        return io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event);
      }
    };
    delegate.methodWithNullableLongHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer?")
  public ceylon.language.Integer methodWithNullableLongReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Integer ret = io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(delegate.methodWithNullableLongReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableFloatParam(
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") ceylon.language.Float param) {
    java.lang.Float arg_0 = io.vertx.lang.ceylon.ToJava.Float.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableFloatParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableFloatParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Float?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Float param) {
    boolean arg_0 = expectNull;
    java.lang.Float arg_1 = io.vertx.lang.ceylon.ToJava.Float.safeConvert(param);
    delegate.methodWithNullableFloatParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableFloatHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Float?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.lang.Float> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Float>() {
      public void handle(java.lang.Float event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Float.safeConvert(event));
      }
    };
    delegate.methodWithNullableFloatHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableFloatHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Float?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Float>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Float>(handler) {
      public Object toCeylon(java.lang.Float event) {
        return io.vertx.lang.ceylon.ToCeylon.Float.safeConvert(event);
      }
    };
    delegate.methodWithNullableFloatHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Float?")
  public ceylon.language.Float methodWithNullableFloatReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Float ret = io.vertx.lang.ceylon.ToCeylon.Float.safeConvert(delegate.methodWithNullableFloatReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableDoubleParam(
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") ceylon.language.Float param) {
    java.lang.Double arg_0 = io.vertx.lang.ceylon.ToJava.Double.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableDoubleParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableDoubleParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Float?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Float param) {
    boolean arg_0 = expectNull;
    java.lang.Double arg_1 = io.vertx.lang.ceylon.ToJava.Double.safeConvert(param);
    delegate.methodWithNullableDoubleParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableDoubleHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Float?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.lang.Double> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Double>() {
      public void handle(java.lang.Double event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Double.safeConvert(event));
      }
    };
    delegate.methodWithNullableDoubleHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableDoubleHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Float?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Double>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Double>(handler) {
      public Object toCeylon(java.lang.Double event) {
        return io.vertx.lang.ceylon.ToCeylon.Double.safeConvert(event);
      }
    };
    delegate.methodWithNullableDoubleHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Float?")
  public ceylon.language.Float methodWithNullableDoubleReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Float ret = io.vertx.lang.ceylon.ToCeylon.Double.safeConvert(delegate.methodWithNullableDoubleReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableBooleanParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") ceylon.language.Boolean param) {
    java.lang.Boolean arg_0 = io.vertx.lang.ceylon.ToJava.Boolean.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableBooleanParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableBooleanParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Boolean?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Boolean param) {
    boolean arg_0 = expectNull;
    java.lang.Boolean arg_1 = io.vertx.lang.ceylon.ToJava.Boolean.safeConvert(param);
    delegate.methodWithNullableBooleanParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableBooleanHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Boolean?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.lang.Boolean> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Boolean>() {
      public void handle(java.lang.Boolean event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event));
      }
    };
    delegate.methodWithNullableBooleanHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableBooleanHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(handler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.methodWithNullableBooleanHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean?")
  public ceylon.language.Boolean methodWithNullableBooleanReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Boolean ret = io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(delegate.methodWithNullableBooleanReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableStringParam(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String param) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableStringParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableStringParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::String?") @DocAnnotation$annotation$(description = "todo") ceylon.language.String param) {
    boolean arg_0 = expectNull;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(param);
    delegate.methodWithNullableStringParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableStringHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.lang.String> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    delegate.methodWithNullableStringHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableStringHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    delegate.methodWithNullableStringHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String methodWithNullableStringReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithNullableStringReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableCharParam(
    final @TypeInfo("ceylon.language::Character") @DocAnnotation$annotation$(description = "todo") ceylon.language.Character param) {
    java.lang.Character arg_0 = io.vertx.lang.ceylon.ToJava.Character.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableCharParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableCharParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Character?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Character param) {
    boolean arg_0 = expectNull;
    java.lang.Character arg_1 = io.vertx.lang.ceylon.ToJava.Character.safeConvert(param);
    delegate.methodWithNullableCharParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableCharHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Character?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.lang.Character> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Character>() {
      public void handle(java.lang.Character event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Character.safeConvert(event));
      }
    };
    delegate.methodWithNullableCharHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableCharHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Character?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Character>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Character>(handler) {
      public Object toCeylon(java.lang.Character event) {
        return io.vertx.lang.ceylon.ToCeylon.Character.safeConvert(event);
      }
    };
    delegate.methodWithNullableCharHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Character?")
  public ceylon.language.Character methodWithNullableCharReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Character ret = io.vertx.lang.ceylon.ToCeylon.Character.safeConvert(delegate.methodWithNullableCharReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableJsonObjectParam(
    final @TypeInfo("ceylon.json::Object") @DocAnnotation$annotation$(description = "todo") ceylon.json.Object param) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableJsonObjectParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableJsonObjectParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.json::Object?") @DocAnnotation$annotation$(description = "todo") ceylon.json.Object param) {
    boolean arg_0 = expectNull;
    io.vertx.core.json.JsonObject arg_1 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(param);
    delegate.methodWithNullableJsonObjectParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableJsonObjectHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Object?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.json.JsonObject> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.json.JsonObject>() {
      public void handle(io.vertx.core.json.JsonObject event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event));
      }
    };
    delegate.methodWithNullableJsonObjectHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableJsonObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonObject>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonObject event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event);
      }
    };
    delegate.methodWithNullableJsonObjectHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Object?")
  public ceylon.json.Object methodWithNullableJsonObjectReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.methodWithNullableJsonObjectReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableJsonArrayParam(
    final @TypeInfo("ceylon.json::Array") @DocAnnotation$annotation$(description = "todo") ceylon.json.Array param) {
    io.vertx.core.json.JsonArray arg_0 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableJsonArrayParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableJsonArrayParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.json::Array?") @DocAnnotation$annotation$(description = "todo") ceylon.json.Array param) {
    boolean arg_0 = expectNull;
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(param);
    delegate.methodWithNullableJsonArrayParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableJsonArrayHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Array?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() {
      public void handle(io.vertx.core.json.JsonArray event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event));
      }
    };
    delegate.methodWithNullableJsonArrayHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableJsonArrayHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonArray>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonArray event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event);
      }
    };
    delegate.methodWithNullableJsonArrayHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Array?")
  public ceylon.json.Array methodWithNullableJsonArrayReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.json.Array ret = io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(delegate.methodWithNullableJsonArrayReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableApiParam(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @DocAnnotation$annotation$(description = "todo") RefedInterface1 param) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA.safeConvert(param);
    boolean ret = delegate.methodWithNonNullableApiParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableApiParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1?") @DocAnnotation$annotation$(description = "todo") RefedInterface1 param) {
    boolean arg_0 = expectNull;
    io.vertx.codegen.testmodel.RefedInterface1 arg_1 = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA.safeConvert(param);
    delegate.methodWithNullableApiParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableApiHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.codegen.testmodel::RefedInterface1?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1>() {
      public void handle(io.vertx.codegen.testmodel.RefedInterface1 event) {
        handler.$call$((Object)io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON.safeConvert(event));
      }
    };
    delegate.methodWithNullableApiHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableApiHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.codegen.testmodel::RefedInterface1?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.RefedInterface1>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.RefedInterface1>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.RefedInterface1 event) {
        return io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON.safeConvert(event);
      }
    };
    delegate.methodWithNullableApiHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1?")
  public RefedInterface1 methodWithNullableApiReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    RefedInterface1 ret = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON.safeConvert(delegate.methodWithNullableApiReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableDataObjectParam(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::TestDataObject") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.codegen.testmodel.TestDataObject param) {
    io.vertx.codegen.testmodel.TestDataObject arg_0 = param == null ? null : new io.vertx.codegen.testmodel.TestDataObject(io.vertx.lang.ceylon.ToJava.JsonObject.convert(param.toJson()));
    boolean ret = delegate.methodWithNonNullableDataObjectParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableDataObjectParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::TestDataObject?") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.codegen.testmodel.TestDataObject param) {
    boolean arg_0 = expectNull;
    io.vertx.codegen.testmodel.TestDataObject arg_1 = param == null ? null : new io.vertx.codegen.testmodel.TestDataObject(io.vertx.lang.ceylon.ToJava.JsonObject.convert(param.toJson()));
    delegate.methodWithNullableDataObjectParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableDataObjectHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.codegen.testmodel::TestDataObject?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.codegen.testmodel.TestDataObject> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.TestDataObject>() {
      public void handle(io.vertx.codegen.testmodel.TestDataObject event) {
        handler.$call$((Object)io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_().safeConvert(event));
      }
    };
    delegate.methodWithNullableDataObjectHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableDataObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.codegen.testmodel::TestDataObject?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.TestDataObject>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.TestDataObject>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.TestDataObject event) {
        return io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_().safeConvert(event);
      }
    };
    delegate.methodWithNullableDataObjectHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::TestDataObject?")
  public io.vertx.ceylon.codegen.testmodel.TestDataObject methodWithNullableDataObjectReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    io.vertx.ceylon.codegen.testmodel.TestDataObject ret = io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_().safeConvert(delegate.methodWithNullableDataObjectReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableEnumParam(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String param) {
    io.vertx.codegen.testmodel.TestEnum arg_0 = io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class).safeConvert(param);
    boolean ret = delegate.methodWithNonNullableEnumParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableEnumParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::String?") @DocAnnotation$annotation$(description = "todo") ceylon.language.String param) {
    boolean arg_0 = expectNull;
    io.vertx.codegen.testmodel.TestEnum arg_1 = io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class).safeConvert(param);
    delegate.methodWithNullableEnumParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableEnumHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.codegen.testmodel.TestEnum> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.TestEnum>() {
      public void handle(io.vertx.codegen.testmodel.TestEnum event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Enumeration.safeConvert(event));
      }
    };
    delegate.methodWithNullableEnumHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableEnumHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.TestEnum>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.TestEnum>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.TestEnum event) {
        return io.vertx.lang.ceylon.ToCeylon.Enumeration.safeConvert(event);
      }
    };
    delegate.methodWithNullableEnumHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String methodWithNullableEnumReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.Enumeration.safeConvert(delegate.methodWithNullableEnumReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <T> void methodWithNullableTypeVariableParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("T") @DocAnnotation$annotation$(description = "todo") T param) {
    boolean arg_0 = expectNull;
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(param);
    delegate.methodWithNullableTypeVariableParam(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <T> void methodWithNullableTypeVariableHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("T") @DocAnnotation$annotation$(description = "todo") T value, 
    final @TypeInfo("ceylon.language::Anything(T)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    io.vertx.core.Handler<java.lang.Object> arg_2 = handler == null ? null : new io.vertx.core.Handler<java.lang.Object>() {
      public void handle(java.lang.Object event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(event));
      }
    };
    delegate.methodWithNullableTypeVariableHandler(arg_0, arg_1, arg_2);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <T> void methodWithNullableTypeVariableHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("T") @DocAnnotation$annotation$(description = "todo") T value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(handler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.methodWithNullableTypeVariableHandlerAsyncResult(arg_0, arg_1, arg_2);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("T?")
  public <T> T methodWithNullableTypeVariableReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("T") @DocAnnotation$annotation$(description = "todo") T value) {
    boolean arg_0 = notNull;
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.methodWithNullableTypeVariableReturn(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListByteParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Byte>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Byte> param) {
    java.util.List<java.lang.Byte> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Byte);
    boolean ret = delegate.methodWithNonNullableListByteParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListByteParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Byte>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Byte> param) {
    boolean arg_0 = expectNull;
    java.util.List<java.lang.Byte> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Byte);
    delegate.methodWithNullableListByteParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListByteHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Byte>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<java.lang.Byte>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Byte>>() {
      public void handle(java.util.List<java.lang.Byte> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Byte));
      }
    };
    delegate.methodWithNullableListByteHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListByteHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Byte>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Byte>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Byte>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Byte> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Byte);
      }
    };
    delegate.methodWithNullableListByteHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Byte>?")
  public ceylon.language.List<ceylon.language.Byte> methodWithNullableListByteReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.language.Byte> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Byte.$TypeDescriptor$, delegate.methodWithNullableListByteReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Byte);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListShortParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> param) {
    java.util.List<java.lang.Short> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Short);
    boolean ret = delegate.methodWithNonNullableListShortParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListShortParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> param) {
    boolean arg_0 = expectNull;
    java.util.List<java.lang.Short> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Short);
    delegate.methodWithNullableListShortParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListShortHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<java.lang.Short>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Short>>() {
      public void handle(java.util.List<java.lang.Short> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Short));
      }
    };
    delegate.methodWithNullableListShortHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListShortHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Short>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Short>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Short> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Short);
      }
    };
    delegate.methodWithNullableListShortHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Integer>?")
  public ceylon.language.List<ceylon.language.Integer> methodWithNullableListShortReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithNullableListShortReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Short);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListIntegerParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> param) {
    java.util.List<java.lang.Integer> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Integer);
    boolean ret = delegate.methodWithNonNullableListIntegerParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListIntegerParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> param) {
    boolean arg_0 = expectNull;
    java.util.List<java.lang.Integer> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Integer);
    delegate.methodWithNullableListIntegerParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListIntegerHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<java.lang.Integer>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Integer>>() {
      public void handle(java.util.List<java.lang.Integer> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer));
      }
    };
    delegate.methodWithNullableListIntegerHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListIntegerHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    delegate.methodWithNullableListIntegerHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Integer>?")
  public ceylon.language.List<ceylon.language.Integer> methodWithNullableListIntegerReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithNullableListIntegerReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Integer);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListLongParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> param) {
    java.util.List<java.lang.Long> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Long);
    boolean ret = delegate.methodWithNonNullableListLongParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListLongParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> param) {
    boolean arg_0 = expectNull;
    java.util.List<java.lang.Long> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Long);
    delegate.methodWithNullableListLongParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListLongHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<java.lang.Long>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Long>>() {
      public void handle(java.util.List<java.lang.Long> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Long));
      }
    };
    delegate.methodWithNullableListLongHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListLongHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Long>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Long>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Long> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Long);
      }
    };
    delegate.methodWithNullableListLongHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Integer>?")
  public ceylon.language.List<ceylon.language.Integer> methodWithNullableListLongReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithNullableListLongReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListFloatParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Float>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Float> param) {
    java.util.List<java.lang.Float> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Float);
    boolean ret = delegate.methodWithNonNullableListFloatParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListFloatParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Float>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Float> param) {
    boolean arg_0 = expectNull;
    java.util.List<java.lang.Float> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Float);
    delegate.methodWithNullableListFloatParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListFloatHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<java.lang.Float>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Float>>() {
      public void handle(java.util.List<java.lang.Float> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Float));
      }
    };
    delegate.methodWithNullableListFloatHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListFloatHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Float>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Float>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Float> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Float);
      }
    };
    delegate.methodWithNullableListFloatHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Float>?")
  public ceylon.language.List<ceylon.language.Float> methodWithNullableListFloatReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, delegate.methodWithNullableListFloatReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Float);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListDoubleParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Float>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Float> param) {
    java.util.List<java.lang.Double> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Double);
    boolean ret = delegate.methodWithNonNullableListDoubleParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListDoubleParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Float>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Float> param) {
    boolean arg_0 = expectNull;
    java.util.List<java.lang.Double> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Double);
    delegate.methodWithNullableListDoubleParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListDoubleHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<java.lang.Double>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Double>>() {
      public void handle(java.util.List<java.lang.Double> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Double));
      }
    };
    delegate.methodWithNullableListDoubleHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListDoubleHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Double>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Double>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Double> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Double);
      }
    };
    delegate.methodWithNullableListDoubleHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Float>?")
  public ceylon.language.List<ceylon.language.Float> methodWithNullableListDoubleReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, delegate.methodWithNullableListDoubleReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Double);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListBooleanParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Boolean>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Boolean> param) {
    java.util.List<java.lang.Boolean> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Boolean);
    boolean ret = delegate.methodWithNonNullableListBooleanParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListBooleanParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Boolean>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Boolean> param) {
    boolean arg_0 = expectNull;
    java.util.List<java.lang.Boolean> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Boolean);
    delegate.methodWithNullableListBooleanParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListBooleanHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Boolean>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<java.lang.Boolean>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Boolean>>() {
      public void handle(java.util.List<java.lang.Boolean> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Boolean));
      }
    };
    delegate.methodWithNullableListBooleanHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListBooleanHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Boolean>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Boolean>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Boolean>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Boolean> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Boolean);
      }
    };
    delegate.methodWithNullableListBooleanHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Boolean>?")
  public ceylon.language.List<ceylon.language.Boolean> methodWithNullableListBooleanReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.language.Boolean> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Boolean.$TypeDescriptor$, delegate.methodWithNullableListBooleanReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Boolean);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListStringParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> param) {
    java.util.List<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.String);
    boolean ret = delegate.methodWithNonNullableListStringParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListStringParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.language::String>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> param) {
    boolean arg_0 = expectNull;
    java.util.List<java.lang.String> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.String);
    delegate.methodWithNullableListStringParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListStringHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::String>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.String>>() {
      public void handle(java.util.List<java.lang.String> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String));
      }
    };
    delegate.methodWithNullableListStringHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListStringHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    delegate.methodWithNullableListStringHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>?")
  public ceylon.language.List<ceylon.language.String> methodWithNullableListStringReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, delegate.methodWithNullableListStringReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListCharParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Character>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Character> param) {
    java.util.List<java.lang.Character> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Character);
    boolean ret = delegate.methodWithNonNullableListCharParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListCharParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Character>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Character> param) {
    boolean arg_0 = expectNull;
    java.util.List<java.lang.Character> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Character);
    delegate.methodWithNullableListCharParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListCharHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Character>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<java.lang.Character>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Character>>() {
      public void handle(java.util.List<java.lang.Character> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Character));
      }
    };
    delegate.methodWithNullableListCharHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListCharHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Character>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Character>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Character>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Character> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Character);
      }
    };
    delegate.methodWithNullableListCharHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Character>?")
  public ceylon.language.List<ceylon.language.Character> methodWithNullableListCharReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.language.Character> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Character.$TypeDescriptor$, delegate.methodWithNullableListCharReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Character);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListJsonObjectParam(
    final @TypeInfo("ceylon.language::List<ceylon.json::Object>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.json.Object> param) {
    java.util.List<io.vertx.core.json.JsonObject> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.JsonObject);
    boolean ret = delegate.methodWithNonNullableListJsonObjectParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListJsonObjectParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Object>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.json.Object> param) {
    boolean arg_0 = expectNull;
    java.util.List<io.vertx.core.json.JsonObject> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.JsonObject);
    delegate.methodWithNullableListJsonObjectParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListJsonObjectHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Object>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonObject> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithNullableListJsonObjectHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListJsonObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Object>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithNullableListJsonObjectHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Object>?")
  public ceylon.language.List<ceylon.json.Object> methodWithNullableListJsonObjectReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithNullableListJsonObjectReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListJsonArrayParam(
    final @TypeInfo("ceylon.language::List<ceylon.json::Array>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.json.Array> param) {
    java.util.List<io.vertx.core.json.JsonArray> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.JsonArray);
    boolean ret = delegate.methodWithNonNullableListJsonArrayParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListJsonArrayParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Array>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.json.Array> param) {
    boolean arg_0 = expectNull;
    java.util.List<io.vertx.core.json.JsonArray> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.JsonArray);
    delegate.methodWithNullableListJsonArrayParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListJsonArrayHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Array>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonArray> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithNullableListJsonArrayHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListJsonArrayHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Array>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithNullableListJsonArrayHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Array>?")
  public ceylon.language.List<ceylon.json.Array> methodWithNullableListJsonArrayReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithNullableListJsonArrayReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListApiParam(
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<RefedInterface1> param) {
    java.util.List<io.vertx.codegen.testmodel.RefedInterface1> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    boolean ret = delegate.methodWithNonNullableListApiParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListApiParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<RefedInterface1> param) {
    boolean arg_0 = expectNull;
    java.util.List<io.vertx.codegen.testmodel.RefedInterface1> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    delegate.methodWithNullableListApiParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListApiHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON));
      }
    };
    delegate.methodWithNullableListApiHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListApiHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON);
      }
    };
    delegate.methodWithNullableListApiHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>?")
  public ceylon.language.List<RefedInterface1> methodWithNullableListApiReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<RefedInterface1> ret = io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, delegate.methodWithNullableListApiReturn(arg_0), io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListDataObjectParam(
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> param) {
    java.util.List<io.vertx.codegen.testmodel.TestDataObject> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.ceylon.codegen.testmodel.toJavaTestDataObject_.get_());
    boolean ret = delegate.methodWithNonNullableListDataObjectParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListDataObjectParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> param) {
    boolean arg_0 = expectNull;
    java.util.List<io.vertx.codegen.testmodel.TestDataObject> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.ceylon.codegen.testmodel.toJavaTestDataObject_.get_());
    delegate.methodWithNullableListDataObjectParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListDataObjectHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_()));
      }
    };
    delegate.methodWithNullableListDataObjectHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListDataObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_());
      }
    };
    delegate.methodWithNullableListDataObjectHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>?")
  public ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> methodWithNullableListDataObjectReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> ret = io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, delegate.methodWithNullableListDataObjectReturn(arg_0), io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableListEnumParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> param) {
    java.util.List<io.vertx.codegen.testmodel.TestEnum> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class));
    boolean ret = delegate.methodWithNonNullableListEnumParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListEnumParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::List<ceylon.language::String>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> param) {
    boolean arg_0 = expectNull;
    java.util.List<io.vertx.codegen.testmodel.TestEnum> arg_1 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class));
    delegate.methodWithNullableListEnumParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListEnumHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::String>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestEnum>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestEnum>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.TestEnum> event) {
        handler.$call$((Object)null);
      }
    };
    delegate.methodWithNullableListEnumHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableListEnumHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestEnum>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestEnum>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestEnum> event) {
        return null;
      }
    };
    delegate.methodWithNullableListEnumHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>?")
  public ceylon.language.List<ceylon.language.String> methodWithNullableListEnumReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.List<ceylon.language.String> ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetByteParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Byte>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Byte> param) {
    java.util.Set<java.lang.Byte> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Byte);
    boolean ret = delegate.methodWithNonNullableSetByteParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetByteParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Byte>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Byte> param) {
    boolean arg_0 = expectNull;
    java.util.Set<java.lang.Byte> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Byte);
    delegate.methodWithNullableSetByteParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetByteHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Byte>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<java.lang.Byte>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Byte>>() {
      public void handle(java.util.Set<java.lang.Byte> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Byte));
      }
    };
    delegate.methodWithNullableSetByteHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetByteHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Byte>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Byte>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Byte>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Byte> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Byte);
      }
    };
    delegate.methodWithNullableSetByteHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Byte>?")
  public ceylon.language.Set<ceylon.language.Byte> methodWithNullableSetByteReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.language.Byte> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Byte.$TypeDescriptor$, delegate.methodWithNullableSetByteReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Byte);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetShortParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> param) {
    java.util.Set<java.lang.Short> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Short);
    boolean ret = delegate.methodWithNonNullableSetShortParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetShortParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> param) {
    boolean arg_0 = expectNull;
    java.util.Set<java.lang.Short> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Short);
    delegate.methodWithNullableSetShortParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetShortHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<java.lang.Short>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Short>>() {
      public void handle(java.util.Set<java.lang.Short> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Short));
      }
    };
    delegate.methodWithNullableSetShortHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetShortHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Short>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Short>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Short> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Short);
      }
    };
    delegate.methodWithNullableSetShortHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Integer>?")
  public ceylon.language.Set<ceylon.language.Integer> methodWithNullableSetShortReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithNullableSetShortReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Short);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetIntegerParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> param) {
    java.util.Set<java.lang.Integer> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Integer);
    boolean ret = delegate.methodWithNonNullableSetIntegerParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetIntegerParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> param) {
    boolean arg_0 = expectNull;
    java.util.Set<java.lang.Integer> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Integer);
    delegate.methodWithNullableSetIntegerParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetIntegerHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<java.lang.Integer>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Integer>>() {
      public void handle(java.util.Set<java.lang.Integer> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer));
      }
    };
    delegate.methodWithNullableSetIntegerHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetIntegerHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Integer>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    delegate.methodWithNullableSetIntegerHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Integer>?")
  public ceylon.language.Set<ceylon.language.Integer> methodWithNullableSetIntegerReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithNullableSetIntegerReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Integer);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetLongParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> param) {
    java.util.Set<java.lang.Long> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Long);
    boolean ret = delegate.methodWithNonNullableSetLongParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetLongParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> param) {
    boolean arg_0 = expectNull;
    java.util.Set<java.lang.Long> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Long);
    delegate.methodWithNullableSetLongParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetLongHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<java.lang.Long>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Long>>() {
      public void handle(java.util.Set<java.lang.Long> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Long));
      }
    };
    delegate.methodWithNullableSetLongHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetLongHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Long>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Long>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Long> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Long);
      }
    };
    delegate.methodWithNullableSetLongHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Integer>?")
  public ceylon.language.Set<ceylon.language.Integer> methodWithNullableSetLongReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithNullableSetLongReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetFloatParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Float>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Float> param) {
    java.util.Set<java.lang.Float> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Float);
    boolean ret = delegate.methodWithNonNullableSetFloatParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetFloatParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Float>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Float> param) {
    boolean arg_0 = expectNull;
    java.util.Set<java.lang.Float> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Float);
    delegate.methodWithNullableSetFloatParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetFloatHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<java.lang.Float>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Float>>() {
      public void handle(java.util.Set<java.lang.Float> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Float));
      }
    };
    delegate.methodWithNullableSetFloatHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetFloatHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Float>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Float>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Float> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Float);
      }
    };
    delegate.methodWithNullableSetFloatHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Float>?")
  public ceylon.language.Set<ceylon.language.Float> methodWithNullableSetFloatReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, delegate.methodWithNullableSetFloatReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Float);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetDoubleParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Float>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Float> param) {
    java.util.Set<java.lang.Double> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Double);
    boolean ret = delegate.methodWithNonNullableSetDoubleParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetDoubleParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Float>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Float> param) {
    boolean arg_0 = expectNull;
    java.util.Set<java.lang.Double> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Double);
    delegate.methodWithNullableSetDoubleParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetDoubleHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<java.lang.Double>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Double>>() {
      public void handle(java.util.Set<java.lang.Double> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Double));
      }
    };
    delegate.methodWithNullableSetDoubleHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetDoubleHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Double>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Double>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Double> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Double);
      }
    };
    delegate.methodWithNullableSetDoubleHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Float>?")
  public ceylon.language.Set<ceylon.language.Float> methodWithNullableSetDoubleReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, delegate.methodWithNullableSetDoubleReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Double);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetBooleanParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Boolean>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Boolean> param) {
    java.util.Set<java.lang.Boolean> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Boolean);
    boolean ret = delegate.methodWithNonNullableSetBooleanParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetBooleanParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Boolean>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Boolean> param) {
    boolean arg_0 = expectNull;
    java.util.Set<java.lang.Boolean> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Boolean);
    delegate.methodWithNullableSetBooleanParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetBooleanHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Boolean>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<java.lang.Boolean>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Boolean>>() {
      public void handle(java.util.Set<java.lang.Boolean> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Boolean));
      }
    };
    delegate.methodWithNullableSetBooleanHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetBooleanHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Boolean>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Boolean>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Boolean>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Boolean> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Boolean);
      }
    };
    delegate.methodWithNullableSetBooleanHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Boolean>?")
  public ceylon.language.Set<ceylon.language.Boolean> methodWithNullableSetBooleanReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.language.Boolean> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Boolean.$TypeDescriptor$, delegate.methodWithNullableSetBooleanReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Boolean);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetStringParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> param) {
    java.util.Set<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.String);
    boolean ret = delegate.methodWithNonNullableSetStringParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetStringParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> param) {
    boolean arg_0 = expectNull;
    java.util.Set<java.lang.String> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.String);
    delegate.methodWithNullableSetStringParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetStringHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::String>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.String>>() {
      public void handle(java.util.Set<java.lang.String> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String));
      }
    };
    delegate.methodWithNullableSetStringHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetStringHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::String>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.String>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.String>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    delegate.methodWithNullableSetStringHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::String>?")
  public ceylon.language.Set<ceylon.language.String> methodWithNullableSetStringReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, delegate.methodWithNullableSetStringReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetCharParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Character>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Character> param) {
    java.util.Set<java.lang.Character> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Character);
    boolean ret = delegate.methodWithNonNullableSetCharParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetCharParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Character>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Character> param) {
    boolean arg_0 = expectNull;
    java.util.Set<java.lang.Character> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Character);
    delegate.methodWithNullableSetCharParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetCharHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Character>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<java.lang.Character>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Character>>() {
      public void handle(java.util.Set<java.lang.Character> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Character));
      }
    };
    delegate.methodWithNullableSetCharHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetCharHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Character>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Character>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Character>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Character> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Character);
      }
    };
    delegate.methodWithNullableSetCharHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Character>?")
  public ceylon.language.Set<ceylon.language.Character> methodWithNullableSetCharReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.language.Character> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Character.$TypeDescriptor$, delegate.methodWithNullableSetCharReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.Character);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetJsonObjectParam(
    final @TypeInfo("ceylon.language::Set<ceylon.json::Object>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.json.Object> param) {
    java.util.Set<io.vertx.core.json.JsonObject> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.JsonObject);
    boolean ret = delegate.methodWithNonNullableSetJsonObjectParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetJsonObjectParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.json::Object>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.json.Object> param) {
    boolean arg_0 = expectNull;
    java.util.Set<io.vertx.core.json.JsonObject> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.JsonObject);
    delegate.methodWithNullableSetJsonObjectParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetJsonObjectHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Object>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithNullableSetJsonObjectHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetJsonObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Object>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(handler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithNullableSetJsonObjectHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.json::Object>?")
  public ceylon.language.Set<ceylon.json.Object> methodWithNullableSetJsonObjectReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithNullableSetJsonObjectReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetJsonArrayParam(
    final @TypeInfo("ceylon.language::Set<ceylon.json::Array>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.json.Array> param) {
    java.util.Set<io.vertx.core.json.JsonArray> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.JsonArray);
    boolean ret = delegate.methodWithNonNullableSetJsonArrayParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetJsonArrayParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.json::Array>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.json.Array> param) {
    boolean arg_0 = expectNull;
    java.util.Set<io.vertx.core.json.JsonArray> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.JsonArray);
    delegate.methodWithNullableSetJsonArrayParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetJsonArrayHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Array>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithNullableSetJsonArrayHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetJsonArrayHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Array>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(handler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithNullableSetJsonArrayHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.json::Array>?")
  public ceylon.language.Set<ceylon.json.Array> methodWithNullableSetJsonArrayReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithNullableSetJsonArrayReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetApiParam(
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<RefedInterface1> param) {
    java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    boolean ret = delegate.methodWithNonNullableSetApiParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetApiParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<RefedInterface1> param) {
    boolean arg_0 = expectNull;
    java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    delegate.methodWithNullableSetApiParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetApiHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON));
      }
    };
    delegate.methodWithNullableSetApiHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetApiHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>(handler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON);
      }
    };
    delegate.methodWithNullableSetApiHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>?")
  public ceylon.language.Set<RefedInterface1> methodWithNullableSetApiReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<RefedInterface1> ret = io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, delegate.methodWithNullableSetApiReturn(arg_0), io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetDataObjectParam(
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> param) {
    java.util.Set<io.vertx.codegen.testmodel.TestDataObject> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.ceylon.codegen.testmodel.toJavaTestDataObject_.get_());
    boolean ret = delegate.methodWithNonNullableSetDataObjectParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetDataObjectParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> param) {
    boolean arg_0 = expectNull;
    java.util.Set<io.vertx.codegen.testmodel.TestDataObject> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.ceylon.codegen.testmodel.toJavaTestDataObject_.get_());
    delegate.methodWithNullableSetDataObjectParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetDataObjectHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_()));
      }
    };
    delegate.methodWithNullableSetDataObjectHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetDataObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>(handler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_());
      }
    };
    delegate.methodWithNullableSetDataObjectHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>?")
  public ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> methodWithNullableSetDataObjectReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> ret = io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, delegate.methodWithNullableSetDataObjectReturn(arg_0), io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableSetEnumParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> param) {
    java.util.Set<io.vertx.codegen.testmodel.TestEnum> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class));
    boolean ret = delegate.methodWithNonNullableSetEnumParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetEnumParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> param) {
    boolean arg_0 = expectNull;
    java.util.Set<io.vertx.codegen.testmodel.TestEnum> arg_1 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class));
    delegate.methodWithNullableSetEnumParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetEnumHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::String>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestEnum>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.TestEnum> event) {
        handler.$call$((Object)null);
      }
    };
    delegate.methodWithNullableSetEnumHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableSetEnumHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::String>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>(handler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestEnum> event) {
        return null;
      }
    };
    delegate.methodWithNullableSetEnumHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::String>?")
  public ceylon.language.Set<ceylon.language.String> methodWithNullableSetEnumReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Set<ceylon.language.String> ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapByteParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> param) {
    java.util.Map<java.lang.String,java.lang.Byte> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Byte);
    boolean ret = delegate.methodWithNonNullableMapByteParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapByteParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,java.lang.Byte> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Byte);
    delegate.methodWithNullableMapByteParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapByteHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Byte>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Byte>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Byte> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Byte));
      }
    };
    delegate.methodWithNullableMapByteHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapByteHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Byte>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Byte>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Byte> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Byte);
      }
    };
    delegate.methodWithNullableMapByteHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> methodWithNullableMapByteReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Byte.$TypeDescriptor$, delegate.methodWithNullableMapByteReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Byte);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapShortParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> param) {
    java.util.Map<java.lang.String,java.lang.Short> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Short);
    boolean ret = delegate.methodWithNonNullableMapShortParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapShortParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,java.lang.Short> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Short);
    delegate.methodWithNullableMapShortParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapShortHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Short>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Short>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Short> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Short));
      }
    };
    delegate.methodWithNullableMapShortHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapShortHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Short>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Short>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Short> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Short);
      }
    };
    delegate.methodWithNullableMapShortHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithNullableMapShortReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithNullableMapShortReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Short);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapIntegerParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> param) {
    java.util.Map<java.lang.String,java.lang.Integer> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Integer);
    boolean ret = delegate.methodWithNonNullableMapIntegerParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapIntegerParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,java.lang.Integer> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Integer);
    delegate.methodWithNullableMapIntegerParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapIntegerHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Integer>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Integer>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Integer> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Integer));
      }
    };
    delegate.methodWithNullableMapIntegerHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapIntegerHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Integer>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    delegate.methodWithNullableMapIntegerHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithNullableMapIntegerReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithNullableMapIntegerReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Integer);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapLongParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> param) {
    java.util.Map<java.lang.String,java.lang.Long> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Long);
    boolean ret = delegate.methodWithNonNullableMapLongParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapLongParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,java.lang.Long> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Long);
    delegate.methodWithNullableMapLongParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapLongHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Long>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Long>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Long> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Long));
      }
    };
    delegate.methodWithNullableMapLongHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapLongHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Long>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Long>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Long> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Long);
      }
    };
    delegate.methodWithNullableMapLongHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithNullableMapLongReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithNullableMapLongReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapFloatParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Float> param) {
    java.util.Map<java.lang.String,java.lang.Float> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Float);
    boolean ret = delegate.methodWithNonNullableMapFloatParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapFloatParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Float> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,java.lang.Float> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Float);
    delegate.methodWithNullableMapFloatParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapFloatHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Float>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Float>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Float> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Float));
      }
    };
    delegate.methodWithNullableMapFloatHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapFloatHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Float>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Float>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Float> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Float);
      }
    };
    delegate.methodWithNullableMapFloatHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Float> methodWithNullableMapFloatReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, delegate.methodWithNullableMapFloatReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Float);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapDoubleParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Float> param) {
    java.util.Map<java.lang.String,java.lang.Double> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Double);
    boolean ret = delegate.methodWithNonNullableMapDoubleParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapDoubleParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Float> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,java.lang.Double> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Double);
    delegate.methodWithNullableMapDoubleParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapDoubleHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Double>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Double>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Double> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Double));
      }
    };
    delegate.methodWithNullableMapDoubleHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapDoubleHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Float>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Double>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Double>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Double> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Double);
      }
    };
    delegate.methodWithNullableMapDoubleHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Float> methodWithNullableMapDoubleReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, delegate.methodWithNullableMapDoubleReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Double);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapBooleanParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> param) {
    java.util.Map<java.lang.String,java.lang.Boolean> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Boolean);
    boolean ret = delegate.methodWithNonNullableMapBooleanParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapBooleanParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,java.lang.Boolean> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Boolean);
    delegate.methodWithNullableMapBooleanParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapBooleanHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Boolean>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Boolean>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Boolean> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Boolean));
      }
    };
    delegate.methodWithNullableMapBooleanHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapBooleanHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Boolean>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Boolean>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Boolean> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Boolean);
      }
    };
    delegate.methodWithNullableMapBooleanHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> methodWithNullableMapBooleanReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Boolean.$TypeDescriptor$, delegate.methodWithNullableMapBooleanReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Boolean);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapStringParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.String> param) {
    java.util.Map<java.lang.String,java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.String);
    boolean ret = delegate.methodWithNonNullableMapStringParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapStringParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.String> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,java.lang.String> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.String);
    delegate.methodWithNullableMapStringParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapStringHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::String>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.String>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.String>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.String> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String));
      }
    };
    delegate.methodWithNullableMapStringHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapStringHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::String>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.String>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.String>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    delegate.methodWithNullableMapStringHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> methodWithNullableMapStringReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, delegate.methodWithNullableMapStringReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapCharParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Character>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Character> param) {
    java.util.Map<java.lang.String,java.lang.Character> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Character);
    boolean ret = delegate.methodWithNonNullableMapCharParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapCharParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Character>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Character> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,java.lang.Character> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Character);
    delegate.methodWithNullableMapCharParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapCharHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Character>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Character>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Character>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Character> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Character));
      }
    };
    delegate.methodWithNullableMapCharHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapCharHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Character>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Character>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Character>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Character> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Character);
      }
    };
    delegate.methodWithNullableMapCharHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Character>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Character> methodWithNullableMapCharReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.language.Character> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Character.$TypeDescriptor$, delegate.methodWithNullableMapCharReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Character);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapJsonObjectParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.json.Object> param) {
    java.util.Map<java.lang.String,io.vertx.core.json.JsonObject> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.JsonObject);
    boolean ret = delegate.methodWithNonNullableMapJsonObjectParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapJsonObjectParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.json.Object> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,io.vertx.core.json.JsonObject> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.JsonObject);
    delegate.methodWithNullableMapJsonObjectParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapJsonObjectHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.json::Object>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,io.vertx.core.json.JsonObject>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.Map<java.lang.String,io.vertx.core.json.JsonObject> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithNullableMapJsonObjectHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapJsonObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.json::Object>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,io.vertx.core.json.JsonObject>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,io.vertx.core.json.JsonObject>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithNullableMapJsonObjectHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Object> methodWithNullableMapJsonObjectReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Object.$TypeDescriptor$, delegate.methodWithNullableMapJsonObjectReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapJsonArrayParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.json.Array> param) {
    java.util.Map<java.lang.String,io.vertx.core.json.JsonArray> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.JsonArray);
    boolean ret = delegate.methodWithNonNullableMapJsonArrayParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapJsonArrayParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.json.Array> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,io.vertx.core.json.JsonArray> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.JsonArray);
    delegate.methodWithNullableMapJsonArrayParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapJsonArrayHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.json::Array>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<java.util.Map<java.lang.String,io.vertx.core.json.JsonArray>> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.Map<java.lang.String,io.vertx.core.json.JsonArray> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithNullableMapJsonArrayHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapJsonArrayHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.json::Array>?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,io.vertx.core.json.JsonArray>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,io.vertx.core.json.JsonArray>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithNullableMapJsonArrayHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array>?")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Array> methodWithNullableMapJsonArrayReturn(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean notNull) {
    boolean arg_0 = notNull;
    ceylon.language.Map<ceylon.language.String,ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, delegate.methodWithNullableMapJsonArrayReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithNonNullableMapApiParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,io.vertx.ceylon.codegen.testmodel::RefedInterface1>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,RefedInterface1> param) {
    java.util.Map<java.lang.String,io.vertx.codegen.testmodel.RefedInterface1> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    boolean ret = delegate.methodWithNonNullableMapApiParam(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableMapApiParam(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,io.vertx.ceylon.codegen.testmodel::RefedInterface1>?") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,RefedInterface1> param) {
    boolean arg_0 = expectNull;
    java.util.Map<java.lang.String,io.vertx.codegen.testmodel.RefedInterface1> arg_1 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    delegate.methodWithNullableMapApiParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableByteParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Byte?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Byte> param) {
    java.util.List<java.lang.Byte> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Byte);
    delegate.methodWithListNullableByteParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableByteHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Byte?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<java.lang.Byte>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Byte>>() {
      public void handle(java.util.List<java.lang.Byte> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Byte));
      }
    };
    delegate.methodWithListNullableByteHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableByteHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Byte?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Byte>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Byte>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Byte> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Byte);
      }
    };
    delegate.methodWithListNullableByteHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Byte?>")
  public ceylon.language.List<ceylon.language.Byte> methodWithListNullableByteReturn() {
    ceylon.language.List<ceylon.language.Byte> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Byte.$TypeDescriptor$, delegate.methodWithListNullableByteReturn(), io.vertx.lang.ceylon.ToCeylon.Byte);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableShortParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> param) {
    java.util.List<java.lang.Short> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Short);
    delegate.methodWithListNullableShortParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableShortHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<java.lang.Short>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Short>>() {
      public void handle(java.util.List<java.lang.Short> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Short));
      }
    };
    delegate.methodWithListNullableShortHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableShortHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Short>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Short>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Short> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Short);
      }
    };
    delegate.methodWithListNullableShortHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Integer?>")
  public ceylon.language.List<ceylon.language.Integer> methodWithListNullableShortReturn() {
    ceylon.language.List<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithListNullableShortReturn(), io.vertx.lang.ceylon.ToCeylon.Short);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableIntegerParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> param) {
    java.util.List<java.lang.Integer> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Integer);
    delegate.methodWithListNullableIntegerParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableIntegerHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<java.lang.Integer>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Integer>>() {
      public void handle(java.util.List<java.lang.Integer> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer));
      }
    };
    delegate.methodWithListNullableIntegerHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableIntegerHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    delegate.methodWithListNullableIntegerHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Integer?>")
  public ceylon.language.List<ceylon.language.Integer> methodWithListNullableIntegerReturn() {
    ceylon.language.List<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithListNullableIntegerReturn(), io.vertx.lang.ceylon.ToCeylon.Integer);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableLongParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> param) {
    java.util.List<java.lang.Long> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Long);
    delegate.methodWithListNullableLongParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableLongHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<java.lang.Long>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Long>>() {
      public void handle(java.util.List<java.lang.Long> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Long));
      }
    };
    delegate.methodWithListNullableLongHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableLongHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Long>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Long>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Long> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Long);
      }
    };
    delegate.methodWithListNullableLongHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Integer?>")
  public ceylon.language.List<ceylon.language.Integer> methodWithListNullableLongReturn() {
    ceylon.language.List<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithListNullableLongReturn(), io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableBooleanParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Boolean?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Boolean> param) {
    java.util.List<java.lang.Boolean> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Boolean);
    delegate.methodWithListNullableBooleanParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableBooleanHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Boolean?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<java.lang.Boolean>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Boolean>>() {
      public void handle(java.util.List<java.lang.Boolean> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Boolean));
      }
    };
    delegate.methodWithListNullableBooleanHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableBooleanHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Boolean?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Boolean>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Boolean>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Boolean> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Boolean);
      }
    };
    delegate.methodWithListNullableBooleanHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Boolean?>")
  public ceylon.language.List<ceylon.language.Boolean> methodWithListNullableBooleanReturn() {
    ceylon.language.List<ceylon.language.Boolean> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Boolean.$TypeDescriptor$, delegate.methodWithListNullableBooleanReturn(), io.vertx.lang.ceylon.ToCeylon.Boolean);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableFloatParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Float?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Float> param) {
    java.util.List<java.lang.Float> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Float);
    delegate.methodWithListNullableFloatParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableFloatHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<java.lang.Float>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Float>>() {
      public void handle(java.util.List<java.lang.Float> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Float));
      }
    };
    delegate.methodWithListNullableFloatHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableFloatHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Float>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Float>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Float> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Float);
      }
    };
    delegate.methodWithListNullableFloatHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Float?>")
  public ceylon.language.List<ceylon.language.Float> methodWithListNullableFloatReturn() {
    ceylon.language.List<ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, delegate.methodWithListNullableFloatReturn(), io.vertx.lang.ceylon.ToCeylon.Float);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableDoubleParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Float?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Float> param) {
    java.util.List<java.lang.Double> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Double);
    delegate.methodWithListNullableDoubleParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableDoubleHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<java.lang.Double>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Double>>() {
      public void handle(java.util.List<java.lang.Double> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Double));
      }
    };
    delegate.methodWithListNullableDoubleHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableDoubleHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Double>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Double>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Double> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Double);
      }
    };
    delegate.methodWithListNullableDoubleHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Float?>")
  public ceylon.language.List<ceylon.language.Float> methodWithListNullableDoubleReturn() {
    ceylon.language.List<ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Float.$TypeDescriptor$, delegate.methodWithListNullableDoubleReturn(), io.vertx.lang.ceylon.ToCeylon.Double);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableStringParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::String?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> param) {
    java.util.List<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.String);
    delegate.methodWithListNullableStringParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableStringHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::String?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<java.lang.String>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.String>>() {
      public void handle(java.util.List<java.lang.String> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String));
      }
    };
    delegate.methodWithListNullableStringHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableStringHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    delegate.methodWithListNullableStringHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String?>")
  public ceylon.language.List<ceylon.language.String> methodWithListNullableStringReturn() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, delegate.methodWithListNullableStringReturn(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableCharParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::Character?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Character> param) {
    java.util.List<java.lang.Character> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.Character);
    delegate.methodWithListNullableCharParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableCharHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Character?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<java.lang.Character>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Character>>() {
      public void handle(java.util.List<java.lang.Character> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Character));
      }
    };
    delegate.methodWithListNullableCharHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableCharHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Character?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Character>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Character>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Character> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Character);
      }
    };
    delegate.methodWithListNullableCharHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Character?>")
  public ceylon.language.List<ceylon.language.Character> methodWithListNullableCharReturn() {
    ceylon.language.List<ceylon.language.Character> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Character.$TypeDescriptor$, delegate.methodWithListNullableCharReturn(), io.vertx.lang.ceylon.ToCeylon.Character);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableJsonObjectParam(
    final @TypeInfo("ceylon.language::List<ceylon.json::Object?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.json.Object> param) {
    java.util.List<io.vertx.core.json.JsonObject> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.JsonObject);
    delegate.methodWithListNullableJsonObjectParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableJsonObjectHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Object?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonObject> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithListNullableJsonObjectHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableJsonObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Object?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithListNullableJsonObjectHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Object?>")
  public ceylon.language.List<ceylon.json.Object> methodWithListNullableJsonObjectReturn() {
    ceylon.language.List<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithListNullableJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableJsonArrayParam(
    final @TypeInfo("ceylon.language::List<ceylon.json::Array?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.json.Array> param) {
    java.util.List<io.vertx.core.json.JsonArray> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.JsonArray);
    delegate.methodWithListNullableJsonArrayParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableJsonArrayHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Array?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonArray> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithListNullableJsonArrayHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableJsonArrayHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Array?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithListNullableJsonArrayHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Array?>")
  public ceylon.language.List<ceylon.json.Array> methodWithListNullableJsonArrayReturn() {
    ceylon.language.List<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithListNullableJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableApiParam(
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<RefedInterface1> param) {
    java.util.List<io.vertx.codegen.testmodel.RefedInterface1> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    delegate.methodWithListNullableApiParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableApiHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON));
      }
    };
    delegate.methodWithListNullableApiHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableApiHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON);
      }
    };
    delegate.methodWithListNullableApiHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1?>")
  public ceylon.language.List<RefedInterface1> methodWithListNullableApiReturn() {
    ceylon.language.List<RefedInterface1> ret = io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, delegate.methodWithListNullableApiReturn(), io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableDataObjectParam(
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> param) {
    java.util.List<io.vertx.codegen.testmodel.TestDataObject> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.ceylon.codegen.testmodel.toJavaTestDataObject_.get_());
    delegate.methodWithListNullableDataObjectParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableDataObjectHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_()));
      }
    };
    delegate.methodWithListNullableDataObjectHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableDataObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_());
      }
    };
    delegate.methodWithListNullableDataObjectHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject?>")
  public ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> methodWithListNullableDataObjectReturn() {
    ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> ret = io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, delegate.methodWithListNullableDataObjectReturn(), io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableEnumParam(
    final @TypeInfo("ceylon.language::List<ceylon.language::String?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> param) {
    java.util.List<io.vertx.codegen.testmodel.TestEnum> arg_0 = io.vertx.lang.ceylon.ToJava.list(param, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class));
    delegate.methodWithListNullableEnumParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableEnumHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::String?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestEnum>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestEnum>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.TestEnum> event) {
        handler.$call$((Object)null);
      }
    };
    delegate.methodWithListNullableEnumHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListNullableEnumHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestEnum>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestEnum>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestEnum> event) {
        return null;
      }
    };
    delegate.methodWithListNullableEnumHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String?>")
  public ceylon.language.List<ceylon.language.String> methodWithListNullableEnumReturn() {
    ceylon.language.List<ceylon.language.String> ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableByteParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Byte?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Byte> param) {
    java.util.Set<java.lang.Byte> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Byte);
    delegate.methodWithSetNullableByteParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableByteHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Byte?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<java.lang.Byte>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Byte>>() {
      public void handle(java.util.Set<java.lang.Byte> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Byte));
      }
    };
    delegate.methodWithSetNullableByteHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableByteHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Byte?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Byte>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Byte>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Byte> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Byte);
      }
    };
    delegate.methodWithSetNullableByteHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Byte?>")
  public ceylon.language.Set<ceylon.language.Byte> methodWithSetNullableByteReturn() {
    ceylon.language.Set<ceylon.language.Byte> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Byte.$TypeDescriptor$, delegate.methodWithSetNullableByteReturn(), io.vertx.lang.ceylon.ToCeylon.Byte);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableShortParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> param) {
    java.util.Set<java.lang.Short> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Short);
    delegate.methodWithSetNullableShortParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableShortHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<java.lang.Short>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Short>>() {
      public void handle(java.util.Set<java.lang.Short> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Short));
      }
    };
    delegate.methodWithSetNullableShortHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableShortHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Short>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Short>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Short> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Short);
      }
    };
    delegate.methodWithSetNullableShortHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Integer?>")
  public ceylon.language.Set<ceylon.language.Integer> methodWithSetNullableShortReturn() {
    ceylon.language.Set<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithSetNullableShortReturn(), io.vertx.lang.ceylon.ToCeylon.Short);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableIntegerParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> param) {
    java.util.Set<java.lang.Integer> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Integer);
    delegate.methodWithSetNullableIntegerParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableIntegerHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<java.lang.Integer>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Integer>>() {
      public void handle(java.util.Set<java.lang.Integer> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer));
      }
    };
    delegate.methodWithSetNullableIntegerHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableIntegerHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Integer>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    delegate.methodWithSetNullableIntegerHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Integer?>")
  public ceylon.language.Set<ceylon.language.Integer> methodWithSetNullableIntegerReturn() {
    ceylon.language.Set<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithSetNullableIntegerReturn(), io.vertx.lang.ceylon.ToCeylon.Integer);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableLongParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> param) {
    java.util.Set<java.lang.Long> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Long);
    delegate.methodWithSetNullableLongParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableLongHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<java.lang.Long>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Long>>() {
      public void handle(java.util.Set<java.lang.Long> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Long));
      }
    };
    delegate.methodWithSetNullableLongHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableLongHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Long>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Long>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Long> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Long);
      }
    };
    delegate.methodWithSetNullableLongHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Integer?>")
  public ceylon.language.Set<ceylon.language.Integer> methodWithSetNullableLongReturn() {
    ceylon.language.Set<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithSetNullableLongReturn(), io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableBooleanParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Boolean?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Boolean> param) {
    java.util.Set<java.lang.Boolean> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Boolean);
    delegate.methodWithSetNullableBooleanParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableBooleanHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Boolean?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<java.lang.Boolean>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Boolean>>() {
      public void handle(java.util.Set<java.lang.Boolean> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Boolean));
      }
    };
    delegate.methodWithSetNullableBooleanHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableBooleanHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Boolean?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Boolean>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Boolean>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Boolean> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Boolean);
      }
    };
    delegate.methodWithSetNullableBooleanHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Boolean?>")
  public ceylon.language.Set<ceylon.language.Boolean> methodWithSetNullableBooleanReturn() {
    ceylon.language.Set<ceylon.language.Boolean> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Boolean.$TypeDescriptor$, delegate.methodWithSetNullableBooleanReturn(), io.vertx.lang.ceylon.ToCeylon.Boolean);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableFloatParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Float?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Float> param) {
    java.util.Set<java.lang.Float> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Float);
    delegate.methodWithSetNullableFloatParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableFloatHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<java.lang.Float>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Float>>() {
      public void handle(java.util.Set<java.lang.Float> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Float));
      }
    };
    delegate.methodWithSetNullableFloatHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableFloatHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Float>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Float>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Float> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Float);
      }
    };
    delegate.methodWithSetNullableFloatHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Float?>")
  public ceylon.language.Set<ceylon.language.Float> methodWithSetNullableFloatReturn() {
    ceylon.language.Set<ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, delegate.methodWithSetNullableFloatReturn(), io.vertx.lang.ceylon.ToCeylon.Float);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableDoubleParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Float?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Float> param) {
    java.util.Set<java.lang.Double> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Double);
    delegate.methodWithSetNullableDoubleParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableDoubleHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<java.lang.Double>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Double>>() {
      public void handle(java.util.Set<java.lang.Double> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Double));
      }
    };
    delegate.methodWithSetNullableDoubleHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableDoubleHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Double>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Double>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Double> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Double);
      }
    };
    delegate.methodWithSetNullableDoubleHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Float?>")
  public ceylon.language.Set<ceylon.language.Float> methodWithSetNullableDoubleReturn() {
    ceylon.language.Set<ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Float.$TypeDescriptor$, delegate.methodWithSetNullableDoubleReturn(), io.vertx.lang.ceylon.ToCeylon.Double);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableStringParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> param) {
    java.util.Set<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.String);
    delegate.methodWithSetNullableStringParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableStringHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::String?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<java.lang.String>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.String>>() {
      public void handle(java.util.Set<java.lang.String> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String));
      }
    };
    delegate.methodWithSetNullableStringHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableStringHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::String?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.String>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.String>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    delegate.methodWithSetNullableStringHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::String?>")
  public ceylon.language.Set<ceylon.language.String> methodWithSetNullableStringReturn() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, delegate.methodWithSetNullableStringReturn(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableCharParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::Character?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Character> param) {
    java.util.Set<java.lang.Character> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.Character);
    delegate.methodWithSetNullableCharParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableCharHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Character?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<java.lang.Character>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Character>>() {
      public void handle(java.util.Set<java.lang.Character> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Character));
      }
    };
    delegate.methodWithSetNullableCharHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableCharHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Character?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Character>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Character>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Character> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Character);
      }
    };
    delegate.methodWithSetNullableCharHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Character?>")
  public ceylon.language.Set<ceylon.language.Character> methodWithSetNullableCharReturn() {
    ceylon.language.Set<ceylon.language.Character> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Character.$TypeDescriptor$, delegate.methodWithSetNullableCharReturn(), io.vertx.lang.ceylon.ToCeylon.Character);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableJsonObjectParam(
    final @TypeInfo("ceylon.language::Set<ceylon.json::Object?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.json.Object> param) {
    java.util.Set<io.vertx.core.json.JsonObject> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.JsonObject);
    delegate.methodWithSetNullableJsonObjectParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableJsonObjectHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Object?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithSetNullableJsonObjectHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableJsonObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Object?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(handler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithSetNullableJsonObjectHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.json::Object?>")
  public ceylon.language.Set<ceylon.json.Object> methodWithSetNullableJsonObjectReturn() {
    ceylon.language.Set<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithSetNullableJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableJsonArrayParam(
    final @TypeInfo("ceylon.language::Set<ceylon.json::Array?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.json.Array> param) {
    java.util.Set<io.vertx.core.json.JsonArray> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.JsonArray);
    delegate.methodWithSetNullableJsonArrayParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableJsonArrayHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Array?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithSetNullableJsonArrayHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableJsonArrayHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Array?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(handler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithSetNullableJsonArrayHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.json::Array?>")
  public ceylon.language.Set<ceylon.json.Array> methodWithSetNullableJsonArrayReturn() {
    ceylon.language.Set<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithSetNullableJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableApiParam(
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<RefedInterface1> param) {
    java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    delegate.methodWithSetNullableApiParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableApiHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON));
      }
    };
    delegate.methodWithSetNullableApiHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableApiHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>(handler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON);
      }
    };
    delegate.methodWithSetNullableApiHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1?>")
  public ceylon.language.Set<RefedInterface1> methodWithSetNullableApiReturn() {
    ceylon.language.Set<RefedInterface1> ret = io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, delegate.methodWithSetNullableApiReturn(), io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableDataObjectParam(
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> param) {
    java.util.Set<io.vertx.codegen.testmodel.TestDataObject> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.ceylon.codegen.testmodel.toJavaTestDataObject_.get_());
    delegate.methodWithSetNullableDataObjectParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableDataObjectHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_()));
      }
    };
    delegate.methodWithSetNullableDataObjectHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableDataObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>(handler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_());
      }
    };
    delegate.methodWithSetNullableDataObjectHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject?>")
  public ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> methodWithSetNullableDataObjectReturn() {
    ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> ret = io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, delegate.methodWithSetNullableDataObjectReturn(), io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableEnumParam(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> param) {
    java.util.Set<io.vertx.codegen.testmodel.TestEnum> arg_0 = io.vertx.lang.ceylon.ToJava.set(param, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class));
    delegate.methodWithSetNullableEnumParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableEnumHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::String?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestEnum>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.TestEnum> event) {
        handler.$call$((Object)null);
      }
    };
    delegate.methodWithSetNullableEnumHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetNullableEnumHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::String?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>(handler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestEnum> event) {
        return null;
      }
    };
    delegate.methodWithSetNullableEnumHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::String?>")
  public ceylon.language.Set<ceylon.language.String> methodWithSetNullableEnumReturn() {
    ceylon.language.Set<ceylon.language.String> ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableByteParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> param) {
    java.util.Map<java.lang.String,java.lang.Byte> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Byte);
    delegate.methodWithMapNullableByteParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableByteHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Byte?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Byte>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Byte>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Byte> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Byte));
      }
    };
    delegate.methodWithMapNullableByteHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableByteHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Byte?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Byte>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Byte>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Byte> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Byte.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Byte);
      }
    };
    delegate.methodWithMapNullableByteHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> methodWithMapNullableByteReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Byte.$TypeDescriptor$, delegate.methodWithMapNullableByteReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Byte);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableShortParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> param) {
    java.util.Map<java.lang.String,java.lang.Short> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Short);
    delegate.methodWithMapNullableShortParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableShortHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Short>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Short>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Short> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Short));
      }
    };
    delegate.methodWithMapNullableShortHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableShortHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Short>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Short>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Short> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Short);
      }
    };
    delegate.methodWithMapNullableShortHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithMapNullableShortReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithMapNullableShortReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Short);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableIntegerParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> param) {
    java.util.Map<java.lang.String,java.lang.Integer> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Integer);
    delegate.methodWithMapNullableIntegerParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableIntegerHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Integer>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Integer>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Integer> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Integer));
      }
    };
    delegate.methodWithMapNullableIntegerHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableIntegerHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Integer>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    delegate.methodWithMapNullableIntegerHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithMapNullableIntegerReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithMapNullableIntegerReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Integer);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableLongParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> param) {
    java.util.Map<java.lang.String,java.lang.Long> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Long);
    delegate.methodWithMapNullableLongParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableLongHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Long>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Long>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Long> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Long));
      }
    };
    delegate.methodWithMapNullableLongHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableLongHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Long>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Long>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Long> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Long);
      }
    };
    delegate.methodWithMapNullableLongHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithMapNullableLongReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithMapNullableLongReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableBooleanParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> param) {
    java.util.Map<java.lang.String,java.lang.Boolean> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Boolean);
    delegate.methodWithMapNullableBooleanParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableBooleanHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Boolean>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Boolean>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Boolean> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Boolean));
      }
    };
    delegate.methodWithMapNullableBooleanHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableBooleanHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Boolean>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Boolean>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Boolean> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Boolean.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Boolean);
      }
    };
    delegate.methodWithMapNullableBooleanHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> methodWithMapNullableBooleanReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Boolean.$TypeDescriptor$, delegate.methodWithMapNullableBooleanReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Boolean);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableFloatParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Float> param) {
    java.util.Map<java.lang.String,java.lang.Float> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Float);
    delegate.methodWithMapNullableFloatParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableFloatHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Float>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Float>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Float> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Float));
      }
    };
    delegate.methodWithMapNullableFloatHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableFloatHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Float>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Float>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Float> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Float);
      }
    };
    delegate.methodWithMapNullableFloatHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Float> methodWithMapNullableFloatReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, delegate.methodWithMapNullableFloatReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Float);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableDoubleParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Float> param) {
    java.util.Map<java.lang.String,java.lang.Double> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Double);
    delegate.methodWithMapNullableDoubleParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableDoubleHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Double>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Double>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Double> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Double));
      }
    };
    delegate.methodWithMapNullableDoubleHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableDoubleHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Float?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Double>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Double>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Double> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Double);
      }
    };
    delegate.methodWithMapNullableDoubleHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Float> methodWithMapNullableDoubleReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, delegate.methodWithMapNullableDoubleReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Double);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableStringParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.String> param) {
    java.util.Map<java.lang.String,java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.String);
    delegate.methodWithMapNullableStringParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableStringHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::String?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.String>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.String>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.String> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String));
      }
    };
    delegate.methodWithMapNullableStringHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableStringHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::String?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.String>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.String>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    delegate.methodWithMapNullableStringHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> methodWithMapNullableStringReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, delegate.methodWithMapNullableStringReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableCharParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Character?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Character> param) {
    java.util.Map<java.lang.String,java.lang.Character> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Character);
    delegate.methodWithMapNullableCharParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableCharHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.language::Character?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Character>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,java.lang.Character>>() {
      public void handle(java.util.Map<java.lang.String,java.lang.Character> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Character));
      }
    };
    delegate.methodWithMapNullableCharHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableCharHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.language::Character?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,java.lang.Character>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,java.lang.Character>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,java.lang.Character> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Character.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Character);
      }
    };
    delegate.methodWithMapNullableCharHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Character?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Character> methodWithMapNullableCharReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.Character> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Character.$TypeDescriptor$, delegate.methodWithMapNullableCharReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Character);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableJsonObjectParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.json.Object> param) {
    java.util.Map<java.lang.String,io.vertx.core.json.JsonObject> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.JsonObject);
    delegate.methodWithMapNullableJsonObjectParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableJsonObjectHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.json::Object?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,io.vertx.core.json.JsonObject>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.Map<java.lang.String,io.vertx.core.json.JsonObject> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithMapNullableJsonObjectHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableJsonObjectHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.json::Object?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,io.vertx.core.json.JsonObject>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,io.vertx.core.json.JsonObject>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithMapNullableJsonObjectHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Object> methodWithMapNullableJsonObjectReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Object.$TypeDescriptor$, delegate.methodWithMapNullableJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableJsonArrayParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.json.Array> param) {
    java.util.Map<java.lang.String,io.vertx.core.json.JsonArray> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.JsonArray);
    delegate.methodWithMapNullableJsonArrayParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableJsonArrayHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Map<ceylon.language::String,ceylon.json::Array?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.util.Map<java.lang.String,io.vertx.core.json.JsonArray>> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.util.Map<java.lang.String,io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.Map<java.lang.String,io.vertx.core.json.JsonArray> event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithMapNullableJsonArrayHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableJsonArrayHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Map<ceylon.language::String,ceylon.json::Array?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Map<java.lang.String,io.vertx.core.json.JsonArray>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Map<java.lang.String,io.vertx.core.json.JsonArray>>(handler) {
      public Object toCeylon(java.util.Map<java.lang.String,io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithMapNullableJsonArrayHandlerAsyncResult(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array?>")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Array> methodWithMapNullableJsonArrayReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, delegate.methodWithMapNullableJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapNullableApiParam(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,io.vertx.ceylon.codegen.testmodel::RefedInterface1?>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,RefedInterface1> param) {
    java.util.Map<java.lang.String,io.vertx.codegen.testmodel.RefedInterface1> arg_0 = io.vertx.lang.ceylon.ToJava.map(param, io.vertx.lang.ceylon.ToJava.String, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    delegate.methodWithMapNullableApiParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableHandler(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)?") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = expectNull;
    io.vertx.core.Handler<java.lang.String> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    delegate.methodWithNullableHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)?") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = expectNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    delegate.methodWithNullableHandlerAsyncResult(arg_0, arg_1);
  }

}
