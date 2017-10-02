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
  " Set true when the server accepts unmasked frame.\n As default Server doesn't accept unmasked frame, you can bypass this behaviour (RFC 6455) setting true\n It's set to false as default.\n"
  shared Boolean? acceptUnmaskedFrames = null,
  " Set the list of protocol versions to provide to the server during the Application-Layer Protocol Negotiatiation.\n"
  shared {HttpVersion*}? alpnVersions = null,
  ClientAuth? clientAuth = null,
  Boolean? clientAuthRequired = null,
  " This method allows to set the compression level to be used in http1.x/2 response bodies\n when compression support is turned on (@see setCompressionSupported) and the client advertises\n to support <code>deflate/gzip</code> compression in the <code>Accept-Encoding</code> header\n\n default value is : 6 (Netty legacy)\n\n The compression level determines how much the data is compressed on a scale from 1 to 9,\n where '9' is trying to achieve the maximum compression ratio while '1' instead is giving\n priority to speed instead of compression ratio using some algorithm optimizations and skipping\n pedantic loops that usually gives just little improvements\n\n While one can think that best value is always the maximum compression ratio,\n there's a trade-off to consider: the most compressed level requires the most\n computational work to compress/decompress data, e.g. more dictionary lookups and loops.\n\n E.g. you have it set fairly high on a high-volume website, you may experience performance degradation\n and latency on resource serving due to CPU overload, and, however - as the computational work is required also client side\n while decompressing - setting an higher compression level can result in an overall higher page load time\n especially nowadays when many clients are handled mobile devices with a low CPU profile.\n\n see also: http://www.gzip.org/algorithm.txt\n"
  shared Integer? compressionLevel = null,
  " Set whether the server should support gzip/deflate compression\n (serving compressed responses to clients advertising support for them with Accept-Encoding header)\n"
  shared Boolean? compressionSupported = null,
  {String*}? crlPaths = null,
  " Set the initial buffer size for the HTTP decoder\n"
  shared Integer? decoderInitialBufferSize = null,
  " Set whether the server supports decompression\n"
  shared Boolean? decompressionSupported = null,
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
  " Set the maximum websocket message size\n"
  shared Integer? maxWebsocketMessageSize = null,
  OpenSSLEngineOptions? openSslEngineOptions = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  Integer? port = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Boolean? reusePort = null,
  Integer? sendBufferSize = null,
  Boolean? sni = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpCork = null,
  Boolean? tcpFastOpen = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Boolean? tcpQuickAck = null,
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
  reusePort,
  sendBufferSize,
  sni,
  soLinger,
  ssl,
  tcpCork,
  tcpFastOpen,
  tcpKeepAlive,
  tcpNoDelay,
  tcpQuickAck,
  trafficClass,
  trustStoreOptions,
  useAlpn,
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = super.toJson();
    if (exists acceptUnmaskedFrames) {
      json.put("acceptUnmaskedFrames", acceptUnmaskedFrames);
    }
    if (exists alpnVersions) {
      json.put("alpnVersions", JsonArray(alpnVersions.map(httpVersion_.toString)));
    }
    if (exists compressionLevel) {
      json.put("compressionLevel", compressionLevel);
    }
    if (exists compressionSupported) {
      json.put("compressionSupported", compressionSupported);
    }
    if (exists decoderInitialBufferSize) {
      json.put("decoderInitialBufferSize", decoderInitialBufferSize);
    }
    if (exists decompressionSupported) {
      json.put("decompressionSupported", decompressionSupported);
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
    if (exists maxWebsocketMessageSize) {
      json.put("maxWebsocketMessageSize", maxWebsocketMessageSize);
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
    Boolean? acceptUnmaskedFrames = json.getBooleanOrNull("acceptUnmaskedFrames");
    {HttpVersion*}? alpnVersions = json.getArrayOrNull("alpnVersions")?.strings?.map(httpVersion_.fromString);
    ClientAuth? clientAuth = if (exists tmp = json.getStringOrNull("clientAuth")) then clientAuth_.fromString(tmp) else null;
    Boolean? clientAuthRequired = json.getBooleanOrNull("clientAuthRequired");
    Integer? compressionLevel = json.getIntegerOrNull("compressionLevel");
    Boolean? compressionSupported = json.getBooleanOrNull("compressionSupported");
    {String*}? crlPaths = json.getArrayOrNull("crlPaths")?.strings;
    Integer? decoderInitialBufferSize = json.getIntegerOrNull("decoderInitialBufferSize");
    Boolean? decompressionSupported = json.getBooleanOrNull("decompressionSupported");
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
    Integer? maxWebsocketMessageSize = json.getIntegerOrNull("maxWebsocketMessageSize");
    OpenSSLEngineOptions? openSslEngineOptions = if (exists tmp = json.getObjectOrNull("openSslEngineOptions")) then openSSLEngineOptions_.fromJson(tmp) else null;
    PemKeyCertOptions? pemKeyCertOptions = if (exists tmp = json.getObjectOrNull("pemKeyCertOptions")) then pemKeyCertOptions_.fromJson(tmp) else null;
    PemTrustOptions? pemTrustOptions = if (exists tmp = json.getObjectOrNull("pemTrustOptions")) then pemTrustOptions_.fromJson(tmp) else null;
    PfxOptions? pfxKeyCertOptions = if (exists tmp = json.getObjectOrNull("pfxKeyCertOptions")) then pfxOptions_.fromJson(tmp) else null;
    PfxOptions? pfxTrustOptions = if (exists tmp = json.getObjectOrNull("pfxTrustOptions")) then pfxOptions_.fromJson(tmp) else null;
    Integer? port = json.getIntegerOrNull("port");
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    Boolean? reusePort = json.getBooleanOrNull("reusePort");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
    Boolean? sni = json.getBooleanOrNull("sni");
    Integer? soLinger = json.getIntegerOrNull("soLinger");
    Boolean? ssl = json.getBooleanOrNull("ssl");
    Boolean? tcpCork = json.getBooleanOrNull("tcpCork");
    Boolean? tcpFastOpen = json.getBooleanOrNull("tcpFastOpen");
    Boolean? tcpKeepAlive = json.getBooleanOrNull("tcpKeepAlive");
    Boolean? tcpNoDelay = json.getBooleanOrNull("tcpNoDelay");
    Boolean? tcpQuickAck = json.getBooleanOrNull("tcpQuickAck");
    Integer? trafficClass = json.getIntegerOrNull("trafficClass");
    JksOptions? trustStoreOptions = if (exists tmp = json.getObjectOrNull("trustStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Boolean? useAlpn = json.getBooleanOrNull("useAlpn");
    Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
    String? websocketSubProtocols = json.getStringOrNull("websocketSubProtocols");
    return HttpServerOptions {
      acceptBacklog = acceptBacklog;
      acceptUnmaskedFrames = acceptUnmaskedFrames;
      alpnVersions = alpnVersions;
      clientAuth = clientAuth;
      clientAuthRequired = clientAuthRequired;
      compressionLevel = compressionLevel;
      compressionSupported = compressionSupported;
      crlPaths = crlPaths;
      decoderInitialBufferSize = decoderInitialBufferSize;
      decompressionSupported = decompressionSupported;
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
      maxWebsocketMessageSize = maxWebsocketMessageSize;
      openSslEngineOptions = openSslEngineOptions;
      pemKeyCertOptions = pemKeyCertOptions;
      pemTrustOptions = pemTrustOptions;
      pfxKeyCertOptions = pfxKeyCertOptions;
      pfxTrustOptions = pfxTrustOptions;
      port = port;
      receiveBufferSize = receiveBufferSize;
      reuseAddress = reuseAddress;
      reusePort = reusePort;
      sendBufferSize = sendBufferSize;
      sni = sni;
      soLinger = soLinger;
      ssl = ssl;
      tcpCork = tcpCork;
      tcpFastOpen = tcpFastOpen;
      tcpKeepAlive = tcpKeepAlive;
      tcpNoDelay = tcpNoDelay;
      tcpQuickAck = tcpQuickAck;
      trafficClass = trafficClass;
      trustStoreOptions = trustStoreOptions;
      useAlpn = useAlpn;
      usePooledBuffers = usePooledBuffers;
      websocketSubProtocols = websocketSubProtocols;
    };
  }

  shared object toCeylon extends Converter<HttpServerOptions_, HttpServerOptions>() {
    shared actual HttpServerOptions convert(HttpServerOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
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
