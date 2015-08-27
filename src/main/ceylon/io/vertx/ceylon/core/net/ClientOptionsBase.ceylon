import io.vertx.ceylon.core.net {
  JksOptions,
  toJksOptions,
  PemKeyCertOptions,
  toPemKeyCertOptions,
  PemTrustOptions,
  toPemTrustOptions,
  PfxOptions,
  toPfxOptions,
  TCPSSLOptions
}
import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
import io.vertx.core.net {
  ClientOptionsBase_=ClientOptionsBase
}
/* Generated from io.vertx.core.net.ClientOptionsBase */
shared class ClientOptionsBase(
  shared Integer? connectTimeout = null,
  String? crlPaths = null,
  String? enabledCipherSuites = null,
  Integer? idleTimeout = null,
  JksOptions? keyStoreOptions = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  shared Boolean? trustAll = null,
  JksOptions? trustStoreOptions = null,
  Boolean? usePooledBuffers = null) extends TCPSSLOptions(
  crlPaths,
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
  trustStoreOptions,
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists connectTimeout) {
      json.put("connectTimeout", connectTimeout);
    }
    if (exists trustAll) {
      json.put("trustAll", trustAll);
    }
    return json;
  }
}
shared ClientOptionsBase toClientOptionsBase(JsonObject json) {
  Integer? connectTimeout = json.getIntegerOrNull("connectTimeout");
  String? crlPaths = json.getStringOrNull("crlPaths");
  String? enabledCipherSuites = json.getStringOrNull("enabledCipherSuites");
  Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
  JksOptions? keyStoreOptions;
  if (exists tmp = json.getObjectOrNull("keyStoreOptions")) {
    keyStoreOptions = toJksOptions(tmp);
  } else {
    keyStoreOptions = null;
  }
  PemKeyCertOptions? pemKeyCertOptions;
  if (exists tmp = json.getObjectOrNull("pemKeyCertOptions")) {
    pemKeyCertOptions = toPemKeyCertOptions(tmp);
  } else {
    pemKeyCertOptions = null;
  }
  PemTrustOptions? pemTrustOptions;
  if (exists tmp = json.getObjectOrNull("pemTrustOptions")) {
    pemTrustOptions = toPemTrustOptions(tmp);
  } else {
    pemTrustOptions = null;
  }
  PfxOptions? pfxKeyCertOptions;
  if (exists tmp = json.getObjectOrNull("pfxKeyCertOptions")) {
    pfxKeyCertOptions = toPfxOptions(tmp);
  } else {
    pfxKeyCertOptions = null;
  }
  PfxOptions? pfxTrustOptions;
  if (exists tmp = json.getObjectOrNull("pfxTrustOptions")) {
    pfxTrustOptions = toPfxOptions(tmp);
  } else {
    pfxTrustOptions = null;
  }
  Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
  Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
  Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
  Integer? soLinger = json.getIntegerOrNull("soLinger");
  Boolean? ssl = json.getBooleanOrNull("ssl");
  Boolean? tcpKeepAlive = json.getBooleanOrNull("tcpKeepAlive");
  Boolean? tcpNoDelay = json.getBooleanOrNull("tcpNoDelay");
  Integer? trafficClass = json.getIntegerOrNull("trafficClass");
  Boolean? trustAll = json.getBooleanOrNull("trustAll");
  JksOptions? trustStoreOptions;
  if (exists tmp = json.getObjectOrNull("trustStoreOptions")) {
    trustStoreOptions = toJksOptions(tmp);
  } else {
    trustStoreOptions = null;
  }
  Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
  return ClientOptionsBase {
    connectTimeout = connectTimeout;
    crlPaths = crlPaths;
    enabledCipherSuites = enabledCipherSuites;
    idleTimeout = idleTimeout;
    keyStoreOptions = keyStoreOptions;
    pemKeyCertOptions = pemKeyCertOptions;
    pemTrustOptions = pemTrustOptions;
    pfxKeyCertOptions = pfxKeyCertOptions;
    pfxTrustOptions = pfxTrustOptions;
    receiveBufferSize = receiveBufferSize;
    reuseAddress = reuseAddress;
    sendBufferSize = sendBufferSize;
    soLinger = soLinger;
    ssl = ssl;
    tcpKeepAlive = tcpKeepAlive;
    tcpNoDelay = tcpNoDelay;
    trafficClass = trafficClass;
    trustAll = trustAll;
    trustStoreOptions = trustStoreOptions;
    usePooledBuffers = usePooledBuffers;
  };
}
