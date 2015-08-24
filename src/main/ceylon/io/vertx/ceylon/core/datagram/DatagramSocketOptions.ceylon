import java.lang {
  String_=String
}
import io.vertx.core.datagram {
  DatagramSocketOptions_=DatagramSocketOptions
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.ceylon.core.net {
  NetworkOptions
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  NetworkOptions_=NetworkOptions
}
/* Generated from io.vertx.core.datagram.DatagramSocketOptions */
shared class DatagramSocketOptions(
  shared Boolean? broadcast = null,
  shared Boolean? ipV6 = null,
  shared Boolean? loopbackModeDisabled = null,
  shared String? multicastNetworkInterface = null,
  shared Integer? multicastTimeToLive = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? trafficClass = null) extends NetworkOptions(
  receiveBufferSize,
  reuseAddress,
  sendBufferSize,
  trafficClass) {
}
