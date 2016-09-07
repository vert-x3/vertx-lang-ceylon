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
  AddressResolverOptions_=AddressResolverOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.dns.AddressResolverOptions */
" Configuration options for Vert.x hostname resolver. The resolver uses the local <i>hosts</i> file and performs\n DNS <i>A</i> and <i>AAAA</i> queries.\n"
shared class AddressResolverOptions(
  " Set the cache maximum TTL value in seconds. After successful resolution IP addresses are cached with their DNS response TTL,\n use this to set a maximum value to all responses TTL.\n"
  shared Integer? cacheMaxTimeToLive = null,
  " Set the cache minimum TTL value in seconds. After resolution successful IP addresses are cached with their DNS response TTL,\n use this to set a minimum value to all responses TTL.\n"
  shared Integer? cacheMinTimeToLive = null,
  " Set the negative cache TTL value in seconds. After a failed hostname resolution, DNS queries won't be retried\n for a period of time equals to the negative TTL. This allows to reduce the response time of negative replies\n and reduce the amount of messages to DNS servers.\n"
  shared Integer? cacheNegativeTimeToLive = null,
  " Set the path of an alternate hosts configuration file to use instead of the one provided by the os.\n <p/>\n The default value is null, so the operating system hosts config is used.\n"
  shared String? hostsPath = null,
  " Set the maximum number of queries when an hostname is resolved.\n"
  shared Integer? maxQueries = null,
  " Set the ndots value used when resolving using search domains, the default value is <code>-1</code> which\n determines the value from the OS on Linux or uses the value <code>1</code>.\n"
  shared Integer? ndots = null,
  " Set to true to enable the automatic inclusion in DNS queries of an optional record that hints\n the remote DNS server about how much data the resolver can read per response.\n"
  shared Boolean? optResourceEnabled = null,
  " Set the query timeout in milliseconds, i.e the amount of time after a query is considered to be failed.\n"
  shared Integer? queryTimeout = null,
  " Set the DNS queries <i>Recursion Desired</i> flag value.\n"
  shared Boolean? rdFlag = null,
  " Set the lists of DNS search domains.\n <p/>\n When the search domain list is null, the effective search domain list will be populated using\n the system DNS search domains.\n"
  shared {String*}? searchDomains = null,
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
    if (exists hostsPath) {
      json.put("hostsPath", hostsPath);
    }
    if (exists maxQueries) {
      json.put("maxQueries", maxQueries);
    }
    if (exists ndots) {
      json.put("ndots", ndots);
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
    if (exists searchDomains) {
      json.put("searchDomains", JsonArray(searchDomains));
    }
    if (exists servers) {
      json.put("servers", JsonArray(servers));
    }
    return json;
  }
}

shared object addressResolverOptions {

  shared AddressResolverOptions fromJson(JsonObject json) {
    Integer? cacheMaxTimeToLive = json.getIntegerOrNull("cacheMaxTimeToLive");
    Integer? cacheMinTimeToLive = json.getIntegerOrNull("cacheMinTimeToLive");
    Integer? cacheNegativeTimeToLive = json.getIntegerOrNull("cacheNegativeTimeToLive");
    String? hostsPath = json.getStringOrNull("hostsPath");
    Integer? maxQueries = json.getIntegerOrNull("maxQueries");
    Integer? ndots = json.getIntegerOrNull("ndots");
    Boolean? optResourceEnabled = json.getBooleanOrNull("optResourceEnabled");
    Integer? queryTimeout = json.getIntegerOrNull("queryTimeout");
    Boolean? rdFlag = json.getBooleanOrNull("rdFlag");
    {String*}? searchDomains = json.getArrayOrNull("searchDomains")?.strings;
    {String*}? servers = json.getArrayOrNull("servers")?.strings;
    return AddressResolverOptions {
      cacheMaxTimeToLive = cacheMaxTimeToLive;
      cacheMinTimeToLive = cacheMinTimeToLive;
      cacheNegativeTimeToLive = cacheNegativeTimeToLive;
      hostsPath = hostsPath;
      maxQueries = maxQueries;
      ndots = ndots;
      optResourceEnabled = optResourceEnabled;
      queryTimeout = queryTimeout;
      rdFlag = rdFlag;
      searchDomains = searchDomains;
      servers = servers;
    };
  }

  shared object toCeylon extends Converter<AddressResolverOptions_, AddressResolverOptions>() {
    shared actual AddressResolverOptions convert(AddressResolverOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<AddressResolverOptions, AddressResolverOptions_>() {
    shared actual AddressResolverOptions_ convert(AddressResolverOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = AddressResolverOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(AddressResolverOptions obj) => obj.toJson();
}
