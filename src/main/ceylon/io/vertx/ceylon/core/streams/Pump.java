package io.vertx.ceylon.core.streams;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class Pump {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Pump.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.streams.Pump, Pump> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.streams.Pump, Pump>() {
    public Pump convert(io.vertx.core.streams.Pump src) {
      return new Pump(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<Pump, io.vertx.core.streams.Pump> TO_JAVA = new io.vertx.lang.ceylon.Converter<Pump, io.vertx.core.streams.Pump>() {
    public io.vertx.core.streams.Pump convert(Pump src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.streams.Pump delegate;

  public Pump(io.vertx.core.streams.Pump delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public static <T> Pump pump(
    final @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>") @Name("rs") @DocAnnotation$annotation$(description = "todo") ReadStream<T> rs, 
    final @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>") @Name("ws") @DocAnnotation$annotation$(description = "todo") WriteStream<T> ws) {
    io.vertx.core.streams.ReadStream<java.lang.Object> arg_0 = io.vertx.ceylon.core.streams.ReadStream.TO_JAVA.safeConvert(rs);
    io.vertx.core.streams.WriteStream<java.lang.Object> arg_1 = io.vertx.ceylon.core.streams.WriteStream.TO_JAVA.safeConvert(ws);
    Pump ret = io.vertx.ceylon.core.streams.Pump.TO_CEYLON.safeConvert(io.vertx.core.streams.Pump.pump(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public static <T> Pump pump(
    final @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>") @Name("rs") @DocAnnotation$annotation$(description = "todo") ReadStream<T> rs, 
    final @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>") @Name("ws") @DocAnnotation$annotation$(description = "todo") WriteStream<T> ws, 
    final @TypeInfo("ceylon.language::Integer") @Name("writeQueueMaxSize") @DocAnnotation$annotation$(description = "todo") long writeQueueMaxSize) {
    io.vertx.core.streams.ReadStream<java.lang.Object> arg_0 = io.vertx.ceylon.core.streams.ReadStream.TO_JAVA.safeConvert(rs);
    io.vertx.core.streams.WriteStream<java.lang.Object> arg_1 = io.vertx.ceylon.core.streams.WriteStream.TO_JAVA.safeConvert(ws);
    int arg_2 = (int)writeQueueMaxSize;
    Pump ret = io.vertx.ceylon.core.streams.Pump.TO_CEYLON.safeConvert(io.vertx.core.streams.Pump.pump(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public Pump setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    Pump ret = io.vertx.ceylon.core.streams.Pump.TO_CEYLON.safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public Pump start() {
    Pump ret = io.vertx.ceylon.core.streams.Pump.TO_CEYLON.safeConvert(delegate.start());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public Pump stop() {
    Pump ret = io.vertx.ceylon.core.streams.Pump.TO_CEYLON.safeConvert(delegate.stop());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long numberPumped() {
    long ret = delegate.numberPumped();
    return ret;
  }

}
