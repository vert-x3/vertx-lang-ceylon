import java.lang {
  String_=String
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  SocketAddress,
  NetSocket
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  ServerWebSocket,
  HttpServerFileUpload,
  HttpServerResponse
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
import io.vertx.core.http {
  HttpServerRequest_=HttpServerRequest
}
/* Generated from io.vertx.core.http.HttpServerRequest */
shared abstract class HttpServerRequest(HttpServerRequest_ delegate) satisfies Delegating
  & ReadStream<Buffer> {
  shared actual formal HttpServerRequest(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal HttpServerRequest(*<[Anything(Buffer)]>) handler;
  shared actual formal HttpServerRequest(*<[]>) pause;
  shared actual formal HttpServerRequest(*<[]>) resume;
  shared actual formal HttpServerRequest(*<[Anything()]>) endHandler;
  shared formal String(*<[]>) version;
  shared formal String(*<[]>) method;
  shared formal String(*<[]>) uri;
  shared formal String(*<[]>) path;
  shared formal String(*<[]>) query;
  shared formal HttpServerResponse(*<[]>) response;
  shared formal MultiMap(*<[]>) headers;
  shared formal String(*<[String]>) getHeader;
  shared formal MultiMap(*<[]>) params;
  shared formal String(*<[String]>) getParam;
  shared formal SocketAddress(*<[]>) remoteAddress;
  shared formal SocketAddress(*<[]>) localAddress;
  shared formal String(*<[]>) absoluteURI;
  shared formal HttpServerRequest(*<[Anything(Buffer)]>) bodyHandler;
  shared formal NetSocket(*<[]>) netSocket;
  shared formal HttpServerRequest(*<[Boolean]>) setExpectMultipart;
  shared formal Boolean(*<[]>) isExpectMultipart;
  shared formal HttpServerRequest(*<[Anything(HttpServerFileUpload)]>) uploadHandler;
  shared formal MultiMap(*<[]>) formAttributes;
  shared formal String(*<[String]>) getFormAttribute;
  shared formal ServerWebSocket(*<[]>) upgrade;
  shared formal Boolean(*<[]>) isEnded;
}
