package io.vertx.ceylon.web.sstore;

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
import io.vertx.ceylon.core.Vertx;

@Name("clusteredSessionStore")
@com.redhat.ceylon.compiler.java.metadata.Object
public class clusteredSessionStore_ {

  private static final clusteredSessionStore_ instance = new clusteredSessionStore_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.sstore::clusteredSessionStore")
  public static clusteredSessionStore_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.sstore::ClusteredSessionStore")
  public static ClusteredSessionStore create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("sessionMapName") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sessionMapName) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sessionMapName);
    ClusteredSessionStore ret = io.vertx.ceylon.web.sstore.ClusteredSessionStore.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.sstore.ClusteredSessionStore.create(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.sstore::ClusteredSessionStore")
  public static ClusteredSessionStore create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    ClusteredSessionStore ret = io.vertx.ceylon.web.sstore.ClusteredSessionStore.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.sstore.ClusteredSessionStore.create(arg_0));
    return ret;
  }

}
