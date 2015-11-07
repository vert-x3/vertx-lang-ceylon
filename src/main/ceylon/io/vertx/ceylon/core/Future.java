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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@Ceylon(major = 8)@DocAnnotation$annotation$(description = "todo")
public class Future<T> implements ReifiedType {

  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.Future, Future> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.Future, Future>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.Future, Future> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.Future, Future>() {
        public Future convert(io.vertx.core.Future src) {
          return new Future(descriptors[0], src);
        }
      };
    }
  };

  public static final io.vertx.lang.ceylon.Converter<Future, io.vertx.core.Future> TO_JAVA = new io.vertx.lang.ceylon.Converter<Future, io.vertx.core.Future>() {
    public io.vertx.core.Future convert(Future src) {
      return src.delegate;
    }
  };

  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$T;
  @Ignore private final io.vertx.core.Future delegate;

  public Future(@Ignore TypeDescriptor $reified$T, io.vertx.core.Future delegate) {
    this.$TypeDescriptor$ = TypeDescriptor.klass(Future.class, $reified$T);
    this.$reified$T = $reified$T;
    this.delegate = delegate;
  }

  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isComplete() {
    boolean ret = delegate.isComplete();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void setHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(handler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.setHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void complete(
    final @TypeInfo("T?") @Name("result") @DocAnnotation$annotation$(description = "todo") T result) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(result);
    delegate.complete(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void complete() {
    delegate.complete();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::String") @Name("failureMessage") @DocAnnotation$annotation$(description = "todo") ceylon.language.String failureMessage) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(failureMessage);
    delegate.fail(arg_0);
  }

}
