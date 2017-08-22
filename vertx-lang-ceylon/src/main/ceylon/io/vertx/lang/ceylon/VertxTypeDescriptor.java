package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.runtime.model.RuntimeModuleManager;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.model.typechecker.model.Type;

public class VertxTypeDescriptor extends TypeDescriptor {

  public static TypeDescriptor nullable(TypeDescriptor typeDescriptor) {
    if (typeDescriptor instanceof VertxTypeDescriptor) {
      VertxTypeDescriptor vertxTypeDescriptor = (VertxTypeDescriptor) typeDescriptor;
      return new VertxTypeDescriptor(
        TypeDescriptor.union(ceylon.language.Null.$TypeDescriptor$, vertxTypeDescriptor.delegate),
        vertxTypeDescriptor.javaClass,
        vertxTypeDescriptor.toJava,
        vertxTypeDescriptor.toCeylon);
    } else {
      return TypeDescriptor.union(ceylon.language.Null.$TypeDescriptor$, typeDescriptor);
    }
  }

  public static java.lang.Class getClass(TypeDescriptor typeDescriptor) {
    java.lang.Class ret = null;
    if (typeDescriptor instanceof VertxTypeDescriptor) {
      ret = ((VertxTypeDescriptor) typeDescriptor).javaClass;
    }
    if (ret == null && typeDescriptor instanceof TypeDescriptor.Class) {
      TypeDescriptor.Class classTypeDescriptor = (TypeDescriptor.Class)typeDescriptor;
      java.lang.Class clazz = classTypeDescriptor.getKlass();
      if (clazz == ceylon.json.Object.class) {
        ret = io.vertx.core.json.JsonObject.class;
      } else if (clazz == ceylon.json.Array.class) {
        ret = io.vertx.core.json.JsonArray.class;
      } else if (clazz == ceylon.language.Byte.class) {
        ret = java.lang.Byte.class;
      } else if (clazz == ceylon.language.Integer.class) {
        ret = java.lang.Long.class;
      } else if (clazz == ceylon.language.Float.class) {
        ret = java.lang.Double.class;
      } else if (clazz == ceylon.language.Boolean.class) {
        ret = java.lang.Boolean.class;
      } else if (clazz == ceylon.language.Character.class) {
        ret = java.lang.Character.class;
      } else if (clazz == ceylon.language.String.class) {
        ret = java.lang.String.class;
      }
    }
    return ret != null ? ret : java.lang.Object.class;
  }

  public static Converter getToJava(TypeDescriptor typeDescriptor) {
    Converter ret = null;
    if (typeDescriptor instanceof VertxTypeDescriptor) {
      ret = ((VertxTypeDescriptor) typeDescriptor).toJava;
    }
    return ret != null ? ret : io.vertx.lang.ceylon.ToJava.Object;
  }

  public static Converter getToCeylon(TypeDescriptor typeDescriptor) {
    Converter ret = null;
    if (typeDescriptor instanceof VertxTypeDescriptor) {
      ret = ((VertxTypeDescriptor) typeDescriptor).toCeylon;
    }
    return ret != null ? ret : io.vertx.lang.ceylon.ToCeylon.Object;
  }

  final TypeDescriptor delegate;
  public final Converter toJava;
  public final Converter toCeylon;
  public final java.lang.Class javaClass;

  public VertxTypeDescriptor(TypeDescriptor delegate, java.lang.Class javaClass, io.vertx.lang.ceylon.Converter toJava, io.vertx.lang.ceylon.ConverterFactory toCeylon) {
    this(delegate, javaClass, toJava, toCeylon.converter());
  }

  public VertxTypeDescriptor(TypeDescriptor delegate, java.lang.Class javaClass, io.vertx.lang.ceylon.Converter toJava, io.vertx.lang.ceylon.Converter toCeylon) {
    this.delegate = delegate;
    this.toJava = toJava;
    this.toCeylon = toCeylon;
    this.javaClass = javaClass;
  }

  public Type toType(RuntimeModuleManager moduleManager) {
    return delegate.toType(moduleManager);
  }

  public java.lang.Class<?> getArrayElementClass() {
    return delegate.getArrayElementClass();
  }

  public boolean containsNull() {
    return delegate.containsNull();
  }

  public boolean equals(Object other) {
    return delegate.equals(other);
  }

  public int hashCode() {
    return delegate.hashCode();
  }

  public boolean isObject() {
    return delegate.isObject();
  }

  public boolean isNull() {
    return delegate.isNull();
  }

  protected void stringTo(StringBuilder sb) {
    // delegate.stringTo(sb);
    // Todo
  }

}
