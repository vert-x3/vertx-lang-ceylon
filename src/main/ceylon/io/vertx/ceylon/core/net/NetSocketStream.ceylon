import java.lang {
  Void_=Void
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.core.streams {
  ReadStream_=ReadStream
}
import io.vertx.ceylon.core.net {
  NetSocket
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  NetSocketStream_=NetSocketStream,
  NetSocket_=NetSocket
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.net.NetSocketStream */
shared interface NetSocketStream satisfies ReadStream<NetSocket> {

  shared actual formal NetSocketStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal NetSocketStream(*<[Anything(NetSocket)]>) handler;
  shared actual formal NetSocketStream(*<[]>) pause;
  shared actual formal NetSocketStream(*<[]>) resume;
  shared actual formal NetSocketStream(*<[Anything()]>) endHandler;
}
/* Generated from io.vertx.core.net.NetSocketStream */

shared abstract class NetSocketStream_Impl(NetSocketStream_ delegate) satisfies NetSocketStream & Delegating<NetSocketStream_> {

  shared actual NetSocketStream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual NetSocketStream(*<[Anything(NetSocket)]>) handler => flatten(handler_impl);
  shared actual NetSocketStream(*<[]>) pause => flatten(pause_impl);
  shared actual NetSocketStream(*<[]>) resume => flatten(resume_impl);
  shared actual NetSocketStream(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  NetSocketStream exceptionHandler_impl([Anything(Throwable)] args) {
    Handler_<Throwable> arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocketStream handler_impl([Anything(NetSocket)] args) {
    Handler_<NetSocket_> arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocketStream pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocketStream resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocketStream endHandler_impl([Anything()] args) {
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
