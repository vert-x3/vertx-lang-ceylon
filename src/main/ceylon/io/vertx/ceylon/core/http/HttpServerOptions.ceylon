import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  JksOptions,
  PfxOptions,
  PemKeyCertOptions,
  PemTrustOptions,
  NetServerOptions
}
/* Generated from io.vertx.core.http.HttpServerOptions */
shared class HttpServerOptions(
  String sendBufferSize,
  String receiveBufferSize,
  String reuseAddress,
  String trafficClass,
  String tcpNoDelay,
  String tcpKeepAlive,
  String soLinger,
  String usePooledBuffers,
  String idleTimeout,
  String ssl,
  String keyStoreOptions,
  String pfxKeyCertOptions,
  String pemKeyCertOptions,
  String trustStoreOptions,
  String pemTrustOptions,
  String pfxTrustOptions,
  String enabledCipherSuites,
  String crlPaths,
  String crlValues,
  String acceptBacklog,
  String port,
  String host,
  shared String compressionSupported,
  shared String maxWebsocketFrameSize,
  shared String websocketSubProtocol,
  String clientAuthRequired,
  shared String handle100ContinueAutomatically) extends NetServerOptions(
  sendBufferSize,
  receiveBufferSize,
  reuseAddress,
  trafficClass,
  tcpNoDelay,
  tcpKeepAlive,
  soLinger,
  usePooledBuffers,
  idleTimeout,
  ssl,
  keyStoreOptions,
  pfxKeyCertOptions,
  pemKeyCertOptions,
  trustStoreOptions,
  pemTrustOptions,
  pfxTrustOptions,
  enabledCipherSuites,
  crlPaths,
  crlValues,
  acceptBacklog,
  port,
  host,
  clientAuthRequired) {
}
