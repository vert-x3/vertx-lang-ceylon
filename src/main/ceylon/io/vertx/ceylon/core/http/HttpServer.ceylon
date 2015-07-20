import java.lang {
  String_=String
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  HttpServerRequest,
  ServerWebSocket,
  HttpServerRequestStream,
  ServerWebSocketStream
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.core.http {
  HttpServer_=HttpServer
}
/* Generated from io.vertx.core.http.HttpServer */
shared interface HttpServer satisfies Measured {

  shared formal HttpServerRequestStream(*<[]>) requestStream;
  shared formal HttpServer(*<[Anything(HttpServerRequest)]>) requestHandler;
  shared formal ServerWebSocketStream(*<[]>) websocketStream;
  shared formal HttpServer(*<[Anything(ServerWebSocket)]>) websocketHandler;
  shared formal HttpServer(*<[]|[Integer]|[Anything(Throwable|HttpServer)]|[Integer,String]|[Integer,Anything(Throwable|HttpServer)]|[Integer,String,Anything(Throwable|HttpServer)]>) listen;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
}
/* Generated from io.vertx.core.http.HttpServer */

shared abstract class HttpServer_Impl(HttpServer delegate) satisfies HttpServer & Delegating<HttpServer> {

  shared actual HttpServerRequestStream(*<[]>) requestStream => flatten(requestStream_impl);
  shared actual HttpServer(*<[Anything(HttpServerRequest)]>) requestHandler => flatten(requestHandler_impl);
  shared actual ServerWebSocketStream(*<[]>) websocketStream => flatten(websocketStream_impl);
  shared actual HttpServer(*<[Anything(ServerWebSocket)]>) websocketHandler => flatten(websocketHandler_impl);
  shared actual HttpServer(*<[]|[Integer]|[Anything(Throwable|HttpServer)]|[Integer,String]|[Integer,Anything(Throwable|HttpServer)]|[Integer,String,Anything(Throwable|HttpServer)]>) listen => flatten(listen_impl);
  shared actual Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);

  HttpServerRequestStream requestStream_impl([] args) {
    Anything v = delegate.requestStream();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServer requestHandler_impl([Anything(HttpServerRequest)] args) {
    Anything v = delegate.requestHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocketStream websocketStream_impl([] args) {
    Anything v = delegate.websocketStream();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServer websocketHandler_impl([Anything(ServerWebSocket)] args) {
    Anything v = delegate.websocketHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServer listen_impl([]|[Integer]|[Anything(Throwable|HttpServer)]|[Integer,String]|[Integer,Anything(Throwable|HttpServer)]|[Integer,String,Anything(Throwable|HttpServer)] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [Integer] args) {
      // Invoke method
    }
    if (is [Anything(Throwable|HttpServer)] args) {
      // Invoke method
    }
    if (is [Integer,String] args) {
      // Invoke method
    }
    if (is [Integer,Anything(Throwable|HttpServer)] args) {
      // Invoke method
    }
    if (is [Integer,String,Anything(Throwable|HttpServer)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [Anything(Throwable?)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
