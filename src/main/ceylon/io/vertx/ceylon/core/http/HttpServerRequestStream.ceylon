import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  HttpServerRequest
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
import io.vertx.core.http {
  HttpServerRequestStream_=HttpServerRequestStream
}
/* Generated from io.vertx.core.http.HttpServerRequestStream */
shared abstract class HttpServerRequestStream(HttpServerRequestStream_ delegate) satisfies Delegating
  & ReadStream<HttpServerRequest> {

  shared actual HttpServerRequestStream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual HttpServerRequestStream(*<[Anything(HttpServerRequest)]>) handler => flatten(handler_impl);

  shared actual HttpServerRequestStream(*<[]>) pause => flatten(pause_impl);

  shared actual HttpServerRequestStream(*<[]>) resume => flatten(resume_impl);

  shared actual HttpServerRequestStream(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  HttpServerRequestStream exceptionHandler_impl([Anything(Throwable)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequestStream handler_impl([Anything(HttpServerRequest)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequestStream pause_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequestStream resume_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequestStream endHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
