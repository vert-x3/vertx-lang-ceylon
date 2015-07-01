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
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.ceylon.core.dns {
  DnsClient
}
/* Generated from io.vertx.core.Vertx */
shared abstract class Vertx() satisfies Measured {
  shared formal Anything(*<[]>) getOrCreateContext;
  shared formal Anything(*<[]|[NetServerOptions]>) createNetServer;
  shared formal Anything(*<[]|[NetClientOptions]>) createNetClient;
  shared formal Anything(*<[]|[HttpServerOptions]>) createHttpServer;
  shared formal Anything(*<[]|[HttpClientOptions]>) createHttpClient;
  shared formal Anything(*<[]|[DatagramSocketOptions]>) createDatagramSocket;
  shared formal Anything(*<[]>) fileSystem;
  shared formal Anything(*<[]>) eventBus;
  shared formal Anything(*<[Integer,String]>) createDnsClient;
  shared formal Anything(*<[]>) sharedData;
  shared formal Anything(*<[Integer,Anything(Integer)]>) setTimer;
  shared formal Anything(*<[Integer]>) timerStream;
  shared formal Anything(*<[Integer,Anything(Integer)]>) setPeriodic;
  shared formal Anything(*<[Integer]>) periodicStream;
  shared formal Anything(*<[Integer]>) cancelTimer;
  shared formal Anything(*<[Anything()]>) runOnContext;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) close;
  shared formal Anything(*<[String]|[String,Anything(Throwable|String)]|[String,DeploymentOptions]|[String,DeploymentOptions,Anything(Throwable|String)]>) deployVerticle;
  shared formal Anything(*<[String]|[String,Anything(Throwable?)]>) undeploy;
  shared formal Anything(*<[]>) deploymentIDs;
  shared formal Anything(*<[]>) isClustered;
  shared formal Anything(*<[Anything(Future<Object>),Anything(Throwable|Object)]|[Anything(Future<Object>),Boolean,Anything(Throwable|Object)]>) executeBlocking;
}
