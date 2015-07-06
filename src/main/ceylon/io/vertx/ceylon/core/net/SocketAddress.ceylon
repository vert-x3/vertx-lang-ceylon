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

  String host_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) host = flatten(host_impl);

  Integer port_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) port = flatten(port_impl);

}
