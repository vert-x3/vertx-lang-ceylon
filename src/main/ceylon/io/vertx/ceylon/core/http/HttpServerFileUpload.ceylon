import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.http.HttpServerFileUpload */
shared abstract class HttpServerFileUpload() satisfies ReadStream<Buffer> {
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
