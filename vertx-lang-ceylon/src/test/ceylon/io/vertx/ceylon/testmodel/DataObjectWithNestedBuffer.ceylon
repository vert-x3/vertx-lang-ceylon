import io.vertx.ceylon.testmodel {
  DataObjectWithBuffer,
  dataObjectWithBuffer_=dataObjectWithBuffer
}
import io.vertx.codegen.testmodel {
  DataObjectWithNestedBuffer_=DataObjectWithNestedBuffer
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
/* Generated from io.vertx.codegen.testmodel.DataObjectWithNestedBuffer */
" @author <a href=\"mailto:julien@julienviet.com\">Julien Viet</a>\n"
shared class DataObjectWithNestedBuffer(
  shared DataObjectWithBuffer? nested = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists nested) {
      json.put("nested", nested.toJson());
    }
    return json;
  }
}

shared object dataObjectWithNestedBuffer {

  shared DataObjectWithNestedBuffer fromJson(JsonObject json) {
    DataObjectWithBuffer? nested = if (exists tmp = json.getObjectOrNull("nested")) then dataObjectWithBuffer_.fromJson(tmp) else null;
    return DataObjectWithNestedBuffer {
      nested = nested;
    };
  }

  shared object toCeylon extends Converter<DataObjectWithNestedBuffer_, DataObjectWithNestedBuffer>() {
    shared actual DataObjectWithNestedBuffer convert(DataObjectWithNestedBuffer_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DataObjectWithNestedBuffer, DataObjectWithNestedBuffer_>() {
    shared actual DataObjectWithNestedBuffer_ convert(DataObjectWithNestedBuffer src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DataObjectWithNestedBuffer_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DataObjectWithNestedBuffer obj) => obj.toJson();
}
