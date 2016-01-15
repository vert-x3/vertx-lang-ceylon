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
import io.vertx.codegen.testmodel.TestEnum;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import java.util.Set;
import io.vertx.core.json.JsonArray;
import java.util.List;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " @author <a href=\"http://tfox.org\">Tim Fox</a>\n")
public class TestInterface extends io.vertx.ceylon.testmodel.SuperInterface1 implements ReifiedType,  SuperInterface2 {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.TestInterface, TestInterface> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.TestInterface, TestInterface>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.TestInterface, TestInterface> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.TestInterface, TestInterface>() {
        public TestInterface convert(io.vertx.codegen.testmodel.TestInterface src) {
          return new TestInterface(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<TestInterface, io.vertx.codegen.testmodel.TestInterface> TO_JAVA = new io.vertx.lang.ceylon.Converter<TestInterface, io.vertx.codegen.testmodel.TestInterface>() {
    public io.vertx.codegen.testmodel.TestInterface convert(TestInterface src) {
      return src.delegate;
    }
  };

  @Ignore private RefedInterface1 cached_methodWithCachedReturn;
  @Ignore private java.lang.Long cached_methodWithCachedReturnPrimitive;
  @Ignore private ceylon.language.List<RefedInterface1> cached_methodWithCachedListReturn;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(TestInterface.class);
  @Ignore private final io.vertx.codegen.testmodel.TestInterface delegate;

  public TestInterface(io.vertx.codegen.testmodel.TestInterface delegate) {
    super(delegate);
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
  public void otherSuperMethodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") @Name("b")  byte b, 
    final @TypeInfo("ceylon.language::Integer") @Name("s")  long s, 
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i, 
    final @TypeInfo("ceylon.language::Integer") @Name("l")  long l, 
    final @TypeInfo("ceylon.language::Float") @Name("f")  double f, 
    final @TypeInfo("ceylon.language::Float") @Name("d")  double d, 
    final @TypeInfo("ceylon.language::Boolean") @Name("bool")  boolean bool, 
    final @TypeInfo("ceylon.language::Character") @Name("ch")  int ch, 
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str) {
    byte arg_0 = b;
    short arg_1 = (short)s;
    int arg_2 = (int)i;
    long arg_3 = l;
    float arg_4 = (float)f;
    double arg_5 = d;
    boolean arg_6 = bool;
    char arg_7 = (char)ch;
    java.lang.String arg_8 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    delegate.otherSuperMethodWithBasicParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") @Name("b")  byte b, 
    final @TypeInfo("ceylon.language::Integer") @Name("s")  long s, 
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i, 
    final @TypeInfo("ceylon.language::Integer") @Name("l")  long l, 
    final @TypeInfo("ceylon.language::Float") @Name("f")  double f, 
    final @TypeInfo("ceylon.language::Float") @Name("d")  double d, 
    final @TypeInfo("ceylon.language::Boolean") @Name("bool")  boolean bool, 
    final @TypeInfo("ceylon.language::Character") @Name("ch")  int ch, 
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str) {
    byte arg_0 = b;
    short arg_1 = (short)s;
    int arg_2 = (int)i;
    long arg_3 = l;
    float arg_4 = (float)f;
    double arg_5 = d;
    boolean arg_6 = bool;
    char arg_7 = (char)ch;
    java.lang.String arg_8 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    delegate.methodWithBasicParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithBasicBoxedParams(
    final @TypeInfo("ceylon.language::Byte") @Name("b")  ceylon.language.Byte b, 
    final @TypeInfo("ceylon.language::Integer") @Name("s")  ceylon.language.Integer s, 
    final @TypeInfo("ceylon.language::Integer") @Name("i")  ceylon.language.Integer i, 
    final @TypeInfo("ceylon.language::Integer") @Name("l")  ceylon.language.Integer l, 
    final @TypeInfo("ceylon.language::Float") @Name("f")  ceylon.language.Float f, 
    final @TypeInfo("ceylon.language::Float") @Name("d")  ceylon.language.Float d, 
    final @TypeInfo("ceylon.language::Boolean") @Name("bool")  ceylon.language.Boolean bool, 
    final @TypeInfo("ceylon.language::Character") @Name("ch")  ceylon.language.Character ch) {
    java.lang.Byte arg_0 = io.vertx.lang.ceylon.ToJava.Byte.safeConvert(b);
    java.lang.Short arg_1 = io.vertx.lang.ceylon.ToJava.Short.safeConvert(s);
    java.lang.Integer arg_2 = io.vertx.lang.ceylon.ToJava.Integer.safeConvert(i);
    java.lang.Long arg_3 = io.vertx.lang.ceylon.ToJava.Long.safeConvert(l);
    java.lang.Float arg_4 = io.vertx.lang.ceylon.ToJava.Float.safeConvert(f);
    java.lang.Double arg_5 = io.vertx.lang.ceylon.ToJava.Double.safeConvert(d);
    java.lang.Boolean arg_6 = io.vertx.lang.ceylon.ToJava.Boolean.safeConvert(bool);
    java.lang.Character arg_7 = io.vertx.lang.ceylon.ToJava.Character.safeConvert(ch);
    delegate.methodWithBasicBoxedParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerBasicTypes(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Byte)") @Name("byteHandler")  Callable<?> byteHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @Name("shortHandler")  Callable<?> shortHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @Name("intHandler")  Callable<?> intHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @Name("longHandler")  Callable<?> longHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Float)") @Name("floatHandler")  Callable<?> floatHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Float)") @Name("doubleHandler")  Callable<?> doubleHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Boolean)") @Name("booleanHandler")  Callable<?> booleanHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Character)") @Name("charHandler")  Callable<?> charHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("stringHandler")  Callable<?> stringHandler) {
    io.vertx.core.Handler<java.lang.Byte> arg_0 = byteHandler == null ? null : new io.vertx.core.Handler<java.lang.Byte>() {
      public void handle(java.lang.Byte event) {
        byteHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Byte.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Short> arg_1 = shortHandler == null ? null : new io.vertx.core.Handler<java.lang.Short>() {
      public void handle(java.lang.Short event) {
        shortHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Short.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Integer> arg_2 = intHandler == null ? null : new io.vertx.core.Handler<java.lang.Integer>() {
      public void handle(java.lang.Integer event) {
        intHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Long> arg_3 = longHandler == null ? null : new io.vertx.core.Handler<java.lang.Long>() {
      public void handle(java.lang.Long event) {
        longHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Float> arg_4 = floatHandler == null ? null : new io.vertx.core.Handler<java.lang.Float>() {
      public void handle(java.lang.Float event) {
        floatHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Float.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Double> arg_5 = doubleHandler == null ? null : new io.vertx.core.Handler<java.lang.Double>() {
      public void handle(java.lang.Double event) {
        doubleHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Double.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Boolean> arg_6 = booleanHandler == null ? null : new io.vertx.core.Handler<java.lang.Boolean>() {
      public void handle(java.lang.Boolean event) {
        booleanHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Character> arg_7 = charHandler == null ? null : new io.vertx.core.Handler<java.lang.Character>() {
      public void handle(java.lang.Character event) {
        charHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Character.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.String> arg_8 = stringHandler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        stringHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    delegate.methodWithHandlerBasicTypes(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

  @TypeInfo("ceylon.language::Anything(ceylon.language::String)")
  public Callable<?> methodWithHandlerStringReturn(
    final @TypeInfo("ceylon.language::String") @Name("expected")  ceylon.language.String expected) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(expected);
    Callable<?> ret = new io.vertx.lang.ceylon.HandlerCallable(io.vertx.lang.ceylon.ToJava.String, delegate.methodWithHandlerStringReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything(T?)")
  public <T> Callable<?> methodWithHandlerGenericReturn(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(T?)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Object> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Object>() {
      public void handle(java.lang.Object event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(event));
      }
    };
    Callable<?> ret = new io.vertx.lang.ceylon.HandlerCallable(io.vertx.lang.ceylon.ToJava.Object, delegate.methodWithHandlerGenericReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultByte(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Byte)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Byte>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Byte>(handler) {
      public Object toCeylon(java.lang.Byte event) {
        return io.vertx.lang.ceylon.ToCeylon.Byte.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultByte(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultShort(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Short>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Short>(handler) {
      public Object toCeylon(java.lang.Short event) {
        return io.vertx.lang.ceylon.ToCeylon.Short.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultShort(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultInteger(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Integer>(handler) {
      public Object toCeylon(java.lang.Integer event) {
        return io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultInteger(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultLong(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(handler) {
      public Object toCeylon(java.lang.Long event) {
        return io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultLong(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultFloat(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Float)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Float>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Float>(handler) {
      public Object toCeylon(java.lang.Float event) {
        return io.vertx.lang.ceylon.ToCeylon.Float.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultFloat(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultDouble(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Float)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Double>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Double>(handler) {
      public Object toCeylon(java.lang.Double event) {
        return io.vertx.lang.ceylon.ToCeylon.Double.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultDouble(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultBoolean(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(handler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultBoolean(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultCharacter(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Character)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Character>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Character>(handler) {
      public Object toCeylon(java.lang.Character event) {
        return io.vertx.lang.ceylon.ToCeylon.Character.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultCharacter(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultString(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultString(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultDataObject(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::TestDataObject)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.TestDataObject>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.TestDataObject>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.TestDataObject event) {
        return io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon().safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultDataObject(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)")
  public Callable<?> methodWithHandlerAsyncResultStringReturn(
    final @TypeInfo("ceylon.language::String") @Name("expected")  ceylon.language.String expected, 
    final @TypeInfo("ceylon.language::Boolean") @Name("fail")  boolean fail) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(expected);
    boolean arg_1 = fail;
    Callable<?> ret = new io.vertx.lang.ceylon.AsyncResultHandlerCallable(io.vertx.lang.ceylon.ToJava.String, delegate.methodWithHandlerAsyncResultStringReturn(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)")
  public <T> Callable<?> methodWithHandlerAsyncResultGenericReturn(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(handler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    Callable<?> ret = new io.vertx.lang.ceylon.AsyncResultHandlerCallable(io.vertx.lang.ceylon.ToJava.Object, delegate.methodWithHandlerAsyncResultGenericReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithUserTypes(
    final @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1") @Name("refed")  RefedInterface1 refed) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA.safeConvert(refed);
    delegate.methodWithUserTypes(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithObjectParam(
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Object?") @Name("obj")  Object obj) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(obj);
    delegate.methodWithObjectParam(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithDataObjectParam(
    final @TypeInfo("io.vertx.ceylon.testmodel::TestDataObject") @Name("dataObject")  io.vertx.ceylon.testmodel.TestDataObject dataObject) {
    io.vertx.codegen.testmodel.TestDataObject arg_0 = dataObject == null ? null : new io.vertx.codegen.testmodel.TestDataObject(io.vertx.lang.ceylon.ToJava.JsonObject.convert(dataObject.toJson()));
    delegate.methodWithDataObjectParam(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithListOfDataObjectsParam(
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.testmodel::TestDataObject>") @Name("dataObjects")  ceylon.language.List<io.vertx.ceylon.testmodel.TestDataObject> dataObjects) {
    java.util.List<io.vertx.codegen.testmodel.TestDataObject> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(dataObjects, io.vertx.ceylon.testmodel.testDataObject_.get_().getToJava());
    delegate.methodWithListOfDataObjectsParam(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithSetOfDataObjectsParam(
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.testmodel::TestDataObject>") @Name("dataObjects")  ceylon.language.Set<io.vertx.ceylon.testmodel.TestDataObject> dataObjects) {
    java.util.Set<io.vertx.codegen.testmodel.TestDataObject> arg_0 = io.vertx.lang.ceylon.ToJava.convertSet(dataObjects, io.vertx.ceylon.testmodel.testDataObject_.get_().getToJava());
    delegate.methodWithSetOfDataObjectsParam(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullDataObjectParam(
    final @TypeInfo("io.vertx.ceylon.testmodel::TestDataObject?") @Name("dataObject")  io.vertx.ceylon.testmodel.TestDataObject dataObject) {
    io.vertx.codegen.testmodel.TestDataObject arg_0 = dataObject == null ? null : new io.vertx.codegen.testmodel.TestDataObject(io.vertx.lang.ceylon.ToJava.JsonObject.convert(dataObject.toJson()));
    delegate.methodWithNullDataObjectParam(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithListParams(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @Name("listString")  ceylon.language.List<ceylon.language.String> listString, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Byte>") @Name("listByte")  ceylon.language.List<ceylon.language.Byte> listByte, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @Name("listShort")  ceylon.language.List<ceylon.language.Integer> listShort, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @Name("listInt")  ceylon.language.List<ceylon.language.Integer> listInt, 
    final @TypeInfo("ceylon.language::List<ceylon.language::Integer>") @Name("listLong")  ceylon.language.List<ceylon.language.Integer> listLong, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Object>") @Name("listJsonObject")  ceylon.language.List<ceylon.json.Object> listJsonObject, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Array>") @Name("listJsonArray")  ceylon.language.List<ceylon.json.Array> listJsonArray, 
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface1>") @Name("listVertxGen")  ceylon.language.List<RefedInterface1> listVertxGen, 
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.testmodel::TestDataObject>") @Name("listDataObject")  ceylon.language.List<io.vertx.ceylon.testmodel.TestDataObject> listDataObject, 
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @Name("listEnum")  ceylon.language.List<ceylon.language.String> listEnum) {
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
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("setString")  ceylon.language.Set<ceylon.language.String> setString, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Byte>") @Name("setByte")  ceylon.language.Set<ceylon.language.Byte> setByte, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @Name("setShort")  ceylon.language.Set<ceylon.language.Integer> setShort, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @Name("setInt")  ceylon.language.Set<ceylon.language.Integer> setInt, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::Integer>") @Name("setLong")  ceylon.language.Set<ceylon.language.Integer> setLong, 
    final @TypeInfo("ceylon.language::Set<ceylon.json::Object>") @Name("setJsonObject")  ceylon.language.Set<ceylon.json.Object> setJsonObject, 
    final @TypeInfo("ceylon.language::Set<ceylon.json::Array>") @Name("setJsonArray")  ceylon.language.Set<ceylon.json.Array> setJsonArray, 
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface1>") @Name("setVertxGen")  ceylon.language.Set<RefedInterface1> setVertxGen, 
    final @TypeInfo("ceylon.language::Set<io.vertx.ceylon.testmodel::TestDataObject>") @Name("setDataObject")  ceylon.language.Set<io.vertx.ceylon.testmodel.TestDataObject> setDataObject, 
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("setEnum")  ceylon.language.Set<ceylon.language.String> setEnum) {
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
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>") @Name("mapString")  ceylon.language.Map<ceylon.language.String,ceylon.language.String> mapString, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Byte>") @Name("mapByte")  ceylon.language.Map<ceylon.language.String,ceylon.language.Byte> mapByte, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @Name("mapShort")  ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> mapShort, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @Name("mapInt")  ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> mapInt, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::Integer>") @Name("mapLong")  ceylon.language.Map<ceylon.language.String,ceylon.language.Integer> mapLong, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Object>") @Name("mapJsonObject")  ceylon.language.Map<ceylon.language.String,ceylon.json.Object> mapJsonObject, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.json::Array>") @Name("mapJsonArray")  ceylon.language.Map<ceylon.language.String,ceylon.json.Array> mapJsonArray, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,io.vertx.ceylon.testmodel::RefedInterface1>") @Name("mapVertxGen")  ceylon.language.Map<ceylon.language.String,RefedInterface1> mapVertxGen) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::String>)") @Name("listStringHandler")  Callable<?> listStringHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::Integer>)") @Name("listIntHandler")  Callable<?> listIntHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::String>)") @Name("setStringHandler")  Callable<?> setStringHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::Integer>)") @Name("setIntHandler")  Callable<?> setIntHandler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    delegate.methodWithHandlerAsyncResultListString(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListInteger(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer>)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    delegate.methodWithHandlerAsyncResultListInteger(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetString(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::String>)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.String>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.String>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    delegate.methodWithHandlerAsyncResultSetString(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetInteger(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::Integer>)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<java.lang.Integer>>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.Set<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    delegate.methodWithHandlerAsyncResultSetInteger(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter()));
      }
    };
    delegate.methodWithHandlerListVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter()));
      }
    };
    delegate.methodWithHandlerSetVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface2>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.RefedInterface2> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface2.TO_CEYLON.converter()));
      }
    };
    delegate.methodWithHandlerListAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface2>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.RefedInterface2> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface2.TO_CEYLON.converter()));
      }
    };
    delegate.methodWithHandlerSetAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithHandlerListJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithHandlerListNullJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithHandlerListComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithHandlerSetJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithHandlerSetNullJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonObject>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject));
      }
    };
    delegate.methodWithHandlerSetComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonArray> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithHandlerListJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonArray> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithHandlerListNullJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.List<io.vertx.core.json.JsonArray> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithHandlerListComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithHandlerSetJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithHandlerSetNullJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.json::Array>)") @Name("setHandler")  Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>> arg_0 = setHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.core.json.JsonArray>>() {
      public void handle(java.util.Set<io.vertx.core.json.JsonArray> event) {
        setHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray));
      }
    };
    delegate.methodWithHandlerSetComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon()));
      }
    };
    delegate.methodWithHandlerListDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon()));
      }
    };
    delegate.methodWithHandlerListNullDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("setHandler")  Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = setHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) {
        setHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon()));
      }
    };
    delegate.methodWithHandlerSetDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("setHandler")  Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>> arg_0 = setHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) {
        setHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon()));
      }
    };
    delegate.methodWithHandlerSetNullDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerListEnum(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::List<ceylon.language::String>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestEnum>> arg_0 = listHandler == null ? null : new io.vertx.core.Handler<java.util.List<io.vertx.codegen.testmodel.TestEnum>>() {
      public void handle(java.util.List<io.vertx.codegen.testmodel.TestEnum> event) {
        listHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration()));
      }
    };
    delegate.methodWithHandlerListEnum(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerSetEnum(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Set<ceylon.language::String>)") @Name("setHandler")  Callable<?> setHandler) {
    io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestEnum>> arg_0 = setHandler == null ? null : new io.vertx.core.Handler<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>() {
      public void handle(java.util.Set<io.vertx.codegen.testmodel.TestEnum> event) {
        setHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration()));
      }
    };
    delegate.methodWithHandlerSetEnum(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.RefedInterface1>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.RefedInterface1> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter());
      }
    };
    delegate.methodWithHandlerAsyncResultListVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface1>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.RefedInterface1>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.RefedInterface1> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter());
      }
    };
    delegate.methodWithHandlerAsyncResultSetVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface2>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.RefedInterface2>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.RefedInterface2> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface2.TO_CEYLON.converter());
      }
    };
    delegate.methodWithHandlerAsyncResultListAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetAbstractVertxGen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.testmodel::RefedInterface2>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.RefedInterface2>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.RefedInterface2> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.RefedInterface2.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.RefedInterface2.TO_CEYLON.converter());
      }
    };
    delegate.methodWithHandlerAsyncResultSetAbstractVertxGen(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithHandlerAsyncResultListJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithHandlerAsyncResultListNullJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonObject>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithHandlerAsyncResultListComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithHandlerAsyncResultSetJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithHandlerAsyncResultSetNullJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Object>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonObject>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Object.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonObject);
      }
    };
    delegate.methodWithHandlerAsyncResultSetComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithHandlerAsyncResultListJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithHandlerAsyncResultListNullJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.json.JsonArray>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.json.JsonArray>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithHandlerAsyncResultListComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithHandlerAsyncResultSetJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithHandlerAsyncResultSetNullJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.json::Array>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.core.json.JsonArray>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.core.json.JsonArray>>(listHandler) {
      public Object toCeylon(java.util.Set<io.vertx.core.json.JsonArray> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.json.Array.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.JsonArray);
      }
    };
    delegate.methodWithHandlerAsyncResultSetComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon());
      }
    };
    delegate.methodWithHandlerAsyncResultListDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestDataObject>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon());
      }
    };
    delegate.methodWithHandlerAsyncResultListNullDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("setHandler")  Callable<?> setHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = setHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>(setHandler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon());
      }
    };
    delegate.methodWithHandlerAsyncResultSetDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetNullDataObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<io.vertx.ceylon.testmodel::TestDataObject>)") @Name("setHandler")  Callable<?> setHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>> arg_0 = setHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestDataObject>>(setHandler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestDataObject> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(io.vertx.ceylon.testmodel.TestDataObject.$TypeDescriptor$, event, io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon());
      }
    };
    delegate.methodWithHandlerAsyncResultSetNullDataObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultListEnum(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("listHandler")  Callable<?> listHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.codegen.testmodel.TestEnum>>> arg_0 = listHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.codegen.testmodel.TestEnum>>(listHandler) {
      public Object toCeylon(java.util.List<io.vertx.codegen.testmodel.TestEnum> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration());
      }
    };
    delegate.methodWithHandlerAsyncResultListEnum(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultSetEnum(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Set<ceylon.language::String>)") @Name("setHandler")  Callable<?> setHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>> arg_0 = setHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.Set<io.vertx.codegen.testmodel.TestEnum>>(setHandler) {
      public Object toCeylon(java.util.Set<io.vertx.codegen.testmodel.TestEnum> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration());
      }
    };
    delegate.methodWithHandlerAsyncResultSetEnum(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerUserTypes(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::RefedInterface1)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1>() {
      public void handle(io.vertx.codegen.testmodel.RefedInterface1 event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(event));
      }
    };
    delegate.methodWithHandlerUserTypes(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultUserTypes(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::RefedInterface1)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.RefedInterface1>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.RefedInterface1>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.RefedInterface1 event) {
        return io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultUserTypes(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithConcreteHandlerUserTypeSubtype(
    final @TypeInfo("io.vertx.ceylon.testmodel::ConcreteHandlerUserType") @Name("handler")  ConcreteHandlerUserType handler) {
    io.vertx.codegen.testmodel.ConcreteHandlerUserType arg_0 = io.vertx.ceylon.testmodel.ConcreteHandlerUserType.TO_JAVA.safeConvert(handler);
    delegate.methodWithConcreteHandlerUserTypeSubtype(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithAbstractHandlerUserTypeSubtype(
    final @TypeInfo("io.vertx.ceylon.testmodel::AbstractHandlerUserType") @Name("handler")  AbstractHandlerUserType handler) {
    io.vertx.codegen.testmodel.AbstractHandlerUserType arg_0 = io.vertx.ceylon.testmodel.AbstractHandlerUserType.TO_JAVA.safeConvert(handler);
    delegate.methodWithAbstractHandlerUserTypeSubtype(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithConcreteHandlerUserTypeSubtypeExtension(
    final @TypeInfo("io.vertx.ceylon.testmodel::ConcreteHandlerUserTypeExtension") @Name("handler")  ConcreteHandlerUserTypeExtension handler) {
    io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension arg_0 = io.vertx.ceylon.testmodel.ConcreteHandlerUserTypeExtension.TO_JAVA.safeConvert(handler);
    delegate.methodWithConcreteHandlerUserTypeSubtypeExtension(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerVoid(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    delegate.methodWithHandlerVoid(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultVoid(
    final @TypeInfo("ceylon.language::Boolean") @Name("sendFailure")  boolean sendFailure, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler")  Callable<?> handler) {
    boolean arg_0 = sendFailure;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.methodWithHandlerAsyncResultVoid(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerThrowable(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    delegate.methodWithHandlerThrowable(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerDataObject(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::TestDataObject)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.TestDataObject> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.TestDataObject>() {
      public void handle(io.vertx.codegen.testmodel.TestDataObject event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon().safeConvert(event));
      }
    };
    delegate.methodWithHandlerDataObject(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithHandlerGenericUserType(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("U?") @Name("value")  U value, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::GenericRefedInterface<U>)") @Name("handler")  Callable<?> handler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(value);
    io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>() {
      public void handle(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter($reified$U).safeConvert(event));
      }
    };
    delegate.methodWithHandlerGenericUserType(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithHandlerAsyncResultGenericUserType(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("U?") @Name("value")  U value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.testmodel::GenericRefedInterface<U>)") @Name("handler")  Callable<?> handler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(value);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object>>(handler) {
      public Object toCeylon(io.vertx.codegen.testmodel.GenericRefedInterface<java.lang.Object> event) {
        return io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter($reified$U).safeConvert(event);
      }
    };
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
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithStringReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1")
  public RefedInterface1 methodWithVertxGenReturn() {
    RefedInterface1 ret = io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(delegate.methodWithVertxGenReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1")
  public RefedInterface1 methodWithVertxGenNullReturn() {
    RefedInterface1 ret = io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(delegate.methodWithVertxGenNullReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface2")
  public RefedInterface2 methodWithAbstractVertxGenReturn() {
    RefedInterface2 ret = io.vertx.ceylon.testmodel.RefedInterface2.TO_CEYLON.converter().safeConvert(delegate.methodWithAbstractVertxGenReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::TestDataObject")
  public io.vertx.ceylon.testmodel.TestDataObject methodWithDataObjectReturn() {
    io.vertx.ceylon.testmodel.TestDataObject ret = io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon().safeConvert(delegate.methodWithDataObjectReturn());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::TestDataObject")
  public io.vertx.ceylon.testmodel.TestDataObject methodWithDataObjectNullReturn() {
    io.vertx.ceylon.testmodel.TestDataObject ret = io.vertx.ceylon.testmodel.testDataObject_.get_().getToCeylon().safeConvert(delegate.methodWithDataObjectNullReturn());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    io.vertx.core.Handler<java.lang.String> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.overloadedMethod(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str, 
    final @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1") @Name("refed")  RefedInterface1 refed) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    io.vertx.codegen.testmodel.RefedInterface1 arg_1 = io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA.safeConvert(refed);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.overloadedMethod(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str, 
    final @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1") @Name("refed")  RefedInterface1 refed, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    io.vertx.codegen.testmodel.RefedInterface1 arg_1 = io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA.safeConvert(refed);
    io.vertx.core.Handler<java.lang.String> arg_2 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.overloadedMethod(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String overloadedMethod(
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str, 
    final @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1") @Name("refed")  RefedInterface1 refed, 
    final @TypeInfo("ceylon.language::Integer") @Name("period")  long period, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    io.vertx.codegen.testmodel.RefedInterface1 arg_1 = io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA.safeConvert(refed);
    long arg_2 = period;
    io.vertx.core.Handler<java.lang.String> arg_3 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.overloadedMethod(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("U?")
  public <U> U methodWithGenericReturn(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::String") @Name("type")  ceylon.language.String type) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(type);
    U ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.methodWithGenericReturn(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithGenericParam(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::String") @Name("type")  ceylon.language.String type, 
    final @TypeInfo("U?") @Name("u")  U u) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(type);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(u);
    delegate.methodWithGenericParam(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithGenericHandler(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::String") @Name("type")  ceylon.language.String type, 
    final @TypeInfo("ceylon.language::Anything(U?)") @Name("handler")  Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(type);
    io.vertx.core.Handler<java.lang.Object> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Object>() {
      public void handle(java.lang.Object event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(event));
      }
    };
    delegate.methodWithGenericHandler(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <U> void methodWithGenericHandlerAsyncResult(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::String") @Name("type")  ceylon.language.String type, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|U?)") @Name("asyncResultHandler")  Callable<?> asyncResultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(type);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = asyncResultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(asyncResultHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.methodWithGenericHandlerAsyncResult(arg_0, arg_1);
  }

  @TypeInfo("io.vertx.ceylon.testmodel::TestInterface")
  public TestInterface fluentMethod(
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    TestInterface ret = io.vertx.ceylon.testmodel.TestInterface.TO_CEYLON.converter().safeConvert(delegate.fluentMethod(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1")
  public RefedInterface1 methodWithCachedReturn(
    final @TypeInfo("ceylon.language::String") @Name("foo")  ceylon.language.String foo) {
    if (cached_methodWithCachedReturn != null) {
      return cached_methodWithCachedReturn;
    }
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(foo);
    RefedInterface1 ret = io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(delegate.methodWithCachedReturn(arg_0));
    cached_methodWithCachedReturn = ret;
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long methodWithCachedReturnPrimitive(
    final @TypeInfo("ceylon.language::Integer") @Name("arg")  long arg) {
    if (cached_methodWithCachedReturnPrimitive != null) {
      return cached_methodWithCachedReturnPrimitive;
    }
    int arg_0 = (int)arg;
    long ret = delegate.methodWithCachedReturnPrimitive(arg_0);
    cached_methodWithCachedReturnPrimitive = ret;
    return ret;
  }

  @TypeInfo("ceylon.language::List<io.vertx.ceylon.testmodel::RefedInterface1>")
  public ceylon.language.List<RefedInterface1> methodWithCachedListReturn() {
    if (cached_methodWithCachedListReturn != null) {
      return cached_methodWithCachedListReturn;
    }
    ceylon.language.List<RefedInterface1> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.testmodel.RefedInterface1.$TypeDescriptor$, delegate.methodWithCachedListReturn(), io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter());
    cached_methodWithCachedListReturn = ret;
    return ret;
  }

  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object methodWithJsonObjectReturn() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.methodWithJsonObjectReturn());
    return ret;
  }

  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object methodWithNullJsonObjectReturn() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.methodWithNullJsonObjectReturn());
    return ret;
  }

  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object methodWithComplexJsonObjectReturn() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.methodWithComplexJsonObjectReturn());
    return ret;
  }

  @TypeInfo("ceylon.json::Array")
  public ceylon.json.Array methodWithJsonArrayReturn() {
    ceylon.json.Array ret = io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(delegate.methodWithJsonArrayReturn());
    return ret;
  }

  @TypeInfo("ceylon.json::Array")
  public ceylon.json.Array methodWithNullJsonArrayReturn() {
    ceylon.json.Array ret = io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(delegate.methodWithNullJsonArrayReturn());
    return ret;
  }

  @TypeInfo("ceylon.json::Array")
  public ceylon.json.Array methodWithComplexJsonArrayReturn() {
    ceylon.json.Array ret = io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(delegate.methodWithComplexJsonArrayReturn());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithJsonParams(
    final @TypeInfo("ceylon.json::Object") @Name("jsonObject")  ceylon.json.Object jsonObject, 
    final @TypeInfo("ceylon.json::Array") @Name("jsonArray")  ceylon.json.Array jsonArray) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(jsonObject);
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(jsonArray);
    delegate.methodWithJsonParams(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithNullJsonParams(
    final @TypeInfo("ceylon.json::Object") @Name("jsonObject")  ceylon.json.Object jsonObject, 
    final @TypeInfo("ceylon.json::Array") @Name("jsonArray")  ceylon.json.Array jsonArray) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(jsonObject);
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(jsonArray);
    delegate.methodWithNullJsonParams(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerJson(
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Object)") @Name("jsonObjectHandler")  Callable<?> jsonObjectHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Array)") @Name("jsonArrayHandler")  Callable<?> jsonArrayHandler) {
    io.vertx.core.Handler<io.vertx.core.json.JsonObject> arg_0 = jsonObjectHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.json.JsonObject>() {
      public void handle(io.vertx.core.json.JsonObject event) {
        jsonObjectHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event));
      }
    };
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_1 = jsonArrayHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() {
      public void handle(io.vertx.core.json.JsonArray event) {
        jsonArrayHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event));
      }
    };
    delegate.methodWithHandlerJson(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerNullJson(
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Object)") @Name("jsonObjectHandler")  Callable<?> jsonObjectHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Array)") @Name("jsonArrayHandler")  Callable<?> jsonArrayHandler) {
    io.vertx.core.Handler<io.vertx.core.json.JsonObject> arg_0 = jsonObjectHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.json.JsonObject>() {
      public void handle(io.vertx.core.json.JsonObject event) {
        jsonObjectHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event));
      }
    };
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_1 = jsonArrayHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() {
      public void handle(io.vertx.core.json.JsonArray event) {
        jsonArrayHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event));
      }
    };
    delegate.methodWithHandlerNullJson(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerComplexJson(
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Object)") @Name("jsonObjectHandler")  Callable<?> jsonObjectHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Array)") @Name("jsonArrayHandler")  Callable<?> jsonArrayHandler) {
    io.vertx.core.Handler<io.vertx.core.json.JsonObject> arg_0 = jsonObjectHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.json.JsonObject>() {
      public void handle(io.vertx.core.json.JsonObject event) {
        jsonObjectHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event));
      }
    };
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_1 = jsonArrayHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() {
      public void handle(io.vertx.core.json.JsonArray event) {
        jsonArrayHandler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event));
      }
    };
    delegate.methodWithHandlerComplexJson(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonObject>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonObject event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultNullJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonObject>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonObject event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultNullJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultComplexJsonObject(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonObject>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonObject event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultComplexJsonObject(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonArray>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonArray event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultNullJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonArray>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonArray event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultNullJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithHandlerAsyncResultComplexJsonArray(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.json.JsonArray>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonArray event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event);
      }
    };
    delegate.methodWithHandlerAsyncResultComplexJsonArray(arg_0);
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> methodWithMapReturn(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    ceylon.language.Map<ceylon.language.String,ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.json.Array.$TypeDescriptor$, delegate.methodWithMapComplexJsonArrayReturn(arg_0), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> methodWithNullMapReturn() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, delegate.methodWithNullMapReturn(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
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

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> methodWithNullListReturn() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.methodWithNullListReturn(), io.vertx.lang.ceylon.ToCeylon.String);
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

  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> methodWithNullSetReturn() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, delegate.methodWithNullSetReturn(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithEnumParam(
    final @TypeInfo("ceylon.language::String") @Name("strVal")  ceylon.language.String strVal, 
    final @TypeInfo("ceylon.language::String") @Name("weirdo")  ceylon.language.String weirdo) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(strVal);
    io.vertx.codegen.testmodel.TestEnum arg_1 = io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.codegen.testmodel.TestEnum.class).safeConvert(weirdo);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithEnumParam(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithEnumReturn(
    final @TypeInfo("ceylon.language::String") @Name("strVal")  ceylon.language.String strVal) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(strVal);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.<io.vertx.codegen.testmodel.TestEnum>enumeration().safeConvert(delegate.methodWithEnumReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithGenEnumParam(
    final @TypeInfo("ceylon.language::String") @Name("strVal")  ceylon.language.String strVal, 
    final @TypeInfo("io.vertx.ceylon.testmodel::TestGenEnum") @Name("weirdo")  io.vertx.ceylon.testmodel.TestGenEnum weirdo) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(strVal);
    io.vertx.codegen.testmodel.TestGenEnum arg_1 = io.vertx.ceylon.testmodel.testGenEnum_.get_().getToJava().safeConvert(weirdo);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithGenEnumParam(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::TestGenEnum")
  public io.vertx.ceylon.testmodel.TestGenEnum methodWithGenEnumReturn(
    final @TypeInfo("ceylon.language::String") @Name("strVal")  ceylon.language.String strVal) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(strVal);
    io.vertx.ceylon.testmodel.TestGenEnum ret = io.vertx.ceylon.testmodel.testGenEnum_.get_().getToCeylon().safeConvert(delegate.methodWithGenEnumReturn(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Throwable")
  public Throwable methodWithThrowableReturn(
    final @TypeInfo("ceylon.language::String") @Name("strVal")  ceylon.language.String strVal) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(strVal);
    Throwable ret = delegate.methodWithThrowableReturn(arg_0);
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String methodWithThrowableParam(
    final @TypeInfo("ceylon.language::Throwable") @Name("t")  Throwable t) {
    java.lang.Throwable arg_0 = t;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.methodWithThrowableParam(arg_0));
    return ret;
  }

}
