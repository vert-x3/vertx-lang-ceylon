import io.vertx.codegen.testmodel {
  DataObjectWithOnlyJsonObjectConstructor_=DataObjectWithOnlyJsonObjectConstructor
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
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.codegen.testmodel.DataObjectWithOnlyJsonObjectConstructor */
""
shared class DataObjectWithOnlyJsonObjectConstructor(
  shared String? foo = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists foo) {
      json.put("foo", foo);
    }
    return json;
  }
}

shared object dataObjectWithOnlyJsonObjectConstructor {

  shared DataObjectWithOnlyJsonObjectConstructor fromJson(JsonObject json) {
    String? foo = json.getStringOrNull("foo");
    return DataObjectWithOnlyJsonObjectConstructor {
      foo = foo;
    };
  }

  shared object toCeylon extends Converter<DataObjectWithOnlyJsonObjectConstructor_, DataObjectWithOnlyJsonObjectConstructor>() {
    shared actual DataObjectWithOnlyJsonObjectConstructor convert(DataObjectWithOnlyJsonObjectConstructor_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DataObjectWithOnlyJsonObjectConstructor, DataObjectWithOnlyJsonObjectConstructor_>() {
    shared actual DataObjectWithOnlyJsonObjectConstructor_ convert(DataObjectWithOnlyJsonObjectConstructor src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DataObjectWithOnlyJsonObjectConstructor_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DataObjectWithOnlyJsonObjectConstructor obj) => obj.toJson();
}
