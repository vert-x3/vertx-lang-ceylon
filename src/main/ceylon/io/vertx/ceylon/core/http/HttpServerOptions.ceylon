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
import io.vertx.core.net {
  JksOptions_=JksOptions,
  PemKeyCertOptions_=PemKeyCertOptions,
  PemTrustOptions_=PemTrustOptions,
  PfxOptions_=PfxOptions,
  NetServerOptions_=NetServerOptions
}
import io.vertx.core.http {
  HttpServerOptions_=HttpServerOptions
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.http.HttpServerOptions */
shared class HttpServerOptions(
  Integer? acceptBacklog = null,
  Boolean? clientAuthRequired = null,
  shared Boolean? compressionSupported = null,
  String? crlPaths = null,
  Buffer? crlValues = null,
  String? enabledCipherSuites = null,
  shared Boolean? handle100ContinueAutomatically = null,
  String? host = null,
  Integer? idleTimeout = null,
  JksOptions? keyStoreOptions = null,
  shared Integer? maxWebsocketFrameSize = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  Integer? port = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  JksOptions? trustStoreOptions = null,
  Boolean? usePooledBuffers = null,
  shared String? websocketSubProtocols = null) extends NetServerOptions(
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
