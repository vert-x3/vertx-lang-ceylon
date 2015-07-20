import java.lang {
  String_=String
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  SocketAddress_=SocketAddress
}
/* Generated from io.vertx.core.net.SocketAddress */
shared abstract class SocketAddress(SocketAddress_ delegate) satisfies Delegating {

  shared  String(*<[]>) host => flatten(host_impl);

  shared  Integer(*<[]>) port => flatten(port_impl);

  String host_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer port_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
