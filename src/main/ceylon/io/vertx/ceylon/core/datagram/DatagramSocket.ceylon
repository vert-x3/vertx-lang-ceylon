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
shared interface DatagramSocket satisfies ReadStream<DatagramPacket>& Measured {

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
/* Generated from io.vertx.core.datagram.DatagramSocket */

shared abstract class DatagramSocket_Impl(DatagramSocket delegate) satisfies DatagramSocket & Delegating<DatagramSocket> {

  shared actual DatagramSocket(*<[Buffer,Integer,String,Anything(Throwable|DatagramSocket)]|[String,Integer,String,Anything(Throwable|DatagramSocket)]|[String,String,Integer,String,Anything(Throwable|DatagramSocket)]>) send => flatten(send_impl);
  shared actual PacketWritestream(*<[Integer,String]>) sender => flatten(sender_impl);
  shared actual Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);
  shared actual SocketAddress(*<[]>) localAddress => flatten(localAddress_impl);
  shared actual DatagramSocket(*<[String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) listenMulticastGroup => flatten(listenMulticastGroup_impl);
  shared actual DatagramSocket(*<[String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) unlistenMulticastGroup => flatten(unlistenMulticastGroup_impl);
  shared actual DatagramSocket(*<[String,String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) blockMulticastGroup => flatten(blockMulticastGroup_impl);
  shared actual DatagramSocket(*<[Integer,String,Anything(Throwable|DatagramSocket)]>) listen => flatten(listen_impl);
  shared actual DatagramSocket(*<[]>) pause => flatten(pause_impl);
  shared actual DatagramSocket(*<[]>) resume => flatten(resume_impl);
  shared actual DatagramSocket(*<[Anything()]>) endHandler => flatten(endHandler_impl);
  shared actual DatagramSocket(*<[Anything(DatagramPacket)]>) handler => flatten(handler_impl);
  shared actual DatagramSocket(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  DatagramSocket send_impl([Buffer,Integer,String,Anything(Throwable|DatagramSocket)]|[String,Integer,String,Anything(Throwable|DatagramSocket)]|[String,String,Integer,String,Anything(Throwable|DatagramSocket)] args) {
    if (is [Buffer,Integer,String,Anything(Throwable|DatagramSocket)] args) {
      // Invoke method
    }
    if (is [String,Integer,String,Anything(Throwable|DatagramSocket)] args) {
      // Invoke method
    }
    if (is [String,String,Integer,String,Anything(Throwable|DatagramSocket)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  PacketWritestream sender_impl([Integer,String] args) {
    Anything v = delegate.sender(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [Anything(Throwable?)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SocketAddress localAddress_impl([] args) {
    Anything v = delegate.localAddress();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket listenMulticastGroup_impl([String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)] args) {
    if (is [String,Anything(Throwable|DatagramSocket)] args) {
      // Invoke method
    }
    if (is [String,String,String,Anything(Throwable|DatagramSocket)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket unlistenMulticastGroup_impl([String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)] args) {
    if (is [String,Anything(Throwable|DatagramSocket)] args) {
      // Invoke method
    }
    if (is [String,String,String,Anything(Throwable|DatagramSocket)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket blockMulticastGroup_impl([String,String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)] args) {
    if (is [String,String,Anything(Throwable|DatagramSocket)] args) {
      // Invoke method
    }
    if (is [String,String,String,Anything(Throwable|DatagramSocket)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket listen_impl([Integer,String,Anything(Throwable|DatagramSocket)] args) {
    Anything v = delegate.listen(args[0],args[1],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket endHandler_impl([Anything()] args) {
    Anything v = delegate.endHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket handler_impl([Anything(DatagramPacket)] args) {
    Anything v = delegate.handler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket exceptionHandler_impl([Anything(Throwable)] args) {
    Anything v = delegate.exceptionHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
