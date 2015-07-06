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
  shared formal NetSocketStream(*<[]>) connectStream;
  shared formal NetServer(*<[Anything(NetSocket)]>) connectHandler;
  shared formal NetServer(*<[]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)]>) listen;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal Integer(*<[]>) actualPort;
}
