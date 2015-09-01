package io.vertx.ceylon.core.datagram;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class PacketWritestream implements WriteStream<Buffer> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(PacketWritestream.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.datagram.PacketWritestream, PacketWritestream> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.datagram.PacketWritestream, PacketWritestream>() {
    public PacketWritestream convert(io.vertx.core.datagram.PacketWritestream src) {
      return new PacketWritestream(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<PacketWritestream, io.vertx.core.datagram.PacketWritestream> TO_JAVA = new io.vertx.lang.ceylon.Converter<PacketWritestream, io.vertx.core.datagram.PacketWritestream>() {
    public io.vertx.core.datagram.PacketWritestream convert(PacketWritestream src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.datagram.PacketWritestream delegate;

  public PacketWritestream(io.vertx.core.datagram.PacketWritestream delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    PacketWritestream ret = io.vertx.ceylon.core.datagram.PacketWritestream.TO_CEYLON.convert(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.convert(data);
    PacketWritestream ret = io.vertx.ceylon.core.datagram.PacketWritestream.TO_CEYLON.convert(delegate.write(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    PacketWritestream ret = io.vertx.ceylon.core.datagram.PacketWritestream.TO_CEYLON.convert(delegate.setWriteQueueMaxSize(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream drainHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$(); } };
    PacketWritestream ret = io.vertx.ceylon.core.datagram.PacketWritestream.TO_CEYLON.convert(delegate.drainHandler(arg_0));
    return ret;
  }

}
