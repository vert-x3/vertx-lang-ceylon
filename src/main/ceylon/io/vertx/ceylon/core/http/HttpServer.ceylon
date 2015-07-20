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
shared abstract class HttpServer(HttpServer_ delegate) satisfies Delegating
  & Measured {

  shared  HttpServerRequestStream(*<[]>) requestStream => flatten(requestStream_impl);

  shared  HttpServer(*<[Anything(HttpServerRequest)]>) requestHandler => flatten(requestHandler_impl);

  shared  ServerWebSocketStream(*<[]>) websocketStream => flatten(websocketStream_impl);

  shared  HttpServer(*<[Anything(ServerWebSocket)]>) websocketHandler => flatten(websocketHandler_impl);

  shared  HttpServer(*<[]|[Integer]|[Anything(Throwable|HttpServer)]|[Integer,String]|[Integer,Anything(Throwable|HttpServer)]|[Integer,String,Anything(Throwable|HttpServer)]>) listen => flatten(listen_impl);

  shared  Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);

  HttpServerRequestStream requestStream_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServer requestHandler_impl([Anything(HttpServerRequest)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocketStream websocketStream_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServer websocketHandler_impl([Anything(ServerWebSocket)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServer listen_impl([]|[Integer]|[Anything(Throwable|HttpServer)]|[Integer,String]|[Integer,Anything(Throwable|HttpServer)]|[Integer,String,Anything(Throwable|HttpServer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
