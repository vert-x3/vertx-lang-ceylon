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
  JksOptions_=JksOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.JksOptions */
" Key or trust store options configuring private key and/or certificates based on Java Keystore files.\n <p>\n When used as a key store, it should point to a store containing a private key and its certificate.\n When used as a trust store, it should point to a store containing a list of trusted certificates.\n <p>\n The store can either be loaded by Vert.x from the filesystem:\n <p>\n <pre>\n HttpServerOptions options = HttpServerOptions.httpServerOptions();\n options.setKeyStore(JKSOptions.options().setPath(\"/mykeystore.jks\").setPassword(\"foo\"));\n </pre>\n\n Or directly provided as a buffer:\n <p>\n\n <pre>\n Buffer store = vertx.fileSystem().readFileSync(\"/mykeystore.jks\");\n options.setKeyStore(JKSOptions.options().setValue(store).setPassword(\"foo\"));\n </pre>\n"
shared class JksOptions(
  " Set the password for the key store\n"
  shared String? password = null,
  " Set the path to the key store\n"
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

shared object jksOptions {

  shared JksOptions fromJson(JsonObject json) {
    String? password = json.getStringOrNull("password");
    String? path = json.getStringOrNull("path");
    return JksOptions {
      password = password;
      path = path;
    };
  }

  shared object toJava extends Converter<JksOptions, JksOptions_>() {
    shared actual JksOptions_ convert(JksOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = JksOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(JksOptions obj) => obj.toJson();
}
