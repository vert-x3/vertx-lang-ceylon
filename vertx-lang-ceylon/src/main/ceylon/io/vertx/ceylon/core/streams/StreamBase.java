package io.vertx.ceylon.core.streams;

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
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Base interface for a stream.\n")
public interface StreamBase {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.streams.StreamBase, StreamBase> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.streams.StreamBase, StreamBase>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.streams.StreamBase, StreamBase> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.streams.StreamBase, StreamBase>() {
        public StreamBase convert(io.vertx.core.streams.StreamBase src) {
          return new StreamBase.Impl(src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<StreamBase, io.vertx.core.streams.StreamBase> TO_JAVA = new io.vertx.lang.ceylon.Converter<StreamBase, io.vertx.core.streams.StreamBase>() {
    public io.vertx.core.streams.StreamBase convert(StreamBase src) {
      return (io.vertx.core.streams.StreamBase)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(StreamBase.class);
  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = " Set an exception handler.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::StreamBase")
  public StreamBase exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler);

  @Ignore
  public class Impl implements StreamBase {
    @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(StreamBase.class);
    @Ignore private final io.vertx.core.streams.StreamBase delegate;

    public Impl(io.vertx.core.streams.StreamBase delegate) {
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

  @DocAnnotation$annotation$(description = " Set an exception handler.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::StreamBase")
  public StreamBase exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    StreamBase ret = io.vertx.ceylon.core.streams.StreamBase.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
      return this;
    }
  }

}
