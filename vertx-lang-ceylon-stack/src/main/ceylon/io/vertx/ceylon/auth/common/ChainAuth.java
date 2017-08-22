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
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Chain several auth providers as if they were one. This is useful for cases where one want to authenticate across\n several providers, for example, database and fallback to passwd file.\n")
public class ChainAuth extends AuthProvider implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.ChainAuth, ChainAuth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.ChainAuth, ChainAuth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.ChainAuth, ChainAuth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.ChainAuth, ChainAuth>() {
        public ChainAuth convert(io.vertx.ext.auth.ChainAuth src) {
          return new ChainAuth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<ChainAuth, io.vertx.ext.auth.ChainAuth> TO_JAVA = new io.vertx.lang.ceylon.Converter<ChainAuth, io.vertx.ext.auth.ChainAuth>() {
    public io.vertx.ext.auth.ChainAuth convert(ChainAuth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(ChainAuth.class), io.vertx.ext.auth.ChainAuth.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.ChainAuth delegate;

  public ChainAuth(io.vertx.ext.auth.ChainAuth delegate) {
    super(delegate);
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

  @DocAnnotation$annotation$(description = " Appends a auth provider to the chain.\n")
  @TypeInfo("io.vertx.ceylon.auth.common::ChainAuth")
  public ChainAuth append(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("other")@DocAnnotation$annotation$(description = "auth provider\n") AuthProvider other) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(other);
    ChainAuth ret = io.vertx.ceylon.auth.common.ChainAuth.TO_CEYLON.converter().safeConvert(delegate.append(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Removes a provider from the chain.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean remove(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("other")@DocAnnotation$annotation$(description = "provider to remove\n") AuthProvider other) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(other);
    boolean ret = delegate.remove(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Clears the chain.\n")
  @TypeInfo("ceylon.language::Anything")
  public void clear() {
    delegate.clear();
  }

}
