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
  PemKeyCertOptions_=PemKeyCertOptions
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
/* Generated from io.vertx.core.net.PemKeyCertOptions */
" Key store options configuring a list of private key and its certificate based on\n <i>Privacy-enhanced Electronic Email</i> (PEM) files.\n <p>\n\n A key file must contain a <b>non encrypted</b> private key in <b>PKCS8</b> format wrapped in a PEM\n block, for example:\n <p>\n\n <pre>\n -----BEGIN PRIVATE KEY-----\n MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDV6zPk5WqLwS0a\n ...\n K5xBhtm1AhdnZjx5KfW3BecE\n -----END PRIVATE KEY-----\n </pre><p>\n\n Or contain a <b>non encrypted</b> private key in <b>PKCS1</b> format wrapped in a PEM\n block, for example:\n <p>\n\n <pre>\n -----BEGIN RSA PRIVATE KEY-----\n MIIEowIBAAKCAQEAlO4gbHeFb/fmbUF/tOJfNPJumJUEqgzAzx8MBXv9Acyw9IRa\n ...\n zJ14Yd+t2fsLYVs2H0gxaA4DW6neCzgY3eKpSU0EBHUCFSXp/1+/\n -----END RSA PRIVATE KEY-----\n </pre><p>\n\n A certificate file must contain an X.509 certificate wrapped in a PEM block, for example:\n <p>\n\n <pre>\n -----BEGIN CERTIFICATE-----\n MIIDezCCAmOgAwIBAgIEZOI/3TANBgkqhkiG9w0BAQsFADBuMRAwDgYDVQQGEwdV\n ...\n +tmLSvYS39O2nqIzzAUfztkYnUlZmB0l/mKkVqbGJA==\n -----END CERTIFICATE-----\n </pre>\n\n Keys and certificates can either be loaded by Vert.x from the filesystem:\n <p>\n <pre>\n HttpServerOptions options = new HttpServerOptions();\n options.setPemKeyCertOptions(new PemKeyCertOptions().setKeyPath(\"/mykey.pem\").setCertPath(\"/mycert.pem\"));\n </pre>\n\n Or directly provided as a buffer:<p>\n\n <pre>\n Buffer key = vertx.fileSystem().readFileSync(\"/mykey.pem\");\n Buffer cert = vertx.fileSystem().readFileSync(\"/mycert.pem\");\n options.setPemKeyCertOptions(new PemKeyCertOptions().setKeyValue(key).setCertValue(cert));\n </pre>\n\n Several key/certificate pairs can be used:\n <p>\n <pre>\n HttpServerOptions options = new HttpServerOptions();\n options.setPemKeyCertOptions(new PemKeyCertOptions()\n    .addKeyPath(\"/mykey1.pem\").addCertPath(\"/mycert1.pem\")\n    .addKeyPath(\"/mykey2.pem\").addCertPath(\"/mycert2.pem\"));\n </pre>\n"
shared class PemKeyCertOptions(
  " Set the path of the first certificate, replacing the previous certificates paths\n"
  shared String? certPath = null,
  " Set all the paths to the certificates files\n"
  shared {String*}? certPaths = null,
  " Set the path of the first key file, replacing the keys paths\n"
  shared String? keyPath = null,
  " Set all the paths to the keys files\n"
  shared {String*}? keyPaths = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists certPath) {
      json.put("certPath", certPath);
    }
    if (exists certPaths) {
      json.put("certPaths", JsonArray(certPaths));
    }
    if (exists keyPath) {
      json.put("keyPath", keyPath);
    }
    if (exists keyPaths) {
      json.put("keyPaths", JsonArray(keyPaths));
    }
    return json;
  }
}

shared object pemKeyCertOptions {

  shared PemKeyCertOptions fromJson(JsonObject json) {
    String? certPath = json.getStringOrNull("certPath");
    {String*}? certPaths = json.getArrayOrNull("certPaths")?.strings;
    String? keyPath = json.getStringOrNull("keyPath");
    {String*}? keyPaths = json.getArrayOrNull("keyPaths")?.strings;
    return PemKeyCertOptions {
      certPath = certPath;
      certPaths = certPaths;
      keyPath = keyPath;
      keyPaths = keyPaths;
    };
  }

  shared object toCeylon extends Converter<PemKeyCertOptions_, PemKeyCertOptions>() {
    shared actual PemKeyCertOptions convert(PemKeyCertOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
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
