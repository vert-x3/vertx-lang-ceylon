import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  WebSocketFrame
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
import io.vertx.core.http {
  WebSocketBase_=WebSocketBase
}
/* Generated from io.vertx.core.http.WebSocketBase */
shared interface WebSocketBase satisfies Delegating
  & ReadStream<Buffer>
  & WriteStream<Buffer> {
  shared actual formal WebSocketBase(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal WebSocketBase(*<[Anything(Buffer)]>) handler;
  shared actual formal WebSocketBase(*<[]>) pause;
  shared actual formal WebSocketBase(*<[]>) resume;
  shared actual formal WebSocketBase(*<[Anything()]>) endHandler;
  shared actual formal WebSocketBase(*<[Buffer]>) write;
  shared actual formal WebSocketBase(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal WebSocketBase(*<[Anything()]>) drainHandler;
  shared formal String(*<[]>) binaryHandlerID;
  shared formal String(*<[]>) textHandlerID;
  shared formal WebSocketBase(*<[WebSocketFrame]>) writeFrame;
  shared formal WebSocketBase(*<[String]>) writeFinalTextFrame;
  shared formal WebSocketBase(*<[Buffer]>) writeFinalBinaryFrame;
  shared formal WebSocketBase(*<[Buffer]>) writeBinaryMessage;
  shared formal WebSocketBase(*<[Anything()]>) closeHandler;
  shared formal WebSocketBase(*<[Anything(WebSocketFrame)]>) frameHandler;
  shared formal Anything(*<[]>) close;
  shared formal SocketAddress(*<[]>) remoteAddress;
  shared formal SocketAddress(*<[]>) localAddress;
}
