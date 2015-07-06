import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  HttpClientResponse
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
import io.vertx.core.http {
  HttpClientRequest_=HttpClientRequest
}
/* Generated from io.vertx.core.http.HttpClientRequest */
shared abstract class HttpClientRequest(HttpClientRequest_ delegate) satisfies Delegating
  & WriteStream<Buffer>
  & ReadStream<HttpClientResponse> {

  HttpClientRequest exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientRequest(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  HttpClientRequest write_impl([Buffer]|[String]|[String,String] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientRequest(*<[Buffer]|[String]|[String,String]>) write = flatten(write_impl);

  HttpClientRequest setWriteQueueMaxSize_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientRequest(*<[Integer]>) setWriteQueueMaxSize = flatten(setWriteQueueMaxSize_impl);

  HttpClientRequest drainHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientRequest(*<[Anything()]>) drainHandler = flatten(drainHandler_impl);

  HttpClientRequest handler_impl([Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientRequest(*<[Anything(HttpClientResponse)]>) handler = flatten(handler_impl);

  HttpClientRequest pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientRequest(*<[]>) pause = flatten(pause_impl);

  HttpClientRequest resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientRequest(*<[]>) resume = flatten(resume_impl);

  HttpClientRequest endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual HttpClientRequest(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  HttpClientRequest setChunked_impl([Boolean] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[Boolean]>) setChunked = flatten(setChunked_impl);

  Boolean isChunked_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isChunked = flatten(isChunked_impl);

  String method_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) method = flatten(method_impl);

  String uri_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) uri = flatten(uri_impl);

  MultiMap headers_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) headers = flatten(headers_impl);

  HttpClientRequest putHeader_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String,String]>) putHeader = flatten(putHeader_impl);

  HttpClientRequest continueHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[Anything()]>) continueHandler = flatten(continueHandler_impl);

  HttpClientRequest sendHead_impl([] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[]>) sendHead = flatten(sendHead_impl);

  Anything end_impl([]|[String]|[Buffer]|[String,String] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]|[String]|[Buffer]|[String,String]>) end = flatten(end_impl);

  HttpClientRequest setTimeout_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[Integer]>) setTimeout = flatten(setTimeout_impl);

}
