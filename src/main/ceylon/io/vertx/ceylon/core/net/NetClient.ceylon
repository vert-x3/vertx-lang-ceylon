import java.lang {
  String_=String
}
import io.vertx.ceylon.core.net {
  NetSocket
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.core.net {
  NetClient_=NetClient
}
/* Generated from io.vertx.core.net.NetClient */
shared abstract class NetClient(NetClient_ delegate) satisfies Delegating
  & Measured {
  shared formal NetClient(*<[Integer,String,Anything(Throwable|NetSocket)]>) connect;
  shared formal Anything(*<[]>) close;
}
