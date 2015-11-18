package io.vertx.ceylon.core.net;

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
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A [ReadStream](../streams/ReadStream.type.html) of [NetSocket](../net/NetSocket.type.html), used for notifying\n socket connections to a [NetServer](../net/NetServer.type.html).\n")
public class NetSocketStream implements ReifiedType,  ReadStream<NetSocket> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.NetSocketStream, NetSocketStream> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.NetSocketStream, NetSocketStream>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetSocketStream, NetSocketStream> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetSocketStream, NetSocketStream>() {
        public NetSocketStream convert(io.vertx.core.net.NetSocketStream src) {
          return new NetSocketStream(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<NetSocketStream, io.vertx.core.net.NetSocketStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<NetSocketStream, io.vertx.core.net.NetSocketStream>() {
    public io.vertx.core.net.NetSocketStream convert(NetSocketStream src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(NetSocketStream.class);
  @Ignore private final io.vertx.core.net.NetSocketStream delegate;

  public NetSocketStream(io.vertx.core.net.NetSocketStream delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.net::NetSocket)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.net.NetSocket> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.net.NetSocket>() {
      public void handle(io.vertx.core.net.NetSocket event) {
        handler.$call$((Object)io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream pause() {
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream resume() {
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

}
