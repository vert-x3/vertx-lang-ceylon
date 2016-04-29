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
  HostnameResolverOptions_=HostnameResolverOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.dns.HostnameResolverOptions */
" Configuration options for Vert.x hostname resolver. The resolver uses the local <i>hosts</i> file and performs\n DNS <i>A</i> and <i>AAAA</i> queries.\n"
shared class HostnameResolverOptions(
  " Set the cache maximum TTL value in seconds. After successful resolution IP addresses are cached with their DNS response TTL,\n use this to set a maximum value to all responses TTL.\n"
  shared Integer? cacheMaxTimeToLive = null,
  " Set the cache minimum TTL value in seconds. After resolution successful IP addresses are cached with their DNS response TTL,\n use this to set a minimum value to all responses TTL.\n"
  shared Integer? cacheMinTimeToLive = null,
  " Set the negative cache TTL value in seconds. After a failed hostname resolution, DNS queries won't be retried\n for a period of time equals to the negative TTL. This allows to reduce the response time of negative replies\n and reduce the amount of messages to DNS servers.\n"
  shared Integer? cacheNegativeTimeToLive = null,
  " Set the maximum number of queries when an hostname is resolved.\n"
  shared Integer? maxQueries = null,
  " Set to true to enable the automatic inclusion in DNS queries of an optional record that hints\n the remote DNS server about how much data the resolver can read per response.\n"
  shared Boolean? optResourceEnabled = null,
  " Set the query timeout in milliseconds, i.e the amount of time after a query is considered to be failed.\n"
  shared Integer? queryTimeout = null,
  " Set the DNS queries <i>Recursion Desired</i> flag value.\n"
  shared Boolean? rdFlag = null,
  " Set the list of DNS server addresses, an address is the IP  of the dns server, followed by an optional\n colon and a port, e.g <code>8.8.8.8</code> or {code 192.168.0.1:40000}. When the list is empty, the resolver\n will use the list of the system DNS server addresses from the environment, if that list cannot be retrieved\n it will use Google's public DNS servers <code>\"8.8.8.8\"</code> and <code>\"8.8.4.4\"</code>.\n"
  shared {String*}? servers = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists cacheMaxTimeToLive) {
      json.put("cacheMaxTimeToLive", cacheMaxTimeToLive);
    }
    if (exists cacheMinTimeToLive) {
      json.put("cacheMinTimeToLive", cacheMinTimeToLive);
    }
    if (exists cacheNegativeTimeToLive) {
      json.put("cacheNegativeTimeToLive", cacheNegativeTimeToLive);
    }
    if (exists maxQueries) {
      json.put("maxQueries", maxQueries);
    }
    if (exists optResourceEnabled) {
      json.put("optResourceEnabled", optResourceEnabled);
    }
    if (exists queryTimeout) {
      json.put("queryTimeout", queryTimeout);
    }
    if (exists rdFlag) {
      json.put("rdFlag", rdFlag);
    }
    if (exists servers) {
      json.put("servers", JsonArray(servers));
    }
    return json;
  }
}

shared object hostnameResolverOptions {

  shared HostnameResolverOptions fromJson(JsonObject json) {
    Integer? cacheMaxTimeToLive = json.getIntegerOrNull("cacheMaxTimeToLive");
    Integer? cacheMinTimeToLive = json.getIntegerOrNull("cacheMinTimeToLive");
    Integer? cacheNegativeTimeToLive = json.getIntegerOrNull("cacheNegativeTimeToLive");
    Integer? maxQueries = json.getIntegerOrNull("maxQueries");
    Boolean? optResourceEnabled = json.getBooleanOrNull("optResourceEnabled");
    Integer? queryTimeout = json.getIntegerOrNull("queryTimeout");
    Boolean? rdFlag = json.getBooleanOrNull("rdFlag");
    {String*}? servers = json.getArrayOrNull("servers")?.strings;
    return HostnameResolverOptions {
      cacheMaxTimeToLive = cacheMaxTimeToLive;
      cacheMinTimeToLive = cacheMinTimeToLive;
      cacheNegativeTimeToLive = cacheNegativeTimeToLive;
      maxQueries = maxQueries;
      optResourceEnabled = optResourceEnabled;
      queryTimeout = queryTimeout;
      rdFlag = rdFlag;
      servers = servers;
    };
  }

  shared object toCeylon extends Converter<HostnameResolverOptions_, HostnameResolverOptions>() {
    shared actual HostnameResolverOptions convert(HostnameResolverOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<HostnameResolverOptions, HostnameResolverOptions_>() {
    shared actual HostnameResolverOptions_ convert(HostnameResolverOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = HostnameResolverOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(HostnameResolverOptions obj) => obj.toJson();
}
