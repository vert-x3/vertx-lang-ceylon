import java.lang {
  String_=String
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  SocketAddress_=SocketAddress
}
/* Generated from io.vertx.core.net.SocketAddress */
shared interface SocketAddress  {

  shared formal String(*<[]>) host;
  shared formal Integer(*<[]>) port;
}
/* Generated from io.vertx.core.net.SocketAddress */

shared abstract class SocketAddress_Impl(SocketAddress_ delegate) satisfies SocketAddress & Delegating<SocketAddress_> {

  shared actual String(*<[]>) host => flatten(host_impl);
  shared actual Integer(*<[]>) port => flatten(port_impl);

  String host_impl([] args) {
    Anything v = delegate.host();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer port_impl([] args) {
    Anything v = delegate.port();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
