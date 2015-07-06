import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  AsyncFile_=AsyncFile
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.file.AsyncFile */
shared abstract class AsyncFile(AsyncFile_ delegate) satisfies Delegating
  & ReadStream<Buffer>
  & WriteStream<Buffer> {

  AsyncFile handler_impl([Anything(Buffer)] args) {
    throw Exception("implement me");
  }

  shared actual AsyncFile(*<[Anything(Buffer)]>) handler = flatten(handler_impl);

  AsyncFile pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual AsyncFile(*<[]>) pause = flatten(pause_impl);

  AsyncFile resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual AsyncFile(*<[]>) resume = flatten(resume_impl);

  AsyncFile endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual AsyncFile(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  AsyncFile write_impl([Buffer]|[Buffer,Integer,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared actual AsyncFile(*<[Buffer]|[Buffer,Integer,Anything(Throwable?)]>) write = flatten(write_impl);

  AsyncFile setWriteQueueMaxSize_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared actual AsyncFile(*<[Integer]>) setWriteQueueMaxSize = flatten(setWriteQueueMaxSize_impl);

  AsyncFile drainHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual AsyncFile(*<[Anything()]>) drainHandler = flatten(drainHandler_impl);

  AsyncFile exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual AsyncFile(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  Anything close_impl([]|[Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]|[Anything(Throwable?)]>) close = flatten(close_impl);

  AsyncFile read_impl([Buffer,Integer,Integer,Integer,Anything(Throwable|Buffer)] args) {
    throw Exception("implement me");
  }

  shared  AsyncFile(*<[Buffer,Integer,Integer,Integer,Anything(Throwable|Buffer)]>) read = flatten(read_impl);

  AsyncFile flush_impl([]|[Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  AsyncFile(*<[]|[Anything(Throwable?)]>) flush = flatten(flush_impl);

  AsyncFile setReadPos_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  AsyncFile(*<[Integer]>) setReadPos = flatten(setReadPos_impl);

  AsyncFile setWritePos_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  AsyncFile(*<[Integer]>) setWritePos = flatten(setWritePos_impl);

}
