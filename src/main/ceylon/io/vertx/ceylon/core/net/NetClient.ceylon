import java.lang {
  String_=String
}
import io.vertx.ceylon.core.net {
  NetSocket
}
import io.vertx.ceylon.core.metrics {
  Measured
}
/* Generated from io.vertx.core.net.NetClient */
shared abstract class NetClient() satisfies Measured {
  shared formal Anything(*<[Integer,String,Anything(Throwable|NetSocket)]>) connect;
  shared formal Anything(*<[]>) close;
}
