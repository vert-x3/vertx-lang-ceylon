import io.vertx.core.streams {
  ReadStream_=ReadStream
}
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
  ServerWebSocketStream_=ServerWebSocketStream,
  ServerWebSocket_=ServerWebSocket
}
/* Generated from io.vertx.core.http.ServerWebSocketStream */
shared interface ServerWebSocketStream satisfies ReadStream<ServerWebSocket> {

  shared actual formal ServerWebSocketStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal ServerWebSocketStream(*<[Anything(ServerWebSocket)]>) handler;
  shared actual formal ServerWebSocketStream(*<[]>) pause;
  shared actual formal ServerWebSocketStream(*<[]>) resume;
  shared actual formal ServerWebSocketStream(*<[Anything()]>) endHandler;
}
/* Generated from io.vertx.core.http.ServerWebSocketStream */

shared abstract class ServerWebSocketStream_Impl(ServerWebSocketStream_ delegate) satisfies ServerWebSocketStream & Delegating<ServerWebSocketStream_> {

  shared actual ServerWebSocketStream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual ServerWebSocketStream(*<[Anything(ServerWebSocket)]>) handler => flatten(handler_impl);
  shared actual ServerWebSocketStream(*<[]>) pause => flatten(pause_impl);
  shared actual ServerWebSocketStream(*<[]>) resume => flatten(resume_impl);
  shared actual ServerWebSocketStream(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  ServerWebSocketStream exceptionHandler_impl([Anything(Throwable)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocketStream handler_impl([Anything(ServerWebSocket)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocketStream pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocketStream resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocketStream endHandler_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
