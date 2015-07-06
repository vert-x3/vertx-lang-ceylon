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
shared abstract class Vertx(Vertx_ delegate) satisfies Delegating
  & Measured {
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
