import java.lang {
  Void_=Void,
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.core.streams {
  WriteStream_=WriteStream,
  ReadStream_=ReadStream
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
import io.vertx.core.net {
  SocketAddress_=SocketAddress
}
import io.vertx.core.http {
  WebSocketBase_=WebSocketBase,
  WebSocketFrame_=WebSocketFrame
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.http.WebSocketBase */
shared interface WebSocketBase satisfies ReadStream<Buffer>& WriteStream<Buffer> {

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
/* Generated from io.vertx.core.http.WebSocketBase */
