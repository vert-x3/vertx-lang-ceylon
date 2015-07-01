import io.vertx.ceylon.core.http {
  HttpServerRequest
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.http.HttpServerRequestStream */
shared abstract class HttpServerRequestStream() satisfies ReadStream<HttpServerRequest> {
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) endHandler;
}
