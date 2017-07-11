package io.vertx.ceylon.auth.common;

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
@Name("vertxContextPRNG")
@com.redhat.ceylon.compiler.java.metadata.Object
public class vertxContextPRNG_ implements ReifiedType {

  private static final vertxContextPRNG_ instance = new vertxContextPRNG_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(vertxContextPRNG_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.common::vertxContextPRNG")
  public static vertxContextPRNG_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Get or create a secure non blocking random number generator using the current vert.x context. If there is no\n current context (i.e.: not running on the eventloop) then a `java.lang.IllegalStateException` is thrown.\n")
  @TypeInfo("io.vertx.ceylon.auth.common::VertxContextPRNG")
  public VertxContextPRNG current() {
    VertxContextPRNG ret = io.vertx.ceylon.auth.common.VertxContextPRNG.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.VertxContextPRNG.current());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get or create a secure non blocking random number generator using the current vert.x instance. Since the context\n might be different this method will attempt to use the current context first if available and then fall back to\n create a new instance of the PRNG.\n")
  @TypeInfo("io.vertx.ceylon.auth.common::VertxContextPRNG")
  public VertxContextPRNG current(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx")@DocAnnotation$annotation$(description = "a Vert.x instance.\n") Vertx vertx) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    VertxContextPRNG ret = io.vertx.ceylon.auth.common.VertxContextPRNG.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.VertxContextPRNG.current(arg_0));
    return ret;
  }

}
