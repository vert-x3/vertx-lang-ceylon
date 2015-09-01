package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.buffer.Buffer;

@DocAnnotation$annotation$(description = "todo")
public class WebSocketFrame {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WebSocketFrame.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocketFrame, WebSocketFrame> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocketFrame, WebSocketFrame>() {
    public WebSocketFrame convert(io.vertx.core.http.WebSocketFrame src) {
      return new WebSocketFrame(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<WebSocketFrame, io.vertx.core.http.WebSocketFrame> TO_JAVA = new io.vertx.lang.ceylon.Converter<WebSocketFrame, io.vertx.core.http.WebSocketFrame>() {
    public io.vertx.core.http.WebSocketFrame convert(WebSocketFrame src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.http.WebSocketFrame delegate;

  public WebSocketFrame(io.vertx.core.http.WebSocketFrame delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public static WebSocketFrame binaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data, 
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean isFinal) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    boolean arg_1 = isFinal;
    WebSocketFrame ret = new io.vertx.ceylon.core.http.WebSocketFrame(io.vertx.core.http.WebSocketFrame.binaryFrame(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public static WebSocketFrame textFrame(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean isFinal) {
    java.lang.String arg_0 = str.toString();
    boolean arg_1 = isFinal;
    WebSocketFrame ret = new io.vertx.ceylon.core.http.WebSocketFrame(io.vertx.core.http.WebSocketFrame.textFrame(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public static WebSocketFrame continuationFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data, 
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean isFinal) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    boolean arg_1 = isFinal;
    WebSocketFrame ret = new io.vertx.ceylon.core.http.WebSocketFrame(io.vertx.core.http.WebSocketFrame.continuationFrame(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isText() {
    boolean ret = delegate.isText();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isBinary() {
    boolean ret = delegate.isBinary();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isContinuation() {
    boolean ret = delegate.isContinuation();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String textData() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.textData());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer binaryData() {
    Buffer ret = new io.vertx.ceylon.core.buffer.Buffer(delegate.binaryData());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isFinal() {
    boolean ret = delegate.isFinal();
    return ret;
  }

}
