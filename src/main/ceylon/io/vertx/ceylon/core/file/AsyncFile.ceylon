import java.lang {
  Void_=Void
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.core.streams {
  WriteStream_=WriteStream,
  ReadStream_=ReadStream
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
import io.vertx.core.buffer {
  Buffer_=Buffer
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

shared abstract class AsyncFile_Impl(AsyncFile_ delegate) satisfies AsyncFile & Delegating<AsyncFile_> {

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
    Handler_<Buffer_> arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
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
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile write_impl([Buffer]|[Buffer,Integer,Anything(Throwable?)] args) {
    if (is [Buffer] args) {
      assert(is Delegating<Buffer_> arg_0 = args[0]);
      Anything v = delegate.write(arg_0.delegate);
    }
    if (is [Buffer,Integer,Anything(Throwable?)] args) {
      assert(is Delegating<Buffer_> arg_0 = args[0]);
      Integer arg_1 = args[1];
      Handler_<AsyncResult_<Void_>> arg_2 = nothing;
      Anything v = delegate.write(arg_0.delegate,arg_1,arg_2);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile setWriteQueueMaxSize_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.setWriteQueueMaxSize(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile drainHandler_impl([Anything()] args) {
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.drainHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile exceptionHandler_impl([Anything(Throwable)] args) {
    Handler_<Throwable> arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      Anything v = delegate.close();
    }
    if (is [Anything(Throwable?)] args) {
      Handler_<AsyncResult_<Void_>> arg_0 = nothing;
      Anything v = delegate.close(arg_0);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile read_impl([Buffer,Integer,Integer,Integer,Anything(Throwable|Buffer)] args) {
    assert(is Delegating<Buffer_> arg_0 = args[0]);
    Integer arg_1 = args[1];
    Integer arg_2 = args[2];
    Integer arg_3 = args[3];
    Handler_<AsyncResult_<Buffer_>> arg_4 = nothing;
    Anything v = delegate.read(arg_0.delegate,arg_1,arg_2,arg_3,arg_4);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile flush_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      Anything v = delegate.flush();
    }
    if (is [Anything(Throwable?)] args) {
      Handler_<AsyncResult_<Void_>> arg_0 = nothing;
      Anything v = delegate.flush(arg_0);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile setReadPos_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.setReadPos(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile setWritePos_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.setWritePos(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
