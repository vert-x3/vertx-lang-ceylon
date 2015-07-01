import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.file.AsyncFile */
shared abstract class AsyncFile() satisfies ReadStream<Buffer> & WriteStream<Buffer> {
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) endHandler;
  shared actual formal Anything(*<[]|[]>) write;
  shared actual formal Anything(*<[]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[]>) drainHandler;
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared formal Anything(*<[]|[]>) close;
  shared formal Anything(*<[]>) read;
  shared formal Anything(*<[]|[]>) flush;
  shared formal Anything(*<[]>) setReadPos;
  shared formal Anything(*<[]>) setWritePos;
}
