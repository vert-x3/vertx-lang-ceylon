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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Pumps data from a [ReadStream](../streams/ReadStream.type.html) to a [WriteStream](../streams/WriteStream.type.html) and performs flow control where necessary to\n prevent the write stream buffer from getting overfull.\n <p>\n Instances of this class read items from a [ReadStream](../streams/ReadStream.type.html) and write them to a [WriteStream](../streams/WriteStream.type.html). If data\n can be read faster than it can be written this could result in the write queue of the [WriteStream](../streams/WriteStream.type.html) growing\n without bound, eventually causing it to exhaust all available RAM.\n <p>\n To prevent this, after each write, instances of this class check whether the write queue of the [WriteStream](../streams/WriteStream.type.html) is full, and if so, the [ReadStream](../streams/ReadStream.type.html) is paused, and a <code>drainHandler</code> is set on the\n [WriteStream](../streams/WriteStream.type.html).\n <p>\n When the [WriteStream](../streams/WriteStream.type.html) has processed half of its backlog, the <code>drainHandler</code> will be\n called, which results in the pump resuming the [ReadStream](../streams/ReadStream.type.html).\n <p>\n This class can be used to pump from any [ReadStream](../streams/ReadStream.type.html) to any [WriteStream](../streams/WriteStream.type.html),\n e.g. from an [HttpServerRequest](../http/HttpServerRequest.type.html) to an [AsyncFile](../file/AsyncFile.type.html),\n or from [NetSocket](../net/NetSocket.type.html) to a [WebSocket](../http/WebSocket.type.html).\n <p>\n Please see the documentation for more information.\n")
public class Pump implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.streams.Pump, Pump> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.streams.Pump, Pump>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.streams.Pump, Pump> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.streams.Pump, Pump>() {
        public Pump convert(io.vertx.core.streams.Pump src) {
          return new Pump(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Pump, io.vertx.core.streams.Pump> TO_JAVA = new io.vertx.lang.ceylon.Converter<Pump, io.vertx.core.streams.Pump>() {
    public io.vertx.core.streams.Pump convert(Pump src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Pump.class);
  @Ignore private final io.vertx.core.streams.Pump delegate;

  public Pump(io.vertx.core.streams.Pump delegate) {
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

  @DocAnnotation$annotation$(description = " Set the write queue max size to <code>maxSize</code>\n")
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public Pump setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") @DocAnnotation$annotation$(description = "the max size\n") long maxSize) {
    int arg_0 = (int)maxSize;
    Pump ret = io.vertx.ceylon.core.streams.Pump.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Start the Pump. The Pump can be started and stopped multiple times.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public Pump start() {
    Pump ret = io.vertx.ceylon.core.streams.Pump.TO_CEYLON.converter().safeConvert(delegate.start());
    return this;
  }

  @DocAnnotation$annotation$(description = " Stop the Pump. The Pump can be started and stopped multiple times.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public Pump stop() {
    Pump ret = io.vertx.ceylon.core.streams.Pump.TO_CEYLON.converter().safeConvert(delegate.stop());
    return this;
  }

  @DocAnnotation$annotation$(description = " Return the total number of items pumped by this pump.\n")
  @TypeInfo("ceylon.language::Integer")
  public long numberPumped() {
    long ret = delegate.numberPumped();
    return ret;
  }

}
