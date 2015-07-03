import io.vertx.ceylon.core.http {
  WebSocket
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.http.WebSocketStream */
shared abstract class WebSocketStream() satisfies ReadStream<WebSocket> {
  shared actual formal WebSocketStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal WebSocketStream(*<[Anything(WebSocket)]>) handler;
  shared actual formal WebSocketStream(*<[]>) pause;
  shared actual formal WebSocketStream(*<[]>) resume;
  shared actual formal WebSocketStream(*<[Anything()]>) endHandler;
}
