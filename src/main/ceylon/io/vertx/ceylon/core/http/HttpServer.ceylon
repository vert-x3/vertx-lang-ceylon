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
shared class HttpServer() satisfies Measured {
  shared default void requestStream() {
  }
  shared default void requestHandler() {
  }
  shared default void websocketStream() {
  }
  shared default void websocketHandler() {
  }
  shared default void listen() {
  }
  shared default void close() {
  }
}
