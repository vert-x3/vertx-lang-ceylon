package io.vertx.ceylon.core.http;

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
public class WebSocketStream implements ReadStream<WebSocket> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WebSocketStream.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocketStream, WebSocketStream> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocketStream, WebSocketStream>() {
    public WebSocketStream convert(io.vertx.core.http.WebSocketStream src) {
      return new WebSocketStream(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<WebSocketStream, io.vertx.core.http.WebSocketStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<WebSocketStream, io.vertx.core.http.WebSocketStream>() {
    public io.vertx.core.http.WebSocketStream convert(WebSocketStream src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.http.WebSocketStream delegate;

  public WebSocketStream(io.vertx.core.http.WebSocketStream delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { handler.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream pause() {
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.pause());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream resume() {
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.endHandler(arg_0));
    return this;
  }

}
