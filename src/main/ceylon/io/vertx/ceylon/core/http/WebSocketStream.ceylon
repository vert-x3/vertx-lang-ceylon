import io.vertx.core.streams {
  ReadStream_=ReadStream
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  WebSocket
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
import io.vertx.core.http {
  WebSocketStream_=WebSocketStream,
  WebSocket_=WebSocket
}
/* Generated from io.vertx.core.http.WebSocketStream */
shared interface WebSocketStream satisfies ReadStream<WebSocket> {

  shared actual formal WebSocketStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal WebSocketStream(*<[Anything(WebSocket)]>) handler;
  shared actual formal WebSocketStream(*<[]>) pause;
  shared actual formal WebSocketStream(*<[]>) resume;
  shared actual formal WebSocketStream(*<[Anything()]>) endHandler;
}
/* Generated from io.vertx.core.http.WebSocketStream */

shared abstract class WebSocketStream_Impl(WebSocketStream_ delegate) satisfies WebSocketStream & Delegating<WebSocketStream_> {

  shared actual WebSocketStream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual WebSocketStream(*<[Anything(WebSocket)]>) handler => flatten(handler_impl);
  shared actual WebSocketStream(*<[]>) pause => flatten(pause_impl);
  shared actual WebSocketStream(*<[]>) resume => flatten(resume_impl);
  shared actual WebSocketStream(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  WebSocketStream exceptionHandler_impl([Anything(Throwable)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocketStream handler_impl([Anything(WebSocket)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocketStream pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocketStream resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocketStream endHandler_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
