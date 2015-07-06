import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  WebSocketBase,
  WebSocketFrame
}
import io.vertx.core.http {
  ServerWebSocket_=ServerWebSocket
}
/* Generated from io.vertx.core.http.ServerWebSocket */
shared abstract class ServerWebSocket(ServerWebSocket_ delegate) satisfies Delegating
  & WebSocketBase {
  shared actual formal ServerWebSocket(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal ServerWebSocket(*<[Anything(Buffer)]>) handler;
  shared actual formal ServerWebSocket(*<[]>) pause;
  shared actual formal ServerWebSocket(*<[]>) resume;
  shared actual formal ServerWebSocket(*<[Anything()]>) endHandler;
  shared actual formal ServerWebSocket(*<[Buffer]>) write;
  shared actual formal ServerWebSocket(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal ServerWebSocket(*<[Anything()]>) drainHandler;
  shared actual formal ServerWebSocket(*<[WebSocketFrame]>) writeFrame;
  shared actual formal ServerWebSocket(*<[String]>) writeFinalTextFrame;
  shared actual formal ServerWebSocket(*<[Buffer]>) writeFinalBinaryFrame;
  shared actual formal ServerWebSocket(*<[Buffer]>) writeBinaryMessage;
  shared actual formal ServerWebSocket(*<[Anything()]>) closeHandler;
  shared actual formal ServerWebSocket(*<[Anything(WebSocketFrame)]>) frameHandler;
  shared formal String(*<[]>) uri;
  shared formal String(*<[]>) path;
  shared formal String(*<[]>) query;
  shared formal MultiMap(*<[]>) headers;
  shared formal Anything(*<[]>) reject;
}
