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
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]|[]|[]>) write;
  shared actual formal Anything(*<[]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[]>) drainHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) endHandler;
  shared formal Anything(*<[]>) setChunked;
  shared formal Anything(*<[]>) isChunked;
  shared formal Anything(*<[]>) method;
  shared formal Anything(*<[]>) uri;
  shared formal Anything(*<[]>) headers;
  shared formal Anything(*<[]>) putHeader;
  shared formal Anything(*<[]>) continueHandler;
  shared formal Anything(*<[]>) sendHead;
  shared formal Anything(*<[]|[]|[]|[]>) end;
  shared formal Anything(*<[]>) setTimeout;
}
