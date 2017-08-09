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
  " Whether the file should be opened in append mode. Defaults to <code>false</code>.\n"
  shared Boolean? append = null,
  " Set whether the file should be created if it does not already exist.\n"
  shared Boolean? create = null,
  " Set whether the file should be created and fail if it does exist already.\n"
  shared Boolean? createNew = null,
  " Set whether the file should be deleted when it's closed, or the JVM is shutdown.\n"
  shared Boolean? deleteOnClose = null,
  " Set whether every write to the file's content  ill be written synchronously to the underlying hardware.\n"
  shared Boolean? dsync = null,
  " Set the permissions string\n"
  shared String? perms = null,
  " Set whether the file is to be opened for reading\n"
  shared Boolean? read = null,
  " Set whether a hint should be provided that the file to created is sparse\n"
  shared Boolean? sparse = null,
  " Set whether every write to the file's content and meta-data will be written synchronously to the underlying hardware.\n"
  shared Boolean? sync = null,
  " Set whether the file should be truncated to zero length on opening if it exists and is opened for write\n"
  shared Boolean? truncateExisting = null,
  " Set whether the file is to be opened for writing\n"
  shared Boolean? write = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists append) {
      json.put("append", append);
    }
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
    Boolean? append = json.getBooleanOrNull("append");
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
      append = append;
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
