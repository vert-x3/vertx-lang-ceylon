import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
/* Generated from io.vertx.core.datagram.DatagramPacket */
shared abstract class DatagramPacket() {
  shared formal SocketAddress(*<[]>) sender;
  shared formal Buffer(*<[]>) data;
}
