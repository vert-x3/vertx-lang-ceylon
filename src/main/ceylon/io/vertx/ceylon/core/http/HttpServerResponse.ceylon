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
  shared actual formal HttpServerResponse(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal HttpServerResponse(*<[Buffer]|[String]|[String,String]>) write;
  shared actual formal HttpServerResponse(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal HttpServerResponse(*<[Anything()]>) drainHandler;
  shared formal Integer(*<[]>) getStatusCode;
  shared formal HttpServerResponse(*<[Integer]>) setStatusCode;
  shared formal String(*<[]>) getStatusMessage;
  shared formal HttpServerResponse(*<[String]>) setStatusMessage;
  shared formal HttpServerResponse(*<[Boolean]>) setChunked;
  shared formal Boolean(*<[]>) isChunked;
  shared formal MultiMap(*<[]>) headers;
  shared formal HttpServerResponse(*<[String,String]>) putHeader;
  shared formal MultiMap(*<[]>) trailers;
  shared formal HttpServerResponse(*<[String,String]>) putTrailer;
  shared formal HttpServerResponse(*<[Anything()]>) closeHandler;
  shared formal HttpServerResponse(*<[]>) writeContinue;
  shared formal Anything(*<[]|[String]|[Buffer]|[String,String]>) end;
  shared formal HttpServerResponse(*<[String]|[String,Anything(Throwable?)]>) sendFile;
  shared formal Anything(*<[]>) close;
  shared formal Boolean(*<[]>) ended;
  shared formal Boolean(*<[]>) headWritten;
  shared formal HttpServerResponse(*<[Anything(Future<Null>)]>) headersEndHandler;
  shared formal HttpServerResponse(*<[Anything()]>) bodyEndHandler;
}
