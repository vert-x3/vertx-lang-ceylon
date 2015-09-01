package io.vertx.lang.ceylon;

public class ToJava {

  public static <J, C> java.util.List<J> list(
      ceylon.language.List<C> from,
      Converter<C, J> converter) {
    java.util.List<J> to = new java.util.ArrayList<J>(); // Todo: prealocate size
    addAll(from, to, converter);
    return to;
  }

  public static <J, C> java.util.Set<J> set(
      ceylon.language.Set<C> from,
      Converter<C, J> converter) {
    java.util.Set<J> to = new java.util.HashSet<J>(); // Todo: prealocate size
    addAll(from, to, converter);
    return to;
  }

  private static <J, C> void addAll(ceylon.language.Collection<C> from, java.util.Collection<J> to, Converter<C, J> converter) {
    ceylon.language.Iterator<? extends C> iterator = from.iterator();
    while (true) {
      Object next = iterator.next();
      if (next instanceof ceylon.language.Finished) {
        break;
      }
      C elt = (C) next;
      to.add(converter.convert(elt));
    }
  }

  public static final Converter<ceylon.language.String, java.lang.String> String = new Converter<ceylon.language.String, java.lang.String>() {
    public java.lang.String convert(ceylon.language.String src) {
      return src.toString();
    }
  };

  public static final Converter<ceylon.language.Byte, java.lang.Byte> Byte = new Converter<ceylon.language.Byte, java.lang.Byte>() {
    public java.lang.Byte convert(ceylon.language.Byte src) {
      return src.byteValue();
    }
  };

  public static final Converter<ceylon.language.Integer, java.lang.Short> Short = new Converter<ceylon.language.Integer, java.lang.Short>() {
    public java.lang.Short convert(ceylon.language.Integer src) {
      return (short)src.longValue();
    }
  };

  public static final Converter<ceylon.language.Integer, java.lang.Integer> Integer = new Converter<ceylon.language.Integer, java.lang.Integer>() {
    public java.lang.Integer convert(ceylon.language.Integer src) {
      return (int)src.longValue();
    }
  };

  public static final Converter<ceylon.language.Integer, java.lang.Long> Long = new Converter<ceylon.language.Integer, java.lang.Long>() {
    public java.lang.Long convert(ceylon.language.Integer src) {
      return src.longValue();
    }
  };

  public static final Converter<ceylon.language.Float, java.lang.Float> Float = new Converter<ceylon.language.Float, java.lang.Float>() {
    public java.lang.Float convert(ceylon.language.Float src) {
      return (float)src.doubleValue();
    }
  };

  public static final Converter<ceylon.language.Float, java.lang.Double> Double = new Converter<ceylon.language.Float, java.lang.Double>() {
    public java.lang.Double convert(ceylon.language.Float src) {
      return src.doubleValue();
    }
  };

  public static final Converter<ceylon.language.Character, java.lang.Character> Character = new Converter<ceylon.language.Character, java.lang.Character>() {
    public java.lang.Character convert(ceylon.language.Character src) {
      return (char)src.intValue();
    }
  };

  public static final Converter<ceylon.json.Object, io.vertx.core.json.JsonObject> JsonObject = new Converter<ceylon.json.Object, io.vertx.core.json.JsonObject>() {
    public io.vertx.core.json.JsonObject convert(ceylon.json.Object src) {
      return new io.vertx.core.json.JsonObject(src.toString());
    }
  };

  public static final Converter<ceylon.json.Array, io.vertx.core.json.JsonArray> JsonArray = new Converter<ceylon.json.Array, io.vertx.core.json.JsonArray>() {
    public io.vertx.core.json.JsonArray convert(ceylon.json.Array src) {
      return new io.vertx.core.json.JsonArray(src.toString());
    }
  };
}