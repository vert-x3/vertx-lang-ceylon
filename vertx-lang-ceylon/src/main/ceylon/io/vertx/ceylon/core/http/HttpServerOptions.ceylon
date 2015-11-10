import io.vertx.ceylon.core.net {
  JksOptions,
  PemKeyCertOptions,
  PemTrustOptions,
  PfxOptions,
  NetServerOptions
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
import io.vertx.core.http {
  HttpServerOptions_=HttpServerOptions
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.http.HttpServerOptions */
shared class HttpServerOptions(
  Integer? acceptBacklog = null,
  Boolean? clientAuthRequired = null,
  shared Boolean? compressionSupported = null,
  {String*}? crlPaths = null,
  {String*}? enabledCipherSuites = null,
  shared Boolean? handle100ContinueAutomatically = null,
  String? host = null,
  Integer? idleTimeout = null,
  JksOptions? keyStoreOptions = null,
  shared Integer? maxWebsocketFrameSize = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  Integer? port = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  JksOptions? trustStoreOptions = null,
  Boolean? usePooledBuffers = null,
  shared String? websocketSubProtocols = null) extends NetServerOptions(
  acceptBacklog,
  clientAuthRequired,
  crlPaths,
  enabledCipherSuites,
  host,
  idleTimeout,
  keyStoreOptions,
  pemKeyCertOptions,
  pemTrustOptions,
  pfxKeyCertOptions,
  pfxTrustOptions,
  port,
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
    if (exists compressionSupported) {
      json.put("compressionSupported", compressionSupported);
    }
    if (exists handle100ContinueAutomatically) {
      json.put("handle100ContinueAutomatically", handle100ContinueAutomatically);
    }
    if (exists maxWebsocketFrameSize) {
      json.put("maxWebsocketFrameSize", maxWebsocketFrameSize);
    }
    if (exists websocketSubProtocols) {
      json.put("websocketSubProtocols", websocketSubProtocols);
    }
    return json;
  }
}

shared object httpServer {

  shared object toJava extends Converter<HttpServerOptions, HttpServerOptions_>() {
    shared actual HttpServerOptions_ convert(HttpServerOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = HttpServerOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(HttpServerOptions obj) => obj.toJson();
}
