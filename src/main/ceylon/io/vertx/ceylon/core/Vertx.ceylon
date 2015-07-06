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

  Context getOrCreateContext_impl([] args) {
    throw Exception("implement me");
  }

  shared  Context(*<[]>) getOrCreateContext = flatten(getOrCreateContext_impl);

  NetServer createNetServer_impl([]|[NetServerOptions] args) {
    throw Exception("implement me");
  }

  shared  NetServer(*<[]|[NetServerOptions]>) createNetServer = flatten(createNetServer_impl);

  NetClient createNetClient_impl([]|[NetClientOptions] args) {
    throw Exception("implement me");
  }

  shared  NetClient(*<[]|[NetClientOptions]>) createNetClient = flatten(createNetClient_impl);

  HttpServer createHttpServer_impl([]|[HttpServerOptions] args) {
    throw Exception("implement me");
  }

  shared  HttpServer(*<[]|[HttpServerOptions]>) createHttpServer = flatten(createHttpServer_impl);

  HttpClient createHttpClient_impl([]|[HttpClientOptions] args) {
    throw Exception("implement me");
  }

  shared  HttpClient(*<[]|[HttpClientOptions]>) createHttpClient = flatten(createHttpClient_impl);

  DatagramSocket createDatagramSocket_impl([]|[DatagramSocketOptions] args) {
    throw Exception("implement me");
  }

  shared  DatagramSocket(*<[]|[DatagramSocketOptions]>) createDatagramSocket = flatten(createDatagramSocket_impl);

  FileSystem fileSystem_impl([] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[]>) fileSystem = flatten(fileSystem_impl);

  EventBus eventBus_impl([] args) {
    throw Exception("implement me");
  }

  shared  EventBus(*<[]>) eventBus = flatten(eventBus_impl);

  DnsClient createDnsClient_impl([Integer,String] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[Integer,String]>) createDnsClient = flatten(createDnsClient_impl);

  SharedData sharedData_impl([] args) {
    throw Exception("implement me");
  }

  shared  SharedData(*<[]>) sharedData = flatten(sharedData_impl);

  Integer setTimer_impl([Integer,Anything(Integer)] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[Integer,Anything(Integer)]>) setTimer = flatten(setTimer_impl);

  TimeoutStream timerStream_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  TimeoutStream(*<[Integer]>) timerStream = flatten(timerStream_impl);

  Integer setPeriodic_impl([Integer,Anything(Integer)] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[Integer,Anything(Integer)]>) setPeriodic = flatten(setPeriodic_impl);

  TimeoutStream periodicStream_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  TimeoutStream(*<[Integer]>) periodicStream = flatten(periodicStream_impl);

  Boolean cancelTimer_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[Integer]>) cancelTimer = flatten(cancelTimer_impl);

  Anything runOnContext_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything()]>) runOnContext = flatten(runOnContext_impl);

  Anything close_impl([]|[Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]|[Anything(Throwable?)]>) close = flatten(close_impl);

  Anything deployVerticle_impl([String]|[String,Anything(Throwable|String)]|[String,DeploymentOptions]|[String,DeploymentOptions,Anything(Throwable|String)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String]|[String,Anything(Throwable|String)]|[String,DeploymentOptions]|[String,DeploymentOptions,Anything(Throwable|String)]>) deployVerticle = flatten(deployVerticle_impl);

  Anything undeploy_impl([String]|[String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String]|[String,Anything(Throwable?)]>) undeploy = flatten(undeploy_impl);

  Set<String> deploymentIDs_impl([] args) {
    throw Exception("implement me");
  }

  shared  Set<String>(*<[]>) deploymentIDs = flatten(deploymentIDs_impl);

  Boolean isClustered_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isClustered = flatten(isClustered_impl);

  Anything executeBlocking_impl([Anything(Future<Object>),Anything(Throwable|Object)]|[Anything(Future<Object>),Boolean,Anything(Throwable|Object)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Future<Object>),Anything(Throwable|Object)]|[Anything(Future<Object>),Boolean,Anything(Throwable|Object)]>) executeBlocking = flatten(executeBlocking_impl);

}
