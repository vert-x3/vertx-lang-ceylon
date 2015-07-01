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
shared abstract class DatagramSocket() satisfies ReadStream<DatagramPacket> & Measured {
  shared formal Anything(*<[]|[]|[]>) send;
  shared formal Anything(*<[]>) sender;
  shared formal Anything(*<[]|[]>) close;
  shared formal Anything(*<[]>) localAddress;
  shared formal Anything(*<[]|[]>) listenMulticastGroup;
  shared formal Anything(*<[]|[]>) unlistenMulticastGroup;
  shared formal Anything(*<[]|[]>) blockMulticastGroup;
  shared formal Anything(*<[]>) listen;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) endHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) exceptionHandler;
}
