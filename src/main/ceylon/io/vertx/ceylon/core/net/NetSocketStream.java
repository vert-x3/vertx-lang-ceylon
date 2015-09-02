package io.vertx.ceylon.core.net;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class NetSocketStream implements ReadStream<NetSocket> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(NetSocketStream.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetSocketStream, NetSocketStream> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetSocketStream, NetSocketStream>() {
    public NetSocketStream convert(io.vertx.core.net.NetSocketStream src) {
      return new NetSocketStream(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<NetSocketStream, io.vertx.core.net.NetSocketStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<NetSocketStream, io.vertx.core.net.NetSocketStream>() {
    public io.vertx.core.net.NetSocketStream convert(NetSocketStream src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.net.NetSocketStream delegate;

  public NetSocketStream(io.vertx.core.net.NetSocketStream delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.convert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.net::NetSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.net.NetSocket> arg_0 = new io.vertx.core.Handler<io.vertx.core.net.NetSocket>() { public void handle(io.vertx.core.net.NetSocket event) { handler.$call$((Object)io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.convert(event)); } };
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.convert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream pause() {
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.convert(delegate.pause());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream resume() {
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.convert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.convert(delegate.endHandler(arg_0));
    return this;
  }

}
