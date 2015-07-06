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

  HttpServerRequestStream requestStream_impl([] args) {
    throw Exception("implement me");
  }

  shared  HttpServerRequestStream(*<[]>) requestStream = flatten(requestStream_impl);

  HttpServer requestHandler_impl([Anything(HttpServerRequest)] args) {
    throw Exception("implement me");
  }

  shared  HttpServer(*<[Anything(HttpServerRequest)]>) requestHandler = flatten(requestHandler_impl);

  ServerWebSocketStream websocketStream_impl([] args) {
    throw Exception("implement me");
  }

  shared  ServerWebSocketStream(*<[]>) websocketStream = flatten(websocketStream_impl);

  HttpServer websocketHandler_impl([Anything(ServerWebSocket)] args) {
    throw Exception("implement me");
  }

  shared  HttpServer(*<[Anything(ServerWebSocket)]>) websocketHandler = flatten(websocketHandler_impl);

  HttpServer listen_impl([]|[Integer]|[Anything(Throwable|HttpServer)]|[Integer,String]|[Integer,Anything(Throwable|HttpServer)]|[Integer,String,Anything(Throwable|HttpServer)] args) {
    throw Exception("implement me");
  }

  shared  HttpServer(*<[]|[Integer]|[Anything(Throwable|HttpServer)]|[Integer,String]|[Integer,Anything(Throwable|HttpServer)]|[Integer,String,Anything(Throwable|HttpServer)]>) listen = flatten(listen_impl);

  Anything close_impl([]|[Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]|[Anything(Throwable?)]>) close = flatten(close_impl);

}
