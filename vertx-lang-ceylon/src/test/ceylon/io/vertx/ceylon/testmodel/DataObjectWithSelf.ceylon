import io.vertx.ceylon.testmodel {
  DataObjectWithSelf,
  dataObjectWithSelf_=dataObjectWithSelf
}
import io.vertx.codegen.testmodel {
  DataObjectWithSelf_=DataObjectWithSelf
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
/* Generated from io.vertx.codegen.testmodel.DataObjectWithSelf */
""
shared class DataObjectWithSelf(
  shared DataObjectWithSelf? self = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists self) {
      json.put("self", self.toJson());
    }
    return json;
  }
}

shared object dataObjectWithSelf {

  shared DataObjectWithSelf fromJson(JsonObject json) {
    DataObjectWithSelf? self = if (exists tmp = json.getObjectOrNull("self")) then this.fromJson(tmp) else null;
    return DataObjectWithSelf {
      self = self;
    };
  }

  shared object toCeylon extends Converter<DataObjectWithSelf_, DataObjectWithSelf>() {
    shared actual DataObjectWithSelf convert(DataObjectWithSelf_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<DataObjectWithSelf, DataObjectWithSelf_>() {
    shared actual DataObjectWithSelf_ convert(DataObjectWithSelf src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DataObjectWithSelf_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DataObjectWithSelf obj) => obj.toJson();
}
