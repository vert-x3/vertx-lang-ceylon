package io.vertx.ceylon.auth.oauth2;

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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.json.JsonObject;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A response from a fetch request.\n\n This class represents a secure response from a Oauth2 fetch call.\n\n A fetch is a simplified HTTP response from a protected resource.\n")
public class OAuth2Response implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.OAuth2Response, OAuth2Response> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.OAuth2Response, OAuth2Response>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.OAuth2Response, OAuth2Response> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.OAuth2Response, OAuth2Response>() {
        public OAuth2Response convert(io.vertx.ext.auth.oauth2.OAuth2Response src) {
          return new OAuth2Response(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<OAuth2Response, io.vertx.ext.auth.oauth2.OAuth2Response> TO_JAVA = new io.vertx.lang.ceylon.Converter<OAuth2Response, io.vertx.ext.auth.oauth2.OAuth2Response>() {
    public io.vertx.ext.auth.oauth2.OAuth2Response convert(OAuth2Response src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(OAuth2Response.class), io.vertx.ext.auth.oauth2.OAuth2Response.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.oauth2.OAuth2Response delegate;

  public OAuth2Response(io.vertx.ext.auth.oauth2.OAuth2Response delegate) {
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

  @DocAnnotation$annotation$(description = " the returned status code from the HTTP layer.\n")
  @TypeInfo("ceylon.language::Integer")
  public long statusCode() {
    long ret = delegate.statusCode();
    return ret;
  }

  @DocAnnotation$annotation$(description = " The HTTP response headers from the HTTP layer.\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap?")
  public MultiMap headers() {
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.headers());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Looks up a HTTP response header by name, in case where the response is a list of headers,\n the first one is returned.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getHeader(
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "of the header to look up\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getHeader(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " The HTTP response body as a buffer\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer?")
  public Buffer body() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.body());
    return ret;
  }

  @DocAnnotation$annotation$(description = " The HTTP response body as a JsonObject\n")
  @TypeInfo("ceylon.json::Object?")
  public ceylon.json.Object jsonObject() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.jsonObject());
    return ret;
  }

  @DocAnnotation$annotation$(description = " The HTTP response body as a JsonArray\n")
  @TypeInfo("ceylon.json::Array?")
  public ceylon.json.Array jsonArray() {
    ceylon.json.Array ret = io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(delegate.jsonArray());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Helper to analize the response body. The test is performed against the header Content-Type,\n the content of the body is not analyzed.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean is(
    final @TypeInfo("ceylon.language::String") @Name("contentType")@DocAnnotation$annotation$(description = "a content type to test, e.g.: application/json\n") ceylon.language.String contentType) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(contentType);
    boolean ret = delegate.is(arg_0);
    return ret;
  }

}
