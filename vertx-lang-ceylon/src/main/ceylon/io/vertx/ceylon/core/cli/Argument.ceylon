import io.vertx.core.cli {
  Argument_=Argument
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
/* Generated from io.vertx.core.cli.Argument */
" Defines a command line argument. Unlike options, argument don't have names and are identified using an index. The\n first index is 0 (because we are in the computer world).\n"
shared class Argument(
  " @return the arg name, <code>null</code> if not defined.\n"
  shared String? argName = null,
  " @return the argument default value, <code>null</code> if not specified.\n"
  shared String? defaultValue = null,
  " @return the description, <code>null</code> if not defined.\n"
  shared String? description = null,
  " @return whether or not the current [Argument](../cli/Argument.type.html) is hidden.\n"
  shared Boolean? hidden = null,
  " @return the argument index.\n"
  shared Integer? index = null,
  " @return whether or not the argument can receive several values.\n"
  shared Boolean? multiValued = null,
  " @return whether or not the current [Argument](../cli/Argument.type.html) is required.\n"
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
