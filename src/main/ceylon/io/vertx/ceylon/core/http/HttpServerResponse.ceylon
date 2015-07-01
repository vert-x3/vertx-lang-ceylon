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
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]|[]|[]>) write;
  shared actual formal Anything(*<[]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[]>) drainHandler;
  shared formal Anything(*<[]>) getStatusCode;
  shared formal Anything(*<[]>) setStatusCode;
  shared formal Anything(*<[]>) getStatusMessage;
  shared formal Anything(*<[]>) setStatusMessage;
  shared formal Anything(*<[]>) setChunked;
  shared formal Anything(*<[]>) isChunked;
  shared formal Anything(*<[]>) headers;
  shared formal Anything(*<[]>) putHeader;
  shared formal Anything(*<[]>) trailers;
  shared formal Anything(*<[]>) putTrailer;
  shared formal Anything(*<[]>) closeHandler;
  shared formal Anything(*<[]|[]|[]|[]>) end;
  shared formal Anything(*<[]|[]>) sendFile;
  shared formal Anything(*<[]>) close;
  shared formal Anything(*<[]>) ended;
  shared formal Anything(*<[]>) headWritten;
  shared formal Anything(*<[]>) headersEndHandler;
  shared formal Anything(*<[]>) bodyEndHandler;
}
