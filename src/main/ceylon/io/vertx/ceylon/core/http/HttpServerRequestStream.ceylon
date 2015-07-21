import io.vertx.core.streams {
  ReadStream_=ReadStream
}
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
  HttpServerRequestStream_=HttpServerRequestStream,
  HttpServerRequest_=HttpServerRequest
}
/* Generated from io.vertx.core.http.HttpServerRequestStream */
shared interface HttpServerRequestStream satisfies ReadStream<HttpServerRequest> {

  shared actual formal HttpServerRequestStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal HttpServerRequestStream(*<[Anything(HttpServerRequest)]>) handler;
  shared actual formal HttpServerRequestStream(*<[]>) pause;
  shared actual formal HttpServerRequestStream(*<[]>) resume;
  shared actual formal HttpServerRequestStream(*<[Anything()]>) endHandler;
}
/* Generated from io.vertx.core.http.HttpServerRequestStream */

shared abstract class HttpServerRequestStream_Impl(HttpServerRequestStream_ delegate) satisfies HttpServerRequestStream & Delegating<HttpServerRequestStream_> {

  shared actual HttpServerRequestStream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual HttpServerRequestStream(*<[Anything(HttpServerRequest)]>) handler => flatten(handler_impl);
  shared actual HttpServerRequestStream(*<[]>) pause => flatten(pause_impl);
  shared actual HttpServerRequestStream(*<[]>) resume => flatten(resume_impl);
  shared actual HttpServerRequestStream(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  HttpServerRequestStream exceptionHandler_impl([Anything(Throwable)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequestStream handler_impl([Anything(HttpServerRequest)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequestStream pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequestStream resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequestStream endHandler_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
