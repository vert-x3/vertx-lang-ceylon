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

  NetSocketStream exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual NetSocketStream(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  NetSocketStream handler_impl([Anything(NetSocket)] args) {
    throw Exception("implement me");
  }

  shared actual NetSocketStream(*<[Anything(NetSocket)]>) handler = flatten(handler_impl);

  NetSocketStream pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual NetSocketStream(*<[]>) pause = flatten(pause_impl);

  NetSocketStream resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual NetSocketStream(*<[]>) resume = flatten(resume_impl);

  NetSocketStream endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual NetSocketStream(*<[Anything()]>) endHandler = flatten(endHandler_impl);

}
