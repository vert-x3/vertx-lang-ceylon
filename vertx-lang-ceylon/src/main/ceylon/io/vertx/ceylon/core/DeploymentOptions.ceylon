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
  " Set whether the verticle(s) should be deployed as a multi-threaded worker verticle\n"
  shared Boolean? multiThreaded = null,
  " Set whether the verticle(s) should be deployed as a worker verticle\n"
  shared Boolean? worker = null) satisfies BaseDataObject {
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
    if (exists multiThreaded) {
      json.put("multiThreaded", multiThreaded);
    }
    if (exists worker) {
      json.put("worker", worker);
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
