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
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) endHandler;
  shared actual formal Anything(*<[]>) write;
  shared actual formal Anything(*<[]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[]>) drainHandler;
  shared formal Anything(*<[]>) binaryHandlerID;
  shared formal Anything(*<[]>) textHandlerID;
  shared formal Anything(*<[]>) writeFrame;
  shared formal Anything(*<[]>) writeFinalTextFrame;
  shared formal Anything(*<[]>) writeFinalBinaryFrame;
  shared formal Anything(*<[]>) writeBinaryMessage;
  shared formal Anything(*<[]>) closeHandler;
  shared formal Anything(*<[]>) frameHandler;
  shared formal Anything(*<[]>) close;
  shared formal Anything(*<[]>) remoteAddress;
  shared formal Anything(*<[]>) localAddress;
}
