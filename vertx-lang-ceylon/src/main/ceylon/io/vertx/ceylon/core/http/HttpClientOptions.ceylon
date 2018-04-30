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
  ProxyOptions,
  proxyOptions_=proxyOptions,
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
  " set to <code>initialBufferSizeHttpDecoder</code> the initial buffer of the HttpDecoder.\n"
  shared Integer? decoderInitialBufferSize = null,
  " Set the default host name to be used by this client in requests if none is provided when making the request.\n"
  shared String? defaultHost = null,
  " Set the default port to be used by this client in requests if none is provided when making the request.\n"
  shared Integer? defaultPort = null,
  {String*}? enabledCipherSuites = null,
  {String*}? enabledSecureTransportProtocols = null,
  " By default, the server name is only sent for Fully Qualified Domain Name (FQDN), setting\n this property to <code>true</code> forces the server name to be always sent.\n"
  shared Boolean? forceSni = null,
  " Set to <code>true</code> when an <i>h2c</i> connection is established using an HTTP/1.1 upgrade request, and <code>false</code>\n when an <i>h2c</i> connection is established directly (with prior knowledge).\n"
  shared Boolean? http2ClearTextUpgrade = null,
  " Set the default HTTP/2 connection window size. It overrides the initial window\n size set by [getInitialWindowSize](../http/Http2Settings.type.html#getInitialWindowSize), so the connection window size\n is greater than for its streams, in order the data throughput.\n <p/>\n A value of <code>-1</code> reuses the initial window size setting.\n"
  shared Integer? http2ConnectionWindowSize = null,
  " Set the keep alive timeout for HTTP/2 connections, in seconds.\n <p/>\n This value determines how long a connection remains unused in the pool before being evicted and closed.\n"
  shared Integer? http2KeepAliveTimeout = null,
  " Set the maximum pool size for HTTP/2 connections\n"
  shared Integer? http2MaxPoolSize = null,
  " Set a client limit of the number concurrent streams for each HTTP/2 connection, this limits the number\n of streams the client can create for a connection. The effective number of streams for a\n connection is the min of this value and the server's initial settings.\n <p/>\n Setting the value to <code>-1</code> means to use the value sent by the server's initial settings.\n <code>-1</code> is the default value.\n"
  shared Integer? http2MultiplexingLimit = null,
  Integer? idleTimeout = null,
  " Set the HTTP/2 connection settings immediately sent by to the server when the client connects.\n"
  shared Http2Settings? initialSettings = null,
  JdkSSLEngineOptions? jdkSslEngineOptions = null,
  " Set whether keep alive is enabled on the client\n"
  shared Boolean? keepAlive = null,
  " Set the keep alive timeout for HTTP/1.x, in seconds.\n <p/>\n This value determines how long a connection remains unused in the pool before being evicted and closed.\n"
  shared Integer? keepAliveTimeout = null,
  JksOptions? keyStoreOptions = null,
  String? localAddress = null,
  Boolean? logActivity = null,
  " Set the maximum HTTP chunk size\n"
  shared Integer? maxChunkSize = null,
  " Set the maximum length of all headers for HTTP/1.x .\n"
  shared Integer? maxHeaderSize = null,
  " Set the maximum length of the initial line for HTTP/1.x (e.g. <code>\"HTTP/1.1 200 OK\"</code>)\n"
  shared Integer? maxInitialLineLength = null,
  " Set the maximum pool size for connections\n"
  shared Integer? maxPoolSize = null,
  " Set to <code>maxRedirects</code> the maximum number of redirection a request can follow.\n"
  shared Integer? maxRedirects = null,
  " Set the maximum requests allowed in the wait queue, any requests beyond the max size will result in\n a ConnectionPoolTooBusyException.  If the value is set to a negative number then the queue will be unbounded.\n"
  shared Integer? maxWaitQueueSize = null,
  " Set the max websocket frame size\n"
  shared Integer? maxWebsocketFrameSize = null,
  " Set the max websocket message size\n"
  shared Integer? maxWebsocketMessageSize = null,
  String? metricsName = null,
  OpenSSLEngineOptions? openSslEngineOptions = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  " Set whether pipe-lining is enabled on the client\n"
  shared Boolean? pipelining = null,
  " Set the limit of pending requests a pipe-lined HTTP/1 connection can send.\n"
  shared Integer? pipeliningLimit = null,
  " Set the connection pool cleaner period in milli seconds, a non positive value disables expiration checks and connections\n will remain in the pool until they are closed.\n"
  shared Integer? poolCleanerPeriod = null,
  " Set the protocol version.\n"
  shared HttpVersion? protocolVersion = null,
  ProxyOptions? proxyOptions = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Boolean? reusePort = null,
  Integer? sendBufferSize = null,
  " Set true when the client wants to skip frame masking.\n You may want to set it true on server by server websocket communication: In this case you are by passing RFC6455 protocol.\n It's false as default.\n"
  shared Boolean? sendUnmaskedFrames = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpCork = null,
  Boolean? tcpFastOpen = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Boolean? tcpQuickAck = null,
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
  jdkSslEngineOptions,
  keyStoreOptions,
  localAddress,
  logActivity,
  metricsName,
  openSslEngineOptions,
  pemKeyCertOptions,
  pemTrustOptions,
  pfxKeyCertOptions,
  pfxTrustOptions,
  proxyOptions,
  receiveBufferSize,
  reuseAddress,
  reusePort,
  sendBufferSize,
  soLinger,
  ssl,
  tcpCork,
  tcpFastOpen,
  tcpKeepAlive,
  tcpNoDelay,
  tcpQuickAck,
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
    if (exists decoderInitialBufferSize) {
      json.put("decoderInitialBufferSize", decoderInitialBufferSize);
    }
    if (exists defaultHost) {
      json.put("defaultHost", defaultHost);
    }
    if (exists defaultPort) {
      json.put("defaultPort", defaultPort);
    }
    if (exists forceSni) {
      json.put("forceSni", forceSni);
    }
    if (exists http2ClearTextUpgrade) {
      json.put("http2ClearTextUpgrade", http2ClearTextUpgrade);
    }
    if (exists http2ConnectionWindowSize) {
      json.put("http2ConnectionWindowSize", http2ConnectionWindowSize);
    }
    if (exists http2KeepAliveTimeout) {
      json.put("http2KeepAliveTimeout", http2KeepAliveTimeout);
    }
    if (exists http2MaxPoolSize) {
      json.put("http2MaxPoolSize", http2MaxPoolSize);
    }
    if (exists http2MultiplexingLimit) {
      json.put("http2MultiplexingLimit", http2MultiplexingLimit);
    }
    if (exists initialSettings) {
      json.put("initialSettings", initialSettings.toJson());
    }
    if (exists keepAlive) {
      json.put("keepAlive", keepAlive);
    }
    if (exists keepAliveTimeout) {
      json.put("keepAliveTimeout", keepAliveTimeout);
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
    if (exists maxPoolSize) {
      json.put("maxPoolSize", maxPoolSize);
    }
    if (exists maxRedirects) {
      json.put("maxRedirects", maxRedirects);
    }
    if (exists maxWaitQueueSize) {
      json.put("maxWaitQueueSize", maxWaitQueueSize);
    }
    if (exists maxWebsocketFrameSize) {
      json.put("maxWebsocketFrameSize", maxWebsocketFrameSize);
    }
    if (exists maxWebsocketMessageSize) {
      json.put("maxWebsocketMessageSize", maxWebsocketMessageSize);
    }
    if (exists pipelining) {
      json.put("pipelining", pipelining);
    }
    if (exists pipeliningLimit) {
      json.put("pipeliningLimit", pipeliningLimit);
    }
    if (exists poolCleanerPeriod) {
      json.put("poolCleanerPeriod", poolCleanerPeriod);
    }
    if (exists protocolVersion) {
      json.put("protocolVersion", httpVersion_.toString(protocolVersion));
    }
    if (exists sendUnmaskedFrames) {
      json.put("sendUnmaskedFrames", sendUnmaskedFrames);
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
    Integer? decoderInitialBufferSize = json.getIntegerOrNull("decoderInitialBufferSize");
    String? defaultHost = json.getStringOrNull("defaultHost");
    Integer? defaultPort = json.getIntegerOrNull("defaultPort");
    {String*}? enabledCipherSuites = null /* java.lang.String not handled */;
    {String*}? enabledSecureTransportProtocols = null /* java.lang.String not handled */;
    Boolean? forceSni = json.getBooleanOrNull("forceSni");
    Boolean? http2ClearTextUpgrade = json.getBooleanOrNull("http2ClearTextUpgrade");
    Integer? http2ConnectionWindowSize = json.getIntegerOrNull("http2ConnectionWindowSize");
    Integer? http2KeepAliveTimeout = json.getIntegerOrNull("http2KeepAliveTimeout");
    Integer? http2MaxPoolSize = json.getIntegerOrNull("http2MaxPoolSize");
    Integer? http2MultiplexingLimit = json.getIntegerOrNull("http2MultiplexingLimit");
    Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
    Http2Settings? initialSettings = if (exists tmp = json.getObjectOrNull("initialSettings")) then http2Settings_.fromJson(tmp) else null;
    JdkSSLEngineOptions? jdkSslEngineOptions = if (exists tmp = json.getObjectOrNull("jdkSslEngineOptions")) then jdkSSLEngineOptions_.fromJson(tmp) else null;
    Boolean? keepAlive = json.getBooleanOrNull("keepAlive");
    Integer? keepAliveTimeout = json.getIntegerOrNull("keepAliveTimeout");
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    String? localAddress = json.getStringOrNull("localAddress");
    Boolean? logActivity = json.getBooleanOrNull("logActivity");
    Integer? maxChunkSize = json.getIntegerOrNull("maxChunkSize");
    Integer? maxHeaderSize = json.getIntegerOrNull("maxHeaderSize");
    Integer? maxInitialLineLength = json.getIntegerOrNull("maxInitialLineLength");
    Integer? maxPoolSize = json.getIntegerOrNull("maxPoolSize");
    Integer? maxRedirects = json.getIntegerOrNull("maxRedirects");
    Integer? maxWaitQueueSize = json.getIntegerOrNull("maxWaitQueueSize");
    Integer? maxWebsocketFrameSize = json.getIntegerOrNull("maxWebsocketFrameSize");
    Integer? maxWebsocketMessageSize = json.getIntegerOrNull("maxWebsocketMessageSize");
    String? metricsName = json.getStringOrNull("metricsName");
    OpenSSLEngineOptions? openSslEngineOptions = if (exists tmp = json.getObjectOrNull("openSslEngineOptions")) then openSSLEngineOptions_.fromJson(tmp) else null;
    PemKeyCertOptions? pemKeyCertOptions = if (exists tmp = json.getObjectOrNull("pemKeyCertOptions")) then pemKeyCertOptions_.fromJson(tmp) else null;
    PemTrustOptions? pemTrustOptions = if (exists tmp = json.getObjectOrNull("pemTrustOptions")) then pemTrustOptions_.fromJson(tmp) else null;
    PfxOptions? pfxKeyCertOptions = if (exists tmp = json.getObjectOrNull("pfxKeyCertOptions")) then pfxOptions_.fromJson(tmp) else null;
    PfxOptions? pfxTrustOptions = if (exists tmp = json.getObjectOrNull("pfxTrustOptions")) then pfxOptions_.fromJson(tmp) else null;
    Boolean? pipelining = json.getBooleanOrNull("pipelining");
    Integer? pipeliningLimit = json.getIntegerOrNull("pipeliningLimit");
    Integer? poolCleanerPeriod = json.getIntegerOrNull("poolCleanerPeriod");
    HttpVersion? protocolVersion = if (exists tmp = json.getStringOrNull("protocolVersion")) then httpVersion_.fromString(tmp) else null;
    ProxyOptions? proxyOptions = if (exists tmp = json.getObjectOrNull("proxyOptions")) then proxyOptions_.fromJson(tmp) else null;
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    Boolean? reusePort = json.getBooleanOrNull("reusePort");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
    Boolean? sendUnmaskedFrames = json.getBooleanOrNull("sendUnmaskedFrames");
    Integer? soLinger = json.getIntegerOrNull("soLinger");
    Boolean? ssl = json.getBooleanOrNull("ssl");
    Boolean? tcpCork = json.getBooleanOrNull("tcpCork");
    Boolean? tcpFastOpen = json.getBooleanOrNull("tcpFastOpen");
    Boolean? tcpKeepAlive = json.getBooleanOrNull("tcpKeepAlive");
    Boolean? tcpNoDelay = json.getBooleanOrNull("tcpNoDelay");
    Boolean? tcpQuickAck = json.getBooleanOrNull("tcpQuickAck");
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
      decoderInitialBufferSize = decoderInitialBufferSize;
      defaultHost = defaultHost;
      defaultPort = defaultPort;
      enabledCipherSuites = enabledCipherSuites;
      enabledSecureTransportProtocols = enabledSecureTransportProtocols;
      forceSni = forceSni;
      http2ClearTextUpgrade = http2ClearTextUpgrade;
      http2ConnectionWindowSize = http2ConnectionWindowSize;
      http2KeepAliveTimeout = http2KeepAliveTimeout;
      http2MaxPoolSize = http2MaxPoolSize;
      http2MultiplexingLimit = http2MultiplexingLimit;
      idleTimeout = idleTimeout;
      initialSettings = initialSettings;
      jdkSslEngineOptions = jdkSslEngineOptions;
      keepAlive = keepAlive;
      keepAliveTimeout = keepAliveTimeout;
      keyStoreOptions = keyStoreOptions;
      localAddress = localAddress;
      logActivity = logActivity;
      maxChunkSize = maxChunkSize;
      maxHeaderSize = maxHeaderSize;
      maxInitialLineLength = maxInitialLineLength;
      maxPoolSize = maxPoolSize;
      maxRedirects = maxRedirects;
      maxWaitQueueSize = maxWaitQueueSize;
      maxWebsocketFrameSize = maxWebsocketFrameSize;
      maxWebsocketMessageSize = maxWebsocketMessageSize;
      metricsName = metricsName;
      openSslEngineOptions = openSslEngineOptions;
      pemKeyCertOptions = pemKeyCertOptions;
      pemTrustOptions = pemTrustOptions;
      pfxKeyCertOptions = pfxKeyCertOptions;
      pfxTrustOptions = pfxTrustOptions;
      pipelining = pipelining;
      pipeliningLimit = pipeliningLimit;
      poolCleanerPeriod = poolCleanerPeriod;
      protocolVersion = protocolVersion;
      proxyOptions = proxyOptions;
      receiveBufferSize = receiveBufferSize;
      reuseAddress = reuseAddress;
      reusePort = reusePort;
      sendBufferSize = sendBufferSize;
      sendUnmaskedFrames = sendUnmaskedFrames;
      soLinger = soLinger;
      ssl = ssl;
      tcpCork = tcpCork;
      tcpFastOpen = tcpFastOpen;
      tcpKeepAlive = tcpKeepAlive;
      tcpNoDelay = tcpNoDelay;
      tcpQuickAck = tcpQuickAck;
      trafficClass = trafficClass;
      trustAll = trustAll;
      trustStoreOptions = trustStoreOptions;
      tryUseCompression = tryUseCompression;
      useAlpn = useAlpn;
      usePooledBuffers = usePooledBuffers;
      verifyHost = verifyHost;
    };
  }

  shared object toCeylon extends Converter<HttpClientOptions_, HttpClientOptions>() {
    shared actual HttpClientOptions convert(HttpClientOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
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
