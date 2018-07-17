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
import io.vertx.core.net {
  PfxOptions_=PfxOptions
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
/* Generated from io.vertx.core.net.PfxOptions */
" Key or trust store options configuring private key and/or certificates based on PKCS#12 files.\n <p>\n When used as a key store, it should point to a store containing a private key and its certificate.\n When used as a trust store, it should point to a store containing a list of accepted certificates.\n <p>\n\n The store can either be loaded by Vert.x from the filesystem:\n <p>\n <pre>\n HttpServerOptions options = new HttpServerOptions();\n options.setPfxKeyCertOptions(new PfxOptions().setPath(\"/mykeystore.p12\").setPassword(\"foo\"));\n </pre>\n\n Or directly provided as a buffer:<p>\n\n <pre>\n Buffer store = vertx.fileSystem().readFileSync(\"/mykeystore.p12\");\n options.setPfxKeyCertOptions(new PfxOptions().setValue(store).setPassword(\"foo\"));\n </pre>\n"
shared class PfxOptions(
  " Set the password\n"
  shared String? password = null,
  " Set the path\n"
  shared String? path = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists password) {
      json.put("password", password);
    }
    if (exists path) {
      json.put("path", path);
    }
    return json;
  }
}

shared object pfxOptions {

  shared PfxOptions fromJson(JsonObject json) {
    String? password = json.getStringOrNull("password");
    String? path = json.getStringOrNull("path");
    return PfxOptions {
      password = password;
      path = path;
    };
  }

  shared object toCeylon extends Converter<PfxOptions_, PfxOptions>() {
    shared actual PfxOptions convert(PfxOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<PfxOptions, PfxOptions_>() {
    shared actual PfxOptions_ convert(PfxOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = PfxOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(PfxOptions obj) => obj.toJson();
}
