package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.buffer.Buffer;

public class WebSocketFrame {

  private final io.vertx.core.http.WebSocketFrame delegate;

  public WebSocketFrame(io.vertx.core.http.WebSocketFrame delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public static WebSocketFrame binaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data, 
    final @TypeInfo("ceylon.language::Boolean") boolean isFinal) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    boolean arg_1 = isFinal;
    WebSocketFrame ret = new io.vertx.ceylon.core.http.WebSocketFrame(io.vertx.core.http.WebSocketFrame.binaryFrame(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public static WebSocketFrame textFrame(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Boolean") boolean isFinal) {
    java.lang.String arg_0 = str.toString();
    boolean arg_1 = isFinal;
    WebSocketFrame ret = new io.vertx.ceylon.core.http.WebSocketFrame(io.vertx.core.http.WebSocketFrame.textFrame(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public static WebSocketFrame continuationFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data, 
    final @TypeInfo("ceylon.language::Boolean") boolean isFinal) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    boolean arg_1 = isFinal;
    WebSocketFrame ret = new io.vertx.ceylon.core.http.WebSocketFrame(io.vertx.core.http.WebSocketFrame.continuationFrame(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isText() {
    boolean ret = delegate.isText();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isBinary() {
    boolean ret = delegate.isBinary();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isContinuation() {
    boolean ret = delegate.isContinuation();
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String textData() {
    ceylon.language.String ret = new ceylon.language.String(delegate.textData());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer binaryData() {
    Buffer ret = new io.vertx.ceylon.core.buffer.Buffer(delegate.binaryData());
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isFinal() {
    boolean ret = delegate.isFinal();
    return ret;
  }

}
