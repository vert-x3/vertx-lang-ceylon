package io.vertx.lang.ceylon;

import java.lang.UnsupportedOperationException;

public class ToJava {

  public static <T> T object(Object o) {
    Converter converter = null;
    if (o instanceof ceylon.language.String) {
      converter = String;
    } else if (o instanceof ceylon.language.Boolean) {
      converter = Boolean;
    } else if (o instanceof ceylon.language.Byte) {
      converter = Byte;
    } else if (o instanceof ceylon.language.Character) {
      converter = Character;
    } else if (o instanceof ceylon.language.Integer) {
      converter = Long;
    } else if (o instanceof ceylon.language.Byte) {
      converter = Byte;
    } else if (o instanceof ceylon.language.Float) {
      converter = Double;
    } else if (o instanceof ceylon.json.Object) {
      converter = JsonObject;
    } else if (o instanceof ceylon.json.Array) {
      converter = JsonArray;
    }
    if (converter != null) {
      o = converter.convert(o);
    }
    return (T) o;
  }

  public static <J, C> java.util.List<J> list(
      ceylon.language.List<C> from,
      Converter<C, J> converter) {
    if (from != null) {
      java.util.List<J> to = new java.util.ArrayList<J>(); // Todo: prealocate size
      addAll(from, to, converter);
      return to;
    } else {
      return null;
    }
  }

  public static <J, C> java.util.Set<J> set(
      ceylon.language.Set<C> from,
      Converter<C, J> converter) {
    if (from != null) {
      java.util.Set<J> to = new java.util.HashSet<J>(); // Todo: prealocate size
      addAll(from, to, converter);
      return to;
    } else {
      return null;
    }
  }

  public static <J, C> java.util.Set<J> setOfNullable(
      ceylon.language.Collection<C> from,
      Converter<C, J> converter) {
    if (from != null) {
      java.util.Set<J> to = new java.util.HashSet<J>(); // Todo: prealocate size
      addAll(from, to, converter);
      return to;
    } else {
      return null;
    }
  }

  private static <J, C> void addAll(ceylon.language.Collection<C> from, java.util.Collection<J> to, Converter<C, J> converter) {
    ceylon.language.Iterator<? extends C> iterator = from.iterator();
    while (true) {
      Object next = iterator.next();
      if (next instanceof ceylon.language.Finished) {
        break;
      }
      C elt = (C) next;
      to.add(converter.safeConvert(elt));
    }
  }

  public static <JK, JV, CK, CV> java.util.Map<JK, JV> map(
      ceylon.language.Map<CK, CV> from,
      Converter<CK, JK> keyConverter,
      Converter<CV, JV> valConverter) {
    if (from != null) {
      ceylon.language.Iterator<? extends ceylon.language.Entry<? extends CK, ? extends CV>> iterator = from.iterator();
      java.util.Map<JK, JV> to = new java.util.HashMap<JK, JV>();
      while (true) {
        Object next = iterator.next();
        if (next instanceof ceylon.language.Finished) {
          break;
        }
        ceylon.language.Entry<? extends CK, ? extends CV> entry = (ceylon.language.Entry<? extends CK, ? extends CV>)next;
        JK key = keyConverter.convert(entry.getKey());
        JV val = valConverter.convert(entry.getItem());
        to.put(key, val);
      }
      return to;
    } else {
      return null;
    }
  }

  public static final Converter<ceylon.language.Boolean, java.lang.Boolean> Boolean = new Converter<ceylon.language.Boolean, java.lang.Boolean>() {
    public java.lang.Boolean convert(ceylon.language.Boolean src) {
      return src.booleanValue();
    }
  };

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

  public static final <E extends Enum<E>> Converter<ceylon.language.String, E> enumeration(final Class<E> enumType) {
    return new Converter<ceylon.language.String, E>() {
      public E convert(ceylon.language.String src) {
        return Enum.valueOf(enumType, src.toString());
      }
    };
  }
}