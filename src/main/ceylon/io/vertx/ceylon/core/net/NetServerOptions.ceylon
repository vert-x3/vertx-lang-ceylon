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
  NetServerOptions_=NetServerOptions
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.net.NetServerOptions */
shared class NetServerOptions(
  shared Integer acceptBacklog,
  shared Boolean clientAuthRequired,
  shared String crlPaths,
  shared Buffer crlValues,
  shared String enabledCipherSuites,
  shared String host,
  shared Integer idleTimeout,
  shared JksOptions keyStoreOptions,
  shared PemKeyCertOptions pemKeyCertOptions,
  shared PemTrustOptions pemTrustOptions,
  shared PfxOptions pfxKeyCertOptions,
  shared PfxOptions pfxTrustOptions,
  shared Integer port,
  shared Integer receiveBufferSize,
  shared Boolean reuseAddress,
  shared Integer sendBufferSize,
  shared Integer soLinger,
  shared Boolean ssl,
  shared Boolean tcpKeepAlive,
  shared Boolean tcpNoDelay,
  shared Integer trafficClass,
  shared JksOptions trustStoreOptions,
  shared Boolean usePooledBuffers) {
}
