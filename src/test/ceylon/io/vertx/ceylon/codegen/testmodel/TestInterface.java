package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.codegen.testmodel.TestEnum;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import java.util.Set;
import io.vertx.core.json.JsonArray;
import java.util.List;
import io.vertx.core.Handler;

public class TestInterface implements SuperInterface2 {

  private final io.vertx.codegen.testmodel.TestInterface delegate;

  public TestInterface(io.vertx.codegen.testmodel.TestInterface delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Anything")
  public void otherSuperMethodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") byte b, 
    final @TypeInfo("ceylon.language::Integer") long s, 
    final @TypeInfo("ceylon.language::Integer") long i, 
    final @TypeInfo("ceylon.language::Integer") long l, 
    final @TypeInfo("ceylon.language::Float") double f, 
    final @TypeInfo("ceylon.language::Float") double d, 
    final @TypeInfo("ceylon.language::Boolean") boolean bool, 
    final @TypeInfo("ceylon.language::Character") int ch, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String str) {
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

  @TypeInfo("ceylon.language::Anything")
  public void methodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") byte b, 
    final @TypeInfo("ceylon.language::Integer") long s, 
    final @TypeInfo("ceylon.language::Integer") long i, 
    final @TypeInfo("ceylon.language::Integer") long l, 
    final @TypeInfo("ceylon.language::Float") double f, 
    final @TypeInfo("ceylon.language::Float") double d, 
    final @TypeInfo("ceylon.language::Boolean") boolean bool, 
    final @TypeInfo("ceylon.language::Character") int ch, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String str) {
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

  @TypeInfo("ceylon.language::Anything")
  public void methodWithBasicBoxedParams(
    final @TypeInfo("ceylon.language::Byte") ceylon.language.Byte b, 
    final @TypeInfo("ceylon.language::Integer") ceylon.language.Integer s, 
    final @TypeInfo("ceylon.language::Integer") ceylon.language.Integer i, 
    final @TypeInfo("ceylon.language::Integer") ceylon.language.Integer l, 
    final @TypeInfo("ceylon.language::Float") ceylon.language.Float f, 
    final @TypeInfo("ceylon.language::Float") ceylon.language.Float d, 
    final @TypeInfo("ceylon.language::Boolean") ceylon.language.Boolean bool, 
    final @TypeInfo("ceylon.language::Character") ceylon.language.Character ch) {
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

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerBasicTypes(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Byte)") Callable<?> byteHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") Callable<?> shortHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") Callable<?> intHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") Callable<?> longHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Float)") Callable<?> floatHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Float)") Callable<?> doubleHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Boolean)") Callable<?> booleanHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Character)") Callable<?> charHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> stringHandler) {
    io.vertx.core.Handler<java.lang.Byte> arg_0 = new io.vertx.core.Handler<java.lang.Byte>() { public void handle(java.lang.Byte event) { byteHandler.$call$((Object)ceylon.language.Byte.instance(event)); } };
    io.vertx.core.Handler<java.lang.Short> arg_1 = new io.vertx.core.Handler<java.lang.Short>() { public void handle(java.lang.Short event) { shortHandler.$call$((Object)ceylon.language.Integer.instance((long)(short)event)); } };
    io.vertx.core.Handler<java.lang.Integer> arg_2 = new io.vertx.core.Handler<java.lang.Integer>() { public void handle(java.lang.Integer event) { intHandler.$call$((Object)ceylon.language.Integer.instance((long)(int)event)); } };
    io.vertx.core.Handler<java.lang.Long> arg_3 = new io.vertx.core.Handler<java.lang.Long>() { public void handle(java.lang.Long event) { longHandler.$call$((Object)ceylon.language.Integer.instance(event)); } };
    io.vertx.core.Handler<java.lang.Float> arg_4 = new io.vertx.core.Handler<java.lang.Float>() { public void handle(java.lang.Float event) { floatHandler.$call$((Object)ceylon.language.Float.instance((float)event)); } };
    io.vertx.core.Handler<java.lang.Double> arg_5 = new io.vertx.core.Handler<java.lang.Double>() { public void handle(java.lang.Double event) { doubleHandler.$call$((Object)ceylon.language.Float.instance(event)); } };
    io.vertx.core.Handler<java.lang.Boolean> arg_6 = new io.vertx.core.Handler<java.lang.Boolean>() { public void handle(java.lang.Boolean event) { booleanHandler.$call$((Object)ceylon.language.Boolean.instance(event)); } };
    io.vertx.core.Handler<java.lang.Character> arg_7 = new io.vertx.core.Handler<java.lang.Character>() { public void handle(java.lang.Character event) { charHandler.$call$((Object)ceylon.language.Character.instance(event)); } };
    io.vertx.core.Handler<java.lang.String> arg_8 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { stringHandler.$call$((Object)new ceylon.language.String(event)); } };
    delegate.methodWithHandlerBasicTypes(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultByte(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Byte)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Byte>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Byte>(handler) { public Object toCeylon(java.lang.Byte event) { return ceylon.language.Byte.instance(event); } };
    delegate.methodWithHandlerAsyncResultByte(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultShort(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Short>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Short>(handler) { public Object toCeylon(java.lang.Short event) { return ceylon.language.Integer.instance((long)(short)event); } };
    delegate.methodWithHandlerAsyncResultShort(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultInteger(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Integer>(handler) { public Object toCeylon(java.lang.Integer event) { return ceylon.language.Integer.instance((long)(int)event); } };
    delegate.methodWithHandlerAsyncResultInteger(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultLong(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(handler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.methodWithHandlerAsyncResultLong(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultFloat(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Float)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Float>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Float>(handler) { public Object toCeylon(java.lang.Float event) { return ceylon.language.Float.instance((float)event); } };
    delegate.methodWithHandlerAsyncResultFloat(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultDouble(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Float)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Double>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Double>(handler) { public Object toCeylon(java.lang.Double event) { return ceylon.language.Float.instance(event); } };
    delegate.methodWithHandlerAsyncResultDouble(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultBoolean(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(handler) { public Object toCeylon(java.lang.Boolean event) { return ceylon.language.Boolean.instance(event); } };
    delegate.methodWithHandlerAsyncResultBoolean(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultCharacter(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Character)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Character>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Character>(handler) { public Object toCeylon(java.lang.Character event) { return ceylon.language.Character.instance(event); } };
    delegate.methodWithHandlerAsyncResultCharacter(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultString(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) { public Object toCeylon(java.lang.String event) { return new ceylon.language.String(event); } };
    delegate.methodWithHandlerAsyncResultString(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultDataObject(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Object)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.TestDataObject>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.TestDataObject>(handler) { public Object toCeylon(io.vertx.codegen.testmodel.TestDataObject event) { return null; } };
    delegate.methodWithHandlerAsyncResultDataObject(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithUserTypes(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") RefedInterface1 refed) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = (io.vertx.codegen.testmodel.RefedInterface1)refed.getDelegate();
    delegate.methodWithUserTypes(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithObjectParam(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Object") Object obj) {
    java.lang.String arg_0 = str.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(obj);
    delegate.methodWithObjectParam(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithDataObjectParam(
    final @TypeInfo("ceylon.language::Object") Object dataObject) {
    io.vertx.codegen.testmodel.TestDataObject arg_0 = null;
    delegate.methodWithDataObjectParam(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullDataObjectParam(
    final @TypeInfo("ceylon.language::Object") Object dataObject) {
    io.vertx.codegen.testmodel.TestDataObject arg_0 = null;
    delegate.methodWithNullDataObjectParam(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithListParams(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") List<ceylon.language.String> listString, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Byte>") List<ceylon.language.Byte> listByte, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") List<ceylon.language.Integer> listShort, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") List<ceylon.language.Integer> listInt, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") List<ceylon.language.Integer> listLong, 
    final @TypeInfo("ceylon.language::List<ceylon.language::JsonObject>") List<JsonObject> listJsonObject, 
    final @TypeInfo("ceylon.language::List<ceylon.language::JsonArray>") List<JsonArray> listJsonArray, 
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>") List<RefedInterface1> listVertxGen, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Object>") List<Object> listDataObject) {
    java.util.List<java.lang.String> arg_0 = null;
    java.util.List<java.lang.Byte> arg_1 = null;
    java.util.List<java.lang.Short> arg_2 = null;
    java.util.List<java.lang.Integer> arg_3 = null;
    java.util.List<java.lang.Long> arg_4 = null;
    java.util.List<io.vertx.core.json.JsonObject> arg_5 = null;
    java.util.List<io.vertx.core.json.JsonArray> arg_6 = null;
    java.util.List<io.vertx.codegen.testmodel.RefedInterface1> arg_7 = null;
    java.util.List<io.vertx.codegen.testmodel.TestDataObject> arg_8 = null;
    delegate.methodWithListParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetParams(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") Set<ceylon.language.String> setString, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Byte>") Set<ceylon.language.Byte> setByte, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") Set<ceylon.language.Integer> setShort, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") Set<ceylon.language.Integer> setInt, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") Set<ceylon.language.Integer> setLong, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::JsonObject>") Set<JsonObject> setJsonObject, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::JsonArray>") Set<JsonArray> setJsonArray, 
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>") Set<RefedInterface1> setVertxGen, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Object>") Set<Object> setDataObject) {
    java.util.Set<java.lang.String> arg_0 = null;
    java.util.Set<java.lang.Byte> arg_1 = null;
    java.util.Set<java.lang.Short> arg_2 = null;
    java.util.Set<java.lang.Integer> arg_3 = null;
    java.util.Set<java.lang.Long> arg_4 = null;
    java.util.Set<io.vertx.core.json.JsonObject> arg_5 = null;
    java.util.Set<io.vertx.core.json.JsonArray> arg_6 = null;
    java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> arg_7 = null;
    java.util.Set<io.vertx.codegen.testmodel.TestDataObject> arg_8 = null;
    delegate.methodWithSetParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithMapParams(
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>") Map<ceylon.language.String,ceylon.language.String> mapString, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>") Map<ceylon.language.String,ceylon.language.Byte> mapByte, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") Map<ceylon.language.String,ceylon.language.Integer> mapShort, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") Map<ceylon.language.String,ceylon.language.Integer> mapInt, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") Map<ceylon.language.String,ceylon.language.Integer> mapLong, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::JsonObject>") Map<ceylon.language.String,JsonObject> mapJsonObject, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::JsonArray>") Map<ceylon.language.String,JsonArray> mapJsonArray, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,io.vertx.ceylon.codegen.testmodel::RefedInterface1>") Map<ceylon.language.String,RefedInterface1> mapVertxGen) {
    java.util.Map<java.lang.String,java.lang.String> arg_0 = null;
    java.util.Map<java.lang.String,java.lang.Byte> arg_1 = null;
    java.util.Map<java.lang.String,java.lang.Short> arg_2 = null;
    java.util.Map<java.lang.String,java.lang.Integer> arg_3 = null;
    java.util.Map<java.lang.String,java.lang.Long> arg_4 = null;
    java.util.Map<java.lang.String,io.vertx.core.json.JsonObject> arg_5 = null;
    java.util.Map<java.lang.String,io.vertx.core.json.JsonArray> arg_6 = null;
    java.util.Map<java.lang.String,io.vertx.codegen.testmodel.RefedInterface1> arg_7 = null;
    delegate.methodWithMapParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListAndSet(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::String>)") Callable<?> listStringHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Integer>)") Callable<?> listIntHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::String>)") Callable<?> setStringHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Integer>)") Callable<?> setIntHandler) {
    io.vertx.core.Handler<java.util.List<java.lang.String>> arg_0 = new io.vertx.core.Handler<java.util.List<java.lang.String>>() { public void handle(java.util.List<java.lang.String> event) { listStringHandler.$call$((Object)null); } };
    io.vertx.core.Handler<java.util.List<java.lang.Integer>> arg_1 = new io.vertx.core.Handler<java.util.List<java.lang.Integer>>() { public void handle(java.util.List<java.lang.Integer> event) { listIntHandler.$call$((Object)null); } };
    io.vertx.core.Handler<java.util.Set<java.lang.String>> arg_2 = new io.vertx.core.Handler<java.util.Set<java.lang.String>>() { public void handle(java.util.Set<java.lang.String> event) { setStringHandler.$call$((Object)null); } };
    io.vertx.core.Handler<java.util.Set<java.lang.Integer>> arg_3 = new io.vertx.core.Handler<java.util.Set<java.lang.Integer>>() { public void handle(java.util.Set<java.lang.Integer> event) { setIntHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListAndSet(arg_0, arg_1, arg_2, arg_3);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListString(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) { public Object toCeylon(java.util.List<java.lang.String> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListString(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListInteger(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer>)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Integer>>(handler) { public Object toCeylon(java.util.List<java.lang.Integer> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListInteger(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetString(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::String>)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.String>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.String>>(handler) { public Object toCeylon(java.util.Set<java.lang.String> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetString(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetInteger(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Integer>)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Integer>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Integer>>(handler) { public Object toCeylon(java.util.Set<java.lang.Integer> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetInteger(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>() { public void handle(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>() { public void handle(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerSetVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface2>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>() { public void handle(java.util.List<io.vertx.codegen.testmodel.RefedInterface2> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface2>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>() { public void handle(java.util.Set<io.vertx.codegen.testmodel.RefedInterface2> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerSetAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() { public void handle(java.util.List<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() { public void handle(java.util.List<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListNullJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() { public void handle(java.util.List<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() { public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerSetJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() { public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerSetNullJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() { public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerSetComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() { public void handle(java.util.List<io.vertx.core.json.JsonArray> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() { public void handle(java.util.List<io.vertx.core.json.JsonArray> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListNullJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() { public void handle(java.util.List<io.vertx.core.json.JsonArray> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() { public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerSetJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() { public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerSetNullJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::JsonArray>)") Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() { public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) { setHandler.$call$((Object)null); } };
    delegate.methodWithHandlerSetComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Object>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>() { public void handle(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Object>)") Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>() { public void handle(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) { listHandler.$call$((Object)null); } };
    delegate.methodWithHandlerListNullDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Object>)") Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>() { public void handle(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) { setHandler.$call$((Object)null); } };
    delegate.methodWithHandlerSetDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Object>)") Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>() { public void handle(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) { setHandler.$call$((Object)null); } };
    delegate.methodWithHandlerSetNullDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface2>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.RefedInterface2> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface2>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.RefedInterface2> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListNullJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetNullJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::JsonObject>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListNullJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetNullJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::JsonArray>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) { public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Object>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Object>)") Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>(listHandler) { public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) { return null; } };
    delegate.methodWithHandlerAsyncResultListNullDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Object>)") Callable<?> setHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>(setHandler) { public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Object>)") Callable<?> setHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>(setHandler) { public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) { return null; } };
    delegate.methodWithHandlerAsyncResultSetNullDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerUserTypes(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.codegen.testmodel::RefedInterface1)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1> arg_0 = new io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1>() { public void handle(io.vertx.codegen.testmodel.RefedInterface1 event) { handler.$call$((Object)new io.vertx.ceylon.codegen.testmodel.RefedInterface1(event)); } };
    delegate.methodWithHandlerUserTypes(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultUserTypes(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.codegen.testmodel::RefedInterface1)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.RefedInterface1>(handler) { public Object toCeylon(io.vertx.codegen.testmodel.RefedInterface1 event) { return new io.vertx.ceylon.codegen.testmodel.RefedInterface1(event); } };
    delegate.methodWithHandlerAsyncResultUserTypes(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithConcreteHandlerUserTypeSubtype(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::ConcreteHandlerUserType") ConcreteHandlerUserType handler) {
    io.vertx.codegen.testmodel.ConcreteHandlerUserType arg_0 = (io.vertx.codegen.testmodel.ConcreteHandlerUserType)handler.getDelegate();
    delegate.methodWithConcreteHandlerUserTypeSubtype(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithAbstractHandlerUserTypeSubtype(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::AbstractHandlerUserType") AbstractHandlerUserType handler) {
    io.vertx.codegen.testmodel.AbstractHandlerUserType arg_0 = (io.vertx.codegen.testmodel.AbstractHandlerUserType)handler.getDelegate();
    delegate.methodWithAbstractHandlerUserTypeSubtype(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithConcreteHandlerUserTypeSubtypeExtension(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::ConcreteHandlerUserTypeExtension") ConcreteHandlerUserTypeExtension handler) {
    io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension arg_0 = (io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension)handler.getDelegate();
    delegate.methodWithConcreteHandlerUserTypeSubtypeExtension(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerVoid(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    delegate.methodWithHandlerVoid(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultVoid(
    final @TypeInfo("ceylon.language::Boolean") boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.methodWithHandlerAsyncResultVoid(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerThrowable(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    delegate.methodWithHandlerThrowable(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Object)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.TestDataObject> arg_0 = new io.vertx.core.Handler<io.vertx.codegen.testmodel.TestDataObject>() { public void handle(io.vertx.codegen.testmodel.TestDataObject event) { handler.$call$((Object)null); } };
    delegate.methodWithHandlerDataObject(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithHandlerGenericUserType(
    final @TypeInfo("U") U value, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.codegen.testmodel::GenericRefedInterface<U>)") Callable<?> handler) {
    java.lang.Object arg_0 = null;
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>> arg_1 = new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>() { public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) { handler.$call$((Object)new io.vertx.ceylon.codegen.testmodel.GenericRefedInterface(event)); } };
    delegate.methodWithHandlerGenericUserType(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithHandlerAsyncResultGenericUserType(
    final @TypeInfo("U") U value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.codegen.testmodel::GenericRefedInterface<U>)") Callable<?> handler) {
    java.lang.Object arg_0 = null;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>(handler) { public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) { return new io.vertx.ceylon.codegen.testmodel.GenericRefedInterface(event); } };
    delegate.methodWithHandlerAsyncResultGenericUserType(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Byte")
  public byte methodWithByteReturn() {
    byte ret = delegate.methodWithByteReturn();
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long methodWithShortReturn() {
    long ret = delegate.methodWithShortReturn();
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long methodWithIntReturn() {
    long ret = delegate.methodWithIntReturn();
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long methodWithLongReturn() {
    long ret = delegate.methodWithLongReturn();
    return ret;
  }

  @TypeInfo("ceylon.language::Float")
  public double methodWithFloatReturn() {
    double ret = delegate.methodWithFloatReturn();
    return ret;
  }

  @TypeInfo("ceylon.language::Float")
  public double methodWithDoubleReturn() {
    double ret = delegate.methodWithDoubleReturn();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean methodWithBooleanReturn() {
    boolean ret = delegate.methodWithBooleanReturn();
    return ret;
  }

  @TypeInfo("ceylon.language::Character")
  public int methodWithCharReturn() {
    int ret = delegate.methodWithCharReturn();
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithStringReturn() {
    ceylon.language.String ret = new ceylon.language.String(delegate.methodWithStringReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1")
  public RefedInterface1 methodWithVertxGenReturn() {
    RefedInterface1 ret = new io.vertx.ceylon.codegen.testmodel.RefedInterface1(delegate.methodWithVertxGenReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1")
  public RefedInterface1 methodWithVertxGenNullReturn() {
    RefedInterface1 ret = new io.vertx.ceylon.codegen.testmodel.RefedInterface1(delegate.methodWithVertxGenNullReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface2")
  public RefedInterface2 methodWithAbstractVertxGenReturn() {
    RefedInterface2 ret = new io.vertx.ceylon.codegen.testmodel.RefedInterface2.Impl(delegate.methodWithAbstractVertxGenReturn());
    return ret;
  }

  @TypeInfo("ceylon.language::Object")
  public Object methodWithDataObjectReturn() {
    Object ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Object")
  public Object methodWithDataObjectNullReturn() {
    Object ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    java.lang.String arg_0 = str.toString();
    io.vertx.core.Handler<java.lang.String> arg_1 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    ceylon.language.String ret = new ceylon.language.String(delegate.overloadedMethod(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str, 
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") RefedInterface1 refed) {
    java.lang.String arg_0 = str.toString();
    io.vertx.codegen.testmodel.RefedInterface1 arg_1 = (io.vertx.codegen.testmodel.RefedInterface1)refed.getDelegate();
    ceylon.language.String ret = new ceylon.language.String(delegate.overloadedMethod(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str, 
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") RefedInterface1 refed, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    java.lang.String arg_0 = str.toString();
    io.vertx.codegen.testmodel.RefedInterface1 arg_1 = (io.vertx.codegen.testmodel.RefedInterface1)refed.getDelegate();
    io.vertx.core.Handler<java.lang.String> arg_2 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    ceylon.language.String ret = new ceylon.language.String(delegate.overloadedMethod(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str, 
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") RefedInterface1 refed, 
    final @TypeInfo("ceylon.language::Integer") long period, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    java.lang.String arg_0 = str.toString();
    io.vertx.codegen.testmodel.RefedInterface1 arg_1 = (io.vertx.codegen.testmodel.RefedInterface1)refed.getDelegate();
    long arg_2 = period;
    io.vertx.core.Handler<java.lang.String> arg_3 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    ceylon.language.String ret = new ceylon.language.String(delegate.overloadedMethod(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("U")
  public <U> U methodWithGenericReturn(
    final @TypeInfo("ceylon.language::String") ceylon.language.String type) {
    java.lang.String arg_0 = type.toString();
    U ret = null;
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithGenericParam(
    final @TypeInfo("ceylon.language::String") ceylon.language.String type, 
    final @TypeInfo("U") U u) {
    java.lang.String arg_0 = type.toString();
    java.lang.Object arg_1 = null;
    delegate.methodWithGenericParam(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithGenericHandler(
    final @TypeInfo("ceylon.language::String") ceylon.language.String type, 
    final @TypeInfo("ceylon.language::Anything(U)") Callable<?> handler) {
    java.lang.String arg_0 = type.toString();
    io.vertx.core.Handler<java.lang.Object> arg_1 = new io.vertx.core.Handler<java.lang.Object>() { public void handle(java.lang.Object event) { handler.$call$((Object)null); } };
    delegate.methodWithGenericHandler(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithGenericHandlerAsyncResult(
    final @TypeInfo("ceylon.language::String") ceylon.language.String type, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|U)") Callable<?> asyncResultHandler) {
    java.lang.String arg_0 = type.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(asyncResultHandler) { public Object toCeylon(java.lang.Object event) { return null; } };
    delegate.methodWithGenericHandlerAsyncResult(arg_0, arg_1);
  }

  @TypeInfo("io.vertx.ceylon.codegen.testmodel::TestInterface")
  public TestInterface fluentMethod(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str) {
    java.lang.String arg_0 = str.toString();
    TestInterface ret = new io.vertx.ceylon.codegen.testmodel.TestInterface(delegate.fluentMethod(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1")
  public static RefedInterface1 staticFactoryMethod(
    final @TypeInfo("ceylon.language::String") ceylon.language.String foo) {
    java.lang.String arg_0 = foo.toString();
    RefedInterface1 ret = new io.vertx.ceylon.codegen.testmodel.RefedInterface1(io.vertx.codegen.testmodel.TestInterface.staticFactoryMethod(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1")
  public RefedInterface1 methodWithCachedReturn(
    final @TypeInfo("ceylon.language::String") ceylon.language.String foo) {
    java.lang.String arg_0 = foo.toString();
    RefedInterface1 ret = new io.vertx.ceylon.codegen.testmodel.RefedInterface1(delegate.methodWithCachedReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long methodWithCachedReturnPrimitive(
    final @TypeInfo("ceylon.language::Integer") long arg) {
    int arg_0 = (int)arg;
    long ret = delegate.methodWithCachedReturnPrimitive(arg_0);
    return ret;
  }

  @TypeInfo("ceylon.language::JsonObject")
  public JsonObject methodWithJsonObjectReturn() {
    JsonObject ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::JsonObject")
  public JsonObject methodWithNullJsonObjectReturn() {
    JsonObject ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::JsonObject")
  public JsonObject methodWithComplexJsonObjectReturn() {
    JsonObject ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::JsonArray")
  public JsonArray methodWithJsonArrayReturn() {
    JsonArray ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::JsonArray")
  public JsonArray methodWithNullJsonArrayReturn() {
    JsonArray ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::JsonArray")
  public JsonArray methodWithComplexJsonArrayReturn() {
    JsonArray ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithJsonParams(
    final @TypeInfo("ceylon.language::JsonObject") JsonObject jsonObject, 
    final @TypeInfo("ceylon.language::JsonArray") JsonArray jsonArray) {
    io.vertx.core.json.JsonObject arg_0 = null;
    io.vertx.core.json.JsonArray arg_1 = null;
    delegate.methodWithJsonParams(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullJsonParams(
    final @TypeInfo("ceylon.language::JsonObject") JsonObject jsonObject, 
    final @TypeInfo("ceylon.language::JsonArray") JsonArray jsonArray) {
    io.vertx.core.json.JsonObject arg_0 = null;
    io.vertx.core.json.JsonArray arg_1 = null;
    delegate.methodWithNullJsonParams(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerJson(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::JsonObject)") Callable<?> jsonObjectHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::JsonArray)") Callable<?> jsonArrayHandler) {
    io.vertx.core.Handler<io.vertx.core.json.JsonObject> arg_0 = new io.vertx.core.Handler<io.vertx.core.json.JsonObject>() { public void handle(io.vertx.core.json.JsonObject event) { jsonObjectHandler.$call$((Object)null); } };
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_1 = new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() { public void handle(io.vertx.core.json.JsonArray event) { jsonArrayHandler.$call$((Object)null); } };
    delegate.methodWithHandlerJson(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerNullJson(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::JsonObject)") Callable<?> jsonObjectHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::JsonArray)") Callable<?> jsonArrayHandler) {
    io.vertx.core.Handler<io.vertx.core.json.JsonObject> arg_0 = new io.vertx.core.Handler<io.vertx.core.json.JsonObject>() { public void handle(io.vertx.core.json.JsonObject event) { jsonObjectHandler.$call$((Object)null); } };
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_1 = new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() { public void handle(io.vertx.core.json.JsonArray event) { jsonArrayHandler.$call$((Object)null); } };
    delegate.methodWithHandlerNullJson(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerComplexJson(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::JsonObject)") Callable<?> jsonObjectHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::JsonArray)") Callable<?> jsonArrayHandler) {
    io.vertx.core.Handler<io.vertx.core.json.JsonObject> arg_0 = new io.vertx.core.Handler<io.vertx.core.json.JsonObject>() { public void handle(io.vertx.core.json.JsonObject event) { jsonObjectHandler.$call$((Object)null); } };
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_1 = new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() { public void handle(io.vertx.core.json.JsonArray event) { jsonArrayHandler.$call$((Object)null); } };
    delegate.methodWithHandlerComplexJson(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::JsonObject)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonObject>(handler) { public Object toCeylon(io.vertx.core.json.JsonObject event) { return null; } };
    delegate.methodWithHandlerAsyncResultJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::JsonObject)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonObject>(handler) { public Object toCeylon(io.vertx.core.json.JsonObject event) { return null; } };
    delegate.methodWithHandlerAsyncResultNullJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::JsonObject)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonObject>(handler) { public Object toCeylon(io.vertx.core.json.JsonObject event) { return null; } };
    delegate.methodWithHandlerAsyncResultComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::JsonArray)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonArray>(handler) { public Object toCeylon(io.vertx.core.json.JsonArray event) { return null; } };
    delegate.methodWithHandlerAsyncResultJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::JsonArray)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonArray>(handler) { public Object toCeylon(io.vertx.core.json.JsonArray event) { return null; } };
    delegate.methodWithHandlerAsyncResultNullJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::JsonArray)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonArray>(handler) { public Object toCeylon(io.vertx.core.json.JsonArray event) { return null; } };
    delegate.methodWithHandlerAsyncResultComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public Map<ceylon.language.String,ceylon.language.String> methodWithMapReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public Map<ceylon.language.String,ceylon.language.String> methodWithMapStringReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>")
  public Map<ceylon.language.String,ceylon.language.Integer> methodWithMapLongReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,ceylon.language.Integer> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>")
  public Map<ceylon.language.String,ceylon.language.Integer> methodWithMapIntegerReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,ceylon.language.Integer> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>")
  public Map<ceylon.language.String,ceylon.language.Integer> methodWithMapShortReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,ceylon.language.Integer> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>")
  public Map<ceylon.language.String,ceylon.language.Byte> methodWithMapByteReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,ceylon.language.Byte> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Character>")
  public Map<ceylon.language.String,ceylon.language.Character> methodWithMapCharacterReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,ceylon.language.Character> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Boolean>")
  public Map<ceylon.language.String,ceylon.language.Boolean> methodWithMapBooleanReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,ceylon.language.Boolean> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>")
  public Map<ceylon.language.String,ceylon.language.Float> methodWithMapFloatReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,ceylon.language.Float> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Float>")
  public Map<ceylon.language.String,ceylon.language.Float> methodWithMapDoubleReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,ceylon.language.Float> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::JsonObject>")
  public Map<ceylon.language.String,JsonObject> methodWithMapJsonObjectReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,JsonObject> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::JsonObject>")
  public Map<ceylon.language.String,JsonObject> methodWithMapComplexJsonObjectReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,JsonObject> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::JsonArray>")
  public Map<ceylon.language.String,JsonArray> methodWithMapJsonArrayReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,JsonArray> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::JsonArray>")
  public Map<ceylon.language.String,JsonArray> methodWithMapComplexJsonArrayReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = new io.vertx.core.Handler<java.lang.String>() { public void handle(java.lang.String event) { handler.$call$((Object)new ceylon.language.String(event)); } };
    Map<ceylon.language.String,JsonArray> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public Map<ceylon.language.String,ceylon.language.String> methodWithNullMapReturn() {
    Map<ceylon.language.String,ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public List<ceylon.language.String> methodWithListStringReturn() {
    List<ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::Integer>")
  public List<ceylon.language.Integer> methodWithListLongReturn() {
    List<ceylon.language.Integer> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::List<io.vertx.ceylon.codegen.testmodel::RefedInterface1>")
  public List<RefedInterface1> methodWithListVertxGenReturn() {
    List<RefedInterface1> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::JsonObject>")
  public List<JsonObject> methodWithListJsonObjectReturn() {
    List<JsonObject> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::JsonObject>")
  public List<JsonObject> methodWithListComplexJsonObjectReturn() {
    List<JsonObject> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::JsonArray>")
  public List<JsonArray> methodWithListJsonArrayReturn() {
    List<JsonArray> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::JsonArray>")
  public List<JsonArray> methodWithListComplexJsonArrayReturn() {
    List<JsonArray> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::Object>")
  public List<Object> methodWithListDataObjectReturn() {
    List<Object> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public List<ceylon.language.String> methodWithNullListReturn() {
    List<ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public Set<ceylon.language.String> methodWithSetStringReturn() {
    Set<ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::Integer>")
  public Set<ceylon.language.Integer> methodWithSetLongReturn() {
    Set<ceylon.language.Integer> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Set<io.vertx.ceylon.codegen.testmodel::RefedInterface1>")
  public Set<RefedInterface1> methodWithSetVertxGenReturn() {
    Set<RefedInterface1> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::JsonObject>")
  public Set<JsonObject> methodWithSetJsonObjectReturn() {
    Set<JsonObject> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::JsonObject>")
  public Set<JsonObject> methodWithSetComplexJsonObjectReturn() {
    Set<JsonObject> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::JsonArray>")
  public Set<JsonArray> methodWithSetJsonArrayReturn() {
    Set<JsonArray> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::JsonArray>")
  public Set<JsonArray> methodWithSetComplexJsonArrayReturn() {
    Set<JsonArray> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::Object>")
  public Set<Object> methodWithSetDataObjectReturn() {
    Set<Object> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public Set<ceylon.language.String> methodWithNullSetReturn() {
    Set<ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithEnumParam(
    final @TypeInfo("ceylon.language::String") ceylon.language.String strVal, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String weirdo) {
    java.lang.String arg_0 = strVal.toString();
    io.vertx.codegen.testmodel.TestEnum arg_1 = null;
    ceylon.language.String ret = new ceylon.language.String(delegate.methodWithEnumParam(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithEnumReturn(
    final @TypeInfo("ceylon.language::String") ceylon.language.String strVal) {
    java.lang.String arg_0 = strVal.toString();
    ceylon.language.String ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Throwable")
  public Throwable methodWithThrowableReturn(
    final @TypeInfo("ceylon.language::String") ceylon.language.String strVal) {
    java.lang.String arg_0 = strVal.toString();
    Throwable ret = delegate.methodWithThrowableReturn(arg_0);
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithThrowableParam(
    final @TypeInfo("ceylon.language::Throwable") Throwable t) {
    java.lang.Throwable arg_0 = null;
    ceylon.language.String ret = new ceylon.language.String(delegate.methodWithThrowableParam(arg_0));
    return ret;
  }

}
