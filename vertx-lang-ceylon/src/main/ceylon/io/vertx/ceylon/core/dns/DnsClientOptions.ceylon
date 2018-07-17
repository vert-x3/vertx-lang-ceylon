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
import io.vertx.core.dns {
  DnsClientOptions_=DnsClientOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.dns.DnsClientOptions */
" Configuration options for Vert.x DNS client.\n"
shared class DnsClientOptions(
  " Set the host name to be used by this client in requests.\n"
  shared String? host = null,
  " Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.\n"
  shared Boolean? logActivity = null,
  " Set the port to be used by this client in requests.\n"
  shared Integer? port = null,
  " Set the query timeout in milliseconds, i.e the amount of time after a query is considered to be failed.\n"
  shared Integer? queryTimeout = null,
  " Set whether or not recursion is desired\n"
  shared Boolean? recursionDesired = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists host) {
      json.put("host", host);
    }
    if (exists logActivity) {
      json.put("logActivity", logActivity);
    }
    if (exists port) {
      json.put("port", port);
    }
    if (exists queryTimeout) {
      json.put("queryTimeout", queryTimeout);
    }
    if (exists recursionDesired) {
      json.put("recursionDesired", recursionDesired);
    }
    return json;
  }
}

shared object dnsClientOptions {

  shared DnsClientOptions fromJson(JsonObject json) {
    String? host = json.getStringOrNull("host");
    Boolean? logActivity = json.getBooleanOrNull("logActivity");
    Integer? port = json.getIntegerOrNull("port");
    Integer? queryTimeout = json.getIntegerOrNull("queryTimeout");
    Boolean? recursionDesired = json.getBooleanOrNull("recursionDesired");
    return DnsClientOptions {
      host = host;
      logActivity = logActivity;
      port = port;
      queryTimeout = queryTimeout;
      recursionDesired = recursionDesired;
    };
  }

  shared object toCeylon extends Converter<DnsClientOptions_, DnsClientOptions>() {
    shared actual DnsClientOptions convert(DnsClientOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DnsClientOptions, DnsClientOptions_>() {
    shared actual DnsClientOptions_ convert(DnsClientOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DnsClientOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DnsClientOptions obj) => obj.toJson();
}
