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

  shared actual HttpClientResponse(*<[]>) resume => flatten(resume_impl);

  shared actual HttpClientResponse(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual HttpClientResponse(*<[Anything(Buffer)]>) handler => flatten(handler_impl);

  shared actual HttpClientResponse(*<[]>) pause => flatten(pause_impl);

  shared actual HttpClientResponse(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  shared  Integer(*<[]>) statusCode => flatten(statusCode_impl);

  shared  String(*<[]>) statusMessage => flatten(statusMessage_impl);

  shared  MultiMap(*<[]>) headers => flatten(headers_impl);

  shared  String(*<[String]>) getHeader => flatten(getHeader_impl);

  shared  String(*<[String]>) getTrailer => flatten(getTrailer_impl);

  shared  MultiMap(*<[]>) trailers => flatten(trailers_impl);

  shared  List<String>(*<[]>) cookies => flatten(cookies_impl);

  shared  HttpClientResponse(*<[Anything(Buffer)]>) bodyHandler => flatten(bodyHandler_impl);

  shared  NetSocket(*<[]>) netSocket => flatten(netSocket_impl);

  HttpClientResponse resume_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientResponse exceptionHandler_impl([Anything(Throwable)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientResponse handler_impl([Anything(Buffer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientResponse pause_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientResponse endHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer statusCode_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String statusMessage_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getHeader_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getTrailer_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap trailers_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> cookies_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientResponse bodyHandler_impl([Anything(Buffer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket netSocket_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
