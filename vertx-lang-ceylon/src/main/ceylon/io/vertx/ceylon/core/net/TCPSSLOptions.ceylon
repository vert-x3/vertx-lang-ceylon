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
  NetworkOptions
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
  TCPSSLOptions_=TCPSSLOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.TCPSSLOptions */
" Base class. TCP and SSL related options\n"
shared class TCPSSLOptions(
  " Add a CRL path\n"
  shared {String*}? crlPaths = null,
  " Add an enabled cipher suite, appended to the ordered suites.\n"
  shared {String*}? enabledCipherSuites = null,
  " Add an enabled SSL/TLS protocols, appended to the ordered protocols.\n"
  shared {String*}? enabledSecureTransportProtocols = null,
  " Set the idle timeout, in seconds. zero means don't timeout.\n This determines if a connection will timeout and be closed if no data is received within the timeout.\n"
  shared Integer? idleTimeout = null,
  shared JdkSSLEngineOptions? jdkSslEngineOptions = null,
  " Set the key/cert options in jks format, aka Java keystore.\n"
  shared JksOptions? keyStoreOptions = null,
  Boolean? logActivity = null,
  shared OpenSSLEngineOptions? openSslEngineOptions = null,
  " Set the key/cert store options in pem format.\n"
  shared PemKeyCertOptions? pemKeyCertOptions = null,
  " Set the trust options in pem format\n"
  shared PemTrustOptions? pemTrustOptions = null,
  " Set the key/cert options in pfx format.\n"
  shared PfxOptions? pfxKeyCertOptions = null,
  " Set the trust options in pfx format\n"
  shared PfxOptions? pfxTrustOptions = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Boolean? reusePort = null,
  Integer? sendBufferSize = null,
  " Set whether SO_linger keep alive is enabled\n"
  shared Integer? soLinger = null,
  " Set whether SSL/TLS is enabled\n"
  shared Boolean? ssl = null,
  " Enable the <code>TCP_CORK</code> option - only with linux native transport.\n"
  shared Boolean? tcpCork = null,
  " Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.\n"
  shared Boolean? tcpFastOpen = null,
  " Set whether TCP keep alive is enabled\n"
  shared Boolean? tcpKeepAlive = null,
  " Set whether TCP no delay is enabled\n"
  shared Boolean? tcpNoDelay = null,
  " Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.\n"
  shared Boolean? tcpQuickAck = null,
  Integer? trafficClass = null,
  " Set the trust options in jks format, aka Java truststore\n"
  shared JksOptions? trustStoreOptions = null,
  " Set the ALPN usage.\n"
  shared Boolean? useAlpn = null,
  " Set whether Netty pooled buffers are enabled\n"
  shared Boolean? usePooledBuffers = null) extends NetworkOptions(
  logActivity,
  receiveBufferSize,
  reuseAddress,
  reusePort,
  sendBufferSize,
  trafficClass) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = super.toJson();
    if (exists crlPaths) {
      json.put("crlPaths", JsonArray(crlPaths));
    }
    if (exists enabledCipherSuites) {
      throw Exception("not yet implemented");
    }
    if (exists enabledSecureTransportProtocols) {
      throw Exception("not yet implemented");
    }
    if (exists idleTimeout) {
      json.put("idleTimeout", idleTimeout);
    }
    if (exists jdkSslEngineOptions) {
      json.put("jdkSslEngineOptions", jdkSslEngineOptions.toJson());
    }
    if (exists keyStoreOptions) {
      json.put("keyStoreOptions", keyStoreOptions.toJson());
    }
    if (exists openSslEngineOptions) {
      json.put("openSslEngineOptions", openSslEngineOptions.toJson());
    }
    if (exists pemKeyCertOptions) {
      json.put("pemKeyCertOptions", pemKeyCertOptions.toJson());
    }
    if (exists pemTrustOptions) {
      json.put("pemTrustOptions", pemTrustOptions.toJson());
    }
    if (exists pfxKeyCertOptions) {
      json.put("pfxKeyCertOptions", pfxKeyCertOptions.toJson());
    }
    if (exists pfxTrustOptions) {
      json.put("pfxTrustOptions", pfxTrustOptions.toJson());
    }
    if (exists soLinger) {
      json.put("soLinger", soLinger);
    }
    if (exists ssl) {
      json.put("ssl", ssl);
    }
    if (exists tcpCork) {
      json.put("tcpCork", tcpCork);
    }
    if (exists tcpFastOpen) {
      json.put("tcpFastOpen", tcpFastOpen);
    }
    if (exists tcpKeepAlive) {
      json.put("tcpKeepAlive", tcpKeepAlive);
    }
    if (exists tcpNoDelay) {
      json.put("tcpNoDelay", tcpNoDelay);
    }
    if (exists tcpQuickAck) {
      json.put("tcpQuickAck", tcpQuickAck);
    }
    if (exists trustStoreOptions) {
      json.put("trustStoreOptions", trustStoreOptions.toJson());
    }
    if (exists useAlpn) {
      json.put("useAlpn", useAlpn);
    }
    if (exists usePooledBuffers) {
      json.put("usePooledBuffers", usePooledBuffers);
    }
    return json;
  }
}

