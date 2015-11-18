package io.vertx.ceylon.core.http;

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

@Ceylon(major = 8)
@Name("webSocketFrame")
@com.redhat.ceylon.compiler.java.metadata.Object
public class webSocketFrame_ implements ReifiedType {

  private static final webSocketFrame_ instance = new webSocketFrame_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(webSocketFrame_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.http::webSocketFrame")
  public static webSocketFrame_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a binary WebSocket frame.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public WebSocketFrame binaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "the data for the frame\n") Buffer data, 
    final @TypeInfo("ceylon.language::Boolean") @Name("isFinal") @DocAnnotation$annotation$(description = "true if it's the final frame in the WebSocket message\n") boolean isFinal) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    boolean arg_1 = isFinal;
    WebSocketFrame ret = io.vertx.ceylon.core.http.WebSocketFrame.TO_CEYLON.converter().safeConvert(io.vertx.core.http.WebSocketFrame.binaryFrame(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a text WebSocket frame.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public WebSocketFrame textFrame(
    final @TypeInfo("ceylon.language::String") @Name("str") @DocAnnotation$annotation$(description = "the string for the frame\n") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Boolean") @Name("isFinal") @DocAnnotation$annotation$(description = "true if it's the final frame in the WebSocket message\n") boolean isFinal) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    boolean arg_1 = isFinal;
    WebSocketFrame ret = io.vertx.ceylon.core.http.WebSocketFrame.TO_CEYLON.converter().safeConvert(io.vertx.core.http.WebSocketFrame.textFrame(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a continuation frame\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public WebSocketFrame continuationFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "the data for the frame\n") Buffer data, 
    final @TypeInfo("ceylon.language::Boolean") @Name("isFinal") @DocAnnotation$annotation$(description = "true if it's the final frame in the WebSocket message\n") boolean isFinal) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    boolean arg_1 = isFinal;
    WebSocketFrame ret = io.vertx.ceylon.core.http.WebSocketFrame.TO_CEYLON.converter().safeConvert(io.vertx.core.http.WebSocketFrame.continuationFrame(arg_0, arg_1));
    return ret;
  }

}
