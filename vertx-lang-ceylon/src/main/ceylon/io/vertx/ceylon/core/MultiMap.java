package io.vertx.ceylon.core;

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
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " This class represents a MultiMap of String keys to a List of String values.\n <p>\n It's useful in Vert.x to represent things in Vert.x like HTTP headers and HTTP parameters which allow\n multiple values for keys.\n")
public class MultiMap implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.MultiMap, MultiMap> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.MultiMap, MultiMap>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.MultiMap, MultiMap> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.MultiMap, MultiMap>() {
        public MultiMap convert(io.vertx.core.MultiMap src) {
          return new MultiMap(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<MultiMap, io.vertx.core.MultiMap> TO_JAVA = new io.vertx.lang.ceylon.Converter<MultiMap, io.vertx.core.MultiMap>() {
    public io.vertx.core.MultiMap convert(MultiMap src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(MultiMap.class);
  @Ignore private final io.vertx.core.MultiMap delegate;

  public MultiMap(io.vertx.core.MultiMap delegate) {
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

  @DocAnnotation$annotation$(description = " Returns the value of with the specified name.  If there are\n more than one values for the specified name, the first value is returned.\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String get(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "The name of the header to search\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the values with the specified name\n")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> getAll(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "The name to search\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.getAll(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Checks to see if there is a value with the specified name\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean contains(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "The name to search for\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    boolean ret = delegate.contains(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return true if empty\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isEmpty() {
    boolean ret = delegate.isEmpty();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets a immutable `Set` of all names\n")
  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> names() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, delegate.names(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Adds a new value with the specified name and value.\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap add(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "The name\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @Name("value") @DocAnnotation$annotation$(description = "The value being added\n") ceylon.language.String value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(value);
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.add(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Adds all the entries from another MultiMap to this one\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap addAll(
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("map")  MultiMap map) {
    io.vertx.core.MultiMap arg_0 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(map);
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.addAll(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets a value under the specified name.\n <p>\n If there is an existing header with the same name, it is removed.\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap set(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "The name\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @Name("value") @DocAnnotation$annotation$(description = "The value\n") ceylon.language.String value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(value);
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.set(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Cleans this instance.\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap setAll(
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("map")  MultiMap map) {
    io.vertx.core.MultiMap arg_0 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(map);
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.setAll(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Removes the value with the given name\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap remove(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "The name of the value to remove\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.remove(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Removes all\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap clear() {
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.clear());
    return this;
  }

  @DocAnnotation$annotation$(description = " Return the number of keys.\n")
  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

}
