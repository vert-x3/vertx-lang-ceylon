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
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  WebSocketBase,
  WebSocketFrame
}
import io.vertx.core.http {
  ServerWebSocket_=ServerWebSocket
}
/* Generated from io.vertx.core.http.ServerWebSocket */
shared abstract class ServerWebSocket(ServerWebSocket_ delegate) satisfies Delegating
  & WebSocketBase {

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

  shared  String(*<[]>) uri => flatten(uri_impl);

  shared  String(*<[]>) path => flatten(path_impl);

  shared  String(*<[]>) query => flatten(query_impl);

  shared  MultiMap(*<[]>) headers => flatten(headers_impl);

  shared  Anything(*<[]>) reject => flatten(reject_impl);

  ServerWebSocket exceptionHandler_impl([Anything(Throwable)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket handler_impl([Anything(Buffer)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket pause_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket resume_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket endHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket write_impl([Buffer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket setWriteQueueMaxSize_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket drainHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket writeFrame_impl([WebSocketFrame] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket writeFinalTextFrame_impl([String] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket writeFinalBinaryFrame_impl([Buffer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket writeBinaryMessage_impl([Buffer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket closeHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket frameHandler_impl([Anything(WebSocketFrame)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String uri_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String path_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String query_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything reject_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
