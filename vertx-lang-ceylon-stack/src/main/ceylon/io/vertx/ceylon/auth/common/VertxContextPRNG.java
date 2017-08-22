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
import io.vertx.ceylon.core.Vertx;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A secure non blocking random number generator isolated to the current context. The PRNG is bound to the vert.x\n context and setup to close when the context shuts down.\n <p>\n When applicable, use of VertxContextPRNG rather than create new PRNG objects is helpful to keep the system entropy\n usage to the minimum avoiding potential blocking across the application.\n <p>\n The use of VertxContextPRNG is particularly appropriate when multiple handlers use random numbers.\n")
public class VertxContextPRNG implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.VertxContextPRNG, VertxContextPRNG> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.VertxContextPRNG, VertxContextPRNG>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.VertxContextPRNG, VertxContextPRNG> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.VertxContextPRNG, VertxContextPRNG>() {
        public VertxContextPRNG convert(io.vertx.ext.auth.VertxContextPRNG src) {
          return new VertxContextPRNG(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<VertxContextPRNG, io.vertx.ext.auth.VertxContextPRNG> TO_JAVA = new io.vertx.lang.ceylon.Converter<VertxContextPRNG, io.vertx.ext.auth.VertxContextPRNG>() {
    public io.vertx.ext.auth.VertxContextPRNG convert(VertxContextPRNG src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(VertxContextPRNG.class), io.vertx.ext.auth.VertxContextPRNG.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.VertxContextPRNG delegate;

  public VertxContextPRNG(io.vertx.ext.auth.VertxContextPRNG delegate) {
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

  @DocAnnotation$annotation$(description = " Returns a Base64 mime encoded String of random data with the given length. The length parameter refers to the length\n of the String before the encoding step.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String nextString(
    final @TypeInfo("ceylon.language::Integer") @Name("length")@DocAnnotation$annotation$(description = "the desired string length before Base64 encoding.\n") long length) {
    int arg_0 = (int)length;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.nextString(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a secure random int\n")
  @TypeInfo("ceylon.language::Integer")
  public long nextInt() {
    long ret = delegate.nextInt();
    return ret;
  }

}
