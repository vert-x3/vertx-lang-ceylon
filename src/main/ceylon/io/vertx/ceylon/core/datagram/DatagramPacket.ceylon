import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
/* Generated from io.vertx.core.datagram.DatagramPacket */
shared abstract class DatagramPacket() {
  shared formal Anything(*<[]>) sender;
  shared formal Anything(*<[]>) data;
}
