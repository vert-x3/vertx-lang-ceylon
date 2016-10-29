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
import io.vertx.ceylon.core.MultiMap;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;
import io.vertx.ceylon.core.net.NetSocket;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a server-side HTTP request.\n <p>\n Instances are created for each request and passed to the user via a handler.\n <p>\n Each instance of this class is associated with a corresponding [HttpServerResponse](../http/HttpServerResponse.type.html) instance via\n [response](../http/HttpServerRequest.type.html#response).<p>\n It implements [ReadStream](../streams/ReadStream.type.html) so it can be used with\n [Pump](../streams/Pump.type.html) to pump data with flow control.\n <p>\n")
public class HttpServerRequest implements ReifiedType,  ReadStream<Buffer> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpServerRequest, HttpServerRequest> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpServerRequest, HttpServerRequest>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerRequest, HttpServerRequest> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerRequest, HttpServerRequest>() {
        public HttpServerRequest convert(io.vertx.core.http.HttpServerRequest src) {
          return new HttpServerRequest(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HttpServerRequest, io.vertx.core.http.HttpServerRequest> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpServerRequest, io.vertx.core.http.HttpServerRequest>() {
    public io.vertx.core.http.HttpServerRequest convert(HttpServerRequest src) {
      return src.delegate;
    }
  };

  @Ignore private HttpServerResponse cached_response;
  @Ignore private MultiMap cached_headers;
  @Ignore private MultiMap cached_params;
  @Ignore private SocketAddress cached_remoteAddress;
  @Ignore private SocketAddress cached_localAddress;
  @Ignore private NetSocket cached_netSocket;
  @Ignore private MultiMap cached_formAttributes;
  @Ignore private HttpConnection cached_connection;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(HttpServerRequest.class), io.vertx.core.http.HttpServerRequest.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.http.HttpServerRequest delegate;

  public HttpServerRequest(io.vertx.core.http.HttpServerRequest delegate) {
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

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest pause() {
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest resume() {
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.http::HttpVersion")
  public io.vertx.ceylon.core.http.HttpVersion version() {
    io.vertx.ceylon.core.http.HttpVersion ret = io.vertx.ceylon.core.http.httpVersion_.get_().getToCeylon().safeConvert(delegate.version());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.http::HttpMethod")
  public io.vertx.ceylon.core.http.HttpMethod method() {
    io.vertx.ceylon.core.http.HttpMethod ret = io.vertx.ceylon.core.http.httpMethod_.get_().getToCeylon().safeConvert(delegate.method());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String rawMethod() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.rawMethod());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isSSL() {
    boolean ret = delegate.isSSL();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String scheme() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.scheme());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String path() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.path());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String query() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.query());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String host() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.host());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse response() {
    if (cached_response != null) {
      return cached_response;
    }
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.response());
    cached_response = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    if (cached_headers != null) {
      return cached_headers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.headers());
    cached_headers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return the first header value with the specified name\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getHeader(
    final @TypeInfo("ceylon.language::String") @Name("headerName")@DocAnnotation$annotation$(description = "the header name\n") ceylon.language.String headerName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(headerName);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getHeader(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap params() {
    if (cached_params != null) {
      return cached_params;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.params());
    cached_params = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return the first param value with the specified name\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getParam(
    final @TypeInfo("ceylon.language::String") @Name("paramName")@DocAnnotation$annotation$(description = "the param name\n") ceylon.language.String paramName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(paramName);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getParam(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress remoteAddress() {
    if (cached_remoteAddress != null) {
      return cached_remoteAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.remoteAddress());
    cached_remoteAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    if (cached_localAddress != null) {
      return cached_localAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.localAddress());
    cached_localAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String absoluteURI() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.absoluteURI());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Convenience method for receiving the entire request body in one piece.\n <p>\n This saves the user having to manually setting a data and end handler and append the chunks of the body until\n the whole body received. Don't use this if your request body is large - you could potentially run out of RAM.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest bodyHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("bodyHandler")@DocAnnotation$annotation$(description = "This handler will be called after all the body has been received\n") Callable<?> bodyHandler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = bodyHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        bodyHandler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.bodyHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Get a net socket for the underlying connection of this request.\n <p>\n USE THIS WITH CAUTION!\n <p>\n Once you have called this method, you must handle writing to the connection yourself using the net socket,\n the server request instance will no longer be usable as normal.\n Writing to the socket directly if you don't know what you're doing can easily break the HTTP protocol.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket netSocket() {
    if (cached_netSocket != null) {
      return cached_netSocket;
    }
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.netSocket());
    cached_netSocket = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Call this with true if you are expecting a multi-part body to be submitted in the request.\n This must be called before the body of the request has been received\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest setExpectMultipart(
    final @TypeInfo("ceylon.language::Boolean") @Name("expect")@DocAnnotation$annotation$(description = "true - if you are expecting a multi-part body\n") boolean expect) {
    boolean arg_0 = expect;
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.setExpectMultipart(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isExpectMultipart() {
    boolean ret = delegate.isExpectMultipart();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set an upload handler. The handler will get notified once a new file upload was received to allow you to deal\n with the file upload.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest uploadHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpServerFileUpload)?") @Name("uploadHandler") Callable<?> uploadHandler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> arg_0 = uploadHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload>() {
      public void handle(io.vertx.core.http.HttpServerFileUpload event) {
        uploadHandler.$call$((Object)io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.uploadHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Returns a map of all form attributes in the request.\n <p>\n Be aware that the attributes will only be available after the whole body has been received, i.e. after\n the request end handler has been called.\n <p>\n [setExpectMultipart](../http/HttpServerRequest.type.html#setExpectMultipart) must be called first before trying to get the form attributes.\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap formAttributes() {
    if (cached_formAttributes != null) {
      return cached_formAttributes;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.formAttributes());
    cached_formAttributes = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return the first form attribute value with the specified name\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getFormAttribute(
    final @TypeInfo("ceylon.language::String") @Name("attributeName")@DocAnnotation$annotation$(description = "the attribute name\n") ceylon.language.String attributeName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(attributeName);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getFormAttribute(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Upgrade the connection to a WebSocket connection.\n <p>\n This is an alternative way of handling WebSockets and can only be used if no websocket handlers are set on the\n Http server, and can only be used during the upgrade request during the WebSocket handshake.\n")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket upgrade() {
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.upgrade());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Has the request ended? I.e. has the entire request, including the body been read?\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isEnded() {
    boolean ret = delegate.isEnded();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set a custom frame handler. The handler will get notified when the http stream receives an custom HTTP/2\n frame. HTTP/2 permits extension of the protocol.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest customFrameHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpFrame)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpFrame> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpFrame>() {
      public void handle(io.vertx.core.http.HttpFrame event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.HttpFrame.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(delegate.customFrameHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection connection() {
    if (cached_connection != null) {
      return cached_connection;
    }
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.connection());
    cached_connection = ret;
    return ret;
  }

}
