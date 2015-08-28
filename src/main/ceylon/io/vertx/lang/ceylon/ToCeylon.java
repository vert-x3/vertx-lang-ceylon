package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;

public class ToCeylon {

  public static <J, C> ceylon.language.List<C> list(
      TypeDescriptor elementTypeDesc,
      java.util.List<J> list,
      Converter<J, C> converter) {
    ceylon.collection.ArrayList<C> ret = new ceylon.collection.ArrayList<C>(elementTypeDesc);
    for (J javaElt : list) {
      C ceylonElt = converter.convert(javaElt);
      ret.add(ceylonElt);
    }
    return ret;
  }

  public static final Converter<java.lang.String, ceylon.language.String> String = new Converter<java.lang.String, ceylon.language.String>() {
    public ceylon.language.String convert(java.lang.String src) {
      return new ceylon.language.String(src);
    }
  };

  public static final Converter<java.lang.Long, ceylon.language.Integer> Long = new Converter<java.lang.Long, ceylon.language.Integer>() {
    public ceylon.language.Integer convert(java.lang.Long src) {
      return new ceylon.language.Integer(src);
    }
  };

  public static final Converter<java.lang.Integer, ceylon.language.Integer> Integer = new Converter<java.lang.Integer, ceylon.language.Integer>() {
    public ceylon.language.Integer convert(java.lang.Integer src) {
      return new ceylon.language.Integer(src);
    }
  };

  public static final Converter<io.vertx.core.json.JsonObject, ceylon.json.Object> JsonObject = new Converter<io.vertx.core.json.JsonObject, ceylon.json.Object>() {
    public ceylon.json.Object convert(io.vertx.core.json.JsonObject src) {
      return (ceylon.json.Object)ceylon.json.parse_.parse(src.toString());
    }
  };

  public static final Converter<io.vertx.core.json.JsonArray, ceylon.json.Array> JsonArray = new Converter<io.vertx.core.json.JsonArray, ceylon.json.Array>() {
    public ceylon.json.Array convert(io.vertx.core.json.JsonArray src) {
      return (ceylon.json.Array)ceylon.json.parse_.parse(src.toString());
    }
  };
}