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
  TCPSSLOptions
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
  ClientAuth,
  clientAuth_=clientAuth
}
import io.vertx.core.net {
  NetServerOptions_=NetServerOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.NetServerOptions */
" Options for configuring a [NetServer](../net/NetServer.type.html).\n"
shared class NetServerOptions(
  " Set the accept back log\n"
  shared Integer? acceptBacklog = null,
  " Set whether client auth is required\n"
  shared ClientAuth? clientAuth = null,
  " Set whether client auth is required\n"
  shared Boolean? clientAuthRequired = null,
  {String*}? crlPaths = null,
  {String*}? enabledCipherSuites = null,
  {String*}? enabledSecureTransportProtocols = null,
  " Set the host\n"
  shared String? host = null,
  Integer? idleTimeout = null,
  String? idleTimeoutUnit = null,
  JdkSSLEngineOptions? jdkSslEngineOptions = null,
  JksOptions? keyStoreOptions = null,
  Boolean? logActivity = null,
  OpenSSLEngineOptions? openSslEngineOptions = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  " Set the port\n"
  shared Integer? port = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Boolean? reusePort = null,
  Integer? sendBufferSize = null,
  " Set whether the server supports Server Name Indiciation\n"
  shared Boolean? sni = null,
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
  Boolean? usePooledBuffers = null) extends TCPSSLOptions(
  crlPaths,
  enabledCipherSuites,
  enabledSecureTransportProtocols,
  idleTimeout,
  idleTimeoutUnit,
  jdkSslEngineOptions,
  keyStoreOptions,
  logActivity,
  openSslEngineOptions,
  pemKeyCertOptions,
  pemTrustOptions,
  pfxKeyCertOptions,
  pfxTrustOptions,
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
  trustStoreOptions,
  useAlpn,
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = super.toJson();
    if (exists acceptBacklog) {
      json.put("acceptBacklog", acceptBacklog);
    }
    if (exists clientAuth) {
      json.put("clientAuth", clientAuth_.toString(clientAuth));
    }
    if (exists clientAuthRequired) {
      json.put("clientAuthRequired", clientAuthRequired);
    }
    if (exists host) {
      json.put("host", host);
    }
    if (exists port) {
      json.put("port", port);
    }
    if (exists sni) {
      json.put("sni", sni);
    }
    return json;
  }
}

shared object netServerOptions {

  shared NetServerOptions fromJson(JsonObject json) {
    Integer? acceptBacklog = json.getIntegerOrNull("acceptBacklog");
    ClientAuth? clientAuth = if (exists tmp = json.getStringOrNull("clientAuth")) then clientAuth_.fromString(tmp) else null;
    Boolean? clientAuthRequired = json.getBooleanOrNull("clientAuthRequired");
    {String*}? crlPaths = json.getArrayOrNull("crlPaths")?.strings;
    {String*}? enabledCipherSuites = null /* java.lang.String not handled */;
    {String*}? enabledSecureTransportProtocols = null /* java.lang.String not handled */;
    String? host = json.getStringOrNull("host");
    Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
    String? idleTimeoutUnit = json.getStringOrNull("idleTimeoutUnit");
    JdkSSLEngineOptions? jdkSslEngineOptions = if (exists tmp = json.getObjectOrNull("jdkSslEngineOptions")) then jdkSSLEngineOptions_.fromJson(tmp) else null;
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Boolean? logActivity = json.getBooleanOrNull("logActivity");
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
    return NetServerOptions {
      acceptBacklog = acceptBacklog;
      clientAuth = clientAuth;
      clientAuthRequired = clientAuthRequired;
      crlPaths = crlPaths;
      enabledCipherSuites = enabledCipherSuites;
      enabledSecureTransportProtocols = enabledSecureTransportProtocols;
      host = host;
      idleTimeout = idleTimeout;
      idleTimeoutUnit = idleTimeoutUnit;
      jdkSslEngineOptions = jdkSslEngineOptions;
      keyStoreOptions = keyStoreOptions;
      logActivity = logActivity;
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
    };
  }

  shared object toCeylon extends Converter<NetServerOptions_, NetServerOptions>() {
    shared actual NetServerOptions convert(NetServerOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<NetServerOptions, NetServerOptions_>() {
    shared actual NetServerOptions_ convert(NetServerOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = NetServerOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(NetServerOptions obj) => obj.toJson();
}
