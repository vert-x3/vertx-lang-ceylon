import java.lang {
  String_=String
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
/* Generated from io.vertx.core.http.HttpServer */
shared abstract class HttpServer() satisfies Measured {
  shared formal HttpServerRequestStream(*<[]>) requestStream;
  shared formal HttpServer(*<[Anything(HttpServerRequest)]>) requestHandler;
  shared formal ServerWebSocketStream(*<[]>) websocketStream;
  shared formal HttpServer(*<[Anything(ServerWebSocket)]>) websocketHandler;
  shared formal HttpServer(*<[]|[Integer]|[Anything(Throwable|HttpServer)]|[Integer,String]|[Integer,Anything(Throwable|HttpServer)]|[Integer,String,Anything(Throwable|HttpServer)]>) listen;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
}
