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
  JksOptions? keyStoreOptions = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  SSLEngine? sslEngine = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
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
  trustStoreOptions,
  useAlpn,
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = super.toJson();
    if (exists connectTimeout) {
      json.put("connectTimeout", connectTimeout);
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
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    PemKeyCertOptions? pemKeyCertOptions = if (exists tmp = json.getObjectOrNull("pemKeyCertOptions")) then pemKeyCertOptions_.fromJson(tmp) else null;
    PemTrustOptions? pemTrustOptions = if (exists tmp = json.getObjectOrNull("pemTrustOptions")) then pemTrustOptions_.fromJson(tmp) else null;
    PfxOptions? pfxKeyCertOptions = if (exists tmp = json.getObjectOrNull("pfxKeyCertOptions")) then pfxOptions_.fromJson(tmp) else null;
    PfxOptions? pfxTrustOptions = if (exists tmp = json.getObjectOrNull("pfxTrustOptions")) then pfxOptions_.fromJson(tmp) else null;
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
    Boolean? useAlpn = json.getBooleanOrNull("useAlpn");
    Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
    return ClientOptionsBase {
      connectTimeout = connectTimeout;
      crlPaths = crlPaths;
      enabledCipherSuites = enabledCipherSuites;
      enabledSecureTransportProtocols = enabledSecureTransportProtocols;
      idleTimeout = idleTimeout;
      keyStoreOptions = keyStoreOptions;
      pemKeyCertOptions = pemKeyCertOptions;
      pemTrustOptions = pemTrustOptions;
      pfxKeyCertOptions = pfxKeyCertOptions;
      pfxTrustOptions = pfxTrustOptions;
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
      useAlpn = useAlpn;
      usePooledBuffers = usePooledBuffers;
    };
  }
}
