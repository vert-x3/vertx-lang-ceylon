package io.vertx.lang.ceylon;

public interface Converter<S, D> {

  D convert(S src);

}