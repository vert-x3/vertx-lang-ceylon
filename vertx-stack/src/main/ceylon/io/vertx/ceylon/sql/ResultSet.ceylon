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
import io.vertx.ext.sql {
  ResultSet_=ResultSet
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.sql.ResultSet */
shared class ResultSet() satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    return json;
  }
}

shared object resultSet {

  shared ResultSet fromJson(JsonObject json) {
    return ResultSet {
    };
  }

  shared object toCeylon extends Converter<ResultSet_, ResultSet>() {
    shared actual ResultSet convert(ResultSet_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<ResultSet, ResultSet_>() {
    shared actual ResultSet_ convert(ResultSet src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = ResultSet_(json);
      return ret;
    }
  }
  shared JsonObject toJson(ResultSet obj) => obj.toJson();
}
