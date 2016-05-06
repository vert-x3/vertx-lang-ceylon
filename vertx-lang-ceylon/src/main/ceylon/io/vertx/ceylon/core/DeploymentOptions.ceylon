import io.vertx.core {
  DeploymentOptions_=DeploymentOptions
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
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.DeploymentOptions */
" Options for configuring a verticle deployment.\n <p>\n"
shared class DeploymentOptions(
  " Set the JSON configuration that will be passed to the verticle(s) when it's deployed\n"
  shared JsonObject? config = null,
  " Set any extra classpath to be used when deploying the verticle.\n <p>\n Ignored if no isolation group is set.\n"
  shared {String*}? extraClasspath = null,
  " Set whether the verticle(s) will be deployed as HA.\n"
  shared Boolean? ha = null,
  " Set the number of instances that should be deployed.\n"
  shared Integer? instances = null,
  " Set the isolated class names.\n"
  shared {String*}? isolatedClasses = null,
  " Set the isolation group that will be used when deploying the verticle(s)\n"
  shared String? isolationGroup = null,
  " Sets the value of max worker execute time, in ns.\n"
  shared Integer? maxWorkerExecuteTime = null,
  " Set whether the verticle(s) should be deployed as a multi-threaded worker verticle\n"
  shared Boolean? multiThreaded = null,
  " Set whether the verticle(s) should be deployed as a worker verticle\n"
  shared Boolean? worker = null,
  " Set the worker pool name to use for this verticle. When no name is set, the Vert.x\n worker pool will be used, when a name is set, the verticle will use a named worker pool.\n"
  shared String? workerPoolName = null,
  " Set the maximum number of worker threads to be used by the Vert.x instance.\n"
  shared Integer? workerPoolSize = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists config) {
      json.put("config", config);
    }
    if (exists extraClasspath) {
      json.put("extraClasspath", JsonArray(extraClasspath));
    }
    if (exists ha) {
      json.put("ha", ha);
    }
    if (exists instances) {
      json.put("instances", instances);
    }
    if (exists isolatedClasses) {
      json.put("isolatedClasses", JsonArray(isolatedClasses));
    }
    if (exists isolationGroup) {
      json.put("isolationGroup", isolationGroup);
    }
    if (exists maxWorkerExecuteTime) {
      json.put("maxWorkerExecuteTime", maxWorkerExecuteTime);
    }
    if (exists multiThreaded) {
      json.put("multiThreaded", multiThreaded);
    }
    if (exists worker) {
      json.put("worker", worker);
    }
    if (exists workerPoolName) {
      json.put("workerPoolName", workerPoolName);
    }
    if (exists workerPoolSize) {
      json.put("workerPoolSize", workerPoolSize);
    }
    return json;
  }
}

shared object deploymentOptions {

  shared DeploymentOptions fromJson(JsonObject json) {
    JsonObject? config = json.getObjectOrNull("config");
    {String*}? extraClasspath = json.getArrayOrNull("extraClasspath")?.strings;
    Boolean? ha = json.getBooleanOrNull("ha");
    Integer? instances = json.getIntegerOrNull("instances");
    {String*}? isolatedClasses = json.getArrayOrNull("isolatedClasses")?.strings;
    String? isolationGroup = json.getStringOrNull("isolationGroup");
    Integer? maxWorkerExecuteTime = json.getIntegerOrNull("maxWorkerExecuteTime");
    Boolean? multiThreaded = json.getBooleanOrNull("multiThreaded");
    Boolean? worker = json.getBooleanOrNull("worker");
    String? workerPoolName = json.getStringOrNull("workerPoolName");
    Integer? workerPoolSize = json.getIntegerOrNull("workerPoolSize");
    return DeploymentOptions {
      config = config;
      extraClasspath = extraClasspath;
      ha = ha;
      instances = instances;
      isolatedClasses = isolatedClasses;
      isolationGroup = isolationGroup;
      maxWorkerExecuteTime = maxWorkerExecuteTime;
      multiThreaded = multiThreaded;
      worker = worker;
      workerPoolName = workerPoolName;
      workerPoolSize = workerPoolSize;
    };
  }

  shared object toCeylon extends Converter<DeploymentOptions_, DeploymentOptions>() {
    shared actual DeploymentOptions convert(DeploymentOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DeploymentOptions, DeploymentOptions_>() {
    shared actual DeploymentOptions_ convert(DeploymentOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DeploymentOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DeploymentOptions obj) => obj.toJson();
}
