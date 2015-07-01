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
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) endHandler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared formal Anything(*<[]>) streamToFileSystem;
  shared formal Anything(*<[]>) filename;
  shared formal Anything(*<[]>) name;
  shared formal Anything(*<[]>) contentType;
  shared formal Anything(*<[]>) contentTransferEncoding;
  shared formal Anything(*<[]>) charset;
  shared formal Anything(*<[]>) size;
  shared formal Anything(*<[]>) isSizeAvailable;
}
