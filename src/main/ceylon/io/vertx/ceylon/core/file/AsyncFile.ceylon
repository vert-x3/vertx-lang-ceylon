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

  shared actual AsyncFile(*<[Anything(Buffer)]>) handler => flatten(handler_impl);

  shared actual AsyncFile(*<[]>) pause => flatten(pause_impl);

  shared actual AsyncFile(*<[]>) resume => flatten(resume_impl);

  shared actual AsyncFile(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  shared actual AsyncFile(*<[Buffer]|[Buffer,Integer,Anything(Throwable?)]>) write => flatten(write_impl);

  shared actual AsyncFile(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);

  shared actual AsyncFile(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);

  shared actual AsyncFile(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared  Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);

  shared  AsyncFile(*<[Buffer,Integer,Integer,Integer,Anything(Throwable|Buffer)]>) read => flatten(read_impl);

  shared  AsyncFile(*<[]|[Anything(Throwable?)]>) flush => flatten(flush_impl);

  shared  AsyncFile(*<[Integer]>) setReadPos => flatten(setReadPos_impl);

  shared  AsyncFile(*<[Integer]>) setWritePos => flatten(setWritePos_impl);

  AsyncFile handler_impl([Anything(Buffer)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile pause_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile resume_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile endHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile write_impl([Buffer]|[Buffer,Integer,Anything(Throwable?)] args) {
    if (is [Buffer] args) {
      // Invoke method
    }
    if (is [Buffer,Integer,Anything(Throwable?)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile setWriteQueueMaxSize_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile drainHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile exceptionHandler_impl([Anything(Throwable)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [Anything(Throwable?)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile read_impl([Buffer,Integer,Integer,Integer,Anything(Throwable|Buffer)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile flush_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [Anything(Throwable?)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile setReadPos_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile setWritePos_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
