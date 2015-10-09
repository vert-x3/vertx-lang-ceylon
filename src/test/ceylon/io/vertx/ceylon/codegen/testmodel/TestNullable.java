package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.List;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class TestNullable {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(TestNullable.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.TestNullable, TestNullable> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.TestNullable, TestNullable>() {
    public TestNullable convert(io.vertx.codegen.testmodel.TestNullable src) {
      return new TestNullable(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<TestNullable, io.vertx.codegen.testmodel.TestNullable> TO_JAVA = new io.vertx.lang.ceylon.Converter<TestNullable, io.vertx.codegen.testmodel.TestNullable>() {
    public io.vertx.codegen.testmodel.TestNullable convert(TestNullable src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.codegen.testmodel.TestNullable delegate;

  public TestNullable(io.vertx.codegen.testmodel.TestNullable delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableStringParam(
    final @TypeInfo("ceylon.language::String?") @DocAnnotation$annotation$(description = "todo") ceylon.language.String param, 
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(param);
    boolean arg_1 = expectNull;
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

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <T> void methodWithGenericNullableStringParam(
    final @TypeInfo("T") @DocAnnotation$annotation$(description = "todo") T value, 
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::GenericRefedInterface<T?>") @DocAnnotation$annotation$(description = "todo") GenericRefedInterface<T> param) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(value);
    io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> arg_1 = io.vertx.ceylon.codegen.testmodel.GenericRefedInterface.TO_JAVA.convert(param);
    delegate.methodWithGenericNullableStringParam(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <T> void methodWithGenericNullableStringHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.codegen.testmodel::GenericRefedInterface<T?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) {
        handler.$call$((Object)io.vertx.ceylon.codegen.testmodel.GenericRefedInterface.TO_CEYLON.safeConvert(event));
      }
    };
    delegate.methodWithGenericNullableStringHandler(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <T> void methodWithGenericNullableStringHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.codegen.testmodel::GenericRefedInterface<T?>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) {
        return io.vertx.ceylon.codegen.testmodel.GenericRefedInterface.TO_CEYLON.safeConvert(event);
      }
    };
    delegate.methodWithGenericNullableStringHandlerAsyncResult(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::GenericRefedInterface<T?>")
  public <T> GenericRefedInterface<T> methodWithGenericNullableStringReturn() {
    GenericRefedInterface<T> ret = io.vertx.ceylon.codegen.testmodel.GenericRefedInterface.TO_CEYLON.safeConvert(delegate.methodWithGenericNullableStringReturn());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)?") @DocAnnotation$annotation$(description = "todo") Callable<?> handler, 
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    boolean arg_1 = expectNull;
    delegate.methodWithNullableHandler(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullableHandlerAsyncResult(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)?") @DocAnnotation$annotation$(description = "todo") Callable<?> handler, 
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expectNull) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    boolean arg_1 = expectNull;
    delegate.methodWithNullableHandlerAsyncResult(arg_0, arg_1);
  }

}
