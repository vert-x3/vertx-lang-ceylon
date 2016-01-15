package io.vertx.ceylon.core.eventbus;

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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " An event bus consumer object representing a stream of message to an [EventBus](../eventbus/EventBus.type.html) address that can\n be read from.\n <p>\n The [consumer](../eventbus/EventBus.type.html#consumer) or [localConsumer](../eventbus/EventBus.type.html#localConsumer)\n creates a new consumer, the returned consumer is not yet registered against the event bus. Registration\n is effective after the [handler](../eventbus/MessageConsumer.type.html#handler) method is invoked.<p>\n\n The consumer is unregistered from the event bus using the [unregister](../eventbus/MessageConsumer.type.html#unregister) method or by calling the\n [handler](../eventbus/MessageConsumer.type.html#handler) with a null value..\n")
public class MessageConsumer<T> implements ReifiedType,  ReadStream<Message<T>> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.eventbus.MessageConsumer, MessageConsumer> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.eventbus.MessageConsumer, MessageConsumer>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.MessageConsumer, MessageConsumer> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.MessageConsumer, MessageConsumer>() {
        public MessageConsumer convert(io.vertx.core.eventbus.MessageConsumer src) {
          return new MessageConsumer(descriptors[0], src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<MessageConsumer, io.vertx.core.eventbus.MessageConsumer> TO_JAVA = new io.vertx.lang.ceylon.Converter<MessageConsumer, io.vertx.core.eventbus.MessageConsumer>() {
    public io.vertx.core.eventbus.MessageConsumer convert(MessageConsumer src) {
      return src.delegate;
    }
  };

  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$T;
  @Ignore private final io.vertx.core.eventbus.MessageConsumer delegate;

  public MessageConsumer(@Ignore TypeDescriptor $reified$T, io.vertx.core.eventbus.MessageConsumer delegate) {
    this.$TypeDescriptor$ = TypeDescriptor.klass(MessageConsumer.class, $reified$T);
    this.$reified$T = $reified$T;
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

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.converter($reified$T).safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.eventbus::Message<T>)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
      public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        handler.$call$((Object)io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.converter($reified$T).safeConvert(event));
      }
    };
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.converter($reified$T).safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> pause() {
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.converter($reified$T).safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> resume() {
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.converter($reified$T).safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler")  Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.converter($reified$T).safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return a read stream for the body of the message stream.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> bodyStream() {
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.bodyStream());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return true if the current consumer is registered\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isRegistered() {
    boolean ret = delegate.isRegistered();
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return The address the handler was registered with.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String address() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.address());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the number of messages this registration will buffer when this stream is paused. The default\n value is <code>0</code>. When a new value is set, buffered messages may be discarded to reach\n the new value.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> setMaxBufferedMessages(
    final @TypeInfo("ceylon.language::Integer") @Name("maxBufferedMessages") @DocAnnotation$annotation$(description = "the maximum number of messages that can be buffered\n") long maxBufferedMessages) {
    int arg_0 = (int)maxBufferedMessages;
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.converter($reified$T).safeConvert(delegate.setMaxBufferedMessages(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the maximum number of messages that can be buffered when this stream is paused\n")
  @TypeInfo("ceylon.language::Integer")
  public long $getMaxBufferedMessages() {
    long ret = delegate.getMaxBufferedMessages();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Optional method which can be called to indicate when the registration has been propagated across the cluster.\n")
  @TypeInfo("ceylon.language::Anything")
  public void completionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "the completion handler\n") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = completionHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.completionHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = " Unregisters the handler which created this registration\n")
  @TypeInfo("ceylon.language::Anything")
  public void unregister() {
    delegate.unregister();
  }

  @DocAnnotation$annotation$(description = " Unregisters the handler which created this registration\n")
  @TypeInfo("ceylon.language::Anything")
  public void unregister(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "the handler called when the unregister is done. For example in a cluster when all nodes of the event bus have been unregistered.\n") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = completionHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.unregister(arg_0);
  }

}
