import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.core {
  MultiMap_=MultiMap
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
import io.vertx.core.net {
  SocketAddress_=SocketAddress
}
import io.vertx.core.http {
  ServerWebSocket_=ServerWebSocket,
  WebSocketBase_=WebSocketBase,
  WebSocketFrame_=WebSocketFrame
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.http.ServerWebSocket */
shared interface ServerWebSocket satisfies WebSocketBase {

  shared actual formal ServerWebSocket(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal ServerWebSocket(*<[Anything(Buffer)]>) handler;
  shared actual formal ServerWebSocket(*<[]>) pause;
  shared actual formal ServerWebSocket(*<[]>) resume;
  shared actual formal ServerWebSocket(*<[Anything()]>) endHandler;
  shared actual formal ServerWebSocket(*<[Buffer]>) write;
  shared actual formal ServerWebSocket(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal ServerWebSocket(*<[Anything()]>) drainHandler;
  shared actual formal ServerWebSocket(*<[WebSocketFrame]>) writeFrame;
  shared actual formal ServerWebSocket(*<[String]>) writeFinalTextFrame;
  shared actual formal ServerWebSocket(*<[Buffer]>) writeFinalBinaryFrame;
  shared actual formal ServerWebSocket(*<[Buffer]>) writeBinaryMessage;
  shared actual formal ServerWebSocket(*<[Anything()]>) closeHandler;
  shared actual formal ServerWebSocket(*<[Anything(WebSocketFrame)]>) frameHandler;
  shared formal String(*<[]>) uri;
  shared formal String(*<[]>) path;
  shared formal String(*<[]>) query;
  shared formal MultiMap(*<[]>) headers;
  shared formal Anything(*<[]>) reject;
}
/* Generated from io.vertx.core.http.ServerWebSocket */

shared abstract class ServerWebSocket_Impl(ServerWebSocket_ delegate) satisfies ServerWebSocket & Delegating<ServerWebSocket_> {

  shared actual ServerWebSocket(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual ServerWebSocket(*<[Anything(Buffer)]>) handler => flatten(handler_impl);
  shared actual ServerWebSocket(*<[]>) pause => flatten(pause_impl);
  shared actual ServerWebSocket(*<[]>) resume => flatten(resume_impl);
  shared actual ServerWebSocket(*<[Anything()]>) endHandler => flatten(endHandler_impl);
  shared actual ServerWebSocket(*<[Buffer]>) write => flatten(write_impl);
  shared actual ServerWebSocket(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);
  shared actual ServerWebSocket(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);
  shared actual ServerWebSocket(*<[WebSocketFrame]>) writeFrame => flatten(writeFrame_impl);
  shared actual ServerWebSocket(*<[String]>) writeFinalTextFrame => flatten(writeFinalTextFrame_impl);
  shared actual ServerWebSocket(*<[Buffer]>) writeFinalBinaryFrame => flatten(writeFinalBinaryFrame_impl);
  shared actual ServerWebSocket(*<[Buffer]>) writeBinaryMessage => flatten(writeBinaryMessage_impl);
  shared actual ServerWebSocket(*<[Anything()]>) closeHandler => flatten(closeHandler_impl);
  shared actual ServerWebSocket(*<[Anything(WebSocketFrame)]>) frameHandler => flatten(frameHandler_impl);
  shared actual String(*<[]>) uri => flatten(uri_impl);
  shared actual String(*<[]>) path => flatten(path_impl);
  shared actual String(*<[]>) query => flatten(query_impl);
  shared actual MultiMap(*<[]>) headers => flatten(headers_impl);
  shared actual Anything(*<[]>) reject => flatten(reject_impl);

  ServerWebSocket exceptionHandler_impl([Anything(Throwable)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket handler_impl([Anything(Buffer)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket endHandler_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket write_impl([Buffer] args) {
    assert(is Delegating<Buffer_> arg_0 = args[0]);
    Anything v = delegate.write(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket setWriteQueueMaxSize_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.setWriteQueueMaxSize(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket drainHandler_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.drainHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket writeFrame_impl([WebSocketFrame] args) {
    assert(is Delegating<WebSocketFrame_> arg_0 = args[0]);
    Anything v = delegate.writeFrame(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket writeFinalTextFrame_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.writeFinalTextFrame(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket writeFinalBinaryFrame_impl([Buffer] args) {
    assert(is Delegating<Buffer_> arg_0 = args[0]);
    Anything v = delegate.writeFinalBinaryFrame(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket writeBinaryMessage_impl([Buffer] args) {
    assert(is Delegating<Buffer_> arg_0 = args[0]);
    Anything v = delegate.writeBinaryMessage(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket closeHandler_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.closeHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket frameHandler_impl([Anything(WebSocketFrame)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.frameHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String uri_impl([] args) {
    Anything v = delegate.uri();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String path_impl([] args) {
    Anything v = delegate.path();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String query_impl([] args) {
    Anything v = delegate.query();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    Anything v = delegate.headers();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything reject_impl([] args) {
    Anything v = delegate.reject();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
