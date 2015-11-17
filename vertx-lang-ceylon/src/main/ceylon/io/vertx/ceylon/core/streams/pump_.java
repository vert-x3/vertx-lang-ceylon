package io.vertx.ceylon.core.streams;

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

@Name("pump")
@com.redhat.ceylon.compiler.java.metadata.Object
public class pump_ {

  private static final pump_ instance = new pump_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.streams::pump")
  public static pump_ get_() {
    return instance;
  }


  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a new <code>Pump</code> with the given <code>ReadStream</code> and <code>WriteStream</code>\n")
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public static <T> Pump pump(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>") @Name("rs") @DocAnnotation$annotation$(description = "todo") ReadStream<T> rs, 
    final @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>") @Name("ws") @DocAnnotation$annotation$(description = "todo") WriteStream<T> ws) {
    io.vertx.core.streams.ReadStream<java.lang.Object> arg_0 = io.vertx.ceylon.core.streams.ReadStream.TO_JAVA.safeConvert(rs);
    io.vertx.core.streams.WriteStream<java.lang.Object> arg_1 = io.vertx.ceylon.core.streams.WriteStream.TO_JAVA.safeConvert(ws);
    Pump ret = io.vertx.ceylon.core.streams.Pump.TO_CEYLON.converter().safeConvert(io.vertx.core.streams.Pump.pump(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a new <code>Pump</code> with the given <code>ReadStream</code> and <code>WriteStream</code> and\n <code>writeQueueMaxSize</code>\n")
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public static <T> Pump pump(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>") @Name("rs") @DocAnnotation$annotation$(description = "todo") ReadStream<T> rs, 
    final @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>") @Name("ws") @DocAnnotation$annotation$(description = "todo") WriteStream<T> ws, 
    final @TypeInfo("ceylon.language::Integer") @Name("writeQueueMaxSize") @DocAnnotation$annotation$(description = "todo") long writeQueueMaxSize) {
    io.vertx.core.streams.ReadStream<java.lang.Object> arg_0 = io.vertx.ceylon.core.streams.ReadStream.TO_JAVA.safeConvert(rs);
    io.vertx.core.streams.WriteStream<java.lang.Object> arg_1 = io.vertx.ceylon.core.streams.WriteStream.TO_JAVA.safeConvert(ws);
    int arg_2 = (int)writeQueueMaxSize;
    Pump ret = io.vertx.ceylon.core.streams.Pump.TO_CEYLON.converter().safeConvert(io.vertx.core.streams.Pump.pump(arg_0, arg_1, arg_2));
    return ret;
  }

}
