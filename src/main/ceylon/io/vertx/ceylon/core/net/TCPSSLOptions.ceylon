import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  TCPSSLOptions_=TCPSSLOptions
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.net.TCPSSLOptions */
shared class TCPSSLOptions(
  shared String? crlPaths = null,
  shared Buffer? crlValues = null,
  shared String? enabledCipherSuites = null,
  shared Integer? idleTimeout = null,
  shared JksOptions? keyStoreOptions = null,
  shared PemKeyCertOptions? pemKeyCertOptions = null,
  shared PemTrustOptions? pemTrustOptions = null,
  shared PfxOptions? pfxKeyCertOptions = null,
  shared PfxOptions? pfxTrustOptions = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  shared Integer? soLinger = null,
  shared Boolean? ssl = null,
  shared Boolean? tcpKeepAlive = null,
  shared Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  shared JksOptions? trustStoreOptions = null,
  shared Boolean? usePooledBuffers = null) extends NetworkOptions(
  receiveBufferSize,
  reuseAddress,
  sendBufferSize,
  trafficClass) {
}
