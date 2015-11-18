import io.vertx.core.cli {
  Option_=Option
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
/* Generated from io.vertx.core.cli.Option */
" Models command line options. Options are values passed to a command line interface using -x or --x. Supported\n syntaxes depend on the parser.\n <p/>\n Short name is generally used with a single dash, while long name requires a double-dash.\n"
shared class Option(
  " @return the option arg name used in usage messages, <code>null</code> if not set.\n"
  shared String? argName = null,
  " @return get the list of choices for the given option. Empty if this option does not define choices.\n"
  shared {String*}? choices = null,
  " @return the default value of this option, <code>null</code> if not set.\n"
  shared String? defaultValue = null,
  " @return the description of this option, <code>null</code> if not set.\n"
  shared String? description = null,
  " @return whether or not this option is a flag.\n"
  shared Boolean? flag = null,
  " Checks whether or not this option is a \"Help\" option.\n"
  shared Boolean? help = null,
  " @return whtehr or not this option is hidden.\n"
  shared Boolean? hidden = null,
  " @return the option long name, <code>null</code> if not set.\n"
  shared String? longName = null,
  " @return whether or not this option can receive several values.\n"
  shared Boolean? multiValued = null,
  " @return the option name. It returns the long name if set, the short name otherwise. It cannot return <code>null</code> for valid option\n"
  shared String? name = null,
  " @return whether or not this option is mandatory.\n"
  shared Boolean? required = null,
  " @return the short name of this option, <code>null</code> if not set.\n"
  shared String? shortName = null,
  " @return whether or not this option is single valued.\n"
  shared Boolean? singleValued = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists argName) {
      json.put("argName", argName);
    }
    if (exists choices) {
      throw Exception("not yet implemented");
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
    if (exists help) {
      json.put("help", help);
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
    if (exists name) {
      json.put("name", name);
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

shared object option {

  shared Option fromJson(JsonObject json) {
    String? argName = json.getStringOrNull("argName");
    {String*}? choices = null /* java.lang.String not handled */;
    String? defaultValue = json.getStringOrNull("defaultValue");
    String? description = json.getStringOrNull("description");
    Boolean? flag = json.getBooleanOrNull("flag");
    Boolean? help = json.getBooleanOrNull("help");
    Boolean? hidden = json.getBooleanOrNull("hidden");
    String? longName = json.getStringOrNull("longName");
    Boolean? multiValued = json.getBooleanOrNull("multiValued");
    String? name = json.getStringOrNull("name");
    Boolean? required = json.getBooleanOrNull("required");
    String? shortName = json.getStringOrNull("shortName");
    Boolean? singleValued = json.getBooleanOrNull("singleValued");
    return Option {
      argName = argName;
      choices = choices;
      defaultValue = defaultValue;
      description = description;
      flag = flag;
      help = help;
      hidden = hidden;
      longName = longName;
      multiValued = multiValued;
      name = name;
      required = required;
      shortName = shortName;
      singleValued = singleValued;
    };
  }

  shared object toCeylon extends Converter<Option_, Option>() {
    shared actual Option convert(Option_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<Option, Option_>() {
    shared actual Option_ convert(Option src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = Option_(json);
      return ret;
    }
  }
  shared JsonObject toJson(Option obj) => obj.toJson();
}
