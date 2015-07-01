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
import io.vertx.ceylon.core.http {
  WebSocketFrame
}
/* Generated from io.vertx.core.http.ServerWebSocket */
shared abstract class ServerWebSocket() satisfies WebSocketBase {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal Anything(*<[Anything(Buffer)]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[Anything()]>) endHandler;
  shared actual formal Anything(*<[Buffer]>) write;
  shared actual formal Anything(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[Anything()]>) drainHandler;
  shared actual formal Anything(*<[WebSocketFrame]>) writeFrame;
  shared actual formal Anything(*<[String]>) writeFinalTextFrame;
  shared actual formal Anything(*<[Buffer]>) writeFinalBinaryFrame;
  shared actual formal Anything(*<[Buffer]>) writeBinaryMessage;
  shared actual formal Anything(*<[Anything()]>) closeHandler;
  shared actual formal Anything(*<[Anything(WebSocketFrame)]>) frameHandler;
  shared formal Anything(*<[]>) uri;
  shared formal Anything(*<[]>) path;
  shared formal Anything(*<[]>) query;
  shared formal Anything(*<[]>) headers;
  shared formal Anything(*<[]>) reject;
}
