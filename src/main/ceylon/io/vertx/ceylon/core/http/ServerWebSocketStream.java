package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class ServerWebSocketStream implements ReadStream<ServerWebSocket> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ServerWebSocketStream.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.ServerWebSocketStream, ServerWebSocketStream> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.ServerWebSocketStream, ServerWebSocketStream>() {
    public ServerWebSocketStream convert(io.vertx.core.http.ServerWebSocketStream src) {
      return new ServerWebSocketStream(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<ServerWebSocketStream, io.vertx.core.http.ServerWebSocketStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<ServerWebSocketStream, io.vertx.core.http.ServerWebSocketStream>() {
    public io.vertx.core.http.ServerWebSocketStream convert(ServerWebSocketStream src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.http.ServerWebSocketStream delegate;

  public ServerWebSocketStream(io.vertx.core.http.ServerWebSocketStream delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    ServerWebSocketStream ret = io.vertx.ceylon.core.http.ServerWebSocketStream.TO_CEYLON.safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::ServerWebSocket)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket>() {
      public void handle(io.vertx.core.http.ServerWebSocket event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    ServerWebSocketStream ret = io.vertx.ceylon.core.http.ServerWebSocketStream.TO_CEYLON.safeConvert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream pause() {
    ServerWebSocketStream ret = io.vertx.ceylon.core.http.ServerWebSocketStream.TO_CEYLON.safeConvert(delegate.pause());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream resume() {
    ServerWebSocketStream ret = io.vertx.ceylon.core.http.ServerWebSocketStream.TO_CEYLON.safeConvert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream endHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    ServerWebSocketStream ret = io.vertx.ceylon.core.http.ServerWebSocketStream.TO_CEYLON.safeConvert(delegate.endHandler(arg_0));
    return this;
  }

}
