import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
import io.vertx.ceylon.core.http {
  WebSocketFrame
}
/* Generated from io.vertx.core.http.WebSocket */
shared abstract class WebSocket() satisfies WebSocketBase {
  shared actual formal WebSocket(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal WebSocket(*<[Anything(Buffer)]>) handler;
  shared actual formal WebSocket(*<[]>) pause;
  shared actual formal WebSocket(*<[]>) resume;
  shared actual formal WebSocket(*<[Anything()]>) endHandler;
  shared actual formal WebSocket(*<[Buffer]>) write;
  shared actual formal WebSocket(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal WebSocket(*<[Anything()]>) drainHandler;
  shared actual formal WebSocket(*<[WebSocketFrame]>) writeFrame;
  shared actual formal WebSocket(*<[String]>) writeFinalTextFrame;
  shared actual formal WebSocket(*<[Buffer]>) writeFinalBinaryFrame;
  shared actual formal WebSocket(*<[Buffer]>) writeBinaryMessage;
  shared actual formal WebSocket(*<[Anything()]>) closeHandler;
  shared actual formal WebSocket(*<[Anything(WebSocketFrame)]>) frameHandler;
}
