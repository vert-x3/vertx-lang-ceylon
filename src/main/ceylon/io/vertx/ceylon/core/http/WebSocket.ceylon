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

  shared actual WebSocket(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual WebSocket(*<[Anything(Buffer)]>) handler => flatten(handler_impl);

  shared actual WebSocket(*<[]>) pause => flatten(pause_impl);

  shared actual WebSocket(*<[]>) resume => flatten(resume_impl);

  shared actual WebSocket(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  shared actual WebSocket(*<[Buffer]>) write => flatten(write_impl);

  shared actual WebSocket(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);

  shared actual WebSocket(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);

  shared actual WebSocket(*<[WebSocketFrame]>) writeFrame => flatten(writeFrame_impl);

  shared actual WebSocket(*<[String]>) writeFinalTextFrame => flatten(writeFinalTextFrame_impl);

  shared actual WebSocket(*<[Buffer]>) writeFinalBinaryFrame => flatten(writeFinalBinaryFrame_impl);

  shared actual WebSocket(*<[Buffer]>) writeBinaryMessage => flatten(writeBinaryMessage_impl);

  shared actual WebSocket(*<[Anything()]>) closeHandler => flatten(closeHandler_impl);

  shared actual WebSocket(*<[Anything(WebSocketFrame)]>) frameHandler => flatten(frameHandler_impl);

  WebSocket exceptionHandler_impl([Anything(Throwable)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket handler_impl([Anything(Buffer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket pause_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket resume_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket endHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket write_impl([Buffer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket setWriteQueueMaxSize_impl([Integer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket drainHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket writeFrame_impl([WebSocketFrame] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket writeFinalTextFrame_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket writeFinalBinaryFrame_impl([Buffer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket writeBinaryMessage_impl([Buffer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket closeHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket frameHandler_impl([Anything(WebSocketFrame)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
