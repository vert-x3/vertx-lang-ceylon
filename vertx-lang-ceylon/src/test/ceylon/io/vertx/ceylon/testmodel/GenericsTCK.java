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
import java.util.function.Function;
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
    GenericRefedInterface<ceylon.language.Byte> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Byte.$TypeDescriptor$).safeConvert(delegate.methodWithByteParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>")
  public GenericRefedInterface<ceylon.language.Integer> methodWithShortParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Integer> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(delegate.methodWithShortParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>")
  public GenericRefedInterface<ceylon.language.Integer> methodWithIntegerParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Integer> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(delegate.methodWithIntegerParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>")
  public GenericRefedInterface<ceylon.language.Integer> methodWithLongParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Integer> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(delegate.methodWithLongParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>")
  public GenericRefedInterface<ceylon.language.Float> methodWithFloatParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Float> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Float.$TypeDescriptor$).safeConvert(delegate.methodWithFloatParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>")
  public GenericRefedInterface<ceylon.language.Float> methodWithDoubleParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Float> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Float.$TypeDescriptor$).safeConvert(delegate.methodWithDoubleParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Boolean>")
  public GenericRefedInterface<ceylon.language.Boolean> methodWithBooleanParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Boolean> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Boolean.$TypeDescriptor$).safeConvert(delegate.methodWithBooleanParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Character>")
  public GenericRefedInterface<ceylon.language.Character> methodWithCharacterParameterizedReturn() {
    GenericRefedInterface<ceylon.language.Character> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Character.$TypeDescriptor$).safeConvert(delegate.methodWithCharacterParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>")
  public GenericRefedInterface<ceylon.language.String> methodWithStringParameterizedReturn() {
    GenericRefedInterface<ceylon.language.String> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.String.$TypeDescriptor$).safeConvert(delegate.methodWithStringParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Object>")
  public GenericRefedInterface<ceylon.json.Object> methodWithJsonObjectParameterizedReturn() {
    GenericRefedInterface<ceylon.json.Object> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.json.Object.$TypeDescriptor$).safeConvert(delegate.methodWithJsonObjectParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Array>")
  public GenericRefedInterface<ceylon.json.Array> methodWithJsonArrayParameterizedReturn() {
    GenericRefedInterface<ceylon.json.Array> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.json.Array.$TypeDescriptor$).safeConvert(delegate.methodWithJsonArrayParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestDataObject>")
  public GenericRefedInterface<io.vertx.ceylon.testmodel.TestDataObject> methodWithDataObjectParameterizedReturn() {
    GenericRefedInterface<io.vertx.ceylon.testmodel.TestDataObject> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, io.vertx.codegen.testmodel.TestDataObject.class, io.vertx.ceylon.testmodel.testDataObject_.get_().getToJava(), io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon())).safeConvert(delegate.methodWithDataObjectParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>")
  public GenericRefedInterface<ceylon.language.String> methodWithEnumParameterizedReturn() {
    GenericRefedInterface<ceylon.language.String> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(ceylon.language.String.$TypeDescriptor$, io.vertx.codegen.testmodel.TestEnum.class, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class), io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration())).safeConvert(delegate.methodWithEnumParameterizedReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestGenEnum>")
  public GenericRefedInterface<io.vertx.ceylon.testmodel.TestGenEnum> methodWithGenEnumParameterizedReturn() {
    GenericRefedInterface<io.vertx.ceylon.testmodel.TestGenEnum> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(io.vertx.ceylon.testmodel.TestGenEnum.$TypeDescriptor$, io.vertx.codegen.testmodel.TestGenEnum.class, io.vertx.ceylon.testmodel.testGenEnum_.get_().getToJava(), io.vertx.ceylon.testmodel.testGenEnum_.get_().getToCeylon())).safeConvert(delegate.methodWithGenEnumParameterizedReturn());
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
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Byte.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerByteParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerShortParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerShortParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerIntegerParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerIntegerParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerLongParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerLongParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerFloatParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Float.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerFloatParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerDoubleParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Float.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerDoubleParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerBooleanParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Boolean>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Boolean.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerBooleanParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerCharacterParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Character>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Character.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerCharacterParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerStringParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.String.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerStringParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerJsonObjectParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Object>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.json.Object.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerJsonObjectParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerJsonArrayParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Array>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.json.Array.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerJsonArrayParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerDataObjectParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, io.vertx.codegen.testmodel.TestDataObject.class, io.vertx.ceylon.testmodel.testDataObject_.get_().getToJava(), io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon())).safeConvert(event));
      }
    };
    delegate.methodWithHandlerDataObjectParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerEnumParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(ceylon.language.String.$TypeDescriptor$, io.vertx.codegen.testmodel.TestEnum.class, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class), io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration())).safeConvert(event));
      }
    };
    delegate.methodWithHandlerEnumParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerGenEnumParameterized(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestGenEnum>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(io.vertx.ceylon.testmodel.TestGenEnum.$TypeDescriptor$, io.vertx.codegen.testmodel.TestGenEnum.class, io.vertx.ceylon.testmodel.testGenEnum_.get_().getToJava(), io.vertx.ceylon.testmodel.testGenEnum_.get_().getToCeylon())).safeConvert(event));
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
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Byte.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultByteParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultShortParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultShortParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultIntegerParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultIntegerParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultLongParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultLongParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultFloatParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Float.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultFloatParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultDoubleParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Float.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultDoubleParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultBooleanParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Boolean>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Boolean.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultBooleanParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultCharacterParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Character>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Character.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultCharacterParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultStringParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.String.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultStringParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultJsonObjectParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Object>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.json.Object.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultJsonObjectParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultJsonArrayParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Array>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.json.Array.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultJsonArrayParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultDataObjectParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, io.vertx.codegen.testmodel.TestDataObject.class, io.vertx.ceylon.testmodel.testDataObject_.get_().getToJava(), io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon())).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultDataObjectParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultEnumParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(ceylon.language.String.$TypeDescriptor$, io.vertx.codegen.testmodel.TestEnum.class, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class), io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration())).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultEnumParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultGenEnumParameterized(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestGenEnum>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(io.vertx.ceylon.testmodel.TestGenEnum.$TypeDescriptor$, io.vertx.codegen.testmodel.TestGenEnum.class, io.vertx.ceylon.testmodel.testGenEnum_.get_().getToJava(), io.vertx.ceylon.testmodel.testGenEnum_.get_().getToCeylon())).safeConvert(event);
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

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamByteParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Byte>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Byte>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Byte>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Byte> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Byte.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamByteParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamShortParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Short> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamShortParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamIntegerParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Integer> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamIntegerParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamLongParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Long> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Integer.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamLongParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamFloatParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Float> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Float.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamFloatParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamDoubleParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Float>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Double> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Float.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamDoubleParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamBooleanParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Boolean>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Boolean> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Boolean.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamBooleanParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamCharacterParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::Character>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Character> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.Character.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamCharacterParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamStringParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.String> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.language.String.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamStringParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamJsonObjectParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Object>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonObject> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.json.Object.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamJsonObjectParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamJsonArrayParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.json::Array>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.core.json.JsonArray> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(ceylon.json.Array.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamJsonArrayParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamDataObjectParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestDataObject> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, io.vertx.codegen.testmodel.TestDataObject.class, io.vertx.ceylon.testmodel.testDataObject_.get_().getToJava(), io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon())).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamDataObjectParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamEnumParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestEnum> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(ceylon.language.String.$TypeDescriptor$, io.vertx.codegen.testmodel.TestEnum.class, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class), io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration())).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamEnumParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamGenEnumParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::TestGenEnum>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.TestGenEnum> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(new io.vertx.lang.ceylon.VertxTypeDescriptor(io.vertx.ceylon.testmodel.TestGenEnum.$TypeDescriptor$, io.vertx.codegen.testmodel.TestGenEnum.class, io.vertx.ceylon.testmodel.testGenEnum_.get_().getToJava(), io.vertx.ceylon.testmodel.testGenEnum_.get_().getToCeylon())).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamGenEnumParameterized(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithFunctionParamUserTypeParameterized(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("handler") Callable<?> handler) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.RefedInterface1>,java.lang.String> arg_0 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.RefedInterface1>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<io.vertx.codegen.testmodel.RefedInterface1> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(RefedInterface1.$TypeDescriptor$).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamUserTypeParameterized(arg_0);
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

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithFunctionParamClassTypeParameterized(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<U?>)") @Name("handler") Callable<?> handler) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>,java.lang.String> arg_1 = handler == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> arg) {
        ceylon.language.String ret = (ceylon.language.String)handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithFunctionParamClassTypeParameterized(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithClassTypeParam(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("U?") @Name("u") U u) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.VertxTypeDescriptor.getToJava($reified$U).convert(u);
    delegate.methodWithClassTypeParam(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("U?")
  public <U> U methodWithClassTypeReturn(final @Ignore TypeDescriptor $reified$U) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    U ret = (U)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$U).convert(delegate.methodWithClassTypeReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithClassTypeHandler(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::Anything(U?)") @Name("f") Callable<?> f) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    io.vertx.core.Handler<java.lang.Object> arg_1 = f == null ? null : new io.vertx.core.Handler<java.lang.Object>() {
      public void handle(java.lang.Object event) {
        f.$call$((Object)(U)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$U).convert(event));
      }
    };
    delegate.methodWithClassTypeHandler(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithClassTypeHandlerAsyncResult(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|U?)") @Name("f") Callable<?> f) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = f == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Object>(f) {
      public Object toCeylon(java.lang.Object event) {
        return (U)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$U).convert(event);
      }
    };
    delegate.methodWithClassTypeHandlerAsyncResult(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithClassTypeFunctionParam(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::String(U?)") @Name("f") Callable<?> f) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    java.util.function.Function<java.lang.Object,java.lang.String> arg_1 = f == null ? null : new java.util.function.Function<java.lang.Object,java.lang.String>() {
      public java.lang.String apply(java.lang.Object arg) {
        ceylon.language.String ret = (ceylon.language.String)f.$call$((Object)(U)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$U).convert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    delegate.methodWithClassTypeFunctionParam(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithClassTypeFunctionReturn(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("U?(ceylon.language::String)") @Name("f") Callable<?> f) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$U);
    java.util.function.Function<java.lang.String,java.lang.Object> arg_1 = f == null ? null : new java.util.function.Function<java.lang.String,java.lang.Object>() {
      public java.lang.Object apply(java.lang.String arg) {
        Object ret = (Object)f.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.VertxTypeDescriptor.getToJava($reified$U).convert(ret);
      }
    };
    delegate.methodWithClassTypeFunctionReturn(arg_0, arg_1);
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

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerGenericNullableApi(
    final @TypeInfo("ceylon.language::Boolean") @Name("notNull") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericNullableRefedInterface<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("handler") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericNullableRefedInterface<io.vertx.codegen.testmodel.RefedInterface1>> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericNullableRefedInterface<io.vertx.codegen.testmodel.RefedInterface1>>() {
      public void handle(io.vertx.codegen.testmodel.GenericNullableRefedInterface<io.vertx.codegen.testmodel.RefedInterface1> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericNullableRefedInterface.TO_CEYLON.converter(RefedInterface1.$TypeDescriptor$).safeConvert(event));
      }
    };
    delegate.methodWithHandlerGenericNullableApi(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultGenericNullableApi(
    final @TypeInfo("ceylon.language::Boolean") @Name("notNull") boolean notNull, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericNullableRefedInterface<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("handler") Callable<?> handler) {
    boolean arg_0 = notNull;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericNullableRefedInterface<io.vertx.codegen.testmodel.RefedInterface1>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericNullableRefedInterface<io.vertx.codegen.testmodel.RefedInterface1>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericNullableRefedInterface<io.vertx.codegen.testmodel.RefedInterface1> event) {
        return io.vertx.ceylon.testmodel.GenericNullableRefedInterface.TO_CEYLON.converter(RefedInterface1.$TypeDescriptor$).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultGenericNullableApi(arg_0, arg_1);
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericNullableRefedInterface<io.vertx.ceylon.testmodel::RefedInterface1>")
  public GenericNullableRefedInterface<RefedInterface1> methodWithGenericNullableApiReturn(
    final @TypeInfo("ceylon.language::Boolean") @Name("notNull") boolean notNull) {
    boolean arg_0 = notNull;
    GenericNullableRefedInterface<RefedInterface1> ret = io.vertx.ceylon.testmodel.GenericNullableRefedInterface.TO_CEYLON.converter(RefedInterface1.$TypeDescriptor$).safeConvert(delegate.methodWithGenericNullableApiReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<T?>")
  public <T> GenericRefedInterface<T> methodWithParamInferedReturn(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<T?>") @Name("param") GenericRefedInterface<T> param) {
    io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> arg_0 = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_JAVA.safeConvert(param);
    GenericRefedInterface<T> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(delegate.methodWithParamInferedReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <T> void methodWithHandlerParamInfered(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<T?>") @Name("param") GenericRefedInterface<T> param, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<T?>)") @Name("handler") Callable<?> handler) {
    io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> arg_0 = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_JAVA.safeConvert(param);
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(event));
      }
    };
    delegate.methodWithHandlerParamInfered(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <T> void methodWithHandlerAsyncResultParamInfered(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<T?>") @Name("param") GenericRefedInterface<T> param, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<T?>)") @Name("handler") Callable<?> handler) {
    io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> arg_0 = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_JAVA.safeConvert(param);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultParamInfered(arg_0, arg_1);
  }

}
