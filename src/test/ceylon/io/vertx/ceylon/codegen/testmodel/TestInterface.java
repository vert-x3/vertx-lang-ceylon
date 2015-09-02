package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.codegen.testmodel.TestEnum;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import java.util.Set;
import io.vertx.core.json.JsonArray;
import java.util.List;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class TestInterface extends io.vertx.ceylon.codegen.testmodel.SuperInterface1 implements SuperInterface2 {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(TestInterface.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.TestInterface, TestInterface> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.TestInterface, TestInterface>() {
    public TestInterface convert(io.vertx.codegen.testmodel.TestInterface src) {
      return new TestInterface(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<TestInterface, io.vertx.codegen.testmodel.TestInterface> TO_JAVA = new io.vertx.lang.ceylon.Converter<TestInterface, io.vertx.codegen.testmodel.TestInterface>() {
    public io.vertx.codegen.testmodel.TestInterface convert(TestInterface src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.codegen.testmodel.TestInterface delegate;

  public TestInterface(io.vertx.codegen.testmodel.TestInterface delegate) {
    super(delegate);
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void otherSuperMethodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") @DocAnnotation$annotation$(description = "todo") byte b, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long s, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long i, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long l, 
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") double f, 
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") double d, 
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean bool, 
    final @TypeInfo("ceylon.language::Character") @DocAnnotation$annotation$(description = "todo") int ch, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str) {
    byte arg_0 = b;
    short arg_1 = (short)s;
    int arg_2 = (int)i;
    long arg_3 = l;
    float arg_4 = (float)f;
    double arg_5 = d;
    boolean arg_6 = bool;
    char arg_7 = (char)ch;
    java.lang.String arg_8 = str.toString();
    delegate.otherSuperMethodWithBasicParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") @DocAnnotation$annotation$(description = "todo") byte b, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long s, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long i, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long l, 
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") double f, 
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") double d, 
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean bool, 
    final @TypeInfo("ceylon.language::Character") @DocAnnotation$annotation$(description = "todo") int ch, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str) {
    byte arg_0 = b;
    short arg_1 = (short)s;
    int arg_2 = (int)i;
    long arg_3 = l;
    float arg_4 = (float)f;
    double arg_5 = d;
    boolean arg_6 = bool;
    char arg_7 = (char)ch;
    java.lang.String arg_8 = str.toString();
    delegate.methodWithBasicParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithBasicBoxedParams(
    final @TypeInfo("ceylon.language::Byte") @DocAnnotation$annotation$(description = "todo") ceylon.language.Byte b, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") ceylon.language.Integer s, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") ceylon.language.Integer i, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") ceylon.language.Integer l, 
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") ceylon.language.Float f, 
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") ceylon.language.Float d, 
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") ceylon.language.Boolean bool, 
    final @TypeInfo("ceylon.language::Character") @DocAnnotation$annotation$(description = "todo") ceylon.language.Character ch) {
    java.lang.Byte arg_0 = b.byteValue();
    java.lang.Short arg_1 = (short)s.longValue();
    java.lang.Integer arg_2 = (int)i.longValue();
    java.lang.Long arg_3 = l.longValue();
    java.lang.Float arg_4 = (float)f.doubleValue();
    java.lang.Double arg_5 = d.doubleValue();
    java.lang.Boolean arg_6 = bool.booleanValue();
    java.lang.Character arg_7 = (char)ch.intValue();
    delegate.methodWithBasicBoxedParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerBasicTypes(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Byte)") @DocAnnotation$annotation$(description = "todo") Callable<?> byteHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> shortHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> intHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> longHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Float)") @DocAnnotation$annotation$(description = "todo") Callable<?> floatHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Float)") @DocAnnotation$annotation$(description = "todo") Callable<?> doubleHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Boolean)") @DocAnnotation$annotation$(description = "todo") Callable<?> booleanHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Character)") @DocAnnotation$annotation$(description = "todo") Callable<?> charHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> stringHandler) {
    io.vertx.core.Handler<java.lang.Byte> arg_0 = new io.vertx.core.Handler<java.lang.Byte>() { public void handle(java.lang.Byte event) { byteHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Byte.convert(event)); } };
    io.vertx.core.Handler<java.lang.Short> arg_1 = new io.vertx.core.Handler<java.lang.Short>() { public void handle(java.lang.Short event) { shortHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Short.convert(event)); } };
    io.vertx.core.Handler<java.lang.Integer> arg_2 = new io.vertx.core.Handler<java.lang.Integer>() { public void handle(java.lang.Integer event) { intHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Integer.convert(event)); } };
    io.vertx.core.Handler<java.lang.Long> arg_3 = new io.vertx.core.Handler<java.lang.Long>() { public void handle(java.lang.Long event) { longHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Long.convert(event)); } };
    io.vertx.core.Handler<java.lang.Float> arg_4 = new io.vertx.core.Handler<java.lang.Float>() { public void handle(java.lang.Float event) { floatHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Float.convert(event)); } };
    io.vertx.core.Handler<java.lang.Double> arg_5 = new io.vertx.core.Handler<java.lang.Double>() { public void handle(java.lang.Double event) { doubleHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Double.convert(event)); } };
    io.vertx.core.Handler<java.lang.Boolean> arg_6 = new io.vertx.core.Handler<java.lang.Boolean>() { public void handle(java.lang.Boolean event) { booleanHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Boolean.convert(event)); } };
    io.vertx.core.Handler<java.lang.Character> arg_7 = new io.vertx.core.Handler<java.lang.Character>() { public void handle(java.lang.Character event) { charHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Character.convert(event)); } };
    io.vertx.core.Handler<java.lang.String> arg_8 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { stringHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    delegate.methodWithHandlerBasicTypes(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultByte(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Byte)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Byte>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Byte>(handler) { public Object toCeylon(java.lang.Byte event) { return io.vertx.lang.ceylon.ToCeylon.Byte.convert(event); } };
    delegate.methodWithHandlerAsyncResultByte(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultShort(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Short>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Short>(handler) { public Object toCeylon(java.lang.Short event) { return io.vertx.lang.ceylon.ToCeylon.Short.convert(event); } };
    delegate.methodWithHandlerAsyncResultShort(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultInteger(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Integer>(handler) { public Object toCeylon(java.lang.Integer event) { return io.vertx.lang.ceylon.ToCeylon.Integer.convert(event); } };
    delegate.methodWithHandlerAsyncResultInteger(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultLong(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(handler) { public Object toCeylon(java.lang.Long event) { return io.vertx.lang.ceylon.ToCeylon.Long.convert(event); } };
    delegate.methodWithHandlerAsyncResultLong(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultFloat(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Float)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Float>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Float>(handler) { public Object toCeylon(java.lang.Float event) { return io.vertx.lang.ceylon.ToCeylon.Float.convert(event); } };
    delegate.methodWithHandlerAsyncResultFloat(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultDouble(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Float)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Double>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Double>(handler) { public Object toCeylon(java.lang.Double event) { return io.vertx.lang.ceylon.ToCeylon.Double.convert(event); } };
    delegate.methodWithHandlerAsyncResultDouble(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultBoolean(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(handler) { public Object toCeylon(java.lang.Boolean event) { return io.vertx.lang.ceylon.ToCeylon.Boolean.convert(event); } };
    delegate.methodWithHandlerAsyncResultBoolean(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultCharacter(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Character)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Character>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Character>(handler) { public Object toCeylon(java.lang.Character event) { return io.vertx.lang.ceylon.ToCeylon.Character.convert(event); } };
    delegate.methodWithHandlerAsyncResultCharacter(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultString(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) { public Object toCeylon(java.lang.String event) { return io.vertx.lang.ceylon.ToCeylon.String.convert(event); } };
    delegate.methodWithHandlerAsyncResultString(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultDataObject(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.codegen.testmodel::TestDataObject)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.TestDataObject>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.TestDataObject>(handler) { public Object toCeylon(io.vertx.codegen.testmodel.TestDataObject event) { return io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_().convert(event); } };
    delegate.methodWithHandlerAsyncResultDataObject(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithUserTypes(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @DocAnnotation$annotation$(description = "todo") RefedInterface1 refed) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA.convert(refed);
    delegate.methodWithUserTypes(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithObjectParam(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object obj) {
    java.lang.String arg_0 = str.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(obj);
    delegate.methodWithObjectParam(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithDataObjectParam(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::TestDataObject") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.codegen.testmodel.TestDataObject dataObject) {
    io.vertx.codegen.testmodel.TestDataObject arg_0 = dataObject == null ? null : new io.vertx.codegen.testmodel.TestDataObject(io.vertx.lang.ceylon.ToJava.JsonObject.convert(dataObject.toJson()));
    delegate.methodWithDataObjectParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListOfDataObjectsParam(
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> dataObjects) {
    java.util.List<io.vertx.codegen.testmodel.TestDataObject> arg_0 = io.vertx.lang.ceylon.ToJava.list(dataObjects, io.vertx.ceylon.codegen.testmodel.toJavaTestDataObject_.get_());
    delegate.methodWithListOfDataObjectsParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetOfDataObjectsParam(
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> dataObjects) {
    java.util.Set<io.vertx.codegen.testmodel.TestDataObject> arg_0 = io.vertx.lang.ceylon.ToJava.set(dataObjects, io.vertx.ceylon.codegen.testmodel.toJavaTestDataObject_.get_());
    delegate.methodWithSetOfDataObjectsParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullDataObjectParam(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::TestDataObject") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.codegen.testmodel.TestDataObject dataObject) {
    io.vertx.codegen.testmodel.TestDataObject arg_0 = dataObject == null ? null : new io.vertx.codegen.testmodel.TestDataObject(io.vertx.lang.ceylon.ToJava.JsonObject.convert(dataObject.toJson()));
    delegate.methodWithNullDataObjectParam(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithListParams(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> listString, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Byte>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Byte> listByte, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> listShort, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> listInt, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.Integer> listLong, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Object>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.json.Object> listJsonObject, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Array>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.json.Array> listJsonArray, 
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<RefedInterface1> listVertxGen, 
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> listDataObject) {
    java.util.List<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.list(listString, io.vertx.lang.ceylon.ToJava.String);
    java.util.List<java.lang.Byte> arg_1 = io.vertx.lang.ceylon.ToJava.list(listByte, io.vertx.lang.ceylon.ToJava.Byte);
    java.util.List<java.lang.Short> arg_2 = io.vertx.lang.ceylon.ToJava.list(listShort, io.vertx.lang.ceylon.ToJava.Short);
    java.util.List<java.lang.Integer> arg_3 = io.vertx.lang.ceylon.ToJava.list(listInt, io.vertx.lang.ceylon.ToJava.Integer);
    java.util.List<java.lang.Long> arg_4 = io.vertx.lang.ceylon.ToJava.list(listLong, io.vertx.lang.ceylon.ToJava.Long);
    java.util.List<io.vertx.core.json.JsonObject> arg_5 = io.vertx.lang.ceylon.ToJava.list(listJsonObject, io.vertx.lang.ceylon.ToJava.JsonObject);
    java.util.List<io.vertx.core.json.JsonArray> arg_6 = io.vertx.lang.ceylon.ToJava.list(listJsonArray, io.vertx.lang.ceylon.ToJava.JsonArray);
    java.util.List<io.vertx.codegen.testmodel.RefedInterface1> arg_7 = io.vertx.lang.ceylon.ToJava.list(listVertxGen, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    java.util.List<io.vertx.codegen.testmodel.TestDataObject> arg_8 = io.vertx.lang.ceylon.ToJava.list(listDataObject, io.vertx.ceylon.codegen.testmodel.toJavaTestDataObject_.get_());
    delegate.methodWithListParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetParams(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> setString, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Byte>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Byte> setByte, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> setShort, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> setInt, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.Integer> setLong, 
    final @TypeInfo("ceylon.language::Set<ceylon.json::Object>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.json.Object> setJsonObject, 
    final @TypeInfo("ceylon.language::Set<ceylon.json::Array>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.json.Array> setJsonArray, 
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<RefedInterface1> setVertxGen, 
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> setDataObject) {
    java.util.Set<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.set(setString, io.vertx.lang.ceylon.ToJava.String);
    java.util.Set<java.lang.Byte> arg_1 = io.vertx.lang.ceylon.ToJava.set(setByte, io.vertx.lang.ceylon.ToJava.Byte);
    java.util.Set<java.lang.Short> arg_2 = io.vertx.lang.ceylon.ToJava.set(setShort, io.vertx.lang.ceylon.ToJava.Short);
    java.util.Set<java.lang.Integer> arg_3 = io.vertx.lang.ceylon.ToJava.set(setInt, io.vertx.lang.ceylon.ToJava.Integer);
    java.util.Set<java.lang.Long> arg_4 = io.vertx.lang.ceylon.ToJava.set(setLong, io.vertx.lang.ceylon.ToJava.Long);
    java.util.Set<io.vertx.core.json.JsonObject> arg_5 = io.vertx.lang.ceylon.ToJava.set(setJsonObject, io.vertx.lang.ceylon.ToJava.JsonObject);
    java.util.Set<io.vertx.core.json.JsonArray> arg_6 = io.vertx.lang.ceylon.ToJava.set(setJsonArray, io.vertx.lang.ceylon.ToJava.JsonArray);
    java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> arg_7 = io.vertx.lang.ceylon.ToJava.set(setVertxGen, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    java.util.Set<io.vertx.codegen.testmodel.TestDataObject> arg_8 = io.vertx.lang.ceylon.ToJava.set(setDataObject, io.vertx.ceylon.codegen.testmodel.toJavaTestDataObject_.get_());
    delegate.methodWithSetParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapParams(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.String> mapString, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> mapByte, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> mapShort, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> mapInt, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> mapLong, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.json.Object> mapJsonObject, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,ceylon.json.Array> mapJsonArray, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,io.vertx.ceylon.codegen.testmodel::RefedInterface1>") @DocAnnotation$annotation$(description = "todo") ceylon.language.Map<ceylon.language.String,RefedInterface1> mapVertxGen) {
    java.util.Map<java.lang.String,java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.map(mapString, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.String);
    java.util.Map<java.lang.String,java.lang.Byte> arg_1 = io.vertx.lang.ceylon.ToJava.map(mapByte, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Byte);
    java.util.Map<java.lang.String,java.lang.Short> arg_2 = io.vertx.lang.ceylon.ToJava.map(mapShort, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Short);
    java.util.Map<java.lang.String,java.lang.Integer> arg_3 = io.vertx.lang.ceylon.ToJava.map(mapInt, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Integer);
    java.util.Map<java.lang.String,java.lang.Long> arg_4 = io.vertx.lang.ceylon.ToJava.map(mapLong, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.Long);
    java.util.Map<java.lang.String,io.vertx.core.json.JsonObject> arg_5 = io.vertx.lang.ceylon.ToJava.map(mapJsonObject, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.JsonObject);
    java.util.Map<java.lang.String,io.vertx.core.json.JsonArray> arg_6 = io.vertx.lang.ceylon.ToJava.map(mapJsonArray, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.JsonArray);
    java.util.Map<java.lang.String,io.vertx.codegen.testmodel.RefedInterface1> arg_7 = io.vertx.lang.ceylon.ToJava.map(mapVertxGen, io.vertx.lang.ceylon.ToJava.String, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA);
    delegate.methodWithMapParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListAndSet(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::String>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listStringHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Integer>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listIntHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::String>)") @DocAnnotation$annotation$(description = "todo") Callable<?> setStringHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Integer>)") @DocAnnotation$annotation$(description = "todo") Callable<?> setIntHandler) {
    io.vertx.core.Handler<java.util.List<java.lang.String>> arg_0 = new io.vertx.core.Handler<java.util.List<java.lang.String>>() { public void handle(java.util.List<java.lang.String> event) { listStringHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String)); } };
    io.vertx.core.Handler<java.util.List<java.lang.Integer>> arg_1 = new io.vertx.core.Handler<java.util.List<java.lang.Integer>>() { public void handle(java.util.List<java.lang.Integer> event) { listIntHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer)); } };
    io.vertx.core.Handler<java.util.Set<java.lang.String>> arg_2 = new io.vertx.core.Handler<java.util.Set<java.lang.String>>() { public void handle(java.util.Set<java.lang.String> event) { setStringHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String)); } };
    io.vertx.core.Handler<java.util.Set<java.lang.Integer>> arg_3 = new io.vertx.core.Handler<java.util.Set<java.lang.Integer>>() { public void handle(java.util.Set<java.lang.Integer> event) { setIntHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer)); } };
    delegate.methodWithHandlerListAndSet(arg_0, arg_1, arg_2, arg_3);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListString(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) { public Object toCeylon(java.util.List<java.lang.String> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String); } };
    delegate.methodWithHandlerAsyncResultListString(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListInteger(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Integer>>(handler) { public Object toCeylon(java.util.List<java.lang.Integer> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer); } };
    delegate.methodWithHandlerAsyncResultListInteger(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetString(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::String>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.String>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.String>>(handler) { public Object toCeylon(java.util.Set<java.lang.String> event) { return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String); } };
    delegate.methodWithHandlerAsyncResultSetString(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetInteger(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Integer>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Integer>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Integer>>(handler) { public Object toCeylon(java.util.Set<java.lang.Integer> event) { return io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer); } };
    delegate.methodWithHandlerAsyncResultSetInteger(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>() { public void handle(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON)); } };
    delegate.methodWithHandlerListVertxGen(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>() { public void handle(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON)); } };
    delegate.methodWithHandlerSetVertxGen(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface2>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>() { public void handle(java.util.List<io.vertx.codegen.testmodel.RefedInterface2> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface2.TO_CEYLON)); } };
    delegate.methodWithHandlerListAbstractVertxGen(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface2>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>() { public void handle(java.util.Set<io.vertx.codegen.testmodel.RefedInterface2> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface2.TO_CEYLON)); } };
    delegate.methodWithHandlerSetAbstractVertxGen(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() { public void handle(java.util.List<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject)); } };
    delegate.methodWithHandlerListJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() { public void handle(java.util.List<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject)); } };
    delegate.methodWithHandlerListNullJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() { public void handle(java.util.List<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject)); } };
    delegate.methodWithHandlerListComplexJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() { public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject)); } };
    delegate.methodWithHandlerSetJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() { public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject)); } };
    delegate.methodWithHandlerSetNullJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() { public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject)); } };
    delegate.methodWithHandlerSetComplexJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() { public void handle(java.util.List<io.vertx.core.json.JsonArray> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray)); } };
    delegate.methodWithHandlerListJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() { public void handle(java.util.List<io.vertx.core.json.JsonArray> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray)); } };
    delegate.methodWithHandlerListNullJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() { public void handle(java.util.List<io.vertx.core.json.JsonArray> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray)); } };
    delegate.methodWithHandlerListComplexJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() { public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray)); } };
    delegate.methodWithHandlerSetJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() { public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray)); } };
    delegate.methodWithHandlerSetNullJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() { public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) { setHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray)); } };
    delegate.methodWithHandlerSetComplexJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>() { public void handle(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_())); } };
    delegate.methodWithHandlerListDataObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>() { public void handle(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) { listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_())); } };
    delegate.methodWithHandlerListNullDataObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>)") @DocAnnotation$annotation$(description = "todo") Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>() { public void handle(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) { setHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_())); } };
    delegate.methodWithHandlerSetDataObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>)") @DocAnnotation$annotation$(description = "todo") Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>() { public void handle(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) { setHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_())); } };
    delegate.methodWithHandlerSetNullDataObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) { return io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON); } };
    delegate.methodWithHandlerAsyncResultListVertxGen(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) { return io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON); } };
    delegate.methodWithHandlerAsyncResultSetVertxGen(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface2>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.RefedInterface2> event) { return io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface2.TO_CEYLON); } };
    delegate.methodWithHandlerAsyncResultListAbstractVertxGen(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface2>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.RefedInterface2> event) { return io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.RefedInterface2.TO_CEYLON); } };
    delegate.methodWithHandlerAsyncResultSetAbstractVertxGen(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject); } };
    delegate.methodWithHandlerAsyncResultListJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject); } };
    delegate.methodWithHandlerAsyncResultListNullJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject); } };
    delegate.methodWithHandlerAsyncResultListComplexJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) { return io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject); } };
    delegate.methodWithHandlerAsyncResultSetJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) { return io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject); } };
    delegate.methodWithHandlerAsyncResultSetNullJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Object>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) { return io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject); } };
    delegate.methodWithHandlerAsyncResultSetComplexJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray); } };
    delegate.methodWithHandlerAsyncResultListJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray); } };
    delegate.methodWithHandlerAsyncResultListNullJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray); } };
    delegate.methodWithHandlerAsyncResultListComplexJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) { return io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray); } };
    delegate.methodWithHandlerAsyncResultSetJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) { return io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray); } };
    delegate.methodWithHandlerAsyncResultSetNullJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Array>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) { return io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray); } };
    delegate.methodWithHandlerAsyncResultSetComplexJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) { return io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_()); } };
    delegate.methodWithHandlerAsyncResultListDataObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>)") @DocAnnotation$annotation$(description = "todo") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) { return io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_()); } };
    delegate.methodWithHandlerAsyncResultListNullDataObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>)") @DocAnnotation$annotation$(description = "todo") Callable<?> setHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>(setHandler) { public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) { return io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_()); } };
    delegate.methodWithHandlerAsyncResultSetDataObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>)") @DocAnnotation$annotation$(description = "todo") Callable<?> setHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>(setHandler) { public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) { return io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_()); } };
    delegate.methodWithHandlerAsyncResultSetNullDataObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerUserTypes(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.codegen.testmodel::RefedInterface1)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1> arg_0 = new io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1>() { public void handle(io.vertx.codegen.testmodel.RefedInterface1 event) { handler.$call$((Object)io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON.convert(event)); } };
    delegate.methodWithHandlerUserTypes(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultUserTypes(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.codegen.testmodel::RefedInterface1)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.RefedInterface1>(handler) { public Object toCeylon(io.vertx.codegen.testmodel.RefedInterface1 event) { return io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON.convert(event); } };
    delegate.methodWithHandlerAsyncResultUserTypes(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithConcreteHandlerUserTypeSubtype(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::ConcreteHandlerUserType") @DocAnnotation$annotation$(description = "todo") ConcreteHandlerUserType handler) {
    io.vertx.codegen.testmodel.ConcreteHandlerUserType arg_0 = io.vertx.ceylon.codegen.testmodel.ConcreteHandlerUserType.TO_JAVA.convert(handler);
    delegate.methodWithConcreteHandlerUserTypeSubtype(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithAbstractHandlerUserTypeSubtype(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::AbstractHandlerUserType") @DocAnnotation$annotation$(description = "todo") AbstractHandlerUserType handler) {
    io.vertx.codegen.testmodel.AbstractHandlerUserType arg_0 = io.vertx.ceylon.codegen.testmodel.AbstractHandlerUserType.TO_JAVA.convert(handler);
    delegate.methodWithAbstractHandlerUserTypeSubtype(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithConcreteHandlerUserTypeSubtypeExtension(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::ConcreteHandlerUserTypeExtension") @DocAnnotation$annotation$(description = "todo") ConcreteHandlerUserTypeExtension handler) {
    io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension arg_0 = io.vertx.ceylon.codegen.testmodel.ConcreteHandlerUserTypeExtension.TO_JAVA.convert(handler);
    delegate.methodWithConcreteHandlerUserTypeSubtypeExtension(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerVoid(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$(); } };
    delegate.methodWithHandlerVoid(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultVoid(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.methodWithHandlerAsyncResultVoid(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerThrowable(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    delegate.methodWithHandlerThrowable(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerDataObject(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.codegen.testmodel::TestDataObject)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.TestDataObject> arg_0 = new io.vertx.core.Handler<io.vertx.codegen.testmodel.TestDataObject>() { public void handle(io.vertx.codegen.testmodel.TestDataObject event) { handler.$call$((Object)io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_().convert(event)); } };
    delegate.methodWithHandlerDataObject(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithHandlerGenericUserType(
    final @TypeInfo("U") @DocAnnotation$annotation$(description = "todo") U value, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.codegen.testmodel::GenericRefedInterface<U>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(value);
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>> arg_1 = new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>() { public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) { handler.$call$((Object)io.vertx.ceylon.codegen.testmodel.GenericRefedInterface.TO_CEYLON.convert(event)); } };
    delegate.methodWithHandlerGenericUserType(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithHandlerAsyncResultGenericUserType(
    final @TypeInfo("U") @DocAnnotation$annotation$(description = "todo") U value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.codegen.testmodel::GenericRefedInterface<U>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(value);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>(handler) { public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) { return io.vertx.ceylon.codegen.testmodel.GenericRefedInterface.TO_CEYLON.convert(event); } };
    delegate.methodWithHandlerAsyncResultGenericUserType(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Byte")
  public byte methodWithByteReturn() {
    byte ret = delegate.methodWithByteReturn();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long methodWithShortReturn() {
    long ret = delegate.methodWithShortReturn();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long methodWithIntReturn() {
    long ret = delegate.methodWithIntReturn();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long methodWithLongReturn() {
    long ret = delegate.methodWithLongReturn();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Float")
  public double methodWithFloatReturn() {
    double ret = delegate.methodWithFloatReturn();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Float")
  public double methodWithDoubleReturn() {
    double ret = delegate.methodWithDoubleReturn();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithBooleanReturn() {
    boolean ret = delegate.methodWithBooleanReturn();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Character")
  public int methodWithCharReturn() {
    int ret = delegate.methodWithCharReturn();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithStringReturn() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.methodWithStringReturn());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1")
  public RefedInterface1 methodWithVertxGenReturn() {
    RefedInterface1 ret = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON.convert(delegate.methodWithVertxGenReturn());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1")
  public RefedInterface1 methodWithVertxGenNullReturn() {
    RefedInterface1 ret = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON.convert(delegate.methodWithVertxGenNullReturn());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface2")
  public RefedInterface2 methodWithAbstractVertxGenReturn() {
    RefedInterface2 ret = io.vertx.ceylon.codegen.testmodel.RefedInterface2.TO_CEYLON.convert(delegate.methodWithAbstractVertxGenReturn());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::TestDataObject")
  public io.vertx.ceylon.codegen.testmodel.TestDataObject methodWithDataObjectReturn() {
    io.vertx.ceylon.codegen.testmodel.TestDataObject ret = io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_().convert(delegate.methodWithDataObjectReturn());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::TestDataObject")
  public io.vertx.ceylon.codegen.testmodel.TestDataObject methodWithDataObjectNullReturn() {
    io.vertx.ceylon.codegen.testmodel.TestDataObject ret = io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_().convert(delegate.methodWithDataObjectNullReturn());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = str.toString();
    io.vertx.core.Handler<java.lang.String> arg_1 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.overloadedMethod(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @DocAnnotation$annotation$(description = "todo") RefedInterface1 refed) {
    java.lang.String arg_0 = str.toString();
    io.vertx.codegen.testmodel.RefedInterface1 arg_1 = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA.convert(refed);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.overloadedMethod(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @DocAnnotation$annotation$(description = "todo") RefedInterface1 refed, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = str.toString();
    io.vertx.codegen.testmodel.RefedInterface1 arg_1 = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA.convert(refed);
    io.vertx.core.Handler<java.lang.String> arg_2 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.overloadedMethod(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @DocAnnotation$annotation$(description = "todo") RefedInterface1 refed, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long period, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = str.toString();
    io.vertx.codegen.testmodel.RefedInterface1 arg_1 = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA.convert(refed);
    long arg_2 = period;
    io.vertx.core.Handler<java.lang.String> arg_3 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.overloadedMethod(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("U")
  public <U> U methodWithGenericReturn(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String type) {
    java.lang.String arg_0 = type.toString();
    U ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.methodWithGenericReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithGenericParam(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String type, 
    final @TypeInfo("U") @DocAnnotation$annotation$(description = "todo") U u) {
    java.lang.String arg_0 = type.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(u);
    delegate.methodWithGenericParam(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithGenericHandler(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String type, 
    final @TypeInfo("ceylon.language::Anything(U)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = type.toString();
    io.vertx.core.Handler<java.lang.Object> arg_1 = new io.vertx.core.Handler<java.lang.Object>() { public void handle(java.lang.Object event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(event)); } };
    delegate.methodWithGenericHandler(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithGenericHandlerAsyncResult(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String type, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|U)") @DocAnnotation$annotation$(description = "todo") Callable<?> asyncResultHandler) {
    java.lang.String arg_0 = type.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(asyncResultHandler) { public Object toCeylon(java.lang.Object event) { return io.vertx.lang.ceylon.ToCeylon.object(event); } };
    delegate.methodWithGenericHandlerAsyncResult(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::TestInterface")
  public TestInterface fluentMethod(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str) {
    java.lang.String arg_0 = str.toString();
    TestInterface ret = io.vertx.ceylon.codegen.testmodel.TestInterface.TO_CEYLON.convert(delegate.fluentMethod(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1")
  public static RefedInterface1 staticFactoryMethod(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String foo) {
    java.lang.String arg_0 = foo.toString();
    RefedInterface1 ret = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON.convert(io.vertx.codegen.testmodel.TestInterface.staticFactoryMethod(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1")
  public RefedInterface1 methodWithCachedReturn(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String foo) {
    java.lang.String arg_0 = foo.toString();
    RefedInterface1 ret = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON.convert(delegate.methodWithCachedReturn(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long methodWithCachedReturnPrimitive(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long arg) {
    int arg_0 = (int)arg;
    long ret = delegate.methodWithCachedReturnPrimitive(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object methodWithJsonObjectReturn() {
    ceylon.json.Object ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object methodWithNullJsonObjectReturn() {
    ceylon.json.Object ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object methodWithComplexJsonObjectReturn() {
    ceylon.json.Object ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Array")
  public ceylon.json.Array methodWithJsonArrayReturn() {
    ceylon.json.Array ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Array")
  public ceylon.json.Array methodWithNullJsonArrayReturn() {
    ceylon.json.Array ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Array")
  public ceylon.json.Array methodWithComplexJsonArrayReturn() {
    ceylon.json.Array ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithJsonParams(
    final @TypeInfo("ceylon.json::Object") @DocAnnotation$annotation$(description = "todo") ceylon.json.Object jsonObject, 
    final @TypeInfo("ceylon.json::Array") @DocAnnotation$annotation$(description = "todo") ceylon.json.Array jsonArray) {
    io.vertx.core.json.JsonObject arg_0 = null;
    io.vertx.core.json.JsonArray arg_1 = null;
    delegate.methodWithJsonParams(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullJsonParams(
    final @TypeInfo("ceylon.json::Object") @DocAnnotation$annotation$(description = "todo") ceylon.json.Object jsonObject, 
    final @TypeInfo("ceylon.json::Array") @DocAnnotation$annotation$(description = "todo") ceylon.json.Array jsonArray) {
    io.vertx.core.json.JsonObject arg_0 = null;
    io.vertx.core.json.JsonArray arg_1 = null;
    delegate.methodWithNullJsonParams(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerJson(
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Object)") @DocAnnotation$annotation$(description = "todo") Callable<?> jsonObjectHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Array)") @DocAnnotation$annotation$(description = "todo") Callable<?> jsonArrayHandler) {
    io.vertx.core.Handler<io.vertx.core.json.JsonObject> arg_0 = new io.vertx.core.Handler<io.vertx.core.json.JsonObject>() { public void handle(io.vertx.core.json.JsonObject event) { jsonObjectHandler.$call$((Object)null); } };
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_1 = new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() { public void handle(io.vertx.core.json.JsonArray event) { jsonArrayHandler.$call$((Object)null); } };
    delegate.methodWithHandlerJson(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerNullJson(
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Object)") @DocAnnotation$annotation$(description = "todo") Callable<?> jsonObjectHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Array)") @DocAnnotation$annotation$(description = "todo") Callable<?> jsonArrayHandler) {
    io.vertx.core.Handler<io.vertx.core.json.JsonObject> arg_0 = new io.vertx.core.Handler<io.vertx.core.json.JsonObject>() { public void handle(io.vertx.core.json.JsonObject event) { jsonObjectHandler.$call$((Object)null); } };
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_1 = new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() { public void handle(io.vertx.core.json.JsonArray event) { jsonArrayHandler.$call$((Object)null); } };
    delegate.methodWithHandlerNullJson(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerComplexJson(
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Object)") @DocAnnotation$annotation$(description = "todo") Callable<?> jsonObjectHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Array)") @DocAnnotation$annotation$(description = "todo") Callable<?> jsonArrayHandler) {
    io.vertx.core.Handler<io.vertx.core.json.JsonObject> arg_0 = new io.vertx.core.Handler<io.vertx.core.json.JsonObject>() { public void handle(io.vertx.core.json.JsonObject event) { jsonObjectHandler.$call$((Object)null); } };
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_1 = new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() { public void handle(io.vertx.core.json.JsonArray event) { jsonArrayHandler.$call$((Object)null); } };
    delegate.methodWithHandlerComplexJson(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonObject>(handler) { public Object toCeylon(io.vertx.core.json.JsonObject event) { return null; } };
    delegate.methodWithHandlerAsyncResultJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonObject>(handler) { public Object toCeylon(io.vertx.core.json.JsonObject event) { return null; } };
    delegate.methodWithHandlerAsyncResultNullJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonObject>(handler) { public Object toCeylon(io.vertx.core.json.JsonObject event) { return null; } };
    delegate.methodWithHandlerAsyncResultComplexJsonObject(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonArray>(handler) { public Object toCeylon(io.vertx.core.json.JsonArray event) { return null; } };
    delegate.methodWithHandlerAsyncResultJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonArray>(handler) { public Object toCeylon(io.vertx.core.json.JsonArray event) { return null; } };
    delegate.methodWithHandlerAsyncResultNullJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonArray>(handler) { public Object toCeylon(io.vertx.core.json.JsonArray event) { return null; } };
    delegate.methodWithHandlerAsyncResultComplexJsonArray(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> methodWithMapReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, delegate.methodWithMapReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> methodWithMapStringReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, delegate.methodWithMapStringReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithMapLongReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithMapLongReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithMapIntegerReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithMapIntegerReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Integer);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> methodWithMapShortReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithMapShortReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Short);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> methodWithMapByteReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Byte.$TypeDescriptor$, delegate.methodWithMapByteReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Byte);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Character>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Character> methodWithMapCharacterReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Character> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Character.$TypeDescriptor$, delegate.methodWithMapCharacterReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Character);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> methodWithMapBooleanReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Boolean> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Boolean.$TypeDescriptor$, delegate.methodWithMapBooleanReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Boolean);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Float> methodWithMapFloatReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, delegate.methodWithMapFloatReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Float);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.Float> methodWithMapDoubleReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.language.Float> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.Float.$TypeDescriptor$, delegate.methodWithMapDoubleReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.Double);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object>")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Object> methodWithMapJsonObjectReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Object.$TypeDescriptor$, delegate.methodWithMapJsonObjectReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object>")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Object> methodWithMapComplexJsonObjectReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Object.$TypeDescriptor$, delegate.methodWithMapComplexJsonObjectReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array>")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Array> methodWithMapJsonArrayReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, delegate.methodWithMapJsonArrayReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array>")
  public ceylon.language.Map<ceylon.language.String,ceylon.json.Array> methodWithMapComplexJsonArrayReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.convert(event)); } };
    ceylon.language.Map<ceylon.language.String,ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, delegate.methodWithMapComplexJsonArrayReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> methodWithNullMapReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.map(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, delegate.methodWithNullMapReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> methodWithListStringReturn() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, delegate.methodWithListStringReturn(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::Integer>")
  public ceylon.language.List<ceylon.language.Integer> methodWithListLongReturn() {
    ceylon.language.List<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithListLongReturn(), io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>")
  public ceylon.language.List<RefedInterface1> methodWithListVertxGenReturn() {
    ceylon.language.List<RefedInterface1> ret = io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, delegate.methodWithListVertxGenReturn(), io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Object>")
  public ceylon.language.List<ceylon.json.Object> methodWithListJsonObjectReturn() {
    ceylon.language.List<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithListJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Object>")
  public ceylon.language.List<ceylon.json.Object> methodWithListComplexJsonObjectReturn() {
    ceylon.language.List<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithListComplexJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Array>")
  public ceylon.language.List<ceylon.json.Array> methodWithListJsonArrayReturn() {
    ceylon.language.List<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithListJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Array>")
  public ceylon.language.List<ceylon.json.Array> methodWithListComplexJsonArrayReturn() {
    ceylon.language.List<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithListComplexJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::TestDataObject>")
  public ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> methodWithListDataObjectReturn() {
    ceylon.language.List<io.vertx.ceylon.codegen.testmodel.TestDataObject> ret = io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, delegate.methodWithListDataObjectReturn(), io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> methodWithNullListReturn() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, delegate.methodWithNullListReturn(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> methodWithSetStringReturn() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, delegate.methodWithSetStringReturn(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::Integer>")
  public ceylon.language.Set<ceylon.language.Integer> methodWithSetLongReturn() {
    ceylon.language.Set<ceylon.language.Integer> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.Integer.$TypeDescriptor$, delegate.methodWithSetLongReturn(), io.vertx.lang.ceylon.ToCeylon.Long);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>")
  public ceylon.language.Set<RefedInterface1> methodWithSetVertxGenReturn() {
    ceylon.language.Set<RefedInterface1> ret = io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.RefedInterface1.$TypeDescriptor$, delegate.methodWithSetVertxGenReturn(), io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_CEYLON);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.json::Object>")
  public ceylon.language.Set<ceylon.json.Object> methodWithSetJsonObjectReturn() {
    ceylon.language.Set<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithSetJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.json::Object>")
  public ceylon.language.Set<ceylon.json.Object> methodWithSetComplexJsonObjectReturn() {
    ceylon.language.Set<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Object.$TypeDescriptor$, delegate.methodWithSetComplexJsonObjectReturn(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.json::Array>")
  public ceylon.language.Set<ceylon.json.Array> methodWithSetJsonArrayReturn() {
    ceylon.language.Set<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithSetJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.json::Array>")
  public ceylon.language.Set<ceylon.json.Array> methodWithSetComplexJsonArrayReturn() {
    ceylon.language.Set<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.json.Array.$TypeDescriptor$, delegate.methodWithSetComplexJsonArrayReturn(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::TestDataObject>")
  public ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> methodWithSetDataObjectReturn() {
    ceylon.language.Set<io.vertx.ceylon.codegen.testmodel.TestDataObject> ret = io.vertx.lang.ceylon.ToCeylon.set(io.vertx.ceylon.codegen.testmodel.TestDataObject.$TypeDescriptor$, delegate.methodWithSetDataObjectReturn(), io.vertx.ceylon.codegen.testmodel.toCeylonTestDataObject_.get_());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> methodWithNullSetReturn() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, delegate.methodWithNullSetReturn(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithEnumParam(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String strVal, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String weirdo) {
    java.lang.String arg_0 = strVal.toString();
    io.vertx.codegen.testmodel.TestEnum arg_1 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.methodWithEnumParam(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithEnumReturn(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String strVal) {
    java.lang.String arg_0 = strVal.toString();
    ceylon.language.String ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Throwable")
  public Throwable methodWithThrowableReturn(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String strVal) {
    java.lang.String arg_0 = strVal.toString();
    Throwable ret = delegate.methodWithThrowableReturn(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithThrowableParam(
    final @TypeInfo("ceylon.language::Throwable") @DocAnnotation$annotation$(description = "todo") Throwable t) {
    java.lang.Throwable arg_0 = null;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.methodWithThrowableParam(arg_0));
    return ret;
  }

}
