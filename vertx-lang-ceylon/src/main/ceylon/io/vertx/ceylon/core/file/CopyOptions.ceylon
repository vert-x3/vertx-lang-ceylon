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
  CopyOptions_=CopyOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.file.CopyOptions */
" Describes the copy (and move) options.\n"
shared class CopyOptions(
  " Whether move should be performed as an atomic filesystem operation. Defaults to <code>false</code>.\n"
  shared Boolean? atomicMove = null,
  " Whether the file attributes should be copied. Defaults to <code>false</code>.\n"
  shared Boolean? copyAttributes = null,
  " Whether symbolic links should not be followed during copy or move operations. Defaults to <code>false</code>.\n"
  shared Boolean? nofollowLinks = null,
  " Whether an existing file, empty directory, or link should be replaced. Defaults to <code>false</code>.\n"
  shared Boolean? replaceExisting = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists atomicMove) {
      json.put("atomicMove", atomicMove);
    }
    if (exists copyAttributes) {
      json.put("copyAttributes", copyAttributes);
    }
    if (exists nofollowLinks) {
      json.put("nofollowLinks", nofollowLinks);
    }
    if (exists replaceExisting) {
      json.put("replaceExisting", replaceExisting);
    }
    return json;
  }
}

shared object copyOptions {

  shared CopyOptions fromJson(JsonObject json) {
    Boolean? atomicMove = json.getBooleanOrNull("atomicMove");
    Boolean? copyAttributes = json.getBooleanOrNull("copyAttributes");
    Boolean? nofollowLinks = json.getBooleanOrNull("nofollowLinks");
    Boolean? replaceExisting = json.getBooleanOrNull("replaceExisting");
    return CopyOptions {
      atomicMove = atomicMove;
      copyAttributes = copyAttributes;
      nofollowLinks = nofollowLinks;
      replaceExisting = replaceExisting;
    };
  }

  shared object toJava extends Converter<CopyOptions, CopyOptions_>() {
    shared actual CopyOptions_ convert(CopyOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = CopyOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(CopyOptions obj) => obj.toJson();
}
