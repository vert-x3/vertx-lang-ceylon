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
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.http.WebSocketBase */
shared interface WebSocketBase satisfies ReadStream<Buffer> & WriteStream<Buffer> {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal Anything(*<[Anything(Buffer)]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[Anything()]>) endHandler;
  shared actual formal Anything(*<[Buffer]>) write;
  shared actual formal Anything(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[Anything()]>) drainHandler;
  shared formal Anything(*<[]>) binaryHandlerID;
  shared formal Anything(*<[]>) textHandlerID;
  shared formal Anything(*<[WebSocketFrame]>) writeFrame;
  shared formal Anything(*<[String]>) writeFinalTextFrame;
  shared formal Anything(*<[Buffer]>) writeFinalBinaryFrame;
  shared formal Anything(*<[Buffer]>) writeBinaryMessage;
  shared formal Anything(*<[Anything()]>) closeHandler;
  shared formal Anything(*<[Anything(WebSocketFrame)]>) frameHandler;
  shared formal Anything(*<[]>) close;
  shared formal Anything(*<[]>) remoteAddress;
  shared formal Anything(*<[]>) localAddress;
}
