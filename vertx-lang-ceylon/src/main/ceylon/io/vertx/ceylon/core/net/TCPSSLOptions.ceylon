import io.vertx.ceylon.core.net {
  JksOptions,
  jksOptions_=jksOptions,
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
shared class TCPSSLOptions(
  shared {String*}? crlPaths = null,
  shared {String*}? enabledCipherSuites = null,
  shared Integer? idleTimeout = null,
  shared JksOptions? keyStoreOptions = null,
  shared PemKeyCertOptions? pemKeyCertOptions = null,
  shared PemTrustOptions? pemTrustOptions = null,
  shared PfxOptions? pfxKeyCertOptions = null,
  shared PfxOptions? pfxTrustOptions = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  shared Integer? soLinger = null,
  shared Boolean? ssl = null,
  shared Boolean? tcpKeepAlive = null,
  shared Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  shared JksOptions? trustStoreOptions = null,
  shared Boolean? usePooledBuffers = null) extends NetworkOptions(
  receiveBufferSize,
  reuseAddress,
  sendBufferSize,
  trafficClass) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists crlPaths) {
      json.put("crlPaths", JsonArray(crlPaths));
    }
    if (exists enabledCipherSuites) {
      json.put("enabledCipherSuites", JsonArray(enabledCipherSuites));
    }
    if (exists idleTimeout) {
      json.put("idleTimeout", idleTimeout);
    }
    if (exists keyStoreOptions) {
      json.put("keyStoreOptions", keyStoreOptions.toJson());
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
    if (exists tcpKeepAlive) {
      json.put("tcpKeepAlive", tcpKeepAlive);
    }
    if (exists tcpNoDelay) {
      json.put("tcpNoDelay", tcpNoDelay);
    }
    if (exists trustStoreOptions) {
      json.put("trustStoreOptions", trustStoreOptions.toJson());
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
    {String*}? enabledCipherSuites = json.getArrayOrNull("enabledCipherSuites")?.strings;
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
    Boolean? tcpKeepAlive = json.getBooleanOrNull("tcpKeepAlive");
    Boolean? tcpNoDelay = json.getBooleanOrNull("tcpNoDelay");
    Integer? trafficClass = json.getIntegerOrNull("trafficClass");
    JksOptions? trustStoreOptions = if (exists tmp = json.getObjectOrNull("trustStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
    return TCPSSLOptions {
      crlPaths = crlPaths;
      enabledCipherSuites = enabledCipherSuites;
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
      tcpKeepAlive = tcpKeepAlive;
      tcpNoDelay = tcpNoDelay;
      trafficClass = trafficClass;
      trustStoreOptions = trustStoreOptions;
      usePooledBuffers = usePooledBuffers;
    };
  }
}
