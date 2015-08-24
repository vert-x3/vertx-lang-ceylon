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
  ClientOptionsBase
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  JksOptions_=JksOptions,
  PemKeyCertOptions_=PemKeyCertOptions,
  PemTrustOptions_=PemTrustOptions,
  PfxOptions_=PfxOptions,
  ClientOptionsBase_=ClientOptionsBase
}
import io.vertx.core.http {
  HttpClientOptions_=HttpClientOptions
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.http.HttpClientOptions */
shared class HttpClientOptions(
  Integer? connectTimeout = null,
  String? crlPaths = null,
  Buffer? crlValues = null,
  shared String? defaultHost = null,
  shared Integer? defaultPort = null,
  String? enabledCipherSuites = null,
  Integer? idleTimeout = null,
  shared Boolean? keepAlive = null,
  JksOptions? keyStoreOptions = null,
  shared Integer? maxPoolSize = null,
  shared Integer? maxWebsocketFrameSize = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  shared Boolean? pipelining = null,
  shared String? protocolVersion = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  Boolean? trustAll = null,
  JksOptions? trustStoreOptions = null,
  shared Boolean? tryUseCompression = null,
  Boolean? usePooledBuffers = null,
  shared Boolean? verifyHost = null) extends ClientOptionsBase(
  connectTimeout,
  crlPaths,
  crlValues,
  enabledCipherSuites,
  idleTimeout,
  keyStoreOptions,
  pemKeyCertOptions,
  pemTrustOptions,
  pfxKeyCertOptions,
  pfxTrustOptions,
  receiveBufferSize,
  reuseAddress,
  sendBufferSize,
  soLinger,
  ssl,
  tcpKeepAlive,
  tcpNoDelay,
  trafficClass,
  trustAll,
  trustStoreOptions,
  usePooledBuffers) {
}
