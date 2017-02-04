package io.vertx.codetrans.lang.ceylon;

import io.vertx.codetrans.CodeBuilder;
import io.vertx.codetrans.Lang;
import io.vertx.codetrans.Script;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonLang implements Lang {

  @Override
  public String id() {
    return "ceylon";
  }

  @Override
  public Script loadScript(ClassLoader loader, String path, String method) throws Exception {
    throw new UnsupportedOperationException("not yet implemented");
  }

  @Override
  public String getExtension() {
    return "ceylon";
  }

  @Override
  public CodeBuilder codeBuilder() {
    return new CeylonCodeBuilder();
  }
}
