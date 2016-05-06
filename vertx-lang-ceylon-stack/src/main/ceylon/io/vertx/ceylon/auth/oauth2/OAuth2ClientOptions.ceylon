import io.vertx.ext.auth.oauth2 {
  OAuth2ClientOptions_=OAuth2ClientOptions
}
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
  sslEngine_=sslEngine
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
  String? defaultHost = null,
  Integer? defaultPort = null,
  {String*}? enabledCipherSuites = null,
  {String*}? enabledSecureTransportProtocols = null,
  Boolean? h2cUpgrade = null,
  shared JsonObject? headers = null,
  Integer? idleTimeout = null,
  Http2Settings? initialSettings = null,
  shared Boolean? jwtToken = null,
  Boolean? keepAlive = null,
  JksOptions? keyStoreOptions = null,
  shared String? logoutPath = null,
  Integer? maxChunkSize = null,
  Integer? maxPoolSize = null,
  Integer? maxWaitQueueSize = null,
  Integer? maxWebsocketFrameSize = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  Boolean? pipelining = null,
  HttpVersion? protocolVersion = null,
  String? proxyHost = null,
  String? proxyPassword = null,
  Integer? proxyPort = null,
  String? proxyUsername = null,
  shared String? publicKey = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  shared String? revocationPath = null,
  Integer? sendBufferSize = null,
  shared String? site = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  SSLEngine? sslEngine = null,
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
  defaultHost,
  defaultPort,
  enabledCipherSuites,
  enabledSecureTransportProtocols,
  h2cUpgrade,
  idleTimeout,
  initialSettings,
  keepAlive,
  keyStoreOptions,
  maxChunkSize,
  maxPoolSize,
  maxWaitQueueSize,
  maxWebsocketFrameSize,
  pemKeyCertOptions,
  pemTrustOptions,
  pfxKeyCertOptions,
  pfxTrustOptions,
  pipelining,
  protocolVersion,
  proxyHost,
  proxyPassword,
  proxyPort,
  proxyUsername,
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
    if (exists headers) {
      json.put("headers", headers);
    }
    if (exists jwtToken) {
      json.put("jwtToken", jwtToken);
    }
    if (exists logoutPath) {
      json.put("logoutPath", logoutPath);
    }
    if (exists publicKey) {
      json.put("publicKey", publicKey);
    }
    if (exists revocationPath) {
      json.put("revocationPath", revocationPath);
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
    String? defaultHost = json.getStringOrNull("defaultHost");
    Integer? defaultPort = json.getIntegerOrNull("defaultPort");
    {String*}? enabledCipherSuites = null /* java.lang.String not handled */;
    {String*}? enabledSecureTransportProtocols = null /* java.lang.String not handled */;
    Boolean? h2cUpgrade = json.getBooleanOrNull("h2cUpgrade");
    JsonObject? headers = json.getObjectOrNull("headers");
    Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
    Http2Settings? initialSettings = if (exists tmp = json.getObjectOrNull("initialSettings")) then http2Settings_.fromJson(tmp) else null;
    Boolean? jwtToken = json.getBooleanOrNull("jwtToken");
    Boolean? keepAlive = json.getBooleanOrNull("keepAlive");
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    String? logoutPath = json.getStringOrNull("logoutPath");
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
    String? publicKey = json.getStringOrNull("publicKey");
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    String? revocationPath = json.getStringOrNull("revocationPath");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
    String? site = json.getStringOrNull("site");
    Integer? soLinger = json.getIntegerOrNull("soLinger");
    Boolean? ssl = json.getBooleanOrNull("ssl");
    SSLEngine? sslEngine = if (exists tmp = json.getStringOrNull("sslEngine")) then sslEngine_.fromString(tmp) else null;
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
      defaultHost = defaultHost;
      defaultPort = defaultPort;
      enabledCipherSuites = enabledCipherSuites;
      enabledSecureTransportProtocols = enabledSecureTransportProtocols;
      h2cUpgrade = h2cUpgrade;
      headers = headers;
      idleTimeout = idleTimeout;
      initialSettings = initialSettings;
      jwtToken = jwtToken;
      keepAlive = keepAlive;
      keyStoreOptions = keyStoreOptions;
      logoutPath = logoutPath;
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
      publicKey = publicKey;
      receiveBufferSize = receiveBufferSize;
      reuseAddress = reuseAddress;
      revocationPath = revocationPath;
      sendBufferSize = sendBufferSize;
      site = site;
      soLinger = soLinger;
      ssl = ssl;
      sslEngine = sslEngine;
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
