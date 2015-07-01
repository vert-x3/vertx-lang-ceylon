import io.vertx.ceylon.core.http {
  WebSocket
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.http.WebSocketStream */
shared abstract class WebSocketStream() satisfies ReadStream<WebSocket> {
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) endHandler;
}
