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
  shared formal String(*<[]>) host;
  shared formal Integer(*<[]>) port;
}
