import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  WebSocket
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
import io.vertx.core.http {
  WebSocketStream_=WebSocketStream
}
/* Generated from io.vertx.core.http.WebSocketStream */
shared abstract class WebSocketStream(WebSocketStream_ delegate) satisfies Delegating
  & ReadStream<WebSocket> {
  shared actual formal WebSocketStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal WebSocketStream(*<[Anything(WebSocket)]>) handler;
  shared actual formal WebSocketStream(*<[]>) pause;
  shared actual formal WebSocketStream(*<[]>) resume;
  shared actual formal WebSocketStream(*<[Anything()]>) endHandler;
}
