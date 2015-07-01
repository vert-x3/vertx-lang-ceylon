import io.vertx.ceylon.core.net {
  NetSocket
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.net.NetSocketStream */
shared abstract class NetSocketStream() satisfies ReadStream<NetSocket> {
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) endHandler;
}
