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

  shared  SocketAddress(*<[]>) sender => flatten(sender_impl);

  shared  Buffer(*<[]>) data => flatten(data_impl);

  SocketAddress sender_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer data_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
