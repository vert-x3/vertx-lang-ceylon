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
import java.util.List;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A container with the request's headers that are meaningful enough to be parsed\n Contains:\n <ul>\n <li>Accept -> MIME header, parameters and sortable</li>\n <li>Accept-Charset -> Parameters and sortable</li>\n <li>Accept-Encoding -> Parameters and sortable</li>\n <li>Accept-Language -> Parameters and sortable</li>\n <li>Content-Type -> MIME header and parameters</li>\n </ul>\n\n")
public class ParsedHeaderValues implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.ParsedHeaderValues, ParsedHeaderValues> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.ParsedHeaderValues, ParsedHeaderValues>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.ParsedHeaderValues, ParsedHeaderValues> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.ParsedHeaderValues, ParsedHeaderValues>() {
        public ParsedHeaderValues convert(io.vertx.ext.web.ParsedHeaderValues src) {
          return new ParsedHeaderValues(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<ParsedHeaderValues, io.vertx.ext.web.ParsedHeaderValues> TO_JAVA = new io.vertx.lang.ceylon.Converter<ParsedHeaderValues, io.vertx.ext.web.ParsedHeaderValues>() {
    public io.vertx.ext.web.ParsedHeaderValues convert(ParsedHeaderValues src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(ParsedHeaderValues.class), io.vertx.ext.web.ParsedHeaderValues.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.ParsedHeaderValues delegate;

  public ParsedHeaderValues(io.vertx.ext.web.ParsedHeaderValues delegate) {
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
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.web::MIMEHeader>")
  public ceylon.language.List<MIMEHeader> accept() {
    ceylon.language.List<MIMEHeader> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.web.MIMEHeader.$TypeDescriptor$, delegate.accept(), io.vertx.ceylon.web.MIMEHeader.TO_CEYLON.converter());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.web::ParsedHeaderValue>")
  public ceylon.language.List<ParsedHeaderValue> acceptCharset() {
    ceylon.language.List<ParsedHeaderValue> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.web.ParsedHeaderValue.$TypeDescriptor$, delegate.acceptCharset(), io.vertx.ceylon.web.ParsedHeaderValue.TO_CEYLON.converter());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.web::ParsedHeaderValue>")
  public ceylon.language.List<ParsedHeaderValue> acceptEncoding() {
    ceylon.language.List<ParsedHeaderValue> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.web.ParsedHeaderValue.$TypeDescriptor$, delegate.acceptEncoding(), io.vertx.ceylon.web.ParsedHeaderValue.TO_CEYLON.converter());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.web::LanguageHeader>")
  public ceylon.language.List<LanguageHeader> acceptLanguage() {
    ceylon.language.List<LanguageHeader> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.web.LanguageHeader.$TypeDescriptor$, delegate.acceptLanguage(), io.vertx.ceylon.web.LanguageHeader.TO_CEYLON.converter());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.web::MIMEHeader")
  public MIMEHeader contentType() {
    MIMEHeader ret = io.vertx.ceylon.web.MIMEHeader.TO_CEYLON.converter().safeConvert(delegate.contentType());
    return ret;
  }

}
