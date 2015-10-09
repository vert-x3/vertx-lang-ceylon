package io.vertx.ceylon.core.shareddata;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@TypeParameters({
  @TypeParameter(value="K",variance=Variance.NONE),
  @TypeParameter(value="V",variance=Variance.NONE)
})
@DocAnnotation$annotation$(description = "todo")
public class LocalMap<K,V> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(LocalMap.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.LocalMap, LocalMap> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.LocalMap, LocalMap>() {
    public LocalMap convert(io.vertx.core.shareddata.LocalMap src) {
      return new LocalMap(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<LocalMap, io.vertx.core.shareddata.LocalMap> TO_JAVA = new io.vertx.lang.ceylon.Converter<LocalMap, io.vertx.core.shareddata.LocalMap>() {
    public io.vertx.core.shareddata.LocalMap convert(LocalMap src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.shareddata.LocalMap delegate;

  public LocalMap(io.vertx.core.shareddata.LocalMap delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("V?")
  public V get(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K key) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    V ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("V?")
  public V put(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K key, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V value) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    V ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.put(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("V")
  public V remove(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K key) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    V ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.remove(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void clear() {
    delegate.clear();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isEmpty() {
    boolean ret = delegate.isEmpty();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("V?")
  public V putIfAbsent(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K key, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V value) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    V ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.putIfAbsent(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean removeIfPresent(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K key, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V value) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    boolean ret = delegate.removeIfPresent(arg_0, arg_1);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean replaceIfPresent(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K key, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V oldValue, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V newValue) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(oldValue);
    java.lang.Object arg_2 = io.vertx.lang.ceylon.ToJava.object(newValue);
    boolean ret = delegate.replaceIfPresent(arg_0, arg_1, arg_2);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("V?")
  public V replace(
    final @TypeInfo("K") @DocAnnotation$annotation$(description = "todo") K key, 
    final @TypeInfo("V") @DocAnnotation$annotation$(description = "todo") V value) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    V ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.replace(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
