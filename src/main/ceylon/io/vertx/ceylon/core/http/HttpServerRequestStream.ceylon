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
  shared actual formal HttpServerRequestStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal HttpServerRequestStream(*<[Anything(HttpServerRequest)]>) handler;
  shared actual formal HttpServerRequestStream(*<[]>) pause;
  shared actual formal HttpServerRequestStream(*<[]>) resume;
  shared actual formal HttpServerRequestStream(*<[Anything()]>) endHandler;
}
