import java.lang {
  String_=String
}
import io.vertx.ceylon.core.net {
  NetSocketStream,
  NetSocket
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.core.net {
  NetServer_=NetServer
}
/* Generated from io.vertx.core.net.NetServer */
shared interface NetServer satisfies Measured {

  shared formal NetSocketStream(*<[]>) connectStream;
  shared formal NetServer(*<[Anything(NetSocket)]>) connectHandler;
  shared formal NetServer(*<[]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)]>) listen;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal Integer(*<[]>) actualPort;
}
/* Generated from io.vertx.core.net.NetServer */

shared abstract class NetServer_Impl(NetServer delegate) satisfies NetServer & Delegating<NetServer> {

  shared actual NetSocketStream(*<[]>) connectStream => flatten(connectStream_impl);
  shared actual NetServer(*<[Anything(NetSocket)]>) connectHandler => flatten(connectHandler_impl);
  shared actual NetServer(*<[]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)]>) listen => flatten(listen_impl);
  shared actual Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);
  shared actual Integer(*<[]>) actualPort => flatten(actualPort_impl);

  NetSocketStream connectStream_impl([] args) {
    Anything v = delegate.connectStream();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetServer connectHandler_impl([Anything(NetSocket)] args) {
    Anything v = delegate.connectHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetServer listen_impl([]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)] args) {
    if (is [] args) {
      Anything v = delegate.listen();
    }
    if (is [Anything(Throwable|NetServer)] args) {
      Anything v = delegate.listen(nothing);
    }
    if (is [Integer] args) {
      Anything v = delegate.listen(args[0]);
    }
    if (is [Integer,String] args) {
      Anything v = delegate.listen(args[0],args[1]);
    }
    if (is [Integer,Anything(Throwable|NetServer)] args) {
      Anything v = delegate.listen(args[0],nothing);
    }
    if (is [Integer,String,Anything(Throwable|NetServer)] args) {
      Anything v = delegate.listen(args[0],args[1],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      Anything v = delegate.close();
    }
    if (is [Anything(Throwable?)] args) {
      Anything v = delegate.close(nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer actualPort_impl([] args) {
    Anything v = delegate.actualPort();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
