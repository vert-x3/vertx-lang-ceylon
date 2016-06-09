import io.vertx.ceylon.core.net {
  JdkSSLEngineOptions,
  jdkSSLEngineOptions_=jdkSSLEngineOptions,
  JksOptions,
  jksOptions_=jksOptions,
  OpenSSLEngineOptions,
  openSSLEngineOptions_=openSSLEngineOptions,
  PemKeyCertOptions,
  pemKeyCertOptions_=pemKeyCertOptions,
  PemTrustOptions,
  pemTrustOptions_=pemTrustOptions,
  PfxOptions,
  pfxOptions_=pfxOptions,
  NetServerOptions
}
import ceylon.json {
  JsonObject=Object,
  JsonArray=Array,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter,
  ToJava
}
import io.vertx.ceylon.core.http {
  HttpVersion,
  httpVersion_=httpVersion,
  ClientAuth,
  clientAuth_=clientAuth,
  Http2Settings,
  http2Settings_=http2Settings
}
import io.vertx.core.http {
  HttpServerOptions_=HttpServerOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.http.HttpServerOptions */
" Represents options used by an [HttpServer](../http/HttpServer.type.html) instance\n"
shared class HttpServerOptions(
  Integer? acceptBacklog = null,
  " Set the list of protocol versions to provide to the server during the Application-Layer Protocol Negotiatiation.\n"
  shared {HttpVersion*}? alpnVersions = null,
  ClientAuth? clientAuth = null,
  Boolean? clientAuthRequired = null,
  " Set whether the server supports compression\n"
  shared Boolean? compressionSupported = null,
  {String*}? crlPaths = null,
  {String*}? enabledCipherSuites = null,
  {String*}? enabledSecureTransportProtocols = null,
  " Set whether 100 Continue should be handled automatically\n"
  shared Boolean? handle100ContinueAutomatically = null,
  String? host = null,
  " Set the default HTTP/2 connection window size. It overrides the initial window\n size set by [getInitialWindowSize](../http/Http2Settings.type.html#getInitialWindowSize), so the connection window size\n is greater than for its streams, in order the data throughput.\n <p/>\n A value of <code>-1</code> reuses the initial window size setting.\n"
  shared Integer? http2ConnectionWindowSize = null,
  Integer? idleTimeout = null,
  " Set the HTTP/2 connection settings immediatly sent by the server when a client connects.\n"
  shared Http2Settings? initialSettings = null,
  JdkSSLEngineOptions? jdkSslEngineOptions = null,
  JksOptions? keyStoreOptions = null,
  Boolean? logActivity = null,
  " Set the maximum HTTP chunk size\n"
  shared Integer? maxChunkSize = null,
  " Set the maximum length of all headers for HTTP/1.x .\n"
  shared Integer? maxHeaderSize = null,
  " Set the maximum length of the initial line for HTTP/1.x (e.g. <code>\"GET / HTTP/1.0\"</code>)\n"
  shared Integer? maxInitialLineLength = null,
  " Set the maximum websocket frames size\n"
  shared Integer? maxWebsocketFrameSize = null,
  OpenSSLEngineOptions? openSslEngineOptions = null,
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
  Boolean? useAlpn = null,
  Boolean? usePooledBuffers = null,
  " Set the websocket subprotocols supported by the server.\n"
  shared String? websocketSubProtocols = null) extends NetServerOptions(
  acceptBacklog,
  clientAuth,
  clientAuthRequired,
  crlPaths,
  enabledCipherSuites,
  enabledSecureTransportProtocols,
  host,
  idleTimeout,
  jdkSslEngineOptions,
  keyStoreOptions,
  logActivity,
  openSslEngineOptions,
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
  useAlpn,
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = super.toJson();
    if (exists alpnVersions) {
      json.put("alpnVersions", JsonArray(alpnVersions.map(httpVersion_.toString)));
    }
    if (exists compressionSupported) {
      json.put("compressionSupported", compressionSupported);
    }
    if (exists handle100ContinueAutomatically) {
      json.put("handle100ContinueAutomatically", handle100ContinueAutomatically);
    }
    if (exists http2ConnectionWindowSize) {
      json.put("http2ConnectionWindowSize", http2ConnectionWindowSize);
    }
    if (exists initialSettings) {
      json.put("initialSettings", initialSettings.toJson());
    }
    if (exists maxChunkSize) {
      json.put("maxChunkSize", maxChunkSize);
    }
    if (exists maxHeaderSize) {
      json.put("maxHeaderSize", maxHeaderSize);
    }
    if (exists maxInitialLineLength) {
      json.put("maxInitialLineLength", maxInitialLineLength);
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

shared object httpServerOptions {

  shared HttpServerOptions fromJson(JsonObject json) {
    Integer? acceptBacklog = json.getIntegerOrNull("acceptBacklog");
    {HttpVersion*}? alpnVersions = json.getArrayOrNull("alpnVersions")?.strings?.map(httpVersion_.fromString);
    ClientAuth? clientAuth = if (exists tmp = json.getStringOrNull("clientAuth")) then clientAuth_.fromString(tmp) else null;
    Boolean? clientAuthRequired = json.getBooleanOrNull("clientAuthRequired");
    Boolean? compressionSupported = json.getBooleanOrNull("compressionSupported");
    {String*}? crlPaths = json.getArrayOrNull("crlPaths")?.strings;
    {String*}? enabledCipherSuites = null /* java.lang.String not handled */;
    {String*}? enabledSecureTransportProtocols = null /* java.lang.String not handled */;
    Boolean? handle100ContinueAutomatically = json.getBooleanOrNull("handle100ContinueAutomatically");
    String? host = json.getStringOrNull("host");
    Integer? http2ConnectionWindowSize = json.getIntegerOrNull("http2ConnectionWindowSize");
    Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
    Http2Settings? initialSettings = if (exists tmp = json.getObjectOrNull("initialSettings")) then http2Settings_.fromJson(tmp) else null;
    JdkSSLEngineOptions? jdkSslEngineOptions = if (exists tmp = json.getObjectOrNull("jdkSslEngineOptions")) then jdkSSLEngineOptions_.fromJson(tmp) else null;
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Boolean? logActivity = json.getBooleanOrNull("logActivity");
    Integer? maxChunkSize = json.getIntegerOrNull("maxChunkSize");
    Integer? maxHeaderSize = json.getIntegerOrNull("maxHeaderSize");
    Integer? maxInitialLineLength = json.getIntegerOrNull("maxInitialLineLength");
    Integer? maxWebsocketFrameSize = json.getIntegerOrNull("maxWebsocketFrameSize");
    OpenSSLEngineOptions? openSslEngineOptions = if (exists tmp = json.getObjectOrNull("openSslEngineOptions")) then openSSLEngineOptions_.fromJson(tmp) else null;
    PemKeyCertOptions? pemKeyCertOptions = if (exists tmp = json.getObjectOrNull("pemKeyCertOptions")) then pemKeyCertOptions_.fromJson(tmp) else null;
    PemTrustOptions? pemTrustOptions = if (exists tmp = json.getObjectOrNull("pemTrustOptions")) then pemTrustOptions_.fromJson(tmp) else null;
    PfxOptions? pfxKeyCertOptions = if (exists tmp = json.getObjectOrNull("pfxKeyCertOptions")) then pfxOptions_.fromJson(tmp) else null;
    PfxOptions? pfxTrustOptions = if (exists tmp = json.getObjectOrNull("pfxTrustOptions")) then pfxOptions_.fromJson(tmp) else null;
    Integer? port = json.getIntegerOrNull("port");
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
    Integer? soLinger = json.getIntegerOrNull("soLinger");
    Boolean? ssl = json.getBooleanOrNull("ssl");
    Boolean? tcpKeepAlive = json.getBooleanOrNull("tcpKeepAlive");
    Boolean? tcpNoDelay = json.getBooleanOrNull("tcpNoDelay");
    Integer? trafficClass = json.getIntegerOrNull("trafficClass");
    JksOptions? trustStoreOptions = if (exists tmp = json.getObjectOrNull("trustStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Boolean? useAlpn = json.getBooleanOrNull("useAlpn");
    Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
    String? websocketSubProtocols = json.getStringOrNull("websocketSubProtocols");
    return HttpServerOptions {
      acceptBacklog = acceptBacklog;
      alpnVersions = alpnVersions;
      clientAuth = clientAuth;
      clientAuthRequired = clientAuthRequired;
      compressionSupported = compressionSupported;
      crlPaths = crlPaths;
      enabledCipherSuites = enabledCipherSuites;
      enabledSecureTransportProtocols = enabledSecureTransportProtocols;
      handle100ContinueAutomatically = handle100ContinueAutomatically;
      host = host;
      http2ConnectionWindowSize = http2ConnectionWindowSize;
      idleTimeout = idleTimeout;
      initialSettings = initialSettings;
      jdkSslEngineOptions = jdkSslEngineOptions;
      keyStoreOptions = keyStoreOptions;
      logActivity = logActivity;
      maxChunkSize = maxChunkSize;
      maxHeaderSize = maxHeaderSize;
      maxInitialLineLength = maxInitialLineLength;
      maxWebsocketFrameSize = maxWebsocketFrameSize;
      openSslEngineOptions = openSslEngineOptions;
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
      useAlpn = useAlpn;
      usePooledBuffers = usePooledBuffers;
      websocketSubProtocols = websocketSubProtocols;
    };
  }

  shared object toJava extends Converter<HttpServerOptions, HttpServerOptions_>() {
    shared actual HttpServerOptions_ convert(HttpServerOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = HttpServerOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(HttpServerOptions obj) => obj.toJson();
}
