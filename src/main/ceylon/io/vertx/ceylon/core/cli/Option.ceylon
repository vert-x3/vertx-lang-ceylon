import io.vertx.core.cli {
  Option_=Option
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
/* Generated from io.vertx.core.cli.Option */
shared class Option(
  shared String? argName = null,
  shared String? defaultValue = null,
  shared String? description = null,
  shared Boolean? flag = null,
  shared Boolean? hidden = null,
  shared String? longName = null,
  shared Boolean? multiValued = null,
  shared Boolean? required = null,
  shared String? shortName = null,
  shared Boolean? singleValued = null) satisfies BaseDataObject {
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
    if (exists flag) {
      json.put("flag", flag);
    }
    if (exists hidden) {
      json.put("hidden", hidden);
    }
    if (exists longName) {
      json.put("longName", longName);
    }
    if (exists multiValued) {
      json.put("multiValued", multiValued);
    }
    if (exists required) {
      json.put("required", required);
    }
    if (exists shortName) {
      json.put("shortName", shortName);
    }
    if (exists singleValued) {
      json.put("singleValued", singleValued);
    }
    return json;
  }
}

shared object toCeylonOption satisfies Converter<Option_, Option> {
  shared actual Option convert(Option_ src) {
    value json = parse(src.toJson().string);
    assert(is JsonObject json);
    String? argName = json.getStringOrNull("argName");
    String? defaultValue = json.getStringOrNull("defaultValue");
    String? description = json.getStringOrNull("description");
    Boolean? flag = json.getBooleanOrNull("flag");
    Boolean? hidden = json.getBooleanOrNull("hidden");
    String? longName = json.getStringOrNull("longName");
    Boolean? multiValued = json.getBooleanOrNull("multiValued");
    Boolean? required = json.getBooleanOrNull("required");
    String? shortName = json.getStringOrNull("shortName");
    Boolean? singleValued = json.getBooleanOrNull("singleValued");
    return Option {
      argName = argName;
      defaultValue = defaultValue;
      description = description;
      flag = flag;
      hidden = hidden;
      longName = longName;
      multiValued = multiValued;
      required = required;
      shortName = shortName;
      singleValued = singleValued;
    };
  }
}

shared object toJavaOption satisfies Converter<Option, Option_> {
  shared actual Option_ convert(Option src) {
    // Todo : make optimized version without json
    value json = JsonObject_(src.toJson().string);
    value ret = Option_(json);
    return ret;
  }
}
