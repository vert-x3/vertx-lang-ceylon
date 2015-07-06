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
shared abstract class NetServer(NetServer_ delegate) satisfies Delegating
  & Measured {

  NetSocketStream connectStream_impl([] args) {
    throw Exception("implement me");
  }

  shared  NetSocketStream(*<[]>) connectStream = flatten(connectStream_impl);

  NetServer connectHandler_impl([Anything(NetSocket)] args) {
    throw Exception("implement me");
  }

  shared  NetServer(*<[Anything(NetSocket)]>) connectHandler = flatten(connectHandler_impl);

  NetServer listen_impl([]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)] args) {
    throw Exception("implement me");
  }

  shared  NetServer(*<[]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)]>) listen = flatten(listen_impl);

  Anything close_impl([]|[Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]|[Anything(Throwable?)]>) close = flatten(close_impl);

  Integer actualPort_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) actualPort = flatten(actualPort_impl);

}
