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
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.cli.Argument */
shared class Argument(
  shared String? argName = null,
  shared String? defaultValue = null,
  shared String? description = null,
  shared Boolean? hidden = null,
  shared Integer? index = null,
  shared Boolean? multiValued = null,
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

  shared object toCeylon extends Converter<Argument_, Argument>() {
    shared actual Argument convert(Argument_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
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
  }

  shared object toJava extends Converter<Argument, Argument_>() {
    shared actual Argument_ convert(Argument src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = Argument_(json);
      return ret;
    }
  }
}
