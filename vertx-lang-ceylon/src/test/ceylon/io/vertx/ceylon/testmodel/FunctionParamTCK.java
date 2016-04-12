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
import io.vertx.core.AsyncResult;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " @author <a href=\"mailto:julien@julienviet.com\">Julien Viet</a>\n")
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
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Byte,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("byteFunc")  Callable<?> byteFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Short,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("shortFunc")  Callable<?> shortFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Integer,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("integerFunc")  Callable<?> integerFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Long,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("longFunc")  Callable<?> longFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Float,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("floatFunc")  Callable<?> floatFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Double,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("doubleFunc")  Callable<?> doubleFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Boolean,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("booleanFunc")  Callable<?> booleanFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Character,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("charFunc")  Callable<?> charFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("stringFunc")  Callable<?> stringFunc) {
    java.util.function.Function<java.lang.Byte,java.lang.String> arg_0 = null;
    java.util.function.Function<java.lang.Short,java.lang.String> arg_1 = null;
    java.util.function.Function<java.lang.Integer,java.lang.String> arg_2 = null;
    java.util.function.Function<java.lang.Long,java.lang.String> arg_3 = null;
    java.util.function.Function<java.lang.Float,java.lang.String> arg_4 = null;
    java.util.function.Function<java.lang.Double,java.lang.String> arg_5 = null;
    java.util.function.Function<java.lang.Boolean,java.lang.String> arg_6 = null;
    java.util.function.Function<java.lang.Character,java.lang.String> arg_7 = null;
    java.util.function.Function<java.lang.String,java.lang.String> arg_8 = null;
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.methodWithBasicParam(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> methodWithJsonParam(
    final @TypeInfo("not_handled: java.util.function.Function<io.vertx.core.json.JsonObject,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("objectFunc")  Callable<?> objectFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<io.vertx.core.json.JsonArray,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("arrayFunc")  Callable<?> arrayFunc) {
    java.util.function.Function<io.vertx.core.json.JsonObject,java.lang.String> arg_0 = null;
    java.util.function.Function<io.vertx.core.json.JsonArray,java.lang.String> arg_1 = null;
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.methodWithJsonParam(arg_0, arg_1), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithUserTypeParam(
    final @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1") @Name("arg")  RefedInterface1 arg, 
    final @TypeInfo("not_handled: java.util.function.Function<io.vertx.codegen.testmodel.RefedInterface1,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA.safeConvert(arg);
    java.util.function.Function<io.vertx.codegen.testmodel.RefedInterface1,java.lang.String> arg_1 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithUserTypeParam(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithObjectParam(
    final @TypeInfo("ceylon.language::Object?") @Name("arg")  Object arg, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Object,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(arg);
    java.util.function.Function<java.lang.Object,java.lang.String> arg_1 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithObjectParam(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithDataObjectParam(
    final @TypeInfo("not_handled: java.util.function.Function<io.vertx.codegen.testmodel.TestDataObject,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<io.vertx.codegen.testmodel.TestDataObject,java.lang.String> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithDataObjectParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithEnumParam(
    final @TypeInfo("not_handled: java.util.function.Function<io.vertx.codegen.testmodel.TestEnum,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<io.vertx.codegen.testmodel.TestEnum,java.lang.String> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithEnumParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithListParam(
    final @TypeInfo("not_handled: java.util.function.Function<java.util.List<java.lang.String>,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("stringFunc")  Callable<?> stringFunc) {
    java.util.function.Function<java.util.List<java.lang.String>,java.lang.String> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithListParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithSetParam(
    final @TypeInfo("not_handled: java.util.function.Function<java.util.Set<java.lang.String>,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.util.Set<java.lang.String>,java.lang.String> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithSetParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithMapParam(
    final @TypeInfo("not_handled: java.util.function.Function<java.util.Map<java.lang.String,java.lang.String>,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.util.Map<java.lang.String,java.lang.String>,java.lang.String> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithMapParam(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::String")
  public <T> ceylon.language.String methodWithGenericParam(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("T?") @Name("t")  T t, 
    final @TypeInfo("not_handled: java.util.function.Function<T,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(t);
    java.util.function.Function<java.lang.Object,java.lang.String> arg_1 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithGenericParam(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::String")
  public <T> ceylon.language.String methodWithGenericUserTypeParam(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("T?") @Name("t")  T t, 
    final @TypeInfo("not_handled: java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<T>,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(t);
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>,java.lang.String> arg_1 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithGenericUserTypeParam(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithAsyncResultParam(
    final @TypeInfo("ceylon.language::Boolean") @Name("success")  boolean success, 
    final @TypeInfo("not_handled: java.util.function.Function<io.vertx.core.AsyncResult<java.lang.String>,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    boolean arg_0 = success;
    java.util.function.Function<io.vertx.core.AsyncResult<java.lang.String>,java.lang.String> arg_1 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithAsyncResultParam(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithBasicReturn(
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.lang.Byte> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("byteFunc")  Callable<?> byteFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.lang.Short> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("shortFunc")  Callable<?> shortFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.lang.Integer> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("integerFunc")  Callable<?> integerFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.lang.Long> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("longFunc")  Callable<?> longFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.lang.Float> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("floatFunc")  Callable<?> floatFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.lang.Double> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("doubleFunc")  Callable<?> doubleFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.lang.Boolean> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("booleanFunc")  Callable<?> booleanFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.lang.Character> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("charFunc")  Callable<?> charFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("stringFunc")  Callable<?> stringFunc) {
    java.util.function.Function<java.lang.String,java.lang.Byte> arg_0 = null;
    java.util.function.Function<java.lang.String,java.lang.Short> arg_1 = null;
    java.util.function.Function<java.lang.String,java.lang.Integer> arg_2 = null;
    java.util.function.Function<java.lang.String,java.lang.Long> arg_3 = null;
    java.util.function.Function<java.lang.String,java.lang.Float> arg_4 = null;
    java.util.function.Function<java.lang.String,java.lang.Double> arg_5 = null;
    java.util.function.Function<java.lang.String,java.lang.Boolean> arg_6 = null;
    java.util.function.Function<java.lang.String,java.lang.Character> arg_7 = null;
    java.util.function.Function<java.lang.String,java.lang.String> arg_8 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithBasicReturn(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithJsonReturn(
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,io.vertx.core.json.JsonObject> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("objectFunc")  Callable<?> objectFunc, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,io.vertx.core.json.JsonArray> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("arrayFunc")  Callable<?> arrayFunc) {
    java.util.function.Function<java.lang.String,io.vertx.core.json.JsonObject> arg_0 = null;
    java.util.function.Function<java.lang.String,io.vertx.core.json.JsonArray> arg_1 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithJsonReturn(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithObjectReturn(
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Integer,java.lang.Object> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.Integer,java.lang.Object> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithObjectReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithDataObjectReturn(
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,io.vertx.codegen.testmodel.TestDataObject> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,io.vertx.codegen.testmodel.TestDataObject> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithDataObjectReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithEnumReturn(
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,io.vertx.codegen.testmodel.TestEnum> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,io.vertx.codegen.testmodel.TestEnum> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithEnumReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithListReturn(
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.util.List<java.lang.String>> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,java.util.List<java.lang.String>> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithListReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithSetReturn(
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.util.Set<java.lang.String>> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,java.util.Set<java.lang.String>> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithSetReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithMapReturn(
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithMapReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::String")
  public <T> ceylon.language.String methodWithGenericReturn(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.Integer,T> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.Integer,java.lang.Object> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithGenericReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::String")
  public <T> ceylon.language.String methodWithGenericUserTypeReturn(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("not_handled: java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<T>,io.vertx.codegen.testmodel.GenericRefedInterface<T>> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>,io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithGenericUserTypeReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithNullableListParam(
    final @TypeInfo("not_handled: java.util.function.Function<java.util.List<java.lang.String>,java.lang.String> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.util.List<java.lang.String>,java.lang.String> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithNullableListParam(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithNullableListReturn(
    final @TypeInfo("not_handled: java.util.function.Function<java.lang.String,java.util.List<java.lang.String>> class io.vertx.codegen.type.ParameterizedTypeInfo FUNCTION") @Name("func")  Callable<?> func) {
    java.util.function.Function<java.lang.String,java.util.List<java.lang.String>> arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithNullableListReturn(arg_0));
    return ret;
  }

}
