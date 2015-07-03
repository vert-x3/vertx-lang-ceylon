import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.file.AsyncFile */
shared abstract class AsyncFile() satisfies ReadStream<Buffer> & WriteStream<Buffer> {
  shared actual formal AsyncFile(*<[Anything(Buffer)]>) handler;
  shared actual formal AsyncFile(*<[]>) pause;
  shared actual formal AsyncFile(*<[]>) resume;
  shared actual formal AsyncFile(*<[Anything()]>) endHandler;
  shared actual formal AsyncFile(*<[Buffer]|[Buffer,Integer,Anything(Throwable?)]>) write;
  shared actual formal AsyncFile(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal AsyncFile(*<[Anything()]>) drainHandler;
  shared actual formal AsyncFile(*<[Anything(Throwable)]>) exceptionHandler;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal AsyncFile(*<[Buffer,Integer,Integer,Integer,Anything(Throwable|Buffer)]>) read;
  shared formal AsyncFile(*<[]|[Anything(Throwable?)]>) flush;
  shared formal AsyncFile(*<[Integer]>) setReadPos;
  shared formal AsyncFile(*<[Integer]>) setWritePos;
}
