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

  HttpServerRequestStream exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerRequestStream(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  HttpServerRequestStream handler_impl([Anything(HttpServerRequest)] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerRequestStream(*<[Anything(HttpServerRequest)]>) handler = flatten(handler_impl);

  HttpServerRequestStream pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerRequestStream(*<[]>) pause = flatten(pause_impl);

  HttpServerRequestStream resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerRequestStream(*<[]>) resume = flatten(resume_impl);

  HttpServerRequestStream endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerRequestStream(*<[Anything()]>) endHandler = flatten(endHandler_impl);

}
