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
  shared formal NetSocketStream(*<[]>) connectStream;
  shared formal NetServer(*<[Anything(NetSocket)]>) connectHandler;
  shared formal NetServer(*<[]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)]>) listen;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal Integer(*<[]>) actualPort;
}
