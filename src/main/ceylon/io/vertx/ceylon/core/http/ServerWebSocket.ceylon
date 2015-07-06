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

  ServerWebSocket exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  ServerWebSocket handler_impl([Anything(Buffer)] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[Anything(Buffer)]>) handler = flatten(handler_impl);

  ServerWebSocket pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[]>) pause = flatten(pause_impl);

  ServerWebSocket resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[]>) resume = flatten(resume_impl);

  ServerWebSocket endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  ServerWebSocket write_impl([Buffer] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[Buffer]>) write = flatten(write_impl);

  ServerWebSocket setWriteQueueMaxSize_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[Integer]>) setWriteQueueMaxSize = flatten(setWriteQueueMaxSize_impl);

  ServerWebSocket drainHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[Anything()]>) drainHandler = flatten(drainHandler_impl);

  ServerWebSocket writeFrame_impl([WebSocketFrame] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[WebSocketFrame]>) writeFrame = flatten(writeFrame_impl);

  ServerWebSocket writeFinalTextFrame_impl([String] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[String]>) writeFinalTextFrame = flatten(writeFinalTextFrame_impl);

  ServerWebSocket writeFinalBinaryFrame_impl([Buffer] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[Buffer]>) writeFinalBinaryFrame = flatten(writeFinalBinaryFrame_impl);

  ServerWebSocket writeBinaryMessage_impl([Buffer] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[Buffer]>) writeBinaryMessage = flatten(writeBinaryMessage_impl);

  ServerWebSocket closeHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[Anything()]>) closeHandler = flatten(closeHandler_impl);

  ServerWebSocket frameHandler_impl([Anything(WebSocketFrame)] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocket(*<[Anything(WebSocketFrame)]>) frameHandler = flatten(frameHandler_impl);

  String uri_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) uri = flatten(uri_impl);

  String path_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) path = flatten(path_impl);

  String query_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) query = flatten(query_impl);

  MultiMap headers_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) headers = flatten(headers_impl);

  Anything reject_impl([] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]>) reject = flatten(reject_impl);

}
