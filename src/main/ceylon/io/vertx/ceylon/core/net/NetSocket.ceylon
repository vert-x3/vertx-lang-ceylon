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

  shared actual NetSocket(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual NetSocket(*<[Anything(Buffer)]>) handler => flatten(handler_impl);

  shared actual NetSocket(*<[]>) pause => flatten(pause_impl);

  shared actual NetSocket(*<[]>) resume => flatten(resume_impl);

  shared actual NetSocket(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  shared actual NetSocket(*<[Buffer]|[String]|[String,String]>) write => flatten(write_impl);

  shared actual NetSocket(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);

  shared actual NetSocket(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);

  shared  String(*<[]>) writeHandlerID => flatten(writeHandlerID_impl);

  shared  NetSocket(*<[String]|[String,Anything(Throwable?)]>) sendFile => flatten(sendFile_impl);

  shared  SocketAddress(*<[]>) remoteAddress => flatten(remoteAddress_impl);

  shared  SocketAddress(*<[]>) localAddress => flatten(localAddress_impl);

  shared  Anything(*<[]>) close => flatten(close_impl);

  shared  NetSocket(*<[Anything()]>) closeHandler => flatten(closeHandler_impl);

  shared  NetSocket(*<[Anything()]>) upgradeToSsl => flatten(upgradeToSsl_impl);

  shared  Boolean(*<[]>) isSsl => flatten(isSsl_impl);

  NetSocket exceptionHandler_impl([Anything(Throwable)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket handler_impl([Anything(Buffer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket pause_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket resume_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket endHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket write_impl([Buffer]|[String]|[String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket setWriteQueueMaxSize_impl([Integer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket drainHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String writeHandlerID_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket sendFile_impl([String]|[String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SocketAddress remoteAddress_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SocketAddress localAddress_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket closeHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket upgradeToSsl_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isSsl_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
