package io.vertx.ceylon.testmodel;

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
import io.vertx.core.json.JsonArray;
import io.vertx.codegen.testmodel.TestEnum;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "")
public class GenericsTCK implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.GenericsTCK, GenericsTCK> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.GenericsTCK, GenericsTCK>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.GenericsTCK, GenericsTCK> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.GenericsTCK, GenericsTCK>() {
        public GenericsTCK convert(io.vertx.codegen.testmodel.GenericsTCK src) {
          return new GenericsTCK(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<GenericsTCK, io.vertx.codegen.testmodel.GenericsTCK> TO_JAVA = new io.vertx.lang.ceylon.Converter<GenericsTCK, io.vertx.codegen.testmodel.GenericsTCK>() {
    public io.vertx.codegen.testmodel.GenericsTCK convert(GenericsTCK src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(GenericsTCK.class), io.vertx.codegen.testmodel.GenericsTCK.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.codegen.testmodel.GenericsTCK delegate;

  public GenericsTCK(io.vertx.codegen.testmodel.GenericsTCK delegate) {
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

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Byte>")
  public GenericRefedInterface<ceylon.language.Byte> methodWithByteParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Byte> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Byte/BOXED_PRIMITIVE  */ ).safeConvert(delegate.methodWithByteParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>")
  public GenericRefedInterface<ceylon.language.Integer> methodWithShortParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Integer> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Short/BOXED_PRIMITIVE  */ ).safeConvert(delegate.methodWithShortParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>")
  public GenericRefedInterface<ceylon.language.Integer> methodWithIntegerParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Integer> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Integer/BOXED_PRIMITIVE  */ ).safeConvert(delegate.methodWithIntegerParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>")
  public GenericRefedInterface<ceylon.language.Integer> methodWithLongParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Integer> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Long/BOXED_PRIMITIVE  */ ).safeConvert(delegate.methodWithLongParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>")
  public GenericRefedInterface<ceylon.language.Float> methodWithFloatParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Float> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Float/BOXED_PRIMITIVE  */ ).safeConvert(delegate.methodWithFloatParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>")
  public GenericRefedInterface<ceylon.language.Float> methodWithDoubleParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Float> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Double/BOXED_PRIMITIVE  */ ).safeConvert(delegate.methodWithDoubleParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Boolean>")
  public GenericRefedInterface<ceylon.language.Boolean> methodWithBooleanParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Boolean> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Boolean/BOXED_PRIMITIVE  */ ).safeConvert(delegate.methodWithBooleanParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Character>")
  public GenericRefedInterface<ceylon.language.Character> methodWithCharacterParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Character> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Character/BOXED_PRIMITIVE  */ ).safeConvert(delegate.methodWithCharacterParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>")
  public GenericRefedInterface<ceylon.language.String> methodWithStringParameterizedReturn() {
    GenericRefedInterface<ceylon.language.String> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.String/STRING  */ ).safeConvert(delegate.methodWithStringParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Object>")
  public GenericRefedInterface<ceylon.json.Object> methodWithJsonObjectParameterizedReturn() {
    GenericRefedInterface<ceylon.json.Object> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.core.json.JsonObject/JSON_OBJECT  */ ).safeConvert(delegate.methodWithJsonObjectParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Array>")
  public GenericRefedInterface<ceylon.json.Array> methodWithJsonArrayParameterizedReturn() {
    GenericRefedInterface<ceylon.json.Array> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.core.json.JsonArray/JSON_ARRAY  */ ).safeConvert(delegate.methodWithJsonArrayParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestDataObject>")
  public GenericRefedInterface<io.vertx.ceylon.testmodel.TestDataObject> methodWithDataObjectParameterizedReturn() {
    GenericRefedInterface<io.vertx.ceylon.testmodel.TestDataObject> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.codegen.testmodel.TestDataObject/DATA_OBJECT  */ ).safeConvert(delegate.methodWithDataObjectParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>")
  public GenericRefedInterface<ceylon.language.String> methodWithEnumParameterizedReturn() {
    GenericRefedInterface<ceylon.language.String> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.codegen.testmodel.TestEnum/ENUM  */ ).safeConvert(delegate.methodWithEnumParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestGenEnum>")
  public GenericRefedInterface<io.vertx.ceylon.testmodel.TestGenEnum> methodWithGenEnumParameterizedReturn() {
    GenericRefedInterface<io.vertx.ceylon.testmodel.TestGenEnum> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.codegen.testmodel.TestGenEnum/ENUM  */ ).safeConvert(delegate.methodWithGenEnumParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::RefedInterface1>")
  public GenericRefedInterface<RefedInterface1> methodWithUserTypeParameterizedReturn() {
    GenericRefedInterface<RefedInterface1> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(RefedInterface1.$TypeDescriptor$).safeConvert(delegate.methodWithUserTypeParameterizedReturn());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerByteParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Byte>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Byte>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Byte>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Byte> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Byte/BOXED_PRIMITIVE  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerByteParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerShortParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Short/BOXED_PRIMITIVE  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerShortParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerIntegerParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Integer/BOXED_PRIMITIVE  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerIntegerParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerLongParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Long/BOXED_PRIMITIVE  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerLongParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerFloatParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Float/BOXED_PRIMITIVE  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerFloatParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerDoubleParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Double/BOXED_PRIMITIVE  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerDoubleParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerBooleanParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Boolean>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Boolean/BOXED_PRIMITIVE  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerBooleanParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerCharacterParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Character>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Character/BOXED_PRIMITIVE  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerCharacterParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerStringParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.String/STRING  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerStringParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerJsonObjectParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Object>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.core.json.JsonObject/JSON_OBJECT  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerJsonObjectParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerJsonArrayParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Array>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.core.json.JsonArray/JSON_ARRAY  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerJsonArrayParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerDataObjectParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.codegen.testmodel.TestDataObject/DATA_OBJECT  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerDataObjectParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerEnumParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.codegen.testmodel.TestEnum/ENUM  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerEnumParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerGenEnumParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestGenEnum>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.codegen.testmodel.TestGenEnum/ENUM  */ ).safeConvert(event));
      }
    };
    delegate.methodWithHandlerGenEnumParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerUserTypeParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.RefedInterface1>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.RefedInterface1> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(RefedInterface1.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerUserTypeParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultByteParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Byte>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Byte>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Byte>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Byte> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Byte/BOXED_PRIMITIVE  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultByteParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultShortParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Short/BOXED_PRIMITIVE  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultShortParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultIntegerParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Integer/BOXED_PRIMITIVE  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultIntegerParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultLongParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Long/BOXED_PRIMITIVE  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultLongParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultFloatParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Float/BOXED_PRIMITIVE  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultFloatParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultDoubleParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Double/BOXED_PRIMITIVE  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultDoubleParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultBooleanParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Boolean>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Boolean/BOXED_PRIMITIVE  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultBooleanParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultCharacterParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Character>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.Character/BOXED_PRIMITIVE  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultCharacterParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultStringParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet java.lang.String/STRING  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultStringParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultJsonObjectParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Object>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.core.json.JsonObject/JSON_OBJECT  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultJsonObjectParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultJsonArrayParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Array>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.core.json.JsonArray/JSON_ARRAY  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultJsonArrayParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultDataObjectParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.codegen.testmodel.TestDataObject/DATA_OBJECT  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultDataObjectParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultEnumParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.codegen.testmodel.TestEnum/ENUM  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultEnumParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultGenEnumParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestGenEnum>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(null /* unsupported yet io.vertx.codegen.testmodel.TestGenEnum/ENUM  */ ).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultGenEnumParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultUserTypeParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.RefedInterface1>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.RefedInterface1> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(RefedInterface1.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultUserTypeParameterized(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<U?>")
  public <U> GenericRefedInterface<U> methodWithClassTypeParameterizedReturn(final @Ignore TypeDescriptor $reified$U) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    GenericRefedInterface<U> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.methodWithClassTypeParameterizedReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithHandlerClassTypeParameterized(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<U?>)") @Name("handler") Callable<?> handler) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(event));
      }
    };
    delegate.methodWithHandlerClassTypeParameterized(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithHandlerAsyncResultClassTypeParameterized(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<U?>)") @Name("handler") Callable<?> handler) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultClassTypeParameterized(arg_0, arg_1);
  }

  @TypeInfo("io.vertx.ceylon.testmodel::InterfaceWithApiArg")
  public InterfaceWithApiArg interfaceWithApiArg(
    final @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1") @Name("value") RefedInterface1 value) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA.safeConvert(value);
    InterfaceWithApiArg ret = io.vertx.ceylon.testmodel.InterfaceWithApiArg.TO_CEYLON.converter().safeConvert(delegate.interfaceWithApiArg(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::InterfaceWithStringArg")
  public InterfaceWithStringArg interfaceWithStringArg(
    final @TypeInfo("ceylon.language::String") @Name("value") ceylon.language.String value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(value);
    InterfaceWithStringArg ret = io.vertx.ceylon.testmodel.InterfaceWithStringArg.TO_CEYLON.converter().safeConvert(delegate.interfaceWithStringArg(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE),
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.testmodel::InterfaceWithVariableArg<T?,U?>")
  public <T,U> InterfaceWithVariableArg<T,U> interfaceWithVariableArg(final @Ignore TypeDescriptor $reified$T, final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("T?") @Name("value1") T value1, 
    final @TypeInfo("U?") @Name("value2") U value2) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(value1);
    java.lang.Class<java.lang.Object> arg_1 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    java.lang.Object arg_2 = io.vertx.lang.ceylon.VertxTypeDescriptor.getToJava($reified$U).convert(value2);
    InterfaceWithVariableArg<T,U> ret = io.vertx.ceylon.testmodel.InterfaceWithVariableArg.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T), io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.interfaceWithVariableArg(arg_0, arg_1, arg_2));
    return ret;
  }

}
