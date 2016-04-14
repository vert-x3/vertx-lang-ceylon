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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents an HTTP/2 connection.<p/>\n")
public class HttpConnection implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpConnection, HttpConnection> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpConnection, HttpConnection>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpConnection, HttpConnection> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpConnection, HttpConnection>() {
        public HttpConnection convert(io.vertx.core.http.HttpConnection src) {
          return new HttpConnection(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HttpConnection, io.vertx.core.http.HttpConnection> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpConnection, io.vertx.core.http.HttpConnection>() {
    public io.vertx.core.http.HttpConnection convert(HttpConnection src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpConnection.class);
  @Ignore private final io.vertx.core.http.HttpConnection delegate;

  public HttpConnection(io.vertx.core.http.HttpConnection delegate) {
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

  @DocAnnotation$annotation$(description = " Like [goAway](../http/HttpConnection.type.html#goAway) with a last stream id <code>2^31-1</code>.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection goAway(
    final @TypeInfo("ceylon.language::Integer") @Name("errorCode")  long errorCode) {
    long arg_0 = errorCode;
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.goAway(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [goAway](../http/HttpConnection.type.html#goAway) with no buffer.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection goAway(
    final @TypeInfo("ceylon.language::Integer") @Name("errorCode")  long errorCode, 
    final @TypeInfo("ceylon.language::Integer") @Name("lastStreamId")  long lastStreamId) {
    long arg_0 = errorCode;
    int arg_1 = (int)lastStreamId;
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.goAway(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Send a go away frame to the remote endpoint of the connection.<p/>\n\n <ul>\n   <li>a  frame is sent to the to the remote endpoint with the <code>errorCode</code> and {@@code debugData}</li>\n   <li>any stream created after the stream identified by <code>lastStreamId</code> will be closed</li>\n   <li>for an  is different than  when all the remaining streams are closed this connection will be closed automatically</li>\n </ul>\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection goAway(
    final @TypeInfo("ceylon.language::Integer") @Name("errorCode") @DocAnnotation$annotation$(description = "the  error code\n") long errorCode, 
    final @TypeInfo("ceylon.language::Integer") @Name("lastStreamId") @DocAnnotation$annotation$(description = "the last stream id\n") long lastStreamId, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("debugData") @DocAnnotation$annotation$(description = "additional debug data sent to the remote endpoint\n") Buffer debugData) {
    long arg_0 = errorCode;
    int arg_1 = (int)lastStreamId;
    io.vertx.core.buffer.Buffer arg_2 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(debugData);
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.goAway(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set an handler called when a  frame is received.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection goAwayHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::GoAway)?") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.GoAway> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.GoAway>() {
      public void handle(io.vertx.core.http.GoAway event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.goAway_.get_().getToCeylon().safeConvert(event));
      }
    };
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.goAwayHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set an handler called when a  frame has been sent or received and all connections are closed.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection shutdownHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.shutdownHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Initiate a connection shutdown, a go away frame is sent and the connection is closed when all current active streams\n are closed or after a time out of 30 seconds.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection shutdown() {
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.shutdown());
    return this;
  }

  @DocAnnotation$annotation$(description = " Initiate a connection shutdown, a go away frame is sent and the connection is closed when all current streams\n will be closed or the <code>timeout</code> is fired.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection shutdown(
    final @TypeInfo("ceylon.language::Integer") @Name("timeoutMs") @DocAnnotation$annotation$(description = "the timeout in milliseconds\n") long timeoutMs) {
    long arg_0 = timeoutMs;
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.shutdown(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set a close handler. The handler will get notified when the connection is closed.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection closeHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler") @DocAnnotation$annotation$(description = "the handler to be notified\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.closeHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Close the connection and all the currently active streams. A  frame will be sent before.<p/>\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = " @return the latest server settings acknowledged by the remote endpoint\n")
  @TypeInfo("io.vertx.ceylon.core.http::Http2Settings")
  public io.vertx.ceylon.core.http.Http2Settings settings() {
    io.vertx.ceylon.core.http.Http2Settings ret = io.vertx.ceylon.core.http.http2Settings_.get_().getToCeylon().safeConvert(delegate.settings());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Send to the remote endpoint an update of the server settings.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection updateSettings(
    final @TypeInfo("io.vertx.ceylon.core.http::Http2Settings") @Name("settings") @DocAnnotation$annotation$(description = "the new settings\n") io.vertx.ceylon.core.http.Http2Settings settings) {
    io.vertx.core.http.Http2Settings arg_0 = settings == null ? null : new io.vertx.core.http.Http2Settings(io.vertx.lang.ceylon.ToJava.JsonObject.convert(settings.toJson()));
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.updateSettings(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Send to the remote endpoint an update of this endpoint settings.<p/>\n\n The <code>completionHandler</code> will be notified when the remote endpoint has acknowledged the settings.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection updateSettings(
    final @TypeInfo("io.vertx.ceylon.core.http::Http2Settings") @Name("settings") @DocAnnotation$annotation$(description = "the new settings\n") io.vertx.ceylon.core.http.Http2Settings settings, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "the handler notified when the settings have been acknowledged by the remote endpoint\n") Callable<?> completionHandler) {
    io.vertx.core.http.Http2Settings arg_0 = settings == null ? null : new io.vertx.core.http.Http2Settings(io.vertx.lang.ceylon.ToJava.JsonObject.convert(settings.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = completionHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.updateSettings(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return the current remote endpoint settings for this connection\n")
  @TypeInfo("io.vertx.ceylon.core.http::Http2Settings")
  public io.vertx.ceylon.core.http.Http2Settings remoteSettings() {
    io.vertx.ceylon.core.http.Http2Settings ret = io.vertx.ceylon.core.http.http2Settings_.get_().getToCeylon().safeConvert(delegate.remoteSettings());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set an handler that is called when remote endpoint [Http2Settings](../http/Http2Settings.type.html) are updated.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection remoteSettingsHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::Http2Settings)") @Name("handler") @DocAnnotation$annotation$(description = "the handler for remote endpoint settings\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.Http2Settings> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.Http2Settings>() {
      public void handle(io.vertx.core.http.Http2Settings event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.http2Settings_.get_().getToCeylon().safeConvert(event));
      }
    };
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.remoteSettingsHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Send a  frame to the remote endpoint.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection ping(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "the 8 bytes data of the frame\n") Buffer data, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.buffer::Buffer)") @Name("pongHandler") @DocAnnotation$annotation$(description = "an async result handler notified with pong reply or the failure\n") Callable<?> pongHandler) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> arg_1 = pongHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.buffer.Buffer>(pongHandler) {
      public Object toCeylon(io.vertx.core.buffer.Buffer event) {
        return io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.ping(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set an handler notified when a  frame is received from the remote endpoint.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection pingHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler") @DocAnnotation$annotation$(description = "the handler to be called when a  is received\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.pingHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set an handler called when a connection error happens\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

}
