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

@Name("testInterface")
@com.redhat.ceylon.compiler.java.metadata.Object
public class testInterface_ {

  private static final testInterface_ instance = new testInterface_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.testmodel::testInterface")
  public static testInterface_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1")
  public static RefedInterface1 staticFactoryMethod(
    final @TypeInfo("ceylon.language::String") @Name("foo") @DocAnnotation$annotation$(description = "todo") ceylon.language.String foo) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(foo);
    RefedInterface1 ret = io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(io.vertx.codegen.testmodel.TestInterface.staticFactoryMethod(arg_0));
    return ret;
  }

}
