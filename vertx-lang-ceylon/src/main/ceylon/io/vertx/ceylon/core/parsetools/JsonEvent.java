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
import io.vertx.core.json.JsonArray;
import io.vertx.core.parsetools.JsonEventType;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A JSON event emited by the [JsonParser](../parsetools/JsonParser.type.html).\n")
public class JsonEvent implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.parsetools.JsonEvent, JsonEvent> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.parsetools.JsonEvent, JsonEvent>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.parsetools.JsonEvent, JsonEvent> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.parsetools.JsonEvent, JsonEvent>() {
        public JsonEvent convert(io.vertx.core.parsetools.JsonEvent src) {
          return new JsonEvent(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<JsonEvent, io.vertx.core.parsetools.JsonEvent> TO_JAVA = new io.vertx.lang.ceylon.Converter<JsonEvent, io.vertx.core.parsetools.JsonEvent>() {
    public io.vertx.core.parsetools.JsonEvent convert(JsonEvent src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(JsonEvent.class), io.vertx.core.parsetools.JsonEvent.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.parsetools.JsonEvent delegate;

  public JsonEvent(io.vertx.core.parsetools.JsonEvent delegate) {
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

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String type() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.<io.vertx.core.parsetools.JsonEventType>enumeration().safeConvert(delegate.type());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String fieldName() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.fieldName());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Object?")
  public Object value() {
    Object ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.value());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isNumber() {
    boolean ret = delegate.isNumber();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Integer")
  public ceylon.language.Integer integerValue() {
    ceylon.language.Integer ret = io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(delegate.integerValue());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Integer")
  public ceylon.language.Integer longValue() {
    ceylon.language.Integer ret = io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(delegate.longValue());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Float")
  public ceylon.language.Float floatValue() {
    ceylon.language.Float ret = io.vertx.lang.ceylon.ToCeylon.Float.safeConvert(delegate.floatValue());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Float")
  public ceylon.language.Float doubleValue() {
    ceylon.language.Float ret = io.vertx.lang.ceylon.ToCeylon.Double.safeConvert(delegate.doubleValue());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isBoolean() {
    boolean ret = delegate.isBoolean();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public ceylon.language.Boolean booleanValue() {
    ceylon.language.Boolean ret = io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(delegate.booleanValue());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isString() {
    boolean ret = delegate.isString();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String stringValue() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.stringValue());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return the binary value.\n <p>\n JSON itself has no notion of a binary, this extension complies to the RFC-7493, so this method assumes there is a\n String value with the key and it contains a Base64 encoded binary, which it decodes if found and returns.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer binaryValue() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.binaryValue());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isNull() {
    boolean ret = delegate.isNull();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isObject() {
    boolean ret = delegate.isObject();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object objectValue() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.objectValue());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isArray() {
    boolean ret = delegate.isArray();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.json::Array")
  public ceylon.json.Array arrayValue() {
    ceylon.json.Array ret = io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(delegate.arrayValue());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Decodes and returns the current value as the specified <code>type</code>.\n")
  @TypeInfo("T?")
  public <T> T mapTo(final @Ignore TypeDescriptor $reified$T) {
    java.lang.Class<java.lang.Object> arg_0 = io.vertx.lang.ceylon.VertxTypeDescriptor.getClass($reified$T);
    T ret = (T)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$T).convert(delegate.mapTo(arg_0));
    return ret;
  }

}
