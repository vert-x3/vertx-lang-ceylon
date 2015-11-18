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
" Represents the results of a SQL query.\n <p>\n It contains a list for the column names of the results, and a list of <code>JsonArray</code> - one for each row of the\n results.\n"
shared class ResultSet(
  shared {String*}? columnNames = null,
  shared Integer? numColumns = null,
  shared Integer? numRows = null,
  shared {JsonArray*}? results = null,
  shared {JsonObject*}? rows = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists columnNames) {
      json.put("columnNames", JsonArray(columnNames));
    }
    if (exists numColumns) {
      json.put("numColumns", numColumns);
    }
    if (exists numRows) {
      json.put("numRows", numRows);
    }
    if (exists results) {
      json.put("results", JsonArray(results));
    }
    if (exists rows) {
      json.put("rows", JsonArray(rows));
    }
    return json;
  }
}

shared object resultSet {

  shared ResultSet fromJson(JsonObject json) {
    {String*}? columnNames = json.getArrayOrNull("columnNames")?.strings;
    Integer? numColumns = json.getIntegerOrNull("numColumns");
    Integer? numRows = json.getIntegerOrNull("numRows");
    {JsonArray*}? results = json.getArrayOrNull("results")?.arrays;
    {JsonObject*}? rows = json.getArrayOrNull("rows")?.objects;
    return ResultSet {
      columnNames = columnNames;
      numColumns = numColumns;
      numRows = numRows;
      results = results;
      rows = rows;
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
