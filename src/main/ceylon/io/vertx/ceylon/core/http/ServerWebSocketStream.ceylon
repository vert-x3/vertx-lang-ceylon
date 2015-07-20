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

  shared actual ServerWebSocketStream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual ServerWebSocketStream(*<[Anything(ServerWebSocket)]>) handler => flatten(handler_impl);

  shared actual ServerWebSocketStream(*<[]>) pause => flatten(pause_impl);

  shared actual ServerWebSocketStream(*<[]>) resume => flatten(resume_impl);

  shared actual ServerWebSocketStream(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  ServerWebSocketStream exceptionHandler_impl([Anything(Throwable)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocketStream handler_impl([Anything(ServerWebSocket)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocketStream pause_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocketStream resume_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocketStream endHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
