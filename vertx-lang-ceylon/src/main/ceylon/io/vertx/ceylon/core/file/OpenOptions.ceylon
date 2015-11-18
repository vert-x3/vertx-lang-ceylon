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
" Describes how an [AsyncFile](../file/AsyncFile.type.html) should be opened.\n"
shared class OpenOptions(
  " Should the file be created if it does not already exist?\n"
  shared Boolean? create = null,
  " Should the file be created if and the open fail if it already exists?\n"
  shared Boolean? createNew = null,
  " Should the file be deleted when it's closed, or the JVM is shutdown.\n"
  shared Boolean? deleteOnClose = null,
  " If true then every write to the file's content will be written synchronously to the underlying hardware.\n"
  shared Boolean? dsync = null,
  " Get the permissions string to be used if creating a file\n"
  shared String? perms = null,
  " Is the file to opened for reading?\n"
  shared Boolean? read = null,
  " Set whether a hint should be provided that the file to created is sparse\n"
  shared Boolean? sparse = null,
  " If true then every write to the file's content and metadata will be written synchronously to the underlying hardware.\n"
  shared Boolean? sync = null,
  " If the file exists and is opened for writing should the file be truncated to zero length on open?\n"
  shared Boolean? truncateExisting = null,
  " Is the file to opened for writing?\n"
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
