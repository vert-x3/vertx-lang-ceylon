package io.vertx.ceylon.core.shareddata;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@TypeParameters({
  @TypeParameter(value="K",variance=Variance.NONE),
  @TypeParameter(value="V",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Local maps can be used to share data safely in a single Vert.x instance.\n <p>\n The map only allows immutable keys and values in the map, OR certain mutable objects such as [Buffer](../buffer/Buffer.type.html)\n instances which will be copied when they are added to the map.\n <p>\n This ensures there is no shared access to mutable state from different threads (e.g. different event loops) in the\n Vert.x instance, and means you don't have to protect access to that state using synchronization or locks.\n")
public class LocalMap<K,V> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.shareddata.LocalMap, LocalMap> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.shareddata.LocalMap, LocalMap>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.LocalMap, LocalMap> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.LocalMap, LocalMap>() {
        public LocalMap convert(io.vertx.core.shareddata.LocalMap src) {
          return new LocalMap(descriptors[0], descriptors[1], src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<LocalMap, io.vertx.core.shareddata.LocalMap> TO_JAVA = new io.vertx.lang.ceylon.Converter<LocalMap, io.vertx.core.shareddata.LocalMap>() {
    public io.vertx.core.shareddata.LocalMap convert(LocalMap src) {
      return src.delegate;
    }
  };

  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$K;
  @Ignore private final TypeDescriptor $reified$V;
  @Ignore private final io.vertx.core.shareddata.LocalMap delegate;

  public LocalMap(@Ignore TypeDescriptor $reified$K, @Ignore TypeDescriptor $reified$V, io.vertx.core.shareddata.LocalMap delegate) {
    this.$TypeDescriptor$ = TypeDescriptor.klass(LocalMap.class, $reified$K, $reified$V);
    this.$reified$K = $reified$K;
    this.$reified$V = $reified$V;
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = " Get a value from the map\n")
  @TypeInfo("V?")
  public V get(
    final @TypeInfo("K?") @Name("key") @DocAnnotation$annotation$(description = "the key\n") K key) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    V ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Put an entry in the map\n")
  @TypeInfo("V?")
  public V put(
    final @TypeInfo("K?") @Name("key") @DocAnnotation$annotation$(description = "the key\n") K key, 
    final @TypeInfo("V?") @Name("value") @DocAnnotation$annotation$(description = "the value\n") V value) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    V ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.put(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Remove an entry from the map\n")
  @TypeInfo("V?")
  public V remove(
    final @TypeInfo("K?") @Name("key") @DocAnnotation$annotation$(description = "the key\n") K key) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    V ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.remove(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Clear all entries in the map\n")
  @TypeInfo("ceylon.language::Anything")
  public void clear() {
    delegate.clear();
  }

  @DocAnnotation$annotation$(description = " Get the size of the map\n")
  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isEmpty() {
    boolean ret = delegate.isEmpty();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Put the entry only if there is no existing entry for that key\n")
  @TypeInfo("V?")
  public V putIfAbsent(
    final @TypeInfo("K?") @Name("key") @DocAnnotation$annotation$(description = "the key\n") K key, 
    final @TypeInfo("V?") @Name("value") @DocAnnotation$annotation$(description = "the value\n") V value) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    V ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.putIfAbsent(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Remove the entry only if there is an entry with the specified key and value\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean removeIfPresent(
    final @TypeInfo("K?") @Name("key") @DocAnnotation$annotation$(description = "the key\n") K key, 
    final @TypeInfo("V?") @Name("value") @DocAnnotation$annotation$(description = "the value\n") V value) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    boolean ret = delegate.removeIfPresent(arg_0, arg_1);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Replace the entry only if there is an existing entry with the specified key and value\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean replaceIfPresent(
    final @TypeInfo("K?") @Name("key") @DocAnnotation$annotation$(description = "the key\n") K key, 
    final @TypeInfo("V?") @Name("oldValue") @DocAnnotation$annotation$(description = "the old value\n") V oldValue, 
    final @TypeInfo("V?") @Name("newValue") @DocAnnotation$annotation$(description = "the new value\n") V newValue) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(oldValue);
    java.lang.Object arg_2 = io.vertx.lang.ceylon.ToJava.object(newValue);
    boolean ret = delegate.replaceIfPresent(arg_0, arg_1, arg_2);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Replace the entry only if there is an existing entry with the key\n")
  @TypeInfo("V?")
  public V replace(
    final @TypeInfo("K?") @Name("key") @DocAnnotation$annotation$(description = "the key\n") K key, 
    final @TypeInfo("V?") @Name("value") @DocAnnotation$annotation$(description = "the new value\n") V value) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(key);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(value);
    V ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.replace(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Close and release the map\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
