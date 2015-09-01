import io.vertx.core {
  DeploymentOptions_=DeploymentOptions
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
import io.vertx.core.json {
  JsonObject_=JsonObject
}
/* Generated from io.vertx.core.DeploymentOptions */
shared class DeploymentOptions(
  shared JsonObject? config = null,
  shared String? extraClasspath = null,
  shared Boolean? ha = null,
  shared Integer? instances = null,
  shared String? isolatedClasses = null,
  shared String? isolationGroup = null,
  shared Boolean? multiThreaded = null,
  shared Boolean? worker = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists config) {
      json.put("config", config);
    }
    if (exists extraClasspath) {
      json.put("extraClasspath", extraClasspath);
    }
    if (exists ha) {
      json.put("ha", ha);
    }
    if (exists instances) {
      json.put("instances", instances);
    }
    if (exists isolatedClasses) {
      json.put("isolatedClasses", isolatedClasses);
    }
    if (exists isolationGroup) {
      json.put("isolationGroup", isolationGroup);
    }
    if (exists multiThreaded) {
      json.put("multiThreaded", multiThreaded);
    }
    if (exists worker) {
      json.put("worker", worker);
    }
    return json;
  }
}

shared object toCeylonDeploymentOptions satisfies Converter<DeploymentOptions_, DeploymentOptions> {
  shared actual DeploymentOptions convert(DeploymentOptions_ src) {
    value json = parse(src.toJson().string);
    assert(is JsonObject json);
    JsonObject? config = json.getObjectOrNull("config");
    String? extraClasspath = json.getStringOrNull("extraClasspath");
    Boolean? ha = json.getBooleanOrNull("ha");
    Integer? instances = json.getIntegerOrNull("instances");
    String? isolatedClasses = json.getStringOrNull("isolatedClasses");
    String? isolationGroup = json.getStringOrNull("isolationGroup");
    Boolean? multiThreaded = json.getBooleanOrNull("multiThreaded");
    Boolean? worker = json.getBooleanOrNull("worker");
    return DeploymentOptions {
      config = config;
      extraClasspath = extraClasspath;
      ha = ha;
      instances = instances;
      isolatedClasses = isolatedClasses;
      isolationGroup = isolationGroup;
      multiThreaded = multiThreaded;
      worker = worker;
    };
  }
}

shared object toJavaDeploymentOptions satisfies Converter<DeploymentOptions, DeploymentOptions_> {
  shared actual DeploymentOptions_ convert(DeploymentOptions src) {
    // Todo : make optimized version without json
    value json = JsonObject_(src.toJson().string);
    value ret = DeploymentOptions_(json);
    return ret;
  }
}
