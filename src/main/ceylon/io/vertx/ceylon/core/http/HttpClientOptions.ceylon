import io.vertx.ceylon.core.net {
  JksOptions,
  toJksOptions,
  PemKeyCertOptions,
  toPemKeyCertOptions,
  PemTrustOptions,
  toPemTrustOptions,
  PfxOptions,
  toPfxOptions,
  ClientOptionsBase
}
import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
import io.vertx.core.http {
  HttpClientOptions_=HttpClientOptions
}
/* Generated from io.vertx.core.http.HttpClientOptions */
shared class HttpClientOptions(
  Integer? connectTimeout = null,
  String? crlPaths = null,
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
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists defaultHost) {
      json.put("defaultHost", defaultHost);
    }
    if (exists defaultPort) {
      json.put("defaultPort", defaultPort);
    }
    if (exists keepAlive) {
      json.put("keepAlive", keepAlive);
    }
    if (exists maxPoolSize) {
      json.put("maxPoolSize", maxPoolSize);
    }
    if (exists maxWebsocketFrameSize) {
      json.put("maxWebsocketFrameSize", maxWebsocketFrameSize);
    }
    if (exists pipelining) {
      json.put("pipelining", pipelining);
    }
    if (exists tryUseCompression) {
      json.put("tryUseCompression", tryUseCompression);
    }
    if (exists verifyHost) {
      json.put("verifyHost", verifyHost);
    }
    return json;
  }
}
shared HttpClientOptions toHttpClientOptions(JsonObject json) {
  Integer? connectTimeout = json.getIntegerOrNull("connectTimeout");
  String? crlPaths = json.getStringOrNull("crlPaths");
  String? defaultHost = json.getStringOrNull("defaultHost");
  Integer? defaultPort = json.getIntegerOrNull("defaultPort");
  String? enabledCipherSuites = json.getStringOrNull("enabledCipherSuites");
  Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
  Boolean? keepAlive = json.getBooleanOrNull("keepAlive");
  JksOptions? keyStoreOptions;
  if (exists tmp = json.getObjectOrNull("keyStoreOptions")) {
    keyStoreOptions = toJksOptions(tmp);
  } else {
    keyStoreOptions = null;
  }
  Integer? maxPoolSize = json.getIntegerOrNull("maxPoolSize");
  Integer? maxWebsocketFrameSize = json.getIntegerOrNull("maxWebsocketFrameSize");
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
  Boolean? pipelining = json.getBooleanOrNull("pipelining");
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
  Boolean? tryUseCompression = json.getBooleanOrNull("tryUseCompression");
  Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
  Boolean? verifyHost = json.getBooleanOrNull("verifyHost");
  return HttpClientOptions {
    connectTimeout = connectTimeout;
    crlPaths = crlPaths;
    defaultHost = defaultHost;
    defaultPort = defaultPort;
    enabledCipherSuites = enabledCipherSuites;
    idleTimeout = idleTimeout;
    keepAlive = keepAlive;
    keyStoreOptions = keyStoreOptions;
    maxPoolSize = maxPoolSize;
    maxWebsocketFrameSize = maxWebsocketFrameSize;
    pemKeyCertOptions = pemKeyCertOptions;
    pemTrustOptions = pemTrustOptions;
    pfxKeyCertOptions = pfxKeyCertOptions;
    pfxTrustOptions = pfxTrustOptions;
    pipelining = pipelining;
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
    tryUseCompression = tryUseCompression;
    usePooledBuffers = usePooledBuffers;
    verifyHost = verifyHost;
  };
}
