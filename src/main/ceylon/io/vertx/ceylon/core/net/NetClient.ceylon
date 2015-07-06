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

  NetClient connect_impl([Integer,String,Anything(Throwable|NetSocket)] args) {
    throw Exception("implement me");
  }

  shared  NetClient(*<[Integer,String,Anything(Throwable|NetSocket)]>) connect = flatten(connect_impl);

  Anything close_impl([] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]>) close = flatten(close_impl);

}
