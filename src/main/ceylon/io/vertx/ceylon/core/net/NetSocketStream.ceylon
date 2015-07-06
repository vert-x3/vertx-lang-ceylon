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
  shared actual formal NetSocketStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal NetSocketStream(*<[Anything(NetSocket)]>) handler;
  shared actual formal NetSocketStream(*<[]>) pause;
  shared actual formal NetSocketStream(*<[]>) resume;
  shared actual formal NetSocketStream(*<[Anything()]>) endHandler;
}
