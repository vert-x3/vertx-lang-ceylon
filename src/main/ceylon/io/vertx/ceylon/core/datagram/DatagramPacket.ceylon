import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core.datagram {
  DatagramPacket_=DatagramPacket
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.datagram.DatagramPacket */
shared abstract class DatagramPacket(DatagramPacket_ delegate) satisfies Delegating {

  SocketAddress sender_impl([] args) {
    throw Exception("implement me");
  }

  shared  SocketAddress(*<[]>) sender = flatten(sender_impl);

  Buffer data_impl([] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[]>) data = flatten(data_impl);

}
