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
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A timeout stream is triggered by a timer, the [Handler](Handler.type.html) will be call when the timer is fired,\n it can be once or several times depending on the nature of the timer related to this stream. The\n  will be called after the timer handler has been called.\n <p>\n Pausing the timer inhibits the timer shots until the stream is resumed. Setting a null handler callback cancels\n the timer.\n")
public class TimeoutStream implements ReifiedType,  ReadStream<ceylon.language.Integer> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.TimeoutStream, TimeoutStream> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.TimeoutStream, TimeoutStream>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.TimeoutStream, TimeoutStream> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.TimeoutStream, TimeoutStream>() {
        public TimeoutStream convert(io.vertx.core.TimeoutStream src) {
          return new TimeoutStream(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<TimeoutStream, io.vertx.core.TimeoutStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<TimeoutStream, io.vertx.core.TimeoutStream>() {
    public io.vertx.core.TimeoutStream convert(TimeoutStream src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(TimeoutStream.class);
  @Ignore private final io.vertx.core.TimeoutStream delegate;

  public TimeoutStream(io.vertx.core.TimeoutStream delegate) {
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

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    TimeoutStream ret = io.vertx.ceylon.core.TimeoutStream.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream handler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Long> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Long>() {
      public void handle(java.lang.Long event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event));
      }
    };
    TimeoutStream ret = io.vertx.ceylon.core.TimeoutStream.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream pause() {
    TimeoutStream ret = io.vertx.ceylon.core.TimeoutStream.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream resume() {
    TimeoutStream ret = io.vertx.ceylon.core.TimeoutStream.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    TimeoutStream ret = io.vertx.ceylon.core.TimeoutStream.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Cancels the timeout. Note this has the same effect as calling [handler](TimeoutStream.type.html#handler) with a null\n argument.\n")
  @TypeInfo("ceylon.language::Anything")
  public void cancel() {
    delegate.cancel();
  }

}
