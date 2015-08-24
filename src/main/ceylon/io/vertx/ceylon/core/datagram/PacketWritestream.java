package io.vertx.ceylon.core.datagram;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.core.Handler;

public class PacketWritestream implements WriteStream<Buffer> {

  private final io.vertx.core.datagram.PacketWritestream delegate;

  public PacketWritestream(io.vertx.core.datagram.PacketWritestream delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    PacketWritestream ret = new io.vertx.ceylon.core.datagram.PacketWritestream(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    PacketWritestream ret = new io.vertx.ceylon.core.datagram.PacketWritestream(delegate.write(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") long maxSize) {
    int arg_0 = (int)maxSize;
    PacketWritestream ret = new io.vertx.ceylon.core.datagram.PacketWritestream(delegate.setWriteQueueMaxSize(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream drainHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    PacketWritestream ret = new io.vertx.ceylon.core.datagram.PacketWritestream(delegate.drainHandler(arg_0));
    return ret;
  }

}
