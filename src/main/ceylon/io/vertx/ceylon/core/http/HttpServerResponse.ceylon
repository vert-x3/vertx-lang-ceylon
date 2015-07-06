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
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  WriteStream
}
import io.vertx.core.http {
  HttpServerResponse_=HttpServerResponse
}
/* Generated from io.vertx.core.http.HttpServerResponse */
shared abstract class HttpServerResponse(HttpServerResponse_ delegate) satisfies Delegating
  & WriteStream<Buffer> {

  HttpServerResponse exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerResponse(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  HttpServerResponse write_impl([Buffer]|[String]|[String,String] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerResponse(*<[Buffer]|[String]|[String,String]>) write = flatten(write_impl);

  HttpServerResponse setWriteQueueMaxSize_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerResponse(*<[Integer]>) setWriteQueueMaxSize = flatten(setWriteQueueMaxSize_impl);

  HttpServerResponse drainHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerResponse(*<[Anything()]>) drainHandler = flatten(drainHandler_impl);

  Integer getStatusCode_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) getStatusCode = flatten(getStatusCode_impl);

  HttpServerResponse setStatusCode_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[Integer]>) setStatusCode = flatten(setStatusCode_impl);

  String getStatusMessage_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) getStatusMessage = flatten(getStatusMessage_impl);

  HttpServerResponse setStatusMessage_impl([String] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[String]>) setStatusMessage = flatten(setStatusMessage_impl);

  HttpServerResponse setChunked_impl([Boolean] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[Boolean]>) setChunked = flatten(setChunked_impl);

  Boolean isChunked_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isChunked = flatten(isChunked_impl);

  MultiMap headers_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) headers = flatten(headers_impl);

  HttpServerResponse putHeader_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[String,String]>) putHeader = flatten(putHeader_impl);

  MultiMap trailers_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) trailers = flatten(trailers_impl);

  HttpServerResponse putTrailer_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[String,String]>) putTrailer = flatten(putTrailer_impl);

  HttpServerResponse closeHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[Anything()]>) closeHandler = flatten(closeHandler_impl);

  HttpServerResponse writeContinue_impl([] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[]>) writeContinue = flatten(writeContinue_impl);

  Anything end_impl([]|[String]|[Buffer]|[String,String] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]|[String]|[Buffer]|[String,String]>) end = flatten(end_impl);

  HttpServerResponse sendFile_impl([String]|[String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[String]|[String,Anything(Throwable?)]>) sendFile = flatten(sendFile_impl);

  Anything close_impl([] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]>) close = flatten(close_impl);

  Boolean ended_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) ended = flatten(ended_impl);

  Boolean headWritten_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) headWritten = flatten(headWritten_impl);

  HttpServerResponse headersEndHandler_impl([Anything(Future<Null>)] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[Anything(Future<Null>)]>) headersEndHandler = flatten(headersEndHandler_impl);

  HttpServerResponse bodyEndHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared  HttpServerResponse(*<[Anything()]>) bodyEndHandler = flatten(bodyEndHandler_impl);

}
