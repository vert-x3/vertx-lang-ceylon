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
import io.vertx.core.json.JsonArray;
import java.util.List;
import io.vertx.codegen.testmodel.TestEnum;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "")
public class CollectionTCK implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.CollectionTCK, CollectionTCK> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.CollectionTCK, CollectionTCK>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.CollectionTCK, CollectionTCK> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.CollectionTCK, CollectionTCK>() {
        public CollectionTCK convert(io.vertx.codegen.testmodel.CollectionTCK src) {
          return new CollectionTCK(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<CollectionTCK, io.vertx.codegen.testmodel.CollectionTCK> TO_JAVA = new io.vertx.lang.ceylon.Converter<CollectionTCK, io.vertx.codegen.testmodel.CollectionTCK>() {
    public io.vertx.codegen.testmodel.CollectionTCK convert(CollectionTCK src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(CollectionTCK.class), io.vertx.codegen.testmodel.CollectionTCK.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.codegen.testmodel.CollectionTCK delegate;

  public CollectionTCK(io.vertx.codegen.testmodel.CollectionTCK delegate) {
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

  @TypeInfo("ceylon.language::Anything")
  public void methodWithListParams(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @Name("listString") ceylon.language.List<ceylon.language.String> listString, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Byte>") @Name("listByte") ceylon.language.List<ceylon.language.Byte> listByte, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @Name("listShort") ceylon.language.List<ceylon.language.Integer> listShort, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @Name("listInt") ceylon.language.List<ceylon.language.Integer> listInt, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @Name("listLong") ceylon.language.List<ceylon.language.Integer> listLong, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Object>") @Name("listJsonObject") ceylon.language.List<ceylon.json.Object> listJsonObject, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Array>") @Name("listJsonArray") ceylon.language.List<ceylon.json.Array> listJsonArray, 
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface1>") @Name("listVertxGen") ceylon.language.List<RefedInterface1> listVertxGen, 
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.testmodel::TestDataObject>") @Name("listDataObject") ceylon.language.List<io.vertx.ceylon.testmodel.TestDataObject> listDataObject, 
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @Name("listEnum") ceylon.language.List<ceylon.language.String> listEnum) {
    java.util.List<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(listString, io.vertx.lang.ceylon.ToJava.String);
    java.util.List<java.lang.Byte> arg_1 = io.vertx.lang.ceylon.ToJava.convertList(listByte, io.vertx.lang.ceylon.ToJava.Byte);
    java.util.List<java.lang.Short> arg_2 = io.vertx.lang.ceylon.ToJava.convertList(listShort, io.vertx.lang.ceylon.ToJava.Short);
    java.util.List<java.lang.Integer> arg_3 = io.vertx.lang.ceylon.ToJava.convertList(listInt, io.vertx.lang.ceylon.ToJava.Integer);
    java.util.List<java.lang.Long> arg_4 = io.vertx.lang.ceylon.ToJava.convertList(listLong, io.vertx.lang.ceylon.ToJava.Long);
    java.util.List<io.vertx.core.json.JsonObject> arg_5 = io.vertx.lang.ceylon.ToJava.convertList(listJsonObject, io.vertx.lang.ceylon.ToJava.JsonObject);
    java.util.List<io.vertx.core.json.JsonArray> arg_6 = io.vertx.lang.ceylon.ToJava.convertList(listJsonArray, io.vertx.lang.ceylon.ToJava.JsonArray);
    java.util.List<io.vertx.codegen.testmodel.RefedInterface1> arg_7 = io.vertx.lang.ceylon.ToJava.convertList(listVertxGen, io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA);
    java.util.List<io.vertx.codegen.testmodel.TestDataObject> arg_8 = io.vertx.lang.ceylon.ToJava.convertList(listDataObject, io.vertx.ceylon.testmodel.testDataObject_.get_().getToJava());
    java.util.List<io.vertx.codegen.testmodel.TestEnum> arg_9 = io.vertx.lang.ceylon.ToJava.convertList(listEnum, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class));
    delegate.methodWithListParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8, arg_9);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetParams(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("setString") ceylon.language.Set<ceylon.language.String> setString, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Byte>") @Name("setByte") ceylon.language.Set<ceylon.language.Byte> setByte, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @Name("setShort") ceylon.language.Set<ceylon.language.Integer> setShort, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @Name("setInt") ceylon.language.Set<ceylon.language.Integer> setInt, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @Name("setLong") ceylon.language.Set<ceylon.language.Integer> setLong, 
    final @TypeInfo("ceylon.language::Set<ceylon.json::Object>") @Name("setJsonObject") ceylon.language.Set<ceylon.json.Object> setJsonObject, 
    final @TypeInfo("ceylon.language::Set<ceylon.json::Array>") @Name("setJsonArray") ceylon.language.Set<ceylon.json.Array> setJsonArray, 
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface1>") @Name("setVertxGen") ceylon.language.Set<RefedInterface1> setVertxGen, 
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.testmodel::TestDataObject>") @Name("setDataObject") ceylon.language.Set<io.vertx.ceylon.testmodel.TestDataObject> setDataObject, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("setEnum") ceylon.language.Set<ceylon.language.String> setEnum) {
    java.util.Set<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertSet(setString, io.vertx.lang.ceylon.ToJava.String);
    java.util.Set<java.lang.Byte> arg_1 = io.vertx.lang.ceylon.ToJava.convertSet(setByte, io.vertx.lang.ceylon.ToJava.Byte);
    java.util.Set<java.lang.Short> arg_2 = io.vertx.lang.ceylon.ToJava.convertSet(setShort, io.vertx.lang.ceylon.ToJava.Short);
    java.util.Set<java.lang.Integer> arg_3 = io.vertx.lang.ceylon.ToJava.convertSet(setInt, io.vertx.lang.ceylon.ToJava.Integer);
    java.util.Set<java.lang.Long> arg_4 = io.vertx.lang.ceylon.ToJava.convertSet(setLong, io.vertx.lang.ceylon.ToJava.Long);
    java.util.Set<io.vertx.core.json.JsonObject> arg_5 = io.vertx.lang.ceylon.ToJava.convertSet(setJsonObject, io.vertx.lang.ceylon.ToJava.JsonObject);
    java.util.Set<io.vertx.core.json.JsonArray> arg_6 = io.vertx.lang.ceylon.ToJava.convertSet(setJsonArray, io.vertx.lang.ceylon.ToJava.JsonArray);
    java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> arg_7 = io.vertx.lang.ceylon.ToJava.convertSet(setVertxGen, io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA);
    java.util.Set<io.vertx.codegen.testmodel.TestDataObject> arg_8 = io.vertx.lang.ceylon.ToJava.convertSet(setDataObject, io.vertx.ceylon.testmodel.testDataObject_.get_().getToJava());
    java.util.Set<io.vertx.codegen.testmodel.TestEnum> arg_9 = io.vertx.lang.ceylon.ToJava.convertSet(setEnum, io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class));
    delegate.methodWithSetParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8, arg_9);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapParams(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>") @Name("mapString") ceylon.language.Map<ceylon.language.String,ceylon.language.String> mapString, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>") @Name("mapByte") ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> mapByte, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @Name("mapShort") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> mapShort, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @Name("mapInt") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> mapInt, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @Name("mapLong") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> mapLong, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object>") @Name("mapJsonObject") ceylon.language.Map<ceylon.language.String,ceylon.json.Object> mapJsonObject, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array>") @Name("mapJsonArray") ceylon.language.Map<ceylon.language.String,ceylon.json.Array> mapJsonArray, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,io.vertx.ceylon.testmodel::RefedInterface1>") @Name("mapVertxGen") ceylon.language.Map<ceylon.language.String,RefedInterface1> mapVertxGen) {
    java.util.Map<java.lang.String,java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertMap(mapString, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.String);
    java.util.Map<java.lang.String,java.lang.Byte> arg_1 = io.vertx.lang.ceylon.ToJava.convertMap(mapByte, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Byte);
    java.util.Map<java.lang.String,java.lang.Short> arg_2 = io.vertx.lang.ceylon.ToJava.convertMap(mapShort, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Short);
    java.util.Map<java.lang.String,java.lang.Integer> arg_3 = io.vertx.lang.ceylon.ToJava.convertMap(mapInt, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Integer);
    java.util.Map<java.lang.String,java.lang.Long> arg_4 = io.vertx.lang.ceylon.ToJava.convertMap(mapLong, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Long);
    java.util.Map<java.lang.String,io.vertx.core.json.JsonObject> arg_5 = io.vertx.lang.ceylon.ToJava.convertMap(mapJsonObject, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.JsonObject);
    java.util.Map<java.lang.String,io.vertx.core.json.JsonArray> arg_6 = io.vertx.lang.ceylon.ToJava.convertMap(mapJsonArray, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.JsonArray);
    java.util.Map<java.lang.String,io.vertx.codegen.testmodel.RefedInterface1> arg_7 = io.vertx.lang.ceylon.ToJava.convertMap(mapVertxGen, io.vertx.lang.ceylon.ToJava.String, io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA);
    delegate.methodWithMapParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListAndSet(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::String>)") @Name("listStringHandler") Callable<?> listStringHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Integer>)") @Name("listIntHandler") Callable<?> listIntHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::String>)") @Name("setStringHandler") Callable<?> setStringHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Integer>)") @Name("setIntHandler") Callable<?> setIntHandler) {
    io.vertx.core.Handler<java.util.List<java.lang.String>> arg_0 = listStringHandler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.String>>() {
      public void handle(java.util.List<java.lang.String> event) {
        listStringHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String));
      }
    };
    io.vertx.core.Handler<java.util.List<java.lang.Integer>> arg_1 = listIntHandler == null ? null : new io.vertx.core.Handler<java.util.List<java.lang.Integer>>() {
      public void handle(java.util.List<java.lang.Integer> event) {
        listIntHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer));
      }
    };
    io.vertx.core.Handler<java.util.Set<java.lang.String>> arg_2 = setStringHandler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.String>>() {
      public void handle(java.util.Set<java.lang.String> event) {
        setStringHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String));
      }
    };
    io.vertx.core.Handler<java.util.Set<java.lang.Integer>> arg_3 = setIntHandler == null ? null : new io.vertx.core.Handler<java.util.Set<java.lang.Integer>>() {
      public void handle(java.util.Set<java.lang.Integer> event) {
        setIntHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer));
      }
    };
    delegate.methodWithHandlerListAndSet(arg_0, arg_1, arg_2, arg_3);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListString(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    delegate.methodWithHandlerAsyncResultListString(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListInteger(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    delegate.methodWithHandlerAsyncResultListInteger(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter()));
      }
    };
    delegate.methodWithHandlerListVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface2>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.RefedInterface2> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface2.TO_CEYLON.converter()));
      }
    };
    delegate.methodWithHandlerListAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Object>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithHandlerListJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Object>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithHandlerListComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Array>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonArray> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithHandlerListJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Array>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonArray> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithHandlerListComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon()));
      }
    };
    delegate.methodWithHandlerListDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListEnum(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::String>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestEnum>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestEnum>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.TestEnum> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration()));
      }
    };
    delegate.methodWithHandlerListEnum(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetString(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::String>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.String>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.Set<java.lang.String>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    delegate.methodWithHandlerAsyncResultSetString(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetInteger(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Integer>)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Integer>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.Set<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    delegate.methodWithHandlerAsyncResultSetInteger(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter()));
      }
    };
    delegate.methodWithHandlerSetVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface2>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.RefedInterface2> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface2.TO_CEYLON.converter()));
      }
    };
    delegate.methodWithHandlerSetAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Object>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithHandlerSetJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Object>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithHandlerSetComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Array>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithHandlerSetJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Array>)") @Name("setHandler") Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = setHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) {
        setHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithHandlerSetComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("setHandler") Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = setHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) {
        setHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon()));
      }
    };
    delegate.methodWithHandlerSetDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetEnum(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::String>)") @Name("setHandler") Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestEnum>> arg_0 = setHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.TestEnum> event) {
        setHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration()));
      }
    };
    delegate.methodWithHandlerSetEnum(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter());
      }
    };
    delegate.methodWithHandlerAsyncResultListVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface2>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.RefedInterface2> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface2.TO_CEYLON.converter());
      }
    };
    delegate.methodWithHandlerAsyncResultListAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Object>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithHandlerAsyncResultListJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Object>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithHandlerAsyncResultListComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Array>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithHandlerAsyncResultListJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Array>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithHandlerAsyncResultListComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon());
      }
    };
    delegate.methodWithHandlerAsyncResultListDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListEnum(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestEnum>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<io.vertx.codegen.testmodel.TestEnum>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestEnum> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration());
      }
    };
    delegate.methodWithHandlerAsyncResultListEnum(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter());
      }
    };
    delegate.methodWithHandlerAsyncResultSetVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface2>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.RefedInterface2> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface2.TO_CEYLON.converter());
      }
    };
    delegate.methodWithHandlerAsyncResultSetAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Object>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithHandlerAsyncResultSetJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Object>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithHandlerAsyncResultSetComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Array>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithHandlerAsyncResultSetJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Array>)") @Name("listHandler") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithHandlerAsyncResultSetComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("setHandler") Callable<?> setHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = setHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>(setHandler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon());
      }
    };
    delegate.methodWithHandlerAsyncResultSetDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetEnum(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::String>)") @Name("setHandler") Callable<?> setHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>> arg_0 = setHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>(setHandler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestEnum> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration());
      }
    };
    delegate.methodWithHandlerAsyncResultSetEnum(arg_0);
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> methodWithMapReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, delegate.methodWithMapReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> methodWithMapStringReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, delegate.methodWithMapStringReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithMapLongReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithMapLongReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithMapIntegerReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithMapIntegerReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Integer);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithMapShortReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithMapShortReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Short);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> methodWithMapByteReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.Byte.$TypeDescriptor$, delegate.methodWithMapByteReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Byte);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Character>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Character> methodWithMapCharacterReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Character> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.Character.$TypeDescriptor$, delegate.methodWithMapCharacterReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Character);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> methodWithMapBooleanReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.Boolean.$TypeDescriptor$, delegate.methodWithMapBooleanReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Boolean);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Float> methodWithMapFloatReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, delegate.methodWithMapFloatReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Float);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Float> methodWithMapDoubleReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, delegate.methodWithMapDoubleReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Double);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object>")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Object> methodWithMapJsonObjectReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.json.Object.$TypeDescriptor$, delegate.methodWithMapJsonObjectReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object>")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Object> methodWithMapComplexJsonObjectReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.json.Object.$TypeDescriptor$, delegate.methodWithMapComplexJsonObjectReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array>")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Array> methodWithMapJsonArrayReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, delegate.methodWithMapJsonArrayReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array>")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Array> methodWithMapComplexJsonArrayReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, delegate.methodWithMapComplexJsonArrayReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> methodWithListStringReturn() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.methodWithListStringReturn(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::Integer>")
  public ceylon.language.List<ceylon.language.Integer> methodWithListLongReturn() {
    ceylon.language.List<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithListLongReturn(), io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @TypeInfo("ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface1>")
  public ceylon.language.List<RefedInterface1> methodWithListVertxGenReturn() {
    ceylon.language.List<RefedInterface1> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, delegate.methodWithListVertxGenReturn(), io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter());
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.json::Object>")
  public ceylon.language.List<ceylon.json.Object> methodWithListJsonObjectReturn() {
    ceylon.language.List<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithListJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.json::Object>")
  public ceylon.language.List<ceylon.json.Object> methodWithListComplexJsonObjectReturn() {
    ceylon.language.List<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithListComplexJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.json::Array>")
  public ceylon.language.List<ceylon.json.Array> methodWithListJsonArrayReturn() {
    ceylon.language.List<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithListJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.json::Array>")
  public ceylon.language.List<ceylon.json.Array> methodWithListComplexJsonArrayReturn() {
    ceylon.language.List<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithListComplexJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @TypeInfo("ceylon.language::List<io.vertx.ceylon.testmodel::TestDataObject>")
  public ceylon.language.List<io.vertx.ceylon.testmodel.TestDataObject> methodWithListDataObjectReturn() {
    ceylon.language.List<io.vertx.ceylon.testmodel.TestDataObject> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, delegate.methodWithListDataObjectReturn(), io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon());
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> methodWithListEnumReturn() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.methodWithListEnumReturn(), io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration());
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> methodWithSetStringReturn() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, delegate.methodWithSetStringReturn(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::Integer>")
  public ceylon.language.Set<ceylon.language.Integer> methodWithSetLongReturn() {
    ceylon.language.Set<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithSetLongReturn(), io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface1>")
  public ceylon.language.Set<RefedInterface1> methodWithSetVertxGenReturn() {
    ceylon.language.Set<RefedInterface1> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, delegate.methodWithSetVertxGenReturn(), io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter());
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.json::Object>")
  public ceylon.language.Set<ceylon.json.Object> methodWithSetJsonObjectReturn() {
    ceylon.language.Set<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithSetJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.json::Object>")
  public ceylon.language.Set<ceylon.json.Object> methodWithSetComplexJsonObjectReturn() {
    ceylon.language.Set<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithSetComplexJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.json::Array>")
  public ceylon.language.Set<ceylon.json.Array> methodWithSetJsonArrayReturn() {
    ceylon.language.Set<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithSetJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.json::Array>")
  public ceylon.language.Set<ceylon.json.Array> methodWithSetComplexJsonArrayReturn() {
    ceylon.language.Set<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithSetComplexJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.testmodel::TestDataObject>")
  public ceylon.language.Set<io.vertx.ceylon.testmodel.TestDataObject> methodWithSetDataObjectReturn() {
    ceylon.language.Set<io.vertx.ceylon.testmodel.TestDataObject> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, delegate.methodWithSetDataObjectReturn(), io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon());
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> methodWithSetEnumReturn() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, delegate.methodWithSetEnumReturn(), io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration());
    return ret;
  }

}
