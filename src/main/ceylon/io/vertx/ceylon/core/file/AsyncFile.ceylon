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
shared interface AsyncFile satisfies ReadStream<Buffer>& WriteStream<Buffer> {

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
/* Generated from io.vertx.core.file.AsyncFile */

shared abstract class AsyncFile_Impl(AsyncFile delegate) satisfies AsyncFile & Delegating<AsyncFile> {

  shared actual AsyncFile(*<[Anything(Buffer)]>) handler => flatten(handler_impl);
  shared actual AsyncFile(*<[]>) pause => flatten(pause_impl);
  shared actual AsyncFile(*<[]>) resume => flatten(resume_impl);
  shared actual AsyncFile(*<[Anything()]>) endHandler => flatten(endHandler_impl);
  shared actual AsyncFile(*<[Buffer]|[Buffer,Integer,Anything(Throwable?)]>) write => flatten(write_impl);
  shared actual AsyncFile(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);
  shared actual AsyncFile(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);
  shared actual AsyncFile(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);
  shared actual AsyncFile(*<[Buffer,Integer,Integer,Integer,Anything(Throwable|Buffer)]>) read => flatten(read_impl);
  shared actual AsyncFile(*<[]|[Anything(Throwable?)]>) flush => flatten(flush_impl);
  shared actual AsyncFile(*<[Integer]>) setReadPos => flatten(setReadPos_impl);
  shared actual AsyncFile(*<[Integer]>) setWritePos => flatten(setWritePos_impl);

  AsyncFile handler_impl([Anything(Buffer)] args) {
    Anything v = delegate.handler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile endHandler_impl([Anything()] args) {
    Anything v = delegate.endHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile write_impl([Buffer]|[Buffer,Integer,Anything(Throwable?)] args) {
    if (is [Buffer] args) {
      assert(is Delegating<Buffer> arg_0 = args[0]);
      Anything v = delegate.write(arg_0.delegate);
    }
    if (is [Buffer,Integer,Anything(Throwable?)] args) {
      assert(is Delegating<Buffer> arg_0 = args[0]);
      Anything v = delegate.write(arg_0.delegate,args[1],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile setWriteQueueMaxSize_impl([Integer] args) {
    Anything v = delegate.setWriteQueueMaxSize(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile drainHandler_impl([Anything()] args) {
    Anything v = delegate.drainHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile exceptionHandler_impl([Anything(Throwable)] args) {
    Anything v = delegate.exceptionHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      Anything v = delegate.close();
    }
    if (is [Anything(Throwable?)] args) {
      Anything v = delegate.close(nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile read_impl([Buffer,Integer,Integer,Integer,Anything(Throwable|Buffer)] args) {
    assert(is Delegating<Buffer> arg_0 = args[0]);
    Anything v = delegate.read(arg_0.delegate,args[1],args[2],args[3],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile flush_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      Anything v = delegate.flush();
    }
    if (is [Anything(Throwable?)] args) {
      Anything v = delegate.flush(nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile setReadPos_impl([Integer] args) {
    Anything v = delegate.setReadPos(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile setWritePos_impl([Integer] args) {
    Anything v = delegate.setWritePos(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
