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
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.http.HttpClientResponse */
shared abstract class HttpClientResponse() satisfies ReadStream<Buffer> {
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) endHandler;
  shared formal Anything(*<[]>) statusCode;
  shared formal Anything(*<[]>) statusMessage;
  shared formal Anything(*<[]>) headers;
  shared formal Anything(*<[]>) getHeader;
  shared formal Anything(*<[]>) getTrailer;
  shared formal Anything(*<[]>) trailers;
  shared formal Anything(*<[]>) cookies;
  shared formal Anything(*<[]>) bodyHandler;
  shared formal Anything(*<[]>) netSocket;
}
