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
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) endHandler;
  shared actual formal Anything(*<[]>) write;
  shared actual formal Anything(*<[]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[]>) drainHandler;
  shared actual formal Anything(*<[]>) writeFrame;
  shared actual formal Anything(*<[]>) writeFinalTextFrame;
  shared actual formal Anything(*<[]>) writeFinalBinaryFrame;
  shared actual formal Anything(*<[]>) writeBinaryMessage;
  shared actual formal Anything(*<[]>) closeHandler;
  shared actual formal Anything(*<[]>) frameHandler;
  shared formal Anything(*<[]>) uri;
  shared formal Anything(*<[]>) path;
  shared formal Anything(*<[]>) query;
  shared formal Anything(*<[]>) headers;
  shared formal Anything(*<[]>) reject;
}
