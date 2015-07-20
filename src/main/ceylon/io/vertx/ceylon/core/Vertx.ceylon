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

  shared  Context(*<[]>) getOrCreateContext => flatten(getOrCreateContext_impl);

  shared  NetServer(*<[]|[NetServerOptions]>) createNetServer => flatten(createNetServer_impl);

  shared  NetClient(*<[]|[NetClientOptions]>) createNetClient => flatten(createNetClient_impl);

  shared  HttpServer(*<[]|[HttpServerOptions]>) createHttpServer => flatten(createHttpServer_impl);

  shared  HttpClient(*<[]|[HttpClientOptions]>) createHttpClient => flatten(createHttpClient_impl);

  shared  DatagramSocket(*<[]|[DatagramSocketOptions]>) createDatagramSocket => flatten(createDatagramSocket_impl);

  shared  FileSystem(*<[]>) fileSystem => flatten(fileSystem_impl);

  shared  EventBus(*<[]>) eventBus => flatten(eventBus_impl);

  shared  DnsClient(*<[Integer,String]>) createDnsClient => flatten(createDnsClient_impl);

  shared  SharedData(*<[]>) sharedData => flatten(sharedData_impl);

  shared  Integer(*<[Integer,Anything(Integer)]>) setTimer => flatten(setTimer_impl);

  shared  TimeoutStream(*<[Integer]>) timerStream => flatten(timerStream_impl);

  shared  Integer(*<[Integer,Anything(Integer)]>) setPeriodic => flatten(setPeriodic_impl);

  shared  TimeoutStream(*<[Integer]>) periodicStream => flatten(periodicStream_impl);

  shared  Boolean(*<[Integer]>) cancelTimer => flatten(cancelTimer_impl);

  shared  Anything(*<[Anything()]>) runOnContext => flatten(runOnContext_impl);

  shared  Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);

  shared  Anything(*<[String]|[String,Anything(Throwable|String)]|[String,DeploymentOptions]|[String,DeploymentOptions,Anything(Throwable|String)]>) deployVerticle => flatten(deployVerticle_impl);

  shared  Anything(*<[String]|[String,Anything(Throwable?)]>) undeploy => flatten(undeploy_impl);

  shared  Set<String>(*<[]>) deploymentIDs => flatten(deploymentIDs_impl);

  shared  Boolean(*<[]>) isClustered => flatten(isClustered_impl);

  shared  Anything(*<[Anything(Future<Object>),Anything(Throwable|Object)]|[Anything(Future<Object>),Boolean,Anything(Throwable|Object)]>) executeBlocking => flatten(executeBlocking_impl);

  Context getOrCreateContext_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetServer createNetServer_impl([]|[NetServerOptions] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [NetServerOptions] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetClient createNetClient_impl([]|[NetClientOptions] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [NetClientOptions] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServer createHttpServer_impl([]|[HttpServerOptions] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [HttpServerOptions] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient createHttpClient_impl([]|[HttpClientOptions] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [HttpClientOptions] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DatagramSocket createDatagramSocket_impl([]|[DatagramSocketOptions] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [DatagramSocketOptions] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem fileSystem_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  EventBus eventBus_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient createDnsClient_impl([Integer,String] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  SharedData sharedData_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer setTimer_impl([Integer,Anything(Integer)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream timerStream_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer setPeriodic_impl([Integer,Anything(Integer)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream periodicStream_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean cancelTimer_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything runOnContext_impl([Anything()] args) {
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

  Anything deployVerticle_impl([String]|[String,Anything(Throwable|String)]|[String,DeploymentOptions]|[String,DeploymentOptions,Anything(Throwable|String)] args) {
    if (is [String] args) {
      // Invoke method
    }
    if (is [String,Anything(Throwable|String)] args) {
      // Invoke method
    }
    if (is [String,DeploymentOptions] args) {
      // Invoke method
    }
    if (is [String,DeploymentOptions,Anything(Throwable|String)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything undeploy_impl([String]|[String,Anything(Throwable?)] args) {
    if (is [String] args) {
      // Invoke method
    }
    if (is [String,Anything(Throwable?)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<String> deploymentIDs_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isClustered_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything executeBlocking_impl([Anything(Future<Object>),Anything(Throwable|Object)]|[Anything(Future<Object>),Boolean,Anything(Throwable|Object)] args) {
    if (is [Anything(Future<Object>),Anything(Throwable|Object)] args) {
      // Invoke method
    }
    if (is [Anything(Future<Object>),Boolean,Anything(Throwable|Object)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
