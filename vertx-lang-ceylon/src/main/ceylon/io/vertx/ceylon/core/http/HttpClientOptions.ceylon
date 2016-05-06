import io.vertx.ceylon.core.net {
  JksOptions,
  jksOptions_=jksOptions,
  PemKeyCertOptions,
  pemKeyCertOptions_=pemKeyCertOptions,
  PemTrustOptions,
  pemTrustOptions_=pemTrustOptions,
  PfxOptions,
  pfxOptions_=pfxOptions,
  SSLEngine,
  sslEngine_=sslEngine,
  ClientOptionsBase
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
  Http2Settings,
  http2Settings_=http2Settings
}
import io.vertx.core.http {
  HttpClientOptions_=HttpClientOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.http.HttpClientOptions */
" Options describing how an [HttpClient](../http/HttpClient.type.html) will make connections.\n"
shared class HttpClientOptions(
  " Set the list of protocol versions to provide to the server during the Application-Layer Protocol Negotiation.\n When the list is empty, the client provides a best effort list according to [setProtocolVersion](../http/HttpClientOptions.type.html#setProtocolVersion):\n\n <ul>\n   <li>: [ \"h2\", \"http/1.1\" ]</li>\n   <li>otherwise: [[getProtocolVersion](../http/HttpClientOptions.type.html#getProtocolVersion)]</li>\n </ul>\n"
  shared {HttpVersion*}? alpnVersions = null,
  Integer? connectTimeout = null,
  {String*}? crlPaths = null,
  " Set the default host name to be used by this client in requests if none is provided when making the request.\n"
  shared String? defaultHost = null,
  " Set the default port to be used by this client in requests if none is provided when making the request.\n"
  shared Integer? defaultPort = null,
  {String*}? enabledCipherSuites = null,
  {String*}? enabledSecureTransportProtocols = null,
  " Set to <code>true</code> when an <i>h2c</i> connection is established using an HTTP/1.1 upgrade request, and <code>false</code>\n when an <i>h2c</i> connection is established directly (with prior knowledge).\n"
  shared Boolean? h2cUpgrade = null,
  Integer? idleTimeout = null,
  " Set the HTTP/2 connection settings immediately sent by to the server when the client connects.\n"
  shared Http2Settings? initialSettings = null,
  " Set whether keep alive is enabled on the client\n"
  shared Boolean? keepAlive = null,
  JksOptions? keyStoreOptions = null,
  " Set the maximum HTTP chunk size\n"
  shared Integer? maxChunkSize = null,
  " Set the maximum pool size for connections\n"
  shared Integer? maxPoolSize = null,
  " Set the maximum requests allowed in the wait queue, any requests beyond the max size will result in\n a ConnectionPoolTooBusyException.  If the value is set to a negative number then the queue will be unbounded.\n"
  shared Integer? maxWaitQueueSize = null,
  " Set the max websocket frame size\n"
  shared Integer? maxWebsocketFrameSize = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  " Set whether pipe-lining is enabled on the client\n"
  shared Boolean? pipelining = null,
  " Set the protocol version.\n"
  shared HttpVersion? protocolVersion = null,
  " Set proxy hostname for ssl connections via CONNECT proxy (e.g. Squid).\n"
  shared String? proxyHost = null,
  " Set proxy password for ssl connections\n"
  shared String? proxyPassword = null,
  " Set proxy port for ssl connections\n"
  shared Integer? proxyPort = null,
  " Set proxy username for ssl connections\n"
  shared String? proxyUsername = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  SSLEngine? sslEngine = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  Boolean? trustAll = null,
  JksOptions? trustStoreOptions = null,
  " Set whether compression is enabled\n"
  shared Boolean? tryUseCompression = null,
  Boolean? useAlpn = null,
  Boolean? usePooledBuffers = null,
  " Set whether hostname verification is enabled\n"
  shared Boolean? verifyHost = null) extends ClientOptionsBase(
  connectTimeout,
  crlPaths,
  enabledCipherSuites,
  enabledSecureTransportProtocols,
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
  sslEngine,
  tcpKeepAlive,
  tcpNoDelay,
  trafficClass,
  trustAll,
  trustStoreOptions,
  useAlpn,
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = super.toJson();
    if (exists alpnVersions) {
      json.put("alpnVersions", JsonArray(alpnVersions.map(httpVersion_.toString)));
    }
    if (exists defaultHost) {
      json.put("defaultHost", defaultHost);
    }
    if (exists defaultPort) {
      json.put("defaultPort", defaultPort);
    }
    if (exists h2cUpgrade) {
      json.put("h2cUpgrade", h2cUpgrade);
    }
    if (exists initialSettings) {
      json.put("initialSettings", initialSettings.toJson());
    }
    if (exists keepAlive) {
      json.put("keepAlive", keepAlive);
    }
    if (exists maxChunkSize) {
      json.put("maxChunkSize", maxChunkSize);
    }
    if (exists maxPoolSize) {
      json.put("maxPoolSize", maxPoolSize);
    }
    if (exists maxWaitQueueSize) {
      json.put("maxWaitQueueSize", maxWaitQueueSize);
    }
    if (exists maxWebsocketFrameSize) {
      json.put("maxWebsocketFrameSize", maxWebsocketFrameSize);
    }
    if (exists pipelining) {
      json.put("pipelining", pipelining);
    }
    if (exists protocolVersion) {
      json.put("protocolVersion", httpVersion_.toString(protocolVersion));
    }
    if (exists proxyHost) {
      json.put("proxyHost", proxyHost);
    }
    if (exists proxyPassword) {
      json.put("proxyPassword", proxyPassword);
    }
    if (exists proxyPort) {
      json.put("proxyPort", proxyPort);
    }
    if (exists proxyUsername) {
      json.put("proxyUsername", proxyUsername);
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

shared object httpClientOptions {

  shared HttpClientOptions fromJson(JsonObject json) {
    {HttpVersion*}? alpnVersions = json.getArrayOrNull("alpnVersions")?.strings?.map(httpVersion_.fromString);
    Integer? connectTimeout = json.getIntegerOrNull("connectTimeout");
    {String*}? crlPaths = json.getArrayOrNull("crlPaths")?.strings;
    String? defaultHost = json.getStringOrNull("defaultHost");
    Integer? defaultPort = json.getIntegerOrNull("defaultPort");
    {String*}? enabledCipherSuites = null /* java.lang.String not handled */;
    {String*}? enabledSecureTransportProtocols = null /* java.lang.String not handled */;
    Boolean? h2cUpgrade = json.getBooleanOrNull("h2cUpgrade");
    Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
    Http2Settings? initialSettings = if (exists tmp = json.getObjectOrNull("initialSettings")) then http2Settings_.fromJson(tmp) else null;
    Boolean? keepAlive = json.getBooleanOrNull("keepAlive");
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Integer? maxChunkSize = json.getIntegerOrNull("maxChunkSize");
    Integer? maxPoolSize = json.getIntegerOrNull("maxPoolSize");
    Integer? maxWaitQueueSize = json.getIntegerOrNull("maxWaitQueueSize");
    Integer? maxWebsocketFrameSize = json.getIntegerOrNull("maxWebsocketFrameSize");
    PemKeyCertOptions? pemKeyCertOptions = if (exists tmp = json.getObjectOrNull("pemKeyCertOptions")) then pemKeyCertOptions_.fromJson(tmp) else null;
    PemTrustOptions? pemTrustOptions = if (exists tmp = json.getObjectOrNull("pemTrustOptions")) then pemTrustOptions_.fromJson(tmp) else null;
    PfxOptions? pfxKeyCertOptions = if (exists tmp = json.getObjectOrNull("pfxKeyCertOptions")) then pfxOptions_.fromJson(tmp) else null;
    PfxOptions? pfxTrustOptions = if (exists tmp = json.getObjectOrNull("pfxTrustOptions")) then pfxOptions_.fromJson(tmp) else null;
    Boolean? pipelining = json.getBooleanOrNull("pipelining");
    HttpVersion? protocolVersion = if (exists tmp = json.getStringOrNull("protocolVersion")) then httpVersion_.fromString(tmp) else null;
    String? proxyHost = json.getStringOrNull("proxyHost");
    String? proxyPassword = json.getStringOrNull("proxyPassword");
    Integer? proxyPort = json.getIntegerOrNull("proxyPort");
    String? proxyUsername = json.getStringOrNull("proxyUsername");
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
    Integer? soLinger = json.getIntegerOrNull("soLinger");
    Boolean? ssl = json.getBooleanOrNull("ssl");
    SSLEngine? sslEngine = if (exists tmp = json.getStringOrNull("sslEngine")) then sslEngine_.fromString(tmp) else null;
    Boolean? tcpKeepAlive = json.getBooleanOrNull("tcpKeepAlive");
    Boolean? tcpNoDelay = json.getBooleanOrNull("tcpNoDelay");
    Integer? trafficClass = json.getIntegerOrNull("trafficClass");
    Boolean? trustAll = json.getBooleanOrNull("trustAll");
    JksOptions? trustStoreOptions = if (exists tmp = json.getObjectOrNull("trustStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Boolean? tryUseCompression = json.getBooleanOrNull("tryUseCompression");
    Boolean? useAlpn = json.getBooleanOrNull("useAlpn");
    Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
    Boolean? verifyHost = json.getBooleanOrNull("verifyHost");
    return HttpClientOptions {
      alpnVersions = alpnVersions;
      connectTimeout = connectTimeout;
      crlPaths = crlPaths;
      defaultHost = defaultHost;
      defaultPort = defaultPort;
      enabledCipherSuites = enabledCipherSuites;
      enabledSecureTransportProtocols = enabledSecureTransportProtocols;
      h2cUpgrade = h2cUpgrade;
      idleTimeout = idleTimeout;
      initialSettings = initialSettings;
      keepAlive = keepAlive;
      keyStoreOptions = keyStoreOptions;
      maxChunkSize = maxChunkSize;
      maxPoolSize = maxPoolSize;
      maxWaitQueueSize = maxWaitQueueSize;
      maxWebsocketFrameSize = maxWebsocketFrameSize;
      pemKeyCertOptions = pemKeyCertOptions;
      pemTrustOptions = pemTrustOptions;
      pfxKeyCertOptions = pfxKeyCertOptions;
      pfxTrustOptions = pfxTrustOptions;
      pipelining = pipelining;
      protocolVersion = protocolVersion;
      proxyHost = proxyHost;
      proxyPassword = proxyPassword;
      proxyPort = proxyPort;
      proxyUsername = proxyUsername;
      receiveBufferSize = receiveBufferSize;
      reuseAddress = reuseAddress;
      sendBufferSize = sendBufferSize;
      soLinger = soLinger;
      ssl = ssl;
      sslEngine = sslEngine;
      tcpKeepAlive = tcpKeepAlive;
      tcpNoDelay = tcpNoDelay;
      trafficClass = trafficClass;
      trustAll = trustAll;
      trustStoreOptions = trustStoreOptions;
      tryUseCompression = tryUseCompression;
      useAlpn = useAlpn;
      usePooledBuffers = usePooledBuffers;
      verifyHost = verifyHost;
    };
  }

  shared object toJava extends Converter<HttpClientOptions, HttpClientOptions_>() {
    shared actual HttpClientOptions_ convert(HttpClientOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = HttpClientOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(HttpClientOptions obj) => obj.toJson();
}
