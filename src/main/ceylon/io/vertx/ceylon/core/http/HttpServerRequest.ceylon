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

  HttpServerRequest exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerRequest(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  HttpServerRequest handler_impl([Anything(Buffer)] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerRequest(*<[Anything(Buffer)]>) handler = flatten(handler_impl);

  HttpServerRequest pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerRequest(*<[]>) pause = flatten(pause_impl);

  HttpServerRequest resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerRequest(*<[]>) resume = flatten(resume_impl);

  HttpServerRequest endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerRequest(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  String version_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) version = flatten(version_impl);

  String method_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) method = flatten(method_impl);

  String uri_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) uri = flatten(uri_impl);

  String path_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) path = flatten(path_impl);

  String query_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) query = flatten(query_impl);

  HttpServerResponse response_impl([] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[]>) response = flatten(response_impl);

  MultiMap headers_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) headers = flatten(headers_impl);

  String getHeader_impl([String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String]>) getHeader = flatten(getHeader_impl);

  MultiMap params_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) params = flatten(params_impl);

  String getParam_impl([String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String]>) getParam = flatten(getParam_impl);

  SocketAddress remoteAddress_impl([] args) {
    throw Exception("implement me");
  }

  shared  SocketAddress(*<[]>) remoteAddress = flatten(remoteAddress_impl);

  SocketAddress localAddress_impl([] args) {
    throw Exception("implement me");
  }

  shared  SocketAddress(*<[]>) localAddress = flatten(localAddress_impl);

  String absoluteURI_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) absoluteURI = flatten(absoluteURI_impl);

  HttpServerRequest bodyHandler_impl([Anything(Buffer)] args) {
    throw Exception("implement me");
  }

  shared  HttpServerRequest(*<[Anything(Buffer)]>) bodyHandler = flatten(bodyHandler_impl);

  NetSocket netSocket_impl([] args) {
    throw Exception("implement me");
  }

  shared  NetSocket(*<[]>) netSocket = flatten(netSocket_impl);

  HttpServerRequest setExpectMultipart_impl([Boolean] args) {
    throw Exception("implement me");
  }

  shared  HttpServerRequest(*<[Boolean]>) setExpectMultipart = flatten(setExpectMultipart_impl);

  Boolean isExpectMultipart_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isExpectMultipart = flatten(isExpectMultipart_impl);

  HttpServerRequest uploadHandler_impl([Anything(HttpServerFileUpload)] args) {
    throw Exception("implement me");
  }

  shared  HttpServerRequest(*<[Anything(HttpServerFileUpload)]>) uploadHandler = flatten(uploadHandler_impl);

  MultiMap formAttributes_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) formAttributes = flatten(formAttributes_impl);

  String getFormAttribute_impl([String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String]>) getFormAttribute = flatten(getFormAttribute_impl);

  ServerWebSocket upgrade_impl([] args) {
    throw Exception("implement me");
  }

  shared  ServerWebSocket(*<[]>) upgrade = flatten(upgrade_impl);

  Boolean isEnded_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isEnded = flatten(isEnded_impl);

}
