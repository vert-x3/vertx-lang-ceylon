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
  PemTrustOptions
}
/* Generated from io.vertx.core.http.HttpClientOptions */
shared class HttpClientOptions(
  shared String sendBufferSize,
  shared String receiveBufferSize,
  shared String reuseAddress,
  shared String trafficClass,
  shared String tcpNoDelay,
  shared String tcpKeepAlive,
  shared String soLinger,
  shared String usePooledBuffers,
  shared String idleTimeout,
  shared String ssl,
  shared String keyStoreOptions,
  shared String pfxKeyCertOptions,
  shared String pemKeyCertOptions,
  shared String trustStoreOptions,
  shared String pfxTrustOptions,
  shared String pemTrustOptions,
  shared String enabledCipherSuites,
  shared String crlPaths,
  shared String crlValues,
  shared String connectTimeout,
  shared String trustAll,
  shared String maxPoolSize,
  shared String keepAlive,
  shared String pipelining,
  shared String verifyHost,
  shared String tryUseCompression,
  shared String maxWebsocketFrameSize,
  shared String defaultHost,
  shared String defaultPort) {
}
