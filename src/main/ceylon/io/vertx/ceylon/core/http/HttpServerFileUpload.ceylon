import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core.streams {
  ReadStream_=ReadStream
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
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.http.HttpServerFileUpload */
shared interface HttpServerFileUpload satisfies ReadStream<Buffer> {

  shared actual formal HttpServerFileUpload(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal HttpServerFileUpload(*<[Anything(Buffer)]>) handler;
  shared actual formal HttpServerFileUpload(*<[Anything()]>) endHandler;
  shared actual formal HttpServerFileUpload(*<[]>) pause;
  shared actual formal HttpServerFileUpload(*<[]>) resume;
  shared formal HttpServerFileUpload(*<[String]>) streamToFileSystem;
  shared formal String(*<[]>) filename;
  shared formal String(*<[]>) name;
  shared formal String(*<[]>) contentType;
  shared formal String(*<[]>) contentTransferEncoding;
  shared formal String(*<[]>) charset;
  shared formal Integer(*<[]>) size;
  shared formal Boolean(*<[]>) isSizeAvailable;
}
/* Generated from io.vertx.core.http.HttpServerFileUpload */

shared abstract class HttpServerFileUpload_Impl(HttpServerFileUpload_ delegate) satisfies HttpServerFileUpload & Delegating<HttpServerFileUpload_> {

  shared actual HttpServerFileUpload(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual HttpServerFileUpload(*<[Anything(Buffer)]>) handler => flatten(handler_impl);
  shared actual HttpServerFileUpload(*<[Anything()]>) endHandler => flatten(endHandler_impl);
  shared actual HttpServerFileUpload(*<[]>) pause => flatten(pause_impl);
  shared actual HttpServerFileUpload(*<[]>) resume => flatten(resume_impl);
  shared actual HttpServerFileUpload(*<[String]>) streamToFileSystem => flatten(streamToFileSystem_impl);
  shared actual String(*<[]>) filename => flatten(filename_impl);
  shared actual String(*<[]>) name => flatten(name_impl);
  shared actual String(*<[]>) contentType => flatten(contentType_impl);
  shared actual String(*<[]>) contentTransferEncoding => flatten(contentTransferEncoding_impl);
  shared actual String(*<[]>) charset => flatten(charset_impl);
  shared actual Integer(*<[]>) size => flatten(size_impl);
  shared actual Boolean(*<[]>) isSizeAvailable => flatten(isSizeAvailable_impl);

  HttpServerFileUpload exceptionHandler_impl([Anything(Throwable)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerFileUpload handler_impl([Anything(Buffer)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerFileUpload endHandler_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerFileUpload pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerFileUpload resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerFileUpload streamToFileSystem_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.streamToFileSystem(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String filename_impl([] args) {
    Anything v = delegate.filename();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String name_impl([] args) {
    Anything v = delegate.name();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String contentType_impl([] args) {
    Anything v = delegate.contentType();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String contentTransferEncoding_impl([] args) {
    Anything v = delegate.contentTransferEncoding();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String charset_impl([] args) {
    Anything v = delegate.charset();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer size_impl([] args) {
    Anything v = delegate.size();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isSizeAvailable_impl([] args) {
Anything v = delegate.sizeAvailable;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
