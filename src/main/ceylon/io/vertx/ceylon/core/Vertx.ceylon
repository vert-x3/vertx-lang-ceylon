import io.vertx.ceylon.core.shareddata {
  SharedData
}
import java.lang {
  Long_=Long,
  String_=String
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
import io.vertx.core {
  Vertx_=Vertx
}
import io.vertx.ceylon.core.net {
  NetClient,
  NetClientOptions,
  NetServerOptions,
  NetServer
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  HttpServer,
  HttpClientOptions,
  HttpServerOptions,
  HttpClient
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.ceylon.core.dns {
  DnsClient
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

shared abstract class Vertx_Impl(Vertx delegate) satisfies Vertx & Delegating<Vertx> {

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
    Anything v = delegate.getOrCreateContext();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetServer createNetServer_impl([]|[NetServerOptions] args) {
    if (is [] args) {
      Anything v = delegate.createNetServer();
    }
    if (is [NetServerOptions] args) {
      Anything v = delegate.createNetServer(nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetClient createNetClient_impl([]|[NetClientOptions] args) {
    if (is [] args) {
      Anything v = delegate.createNetClient();
    }
    if (is [NetClientOptions] args) {
      Anything v = delegate.createNetClient(nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServer createHttpServer_impl([]|[HttpServerOptions] args) {
    if (is [] args) {
      Anything v = delegate.createHttpServer();
    }
    if (is [HttpServerOptions] args) {
      Anything v = delegate.createHttpServer(nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient createHttpClient_impl([]|[HttpClientOptions] args) {
    if (is [] args) {
      Anything v = delegate.createHttpClient();
    }
    if (is [HttpClientOptions] args) {
      Anything v = delegate.createHttpClient(nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket createDatagramSocket_impl([]|[DatagramSocketOptions] args) {
    if (is [] args) {
      Anything v = delegate.createDatagramSocket();
    }
    if (is [DatagramSocketOptions] args) {
      Anything v = delegate.createDatagramSocket(nothing);
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
    Anything v = delegate.createDnsClient(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SharedData sharedData_impl([] args) {
    Anything v = delegate.sharedData();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer setTimer_impl([Integer,Anything(Integer)] args) {
    Anything v = delegate.setTimer(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream timerStream_impl([Integer] args) {
    Anything v = delegate.timerStream(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer setPeriodic_impl([Integer,Anything(Integer)] args) {
    Anything v = delegate.setPeriodic(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream periodicStream_impl([Integer] args) {
    Anything v = delegate.periodicStream(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean cancelTimer_impl([Integer] args) {
    Anything v = delegate.cancelTimer(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything runOnContext_impl([Anything()] args) {
    Anything v = delegate.runOnContext(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      Anything v = delegate.close();
    }
    if (is [Anything(Throwable?)] args) {
      Anything v = delegate.close(nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything deployVerticle_impl([String]|[String,Anything(Throwable|String)]|[String,DeploymentOptions]|[String,DeploymentOptions,Anything(Throwable|String)] args) {
    if (is [String] args) {
      Anything v = delegate.deployVerticle(args[0]);
    }
    if (is [String,Anything(Throwable|String)] args) {
      Anything v = delegate.deployVerticle(args[0],nothing);
    }
    if (is [String,DeploymentOptions] args) {
      Anything v = delegate.deployVerticle(args[0],nothing);
    }
    if (is [String,DeploymentOptions,Anything(Throwable|String)] args) {
      Anything v = delegate.deployVerticle(args[0],nothing,nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything undeploy_impl([String]|[String,Anything(Throwable?)] args) {
    if (is [String] args) {
      Anything v = delegate.undeploy(args[0]);
    }
    if (is [String,Anything(Throwable?)] args) {
      Anything v = delegate.undeploy(args[0],nothing);
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
    Anything v = delegate.isClustered();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything executeBlocking_impl([Anything(Future<Object>),Anything(Throwable|Object)]|[Anything(Future<Object>),Boolean,Anything(Throwable|Object)] args) {
    if (is [Anything(Future<Object>),Anything(Throwable|Object)] args) {
      Anything v = delegate.executeBlocking(nothing,nothing);
    }
    if (is [Anything(Future<Object>),Boolean,Anything(Throwable|Object)] args) {
      Anything v = delegate.executeBlocking(nothing,args[1],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
