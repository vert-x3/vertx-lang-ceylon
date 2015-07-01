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
import io.vertx.ceylon.core.http {
  ServerWebSocket,
  HttpServerFileUpload,
  HttpServerResponse
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.http.HttpServerRequest */
shared abstract class HttpServerRequest() satisfies ReadStream<Buffer> {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal Anything(*<[Anything(Buffer)]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[Anything()]>) endHandler;
  shared formal Anything(*<[]>) version;
  shared formal Anything(*<[]>) method;
  shared formal Anything(*<[]>) uri;
  shared formal Anything(*<[]>) path;
  shared formal Anything(*<[]>) query;
  shared formal Anything(*<[]>) response;
  shared formal Anything(*<[]>) headers;
  shared formal Anything(*<[String]>) getHeader;
  shared formal Anything(*<[]>) params;
  shared formal Anything(*<[String]>) getParam;
  shared formal Anything(*<[]>) remoteAddress;
  shared formal Anything(*<[]>) localAddress;
  shared formal Anything(*<[]>) absoluteURI;
  shared formal Anything(*<[Anything(Buffer)]>) bodyHandler;
  shared formal Anything(*<[]>) netSocket;
  shared formal Anything(*<[Boolean]>) setExpectMultipart;
  shared formal Anything(*<[]>) isExpectMultipart;
  shared formal Anything(*<[Anything(HttpServerFileUpload)]>) uploadHandler;
  shared formal Anything(*<[]>) formAttributes;
  shared formal Anything(*<[String]>) getFormAttribute;
  shared formal Anything(*<[]>) upgrade;
  shared formal Anything(*<[]>) isEnded;
}
