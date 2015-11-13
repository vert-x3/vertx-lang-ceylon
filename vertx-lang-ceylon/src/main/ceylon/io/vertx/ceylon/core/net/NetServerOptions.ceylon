import io.vertx.ceylon.core.net {
  JksOptions,
  jksOptions_=jksOptions,
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
shared class NetServerOptions(
  shared Integer? acceptBacklog = null,
  shared ClientAuth? clientAuth = null,
  shared Boolean? clientAuthRequired = null,
  {String*}? crlPaths = null,
  {String*}? enabledCipherSuites = null,
  shared String? host = null,
  Integer? idleTimeout = null,
  JksOptions? keyStoreOptions = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  shared Integer? port = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  JksOptions? trustStoreOptions = null,
  Boolean? usePooledBuffers = null) extends TCPSSLOptions(
  crlPaths,
  enabledCipherSuites,
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
  tcpKeepAlive,
  tcpNoDelay,
  trafficClass,
  trustStoreOptions,
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
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
    return json;
  }
}

shared object netServerOptions {

  shared NetServerOptions fromJson(JsonObject json) {
    Integer? acceptBacklog = json.getIntegerOrNull("acceptBacklog");
    ClientAuth? clientAuth = if (exists tmp = json.getStringOrNull("clientAuth")) then clientAuth_.fromString(tmp) else null;
    Boolean? clientAuthRequired = json.getBooleanOrNull("clientAuthRequired");
    {String*}? crlPaths = json.getArrayOrNull("crlPaths")?.strings;
    {String*}? enabledCipherSuites = json.getArrayOrNull("enabledCipherSuites")?.strings;
    String? host = json.getStringOrNull("host");
    Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    PemKeyCertOptions? pemKeyCertOptions = if (exists tmp = json.getObjectOrNull("pemKeyCertOptions")) then pemKeyCertOptions_.fromJson(tmp) else null;
    PemTrustOptions? pemTrustOptions = if (exists tmp = json.getObjectOrNull("pemTrustOptions")) then pemTrustOptions_.fromJson(tmp) else null;
    PfxOptions? pfxKeyCertOptions = if (exists tmp = json.getObjectOrNull("pfxKeyCertOptions")) then pfxOptions_.fromJson(tmp) else null;
    PfxOptions? pfxTrustOptions = if (exists tmp = json.getObjectOrNull("pfxTrustOptions")) then pfxOptions_.fromJson(tmp) else null;
    Integer? port = json.getIntegerOrNull("port");
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
    return NetServerOptions {
      acceptBacklog = acceptBacklog;
      clientAuth = clientAuth;
      clientAuthRequired = clientAuthRequired;
      crlPaths = crlPaths;
      enabledCipherSuites = enabledCipherSuites;
      host = host;
      idleTimeout = idleTimeout;
      keyStoreOptions = keyStoreOptions;
      pemKeyCertOptions = pemKeyCertOptions;
      pemTrustOptions = pemTrustOptions;
      pfxKeyCertOptions = pfxKeyCertOptions;
      pfxTrustOptions = pfxTrustOptions;
      port = port;
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
