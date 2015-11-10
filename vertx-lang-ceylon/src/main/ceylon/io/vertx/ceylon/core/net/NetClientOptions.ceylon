import io.vertx.ceylon.core.net {
  JksOptions,
  PemKeyCertOptions,
  PemTrustOptions,
  PfxOptions,
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

shared object netClient {

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
