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
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) endHandler;
  shared actual formal Anything(*<[]|[]|[]>) write;
  shared actual formal Anything(*<[]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[]>) drainHandler;
  shared formal Anything(*<[]>) writeHandlerID;
  shared formal Anything(*<[]|[]>) sendFile;
  shared formal Anything(*<[]>) remoteAddress;
  shared formal Anything(*<[]>) localAddress;
  shared formal Anything(*<[]>) close;
  shared formal Anything(*<[]>) closeHandler;
  shared formal Anything(*<[]>) upgradeToSsl;
  shared formal Anything(*<[]>) isSsl;
}
