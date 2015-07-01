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
  shared formal Anything(*<[Buffer,Integer,String,Anything(Throwable|DatagramSocket)]|[String,Integer,String,Anything(Throwable|DatagramSocket)]|[String,String,Integer,String,Anything(Throwable|DatagramSocket)]>) send;
  shared formal Anything(*<[Integer,String]>) sender;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal Anything(*<[]>) localAddress;
  shared formal Anything(*<[String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) listenMulticastGroup;
  shared formal Anything(*<[String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) unlistenMulticastGroup;
  shared formal Anything(*<[String,String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) blockMulticastGroup;
  shared formal Anything(*<[Integer,String,Anything(Throwable|DatagramSocket)]>) listen;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[Anything()]>) endHandler;
  shared actual formal Anything(*<[Anything(DatagramPacket)]>) handler;
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
}
