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
import java.util.Set;
import java.util.function.Function;
import io.vertx.core.json.JsonArray;
import java.util.List;
import io.vertx.codegen.testmodel.TestEnum;
import java.util.Map;
import io.vertx.core.json.JsonObject;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "")
public class FunctionParamTCK implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.FunctionParamTCK, FunctionParamTCK> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.FunctionParamTCK, FunctionParamTCK>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.FunctionParamTCK, FunctionParamTCK> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.FunctionParamTCK, FunctionParamTCK>() {
        public FunctionParamTCK convert(io.vertx.codegen.testmodel.FunctionParamTCK src) {
          return new FunctionParamTCK(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<FunctionParamTCK, io.vertx.codegen.testmodel.FunctionParamTCK> TO_JAVA = new io.vertx.lang.ceylon.Converter<FunctionParamTCK, io.vertx.codegen.testmodel.FunctionParamTCK>() {
    public io.vertx.codegen.testmodel.FunctionParamTCK convert(FunctionParamTCK src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(FunctionParamTCK.class);
  @Ignore private final io.vertx.codegen.testmodel.FunctionParamTCK delegate;

  public FunctionParamTCK(io.vertx.codegen.testmodel.FunctionParamTCK delegate) {
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

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> methodWithBasicParam(
    final @TypeInfo("ceylon.language::String(ceylon.language::Byte)") @Name("byteFunc")  Callable<?> byteFunc, 
    final @TypeInfo("ceylon.language::String(ceylon.language::Integer)") @Name("shortFunc")  Callable<?> shortFunc, 
    final @TypeInfo("ceylon.language::String(ceylon.language::Integer)") @Name("integerFunc")  Callable<?> integerFunc, 
    final @TypeInfo("ceylon.language::String(ceylon.language::Integer)") @Name("longFunc")  Callable<?> longFunc, 
    final @TypeInfo("ceylon.language::String(ceylon.language::Float)") @Name("floatFunc")  Callable<?> floatFunc, 
    final @TypeInfo("ceylon.language::String(ceylon.language::Float)") @Name("doubleFunc")  Callable<?> doubleFunc, 
    final @TypeInfo("ceylon.language::String(ceylon.language::Boolean)") @Name("booleanFunc")  Callable<?> booleanFunc, 
    final @TypeInfo("ceylon.language::String(ceylon.language::Character)") @Name("charFunc")  Callable<?> charFunc, 
    final @TypeInfo("ceylon.language::String(ceylon.language::String)") @Name("stringFunc")  Callable<?> stringFunc) {
    java.util.function.Function<java.lang.Byte,java.lang.String> arg_0 = byteFunc == null ? null : new java.util.function.Function<java.lang.Byte,java.lang.String>() {
      public java.lang.String apply(java.lang.Byte arg) {
        ceylon.language.String ret = (ceylon.language.String)byteFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Byte.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.Short,java.lang.String> arg_1 = shortFunc == null ? null : new java.util.function.Function<java.lang.Short,java.lang.String>() {
      public java.lang.String apply(java.lang.Short arg) {
        ceylon.language.String ret = (ceylon.language.String)shortFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Short.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.Integer,java.lang.String> arg_2 = integerFunc == null ? null : new java.util.function.Function<java.lang.Integer,java.lang.String>() {
      public java.lang.String apply(java.lang.Integer arg) {
        ceylon.language.String ret = (ceylon.language.String)integerFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.Long,java.lang.String> arg_3 = longFunc == null ? null : new java.util.function.Function<java.lang.Long,java.lang.String>() {
      public java.lang.String apply(java.lang.Long arg) {
        ceylon.language.String ret = (ceylon.language.String)longFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.Float,java.lang.String> arg_4 = floatFunc == null ? null : new java.util.function.Function<java.lang.Float,java.lang.String>() {
      public java.lang.String apply(java.lang.Float arg) {
        ceylon.language.String ret = (ceylon.language.String)floatFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Float.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.Double,java.lang.String> arg_5 = doubleFunc == null ? null : new java.util.function.Function<java.lang.Double,java.lang.String>() {
      public java.lang.String apply(java.lang.Double arg) {
        ceylon.language.String ret = (ceylon.language.String)doubleFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Double.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.Boolean,java.lang.String> arg_6 = booleanFunc == null ? null : new java.util.function.Function<java.lang.Boolean,java.lang.String>() {
      public java.lang.String apply(java.lang.Boolean arg) {
        ceylon.language.String ret = (ceylon.language.String)booleanFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.Character,java.lang.String> arg_7 = charFunc == null ? null : new java.util.function.Function<java.lang.Character,java.lang.String>() {
      public java.lang.String apply(java.lang.Character arg) {
        ceylon.language.String ret = (ceylon.language.String)charFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Character.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.String,java.lang.String> arg_8 = stringFunc == null ? null : new java.util.function.Function<java.lang.String,java.lang.String>() {
      public java.lang.String apply(java.lang.String arg) {
        ceylon.language.String ret = (ceylon.language.String)stringFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.methodWithBasicParam(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> methodWithJsonParam(
    final @TypeInfo("ceylon.language::String(ceylon.json::Object)") @Name("objectFunc")  Callable<?> objectFunc, 
    final @TypeInfo("ceylon.language::String(ceylon.json::Array)") @Name("arrayFunc")  Callable<?> arrayFunc) {
    java.util.function.Function<io.vertx.core.json.JsonObject,java.lang.String> arg_0 = objectFunc == null ? null : new java.util.function.Function<io.vertx.core.json.JsonObject,java.lang.String>() {
      public java.lang.String apply(io.vertx.core.json.JsonObject arg) {
        ceylon.language.String ret = (ceylon.language.String)objectFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    java.util.function.Function<io.vertx.core.json.JsonArray,java.lang.String> arg_1 = arrayFunc == null ? null : new java.util.function.Function<io.vertx.core.json.JsonArray,java.lang.String>() {
      public java.lang.String apply(io.vertx.core.json.JsonArray arg) {
        ceylon.language.String ret = (ceylon.language.String)arrayFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.methodWithJsonParam(arg_0, arg_1), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithVoidParam(
    final @TypeInfo("ceylon.language::String()") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.Void,java.lang.String> arg_0 = func == null ? null : new java.util.function.Function<java.lang.Void,java.lang.String>() {
      public java.lang.String apply(java.lang.Void arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$();
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithVoidParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithUserTypeParam(
    final @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1") @Name("arg")  RefedInterface1 arg, 
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::RefedInterface1)") @Name("func")  Callable<?> func) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA.safeConvert(arg);
    java.util.function.Function<io.vertx.codegen.testmodel.RefedInterface1,java.lang.String> arg_1 = func == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.RefedInterface1,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.RefedInterface1 arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$((Object)io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithUserTypeParam(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithObjectParam(
    final @TypeInfo("ceylon.language::Object?") @Name("arg")  Object arg, 
    final @TypeInfo("ceylon.language::String(ceylon.language::Object?)") @Name("func")  Callable<?> func) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(arg);
    java.util.function.Function<java.lang.Object,java.lang.String> arg_1 = func == null ? null : new java.util.function.Function<java.lang.Object,java.lang.String>() {
      public java.lang.String apply(java.lang.Object arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithObjectParam(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithDataObjectParam(
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::TestDataObject)") @Name("func")  Callable<?> func) {
    java.util.function.Function<io.vertx.codegen.testmodel.TestDataObject,java.lang.String> arg_0 = func == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.TestDataObject,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.TestDataObject arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$((Object)io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon().safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithDataObjectParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithEnumParam(
    final @TypeInfo("ceylon.language::String(ceylon.language::String)") @Name("func")  Callable<?> func) {
    java.util.function.Function<io.vertx.codegen.testmodel.TestEnum,java.lang.String> arg_0 = func == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.TestEnum,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.TestEnum arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration().safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithEnumParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithListParam(
    final @TypeInfo("ceylon.language::String(ceylon.language::List<ceylon.language::String>)") @Name("stringFunc")  Callable<?> stringFunc) {
    java.util.function.Function<java.util.List<java.lang.String>,java.lang.String> arg_0 = stringFunc == null ? null : new java.util.function.Function<java.util.List<java.lang.String>,java.lang.String>() {
      public java.lang.String apply(java.util.List<java.lang.String> arg) {
        ceylon.language.String ret = (ceylon.language.String)stringFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, arg, io.vertx.lang.ceylon.ToCeylon.String));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithListParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithSetParam(
    final @TypeInfo("ceylon.language::String(ceylon.language::Set<ceylon.language::String>)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.util.Set<java.lang.String>,java.lang.String> arg_0 = func == null ? null : new java.util.function.Function<java.util.Set<java.lang.String>,java.lang.String>() {
      public java.lang.String apply(java.util.Set<java.lang.String> arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, arg, io.vertx.lang.ceylon.ToCeylon.String));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithSetParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithMapParam(
    final @TypeInfo("ceylon.language::String(ceylon.language::Map<ceylon.language::String,ceylon.language::String>)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.util.Map<java.lang.String,java.lang.String>,java.lang.String> arg_0 = func == null ? null : new java.util.function.Function<java.util.Map<java.lang.String,java.lang.String>,java.lang.String>() {
      public java.lang.String apply(java.util.Map<java.lang.String,java.lang.String> arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, arg, io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithMapParam(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::String")
  public <T> ceylon.language.String methodWithGenericParam(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("T?") @Name("t")  T t, 
    final @TypeInfo("ceylon.language::String(T?)") @Name("func")  Callable<?> func) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(t);
    java.util.function.Function<java.lang.Object,java.lang.String> arg_1 = func == null ? null : new java.util.function.Function<java.lang.Object,java.lang.String>() {
      public java.lang.String apply(java.lang.Object arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithGenericParam(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::String")
  public <T> ceylon.language.String methodWithGenericUserTypeParam(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("T?") @Name("t")  T t, 
    final @TypeInfo("ceylon.language::String(io.vertx.ceylon.testmodel::GenericRefedInterface<T>)") @Name("func")  Callable<?> func) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(t);
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>,java.lang.String> arg_1 = func == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>,java.lang.String>() {
      public java.lang.String apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter($reified$T).safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithGenericUserTypeParam(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithBasicReturn(
    final @TypeInfo("ceylon.language::Byte(ceylon.language::String)") @Name("byteFunc")  Callable<?> byteFunc, 
    final @TypeInfo("ceylon.language::Integer(ceylon.language::String)") @Name("shortFunc")  Callable<?> shortFunc, 
    final @TypeInfo("ceylon.language::Integer(ceylon.language::String)") @Name("integerFunc")  Callable<?> integerFunc, 
    final @TypeInfo("ceylon.language::Integer(ceylon.language::String)") @Name("longFunc")  Callable<?> longFunc, 
    final @TypeInfo("ceylon.language::Float(ceylon.language::String)") @Name("floatFunc")  Callable<?> floatFunc, 
    final @TypeInfo("ceylon.language::Float(ceylon.language::String)") @Name("doubleFunc")  Callable<?> doubleFunc, 
    final @TypeInfo("ceylon.language::Boolean(ceylon.language::String)") @Name("booleanFunc")  Callable<?> booleanFunc, 
    final @TypeInfo("ceylon.language::Character(ceylon.language::String)") @Name("charFunc")  Callable<?> charFunc, 
    final @TypeInfo("ceylon.language::String(ceylon.language::String)") @Name("stringFunc")  Callable<?> stringFunc) {
    java.util.function.Function<java.lang.String,java.lang.Byte> arg_0 = byteFunc == null ? null : new java.util.function.Function<java.lang.String,java.lang.Byte>() {
      public java.lang.Byte apply(java.lang.String arg) {
        ceylon.language.Byte ret = (ceylon.language.Byte)byteFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.Byte.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.String,java.lang.Short> arg_1 = shortFunc == null ? null : new java.util.function.Function<java.lang.String,java.lang.Short>() {
      public java.lang.Short apply(java.lang.String arg) {
        ceylon.language.Integer ret = (ceylon.language.Integer)shortFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.Short.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.String,java.lang.Integer> arg_2 = integerFunc == null ? null : new java.util.function.Function<java.lang.String,java.lang.Integer>() {
      public java.lang.Integer apply(java.lang.String arg) {
        ceylon.language.Integer ret = (ceylon.language.Integer)integerFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.Integer.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.String,java.lang.Long> arg_3 = longFunc == null ? null : new java.util.function.Function<java.lang.String,java.lang.Long>() {
      public java.lang.Long apply(java.lang.String arg) {
        ceylon.language.Integer ret = (ceylon.language.Integer)longFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.Long.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.String,java.lang.Float> arg_4 = floatFunc == null ? null : new java.util.function.Function<java.lang.String,java.lang.Float>() {
      public java.lang.Float apply(java.lang.String arg) {
        ceylon.language.Float ret = (ceylon.language.Float)floatFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.Float.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.String,java.lang.Double> arg_5 = doubleFunc == null ? null : new java.util.function.Function<java.lang.String,java.lang.Double>() {
      public java.lang.Double apply(java.lang.String arg) {
        ceylon.language.Float ret = (ceylon.language.Float)doubleFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.Double.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.String,java.lang.Boolean> arg_6 = booleanFunc == null ? null : new java.util.function.Function<java.lang.String,java.lang.Boolean>() {
      public java.lang.Boolean apply(java.lang.String arg) {
        ceylon.language.Boolean ret = (ceylon.language.Boolean)booleanFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.Boolean.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.String,java.lang.Character> arg_7 = charFunc == null ? null : new java.util.function.Function<java.lang.String,java.lang.Character>() {
      public java.lang.Character apply(java.lang.String arg) {
        ceylon.language.Character ret = (ceylon.language.Character)charFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.Character.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.String,java.lang.String> arg_8 = stringFunc == null ? null : new java.util.function.Function<java.lang.String,java.lang.String>() {
      public java.lang.String apply(java.lang.String arg) {
        ceylon.language.String ret = (ceylon.language.String)stringFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithBasicReturn(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithJsonReturn(
    final @TypeInfo("ceylon.json::Object(ceylon.language::String)") @Name("objectFunc")  Callable<?> objectFunc, 
    final @TypeInfo("ceylon.json::Array(ceylon.language::String)") @Name("arrayFunc")  Callable<?> arrayFunc) {
    java.util.function.Function<java.lang.String,io.vertx.core.json.JsonObject> arg_0 = objectFunc == null ? null : new java.util.function.Function<java.lang.String,io.vertx.core.json.JsonObject>() {
      public io.vertx.core.json.JsonObject apply(java.lang.String arg) {
        ceylon.json.Object ret = (ceylon.json.Object)objectFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(ret);
      }
    };
    java.util.function.Function<java.lang.String,io.vertx.core.json.JsonArray> arg_1 = arrayFunc == null ? null : new java.util.function.Function<java.lang.String,io.vertx.core.json.JsonArray>() {
      public io.vertx.core.json.JsonArray apply(java.lang.String arg) {
        ceylon.json.Array ret = (ceylon.json.Array)arrayFunc.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithJsonReturn(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithObjectReturn(
    final @TypeInfo("ceylon.language::Object?(ceylon.language::Integer)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.Integer,java.lang.Object> arg_0 = func == null ? null : new java.util.function.Function<java.lang.Integer,java.lang.Object>() {
      public java.lang.Object apply(java.lang.Integer arg) {
        Object ret = (Object)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.object(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithObjectReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithDataObjectReturn(
    final @TypeInfo("io.vertx.ceylon.testmodel::TestDataObject(ceylon.language::String)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,io.vertx.codegen.testmodel.TestDataObject> arg_0 = func == null ? null : new java.util.function.Function<java.lang.String,io.vertx.codegen.testmodel.TestDataObject>() {
      public io.vertx.codegen.testmodel.TestDataObject apply(java.lang.String arg) {
        io.vertx.ceylon.testmodel.TestDataObject ret = (io.vertx.ceylon.testmodel.TestDataObject)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return ret == null ? null : new io.vertx.codegen.testmodel.TestDataObject(io.vertx.lang.ceylon.ToJava.JsonObject.convert(ret.toJson()));
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithDataObjectReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithEnumReturn(
    final @TypeInfo("ceylon.language::String(ceylon.language::String)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,io.vertx.codegen.testmodel.TestEnum> arg_0 = func == null ? null : new java.util.function.Function<java.lang.String,io.vertx.codegen.testmodel.TestEnum>() {
      public io.vertx.codegen.testmodel.TestEnum apply(java.lang.String arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class).safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithEnumReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithListReturn(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>(ceylon.language::String)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,java.util.List<java.lang.String>> arg_0 = func == null ? null : new java.util.function.Function<java.lang.String,java.util.List<java.lang.String>>() {
      public java.util.List<java.lang.String> apply(java.lang.String arg) {
        ceylon.language.List<ceylon.language.String> ret = (ceylon.language.List<ceylon.language.String>)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.convertList(ret, io.vertx.lang.ceylon.ToJava.String);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithListReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithSetReturn(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>(ceylon.language::String)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,java.util.Set<java.lang.String>> arg_0 = func == null ? null : new java.util.function.Function<java.lang.String,java.util.Set<java.lang.String>>() {
      public java.util.Set<java.lang.String> apply(java.lang.String arg) {
        ceylon.language.Set<ceylon.language.String> ret = (ceylon.language.Set<ceylon.language.String>)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.convertSet(ret, io.vertx.lang.ceylon.ToJava.String);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithSetReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithMapReturn(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>(ceylon.language::String)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> arg_0 = func == null ? null : new java.util.function.Function<java.lang.String,java.util.Map<java.lang.String,java.lang.String>>() {
      public java.util.Map<java.lang.String,java.lang.String> apply(java.lang.String arg) {
        ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = (ceylon.language.Map<ceylon.language.String,ceylon.language.String>)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.convertMap(ret, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.String);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithMapReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::String")
  public <T> ceylon.language.String methodWithGenericReturn(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("T?(ceylon.language::Integer)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.Integer,java.lang.Object> arg_0 = func == null ? null : new java.util.function.Function<java.lang.Integer,java.lang.Object>() {
      public java.lang.Object apply(java.lang.Integer arg) {
        Object ret = (Object)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.object(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithGenericReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::String")
  public <T> ceylon.language.String methodWithGenericUserTypeReturn(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<T>(io.vertx.ceylon.testmodel::GenericRefedInterface<T>)") @Name("func")  Callable<?> func) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>,io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>> arg_0 = func == null ? null : new java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>,io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>() {
      public io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> apply(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> arg) {
        GenericRefedInterface<Object> ret = (GenericRefedInterface<Object>)func.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter($reified$T).safeConvert(arg));
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_JAVA.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithGenericUserTypeReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithNullableListParam(
    final @TypeInfo("ceylon.language::String(ceylon.language::List<ceylon.language::String>?)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.util.List<java.lang.String>,java.lang.String> arg_0 = func == null ? null : new java.util.function.Function<java.util.List<java.lang.String>,java.lang.String>() {
      public java.lang.String apply(java.util.List<java.lang.String> arg) {
        ceylon.language.String ret = (ceylon.language.String)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, arg, io.vertx.lang.ceylon.ToCeylon.String));
        return io.vertx.lang.ceylon.ToJava.String.safeConvert(ret);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithNullableListParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithNullableListReturn(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>?(ceylon.language::String)") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,java.util.List<java.lang.String>> arg_0 = func == null ? null : new java.util.function.Function<java.lang.String,java.util.List<java.lang.String>>() {
      public java.util.List<java.lang.String> apply(java.lang.String arg) {
        ceylon.language.List<ceylon.language.String> ret = (ceylon.language.List<ceylon.language.String>)func.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.convertList(ret, io.vertx.lang.ceylon.ToJava.String);
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithNullableListReturn(arg_0));
    return ret;
  }

}
