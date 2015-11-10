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
import io.vertx.core.file {
  OpenOptions_=OpenOptions
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.file.OpenOptions */
shared class OpenOptions(
  shared Boolean? create = null,
  shared Boolean? createNew = null,
  shared Boolean? deleteOnClose = null,
  shared Boolean? dsync = null,
  shared String? perms = null,
  shared Boolean? read = null,
  shared Boolean? sparse = null,
  shared Boolean? sync = null,
  shared Boolean? truncateExisting = null,
  shared Boolean? write = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists create) {
      json.put("create", create);
    }
    if (exists createNew) {
      json.put("createNew", createNew);
    }
    if (exists deleteOnClose) {
      json.put("deleteOnClose", deleteOnClose);
    }
    if (exists dsync) {
      json.put("dsync", dsync);
    }
    if (exists perms) {
      json.put("perms", perms);
    }
    if (exists read) {
      json.put("read", read);
    }
    if (exists sparse) {
      json.put("sparse", sparse);
    }
    if (exists sync) {
      json.put("sync", sync);
    }
    if (exists truncateExisting) {
      json.put("truncateExisting", truncateExisting);
    }
    if (exists write) {
      json.put("write", write);
    }
    return json;
  }
}

shared object openOptions {

  shared object toJava extends Converter<OpenOptions, OpenOptions_>() {
    shared actual OpenOptions_ convert(OpenOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = OpenOptions_(json);
      return ret;
    }
  }
}
