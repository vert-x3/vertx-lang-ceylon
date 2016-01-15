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

@Ceylon(major = 8)
@Name("compositeFuture")
@com.redhat.ceylon.compiler.java.metadata.Object
public class compositeFuture_ implements ReifiedType {

  private static final compositeFuture_ instance = new compositeFuture_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(compositeFuture_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core::compositeFuture")
  public static compositeFuture_ get_() {
    return instance;
  }


  @TypeParameters({
    @TypeParameter(value="T1",variance=Variance.NONE),
    @TypeParameter(value="T2",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Return a composite future, succeeded when all futures are succeeded, failed when any future is failed.\n")
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public <T1,T2> CompositeFuture all(final @Ignore TypeDescriptor $reified$T1, final @Ignore TypeDescriptor $reified$T2, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T1>") @Name("f1") @DocAnnotation$annotation$(description = "future\n") Future<T1> f1, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T2>") @Name("f2") @DocAnnotation$annotation$(description = "future\n") Future<T2> f2) {
    io.vertx.core.Future<java.lang.Object> arg_0 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f1);
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f2);
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(io.vertx.core.CompositeFuture.all(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T1",variance=Variance.NONE),
    @TypeParameter(value="T2",variance=Variance.NONE),
    @TypeParameter(value="T3",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public <T1,T2,T3> CompositeFuture all(final @Ignore TypeDescriptor $reified$T1, final @Ignore TypeDescriptor $reified$T2, final @Ignore TypeDescriptor $reified$T3, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T1>") @Name("f1")  Future<T1> f1, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T2>") @Name("f2")  Future<T2> f2, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T3>") @Name("f3")  Future<T3> f3) {
    io.vertx.core.Future<java.lang.Object> arg_0 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f1);
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f2);
    io.vertx.core.Future<java.lang.Object> arg_2 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f3);
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(io.vertx.core.CompositeFuture.all(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T1",variance=Variance.NONE),
    @TypeParameter(value="T2",variance=Variance.NONE),
    @TypeParameter(value="T3",variance=Variance.NONE),
    @TypeParameter(value="T4",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public <T1,T2,T3,T4> CompositeFuture all(final @Ignore TypeDescriptor $reified$T1, final @Ignore TypeDescriptor $reified$T2, final @Ignore TypeDescriptor $reified$T3, final @Ignore TypeDescriptor $reified$T4, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T1>") @Name("f1")  Future<T1> f1, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T2>") @Name("f2")  Future<T2> f2, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T3>") @Name("f3")  Future<T3> f3, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T4>") @Name("f4")  Future<T4> f4) {
    io.vertx.core.Future<java.lang.Object> arg_0 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f1);
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f2);
    io.vertx.core.Future<java.lang.Object> arg_2 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f3);
    io.vertx.core.Future<java.lang.Object> arg_3 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f4);
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(io.vertx.core.CompositeFuture.all(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T1",variance=Variance.NONE),
    @TypeParameter(value="T2",variance=Variance.NONE),
    @TypeParameter(value="T3",variance=Variance.NONE),
    @TypeParameter(value="T4",variance=Variance.NONE),
    @TypeParameter(value="T5",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public <T1,T2,T3,T4,T5> CompositeFuture all(final @Ignore TypeDescriptor $reified$T1, final @Ignore TypeDescriptor $reified$T2, final @Ignore TypeDescriptor $reified$T3, final @Ignore TypeDescriptor $reified$T4, final @Ignore TypeDescriptor $reified$T5, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T1>") @Name("f1")  Future<T1> f1, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T2>") @Name("f2")  Future<T2> f2, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T3>") @Name("f3")  Future<T3> f3, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T4>") @Name("f4")  Future<T4> f4, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T5>") @Name("f5")  Future<T5> f5) {
    io.vertx.core.Future<java.lang.Object> arg_0 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f1);
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f2);
    io.vertx.core.Future<java.lang.Object> arg_2 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f3);
    io.vertx.core.Future<java.lang.Object> arg_3 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f4);
    io.vertx.core.Future<java.lang.Object> arg_4 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f5);
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(io.vertx.core.CompositeFuture.all(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T1",variance=Variance.NONE),
    @TypeParameter(value="T2",variance=Variance.NONE),
    @TypeParameter(value="T3",variance=Variance.NONE),
    @TypeParameter(value="T4",variance=Variance.NONE),
    @TypeParameter(value="T5",variance=Variance.NONE),
    @TypeParameter(value="T6",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public <T1,T2,T3,T4,T5,T6> CompositeFuture all(final @Ignore TypeDescriptor $reified$T1, final @Ignore TypeDescriptor $reified$T2, final @Ignore TypeDescriptor $reified$T3, final @Ignore TypeDescriptor $reified$T4, final @Ignore TypeDescriptor $reified$T5, final @Ignore TypeDescriptor $reified$T6, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T1>") @Name("f1")  Future<T1> f1, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T2>") @Name("f2")  Future<T2> f2, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T3>") @Name("f3")  Future<T3> f3, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T4>") @Name("f4")  Future<T4> f4, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T5>") @Name("f5")  Future<T5> f5, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T6>") @Name("f6")  Future<T6> f6) {
    io.vertx.core.Future<java.lang.Object> arg_0 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f1);
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f2);
    io.vertx.core.Future<java.lang.Object> arg_2 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f3);
    io.vertx.core.Future<java.lang.Object> arg_3 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f4);
    io.vertx.core.Future<java.lang.Object> arg_4 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f5);
    io.vertx.core.Future<java.lang.Object> arg_5 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f6);
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(io.vertx.core.CompositeFuture.all(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T1",variance=Variance.NONE),
    @TypeParameter(value="T2",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Return a composite future, succeeded when any futures is succeeded, failed when all futures are failed.\n")
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public <T1,T2> CompositeFuture any(final @Ignore TypeDescriptor $reified$T1, final @Ignore TypeDescriptor $reified$T2, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T1>") @Name("f1") @DocAnnotation$annotation$(description = "future\n") Future<T1> f1, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T2>") @Name("f2") @DocAnnotation$annotation$(description = "future\n") Future<T2> f2) {
    io.vertx.core.Future<java.lang.Object> arg_0 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f1);
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f2);
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(io.vertx.core.CompositeFuture.any(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T1",variance=Variance.NONE),
    @TypeParameter(value="T2",variance=Variance.NONE),
    @TypeParameter(value="T3",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public <T1,T2,T3> CompositeFuture any(final @Ignore TypeDescriptor $reified$T1, final @Ignore TypeDescriptor $reified$T2, final @Ignore TypeDescriptor $reified$T3, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T1>") @Name("f1")  Future<T1> f1, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T2>") @Name("f2")  Future<T2> f2, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T3>") @Name("f3")  Future<T3> f3) {
    io.vertx.core.Future<java.lang.Object> arg_0 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f1);
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f2);
    io.vertx.core.Future<java.lang.Object> arg_2 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f3);
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(io.vertx.core.CompositeFuture.any(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T1",variance=Variance.NONE),
    @TypeParameter(value="T2",variance=Variance.NONE),
    @TypeParameter(value="T3",variance=Variance.NONE),
    @TypeParameter(value="T4",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public <T1,T2,T3,T4> CompositeFuture any(final @Ignore TypeDescriptor $reified$T1, final @Ignore TypeDescriptor $reified$T2, final @Ignore TypeDescriptor $reified$T3, final @Ignore TypeDescriptor $reified$T4, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T1>") @Name("f1")  Future<T1> f1, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T2>") @Name("f2")  Future<T2> f2, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T3>") @Name("f3")  Future<T3> f3, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T4>") @Name("f4")  Future<T4> f4) {
    io.vertx.core.Future<java.lang.Object> arg_0 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f1);
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f2);
    io.vertx.core.Future<java.lang.Object> arg_2 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f3);
    io.vertx.core.Future<java.lang.Object> arg_3 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f4);
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(io.vertx.core.CompositeFuture.any(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T1",variance=Variance.NONE),
    @TypeParameter(value="T2",variance=Variance.NONE),
    @TypeParameter(value="T3",variance=Variance.NONE),
    @TypeParameter(value="T4",variance=Variance.NONE),
    @TypeParameter(value="T5",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public <T1,T2,T3,T4,T5> CompositeFuture any(final @Ignore TypeDescriptor $reified$T1, final @Ignore TypeDescriptor $reified$T2, final @Ignore TypeDescriptor $reified$T3, final @Ignore TypeDescriptor $reified$T4, final @Ignore TypeDescriptor $reified$T5, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T1>") @Name("f1")  Future<T1> f1, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T2>") @Name("f2")  Future<T2> f2, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T3>") @Name("f3")  Future<T3> f3, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T4>") @Name("f4")  Future<T4> f4, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T5>") @Name("f5")  Future<T5> f5) {
    io.vertx.core.Future<java.lang.Object> arg_0 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f1);
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f2);
    io.vertx.core.Future<java.lang.Object> arg_2 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f3);
    io.vertx.core.Future<java.lang.Object> arg_3 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f4);
    io.vertx.core.Future<java.lang.Object> arg_4 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f5);
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(io.vertx.core.CompositeFuture.any(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T1",variance=Variance.NONE),
    @TypeParameter(value="T2",variance=Variance.NONE),
    @TypeParameter(value="T3",variance=Variance.NONE),
    @TypeParameter(value="T4",variance=Variance.NONE),
    @TypeParameter(value="T5",variance=Variance.NONE),
    @TypeParameter(value="T6",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public <T1,T2,T3,T4,T5,T6> CompositeFuture any(final @Ignore TypeDescriptor $reified$T1, final @Ignore TypeDescriptor $reified$T2, final @Ignore TypeDescriptor $reified$T3, final @Ignore TypeDescriptor $reified$T4, final @Ignore TypeDescriptor $reified$T5, final @Ignore TypeDescriptor $reified$T6, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T1>") @Name("f1")  Future<T1> f1, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T2>") @Name("f2")  Future<T2> f2, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T3>") @Name("f3")  Future<T3> f3, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T4>") @Name("f4")  Future<T4> f4, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T5>") @Name("f5")  Future<T5> f5, 
    final @TypeInfo("io.vertx.ceylon.core::Future<T6>") @Name("f6")  Future<T6> f6) {
    io.vertx.core.Future<java.lang.Object> arg_0 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f1);
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f2);
    io.vertx.core.Future<java.lang.Object> arg_2 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f3);
    io.vertx.core.Future<java.lang.Object> arg_3 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f4);
    io.vertx.core.Future<java.lang.Object> arg_4 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f5);
    io.vertx.core.Future<java.lang.Object> arg_5 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(f6);
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(io.vertx.core.CompositeFuture.any(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

}
