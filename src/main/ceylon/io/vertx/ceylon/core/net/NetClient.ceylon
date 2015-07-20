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
shared interface NetClient satisfies Measured {

  shared formal NetClient(*<[Integer,String,Anything(Throwable|NetSocket)]>) connect;
  shared formal Anything(*<[]>) close;
}
/* Generated from io.vertx.core.net.NetClient */

shared abstract class NetClient_Impl(NetClient delegate) satisfies NetClient & Delegating<NetClient> {

  shared actual NetClient(*<[Integer,String,Anything(Throwable|NetSocket)]>) connect => flatten(connect_impl);
  shared actual Anything(*<[]>) close => flatten(close_impl);

  NetClient connect_impl([Integer,String,Anything(Throwable|NetSocket)] args) {
    Anything v = delegate.connect(args[0],args[1],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([] args) {
    Anything v = delegate.close();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
