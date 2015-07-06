import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  HttpClientResponse
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
import io.vertx.core.http {
  HttpClientRequest_=HttpClientRequest
}
/* Generated from io.vertx.core.http.HttpClientRequest */
shared abstract class HttpClientRequest(HttpClientRequest_ delegate) satisfies Delegating
  & WriteStream<Buffer>
  & ReadStream<HttpClientResponse> {
  shared actual formal HttpClientRequest(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal HttpClientRequest(*<[Buffer]|[String]|[String,String]>) write;
  shared actual formal HttpClientRequest(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal HttpClientRequest(*<[Anything()]>) drainHandler;
  shared actual formal HttpClientRequest(*<[Anything(HttpClientResponse)]>) handler;
  shared actual formal HttpClientRequest(*<[]>) pause;
  shared actual formal HttpClientRequest(*<[]>) resume;
  shared actual formal HttpClientRequest(*<[Anything()]>) endHandler;
  shared formal HttpClientRequest(*<[Boolean]>) setChunked;
  shared formal Boolean(*<[]>) isChunked;
  shared formal String(*<[]>) method;
  shared formal String(*<[]>) uri;
  shared formal MultiMap(*<[]>) headers;
  shared formal HttpClientRequest(*<[String,String]>) putHeader;
  shared formal HttpClientRequest(*<[Anything()]>) continueHandler;
  shared formal HttpClientRequest(*<[]>) sendHead;
  shared formal Anything(*<[]|[String]|[Buffer]|[String,String]>) end;
  shared formal HttpClientRequest(*<[Integer]>) setTimeout;
}
