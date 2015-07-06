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

  WebSocketStream exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual WebSocketStream(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  WebSocketStream handler_impl([Anything(WebSocket)] args) {
    throw Exception("implement me");
  }

  shared actual WebSocketStream(*<[Anything(WebSocket)]>) handler = flatten(handler_impl);

  WebSocketStream pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual WebSocketStream(*<[]>) pause = flatten(pause_impl);

  WebSocketStream resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual WebSocketStream(*<[]>) resume = flatten(resume_impl);

  WebSocketStream endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual WebSocketStream(*<[Anything()]>) endHandler = flatten(endHandler_impl);

}
