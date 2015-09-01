import io.vertx.ceylon.core.net {
  JksOptions,
  PemKeyCertOptions,
  PemTrustOptions,
  PfxOptions,
  ClientOptionsBase
}
import ceylon.json {
  JsonObject=Object,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter,
  ToJava
}
import io.vertx.core.http {
  HttpClientOptions_=HttpClientOptions
}
import io.vertx.core.json {
  JsonObject_=JsonObject
}
/* Generated from io.vertx.core.http.HttpClientOptions */
shared class HttpClientOptions(
  Integer? connectTimeout = null,
  String? crlPaths = null,
  shared String? defaultHost = null,
  shared Integer? defaultPort = null,
  String? enabledCipherSuites = null,
  Integer? idleTimeout = null,
  shared Boolean? keepAlive = null,
  JksOptions? keyStoreOptions = null,
  shared Integer? maxPoolSize = null,
  shared Integer? maxWebsocketFrameSize = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  shared Boolean? pipelining = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  Boolean? trustAll = null,
  JksOptions? trustStoreOptions = null,
  shared Boolean? tryUseCompression = null,
  Boolean? usePooledBuffers = null,
  shared Boolean? verifyHost = null) extends ClientOptionsBase(
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
    if (exists defaultHost) {
      json.put("defaultHost", defaultHost);
    }
    if (exists defaultPort) {
      json.put("defaultPort", defaultPort);
    }
    if (exists keepAlive) {
      json.put("keepAlive", keepAlive);
    }
    if (exists maxPoolSize) {
      json.put("maxPoolSize", maxPoolSize);
    }
    if (exists maxWebsocketFrameSize) {
      json.put("maxWebsocketFrameSize", maxWebsocketFrameSize);
    }
    if (exists pipelining) {
      json.put("pipelining", pipelining);
    }
    if (exists tryUseCompression) {
      json.put("tryUseCompression", tryUseCompression);
    }
    if (exists verifyHost) {
      json.put("verifyHost", verifyHost);
    }
    return json;
  }
}

shared object toJavaHttpClientOptions satisfies Converter<HttpClientOptions, HttpClientOptions_> {
  shared actual HttpClientOptions_ convert(HttpClientOptions src) {
    // Todo : make optimized version without json
    value json = JsonObject_(src.toJson().string);
    value ret = HttpClientOptions_(json);
    return ret;
  }
}
