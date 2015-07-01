import java.lang {
  String_=String
}
import io.vertx.ceylon.core.net {
  NetSocketStream,
  NetSocket
}
import io.vertx.ceylon.core.metrics {
  Measured
}
/* Generated from io.vertx.core.net.NetServer */
shared abstract class NetServer() satisfies Measured {
  shared formal Anything(*<[]>) connectStream;
  shared formal Anything(*<[Anything(NetSocket)]>) connectHandler;
  shared formal Anything(*<[]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)]>) listen;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal Anything(*<[]>) actualPort;
}
