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
  " Get the column names\n"
  shared {String*}? columnNames = null,
  " Return the number of columns in the result set\n"
  shared Integer? numColumns = null,
  " Return the number of rows in the result set\n"
  shared Integer? numRows = null,
  " Get the results\n"
  shared {JsonArray*}? results = null,
  " Get the rows - each row represented as a JsonObject where the keys are the column names and the values are\n the column values.\n <p>\n Beware that it's legal for a query result in SQL to contain duplicate column names, in which case one will\n overwrite the other if using this method. If that's the case use [getResults](ResultSet.type.html#getResults) instead.\n"
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
