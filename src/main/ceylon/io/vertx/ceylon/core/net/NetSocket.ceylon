import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  NetSocket_=NetSocket
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.net.NetSocket */
shared abstract class NetSocket(NetSocket_ delegate) satisfies Delegating
  & ReadStream<Buffer>
  & WriteStream<Buffer> {
  shared actual formal NetSocket(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal NetSocket(*<[Anything(Buffer)]>) handler;
  shared actual formal NetSocket(*<[]>) pause;
  shared actual formal NetSocket(*<[]>) resume;
  shared actual formal NetSocket(*<[Anything()]>) endHandler;
  shared actual formal NetSocket(*<[Buffer]|[String]|[String,String]>) write;
  shared actual formal NetSocket(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal NetSocket(*<[Anything()]>) drainHandler;
  shared formal String(*<[]>) writeHandlerID;
  shared formal NetSocket(*<[String]|[String,Anything(Throwable?)]>) sendFile;
  shared formal SocketAddress(*<[]>) remoteAddress;
  shared formal SocketAddress(*<[]>) localAddress;
  shared formal Anything(*<[]>) close;
  shared formal NetSocket(*<[Anything()]>) closeHandler;
  shared formal NetSocket(*<[Anything()]>) upgradeToSsl;
  shared formal Boolean(*<[]>) isSsl;
}
