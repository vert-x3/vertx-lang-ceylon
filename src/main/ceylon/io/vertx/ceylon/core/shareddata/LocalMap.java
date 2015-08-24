package io.vertx.ceylon.core.shareddata;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

@TypeParameters({
  @TypeParameter(value="K",variance=Variance.NONE),
  @TypeParameter(value="V",variance=Variance.NONE)
})
public class LocalMap<K,V> {

  private final io.vertx.core.shareddata.LocalMap delegate;

  public LocalMap(io.vertx.core.shareddata.LocalMap delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("V")
  public V get(
    final @TypeInfo("K") K key) {
    java.lang.Object arg_0 = null;
    V ret = null;
    return ret;
  }

  @TypeInfo("V")
  public V put(
    final @TypeInfo("K") K key, 
    final @TypeInfo("V") V value) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    V ret = null;
    return ret;
  }

  @TypeInfo("V")
  public V remove(
    final @TypeInfo("K") K key) {
    java.lang.Object arg_0 = null;
    V ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void clear() {
    delegate.clear();
  }

  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isEmpty() {
    boolean ret = delegate.isEmpty();
    return ret;
  }

  @TypeInfo("V")
  public V putIfAbsent(
    final @TypeInfo("K") K key, 
    final @TypeInfo("V") V value) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    V ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean removeIfPresent(
    final @TypeInfo("K") K key, 
    final @TypeInfo("V") V value) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    boolean ret = delegate.removeIfPresent(arg_0, arg_1);
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean replaceIfPresent(
    final @TypeInfo("K") K key, 
    final @TypeInfo("V") V oldValue, 
    final @TypeInfo("V") V newValue) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    java.lang.Object arg_2 = null;
    boolean ret = delegate.replaceIfPresent(arg_0, arg_1, arg_2);
    return ret;
  }

  @TypeInfo("V")
  public V replace(
    final @TypeInfo("K") K key, 
    final @TypeInfo("V") V value) {
    java.lang.Object arg_0 = null;
    java.lang.Object arg_1 = null;
    V ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
