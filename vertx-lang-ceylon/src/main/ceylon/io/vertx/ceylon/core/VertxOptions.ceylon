import io.vertx.core {
  VertxOptions_=VertxOptions
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
import io.vertx.ceylon.core.metrics {
  MetricsOptions,
  metricsOptions_=metricsOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.VertxOptions */
" Instances of this class are used to configure [Vertx](Vertx.type.html) instances.\n"
shared class VertxOptions(
  " Get the value of blocked thread check period, in ms.\n <p>\n This setting determines how often Vert.x will check whether event loop threads are executing for too long.\n"
  shared Integer? blockedThreadCheckInterval = null,
  " Get the host name to be used for clustering.\n"
  shared String? clusterHost = null,
  " Get the value of cluster ping interval, in ms.\n <p>\n Nodes in the cluster ping each other at this interval to determine whether they are still running.\n"
  shared Integer? clusterPingInterval = null,
  " Get the value of cluster ping reply interval, in ms.\n <p>\n After sending a ping, if a pong is not received in this time, the node will be considered dead.\n"
  shared Integer? clusterPingReplyInterval = null,
  " Get the port to be used for clustering\n"
  shared Integer? clusterPort = null,
  " Get the public facing hostname to be used when clustering.\n"
  shared String? clusterPublicHost = null,
  " Get the public facing port to be used when clustering.\n"
  shared Integer? clusterPublicPort = null,
  " Is the Vert.x instance clustered?\n"
  shared Boolean? clustered = null,
  " Get the number of event loop threads to be used by the Vert.x instance.\n"
  shared Integer? eventLoopPoolSize = null,
  " Will HA be enabled on the Vert.x instance?\n"
  shared Boolean? haEnabled = null,
  " Get the HA group to be used when HA is enabled.\n"
  shared String? haGroup = null,
  " Get the value of internal blocking pool size.\n <p>\n Vert.x maintains a pool for internal blocking operations\n"
  shared Integer? internalBlockingPoolSize = null,
  " Get the value of max event loop execute time, in ns.\n <p>\n Vert.x will automatically log a warning if it detects that event loop threads haven't returned within this time.\n <p>\n This can be used to detect where the user is blocking an event loop thread, contrary to the Golden Rule of the\n holy Event Loop.\n"
  shared Integer? maxEventLoopExecuteTime = null,
  " Get the value of max worker execute time, in ns.\n <p>\n Vert.x will automatically log a warning if it detects that worker threads haven't returned within this time.\n <p>\n This can be used to detect where the user is blocking a worker thread for too long. Although worker threads\n can be blocked longer than event loop threads, they shouldn't be blocked for long periods of time.\n"
  shared Integer? maxWorkerExecuteTime = null,
  " @return the metrics options\n"
  shared MetricsOptions? metricsOptions = null,
  " Get the quorum size to be used when HA is enabled.\n"
  shared Integer? quorumSize = null,
  " Get the threshold value above this, the blocked warning contains a stack trace.\n"
  shared Integer? warningExceptionTime = null,
  " Get the maximum number of worker threads to be used by the Vert.x instance.\n <p>\n Worker threads are used for running blocking code and worker verticles.\n"
  shared Integer? workerPoolSize = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists blockedThreadCheckInterval) {
      json.put("blockedThreadCheckInterval", blockedThreadCheckInterval);
    }
    if (exists clusterHost) {
      json.put("clusterHost", clusterHost);
    }
    if (exists clusterPingInterval) {
      json.put("clusterPingInterval", clusterPingInterval);
    }
    if (exists clusterPingReplyInterval) {
      json.put("clusterPingReplyInterval", clusterPingReplyInterval);
    }
    if (exists clusterPort) {
      json.put("clusterPort", clusterPort);
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
    if (exists eventLoopPoolSize) {
      json.put("eventLoopPoolSize", eventLoopPoolSize);
    }
    if (exists haEnabled) {
      json.put("haEnabled", haEnabled);
    }
    if (exists haGroup) {
      json.put("haGroup", haGroup);
    }
    if (exists internalBlockingPoolSize) {
      json.put("internalBlockingPoolSize", internalBlockingPoolSize);
    }
    if (exists maxEventLoopExecuteTime) {
      json.put("maxEventLoopExecuteTime", maxEventLoopExecuteTime);
    }
    if (exists maxWorkerExecuteTime) {
      json.put("maxWorkerExecuteTime", maxWorkerExecuteTime);
    }
    if (exists metricsOptions) {
      json.put("metricsOptions", metricsOptions.toJson());
    }
    if (exists quorumSize) {
      json.put("quorumSize", quorumSize);
    }
    if (exists warningExceptionTime) {
      json.put("warningExceptionTime", warningExceptionTime);
    }
    if (exists workerPoolSize) {
      json.put("workerPoolSize", workerPoolSize);
    }
    return json;
  }
}

shared object vertxOptions {

  shared VertxOptions fromJson(JsonObject json) {
    Integer? blockedThreadCheckInterval = json.getIntegerOrNull("blockedThreadCheckInterval");
    String? clusterHost = json.getStringOrNull("clusterHost");
    Integer? clusterPingInterval = json.getIntegerOrNull("clusterPingInterval");
    Integer? clusterPingReplyInterval = json.getIntegerOrNull("clusterPingReplyInterval");
    Integer? clusterPort = json.getIntegerOrNull("clusterPort");
    String? clusterPublicHost = json.getStringOrNull("clusterPublicHost");
    Integer? clusterPublicPort = json.getIntegerOrNull("clusterPublicPort");
    Boolean? clustered = json.getBooleanOrNull("clustered");
    Integer? eventLoopPoolSize = json.getIntegerOrNull("eventLoopPoolSize");
    Boolean? haEnabled = json.getBooleanOrNull("haEnabled");
    String? haGroup = json.getStringOrNull("haGroup");
    Integer? internalBlockingPoolSize = json.getIntegerOrNull("internalBlockingPoolSize");
    Integer? maxEventLoopExecuteTime = json.getIntegerOrNull("maxEventLoopExecuteTime");
    Integer? maxWorkerExecuteTime = json.getIntegerOrNull("maxWorkerExecuteTime");
    MetricsOptions? metricsOptions = if (exists tmp = json.getObjectOrNull("metricsOptions")) then metricsOptions_.fromJson(tmp) else null;
    Integer? quorumSize = json.getIntegerOrNull("quorumSize");
    Integer? warningExceptionTime = json.getIntegerOrNull("warningExceptionTime");
    Integer? workerPoolSize = json.getIntegerOrNull("workerPoolSize");
    return VertxOptions {
      blockedThreadCheckInterval = blockedThreadCheckInterval;
      clusterHost = clusterHost;
      clusterPingInterval = clusterPingInterval;
      clusterPingReplyInterval = clusterPingReplyInterval;
      clusterPort = clusterPort;
      clusterPublicHost = clusterPublicHost;
      clusterPublicPort = clusterPublicPort;
      clustered = clustered;
      eventLoopPoolSize = eventLoopPoolSize;
      haEnabled = haEnabled;
      haGroup = haGroup;
      internalBlockingPoolSize = internalBlockingPoolSize;
      maxEventLoopExecuteTime = maxEventLoopExecuteTime;
      maxWorkerExecuteTime = maxWorkerExecuteTime;
      metricsOptions = metricsOptions;
      quorumSize = quorumSize;
      warningExceptionTime = warningExceptionTime;
      workerPoolSize = workerPoolSize;
    };
  }

  shared object toJava extends Converter<VertxOptions, VertxOptions_>() {
    shared actual VertxOptions_ convert(VertxOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = VertxOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(VertxOptions obj) => obj.toJson();
}
