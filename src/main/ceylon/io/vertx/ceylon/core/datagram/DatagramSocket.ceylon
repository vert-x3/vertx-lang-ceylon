import io.vertx.core.datagram {
  DatagramSocket_=DatagramSocket,
  PacketWritestream_=PacketWritestream,
  DatagramPacket_=DatagramPacket
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.metrics {
  Measured_=Measured
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
import io.vertx.core.net {
  SocketAddress_=SocketAddress
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
import java.lang {
  Void_=Void,
  String_=String
}
import io.vertx.ceylon.core.datagram {
  PacketWritestream,
  DatagramPacket
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core.streams {
  ReadStream_=ReadStream
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
import io.vertx.ceylon.core.metrics {
  Measured
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

shared abstract class DatagramSocket_Impl(DatagramSocket_ delegate) satisfies DatagramSocket & Delegating<DatagramSocket_> {

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
      assert(is Delegating<Buffer_> arg_0 = args[0]);
      Integer arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<AsyncResult_<DatagramSocket_>> arg_3 = nothing;
      Anything v = delegate.send(arg_0.delegate,arg_1,arg_2,arg_3);
    }
    if (is [String,Integer,String,Anything(Throwable|DatagramSocket)] args) {
      String arg_0 = args[0];
      Integer arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<AsyncResult_<DatagramSocket_>> arg_3 = nothing;
      Anything v = delegate.send(arg_0,arg_1,arg_2,arg_3);
    }
    if (is [String,String,Integer,String,Anything(Throwable|DatagramSocket)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Integer arg_2 = args[2];
      String arg_3 = args[3];
      Handler_<AsyncResult_<DatagramSocket_>> arg_4 = nothing;
      Anything v = delegate.send(arg_0,arg_1,arg_2,arg_3,arg_4);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  PacketWritestream sender_impl([Integer,String] args) {
    Integer arg_0 = args[0];
    String arg_1 = args[1];
    Anything v = delegate.sender(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      Anything v = delegate.close();
    }
    if (is [Anything(Throwable?)] args) {
      Handler_<AsyncResult_<Void_>> arg_0 = nothing;
      Anything v = delegate.close(arg_0);
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
      String arg_0 = args[0];
      Handler_<AsyncResult_<DatagramSocket_>> arg_1 = nothing;
      Anything v = delegate.listenMulticastGroup(arg_0,arg_1);
    }
    if (is [String,String,String,Anything(Throwable|DatagramSocket)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<AsyncResult_<DatagramSocket_>> arg_3 = nothing;
      Anything v = delegate.listenMulticastGroup(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket unlistenMulticastGroup_impl([String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)] args) {
    if (is [String,Anything(Throwable|DatagramSocket)] args) {
      String arg_0 = args[0];
      Handler_<AsyncResult_<DatagramSocket_>> arg_1 = nothing;
      Anything v = delegate.unlistenMulticastGroup(arg_0,arg_1);
    }
    if (is [String,String,String,Anything(Throwable|DatagramSocket)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<AsyncResult_<DatagramSocket_>> arg_3 = nothing;
      Anything v = delegate.unlistenMulticastGroup(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket blockMulticastGroup_impl([String,String,Anything(Throwable|DatagramSocket)]|[String,String,String,Anything(Throwable|DatagramSocket)] args) {
    if (is [String,String,Anything(Throwable|DatagramSocket)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<AsyncResult_<DatagramSocket_>> arg_2 = nothing;
      Anything v = delegate.blockMulticastGroup(arg_0,arg_1,arg_2);
    }
    if (is [String,String,String,Anything(Throwable|DatagramSocket)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<AsyncResult_<DatagramSocket_>> arg_3 = nothing;
      Anything v = delegate.blockMulticastGroup(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket listen_impl([Integer,String,Anything(Throwable|DatagramSocket)] args) {
    Integer arg_0 = args[0];
    String arg_1 = args[1];
    Handler_<AsyncResult_<DatagramSocket_>> arg_2 = nothing;
    Anything v = delegate.listen(arg_0,arg_1,arg_2);
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
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket handler_impl([Anything(DatagramPacket)] args) {
    Handler_<DatagramPacket_> arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket exceptionHandler_impl([Anything(Throwable)] args) {
    Handler_<Throwable> arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
