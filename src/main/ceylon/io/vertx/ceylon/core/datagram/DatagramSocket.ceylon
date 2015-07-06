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

  DatagramSocket send_impl([Buffer,Integer,String,Anything(Throwable|DatagramSocket)]|[String,Integer,String,Anything(Throwable|DatagramSocket)]|[String,String,Integer,String,Anything(Throwable|DatagramSocket)] args) {
    throw Exception("implement me");
  }

  shared  DatagramSocket(*<[Buffer,Integer,String,Anything(Throwable|DatagramSocket)]|[String,Integer,String,Anything(Throwable|DatagramSocket)]|[String,String,Integer,String,Anything(Throwable|DatagramSocket)]>) send = flatten(send_impl);

  PacketWritestream sender_impl([Integer,String] args) {
    throw Exception("implement me");
  }

  shared  PacketWritestream(*<[Integer,String]>) sender = flatten(sender_impl);

  Anything close_impl([]|[Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]|[Anything(Throwable?)]>) close = flatten(close_impl);

  SocketAddress localAddress_impl([] args) {
    throw Exception("implement me");
  }

  shared  SocketAddress(*<[]>) localAddress = flatten(localAddress_impl);

  DatagramSocket listenMulticastGroup_impl([String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)] args) {
    throw Exception("implement me");
  }

  shared  DatagramSocket(*<[String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) listenMulticastGroup = flatten(listenMulticastGroup_impl);

  DatagramSocket unlistenMulticastGroup_impl([String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)] args) {
    throw Exception("implement me");
  }

  shared  DatagramSocket(*<[String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) unlistenMulticastGroup = flatten(unlistenMulticastGroup_impl);

  DatagramSocket blockMulticastGroup_impl([String,String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)] args) {
    throw Exception("implement me");
  }

  shared  DatagramSocket(*<[String,String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) blockMulticastGroup = flatten(blockMulticastGroup_impl);

  DatagramSocket listen_impl([Integer,String,Anything(Throwable|DatagramSocket)] args) {
    throw Exception("implement me");
  }

  shared  DatagramSocket(*<[Integer,String,Anything(Throwable|DatagramSocket)]>) listen = flatten(listen_impl);

  DatagramSocket pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual DatagramSocket(*<[]>) pause = flatten(pause_impl);

  DatagramSocket resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual DatagramSocket(*<[]>) resume = flatten(resume_impl);

  DatagramSocket endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual DatagramSocket(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  DatagramSocket handler_impl([Anything(DatagramPacket)] args) {
    throw Exception("implement me");
  }

  shared actual DatagramSocket(*<[Anything(DatagramPacket)]>) handler = flatten(handler_impl);

  DatagramSocket exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual DatagramSocket(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

}
