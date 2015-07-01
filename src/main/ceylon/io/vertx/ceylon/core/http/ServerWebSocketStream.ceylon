import io.vertx.ceylon.core.http {
  ServerWebSocket
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.http.ServerWebSocketStream */
shared abstract class ServerWebSocketStream() satisfies ReadStream<ServerWebSocket> {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal Anything(*<[Anything(ServerWebSocket)]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[Anything()]>) endHandler;
}
