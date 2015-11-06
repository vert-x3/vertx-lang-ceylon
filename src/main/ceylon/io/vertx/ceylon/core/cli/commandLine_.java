package io.vertx.ceylon.core.cli;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.List;

@Name("commandLine")
@com.redhat.ceylon.compiler.java.metadata.Object
public class commandLine_ {

  private static final commandLine_ instance = new commandLine_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.cli::commandLine")
  public static commandLine_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CommandLine")
  public static CommandLine create(
    final @TypeInfo("io.vertx.ceylon.core.cli::CLI") @Name("cli") @DocAnnotation$annotation$(description = "todo") CLI cli) {
    io.vertx.core.cli.CLI arg_0 = io.vertx.ceylon.core.cli.CLI.TO_JAVA.safeConvert(cli);
    CommandLine ret = io.vertx.ceylon.core.cli.CommandLine.TO_CEYLON.safeConvert(io.vertx.core.cli.CommandLine.create(arg_0));
    return ret;
  }

}
