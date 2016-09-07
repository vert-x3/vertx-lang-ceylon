import io.vertx.codegen.testmodel {
  DataObjectWithBuffer_=DataObjectWithBuffer
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
/* Generated from io.vertx.codegen.testmodel.DataObjectWithBuffer */
""
shared class DataObjectWithBuffer() satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    return json;
  }
}

shared object dataObjectWithBuffer {

  shared DataObjectWithBuffer fromJson(JsonObject json) {
    return DataObjectWithBuffer {
    };
  }

  shared object toCeylon extends Converter<DataObjectWithBuffer_, DataObjectWithBuffer>() {
    shared actual DataObjectWithBuffer convert(DataObjectWithBuffer_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DataObjectWithBuffer, DataObjectWithBuffer_>() {
    shared actual DataObjectWithBuffer_ convert(DataObjectWithBuffer src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DataObjectWithBuffer_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DataObjectWithBuffer obj) => obj.toJson();
}
