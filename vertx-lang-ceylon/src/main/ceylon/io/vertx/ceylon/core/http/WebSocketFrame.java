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
@DocAnnotation$annotation$(description = " A WebSocket frame that represents either text or binary data.\n <p>\n A WebSocket message is composed of one or more WebSocket frames.\n <p>\n If there is a just a single frame in the message then a single text or binary frame should be created with final = true.\n <p>\n If there are more than one frames in the message, then the first frame should be a text or binary frame with\n final = false, followed by one or more continuation frames. The last continuation frame should have final = true.\n")
public class WebSocketFrame implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.WebSocketFrame, WebSocketFrame> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.WebSocketFrame, WebSocketFrame>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocketFrame, WebSocketFrame> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocketFrame, WebSocketFrame>() {
        public WebSocketFrame convert(io.vertx.core.http.WebSocketFrame src) {
          return new WebSocketFrame(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<WebSocketFrame, io.vertx.core.http.WebSocketFrame> TO_JAVA = new io.vertx.lang.ceylon.Converter<WebSocketFrame, io.vertx.core.http.WebSocketFrame>() {
    public io.vertx.core.http.WebSocketFrame convert(WebSocketFrame src) {
      return src.delegate;
    }
  };

  @Ignore private ceylon.language.String cached_textData;
  @Ignore private Buffer cached_binaryData;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WebSocketFrame.class);
  @Ignore private final io.vertx.core.http.WebSocketFrame delegate;

  public WebSocketFrame(io.vertx.core.http.WebSocketFrame delegate) {
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

  @DocAnnotation$annotation$(description = " @return true if it's a text frame\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isText() {
    boolean ret = delegate.isText();
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return true if it's a binary frame\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isBinary() {
    boolean ret = delegate.isBinary();
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return true if it's a continuation frame\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isContinuation() {
    boolean ret = delegate.isContinuation();
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the content of this frame as a UTF-8 string and returns the\n converted string. Only use this for text frames.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String textData() {
    if (cached_textData != null) {
      return cached_textData;
    }
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.textData());
    cached_textData = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the data of the frame\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer binaryData() {
    if (cached_binaryData != null) {
      return cached_binaryData;
    }
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.binaryData());
    cached_binaryData = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return true if this is the final frame.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isFinal() {
    boolean ret = delegate.isFinal();
    return ret;
  }

}
