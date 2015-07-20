import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
import io.vertx.core.http {
  HttpServerFileUpload_=HttpServerFileUpload
}
/* Generated from io.vertx.core.http.HttpServerFileUpload */
shared abstract class HttpServerFileUpload(HttpServerFileUpload_ delegate) satisfies Delegating
  & ReadStream<Buffer> {

  shared actual HttpServerFileUpload(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual HttpServerFileUpload(*<[Anything(Buffer)]>) handler => flatten(handler_impl);

  shared actual HttpServerFileUpload(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  shared actual HttpServerFileUpload(*<[]>) pause => flatten(pause_impl);

  shared actual HttpServerFileUpload(*<[]>) resume => flatten(resume_impl);

  shared  HttpServerFileUpload(*<[String]>) streamToFileSystem => flatten(streamToFileSystem_impl);

  shared  String(*<[]>) filename => flatten(filename_impl);

  shared  String(*<[]>) name => flatten(name_impl);

  shared  String(*<[]>) contentType => flatten(contentType_impl);

  shared  String(*<[]>) contentTransferEncoding => flatten(contentTransferEncoding_impl);

  shared  String(*<[]>) charset => flatten(charset_impl);

  shared  Integer(*<[]>) size => flatten(size_impl);

  shared  Boolean(*<[]>) isSizeAvailable => flatten(isSizeAvailable_impl);

  HttpServerFileUpload exceptionHandler_impl([Anything(Throwable)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerFileUpload handler_impl([Anything(Buffer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerFileUpload endHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerFileUpload pause_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerFileUpload resume_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerFileUpload streamToFileSystem_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String filename_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String name_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String contentType_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String contentTransferEncoding_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String charset_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer size_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isSizeAvailable_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
