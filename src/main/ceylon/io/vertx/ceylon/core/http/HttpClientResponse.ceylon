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
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
import io.vertx.core.http {
  HttpClientResponse_=HttpClientResponse
}
/* Generated from io.vertx.core.http.HttpClientResponse */
shared abstract class HttpClientResponse(HttpClientResponse_ delegate) satisfies Delegating
  & ReadStream<Buffer> {

  HttpClientResponse resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientResponse(*<[]>) resume = flatten(resume_impl);

  HttpClientResponse exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientResponse(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  HttpClientResponse handler_impl([Anything(Buffer)] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientResponse(*<[Anything(Buffer)]>) handler = flatten(handler_impl);

  HttpClientResponse pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientResponse(*<[]>) pause = flatten(pause_impl);

  HttpClientResponse endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientResponse(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  Integer statusCode_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) statusCode = flatten(statusCode_impl);

  String statusMessage_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) statusMessage = flatten(statusMessage_impl);

  MultiMap headers_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) headers = flatten(headers_impl);

  String getHeader_impl([String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String]>) getHeader = flatten(getHeader_impl);

  String getTrailer_impl([String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String]>) getTrailer = flatten(getTrailer_impl);

  MultiMap trailers_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) trailers = flatten(trailers_impl);

  List<String> cookies_impl([] args) {
    throw Exception("implement me");
  }

  shared  List<String>(*<[]>) cookies = flatten(cookies_impl);

  HttpClientResponse bodyHandler_impl([Anything(Buffer)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientResponse(*<[Anything(Buffer)]>) bodyHandler = flatten(bodyHandler_impl);

  NetSocket netSocket_impl([] args) {
    throw Exception("implement me");
  }

  shared  NetSocket(*<[]>) netSocket = flatten(netSocket_impl);

}
