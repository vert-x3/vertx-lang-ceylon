import io.vertx.ext.auth.oauth2 {
  OAuth2ClientOptions_=OAuth2ClientOptions
}
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
  proxyOptions_=proxyOptions
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
  http2Settings_=http2Settings,
  HttpClientOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.auth.oauth2.OAuth2ClientOptions */
" Options describing how an OAuth2  will make connections.\n"
shared class OAuth2ClientOptions(
  {HttpVersion*}? alpnVersions = null,
  shared String? authorizationPath = null,
  shared String? clientID = null,
  shared String? clientSecret = null,
  shared String? clientSecretParameterName = null,
  Integer? connectTimeout = null,
  {String*}? crlPaths = null,
  Integer? decoderInitialBufferSize = null,
  String? defaultHost = null,
  Integer? defaultPort = null,
  {String*}? enabledCipherSuites = null,
  {String*}? enabledSecureTransportProtocols = null,
  shared JsonObject? extraParameters = null,
  Boolean? forceSni = null,
  shared JsonObject? headers = null,
  Boolean? http2ClearTextUpgrade = null,
  Integer? http2ConnectionWindowSize = null,
  Integer? http2MaxPoolSize = null,
  Integer? http2MultiplexingLimit = null,
  Integer? idleTimeout = null,
  Http2Settings? initialSettings = null,
  shared String? introspectionPath = null,
  JdkSSLEngineOptions? jdkSslEngineOptions = null,
  shared Boolean? jwtToken = null,
  Boolean? keepAlive = null,
  JksOptions? keyStoreOptions = null,
  String? localAddress = null,
  Boolean? logActivity = null,
  shared String? logoutPath = null,
  Integer? maxChunkSize = null,
  Integer? maxHeaderSize = null,
  Integer? maxInitialLineLength = null,
  Integer? maxPoolSize = null,
  Integer? maxRedirects = null,
  Integer? maxWaitQueueSize = null,
  Integer? maxWebsocketFrameSize = null,
  Integer? maxWebsocketMessageSize = null,
  String? metricsName = null,
  OpenSSLEngineOptions? openSslEngineOptions = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  Boolean? pipelining = null,
  Integer? pipeliningLimit = null,
  shared String? privateKey = null,
  HttpVersion? protocolVersion = null,
  ProxyOptions? proxyOptions = null,
  shared String? publicKey = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  shared String? revocationPath = null,
  shared String? scopeSeparator = null,
  Integer? sendBufferSize = null,
  Boolean? sendUnmaskedFrames = null,
  shared String? site = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  shared String? tokenPath = null,
  Integer? trafficClass = null,
  Boolean? trustAll = null,
  JksOptions? trustStoreOptions = null,
  Boolean? tryUseCompression = null,
  Boolean? useAlpn = null,
  shared Boolean? useBasicAuthorizationHeader = null,
  Boolean? usePooledBuffers = null,
  shared String? userAgent = null,
  shared String? userInfoPath = null,
  Boolean? verifyHost = null) extends HttpClientOptions(
  alpnVersions,
  connectTimeout,
  crlPaths,
  decoderInitialBufferSize,
  defaultHost,
  defaultPort,
  enabledCipherSuites,
  enabledSecureTransportProtocols,
  forceSni,
  http2ClearTextUpgrade,
  http2ConnectionWindowSize,
  http2MaxPoolSize,
  http2MultiplexingLimit,
  idleTimeout,
  initialSettings,
  jdkSslEngineOptions,
  keepAlive,
  keyStoreOptions,
  localAddress,
  logActivity,
  maxChunkSize,
  maxHeaderSize,
  maxInitialLineLength,
  maxPoolSize,
  maxRedirects,
  maxWaitQueueSize,
  maxWebsocketFrameSize,
  maxWebsocketMessageSize,
  metricsName,
  openSslEngineOptions,
  pemKeyCertOptions,
  pemTrustOptions,
  pfxKeyCertOptions,
  pfxTrustOptions,
  pipelining,
  pipeliningLimit,
  protocolVersion,
  proxyOptions,
  receiveBufferSize,
  reuseAddress,
  sendBufferSize,
  sendUnmaskedFrames,
  soLinger,
  ssl,
  tcpKeepAlive,
  tcpNoDelay,
  trafficClass,
  trustAll,
  trustStoreOptions,
  tryUseCompression,
  useAlpn,
  usePooledBuffers,
  verifyHost) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = super.toJson();
    if (exists authorizationPath) {
      json.put("authorizationPath", authorizationPath);
    }
    if (exists clientID) {
      json.put("clientID", clientID);
    }
    if (exists clientSecret) {
      json.put("clientSecret", clientSecret);
    }
    if (exists clientSecretParameterName) {
      json.put("clientSecretParameterName", clientSecretParameterName);
    }
    if (exists extraParameters) {
      json.put("extraParameters", extraParameters);
    }
    if (exists headers) {
      json.put("headers", headers);
    }
    if (exists introspectionPath) {
      json.put("introspectionPath", introspectionPath);
    }
    if (exists jwtToken) {
      json.put("jwtToken", jwtToken);
    }
    if (exists logoutPath) {
      json.put("logoutPath", logoutPath);
    }
    if (exists privateKey) {
      json.put("privateKey", privateKey);
    }
    if (exists publicKey) {
      json.put("publicKey", publicKey);
    }
    if (exists revocationPath) {
      json.put("revocationPath", revocationPath);
    }
    if (exists scopeSeparator) {
      json.put("scopeSeparator", scopeSeparator);
    }
    if (exists site) {
      json.put("site", site);
    }
    if (exists tokenPath) {
      json.put("tokenPath", tokenPath);
    }
    if (exists useBasicAuthorizationHeader) {
      json.put("useBasicAuthorizationHeader", useBasicAuthorizationHeader);
    }
    if (exists userAgent) {
      json.put("userAgent", userAgent);
    }
    if (exists userInfoPath) {
      json.put("userInfoPath", userInfoPath);
    }
    return json;
  }
}

