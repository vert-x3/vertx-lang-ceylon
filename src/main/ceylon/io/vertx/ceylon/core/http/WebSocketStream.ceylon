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
  WebSocketStream_=WebSocketStream
}
/* Generated from io.vertx.core.http.WebSocketStream */
shared abstract class WebSocketStream(WebSocketStream_ delegate) satisfies Delegating
  & ReadStream<WebSocket> {

  shared actual WebSocketStream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual WebSocketStream(*<[Anything(WebSocket)]>) handler => flatten(handler_impl);

  shared actual WebSocketStream(*<[]>) pause => flatten(pause_impl);

  shared actual WebSocketStream(*<[]>) resume => flatten(resume_impl);

  shared actual WebSocketStream(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  WebSocketStream exceptionHandler_impl([Anything(Throwable)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocketStream handler_impl([Anything(WebSocket)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocketStream pause_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocketStream resume_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocketStream endHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
