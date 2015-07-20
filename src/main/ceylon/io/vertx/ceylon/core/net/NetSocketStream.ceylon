import io.vertx.ceylon.core.net {
  NetSocket
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  NetSocketStream_=NetSocketStream
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.net.NetSocketStream */
shared abstract class NetSocketStream(NetSocketStream_ delegate) satisfies Delegating
  & ReadStream<NetSocket> {

  shared actual NetSocketStream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual NetSocketStream(*<[Anything(NetSocket)]>) handler => flatten(handler_impl);

  shared actual NetSocketStream(*<[]>) pause => flatten(pause_impl);

  shared actual NetSocketStream(*<[]>) resume => flatten(resume_impl);

  shared actual NetSocketStream(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  NetSocketStream exceptionHandler_impl([Anything(Throwable)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocketStream handler_impl([Anything(NetSocket)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocketStream pause_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocketStream resume_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocketStream endHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
