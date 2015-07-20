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
shared interface DatagramPacket  {

  shared formal SocketAddress(*<[]>) sender;
  shared formal Buffer(*<[]>) data;
}
/* Generated from io.vertx.core.datagram.DatagramPacket */

shared abstract class DatagramPacket_Impl(DatagramPacket delegate) satisfies DatagramPacket & Delegating<DatagramPacket> {

  shared actual SocketAddress(*<[]>) sender => flatten(sender_impl);
  shared actual Buffer(*<[]>) data => flatten(data_impl);

  SocketAddress sender_impl([] args) {
    Anything v = delegate.sender();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer data_impl([] args) {
    Anything v = delegate.data();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
