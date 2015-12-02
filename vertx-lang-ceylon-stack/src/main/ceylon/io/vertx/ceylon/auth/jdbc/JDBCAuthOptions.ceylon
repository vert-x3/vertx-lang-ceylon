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
import io.vertx.ceylon.auth.common {
  AuthOptions
}
import io.vertx.ext.auth.jdbc {
  JDBCAuthOptions_=JDBCAuthOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.auth.jdbc.JDBCAuthOptions */
" Options configuring JDBC authentication.\n"
shared class JDBCAuthOptions(
  " Set the authentication query to use. Use this if you want to override the default authentication query.\n"
  shared String? authenticationQuery = null,
  " The configuration of the JDBC client: refer to the Vert.x JDBC Client configuration.\n"
  shared JsonObject? config = null,
  " Set the data source name to use, only use in shared mode.\n"
  shared String? datasourceName = null,
  " Set the permissions query to use. Use this if you want to override the default permissions query.\n"
  shared String? permissionsQuery = null,
  " Set the role prefix to distinguish from permissions when checking for isPermitted requests.\n"
  shared String? rolesPrefix = null,
  " Set the roles query to use. Use this if you want to override the default roles query.\n"
  shared String? rolesQuery = null,
  " Set whether the JDBC client is shared or non shared.\n"
  shared Boolean? shared = null) satisfies
  AuthOptions & BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists authenticationQuery) {
      json.put("authenticationQuery", authenticationQuery);
    }
    if (exists config) {
      json.put("config", config);
    }
    if (exists datasourceName) {
      json.put("datasourceName", datasourceName);
    }
    if (exists permissionsQuery) {
      json.put("permissionsQuery", permissionsQuery);
    }
    if (exists rolesPrefix) {
      json.put("rolesPrefix", rolesPrefix);
    }
    if (exists rolesQuery) {
      json.put("rolesQuery", rolesQuery);
    }
    if (exists shared) {
      json.put("shared", shared);
    }
    return json;
  }
}

shared object jdbcAuthOptions {

  shared JDBCAuthOptions fromJson(JsonObject json) {
    String? authenticationQuery = json.getStringOrNull("authenticationQuery");
    JsonObject? config = json.getObjectOrNull("config");
    String? datasourceName = json.getStringOrNull("datasourceName");
    String? permissionsQuery = json.getStringOrNull("permissionsQuery");
    String? rolesPrefix = json.getStringOrNull("rolesPrefix");
    String? rolesQuery = json.getStringOrNull("rolesQuery");
    Boolean? shared = json.getBooleanOrNull("shared");
    return JDBCAuthOptions {
      authenticationQuery = authenticationQuery;
      config = config;
      datasourceName = datasourceName;
      permissionsQuery = permissionsQuery;
      rolesPrefix = rolesPrefix;
      rolesQuery = rolesQuery;
      shared = shared;
    };
  }

  shared object toJava extends Converter<JDBCAuthOptions, JDBCAuthOptions_>() {
    shared actual JDBCAuthOptions_ convert(JDBCAuthOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = JDBCAuthOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(JDBCAuthOptions obj) => obj.toJson();
}
