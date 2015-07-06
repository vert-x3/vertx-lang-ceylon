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
import io.vertx.core.datagram {
  DatagramSocket_=DatagramSocket
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.datagram.DatagramSocket */
shared abstract class DatagramSocket(DatagramSocket_ delegate) satisfies Delegating
  & ReadStream<DatagramPacket>
  & Measured {
  shared formal DatagramSocket(*<[Buffer,Integer,String,Anything(Throwable|DatagramSocket)]|[String,Integer,String,Anything(Throwable|DatagramSocket)]|[String,String,Integer,String,Anything(Throwable|DatagramSocket)]>) send;
  shared formal PacketWritestream(*<[Integer,String]>) sender;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal SocketAddress(*<[]>) localAddress;
  shared formal DatagramSocket(*<[String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) listenMulticastGroup;
  shared formal DatagramSocket(*<[String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) unlistenMulticastGroup;
  shared formal DatagramSocket(*<[String,String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) blockMulticastGroup;
  shared formal DatagramSocket(*<[Integer,String,Anything(Throwable|DatagramSocket)]>) listen;
  shared actual formal DatagramSocket(*<[]>) pause;
  shared actual formal DatagramSocket(*<[]>) resume;
  shared actual formal DatagramSocket(*<[Anything()]>) endHandler;
  shared actual formal DatagramSocket(*<[Anything(DatagramPacket)]>) handler;
  shared actual formal DatagramSocket(*<[Anything(Throwable)]>) exceptionHandler;
}
