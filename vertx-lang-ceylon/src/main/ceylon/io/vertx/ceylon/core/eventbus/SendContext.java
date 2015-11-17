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

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "\n Encapsulates a message being sent from Vert.x. Used with event bus interceptors\n")
public class SendContext<T> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.eventbus.SendContext, SendContext> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.eventbus.SendContext, SendContext>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.SendContext, SendContext> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.SendContext, SendContext>() {
        public SendContext convert(io.vertx.core.eventbus.SendContext src) {
          return new SendContext(descriptors[0], src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SendContext, io.vertx.core.eventbus.SendContext> TO_JAVA = new io.vertx.lang.ceylon.Converter<SendContext, io.vertx.core.eventbus.SendContext>() {
    public io.vertx.core.eventbus.SendContext convert(SendContext src) {
      return src.delegate;
    }
  };

  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$T;
  @Ignore private final io.vertx.core.eventbus.SendContext delegate;

  public SendContext(@Ignore TypeDescriptor $reified$T, io.vertx.core.eventbus.SendContext delegate) {
    this.$TypeDescriptor$ = TypeDescriptor.klass(SendContext.class, $reified$T);
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

  @DocAnnotation$annotation$(description = " @return  The message being sent\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::Message<T>")
  public Message<T> message() {
    Message<T> ret = io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.converter($reified$T).safeConvert(delegate.message());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Call the next interceptor\n")
  @TypeInfo("ceylon.language::Anything")
  public void next() {
    delegate.next();
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean send() {
    boolean ret = delegate.send();
    return ret;
  }

}
