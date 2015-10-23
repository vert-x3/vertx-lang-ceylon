package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;

import java.lang.UnsupportedOperationException;

public class ToCeylon {

  public static final <T> T object(Object o) {
    Converter converter = null;
    if (o instanceof java.lang.String) {
      converter = String;
    } else if (o instanceof java.lang.Boolean) {
      converter = Boolean;
    } else if (o instanceof java.lang.Byte) {
      converter = Byte;
    } else if (o instanceof java.lang.Character) {
      converter = Character;
    } else if (o instanceof java.lang.Long) {
      converter = Long;
    } else if (o instanceof java.lang.Integer) {
      converter = Integer;
    } else if (o instanceof java.lang.Short) {
      converter = Short;
    } else if (o instanceof java.lang.Double) {
      converter = Double;
    } else if (o instanceof java.lang.Float) {
      converter = Float;
    } else if (o instanceof io.vertx.core.json.JsonObject) {
      converter = JsonObject;
    } else if (o instanceof io.vertx.core.json.JsonArray) {
      converter = JsonArray;
    }
    if (converter != null) {
      o = converter.convert(o);
    }
    return (T) o;
  }

  public static <J, C> ceylon.language.List<C> list(
      TypeDescriptor eltTypeDesc,
      java.util.List<J> list,
      Converter<J, C> converter) {
    if (list != null) {
      ceylon.collection.ArrayList<C> ret = new ceylon.collection.ArrayList<C>(eltTypeDesc);
      for (J javaElt : list) {
        C ceylonElt = converter.safeConvert(javaElt);
        ret.add(ceylonElt);
      }
      return ret;
    } else {
      return null;
    }
  }

  public static <J, C> ceylon.language.Set<C> set(
      TypeDescriptor eltTypeDesc,
      java.util.Set<J> set,
      Converter<J, C> converter) {
    if (set != null) {
      ceylon.collection.HashSet<C> ret = new ceylon.collection.HashSet<C>(eltTypeDesc);
      for (J javaElt : set) {
        C ceylonElt = converter.convert(javaElt);
        ret.add(ceylonElt);
      }
      return ret;
    } else {
      return null;
    }
  }

  public static <JK, JV, CK, CV> ceylon.language.Map<CK, CV> map(
      TypeDescriptor keyTypeDesc,
      TypeDescriptor valTypeDesc,
      java.util.Map<JK, JV> from,
      Converter<JK, CK> keyConverter,
      Converter<JV, CV> valConverter) {
    if (from != null) {
      ceylon.collection.HashMap<CK, CV> to = new ceylon.collection.HashMap<CK, CV>(keyTypeDesc, valTypeDesc);
      for (java.util.Map.Entry<JK, JV> javaEntry : from.entrySet()) {
        CK ceylonKey = keyConverter.convert(javaEntry.getKey());
        CV ceylonVal = valConverter.convert(javaEntry.getValue());
        to.put(ceylonKey, ceylonVal);
      }
      return to;
    } else {
      return null;
    }
  }

  public static final Converter<java.lang.Boolean, ceylon.language.Boolean> Boolean = new Converter<java.lang.Boolean, ceylon.language.Boolean>() {
    public ceylon.language.Boolean convert(java.lang.Boolean src) {
      return ceylon.language.Boolean.instance(src);
    }
  };

  public static final Converter<java.lang.Character, ceylon.language.Character> Character = new Converter<java.lang.Character, ceylon.language.Character>() {
    public ceylon.language.Character convert(java.lang.Character src) {
      return new ceylon.language.Character(src);
    }
  };

  public static final Converter<java.lang.String, ceylon.language.String> String = new Converter<java.lang.String, ceylon.language.String>() {
    public ceylon.language.String convert(java.lang.String src) {
      return new ceylon.language.String(src);
    }
  };

  public static final Converter<java.lang.Double, ceylon.language.Float> Double = new Converter<java.lang.Double, ceylon.language.Float>() {
    public ceylon.language.Float convert(java.lang.Double src) {
      return new ceylon.language.Float(src);
    }
  };

  public static final Converter<java.lang.Float, ceylon.language.Float> Float = new Converter<java.lang.Float, ceylon.language.Float>() {
    public ceylon.language.Float convert(java.lang.Float src) {
      return new ceylon.language.Float(src);
    }
  };

  public static final Converter<java.lang.Long, ceylon.language.Integer> Long = new Converter<java.lang.Long, ceylon.language.Integer>() {
    public ceylon.language.Integer convert(java.lang.Long src) {
      return new ceylon.language.Integer(src);
    }
  };

  public static final Converter<java.lang.Short, ceylon.language.Integer> Short = new Converter<java.lang.Short, ceylon.language.Integer>() {
    public ceylon.language.Integer convert(java.lang.Short src) {
      return new ceylon.language.Integer(src);
    }
  };

  public static final Converter<java.lang.Integer, ceylon.language.Integer> Integer = new Converter<java.lang.Integer, ceylon.language.Integer>() {
    public ceylon.language.Integer convert(java.lang.Integer src) {
      return new ceylon.language.Integer(src);
    }
  };

  public static final Converter<java.lang.Byte, ceylon.language.Byte> Byte = new Converter<java.lang.Byte, ceylon.language.Byte>() {
    public ceylon.language.Byte convert(java.lang.Byte src) {
      return new ceylon.language.Byte(src);
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

  public static final Converter<Enum, ceylon.language.String> Enumeration = new Converter<Enum, ceylon.language.String>() {
    public ceylon.language.String convert(Enum src) {
      return new ceylon.language.String(src.name());
    }
  };

  public static <E extends Enum<E>> Converter<E, ceylon.language.String> enumeration() {
    Converter obj = Enumeration;
    return obj;
  }
}