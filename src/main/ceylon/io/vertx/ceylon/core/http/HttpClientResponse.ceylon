import java.lang {
  Void_=Void,
  String_=String
}
import java.util {
  List_=List
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult,
  MultiMap_=MultiMap
}
import io.vertx.core.streams {
  ReadStream_=ReadStream
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
import io.vertx.core.net {
  NetSocket_=NetSocket
}
import io.vertx.core.http {
  HttpClientResponse_=HttpClientResponse
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.http.HttpClientResponse */
shared interface HttpClientResponse satisfies ReadStream<Buffer> {

  shared actual formal HttpClientResponse(*<[]>) resume;
  shared actual formal HttpClientResponse(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal HttpClientResponse(*<[Anything(Buffer)]>) handler;
  shared actual formal HttpClientResponse(*<[]>) pause;
  shared actual formal HttpClientResponse(*<[Anything()]>) endHandler;
  shared formal Integer(*<[]>) statusCode;
  shared formal String(*<[]>) statusMessage;
  shared formal MultiMap(*<[]>) headers;
  shared formal String(*<[String]>) getHeader;
  shared formal String(*<[String]>) getTrailer;
  shared formal MultiMap(*<[]>) trailers;
  shared formal List<String>(*<[]>) cookies;
  shared formal HttpClientResponse(*<[Anything(Buffer)]>) bodyHandler;
  shared formal NetSocket(*<[]>) netSocket;
}
/* Generated from io.vertx.core.http.HttpClientResponse */

shared abstract class HttpClientResponse_Impl(HttpClientResponse_ delegate) satisfies HttpClientResponse & Delegating<HttpClientResponse_> {

  shared actual HttpClientResponse(*<[]>) resume => flatten(resume_impl);
  shared actual HttpClientResponse(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual HttpClientResponse(*<[Anything(Buffer)]>) handler => flatten(handler_impl);
  shared actual HttpClientResponse(*<[]>) pause => flatten(pause_impl);
  shared actual HttpClientResponse(*<[Anything()]>) endHandler => flatten(endHandler_impl);
  shared actual Integer(*<[]>) statusCode => flatten(statusCode_impl);
  shared actual String(*<[]>) statusMessage => flatten(statusMessage_impl);
  shared actual MultiMap(*<[]>) headers => flatten(headers_impl);
  shared actual String(*<[String]>) getHeader => flatten(getHeader_impl);
  shared actual String(*<[String]>) getTrailer => flatten(getTrailer_impl);
  shared actual MultiMap(*<[]>) trailers => flatten(trailers_impl);
  shared actual List<String>(*<[]>) cookies => flatten(cookies_impl);
  shared actual HttpClientResponse(*<[Anything(Buffer)]>) bodyHandler => flatten(bodyHandler_impl);
  shared actual NetSocket(*<[]>) netSocket => flatten(netSocket_impl);

  HttpClientResponse resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientResponse exceptionHandler_impl([Anything(Throwable)] args) {
    Handler_<Throwable> arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientResponse handler_impl([Anything(Buffer)] args) {
    Handler_<Buffer_> arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientResponse pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientResponse endHandler_impl([Anything()] args) {
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer statusCode_impl([] args) {
    Anything v = delegate.statusCode();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String statusMessage_impl([] args) {
    Anything v = delegate.statusMessage();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    Anything v = delegate.headers();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getHeader_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.getHeader(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getTrailer_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.getTrailer(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap trailers_impl([] args) {
    Anything v = delegate.trailers();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> cookies_impl([] args) {
    Anything v = delegate.cookies();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientResponse bodyHandler_impl([Anything(Buffer)] args) {
    Handler_<Buffer_> arg_0 = nothing;
    Anything v = delegate.bodyHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket netSocket_impl([] args) {
    Anything v = delegate.netSocket();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
