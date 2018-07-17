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
import io.vertx.core.eventbus {
  EventBusOptions_=EventBusOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.eventbus.EventBusOptions */
" Options to configure the event bus.\n"
shared class EventBusOptions(
  " Set the accept back log.\n"
  shared Integer? acceptBacklog = null,
  " Set whether client auth is required\n"
  shared ClientAuth? clientAuth = null,
  " Set the value of cluster ping interval, in ms.\n"
  shared Integer? clusterPingInterval = null,
  " Set the value of cluster ping reply interval, in ms.\n"
  shared Integer? clusterPingReplyInterval = null,
  " Set the public facing hostname to be used for clustering.\n Sometimes, e.g. when running on certain clouds, the local address the server listens on for clustering is\n not the same address that other nodes connect to it at, as the OS / cloud infrastructure does some kind of\n proxying. If this is the case you can specify a public hostname which is different from the hostname the\n server listens at.\n <p>\n The default value is null which means use the same as the cluster hostname.\n"
  shared String? clusterPublicHost = null,
  " See [setClusterPublicHost](../eventbus/EventBusOptions.type.html#setClusterPublicHost) for an explanation.\n"
  shared Integer? clusterPublicPort = null,
  " Sets whether or not the event bus is clustered.\n"
  shared Boolean? clustered = null,
  " Sets the connect timeout\n"
  shared Integer? connectTimeout = null,
  {String*}? crlPaths = null,
  {String*}? enabledCipherSuites = null,
  {String*}? enabledSecureTransportProtocols = null,
  " Sets the host.\n"
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
  " Sets the port.\n"
  shared Integer? port = null,
  Integer? receiveBufferSize = null,
  " Sets the value of reconnect attempts.\n"
  shared Integer? reconnectAttempts = null,
  " Set the reconnect interval.\n"
  shared Integer? reconnectInterval = null,
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
  " Set whether all server certificates should be trusted.\n"
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
    if (exists acceptBacklog) {
      json.put("acceptBacklog", acceptBacklog);
    }
    if (exists clientAuth) {
      json.put("clientAuth", clientAuth_.toString(clientAuth));
    }
    if (exists clusterPingInterval) {
      json.put("clusterPingInterval", clusterPingInterval);
    }
    if (exists clusterPingReplyInterval) {
      json.put("clusterPingReplyInterval", clusterPingReplyInterval);
    }
    if (exists clusterPublicHost) {
      json.put("clusterPublicHost", clusterPublicHost);
    }
    if (exists clusterPublicPort) {
      json.put("clusterPublicPort", clusterPublicPort);
    }
    if (exists clustered) {
      json.put("clustered", clustered);
    }
    if (exists connectTimeout) {
      json.put("connectTimeout", connectTimeout);
    }
    if (exists host) {
      json.put("host", host);
    }
    if (exists port) {
      json.put("port", port);
    }
    if (exists reconnectAttempts) {
      json.put("reconnectAttempts", reconnectAttempts);
    }
    if (exists reconnectInterval) {
      json.put("reconnectInterval", reconnectInterval);
    }
    if (exists trustAll) {
      json.put("trustAll", trustAll);
    }
    return json;
  }
}

shared object eventBusOptions {

  shared EventBusOptions fromJson(JsonObject json) {
    Integer? acceptBacklog = json.getIntegerOrNull("acceptBacklog");
    ClientAuth? clientAuth = if (exists tmp = json.getStringOrNull("clientAuth")) then clientAuth_.fromString(tmp) else null;
    Integer? clusterPingInterval = json.getIntegerOrNull("clusterPingInterval");
    Integer? clusterPingReplyInterval = json.getIntegerOrNull("clusterPingReplyInterval");
    String? clusterPublicHost = json.getStringOrNull("clusterPublicHost");
    Integer? clusterPublicPort = json.getIntegerOrNull("clusterPublicPort");
    Boolean? clustered = json.getBooleanOrNull("clustered");
    Integer? connectTimeout = json.getIntegerOrNull("connectTimeout");
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
    Integer? reconnectAttempts = json.getIntegerOrNull("reconnectAttempts");
    Integer? reconnectInterval = json.getIntegerOrNull("reconnectInterval");
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
    return EventBusOptions {
      acceptBacklog = acceptBacklog;
      clientAuth = clientAuth;
      clusterPingInterval = clusterPingInterval;
      clusterPingReplyInterval = clusterPingReplyInterval;
      clusterPublicHost = clusterPublicHost;
      clusterPublicPort = clusterPublicPort;
      clustered = clustered;
      connectTimeout = connectTimeout;
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
      reconnectAttempts = reconnectAttempts;
      reconnectInterval = reconnectInterval;
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

  shared object toCeylon extends Converter<EventBusOptions_, EventBusOptions>() {
    shared actual EventBusOptions convert(EventBusOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<EventBusOptions, EventBusOptions_>() {
    shared actual EventBusOptions_ convert(EventBusOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = EventBusOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(EventBusOptions obj) => obj.toJson();
}
