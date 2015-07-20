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

  shared actual HttpServerResponse(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual HttpServerResponse(*<[Buffer]|[String]|[String,String]>) write => flatten(write_impl);

  shared actual HttpServerResponse(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);

  shared actual HttpServerResponse(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);

  shared  Integer(*<[]>) getStatusCode => flatten(getStatusCode_impl);

  shared  HttpServerResponse(*<[Integer]>) setStatusCode => flatten(setStatusCode_impl);

  shared  String(*<[]>) getStatusMessage => flatten(getStatusMessage_impl);

  shared  HttpServerResponse(*<[String]>) setStatusMessage => flatten(setStatusMessage_impl);

  shared  HttpServerResponse(*<[Boolean]>) setChunked => flatten(setChunked_impl);

  shared  Boolean(*<[]>) isChunked => flatten(isChunked_impl);

  shared  MultiMap(*<[]>) headers => flatten(headers_impl);

  shared  HttpServerResponse(*<[String,String]>) putHeader => flatten(putHeader_impl);

  shared  MultiMap(*<[]>) trailers => flatten(trailers_impl);

  shared  HttpServerResponse(*<[String,String]>) putTrailer => flatten(putTrailer_impl);

  shared  HttpServerResponse(*<[Anything()]>) closeHandler => flatten(closeHandler_impl);

  shared  HttpServerResponse(*<[]>) writeContinue => flatten(writeContinue_impl);

  shared  Anything(*<[]|[String]|[Buffer]|[String,String]>) end => flatten(end_impl);

  shared  HttpServerResponse(*<[String]|[String,Anything(Throwable?)]>) sendFile => flatten(sendFile_impl);

  shared  Anything(*<[]>) close => flatten(close_impl);

  shared  Boolean(*<[]>) ended => flatten(ended_impl);

  shared  Boolean(*<[]>) headWritten => flatten(headWritten_impl);

  shared  HttpServerResponse(*<[Anything(Future<Null>)]>) headersEndHandler => flatten(headersEndHandler_impl);

  shared  HttpServerResponse(*<[Anything()]>) bodyEndHandler => flatten(bodyEndHandler_impl);

  HttpServerResponse exceptionHandler_impl([Anything(Throwable)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse write_impl([Buffer]|[String]|[String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse setWriteQueueMaxSize_impl([Integer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse drainHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getStatusCode_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse setStatusCode_impl([Integer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getStatusMessage_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse setStatusMessage_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse setChunked_impl([Boolean] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isChunked_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse putHeader_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap trailers_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse putTrailer_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse closeHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse writeContinue_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything end_impl([]|[String]|[Buffer]|[String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse sendFile_impl([String]|[String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean ended_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean headWritten_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse headersEndHandler_impl([Anything(Future<Null>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse bodyEndHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
