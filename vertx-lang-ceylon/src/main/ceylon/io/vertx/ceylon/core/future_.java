package io.vertx.ceylon.core;

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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Name("future")
@com.redhat.ceylon.compiler.java.metadata.Object
public class future_ {

  private static final future_ instance = new future_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.core::future")
  public static future_ get_() {
    return instance;
  }


  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> future(final @Ignore TypeDescriptor $reified$T) {
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$T).safeConvert(io.vertx.core.Future.future());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> succeededFuture(final @Ignore TypeDescriptor $reified$T) {
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$T).safeConvert(io.vertx.core.Future.succeededFuture());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> succeededFuture(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("T?") @Name("result") @DocAnnotation$annotation$(description = "todo") T result) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(result);
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$T).safeConvert(io.vertx.core.Future.succeededFuture(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> failedFuture(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("failureMessage") @DocAnnotation$annotation$(description = "todo") ceylon.language.String failureMessage) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(failureMessage);
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$T).safeConvert(io.vertx.core.Future.failedFuture(arg_0));
    return ret;
  }

}
