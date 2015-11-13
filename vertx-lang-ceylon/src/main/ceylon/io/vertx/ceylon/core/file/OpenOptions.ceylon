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
import ceylon.collection {
  HashMap
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

  shared OpenOptions fromJson(JsonObject json) {
    Boolean? create = json.getBooleanOrNull("create");
    Boolean? createNew = json.getBooleanOrNull("createNew");
    Boolean? deleteOnClose = json.getBooleanOrNull("deleteOnClose");
    Boolean? dsync = json.getBooleanOrNull("dsync");
    String? perms = json.getStringOrNull("perms");
    Boolean? read = json.getBooleanOrNull("read");
    Boolean? sparse = json.getBooleanOrNull("sparse");
    Boolean? sync = json.getBooleanOrNull("sync");
    Boolean? truncateExisting = json.getBooleanOrNull("truncateExisting");
    Boolean? write = json.getBooleanOrNull("write");
    return OpenOptions {
      create = create;
      createNew = createNew;
      deleteOnClose = deleteOnClose;
      dsync = dsync;
      perms = perms;
      read = read;
      sparse = sparse;
      sync = sync;
      truncateExisting = truncateExisting;
      write = write;
    };
  }

  shared object toJava extends Converter<OpenOptions, OpenOptions_>() {
    shared actual OpenOptions_ convert(OpenOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = OpenOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(OpenOptions obj) => obj.toJson();
}
