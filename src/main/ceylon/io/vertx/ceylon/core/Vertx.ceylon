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
shared class Vertx() satisfies Measured {
  shared default void getOrCreateContext() {
  }
  shared default void createNetServer() {
  }
  shared default void createNetClient() {
  }
  shared default void createHttpServer() {
  }
  shared default void createHttpClient() {
  }
  shared default void createDatagramSocket() {
  }
  shared default void fileSystem() {
  }
  shared default void eventBus() {
  }
  shared default void createDnsClient() {
  }
  shared default void sharedData() {
  }
  shared default void setTimer() {
  }
  shared default void timerStream() {
  }
  shared default void setPeriodic() {
  }
  shared default void periodicStream() {
  }
  shared default void cancelTimer() {
  }
  shared default void runOnContext() {
  }
  shared default void close() {
  }
  shared default void deployVerticle() {
  }
  shared default void undeploy() {
  }
  shared default void deploymentIDs() {
  }
  shared default void isClustered() {
  }
  shared default void executeBlocking() {
  }
}
