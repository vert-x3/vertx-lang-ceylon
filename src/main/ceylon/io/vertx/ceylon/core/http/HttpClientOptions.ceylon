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
  PfxOptions
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  JksOptions_=JksOptions,
  PemKeyCertOptions_=PemKeyCertOptions,
  PemTrustOptions_=PemTrustOptions,
  PfxOptions_=PfxOptions
}
import io.vertx.core.http {
  HttpClientOptions_=HttpClientOptions
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.http.HttpClientOptions */
shared class HttpClientOptions(
  shared Integer connectTimeout,
  shared String crlPaths,
  shared Buffer crlValues,
  shared String defaultHost,
  shared Integer defaultPort,
  shared String enabledCipherSuites,
  shared Integer idleTimeout,
  shared Boolean keepAlive,
  shared JksOptions keyStoreOptions,
  shared Integer maxPoolSize,
  shared Integer maxWebsocketFrameSize,
  shared PemKeyCertOptions pemKeyCertOptions,
  shared PemTrustOptions pemTrustOptions,
  shared PfxOptions pfxKeyCertOptions,
  shared PfxOptions pfxTrustOptions,
  shared Boolean pipelining,
  shared Integer receiveBufferSize,
  shared Boolean reuseAddress,
  shared Integer sendBufferSize,
  shared Integer soLinger,
  shared Boolean ssl,
  shared Boolean tcpKeepAlive,
  shared Boolean tcpNoDelay,
  shared Integer trafficClass,
  shared Boolean trustAll,
  shared JksOptions trustStoreOptions,
  shared Boolean tryUseCompression,
  shared Boolean usePooledBuffers,
  shared Boolean verifyHost) {
}
