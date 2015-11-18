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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a socket-like interface to a TCP connection on either the\n client or the server side.\n <p>\n Instances of this class are created on the client side by an [NetClient](../net/NetClient.type.html)\n when a connection to a server is made, or on the server side by a [NetServer](../net/NetServer.type.html)\n when a server accepts a connection.\n <p>\n It implements both  and  so it can be used with\n [Pump](../streams/Pump.type.html) to pump data with flow control.\n")
public class NetSocket implements ReifiedType,  ReadStream<Buffer>,  WriteStream<Buffer> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.NetSocket, NetSocket> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.NetSocket, NetSocket>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetSocket, NetSocket> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetSocket, NetSocket>() {
        public NetSocket convert(io.vertx.core.net.NetSocket src) {
          return new NetSocket(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<NetSocket, io.vertx.core.net.NetSocket> TO_JAVA = new io.vertx.lang.ceylon.Converter<NetSocket, io.vertx.core.net.NetSocket>() {
    public io.vertx.core.net.NetSocket convert(NetSocket src) {
      return src.delegate;
    }
  };

  @Ignore private SocketAddress cached_remoteAddress;
  @Ignore private SocketAddress cached_localAddress;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(NetSocket.class);
  @Ignore private final io.vertx.core.net.NetSocket delegate;

  public NetSocket(io.vertx.core.net.NetSocket delegate) {
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

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [setWriteQueueMaxSize](../net/NetSocket.type.html#setWriteQueueMaxSize)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket pause() {
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket resume() {
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler")  Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")  Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize")  long maxSize) {
    int arg_0 = (int)maxSize;
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " When a <code>NetSocket</code> is created it automatically registers an event handler with the event bus, the ID of that\n handler is given by <code>writeHandlerID</code>.\n <p>\n Given this ID, a different event loop can send a buffer to that event handler using the event bus and\n that buffer will be received by this instance in its own event loop and written to the underlying connection. This\n allows you to write data to other connections which are owned by different event loops.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String writeHandlerID() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.writeHandlerID());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Write a `java.lang.String` to the connection, encoded in UTF-8.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket write(
    final @TypeInfo("ceylon.language::String") @Name("str") @DocAnnotation$annotation$(description = "the string to write\n") ceylon.language.String str) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Write a `java.lang.String` to the connection, encoded using the encoding <code>enc</code>.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket write(
    final @TypeInfo("ceylon.language::String") @Name("str") @DocAnnotation$annotation$(description = "the string to write\n") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::String") @Name("enc") @DocAnnotation$annotation$(description = "the encoding to use\n") ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.write(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Tell the operating system to stream a file as specified by <code>filename</code> directly from disk to the outgoing connection,\n bypassing userspace altogether (where supported by the underlying operating system. This is a very efficient way to stream files.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename") @DocAnnotation$annotation$(description = "file name of the file to send\n") ceylon.language.String filename) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Tell the operating system to stream a file as specified by <code>filename</code> directly from disk to the outgoing connection,\n bypassing userspace altogether (where supported by the underlying operating system. This is a very efficient way to stream files.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename") @DocAnnotation$annotation$(description = "file name of the file to send\n") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset") @DocAnnotation$annotation$(description = "offset\n") long offset) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    long arg_1 = offset;
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Tell the operating system to stream a file as specified by <code>filename</code> directly from disk to the outgoing connection,\n bypassing userspace altogether (where supported by the underlying operating system. This is a very efficient way to stream files.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename") @DocAnnotation$annotation$(description = "file name of the file to send\n") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset") @DocAnnotation$annotation$(description = "offset\n") long offset, 
    final @TypeInfo("ceylon.language::Integer") @Name("length") @DocAnnotation$annotation$(description = "length\n") long length) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    long arg_1 = offset;
    long arg_2 = length;
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Same as [sendFile](../net/NetSocket.type.html#sendFile) but also takes a handler that will be called when the send has completed or\n a failure has occurred\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename") @DocAnnotation$annotation$(description = "file name of the file to send\n") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "handler\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Same as [sendFile](../net/NetSocket.type.html#sendFile) but also takes a handler that will be called when the send has completed or\n a failure has occurred\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename") @DocAnnotation$annotation$(description = "file name of the file to send\n") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset") @DocAnnotation$annotation$(description = "offset\n") long offset, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "handler\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    long arg_1 = offset;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Same as [sendFile](../net/NetSocket.type.html#sendFile) but also takes a handler that will be called when the send has completed or\n a failure has occurred\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename") @DocAnnotation$annotation$(description = "file name of the file to send\n") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset") @DocAnnotation$annotation$(description = "offset\n") long offset, 
    final @TypeInfo("ceylon.language::Integer") @Name("length") @DocAnnotation$annotation$(description = "length\n") long length, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "handler\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    long arg_1 = offset;
    long arg_2 = length;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return the remote address for this socket\n")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress remoteAddress() {
    if (cached_remoteAddress != null) {
      return cached_remoteAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.remoteAddress());
    cached_remoteAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the local address for this socket\n")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    if (cached_localAddress != null) {
      return cached_localAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.localAddress());
    cached_localAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Close the NetSocket\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = " Set a handler that will be called when the NetSocket is closed\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket closeHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.closeHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Upgrade channel to use SSL/TLS. Be aware that for this to work SSL must be configured.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket upgradeToSsl(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler") @DocAnnotation$annotation$(description = "the handler will be notified when it's upgraded\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.upgradeToSsl(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return true if this [NetSocket](../net/NetSocket.type.html) is encrypted via SSL/TLS.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isSsl() {
    boolean ret = delegate.isSsl();
    return ret;
  }

}
