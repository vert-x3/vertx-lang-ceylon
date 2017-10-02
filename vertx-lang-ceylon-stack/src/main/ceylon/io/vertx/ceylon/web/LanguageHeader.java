package io.vertx.ceylon.web;

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
import java.util.Map;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A parsed language header.\n Delivers a more direct access to the individual elements of the header it represents\n")
public class LanguageHeader extends Locale implements ReifiedType,  ParsedHeaderValue {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.LanguageHeader, LanguageHeader> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.LanguageHeader, LanguageHeader>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.LanguageHeader, LanguageHeader> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.LanguageHeader, LanguageHeader>() {
        public LanguageHeader convert(io.vertx.ext.web.LanguageHeader src) {
          return new LanguageHeader(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<LanguageHeader, io.vertx.ext.web.LanguageHeader> TO_JAVA = new io.vertx.lang.ceylon.Converter<LanguageHeader, io.vertx.ext.web.LanguageHeader>() {
    public io.vertx.ext.web.LanguageHeader convert(LanguageHeader src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(LanguageHeader.class), io.vertx.ext.web.LanguageHeader.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.LanguageHeader delegate;

  public LanguageHeader(io.vertx.ext.web.LanguageHeader delegate) {
    super(delegate);
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

  @DocAnnotation$annotation$(description = " Contains the raw value that was received from the user agent\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String rawValue() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.rawValue());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Holds the unparsed value of the header.<br>\n For the most part, this is the content before the semi-colon (\";\")\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String value() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.value());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Holds the weight specified in the \"q\" parameter of the header.<br>\n If the parameter is not specified, 1.0 is assumed according to\n <a href=\"https://tools.ietf.org/html/rfc7231#section-5.3.1\">rfc7231</a>\n")
  @TypeInfo("ceylon.language::Float")
  public double weight() {
    double ret = delegate.weight();
    return ret;
  }

  @DocAnnotation$annotation$(description = " The value of the parameter specified by this key. Each is one of 3 things:\n <ol>\n <li>null &lt;- That key was not specified</li>\n <li>ParsedHeaderValue.EMPTY (tested using ==) &lt;- The value was not specified</li>\n <li>[Other] <- The value of the parameter</li>\n </ol>\n <b>Note:</b> The <code>q</code> parameter is never present.\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String parameter(
    final @TypeInfo("ceylon.language::String") @Name("key") ceylon.language.String key) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(key);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.parameter(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " The parameters specified in this header value.\n <b>Note:</b> The <code>q</code> parameter is never present.\n")
  @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>")
  public ceylon.language.Map<ceylon.language.String,ceylon.language.String> parameters() {
    ceylon.language.Map<ceylon.language.String,ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertMap(ceylon.language.String.$TypeDescriptor$, ceylon.language.String.$TypeDescriptor$, delegate.parameters(), io.vertx.lang.ceylon.ToCeylon.String, io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Is this an allowed operation as specified by the corresponding header?\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isPermitted() {
    boolean ret = delegate.isPermitted();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Test if this header is matched by matchTry header\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMatchedBy(
    final @TypeInfo("io.vertx.ceylon.web::ParsedHeaderValue") @Name("matchTry")@DocAnnotation$annotation$(description = "The header to be matched from\n") ParsedHeaderValue matchTry) {
    io.vertx.ext.web.ParsedHeaderValue arg_0 = io.vertx.ceylon.web.ParsedHeaderValue.TO_JAVA.safeConvert(matchTry);
    boolean ret = delegate.isMatchedBy(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " An integer that represents the absolute order position of this header\n")
  @TypeInfo("ceylon.language::Integer")
  public long weightedOrder() {
    long ret = delegate.weightedOrder();
    return ret;
  }

  @DocAnnotation$annotation$(description = " The tag of the language as specified by\n <a href=\"https://tools.ietf.org/html/rfc7231#section-3.1.3.1\">rfc7231#section-3.1.3.1</a>.<br>\n Equivalent to \n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String tag() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.tag());
    return ret;
  }

  @DocAnnotation$annotation$(description = " The subtag of the language as specified by\n <a href=\"https://tools.ietf.org/html/rfc7231#section-3.1.3.1\">rfc7231#section-3.1.3.1</a>.<br>\n Equivalent to \n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String subtag() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.subtag());
    return ret;
  }

  @DocAnnotation$annotation$(description = " A subtag of this language header.<br>\n + info: <a href=\"https://tools.ietf.org/html/rfc7231#section-3.1.3.1\">rfc7231#section-3.1.3.1</a>\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String subtag(
    final @TypeInfo("ceylon.language::Integer") @Name("level") long level) {
    int arg_0 = (int)level;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.subtag(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Integer")
  public long subtagCount() {
    long ret = delegate.subtagCount();
    return ret;
  }

}
