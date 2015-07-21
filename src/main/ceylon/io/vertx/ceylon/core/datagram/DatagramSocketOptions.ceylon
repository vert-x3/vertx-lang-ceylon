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
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.datagram.DatagramSocketOptions */
shared class DatagramSocketOptions(
  shared Boolean broadcast,
  shared Boolean ipV6,
  shared Boolean loopbackModeDisabled,
  shared String multicastNetworkInterface,
  shared Integer multicastTimeToLive,
  shared Integer receiveBufferSize,
  shared Boolean reuseAddress,
  shared Integer sendBufferSize,
  shared Integer trafficClass) {
}
