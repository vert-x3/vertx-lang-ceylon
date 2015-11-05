package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.runtime.tools.CompilerOptions;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class ExtendedCompilerOptions extends CompilerOptions {

  private String target;

  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }
}
