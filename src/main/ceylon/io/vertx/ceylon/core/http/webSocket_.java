package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.buffer.Buffer;

@Name("webSocket")
@com.redhat.ceylon.compiler.java.metadata.Object
public class webSocket_ {

  private static final webSocket_ instance = new webSocket_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.http::webSocket")
  public static webSocket_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public static WebSocketFrame binaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data, 
    final @TypeInfo("ceylon.language::Boolean") @Name("isFinal") @DocAnnotation$annotation$(description = "todo") boolean isFinal) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    boolean arg_1 = isFinal;
    WebSocketFrame ret = io.vertx.ceylon.core.http.WebSocketFrame.TO_CEYLON.safeConvert(io.vertx.core.http.WebSocketFrame.binaryFrame(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public static WebSocketFrame textFrame(
    final @TypeInfo("ceylon.language::String") @Name("str") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Boolean") @Name("isFinal") @DocAnnotation$annotation$(description = "todo") boolean isFinal) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    boolean arg_1 = isFinal;
    WebSocketFrame ret = io.vertx.ceylon.core.http.WebSocketFrame.TO_CEYLON.safeConvert(io.vertx.core.http.WebSocketFrame.textFrame(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame")
  public static WebSocketFrame continuationFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data, 
    final @TypeInfo("ceylon.language::Boolean") @Name("isFinal") @DocAnnotation$annotation$(description = "todo") boolean isFinal) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    boolean arg_1 = isFinal;
    WebSocketFrame ret = io.vertx.ceylon.core.http.WebSocketFrame.TO_CEYLON.safeConvert(io.vertx.core.http.WebSocketFrame.continuationFrame(arg_0, arg_1));
    return ret;
  }

}
