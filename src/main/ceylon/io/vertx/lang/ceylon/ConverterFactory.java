package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;

public interface ConverterFactory<S, D> {

  Converter<S, D> converter(TypeDescriptor... descriptors);

}