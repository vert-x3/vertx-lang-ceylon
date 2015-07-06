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
  shared formal SocketAddress(*<[]>) sender;
  shared formal Buffer(*<[]>) data;
}
