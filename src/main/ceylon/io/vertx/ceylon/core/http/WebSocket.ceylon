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
shared interface WebSocket satisfies WebSocketBase {

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
/* Generated from io.vertx.core.http.WebSocket */

shared abstract class WebSocket_Impl(WebSocket delegate) satisfies WebSocket & Delegating<WebSocket> {

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
    Anything v = delegate.exceptionHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket handler_impl([Anything(Buffer)] args) {
    Anything v = delegate.handler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket endHandler_impl([Anything()] args) {
    Anything v = delegate.endHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket write_impl([Buffer] args) {
    assert(is Delegating<Buffer> arg_0 = args[0]);
    Anything v = delegate.write(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket setWriteQueueMaxSize_impl([Integer] args) {
    Anything v = delegate.setWriteQueueMaxSize(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket drainHandler_impl([Anything()] args) {
    Anything v = delegate.drainHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket writeFrame_impl([WebSocketFrame] args) {
    assert(is Delegating<WebSocketFrame> arg_0 = args[0]);
    Anything v = delegate.writeFrame(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket writeFinalTextFrame_impl([String] args) {
    Anything v = delegate.writeFinalTextFrame(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket writeFinalBinaryFrame_impl([Buffer] args) {
    assert(is Delegating<Buffer> arg_0 = args[0]);
    Anything v = delegate.writeFinalBinaryFrame(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket writeBinaryMessage_impl([Buffer] args) {
    assert(is Delegating<Buffer> arg_0 = args[0]);
    Anything v = delegate.writeBinaryMessage(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket closeHandler_impl([Anything()] args) {
    Anything v = delegate.closeHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocket frameHandler_impl([Anything(WebSocketFrame)] args) {
    Anything v = delegate.frameHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
