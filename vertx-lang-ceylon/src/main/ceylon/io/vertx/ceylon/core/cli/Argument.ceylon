import io.vertx.core.cli {
  Argument_=Argument
}
import ceylon.time.iso8601 {
  parseZoneDateTime
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
import ceylon.time {
  Instant
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.cli.Argument */
" Defines a command line argument. Unlike options, argument don't have names and are identified using an index. The\n first index is 0 (because we are in the computer world).\n"
shared class Argument(
  " Sets the argument name of this [Argument](../cli/Argument.type.html).\n"
  shared String? argName = null,
  " Sets the default value of this [Argument](../cli/Argument.type.html).\n"
  shared String? defaultValue = null,
  " Sets the description of the [Argument](../cli/Argument.type.html).\n"
  shared String? description = null,
  " Sets whether or not the current [Argument](../cli/Argument.type.html) is hidden.\n"
  shared Boolean? hidden = null,
  " Sets the argument index.\n"
  shared Integer? index = null,
  " Sets whether or not the argument can receive several values. Only the last argument can receive several values.\n"
  shared Boolean? multiValued = null,
  " Sets whether or not the current [Argument](../cli/Argument.type.html) is required.\n"
  shared Boolean? required = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists argName) {
      json.put("argName", argName);
    }
    if (exists defaultValue) {
      json.put("defaultValue", defaultValue);
    }
    if (exists description) {
      json.put("description", description);
    }
    if (exists hidden) {
      json.put("hidden", hidden);
    }
    if (exists index) {
      json.put("index", index);
    }
    if (exists multiValued) {
      json.put("multiValued", multiValued);
    }
    if (exists required) {
      json.put("required", required);
    }
    return json;
  }
}

shared object argument {

  shared Argument fromJson(JsonObject json) {
    String? argName = json.getStringOrNull("argName");
    String? defaultValue = json.getStringOrNull("defaultValue");
    String? description = json.getStringOrNull("description");
    Boolean? hidden = json.getBooleanOrNull("hidden");
    Integer? index = json.getIntegerOrNull("index");
    Boolean? multiValued = json.getBooleanOrNull("multiValued");
    Boolean? required = json.getBooleanOrNull("required");
    return Argument {
      argName = argName;
      defaultValue = defaultValue;
      description = description;
      hidden = hidden;
      index = index;
      multiValued = multiValued;
      required = required;
    };
  }

  shared object toCeylon extends Converter<Argument_, Argument>() {
    shared actual Argument convert(Argument_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<Argument, Argument_>() {
    shared actual Argument_ convert(Argument src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = Argument_(json);
      return ret;
    }
  }
  shared JsonObject toJson(Argument obj) => obj.toJson();
}
