import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  ServerWebSocket
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
import io.vertx.core.http {
  ServerWebSocketStream_=ServerWebSocketStream
}
/* Generated from io.vertx.core.http.ServerWebSocketStream */
shared abstract class ServerWebSocketStream(ServerWebSocketStream_ delegate) satisfies Delegating
  & ReadStream<ServerWebSocket> {

  ServerWebSocketStream exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocketStream(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  ServerWebSocketStream handler_impl([Anything(ServerWebSocket)] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocketStream(*<[Anything(ServerWebSocket)]>) handler = flatten(handler_impl);

  ServerWebSocketStream pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocketStream(*<[]>) pause = flatten(pause_impl);

  ServerWebSocketStream resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocketStream(*<[]>) resume = flatten(resume_impl);

  ServerWebSocketStream endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual ServerWebSocketStream(*<[Anything()]>) endHandler = flatten(endHandler_impl);

}
