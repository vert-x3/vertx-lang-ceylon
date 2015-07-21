import java.lang {
  String_=String
}
import io.vertx.ceylon.core.net {
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
  NetClient_=NetClient,
  NetSocket_=NetSocket
}
/* Generated from io.vertx.core.net.NetClient */
shared interface NetClient satisfies Measured {

  shared formal NetClient(*<[Integer,String,Anything(Throwable|NetSocket)]>) connect;
  shared formal Anything(*<[]>) close;
}
/* Generated from io.vertx.core.net.NetClient */

shared abstract class NetClient_Impl(NetClient_ delegate) satisfies NetClient & Delegating<NetClient_> {

  shared actual NetClient(*<[Integer,String,Anything(Throwable|NetSocket)]>) connect => flatten(connect_impl);
  shared actual Anything(*<[]>) close => flatten(close_impl);

  NetClient connect_impl([Integer,String,Anything(Throwable|NetSocket)] args) {
    Integer arg_0 = args[0];
    String arg_1 = args[1];
    Nothing arg_2 = nothing;
    Anything v = delegate.connect(arg_0,arg_1,arg_2);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([] args) {
    Anything v = delegate.close();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
