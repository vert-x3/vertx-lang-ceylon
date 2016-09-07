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
  " Sets te arg name for this option.\n"
  shared String? argName = null,
  " Sets the list of values accepted by this option. If the value set by the user does not match once of these\n values, a `io.vertx.core.cli.InvalidValueException` exception is thrown.\n"
  shared {String*}? choices = null,
  " Sets the default value of this option\n"
  shared String? defaultValue = null,
  " Sets te description of this option.\n"
  shared String? description = null,
  " Configures the current [Option](../cli/Option.type.html) to be a flag. It will be evaluated to <code>true</code> if it's found in\n the command line. If you need a flag that may receive a value, use, in this order:\n <code><pre>\n   option.setFlag(true).setSingleValued(true)\n </pre></code>\n"
  shared Boolean? flag = null,
  " Sets whether or not this option is a \"help\" option\n"
  shared Boolean? help = null,
  " Sets whether or not this option should be hidden\n"
  shared Boolean? hidden = null,
  " Sets the long name of this option.\n"
  shared String? longName = null,
  " Sets whether or not this option can receive several values.\n"
  shared Boolean? multiValued = null,
  ""
  shared String? name = null,
  " Sets whether or not this option is mandatory.\n"
  shared Boolean? required = null,
  " Sets the short name of this option.\n"
  shared String? shortName = null,
  " Sets whether or not this option can receive a value.\n"
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
