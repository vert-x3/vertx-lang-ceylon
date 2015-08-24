import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  NetworkOptions_=NetworkOptions
}
/* Generated from io.vertx.core.net.NetworkOptions */
shared class NetworkOptions(
  shared Integer? receiveBufferSize = null,
  shared Boolean? reuseAddress = null,
  shared Integer? sendBufferSize = null,
  shared Integer? trafficClass = null) {
}
