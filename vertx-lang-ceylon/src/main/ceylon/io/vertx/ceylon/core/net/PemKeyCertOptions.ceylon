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
  PemKeyCertOptions_=PemKeyCertOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.PemKeyCertOptions */
" Key store options configuring a private key and its certificate based on\n <i>Privacy-enhanced Electronic Email</i> (PEM) files.\n <p>\n\n The key file must contain a <b>non encrypted</b> private key in <b>PKCS8</b> format wrapped in a PEM\n block, for example:\n <p>\n\n <pre>\n -----BEGIN PRIVATE KEY-----\n MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDV6zPk5WqLwS0a\n ...\n K5xBhtm1AhdnZjx5KfW3BecE\n -----END PRIVATE KEY-----\n </pre><p>\n\n The certificate file must contain an X.509 certificate wrapped in a PEM block, for example:\n <p>\n\n <pre>\n -----BEGIN CERTIFICATE-----\n MIIDezCCAmOgAwIBAgIEZOI/3TANBgkqhkiG9w0BAQsFADBuMRAwDgYDVQQGEwdV\n ...\n +tmLSvYS39O2nqIzzAUfztkYnUlZmB0l/mKkVqbGJA==\n -----END CERTIFICATE-----\n </pre>\n\n The key and certificate can either be loaded by Vert.x from the filesystem:\n <p>\n <pre>\n HttpServerOptions options = new HttpServerOptions();\n options.setPemKeyCertOptions(new PemKeyCertOptions().setKeyPath(\"/mykey.pem\").setCertPath(\"/mycert.pem\"));\n </pre>\n\n Or directly provided as a buffer:<p>\n\n <pre>\n Buffer key = vertx.fileSystem().readFileSync(\"/mykey.pem\");\n Buffer cert = vertx.fileSystem().readFileSync(\"/mycert.pem\");\n options.setPemKeyCertOptions(new PemKeyCertOptions().setKeyValue(key).setCertValue(cert));\n </pre>\n"
shared class PemKeyCertOptions(
  " Set the path to the certificate\n"
  shared String? certPath = null,
  " Set the path to the key file\n"
  shared String? keyPath = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists certPath) {
      json.put("certPath", certPath);
    }
    if (exists keyPath) {
      json.put("keyPath", keyPath);
    }
    return json;
  }
}

shared object pemKeyCertOptions {

  shared PemKeyCertOptions fromJson(JsonObject json) {
    String? certPath = json.getStringOrNull("certPath");
    String? keyPath = json.getStringOrNull("keyPath");
    return PemKeyCertOptions {
      certPath = certPath;
      keyPath = keyPath;
    };
  }

  shared object toJava extends Converter<PemKeyCertOptions, PemKeyCertOptions_>() {
    shared actual PemKeyCertOptions_ convert(PemKeyCertOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = PemKeyCertOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(PemKeyCertOptions obj) => obj.toJson();
}
