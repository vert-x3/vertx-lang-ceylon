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
  shared formal Anything(*<[]>) requestStream;
  shared formal Anything(*<[]>) requestHandler;
  shared formal Anything(*<[]>) websocketStream;
  shared formal Anything(*<[]>) websocketHandler;
  shared formal Anything(*<[]|[]|[]|[]|[]|[]>) listen;
  shared formal Anything(*<[]|[]>) close;
}
