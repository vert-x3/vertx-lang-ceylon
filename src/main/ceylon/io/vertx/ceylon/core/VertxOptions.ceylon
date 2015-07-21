import java.lang {
  String_=String
}
import io.vertx.core {
  VertxOptions_=VertxOptions
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
  shared Integer blockedThreadCheckInterval,
  shared String clusterHost,
  shared Integer clusterPingInterval,
  shared Integer clusterPingReplyInterval,
  shared Integer clusterPort,
  shared Boolean clustered,
  shared Integer eventLoopPoolSize,
  shared Boolean haEnabled,
  shared String haGroup,
  shared Integer internalBlockingPoolSize,
  shared Integer maxEventLoopExecuteTime,
  shared Integer maxWorkerExecuteTime,
  shared MetricsOptions metricsOptions,
  shared Integer quorumSize,
  shared Integer warningExceptionTime,
  shared Integer workerPoolSize) {
}
