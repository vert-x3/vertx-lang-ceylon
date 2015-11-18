package io.vertx.ceylon.web.handler.sockjs;

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
import io.vertx.ceylon.web.Session;
import io.vertx.ceylon.auth.common.User;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "\n You interact with SockJS clients through instances of SockJS socket.\n <p>\n The API is very similar to todo_link.\n It implements both  and \n so it can be used with\n todo_link to pump data with flow control.<p>\n")
public class SockJSSocket implements ReifiedType,  ReadStream<Buffer>,  WriteStream<Buffer> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.sockjs.SockJSSocket, SockJSSocket> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.sockjs.SockJSSocket, SockJSSocket>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.sockjs.SockJSSocket, SockJSSocket> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.sockjs.SockJSSocket, SockJSSocket>() {
        public SockJSSocket convert(io.vertx.ext.web.handler.sockjs.SockJSSocket src) {
          return new SockJSSocket(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SockJSSocket, io.vertx.ext.web.handler.sockjs.SockJSSocket> TO_JAVA = new io.vertx.lang.ceylon.Converter<SockJSSocket, io.vertx.ext.web.handler.sockjs.SockJSSocket>() {
    public io.vertx.ext.web.handler.sockjs.SockJSSocket convert(SockJSSocket src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SockJSSocket.class);
  @Ignore private final io.vertx.ext.web.handler.sockjs.SockJSSocket delegate;

  public SockJSSocket(io.vertx.ext.web.handler.sockjs.SockJSSocket delegate) {
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

  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSSocket")
  public SockJSSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    SockJSSocket ret = io.vertx.ceylon.web.handler.sockjs.SockJSSocket.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSSocket")
  public SockJSSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    SockJSSocket ret = io.vertx.ceylon.web.handler.sockjs.SockJSSocket.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSSocket")
  public SockJSSocket pause() {
    SockJSSocket ret = io.vertx.ceylon.web.handler.sockjs.SockJSSocket.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSSocket")
  public SockJSSocket resume() {
    SockJSSocket ret = io.vertx.ceylon.web.handler.sockjs.SockJSSocket.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSSocket")
  public SockJSSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    SockJSSocket ret = io.vertx.ceylon.web.handler.sockjs.SockJSSocket.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSSocket")
  public SockJSSocket write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    SockJSSocket ret = io.vertx.ceylon.web.handler.sockjs.SockJSSocket.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSSocket")
  public SockJSSocket setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    SockJSSocket ret = io.vertx.ceylon.web.handler.sockjs.SockJSSocket.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSSocket")
  public SockJSSocket drainHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    SockJSSocket ret = io.vertx.ceylon.web.handler.sockjs.SockJSSocket.TO_CEYLON.converter().safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " When a <code>SockJSSocket</code> is created it automatically registers an event handler with the event bus, the ID of that\n handler is given by <code>writeHandlerID</code>.\n <p>\n Given this ID, a different event loop can send a buffer to that event handler using the event bus and\n that buffer will be received by this instance in its own event loop and written to the underlying socket. This\n allows you to write data to other sockets which are owned by different event loops.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String writeHandlerID() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.writeHandlerID());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Close it\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = " Return the remote address for this socket\n")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress remoteAddress() {
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.remoteAddress());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return the local address for this socket\n")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.localAddress());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return the headers corresponding to the last request for this socket or the websocket handshake\n Any cookie headers will be removed for security reasons\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.headers());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return the URI corresponding to the last request for this socket or the websocket handshake\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the Vert.x-Web session corresponding to this socket\n")
  @TypeInfo("io.vertx.ceylon.web::Session?")
  public Session webSession() {
    Session ret = io.vertx.ceylon.web.Session.TO_CEYLON.converter().safeConvert(delegate.webSession());
    return ret;
  }

  @DocAnnotation$annotation$(description = "  @return the Vert.x-Web user corresponding to this socket\n")
  @TypeInfo("io.vertx.ceylon.auth.common::User?")
  public User webUser() {
    User ret = io.vertx.ceylon.auth.common.User.TO_CEYLON.converter().safeConvert(delegate.webUser());
    return ret;
  }

}
