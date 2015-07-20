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

  shared actual HttpClientRequest(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual HttpClientRequest(*<[Buffer]|[String]|[String,String]>) write => flatten(write_impl);

  shared actual HttpClientRequest(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);

  shared actual HttpClientRequest(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);

  shared actual HttpClientRequest(*<[Anything(HttpClientResponse)]>) handler => flatten(handler_impl);

  shared actual HttpClientRequest(*<[]>) pause => flatten(pause_impl);

  shared actual HttpClientRequest(*<[]>) resume => flatten(resume_impl);

  shared actual HttpClientRequest(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  shared  HttpClientRequest(*<[Boolean]>) setChunked => flatten(setChunked_impl);

  shared  Boolean(*<[]>) isChunked => flatten(isChunked_impl);

  shared  String(*<[]>) method => flatten(method_impl);

  shared  String(*<[]>) uri => flatten(uri_impl);

  shared  MultiMap(*<[]>) headers => flatten(headers_impl);

  shared  HttpClientRequest(*<[String,String]>) putHeader => flatten(putHeader_impl);

  shared  HttpClientRequest(*<[Anything()]>) continueHandler => flatten(continueHandler_impl);

  shared  HttpClientRequest(*<[]>) sendHead => flatten(sendHead_impl);

  shared  Anything(*<[]|[String]|[Buffer]|[String,String]>) end => flatten(end_impl);

  shared  HttpClientRequest(*<[Integer]>) setTimeout => flatten(setTimeout_impl);

  HttpClientRequest exceptionHandler_impl([Anything(Throwable)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest write_impl([Buffer]|[String]|[String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest setWriteQueueMaxSize_impl([Integer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest drainHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest handler_impl([Anything(HttpClientResponse)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest pause_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest resume_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest endHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest setChunked_impl([Boolean] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isChunked_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String method_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String uri_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest putHeader_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest continueHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest sendHead_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything end_impl([]|[String]|[Buffer]|[String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest setTimeout_impl([Integer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
