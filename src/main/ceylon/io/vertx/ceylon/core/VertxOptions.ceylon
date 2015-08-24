import java.lang {
  String_=String
}
import io.vertx.core {
  VertxOptions_=VertxOptions,
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.metrics {
  MetricsOptions_=MetricsOptions
}
import io.vertx.ceylon.core.metrics {
  MetricsOptions
}
/* Generated from io.vertx.core.VertxOptions */
shared class VertxOptions(
  shared Integer? blockedThreadCheckInterval = null,
  shared String? clusterHost = null,
  shared Integer? clusterPingInterval = null,
  shared Integer? clusterPingReplyInterval = null,
  shared Integer? clusterPort = null,
  shared Boolean? clustered = null,
  shared Integer? eventLoopPoolSize = null,
  shared Boolean? haEnabled = null,
  shared String? haGroup = null,
  shared Integer? internalBlockingPoolSize = null,
  shared Integer? maxEventLoopExecuteTime = null,
  shared Integer? maxWorkerExecuteTime = null,
  shared MetricsOptions? metricsOptions = null,
  shared Integer? quorumSize = null,
  shared Integer? warningExceptionTime = null,
  shared Integer? workerPoolSize = null) {
}
