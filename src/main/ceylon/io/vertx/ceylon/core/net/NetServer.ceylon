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
import io.vertx.core.metrics {
  Measured_=Measured
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.core.net {
  NetServer_=NetServer,
  NetSocketStream_=NetSocketStream,
  NetSocket_=NetSocket
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

shared abstract class NetServer_Impl(NetServer_ delegate) satisfies NetServer & Delegating<NetServer_> {

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
    Nothing arg_0 = nothing;
    Anything v = delegate.connectHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetServer listen_impl([]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)] args) {
    if (is [] args) {
    }
    if (is [Anything(Throwable|NetServer)] args) {
    }
    if (is [Integer] args) {
    }
    if (is [Integer,String] args) {
    }
    if (is [Integer,Anything(Throwable|NetServer)] args) {
    }
    if (is [Integer,String,Anything(Throwable|NetServer)] args) {
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
    }
    if (is [Anything(Throwable?)] args) {
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
