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
import io.vertx.core.net {
  ClientOptionsBase_=ClientOptionsBase
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.ClientOptionsBase */
" Base class for Client options\n"
shared class ClientOptionsBase(
  " Set the connect timeout\n"
  shared Integer? connectTimeout = null,
  {String*}? crlPaths = null,
  {String*}? enabledCipherSuites = null,
  {String*}? enabledSecureTransportProtocols = null,
  Integer? idleTimeout = null,
  String? idleTimeoutUnit = null,
  JdkSSLEngineOptions? jdkSslEngineOptions = null,
  JksOptions? keyStoreOptions = null,
  " Set the local interface to bind for network connections. When the local address is null,\n it will pick any local address, the default local address is null.\n"
  shared String? localAddress = null,
  Boolean? logActivity = null,
  " Set the metrics name identifying the reported metrics, useful for grouping metrics\n with the same name.\n"
  shared String? metricsName = null,
  OpenSSLEngineOptions? openSslEngineOptions = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  " Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.\n"
  shared ProxyOptions? proxyOptions = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Boolean? reusePort = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpCork = null,
  Boolean? tcpFastOpen = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Boolean? tcpQuickAck = null,
  Integer? trafficClass = null,
  " Set whether all server certificates should be trusted\n"
  shared Boolean? trustAll = null,
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
    if (exists connectTimeout) {
      json.put("connectTimeout", connectTimeout);
    }
    if (exists localAddress) {
      json.put("localAddress", localAddress);
    }
    if (exists metricsName) {
      json.put("metricsName", metricsName);
    }
    if (exists proxyOptions) {
      json.put("proxyOptions", proxyOptions.toJson());
    }
    if (exists trustAll) {
      json.put("trustAll", trustAll);
    }
    return json;
  }
}

shared object clientOptionsBase {

  shared ClientOptionsBase fromJson(JsonObject json) {
    Integer? connectTimeout = json.getIntegerOrNull("connectTimeout");
    {String*}? crlPaths = json.getArrayOrNull("crlPaths")?.strings;
    {String*}? enabledCipherSuites = null /* java.lang.String not handled */;
    {String*}? enabledSecureTransportProtocols = null /* java.lang.String not handled */;
    Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
    String? idleTimeoutUnit = json.getStringOrNull("idleTimeoutUnit");
    JdkSSLEngineOptions? jdkSslEngineOptions = if (exists tmp = json.getObjectOrNull("jdkSslEngineOptions")) then jdkSSLEngineOptions_.fromJson(tmp) else null;
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    String? localAddress = json.getStringOrNull("localAddress");
    Boolean? logActivity = json.getBooleanOrNull("logActivity");
    String? metricsName = json.getStringOrNull("metricsName");
    OpenSSLEngineOptions? openSslEngineOptions = if (exists tmp = json.getObjectOrNull("openSslEngineOptions")) then openSSLEngineOptions_.fromJson(tmp) else null;
    PemKeyCertOptions? pemKeyCertOptions = if (exists tmp = json.getObjectOrNull("pemKeyCertOptions")) then pemKeyCertOptions_.fromJson(tmp) else null;
    PemTrustOptions? pemTrustOptions = if (exists tmp = json.getObjectOrNull("pemTrustOptions")) then pemTrustOptions_.fromJson(tmp) else null;
    PfxOptions? pfxKeyCertOptions = if (exists tmp = json.getObjectOrNull("pfxKeyCertOptions")) then pfxOptions_.fromJson(tmp) else null;
    PfxOptions? pfxTrustOptions = if (exists tmp = json.getObjectOrNull("pfxTrustOptions")) then pfxOptions_.fromJson(tmp) else null;
    ProxyOptions? proxyOptions = if (exists tmp = json.getObjectOrNull("proxyOptions")) then proxyOptions_.fromJson(tmp) else null;
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    Boolean? reusePort = json.getBooleanOrNull("reusePort");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
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
    Boolean? useAlpn = json.getBooleanOrNull("useAlpn");
    Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
    return ClientOptionsBase {
      connectTimeout = connectTimeout;
      crlPaths = crlPaths;
      enabledCipherSuites = enabledCipherSuites;
      enabledSecureTransportProtocols = enabledSecureTransportProtocols;
      idleTimeout = idleTimeout;
      idleTimeoutUnit = idleTimeoutUnit;
      jdkSslEngineOptions = jdkSslEngineOptions;
      keyStoreOptions = keyStoreOptions;
      localAddress = localAddress;
      logActivity = logActivity;
      metricsName = metricsName;
      openSslEngineOptions = openSslEngineOptions;
      pemKeyCertOptions = pemKeyCertOptions;
      pemTrustOptions = pemTrustOptions;
      pfxKeyCertOptions = pfxKeyCertOptions;
      pfxTrustOptions = pfxTrustOptions;
      proxyOptions = proxyOptions;
      receiveBufferSize = receiveBufferSize;
      reuseAddress = reuseAddress;
      reusePort = reusePort;
      sendBufferSize = sendBufferSize;
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
      useAlpn = useAlpn;
      usePooledBuffers = usePooledBuffers;
    };
  }

  shared object toCeylon extends Converter<ClientOptionsBase_, ClientOptionsBase>() {
    shared actual ClientOptionsBase convert(ClientOptionsBase_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }
}
