import io.vertx.ceylon.core.net {
  JksOptions,
  toJksOptions,
  PemKeyCertOptions,
  toPemKeyCertOptions,
  PemTrustOptions,
  toPemTrustOptions,
  PfxOptions,
  toPfxOptions,
  NetServerOptions
}
import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
import io.vertx.core.http {
  HttpServerOptions_=HttpServerOptions
}
/* Generated from io.vertx.core.http.HttpServerOptions */
shared class HttpServerOptions(
  Integer? acceptBacklog = null,
  Boolean? clientAuthRequired = null,
  shared Boolean? compressionSupported = null,
  String? crlPaths = null,
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
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists compressionSupported) {
      json.put("compressionSupported", compressionSupported);
    }
    if (exists handle100ContinueAutomatically) {
      json.put("handle100ContinueAutomatically", handle100ContinueAutomatically);
    }
    if (exists maxWebsocketFrameSize) {
      json.put("maxWebsocketFrameSize", maxWebsocketFrameSize);
    }
    if (exists websocketSubProtocols) {
      json.put("websocketSubProtocols", websocketSubProtocols);
    }
    return json;
  }
}
shared HttpServerOptions toHttpServerOptions(JsonObject json) {
  Integer? acceptBacklog = json.getIntegerOrNull("acceptBacklog");
  Boolean? clientAuthRequired = json.getBooleanOrNull("clientAuthRequired");
  Boolean? compressionSupported = json.getBooleanOrNull("compressionSupported");
  String? crlPaths = json.getStringOrNull("crlPaths");
  String? enabledCipherSuites = json.getStringOrNull("enabledCipherSuites");
  Boolean? handle100ContinueAutomatically = json.getBooleanOrNull("handle100ContinueAutomatically");
  String? host = json.getStringOrNull("host");
  Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
  JksOptions? keyStoreOptions;
  if (exists tmp = json.getObjectOrNull("keyStoreOptions")) {
    keyStoreOptions = toJksOptions(tmp);
  } else {
    keyStoreOptions = null;
  }
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
  Integer? port = json.getIntegerOrNull("port");
  Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
  Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
  Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
  Integer? soLinger = json.getIntegerOrNull("soLinger");
  Boolean? ssl = json.getBooleanOrNull("ssl");
  Boolean? tcpKeepAlive = json.getBooleanOrNull("tcpKeepAlive");
  Boolean? tcpNoDelay = json.getBooleanOrNull("tcpNoDelay");
  Integer? trafficClass = json.getIntegerOrNull("trafficClass");
  JksOptions? trustStoreOptions;
  if (exists tmp = json.getObjectOrNull("trustStoreOptions")) {
    trustStoreOptions = toJksOptions(tmp);
  } else {
    trustStoreOptions = null;
  }
  Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
  String? websocketSubProtocols = json.getStringOrNull("websocketSubProtocols");
  return HttpServerOptions {
    acceptBacklog = acceptBacklog;
    clientAuthRequired = clientAuthRequired;
    compressionSupported = compressionSupported;
    crlPaths = crlPaths;
    enabledCipherSuites = enabledCipherSuites;
    handle100ContinueAutomatically = handle100ContinueAutomatically;
    host = host;
    idleTimeout = idleTimeout;
    keyStoreOptions = keyStoreOptions;
    maxWebsocketFrameSize = maxWebsocketFrameSize;
    pemKeyCertOptions = pemKeyCertOptions;
    pemTrustOptions = pemTrustOptions;
    pfxKeyCertOptions = pfxKeyCertOptions;
    pfxTrustOptions = pfxTrustOptions;
    port = port;
    receiveBufferSize = receiveBufferSize;
    reuseAddress = reuseAddress;
    sendBufferSize = sendBufferSize;
    soLinger = soLinger;
    ssl = ssl;
    tcpKeepAlive = tcpKeepAlive;
    tcpNoDelay = tcpNoDelay;
    trafficClass = trafficClass;
    trustStoreOptions = trustStoreOptions;
    usePooledBuffers = usePooledBuffers;
    websocketSubProtocols = websocketSubProtocols;
  };
}
