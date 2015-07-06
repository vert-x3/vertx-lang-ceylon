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

  HttpServerFileUpload exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerFileUpload(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  HttpServerFileUpload handler_impl([Anything(Buffer)] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerFileUpload(*<[Anything(Buffer)]>) handler = flatten(handler_impl);

  HttpServerFileUpload endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerFileUpload(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  HttpServerFileUpload pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerFileUpload(*<[]>) pause = flatten(pause_impl);

  HttpServerFileUpload resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual HttpServerFileUpload(*<[]>) resume = flatten(resume_impl);

  HttpServerFileUpload streamToFileSystem_impl([String] args) {
    throw Exception("implement me");
  }

  shared  HttpServerFileUpload(*<[String]>) streamToFileSystem = flatten(streamToFileSystem_impl);

  String filename_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) filename = flatten(filename_impl);

  String name_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) name = flatten(name_impl);

  String contentType_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) contentType = flatten(contentType_impl);

  String contentTransferEncoding_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) contentTransferEncoding = flatten(contentTransferEncoding_impl);

  String charset_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) charset = flatten(charset_impl);

  Integer size_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) size = flatten(size_impl);

  Boolean isSizeAvailable_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isSizeAvailable = flatten(isSizeAvailable_impl);

}
