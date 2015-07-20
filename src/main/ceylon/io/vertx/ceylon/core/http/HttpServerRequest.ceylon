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

  shared actual HttpServerRequest(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual HttpServerRequest(*<[Anything(Buffer)]>) handler => flatten(handler_impl);

  shared actual HttpServerRequest(*<[]>) pause => flatten(pause_impl);

  shared actual HttpServerRequest(*<[]>) resume => flatten(resume_impl);

  shared actual HttpServerRequest(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  shared  String(*<[]>) version => flatten(version_impl);

  shared  String(*<[]>) method => flatten(method_impl);

  shared  String(*<[]>) uri => flatten(uri_impl);

  shared  String(*<[]>) path => flatten(path_impl);

  shared  String(*<[]>) query => flatten(query_impl);

  shared  HttpServerResponse(*<[]>) response => flatten(response_impl);

  shared  MultiMap(*<[]>) headers => flatten(headers_impl);

  shared  String(*<[String]>) getHeader => flatten(getHeader_impl);

  shared  MultiMap(*<[]>) params => flatten(params_impl);

  shared  String(*<[String]>) getParam => flatten(getParam_impl);

  shared  SocketAddress(*<[]>) remoteAddress => flatten(remoteAddress_impl);

  shared  SocketAddress(*<[]>) localAddress => flatten(localAddress_impl);

  shared  String(*<[]>) absoluteURI => flatten(absoluteURI_impl);

  shared  HttpServerRequest(*<[Anything(Buffer)]>) bodyHandler => flatten(bodyHandler_impl);

  shared  NetSocket(*<[]>) netSocket => flatten(netSocket_impl);

  shared  HttpServerRequest(*<[Boolean]>) setExpectMultipart => flatten(setExpectMultipart_impl);

  shared  Boolean(*<[]>) isExpectMultipart => flatten(isExpectMultipart_impl);

  shared  HttpServerRequest(*<[Anything(HttpServerFileUpload)]>) uploadHandler => flatten(uploadHandler_impl);

  shared  MultiMap(*<[]>) formAttributes => flatten(formAttributes_impl);

  shared  String(*<[String]>) getFormAttribute => flatten(getFormAttribute_impl);

  shared  ServerWebSocket(*<[]>) upgrade => flatten(upgrade_impl);

  shared  Boolean(*<[]>) isEnded => flatten(isEnded_impl);

  HttpServerRequest exceptionHandler_impl([Anything(Throwable)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest handler_impl([Anything(Buffer)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest pause_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest resume_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest endHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String version_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String method_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String uri_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String path_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String query_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse response_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getHeader_impl([String] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap params_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getParam_impl([String] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SocketAddress remoteAddress_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SocketAddress localAddress_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String absoluteURI_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest bodyHandler_impl([Anything(Buffer)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket netSocket_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest setExpectMultipart_impl([Boolean] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isExpectMultipart_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerRequest uploadHandler_impl([Anything(HttpServerFileUpload)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap formAttributes_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getFormAttribute_impl([String] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ServerWebSocket upgrade_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isEnded_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
