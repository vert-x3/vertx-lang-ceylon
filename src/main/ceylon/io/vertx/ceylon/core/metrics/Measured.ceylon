import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.metrics {
  Measured_=Measured
}
/* Generated from io.vertx.core.metrics.Measured */
shared interface Measured satisfies Delegating {
  shared formal Boolean(*<[]>) isMetricsEnabled;
}
