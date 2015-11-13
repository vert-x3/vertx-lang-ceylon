import io.vertx.ceylon.core.net {
  JksOptions,
  jksOptions_=jksOptions,
  PemKeyCertOptions,
  pemKeyCertOptions_=pemKeyCertOptions,
  PemTrustOptions,
  pemTrustOptions_=pemTrustOptions,
  PfxOptions,
  pfxOptions_=pfxOptions,
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
import io.vertx.core.net {
  NetClientOptions_=NetClientOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.NetClientOptions */
shared class NetClientOptions(
  Integer? connectTimeout = null,
  {String*}? crlPaths = null,
  {String*}? enabledCipherSuites = null,
  Integer? idleTimeout = null,
  JksOptions? keyStoreOptions = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  Integer? receiveBufferSize = null,
  shared Integer? reconnectAttempts = null,
  shared Integer? reconnectInterval = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  Boolean? trustAll = null,
  JksOptions? trustStoreOptions = null,
  Boolean? usePooledBuffers = null) extends ClientOptionsBase(
  connectTimeout,
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
  trustAll,
  trustStoreOptions,
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists reconnectAttempts) {
      json.put("reconnectAttempts", reconnectAttempts);
    }
    if (exists reconnectInterval) {
      json.put("reconnectInterval", reconnectInterval);
    }
    return json;
  }
}

shared object netClientOptions {

  shared NetClientOptions fromJson(JsonObject json) {
    Integer? connectTimeout = json.getIntegerOrNull("connectTimeout");
    {String*}? crlPaths = json.getArrayOrNull("crlPaths")?.strings;
    {String*}? enabledCipherSuites = json.getArrayOrNull("enabledCipherSuites")?.strings;
    Integer? idleTimeout = json.getIntegerOrNull("idleTimeout");
    JksOptions? keyStoreOptions = if (exists tmp = json.getObjectOrNull("keyStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    PemKeyCertOptions? pemKeyCertOptions = if (exists tmp = json.getObjectOrNull("pemKeyCertOptions")) then pemKeyCertOptions_.fromJson(tmp) else null;
    PemTrustOptions? pemTrustOptions = if (exists tmp = json.getObjectOrNull("pemTrustOptions")) then pemTrustOptions_.fromJson(tmp) else null;
    PfxOptions? pfxKeyCertOptions = if (exists tmp = json.getObjectOrNull("pfxKeyCertOptions")) then pfxOptions_.fromJson(tmp) else null;
    PfxOptions? pfxTrustOptions = if (exists tmp = json.getObjectOrNull("pfxTrustOptions")) then pfxOptions_.fromJson(tmp) else null;
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Integer? reconnectAttempts = json.getIntegerOrNull("reconnectAttempts");
    Integer? reconnectInterval = json.getIntegerOrNull("reconnectInterval");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
    Integer? soLinger = json.getIntegerOrNull("soLinger");
    Boolean? ssl = json.getBooleanOrNull("ssl");
    Boolean? tcpKeepAlive = json.getBooleanOrNull("tcpKeepAlive");
    Boolean? tcpNoDelay = json.getBooleanOrNull("tcpNoDelay");
    Integer? trafficClass = json.getIntegerOrNull("trafficClass");
    Boolean? trustAll = json.getBooleanOrNull("trustAll");
    JksOptions? trustStoreOptions = if (exists tmp = json.getObjectOrNull("trustStoreOptions")) then jksOptions_.fromJson(tmp) else null;
    Boolean? usePooledBuffers = json.getBooleanOrNull("usePooledBuffers");
    return NetClientOptions {
      connectTimeout = connectTimeout;
      crlPaths = crlPaths;
      enabledCipherSuites = enabledCipherSuites;
      idleTimeout = idleTimeout;
      keyStoreOptions = keyStoreOptions;
      pemKeyCertOptions = pemKeyCertOptions;
      pemTrustOptions = pemTrustOptions;
      pfxKeyCertOptions = pfxKeyCertOptions;
      pfxTrustOptions = pfxTrustOptions;
      receiveBufferSize = receiveBufferSize;
      reconnectAttempts = reconnectAttempts;
      reconnectInterval = reconnectInterval;
      reuseAddress = reuseAddress;
      sendBufferSize = sendBufferSize;
      soLinger = soLinger;
      ssl = ssl;
      tcpKeepAlive = tcpKeepAlive;
      tcpNoDelay = tcpNoDelay;
      trafficClass = trafficClass;
      trustAll = trustAll;
      trustStoreOptions = trustStoreOptions;
      usePooledBuffers = usePooledBuffers;
    };
  }

  shared object toJava extends Converter<NetClientOptions, NetClientOptions_>() {
    shared actual NetClientOptions_ convert(NetClientOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = NetClientOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(NetClientOptions obj) => obj.toJson();
}
