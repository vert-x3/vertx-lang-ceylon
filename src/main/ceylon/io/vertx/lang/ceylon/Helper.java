package io.vertx.lang.ceylon;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import ceylon.language.Callable;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.lang.UnsupportedOperationException;

public class Helper {

  /**
   * Dynamic Ceylon to Java conversion.
   *
   * @param obj the object to convert
   * @return the converted object
   */
  public static Object toJavaObject(Object obj) {
    if (obj instanceof ceylon.language.String) {
       return obj.toString();
    } else if (obj instanceof ceylon.language.Boolean) {
      return ((ceylon.language.Boolean)obj).booleanValue();
    } else if (obj instanceof ceylon.language.Integer) {
      return ((ceylon.language.Integer)obj).longValue();
    } else if (obj instanceof ceylon.language.Float) {
      return ((ceylon.language.Float)obj).doubleValue();
    } else if (obj instanceof ceylon.json.Object) {
      return new JsonObject(obj.toString());
    } else if (obj instanceof ceylon.json.Array) {
      return new JsonArray(obj.toString());
    }
    return obj;
  }
}