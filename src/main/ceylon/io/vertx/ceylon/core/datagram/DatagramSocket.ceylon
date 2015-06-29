import java.lang {
  String_=String
}
import io.vertx.ceylon.core.datagram {
  PacketWritestream,
  DatagramPacket
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.datagram.DatagramSocket */
shared class DatagramSocket() satisfies ReadStream<DatagramPacket> & Measured {
  shared default void send() {
  }
  shared default void sender() {
  }
  shared default void close() {
  }
  shared default void localAddress() {
  }
  shared default void listenMulticastGroup() {
  }
  shared default void unlistenMulticastGroup() {
  }
  shared default void blockMulticastGroup() {
  }
  shared default void listen() {
  }
  shared actual default void pause() {
  }
  shared actual default void resume() {
  }
  shared actual default void endHandler() {
  }
  shared actual default void handler() {
  }
  shared actual default void exceptionHandler() {
  }
}
