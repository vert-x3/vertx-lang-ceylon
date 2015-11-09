package io.vertx.lang.ceylon;

public abstract class Converter<S, D> {

  public D safeConvert(S src) {
    if (src != null) {
      return convert(src);
    } else {
      return null;
    }
  }

  public abstract D convert(S src);

}