shared object oAuth2ClientOptions {

  shared OAuth2ClientOptions fromJson(JsonObject json) {
    {HttpVersion*}? alpnVersions = json.getArrayOrNull("alpnVersions")?.strings?.map(httpVersion_.fromString);
    String? authorizationPath = json.getStringOrNull("authorizationPath");
    String? clientID = json.getStringOrNull("clientID");
    String? clientSecret = json.getStringOrNull("clientSecret");
    String? clientSecretParameterName = json.getStringOrNull("clientSecretParameterName");
    Integer? connectTimeout = json.getIntegerOrNull("connectTimeout");
    {String*}? crlPaths = json.getArrayOrNull("crlPaths")?.strings;
    Integer? decoderInitialBufferSize = json.getIntegerOrNull("decoderInitialBufferSize");
    String? defaultHost = json.getStringOrNull("defaultHost");
    Integer? defaultPort = json.getIntegerOrNull("defaultPort");
    {String*}? enabledCipherSuites = null /* java.lang.String not handled */;
    {String*}? enabledSecureTransportProtocols = null /* java.lang.String not handled */;
    JsonObject? extraParameters = json.getObjectOrNull("extraParameters");
    Boolean? forceSni = json.getBooleanOrNull("forceSni");
    JsonObject? headers = json.getObjectOrNull("headers");
    Boolean? http2ClearTextUpgrade = json.getBooleanOrNull("http2ClearTextUpgrade");
    Integer? http2ConnectionWindowSize = json.getIntegerOrNull("http2ConnectionWindowSize");
    Integer? http2MaxPoolSize = json.getIntegerOrNull("http2MaxPoolSize");
    Integer? http2MultiplexingLimit = json.getIntegerOrNull("http2MultiplexingLimit");
    Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
    Http2Settings? initialSettings = if (exists tmp = json.getObjectOrNull("initialSettings")) then http2Settings_.fromJson(tmp) else null;
    String? introspectionPath = json.getStringOrNull("introspectionPath");
    JdkSSLEngineOptions? jdkSslEngineOptions = if (exists tmp = json.getObjectOrNull("jdkSslEngineOptions")) then jdkSSLEngineOptions_.fromJson(tmp) else null;
    Boolean? jwtToken = json.getBooleanOrNull("jwtToken");
    Boolean? keepAlive = json.getBooleanOrNull("keepAlive");
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    String? localAddress = json.getStringOrNull("localAddress");
    Boolean? logActivity = json.getBooleanOrNull("logActivity");
    String? logoutPath = json.getStringOrNull("logoutPath");
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
    String? privateKey = json.getStringOrNull("privateKey");
    HttpVersion? protocolVersion = if (exists tmp = json.getStringOrNull("protocolVersion")) then httpVersion_.fromString(tmp) else null;
    ProxyOptions? proxyOptions = if (exists tmp = json.getObjectOrNull("proxyOptions")) then proxyOptions_.fromJson(tmp) else null;
    String? publicKey = json.getStringOrNull("publicKey");
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    String? revocationPath = json.getStringOrNull("revocationPath");
    String? scopeSeparator = json.getStringOrNull("scopeSeparator");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
    Boolean? sendUnmaskedFrames = json.getBooleanOrNull("sendUnmaskedFrames");
    String? site = json.getStringOrNull("site");
    Integer? soLinger = json.getIntegerOrNull("soLinger");
    Boolean? ssl = json.getBooleanOrNull("ssl");
    Boolean? tcpKeepAlive = json.getBooleanOrNull("tcpKeepAlive");
    Boolean? tcpNoDelay = json.getBooleanOrNull("tcpNoDelay");
    String? tokenPath = json.getStringOrNull("tokenPath");
    Integer? trafficClass = json.getIntegerOrNull("trafficClass");
    Boolean? trustAll = json.getBooleanOrNull("trustAll");
    JksOptions? trustStoreOptions = if (exists tmp = json.getObjectOrNull("trustStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Boolean? tryUseCompression = json.getBooleanOrNull("tryUseCompression");
    Boolean? useAlpn = json.getBooleanOrNull("useAlpn");
    Boolean? useBasicAuthorizationHeader = json.getBooleanOrNull("useBasicAuthorizationHeader");
    Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
    String? userAgent = json.getStringOrNull("userAgent");
    String? userInfoPath = json.getStringOrNull("userInfoPath");
    Boolean? verifyHost = json.getBooleanOrNull("verifyHost");
    return OAuth2ClientOptions {
      alpnVersions = alpnVersions;
      authorizationPath = authorizationPath;
      clientID = clientID;
      clientSecret = clientSecret;
      clientSecretParameterName = clientSecretParameterName;
      connectTimeout = connectTimeout;
      crlPaths = crlPaths;
      decoderInitialBufferSize = decoderInitialBufferSize;
      defaultHost = defaultHost;
      defaultPort = defaultPort;
      enabledCipherSuites = enabledCipherSuites;
      enabledSecureTransportProtocols = enabledSecureTransportProtocols;
      extraParameters = extraParameters;
      forceSni = forceSni;
      headers = headers;
      http2ClearTextUpgrade = http2ClearTextUpgrade;
      http2ConnectionWindowSize = http2ConnectionWindowSize;
      http2MaxPoolSize = http2MaxPoolSize;
      http2MultiplexingLimit = http2MultiplexingLimit;
      idleTimeout = idleTimeout;
      initialSettings = initialSettings;
      introspectionPath = introspectionPath;
      jdkSslEngineOptions = jdkSslEngineOptions;
      jwtToken = jwtToken;
      keepAlive = keepAlive;
      keyStoreOptions = keyStoreOptions;
      localAddress = localAddress;
      logActivity = logActivity;
      logoutPath = logoutPath;
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
      privateKey = privateKey;
      protocolVersion = protocolVersion;
      proxyOptions = proxyOptions;
      publicKey = publicKey;
      receiveBufferSize = receiveBufferSize;
      reuseAddress = reuseAddress;
      revocationPath = revocationPath;
      scopeSeparator = scopeSeparator;
      sendBufferSize = sendBufferSize;
      sendUnmaskedFrames = sendUnmaskedFrames;
      site = site;
      soLinger = soLinger;
      ssl = ssl;
      tcpKeepAlive = tcpKeepAlive;
      tcpNoDelay = tcpNoDelay;
      tokenPath = tokenPath;
      trafficClass = trafficClass;
      trustAll = trustAll;
      trustStoreOptions = trustStoreOptions;
      tryUseCompression = tryUseCompression;
      useAlpn = useAlpn;
      useBasicAuthorizationHeader = useBasicAuthorizationHeader;
      usePooledBuffers = usePooledBuffers;
      userAgent = userAgent;
      userInfoPath = userInfoPath;
      verifyHost = verifyHost;
    };
  }

  shared object toCeylon extends Converter<OAuth2ClientOptions_, OAuth2ClientOptions>() {
    shared actual OAuth2ClientOptions convert(OAuth2ClientOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<OAuth2ClientOptions, OAuth2ClientOptions_>() {
    shared actual OAuth2ClientOptions_ convert(OAuth2ClientOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = OAuth2ClientOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(OAuth2ClientOptions obj) => obj.toJson();
}
