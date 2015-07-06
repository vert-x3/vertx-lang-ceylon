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
  WebSocketBase,
  WebSocketFrame
}
import io.vertx.core.http {
  WebSocket_=WebSocket
}
/* Generated from io.vertx.core.http.WebSocket */
shared abstract class WebSocket(WebSocket_ delegate) satisfies Delegating
  & WebSocketBase {

  WebSocket exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  WebSocket handler_impl([Anything(Buffer)] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[Anything(Buffer)]>) handler = flatten(handler_impl);

  WebSocket pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[]>) pause = flatten(pause_impl);

  WebSocket resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[]>) resume = flatten(resume_impl);

  WebSocket endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  WebSocket write_impl([Buffer] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[Buffer]>) write = flatten(write_impl);

  WebSocket setWriteQueueMaxSize_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[Integer]>) setWriteQueueMaxSize = flatten(setWriteQueueMaxSize_impl);

  WebSocket drainHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[Anything()]>) drainHandler = flatten(drainHandler_impl);

  WebSocket writeFrame_impl([WebSocketFrame] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[WebSocketFrame]>) writeFrame = flatten(writeFrame_impl);

  WebSocket writeFinalTextFrame_impl([String] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[String]>) writeFinalTextFrame = flatten(writeFinalTextFrame_impl);

  WebSocket writeFinalBinaryFrame_impl([Buffer] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[Buffer]>) writeFinalBinaryFrame = flatten(writeFinalBinaryFrame_impl);

  WebSocket writeBinaryMessage_impl([Buffer] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[Buffer]>) writeBinaryMessage = flatten(writeBinaryMessage_impl);

  WebSocket closeHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[Anything()]>) closeHandler = flatten(closeHandler_impl);

  WebSocket frameHandler_impl([Anything(WebSocketFrame)] args) {
    throw Exception("implement me");
  }

  shared actual WebSocket(*<[Anything(WebSocketFrame)]>) frameHandler = flatten(frameHandler_impl);

}
