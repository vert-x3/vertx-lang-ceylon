import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.ceylon.core.http {
  HttpClientResponse
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.http.HttpClientRequest */
shared abstract class HttpClientRequest() satisfies WriteStream<Buffer> & ReadStream<HttpClientResponse> {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal Anything(*<[Buffer]|[String]|[String,String]>) write;
  shared actual formal Anything(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[Anything()]>) drainHandler;
  shared actual formal Anything(*<[Anything(HttpClientResponse)]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[Anything()]>) endHandler;
  shared formal Anything(*<[Boolean]>) setChunked;
  shared formal Anything(*<[]>) isChunked;
  shared formal Anything(*<[]>) method;
  shared formal Anything(*<[]>) uri;
  shared formal Anything(*<[]>) headers;
  shared formal Anything(*<[String,String]>) putHeader;
  shared formal Anything(*<[Anything()]>) continueHandler;
  shared formal Anything(*<[]>) sendHead;
  shared formal Anything(*<[]|[String]|[Buffer]|[String,String]>) end;
  shared formal Anything(*<[Integer]>) setTimeout;
}