shared object tcpsslOptions {

  shared TCPSSLOptions fromJson(JsonObject json) {
    {String*}? crlPaths = json.getArrayOrNull("crlPaths")?.strings;
    {String*}? enabledCipherSuites = null /* java.lang.String not handled */;
    {String*}? enabledSecureTransportProtocols = null /* java.lang.String not handled */;
    Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
    JdkSSLEngineOptions? jdkSslEngineOptions = if (exists tmp = json.getObjectOrNull("jdkSslEngineOptions")) then jdkSSLEngineOptions_.fromJson(tmp) else null;
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Boolean? logActivity = json.getBooleanOrNull("logActivity");
    OpenSSLEngineOptions? openSslEngineOptions = if (exists tmp = json.getObjectOrNull("openSslEngineOptions")) then openSSLEngineOptions_.fromJson(tmp) else null;
    PemKeyCertOptions? pemKeyCertOptions = if (exists tmp = json.getObjectOrNull("pemKeyCertOptions")) then pemKeyCertOptions_.fromJson(tmp) else null;
    PemTrustOptions? pemTrustOptions = if (exists tmp = json.getObjectOrNull("pemTrustOptions")) then pemTrustOptions_.fromJson(tmp) else null;
    PfxOptions? pfxKeyCertOptions = if (exists tmp = json.getObjectOrNull("pfxKeyCertOptions")) then pfxOptions_.fromJson(tmp) else null;
    PfxOptions? pfxTrustOptions = if (exists tmp = json.getObjectOrNull("pfxTrustOptions")) then pfxOptions_.fromJson(tmp) else null;
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
    JksOptions? trustStoreOptions = if (exists tmp = json.getObjectOrNull("trustStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Boolean? useAlpn = json.getBooleanOrNull("useAlpn");
    Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
    return TCPSSLOptions {
      crlPaths = crlPaths;
      enabledCipherSuites = enabledCipherSuites;
      enabledSecureTransportProtocols = enabledSecureTransportProtocols;
      idleTimeout = idleTimeout;
      jdkSslEngineOptions = jdkSslEngineOptions;
      keyStoreOptions = keyStoreOptions;
      logActivity = logActivity;
      openSslEngineOptions = openSslEngineOptions;
      pemKeyCertOptions = pemKeyCertOptions;
      pemTrustOptions = pemTrustOptions;
      pfxKeyCertOptions = pfxKeyCertOptions;
      pfxTrustOptions = pfxTrustOptions;
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
      trustStoreOptions = trustStoreOptions;
      useAlpn = useAlpn;
      usePooledBuffers = usePooledBuffers;
    };
  }

  shared object toCeylon extends Converter<TCPSSLOptions_, TCPSSLOptions>() {
    shared actual TCPSSLOptions convert(TCPSSLOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }
}
