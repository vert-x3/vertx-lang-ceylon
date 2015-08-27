package io.vertx.ceylon.core.streams;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public interface StreamBase {

  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::StreamBase")
  StreamBase exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler);

  public class Impl implements StreamBase {
    private final io.vertx.core.streams.StreamBase delegate;

    public Impl(io.vertx.core.streams.StreamBase delegate) {
      this.delegate = delegate;
    }

    public Object getDelegate() {
      return delegate;
    }

    @Override
    public StreamBase exceptionHandler(final Callable<?> handler) {
      io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
      StreamBase ret = new io.vertx.ceylon.core.streams.StreamBase.Impl(delegate.exceptionHandler(arg_0));
      return ret;
    }
  }

}
