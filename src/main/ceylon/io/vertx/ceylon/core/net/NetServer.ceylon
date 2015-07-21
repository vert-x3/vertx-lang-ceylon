import java.lang {
  Void_=Void,
  String_=String
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.ceylon.core.net {
  NetSocketStream,
  NetSocket
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.metrics {
  Measured_=Measured
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.core.net {
  NetServer_=NetServer,
  NetSocketStream_=NetSocketStream,
  NetSocket_=NetSocket
}
/* Generated from io.vertx.core.net.NetServer */
shared interface NetServer satisfies Measured {

  shared formal NetSocketStream(*<[]>) connectStream;
  shared formal NetServer(*<[Anything(NetSocket)]>) connectHandler;
  shared formal NetServer(*<[]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)]>) listen;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal Integer(*<[]>) actualPort;
}
/* Generated from io.vertx.core.net.NetServer */

shared abstract class NetServer_Impl(NetServer_ delegate) satisfies NetServer & Delegating<NetServer_> {

  shared actual NetSocketStream(*<[]>) connectStream => flatten(connectStream_impl);
  shared actual NetServer(*<[Anything(NetSocket)]>) connectHandler => flatten(connectHandler_impl);
  shared actual NetServer(*<[]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)]>) listen => flatten(listen_impl);
  shared actual Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);
  shared actual Integer(*<[]>) actualPort => flatten(actualPort_impl);

  NetSocketStream connectStream_impl([] args) {
    Anything v = delegate.connectStream();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetServer connectHandler_impl([Anything(NetSocket)] args) {
    Handler_<NetSocket_> arg_0 = nothing;
    Anything v = delegate.connectHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetServer listen_impl([]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)] args) {
    if (is [] args) {
      Anything v = delegate.listen();
    }
    if (is [Anything(Throwable|NetServer)] args) {
      Handler_<AsyncResult_<NetServer_>> arg_0 = nothing;
      Anything v = delegate.listen(arg_0);
    }
    if (is [Integer] args) {
      Integer arg_0 = args[0];
      Anything v = delegate.listen(arg_0);
    }
    if (is [Integer,String] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      Anything v = delegate.listen(arg_0,arg_1);
    }
    if (is [Integer,Anything(Throwable|NetServer)] args) {
      Integer arg_0 = args[0];
      Handler_<AsyncResult_<NetServer_>> arg_1 = nothing;
      Anything v = delegate.listen(arg_0,arg_1);
    }
    if (is [Integer,String,Anything(Throwable|NetServer)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<AsyncResult_<NetServer_>> arg_2 = nothing;
      Anything v = delegate.listen(arg_0,arg_1,arg_2);
    }
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

  Integer actualPort_impl([] args) {
    Anything v = delegate.actualPort();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
