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

  NetSocket exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual NetSocket(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  NetSocket handler_impl([Anything(Buffer)] args) {
    throw Exception("implement me");
  }

  shared actual NetSocket(*<[Anything(Buffer)]>) handler = flatten(handler_impl);

  NetSocket pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual NetSocket(*<[]>) pause = flatten(pause_impl);

  NetSocket resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual NetSocket(*<[]>) resume = flatten(resume_impl);

  NetSocket endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual NetSocket(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  NetSocket write_impl([Buffer]|[String]|[String,String] args) {
    throw Exception("implement me");
  }

  shared actual NetSocket(*<[Buffer]|[String]|[String,String]>) write = flatten(write_impl);

  NetSocket setWriteQueueMaxSize_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared actual NetSocket(*<[Integer]>) setWriteQueueMaxSize = flatten(setWriteQueueMaxSize_impl);

  NetSocket drainHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual NetSocket(*<[Anything()]>) drainHandler = flatten(drainHandler_impl);

  String writeHandlerID_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) writeHandlerID = flatten(writeHandlerID_impl);

  NetSocket sendFile_impl([String]|[String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  NetSocket(*<[String]|[String,Anything(Throwable?)]>) sendFile = flatten(sendFile_impl);

  SocketAddress remoteAddress_impl([] args) {
    throw Exception("implement me");
  }

  shared  SocketAddress(*<[]>) remoteAddress = flatten(remoteAddress_impl);

  SocketAddress localAddress_impl([] args) {
    throw Exception("implement me");
  }

  shared  SocketAddress(*<[]>) localAddress = flatten(localAddress_impl);

  Anything close_impl([] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]>) close = flatten(close_impl);

  NetSocket closeHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared  NetSocket(*<[Anything()]>) closeHandler = flatten(closeHandler_impl);

  NetSocket upgradeToSsl_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared  NetSocket(*<[Anything()]>) upgradeToSsl = flatten(upgradeToSsl_impl);

  Boolean isSsl_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isSsl = flatten(isSsl_impl);

}
