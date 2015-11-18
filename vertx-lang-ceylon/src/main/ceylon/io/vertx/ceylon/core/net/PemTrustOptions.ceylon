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
  PemTrustOptions_=PemTrustOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.PemTrustOptions */
" Certificate Authority options configuring certificates based on\n <i>Privacy-enhanced Electronic Email</i> (PEM) files. The options is configured with a list of\n validating certificates.\n <p>\n Validating certificates must contain X.509 certificates wrapped in a PEM block:<p>\n\n <pre>\n -----BEGIN CERTIFICATE-----\n MIIDezCCAmOgAwIBAgIEVmLkwTANBgkqhkiG9w0BAQsFADBuMRAwDgYDVQQGEwdV\n ...\n z5+DuODBJUQst141Jmgq8bS543IU/5apcKQeGNxEyQ==\n -----END CERTIFICATE-----\n </pre>\n\n The certificates can either be loaded by Vert.x from the filesystem:\n <p>\n <pre>\n HttpServerOptions options = new HttpServerOptions();\n options.setPemTrustOptions(new PemTrustOptions().addCertPath(\"/cert.pem\"));\n </pre>\n\n Or directly provided as a buffer:\n <p>\n\n <pre>\n Buffer cert = vertx.fileSystem().readFileSync(\"/cert.pem\");\n HttpServerOptions options = new HttpServerOptions();\n options.setPemTrustOptions(new PemTrustOptions().addCertValue(cert));\n </pre>\n"
shared class PemTrustOptions(
  shared {String*}? certPaths = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists certPaths) {
      json.put("certPaths", JsonArray(certPaths));
    }
    return json;
  }
}

shared object pemTrustOptions {

  shared PemTrustOptions fromJson(JsonObject json) {
    {String*}? certPaths = json.getArrayOrNull("certPaths")?.strings;
    return PemTrustOptions {
      certPaths = certPaths;
    };
  }

  shared object toJava extends Converter<PemTrustOptions, PemTrustOptions_>() {
    shared actual PemTrustOptions_ convert(PemTrustOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = PemTrustOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(PemTrustOptions obj) => obj.toJson();
}
