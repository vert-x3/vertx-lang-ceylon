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

  shared  NetClient(*<[Integer,String,Anything(Throwable|NetSocket)]>) connect => flatten(connect_impl);

  shared  Anything(*<[]>) close => flatten(close_impl);

  NetClient connect_impl([Integer,String,Anything(Throwable|NetSocket)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
