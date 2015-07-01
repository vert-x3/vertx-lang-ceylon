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
  shared formal Anything(*<[]|[]>) createNetServer;
  shared formal Anything(*<[]|[]>) createNetClient;
  shared formal Anything(*<[]|[]>) createHttpServer;
  shared formal Anything(*<[]|[]>) createHttpClient;
  shared formal Anything(*<[]|[]>) createDatagramSocket;
  shared formal Anything(*<[]>) fileSystem;
  shared formal Anything(*<[]>) eventBus;
  shared formal Anything(*<[]>) createDnsClient;
  shared formal Anything(*<[]>) sharedData;
  shared formal Anything(*<[]>) setTimer;
  shared formal Anything(*<[]>) timerStream;
  shared formal Anything(*<[]>) setPeriodic;
  shared formal Anything(*<[]>) periodicStream;
  shared formal Anything(*<[]>) cancelTimer;
  shared formal Anything(*<[]>) runOnContext;
  shared formal Anything(*<[]|[]>) close;
  shared formal Anything(*<[]|[]|[]|[]>) deployVerticle;
  shared formal Anything(*<[]|[]>) undeploy;
  shared formal Anything(*<[]>) deploymentIDs;
  shared formal Anything(*<[]>) isClustered;
  shared formal Anything(*<[]|[]>) executeBlocking;
}
