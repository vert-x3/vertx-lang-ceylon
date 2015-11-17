package io.vertx.ceylon.core.http;

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
@DocAnnotation$annotation$(description = " A stream for todo_link WebSocket connection.\n <p>\n When the connection attempt is successful, the stream handler is called back with the todo_link\n argument, immediately followed by a call to the end handler. When the connection attempt fails, the exception handler is invoked.\n <p>\n The connection occurs when the todo_link method is called with a non null handler, the other handlers should be\n set before setting the handler.\n")
public class WebSocketStream implements ReifiedType,  ReadStream<WebSocket> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.WebSocketStream, WebSocketStream> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.WebSocketStream, WebSocketStream>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocketStream, WebSocketStream> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocketStream, WebSocketStream>() {
        public WebSocketStream convert(io.vertx.core.http.WebSocketStream src) {
          return new WebSocketStream(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<WebSocketStream, io.vertx.core.http.WebSocketStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<WebSocketStream, io.vertx.core.http.WebSocketStream>() {
    public io.vertx.core.http.WebSocketStream convert(WebSocketStream src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WebSocketStream.class);
  @Ignore private final io.vertx.core.http.WebSocketStream delegate;

  public WebSocketStream(io.vertx.core.http.WebSocketStream delegate) {
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

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream pause() {
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream resume() {
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

}
