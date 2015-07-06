import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.ceylon.core.net {
  NetSocket
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
import io.vertx.core.http {
  HttpClientResponse_=HttpClientResponse
}
/* Generated from io.vertx.core.http.HttpClientResponse */
shared abstract class HttpClientResponse(HttpClientResponse_ delegate) satisfies Delegating
  & ReadStream<Buffer> {
  shared actual formal HttpClientResponse(*<[]>) resume;
  shared actual formal HttpClientResponse(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal HttpClientResponse(*<[Anything(Buffer)]>) handler;
  shared actual formal HttpClientResponse(*<[]>) pause;
  shared actual formal HttpClientResponse(*<[Anything()]>) endHandler;
  shared formal Integer(*<[]>) statusCode;
  shared formal String(*<[]>) statusMessage;
  shared formal MultiMap(*<[]>) headers;
  shared formal String(*<[String]>) getHeader;
  shared formal String(*<[String]>) getTrailer;
  shared formal MultiMap(*<[]>) trailers;
  shared formal List<String>(*<[]>) cookies;
  shared formal HttpClientResponse(*<[Anything(Buffer)]>) bodyHandler;
  shared formal NetSocket(*<[]>) netSocket;
}
