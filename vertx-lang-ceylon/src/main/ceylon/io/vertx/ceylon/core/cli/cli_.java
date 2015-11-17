package io.vertx.ceylon.core.cli;

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

@Name("cli")
@com.redhat.ceylon.compiler.java.metadata.Object
public class cli_ {

  private static final cli_ instance = new cli_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.cli::cli")
  public static cli_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Creates an instance of todo_link using the default implementation.\n")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public static CLI create(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(io.vertx.core.cli.CLI.create(arg_0));
    return ret;
  }

}
