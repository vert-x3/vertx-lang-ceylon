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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " The composite future wraps a list of [futures](Future.type.html), it is useful when several futures\n needs to be coordinated.\n")
public class CompositeFuture extends io.vertx.ceylon.core.Future<io.vertx.ceylon.core.CompositeFuture> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.CompositeFuture, CompositeFuture> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.CompositeFuture, CompositeFuture>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.CompositeFuture, CompositeFuture> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.CompositeFuture, CompositeFuture>() {
        public CompositeFuture convert(io.vertx.core.CompositeFuture src) {
          return new CompositeFuture(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<CompositeFuture, io.vertx.core.CompositeFuture> TO_JAVA = new io.vertx.lang.ceylon.Converter<CompositeFuture, io.vertx.core.CompositeFuture>() {
    public io.vertx.core.CompositeFuture convert(CompositeFuture src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(CompositeFuture.class);
  @Ignore private final io.vertx.core.CompositeFuture delegate;

  public CompositeFuture(io.vertx.core.CompositeFuture delegate) {
    super(TypeDescriptor.klass(io.vertx.core.CompositeFuture.class), delegate);
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

  @TypeInfo("io.vertx.ceylon.core::CompositeFuture")
  public CompositeFuture setHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core::CompositeFuture)") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.CompositeFuture>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.CompositeFuture>(handler) {
      public Object toCeylon(io.vertx.core.CompositeFuture event) {
        return io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(event);
      }
    };
    CompositeFuture ret = io.vertx.ceylon.core.CompositeFuture.TO_CEYLON.converter().safeConvert(delegate.setHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Returns a cause of a wrapped future\n")
  @TypeInfo("ceylon.language::Throwable")
  public Throwable cause(
    final @TypeInfo("ceylon.language::Integer") @Name("index") @DocAnnotation$annotation$(description = "the wrapped future index\n") long index) {
    int arg_0 = (int)index;
    Throwable ret = delegate.cause(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns true if a wrapped future is succeeded\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean succeeded(
    final @TypeInfo("ceylon.language::Integer") @Name("index") @DocAnnotation$annotation$(description = "the wrapped future index\n") long index) {
    int arg_0 = (int)index;
    boolean ret = delegate.succeeded(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns true if a wrapped future is failed\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean failed(
    final @TypeInfo("ceylon.language::Integer") @Name("index") @DocAnnotation$annotation$(description = "the wrapped future index\n") long index) {
    int arg_0 = (int)index;
    boolean ret = delegate.failed(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns true if a wrapped future is completed\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isComplete(
    final @TypeInfo("ceylon.language::Integer") @Name("index") @DocAnnotation$annotation$(description = "the wrapped future index\n") long index) {
    int arg_0 = (int)index;
    boolean ret = delegate.isComplete(arg_0);
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Returns the result of a wrapped future\n")
  @TypeInfo("T?")
  public <T> T result(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Integer") @Name("index") @DocAnnotation$annotation$(description = "the wrapped future index\n") long index) {
    int arg_0 = (int)index;
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.result(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the number of wrapped future\n")
  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

}
