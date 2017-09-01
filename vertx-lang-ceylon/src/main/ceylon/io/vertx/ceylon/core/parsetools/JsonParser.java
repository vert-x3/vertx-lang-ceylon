package io.vertx.ceylon.core.parsetools;

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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A parser class which allows to incrementally parse json elements and emit json parse events instead of parsing a json\n element fully. This parser is convenient for parsing large json structures.\n <p/>\n The parser can also parse entire object or array when it is convenient, for instance a very large array\n of small objects can be parsed efficiently by handling array <i>start</i>/<i>end</i> and <i>object</i>\n events.\n <p/>\n Whenever the parser fails to parse or process the stream, the [exceptionHandler](../parsetools/JsonParser.type.html#exceptionHandler) is called with\n the cause of the failure and the current handling stops. After such event, the parser should not handle data\n anymore.\n")
public class JsonParser implements ReifiedType,  ReadStream<JsonEvent> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.parsetools.JsonParser, JsonParser> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.parsetools.JsonParser, JsonParser>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.parsetools.JsonParser, JsonParser> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.parsetools.JsonParser, JsonParser>() {
        public JsonParser convert(io.vertx.core.parsetools.JsonParser src) {
          return new JsonParser(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<JsonParser, io.vertx.core.parsetools.JsonParser> TO_JAVA = new io.vertx.lang.ceylon.Converter<JsonParser, io.vertx.core.parsetools.JsonParser>() {
    public io.vertx.core.parsetools.JsonParser convert(JsonParser src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(JsonParser.class), io.vertx.core.parsetools.JsonParser.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.parsetools.JsonParser delegate;

  public JsonParser(io.vertx.core.parsetools.JsonParser delegate) {
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

  @DocAnnotation$annotation$(description = " Something has happened, so handle it.\n")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("event")@DocAnnotation$annotation$(description = "the event to handle\n") Buffer event) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(event);
    delegate.handle(arg_0);
  }

  @DocAnnotation$annotation$(description = " Handle a <code>Buffer</code>, pretty much like calling _handler_.\n")
  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("buffer") Buffer buffer) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(buffer);
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " End the stream, this must be called after all the json stream has been processed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end() {
    delegate.end();
  }

  @DocAnnotation$annotation$(description = " Flip the parser to emit a stream of events for each new json object.\n")
  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser objectEventMode() {
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(delegate.objectEventMode());
    return this;
  }

  @DocAnnotation$annotation$(description = " Flip the parser to emit a single value event for each new json object.\n </p>\n Json object currently streamed won't be affected.\n")
  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser objectValueMode() {
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(delegate.objectValueMode());
    return this;
  }

  @DocAnnotation$annotation$(description = " Flip the parser to emit a stream of events for each new json array.\n")
  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser arrayEventMode() {
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(delegate.arrayEventMode());
    return this;
  }

  @DocAnnotation$annotation$(description = " Flip the parser to emit a single value event for each new json array.\n </p>\n Json array currently streamed won't be affected.\n")
  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser arrayValueMode() {
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(delegate.arrayValueMode());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser pause() {
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser resume() {
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.parsetools::JsonEvent)?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.parsetools.JsonEvent> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.parsetools.JsonEvent>() {
      public void handle(io.vertx.core.parsetools.JsonEvent event) {
        handler.$call$((Object)io.vertx.ceylon.core.parsetools.JsonEvent.TO_CEYLON.converter().safeConvert(event));
      }
    };
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

}
