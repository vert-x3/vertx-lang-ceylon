import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.net.NetSocket */
shared abstract class NetSocket() satisfies ReadStream<Buffer> & WriteStream<Buffer> {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal Anything(*<[Anything(Buffer)]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[Anything()]>) endHandler;
  shared actual formal Anything(*<[Buffer]|[String]|[String,String]>) write;
  shared actual formal Anything(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[Anything()]>) drainHandler;
  shared formal Anything(*<[]>) writeHandlerID;
  shared formal Anything(*<[String]|[String,Anything(Throwable?)]>) sendFile;
  shared formal Anything(*<[]>) remoteAddress;
  shared formal Anything(*<[]>) localAddress;
  shared formal Anything(*<[]>) close;
  shared formal Anything(*<[Anything()]>) closeHandler;
  shared formal Anything(*<[Anything()]>) upgradeToSsl;
  shared formal Anything(*<[]>) isSsl;
}
