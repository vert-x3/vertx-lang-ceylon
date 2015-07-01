import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap,
  Future
}
import io.vertx.ceylon.core.streams {
  WriteStream
}
/* Generated from io.vertx.core.http.HttpServerResponse */
shared abstract class HttpServerResponse() satisfies WriteStream<Buffer> {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal Anything(*<[Buffer]|[String]|[String,String]>) write;
  shared actual formal Anything(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[Anything()]>) drainHandler;
  shared formal Anything(*<[]>) getStatusCode;
  shared formal Anything(*<[Integer]>) setStatusCode;
  shared formal Anything(*<[]>) getStatusMessage;
  shared formal Anything(*<[String]>) setStatusMessage;
  shared formal Anything(*<[Boolean]>) setChunked;
  shared formal Anything(*<[]>) isChunked;
  shared formal Anything(*<[]>) headers;
  shared formal Anything(*<[String,String]>) putHeader;
  shared formal Anything(*<[]>) trailers;
  shared formal Anything(*<[String,String]>) putTrailer;
  shared formal Anything(*<[Anything()]>) closeHandler;
  shared formal Anything(*<[]|[String]|[Buffer]|[String,String]>) end;
  shared formal Anything(*<[String]|[String,Anything(Throwable?)]>) sendFile;
  shared formal Anything(*<[]>) close;
  shared formal Anything(*<[]>) ended;
  shared formal Anything(*<[]>) headWritten;
  shared formal Anything(*<[Anything(Future<Null>)]>) headersEndHandler;
  shared formal Anything(*<[Anything()]>) bodyEndHandler;
}
