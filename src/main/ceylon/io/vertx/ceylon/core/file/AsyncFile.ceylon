import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.file.AsyncFile */
shared abstract class AsyncFile() satisfies ReadStream<Buffer> & WriteStream<Buffer> {
  shared actual formal Anything(*<[Anything(Buffer)]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[Anything()]>) endHandler;
  shared actual formal Anything(*<[Buffer]|[Buffer,Integer,Anything(Throwable?)]>) write;
  shared actual formal Anything(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[Anything()]>) drainHandler;
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal Anything(*<[Buffer,Integer,Integer,Integer,Anything(Throwable|Buffer)]>) read;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) flush;
  shared formal Anything(*<[Integer]>) setReadPos;
  shared formal Anything(*<[Integer]>) setWritePos;
}
