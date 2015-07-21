import io.vertx.ceylon.core.shareddata {
  SharedData
}
import io.vertx.core.shareddata {
  SharedData_=SharedData
}
import java.util {
  Set_=Set
}
import io.vertx.core {
  Vertx_=Vertx,
  Handler_=Handler,
  AsyncResult_=AsyncResult,
  Context_=Context,
  TimeoutStream_=TimeoutStream,
  VertxOptions_=VertxOptions,
  Future_=Future,
  DeploymentOptions_=DeploymentOptions
}
import io.vertx.core.datagram {
  DatagramSocket_=DatagramSocket,
  DatagramSocketOptions_=DatagramSocketOptions
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.metrics {
  Measured_=Measured
}
import io.vertx.core.eventbus {
  EventBus_=EventBus
}
import io.vertx.core.net {
  NetClient_=NetClient,
  NetClientOptions_=NetClientOptions,
  NetServerOptions_=NetServerOptions,
  NetServer_=NetServer
}
import io.vertx.core.http {
  HttpServer_=HttpServer,
  HttpClientOptions_=HttpClientOptions,
  HttpServerOptions_=HttpServerOptions,
  HttpClient_=HttpClient
}
import io.vertx.ceylon.core.dns {
  DnsClient
}
import java.lang {
  Long_=Long,
  String_=String,
  Void_=Void
}
import io.vertx.ceylon.core.eventbus {
  EventBus
}
import io.vertx.ceylon.core.datagram {
  DatagramSocket,
  DatagramSocketOptions
}
import io.vertx.ceylon.core {
  Context,
  TimeoutStream,
  VertxOptions,
  Future,
  DeploymentOptions
}
import io.vertx.ceylon.core.file {
  FileSystem
}
import io.vertx.ceylon.core.net {
  NetClient,
  NetClientOptions,
  NetServerOptions,
  NetServer
}
import io.vertx.ceylon.core.http {
  HttpServer,
  HttpClientOptions,
  HttpServerOptions,
  HttpClient
}
import io.vertx.core.dns {
  DnsClient_=DnsClient
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.core.file {
  FileSystem_=FileSystem
}
/* Generated from io.vertx.core.Vertx */
shared interface Vertx satisfies Measured {

  shared formal Context(*<[]>) getOrCreateContext;
  shared formal NetServer(*<[]|[NetServerOptions]>) createNetServer;
  shared formal NetClient(*<[]|[NetClientOptions]>) createNetClient;
  shared formal HttpServer(*<[]|[HttpServerOptions]>) createHttpServer;
  shared formal HttpClient(*<[]|[HttpClientOptions]>) createHttpClient;
  shared formal DatagramSocket(*<[]|[DatagramSocketOptions]>) createDatagramSocket;
  shared formal FileSystem(*<[]>) fileSystem;
  shared formal EventBus(*<[]>) eventBus;
  shared formal DnsClient(*<[Integer,String]>) createDnsClient;
  shared formal SharedData(*<[]>) sharedData;
  shared formal Integer(*<[Integer,Anything(Integer)]>) setTimer;
  shared formal TimeoutStream(*<[Integer]>) timerStream;
  shared formal Integer(*<[Integer,Anything(Integer)]>) setPeriodic;
  shared formal TimeoutStream(*<[Integer]>) periodicStream;
  shared formal Boolean(*<[Integer]>) cancelTimer;
  shared formal Anything(*<[Anything()]>) runOnContext;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal Anything(*<[String]|[String,Anything(Throwable|String)]|[String,DeploymentOptions]|[String,DeploymentOptions,Anything(Throwable|String)]>) deployVerticle;
  shared formal Anything(*<[String]|[String,Anything(Throwable?)]>) undeploy;
  shared formal Set<String>(*<[]>) deploymentIDs;
  shared formal Boolean(*<[]>) isClustered;
  shared formal Anything(*<[Anything(Future<Object>),Anything(Throwable|Object)]|[Anything(Future<Object>),Boolean,Anything(Throwable|Object)]>) executeBlocking;
}
/* Generated from io.vertx.core.Vertx */

shared abstract class Vertx_Impl(Vertx_ delegate) satisfies Vertx & Delegating<Vertx_> {

  shared actual Context(*<[]>) getOrCreateContext => flatten(getOrCreateContext_impl);
  shared actual NetServer(*<[]|[NetServerOptions]>) createNetServer => flatten(createNetServer_impl);
  shared actual NetClient(*<[]|[NetClientOptions]>) createNetClient => flatten(createNetClient_impl);
  shared actual HttpServer(*<[]|[HttpServerOptions]>) createHttpServer => flatten(createHttpServer_impl);
  shared actual HttpClient(*<[]|[HttpClientOptions]>) createHttpClient => flatten(createHttpClient_impl);
  shared actual DatagramSocket(*<[]|[DatagramSocketOptions]>) createDatagramSocket => flatten(createDatagramSocket_impl);
  shared actual FileSystem(*<[]>) fileSystem => flatten(fileSystem_impl);
  shared actual EventBus(*<[]>) eventBus => flatten(eventBus_impl);
  shared actual DnsClient(*<[Integer,String]>) createDnsClient => flatten(createDnsClient_impl);
  shared actual SharedData(*<[]>) sharedData => flatten(sharedData_impl);
  shared actual Integer(*<[Integer,Anything(Integer)]>) setTimer => flatten(setTimer_impl);
  shared actual TimeoutStream(*<[Integer]>) timerStream => flatten(timerStream_impl);
  shared actual Integer(*<[Integer,Anything(Integer)]>) setPeriodic => flatten(setPeriodic_impl);
  shared actual TimeoutStream(*<[Integer]>) periodicStream => flatten(periodicStream_impl);
  shared actual Boolean(*<[Integer]>) cancelTimer => flatten(cancelTimer_impl);
  shared actual Anything(*<[Anything()]>) runOnContext => flatten(runOnContext_impl);
  shared actual Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);
  shared actual Anything(*<[String]|[String,Anything(Throwable|String)]|[String,DeploymentOptions]|[String,DeploymentOptions,Anything(Throwable|String)]>) deployVerticle => flatten(deployVerticle_impl);
  shared actual Anything(*<[String]|[String,Anything(Throwable?)]>) undeploy => flatten(undeploy_impl);
  shared actual Set<String>(*<[]>) deploymentIDs => flatten(deploymentIDs_impl);
  shared actual Boolean(*<[]>) isClustered => flatten(isClustered_impl);
  shared actual Anything(*<[Anything(Future<Object>),Anything(Throwable|Object)]|[Anything(Future<Object>),Boolean,Anything(Throwable|Object)]>) executeBlocking => flatten(executeBlocking_impl);

  Context getOrCreateContext_impl([] args) {
    Anything v = delegate.orCreateContext;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetServer createNetServer_impl([]|[NetServerOptions] args) {
    if (is [] args) {
      Anything v = delegate.createNetServer();
    }
    if (is [NetServerOptions] args) {
      NetServerOptions_ arg_0 = NetServerOptions_();
      Anything v = delegate.createNetServer(arg_0);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetClient createNetClient_impl([]|[NetClientOptions] args) {
    if (is [] args) {
      Anything v = delegate.createNetClient();
    }
    if (is [NetClientOptions] args) {
      NetClientOptions_ arg_0 = NetClientOptions_();
      Anything v = delegate.createNetClient(arg_0);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServer createHttpServer_impl([]|[HttpServerOptions] args) {
    if (is [] args) {
      Anything v = delegate.createHttpServer();
    }
    if (is [HttpServerOptions] args) {
      HttpServerOptions_ arg_0 = HttpServerOptions_();
      Anything v = delegate.createHttpServer(arg_0);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient createHttpClient_impl([]|[HttpClientOptions] args) {
    if (is [] args) {
      Anything v = delegate.createHttpClient();
    }
    if (is [HttpClientOptions] args) {
      HttpClientOptions_ arg_0 = HttpClientOptions_();
      Anything v = delegate.createHttpClient(arg_0);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket createDatagramSocket_impl([]|[DatagramSocketOptions] args) {
    if (is [] args) {
      Anything v = delegate.createDatagramSocket();
    }
    if (is [DatagramSocketOptions] args) {
      DatagramSocketOptions_ arg_0 = DatagramSocketOptions_();
      Anything v = delegate.createDatagramSocket(arg_0);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem fileSystem_impl([] args) {
    Anything v = delegate.fileSystem();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  EventBus eventBus_impl([] args) {
    Anything v = delegate.eventBus();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient createDnsClient_impl([Integer,String] args) {
    Integer arg_0 = args[0];
    String arg_1 = args[1];
    Anything v = delegate.createDnsClient(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SharedData sharedData_impl([] args) {
    Anything v = delegate.sharedData();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer setTimer_impl([Integer,Anything(Integer)] args) {
    Integer arg_0 = args[0];
    Handler_<Long_> arg_1 = nothing;
    Anything v = delegate.setTimer(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream timerStream_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.timerStream(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer setPeriodic_impl([Integer,Anything(Integer)] args) {
    Integer arg_0 = args[0];
    Handler_<Long_> arg_1 = nothing;
    Anything v = delegate.setPeriodic(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream periodicStream_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.periodicStream(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean cancelTimer_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.cancelTimer(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything runOnContext_impl([Anything()] args) {
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.runOnContext(arg_0);
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

  Anything deployVerticle_impl([String]|[String,Anything(Throwable|String)]|[String,DeploymentOptions]|[String,DeploymentOptions,Anything(Throwable|String)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.deployVerticle(arg_0);
    }
    if (is [String,Anything(Throwable|String)] args) {
      String arg_0 = args[0];
      Handler_<AsyncResult_<String_>> arg_1 = nothing;
      Anything v = delegate.deployVerticle(arg_0,arg_1);
    }
    if (is [String,DeploymentOptions] args) {
      String arg_0 = args[0];
      DeploymentOptions_ arg_1 = DeploymentOptions_();
      Anything v = delegate.deployVerticle(arg_0,arg_1);
    }
    if (is [String,DeploymentOptions,Anything(Throwable|String)] args) {
      String arg_0 = args[0];
      DeploymentOptions_ arg_1 = DeploymentOptions_();
      Handler_<AsyncResult_<String_>> arg_2 = nothing;
      Anything v = delegate.deployVerticle(arg_0,arg_1,arg_2);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything undeploy_impl([String]|[String,Anything(Throwable?)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.undeploy(arg_0);
    }
    if (is [String,Anything(Throwable?)] args) {
      String arg_0 = args[0];
      Handler_<AsyncResult_<Void_>> arg_1 = nothing;
      Anything v = delegate.undeploy(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<String> deploymentIDs_impl([] args) {
    Anything v = delegate.deploymentIDs();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isClustered_impl([] args) {
    Anything v = delegate.clustered;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything executeBlocking_impl([Anything(Future<Object>),Anything(Throwable|Object)]|[Anything(Future<Object>),Boolean,Anything(Throwable|Object)] args) {
    if (is [Anything(Future<Object>),Anything(Throwable|Object)] args) {
      Handler_<Future_<Object>> arg_0 = nothing;
      Handler_<AsyncResult_<Object>> arg_1 = nothing;
      Anything v = delegate.executeBlocking(arg_0,arg_1);
    }
    if (is [Anything(Future<Object>),Boolean,Anything(Throwable|Object)] args) {
      Handler_<Future_<Object>> arg_0 = nothing;
      Boolean arg_1 = args[1];
      Handler_<AsyncResult_<Object>> arg_2 = nothing;
      Anything v = delegate.executeBlocking(arg_0,arg_1,arg_2);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
