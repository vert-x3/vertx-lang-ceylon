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

@Ceylon(major = 8)
@Name("localSessionStore")
@com.redhat.ceylon.compiler.java.metadata.Object
public class localSessionStore_ implements ReifiedType {

  private static final localSessionStore_ instance = new localSessionStore_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(localSessionStore_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.sstore::localSessionStore")
  public static localSessionStore_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a session store\n")
  @TypeInfo("io.vertx.ceylon.web.sstore::LocalSessionStore")
  public LocalSessionStore create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    LocalSessionStore ret = io.vertx.ceylon.web.sstore.LocalSessionStore.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.sstore.LocalSessionStore.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a session store\n")
  @TypeInfo("io.vertx.ceylon.web.sstore::LocalSessionStore")
  public LocalSessionStore create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("sessionMapName") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sessionMapName) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sessionMapName);
    LocalSessionStore ret = io.vertx.ceylon.web.sstore.LocalSessionStore.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.sstore.LocalSessionStore.create(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a session store\n")
  @TypeInfo("io.vertx.ceylon.web.sstore::LocalSessionStore")
  public LocalSessionStore create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("sessionMapName") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sessionMapName, 
    final @TypeInfo("ceylon.language::Integer") @Name("reaperInterval") @DocAnnotation$annotation$(description = "todo") long reaperInterval) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sessionMapName);
    long arg_2 = reaperInterval;
    LocalSessionStore ret = io.vertx.ceylon.web.sstore.LocalSessionStore.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.sstore.LocalSessionStore.create(arg_0, arg_1, arg_2));
    return ret;
  }

}
