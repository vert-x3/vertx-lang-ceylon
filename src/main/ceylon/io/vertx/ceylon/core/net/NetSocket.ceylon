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
shared interface NetSocket satisfies ReadStream<Buffer>& WriteStream<Buffer> {

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
/* Generated from io.vertx.core.net.NetSocket */

shared abstract class NetSocket_Impl(NetSocket delegate) satisfies NetSocket & Delegating<NetSocket> {

  shared actual NetSocket(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual NetSocket(*<[Anything(Buffer)]>) handler => flatten(handler_impl);
  shared actual NetSocket(*<[]>) pause => flatten(pause_impl);
  shared actual NetSocket(*<[]>) resume => flatten(resume_impl);
  shared actual NetSocket(*<[Anything()]>) endHandler => flatten(endHandler_impl);
  shared actual NetSocket(*<[Buffer]|[String]|[String,String]>) write => flatten(write_impl);
  shared actual NetSocket(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);
  shared actual NetSocket(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);
  shared actual String(*<[]>) writeHandlerID => flatten(writeHandlerID_impl);
  shared actual NetSocket(*<[String]|[String,Anything(Throwable?)]>) sendFile => flatten(sendFile_impl);
  shared actual SocketAddress(*<[]>) remoteAddress => flatten(remoteAddress_impl);
  shared actual SocketAddress(*<[]>) localAddress => flatten(localAddress_impl);
  shared actual Anything(*<[]>) close => flatten(close_impl);
  shared actual NetSocket(*<[Anything()]>) closeHandler => flatten(closeHandler_impl);
  shared actual NetSocket(*<[Anything()]>) upgradeToSsl => flatten(upgradeToSsl_impl);
  shared actual Boolean(*<[]>) isSsl => flatten(isSsl_impl);

  NetSocket exceptionHandler_impl([Anything(Throwable)] args) {
    Anything v = delegate.exceptionHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket handler_impl([Anything(Buffer)] args) {
    Anything v = delegate.handler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket endHandler_impl([Anything()] args) {
    Anything v = delegate.endHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket write_impl([Buffer]|[String]|[String,String] args) {
    if (is [Buffer] args) {
      assert(is Delegating<Buffer> arg_0 = args[0]);
      Anything v = delegate.write(arg_0.delegate);
    }
    if (is [String] args) {
      Anything v = delegate.write(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.write(args[0],args[1]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket setWriteQueueMaxSize_impl([Integer] args) {
    Anything v = delegate.setWriteQueueMaxSize(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket drainHandler_impl([Anything()] args) {
    Anything v = delegate.drainHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String writeHandlerID_impl([] args) {
    Anything v = delegate.writeHandlerID();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket sendFile_impl([String]|[String,Anything(Throwable?)] args) {
    if (is [String] args) {
      Anything v = delegate.sendFile(args[0]);
    }
    if (is [String,Anything(Throwable?)] args) {
      Anything v = delegate.sendFile(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SocketAddress remoteAddress_impl([] args) {
    Anything v = delegate.remoteAddress();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SocketAddress localAddress_impl([] args) {
    Anything v = delegate.localAddress();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([] args) {
    Anything v = delegate.close();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket closeHandler_impl([Anything()] args) {
    Anything v = delegate.closeHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetSocket upgradeToSsl_impl([Anything()] args) {
    Anything v = delegate.upgradeToSsl(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isSsl_impl([] args) {
    Anything v = delegate.isSsl();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
