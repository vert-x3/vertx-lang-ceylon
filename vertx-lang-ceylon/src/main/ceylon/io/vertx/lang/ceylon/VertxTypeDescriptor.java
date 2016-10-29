package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.runtime.model.RuntimeModuleManager;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.model.typechecker.model.Type;

public class VertxTypeDescriptor extends TypeDescriptor {

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

  public static VertxTypeDescriptor get(TypeDescriptor typeDescriptor) {
    if (typeDescriptor instanceof VertxTypeDescriptor) {
      return (VertxTypeDescriptor) typeDescriptor;
    } else {
      return new VertxTypeDescriptor(typeDescriptor);
    }
  }

  final TypeDescriptor delegate;
  public final Converter toJava;
  public final Converter toCeylon;
  public final java.lang.Class javaClass;

  public VertxTypeDescriptor(TypeDescriptor delegate) {
    this.delegate = delegate;
    this.toJava = io.vertx.lang.ceylon.ToJava.Object;
    this.toCeylon = io.vertx.lang.ceylon.ToCeylon.Object;
    this.javaClass = null;
  }

  public VertxTypeDescriptor(TypeDescriptor delegate, java.lang.Class javaClass, io.vertx.lang.ceylon.Converter toJava, io.vertx.lang.ceylon.ConverterFactory toCeylon) {
    this.delegate = delegate;
    this.toJava = toJava;
    this.toCeylon = toCeylon.converter();
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

  protected void stringTo(StringBuilder sb) {
    // delegate.stringTo(sb);
    // Todo
  }

}
