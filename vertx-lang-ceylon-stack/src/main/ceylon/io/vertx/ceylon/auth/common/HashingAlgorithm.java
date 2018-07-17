package io.vertx.ceylon.auth.common;

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
import java.util.Set;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Hashing Algorithm. A common interface to interact with any system provided algorithms.\n")
public class HashingAlgorithm implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.HashingAlgorithm, HashingAlgorithm> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.HashingAlgorithm, HashingAlgorithm>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.HashingAlgorithm, HashingAlgorithm> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.HashingAlgorithm, HashingAlgorithm>() {
        public HashingAlgorithm convert(io.vertx.ext.auth.HashingAlgorithm src) {
          return new HashingAlgorithm(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HashingAlgorithm, io.vertx.ext.auth.HashingAlgorithm> TO_JAVA = new io.vertx.lang.ceylon.Converter<HashingAlgorithm, io.vertx.ext.auth.HashingAlgorithm>() {
    public io.vertx.ext.auth.HashingAlgorithm convert(HashingAlgorithm src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(HashingAlgorithm.class), io.vertx.ext.auth.HashingAlgorithm.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.HashingAlgorithm delegate;

  public HashingAlgorithm(io.vertx.ext.auth.HashingAlgorithm delegate) {
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

  @DocAnnotation$annotation$(description = " return the symbolic name for the algorithm\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String id() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.id());
    return ret;
  }

  @DocAnnotation$annotation$(description = " return the list of param names required for this algorithm.\n")
  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> params() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, delegate.params(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Should the encoded string use the default separator to split fields.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean needsSeparator() {
    boolean ret = delegate.needsSeparator();
    return ret;
  }

}
