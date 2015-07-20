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

  shared  DatagramSocket(*<[Buffer,Integer,String,Anything(Throwable|DatagramSocket)]|[String,Integer,String,Anything(Throwable|DatagramSocket)]|[String,String,Integer,String,Anything(Throwable|DatagramSocket)]>) send => flatten(send_impl);

  shared  PacketWritestream(*<[Integer,String]>) sender => flatten(sender_impl);

  shared  Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);

  shared  SocketAddress(*<[]>) localAddress => flatten(localAddress_impl);

  shared  DatagramSocket(*<[String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) listenMulticastGroup => flatten(listenMulticastGroup_impl);

  shared  DatagramSocket(*<[String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) unlistenMulticastGroup => flatten(unlistenMulticastGroup_impl);

  shared  DatagramSocket(*<[String,String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)]>) blockMulticastGroup => flatten(blockMulticastGroup_impl);

  shared  DatagramSocket(*<[Integer,String,Anything(Throwable|DatagramSocket)]>) listen => flatten(listen_impl);

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
    // Invoke method
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
    // Invoke method
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
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket pause_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket resume_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket endHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket handler_impl([Anything(DatagramPacket)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket exceptionHandler_impl([Anything(Throwable)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
