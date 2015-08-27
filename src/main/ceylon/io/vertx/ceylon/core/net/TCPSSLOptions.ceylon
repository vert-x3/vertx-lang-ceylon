import io.vertx.ceylon.core.net {
  JksOptions,
  PemKeyCertOptions,
  PemTrustOptions,
  PfxOptions,
  NetworkOptions
}
import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
import io.vertx.core.net {
  TCPSSLOptions_=TCPSSLOptions
}
/* Generated from io.vertx.core.net.TCPSSLOptions */
shared class TCPSSLOptions(
  shared String? crlPaths = null,
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
  trafficClass) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists crlPaths) {
      json.put("crlPaths", crlPaths);
    }
    if (exists enabledCipherSuites) {
      json.put("enabledCipherSuites", enabledCipherSuites);
    }
    if (exists idleTimeout) {
      json.put("idleTimeout", idleTimeout);
    }
    if (exists keyStoreOptions) {
      json.put("keyStoreOptions", keyStoreOptions.toJson());
    }
    if (exists pemKeyCertOptions) {
      json.put("pemKeyCertOptions", pemKeyCertOptions.toJson());
    }
    if (exists pemTrustOptions) {
      json.put("pemTrustOptions", pemTrustOptions.toJson());
    }
    if (exists pfxKeyCertOptions) {
      json.put("pfxKeyCertOptions", pfxKeyCertOptions.toJson());
    }
    if (exists pfxTrustOptions) {
      json.put("pfxTrustOptions", pfxTrustOptions.toJson());
    }
    if (exists soLinger) {
      json.put("soLinger", soLinger);
    }
    if (exists ssl) {
      json.put("ssl", ssl);
    }
    if (exists tcpKeepAlive) {
      json.put("tcpKeepAlive", tcpKeepAlive);
    }
    if (exists tcpNoDelay) {
      json.put("tcpNoDelay", tcpNoDelay);
    }
    if (exists trustStoreOptions) {
      json.put("trustStoreOptions", trustStoreOptions.toJson());
    }
    if (exists usePooledBuffers) {
      json.put("usePooledBuffers", usePooledBuffers);
    }
    return json;
  }
}
