package io.vertx.lang.ceylon;

import ceylon.language.Anything;
import com.redhat.ceylon.compiler.java.language.AbstractCallable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public class HandlerCallable extends AbstractCallable {

  private final Converter converter;
  private final Handler handler;

  public HandlerCallable(Converter converter, Handler handler) {
    super(Anything.$TypeDescriptor$, Anything.$TypeDescriptor$, "whatever", (short) 0);
    this.converter = converter;
    this.handler = handler;
  }

  public Object $call$(java.lang.Object arg0) {
    Object obj = converter.safeConvert(arg0);
    handler.handle(obj);
    return null;
  }
}
