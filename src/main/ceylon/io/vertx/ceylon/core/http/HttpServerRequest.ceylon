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
shared interface HttpServerRequest satisfies ReadStream<Buffer> {

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
/* Generated from io.vertx.core.http.HttpServerRequest */

shared abstract class HttpServerRequest_Impl(HttpServerRequest delegate) satisfies HttpServerRequest & Delegating<HttpServerRequest> {

  shared actual HttpServerRequest(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual HttpServerRequest(*<[Anything(Buffer)]>) handler => flatten(handler_impl);
  shared actual HttpServerRequest(*<[]>) pause => flatten(pause_impl);
  shared actual HttpServerRequest(*<[]>) resume => flatten(resume_impl);
  shared actual HttpServerRequest(*<[Anything()]>) endHandler => flatten(endHandler_impl);
  shared actual String(*<[]>) version => flatten(version_impl);
  shared actual String(*<[]>) method => flatten(method_impl);
  shared actual String(*<[]>) uri => flatten(uri_impl);
  shared actual String(*<[]>) path => flatten(path_impl);
  shared actual String(*<[]>) query => flatten(query_impl);
  shared actual HttpServerResponse(*<[]>) response => flatten(response_impl);
  shared actual MultiMap(*<[]>) headers => flatten(headers_impl);
  shared actual String(*<[String]>) getHeader => flatten(getHeader_impl);
  shared actual MultiMap(*<[]>) params => flatten(params_impl);
  shared actual String(*<[String]>) getParam => flatten(getParam_impl);
  shared actual SocketAddress(*<[]>) remoteAddress => flatten(remoteAddress_impl);
  shared actual SocketAddress(*<[]>) localAddress => flatten(localAddress_impl);
  shared actual String(*<[]>) absoluteURI => flatten(absoluteURI_impl);
  shared actual HttpServerRequest(*<[Anything(Buffer)]>) bodyHandler => flatten(bodyHandler_impl);
  shared actual NetSocket(*<[]>) netSocket => flatten(netSocket_impl);
  shared actual HttpServerRequest(*<[Boolean]>) setExpectMultipart => flatten(setExpectMultipart_impl);
  shared actual Boolean(*<[]>) isExpectMultipart => flatten(isExpectMultipart_impl);
  shared actual HttpServerRequest(*<[Anything(HttpServerFileUpload)]>) uploadHandler => flatten(uploadHandler_impl);
  shared actual MultiMap(*<[]>) formAttributes => flatten(formAttributes_impl);
  shared actual String(*<[String]>) getFormAttribute => flatten(getFormAttribute_impl);
  shared actual ServerWebSocket(*<[]>) upgrade => flatten(upgrade_impl);
  shared actual Boolean(*<[]>) isEnded => flatten(isEnded_impl);

  HttpServerRequest exceptionHandler_impl([Anything(Throwable)] args) {
    Anything v = delegate.exceptionHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest handler_impl([Anything(Buffer)] args) {
    Anything v = delegate.handler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest endHandler_impl([Anything()] args) {
    Anything v = delegate.endHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String version_impl([] args) {
    Anything v = delegate.version();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String method_impl([] args) {
    Anything v = delegate.method();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String uri_impl([] args) {
    Anything v = delegate.uri();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String path_impl([] args) {
    Anything v = delegate.path();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String query_impl([] args) {
    Anything v = delegate.query();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse response_impl([] args) {
    Anything v = delegate.response();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    Anything v = delegate.headers();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getHeader_impl([String] args) {
    Anything v = delegate.getHeader(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap params_impl([] args) {
    Anything v = delegate.params();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getParam_impl([String] args) {
    Anything v = delegate.getParam(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SocketAddress remoteAddress_impl([] args) {
    Anything v = delegate.remoteAddress();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SocketAddress localAddress_impl([] args) {
    Anything v = delegate.localAddress();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String absoluteURI_impl([] args) {
    Anything v = delegate.absoluteURI();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest bodyHandler_impl([Anything(Buffer)] args) {
    Anything v = delegate.bodyHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket netSocket_impl([] args) {
    Anything v = delegate.netSocket();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest setExpectMultipart_impl([Boolean] args) {
    Anything v = delegate.setExpectMultipart(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isExpectMultipart_impl([] args) {
    Anything v = delegate.isExpectMultipart();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest uploadHandler_impl([Anything(HttpServerFileUpload)] args) {
    Anything v = delegate.uploadHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap formAttributes_impl([] args) {
    Anything v = delegate.formAttributes();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getFormAttribute_impl([String] args) {
    Anything v = delegate.getFormAttribute(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket upgrade_impl([] args) {
    Anything v = delegate.upgrade();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isEnded_impl([] args) {
    Anything v = delegate.isEnded();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
