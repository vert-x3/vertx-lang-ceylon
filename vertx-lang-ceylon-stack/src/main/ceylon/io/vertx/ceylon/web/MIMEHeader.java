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
public class MIMEHeader implements ReifiedType,  ParsedHeaderValue {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.MIMEHeader, MIMEHeader> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.MIMEHeader, MIMEHeader>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.MIMEHeader, MIMEHeader> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.MIMEHeader, MIMEHeader>() {
        public MIMEHeader convert(io.vertx.ext.web.MIMEHeader src) {
          return new MIMEHeader(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<MIMEHeader, io.vertx.ext.web.MIMEHeader> TO_JAVA = new io.vertx.lang.ceylon.Converter<MIMEHeader, io.vertx.ext.web.MIMEHeader>() {
    public io.vertx.ext.web.MIMEHeader convert(MIMEHeader src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(MIMEHeader.class), io.vertx.ext.web.MIMEHeader.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.MIMEHeader delegate;

  public MIMEHeader(io.vertx.ext.web.MIMEHeader delegate) {
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

  @DocAnnotation$annotation$(description = " Contains the raw value that was received from the user agent \n")
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

  @DocAnnotation$annotation$(description = " Holds the weight specified in the \"q\" parameter of the header.<br>\n If the parameter is not specified, 1.0 is assumed according to \n <a href=\"https://tools.ietf.org/html/rfc7231#section-5.3.1\">rfc7231</a>\n")
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

  @DocAnnotation$annotation$(description = " Test if this header is matched by matchTry header \n")
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

  @DocAnnotation$annotation$(description = " Gets the parsed component part of the MIME. This is the string between the beginning and the first @{code '/'}\n of the MIME\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String component() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.component());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets the parsed subcomponent part of the MIME. This is the string between the first @{code '/'} and the\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String subComponent() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.subComponent());
    return ret;
  }

}
