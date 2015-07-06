import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  JksOptions,
  PemKeyCertOptions,
  PemTrustOptions,
  PfxOptions,
  NetServerOptions
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.http {
  HttpServerOptions_=HttpServerOptions
}
/* Generated from io.vertx.core.http.HttpServerOptions */
shared class HttpServerOptions(
  Integer acceptBacklog,
  Boolean clientAuthRequired,
  shared Boolean compressionSupported,
  String crlPaths,
  Buffer crlValues,
  String enabledCipherSuites,
  shared Boolean handle100ContinueAutomatically,
  String host,
  Integer idleTimeout,
  JksOptions keyStoreOptions,
  shared Integer maxWebsocketFrameSize,
  PemKeyCertOptions pemKeyCertOptions,
  PemTrustOptions pemTrustOptions,
  PfxOptions pfxKeyCertOptions,
  PfxOptions pfxTrustOptions,
  Integer port,
  Integer receiveBufferSize,
  Boolean reuseAddress,
  Integer sendBufferSize,
  Integer soLinger,
  Boolean ssl,
  Boolean tcpKeepAlive,
  Boolean tcpNoDelay,
  Integer trafficClass,
  JksOptions trustStoreOptions,
  Boolean usePooledBuffers,
  shared String websocketSubProtocol) extends NetServerOptions(
  acceptBacklog,
  clientAuthRequired,
  crlPaths,
  crlValues,
  enabledCipherSuites,
  host,
  idleTimeout,
  keyStoreOptions,
  pemKeyCertOptions,
  pemTrustOptions,
  pfxKeyCertOptions,
  pfxTrustOptions,
  port,
  receiveBufferSize,
  reuseAddress,
  sendBufferSize,
  soLinger,
  ssl,
  tcpKeepAlive,
  tcpNoDelay,
  trafficClass,
  trustStoreOptions,
  usePooledBuffers) {
}
