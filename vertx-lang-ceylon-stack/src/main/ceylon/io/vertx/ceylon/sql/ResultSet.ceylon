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
import io.vertx.ceylon.sql {
  ResultSet,
  resultSet_=resultSet
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
  " Get the next result set\n"
  shared ResultSet? next = null,
  " Return the number of columns in the result set\n"
  shared Integer? numColumns = null,
  " Return the number of rows in the result set\n"
  shared Integer? numRows = null,
  " Get the registered outputs\n"
  shared JsonArray? output = null,
  " Get the results\n"
  shared {JsonArray*}? results = null,
  " Get the rows - each row represented as a JsonObject where the keys are the column names and the values are\n the column values.\n\n Beware that it's legal for a query result in SQL to contain duplicate column names, in which case one will\n overwrite the other if using this method. If that's the case use [getResults](ResultSet.type.html#getResults) instead.\n\n Be aware that column names are defined as returned by the database, this means that even if your SQL statement\n is for example: <pre>SELECT a, b FROM table</pre> the column names are not required to be: <pre>a</pre> and\n <pre>b</pre> and could be in fact <pre>A</pre> and <pre>B</pre>.\n\n For cases when there is the need for case insentivitity you should see [getRows](ResultSet.type.html#getRows)\n"
  shared {JsonObject*}? rows = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists columnNames) {
      json.put("columnNames", JsonArray(columnNames));
    }
    if (exists next) {
      json.put("next", next.toJson());
    }
    if (exists numColumns) {
      json.put("numColumns", numColumns);
    }
    if (exists numRows) {
      json.put("numRows", numRows);
    }
    if (exists output) {
      json.put("output", output);
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
    ResultSet? next = if (exists tmp = json.getObjectOrNull("next")) then this.fromJson(tmp) else null;
    Integer? numColumns = json.getIntegerOrNull("numColumns");
    Integer? numRows = json.getIntegerOrNull("numRows");
    JsonArray? output = json.getArrayOrNull("output");
    {JsonArray*}? results = json.getArrayOrNull("results")?.arrays;
    {JsonObject*}? rows = json.getArrayOrNull("rows")?.objects;
    return ResultSet {
      columnNames = columnNames;
      next = next;
      numColumns = numColumns;
      numRows = numRows;
      output = output;
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
