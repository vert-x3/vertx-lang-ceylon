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

@Ceylon(major = 8)
@Name("commandLine")
@com.redhat.ceylon.compiler.java.metadata.Object
public class commandLine_ implements ReifiedType {

  private static final commandLine_ instance = new commandLine_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(commandLine_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.cli::commandLine")
  public static commandLine_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Creates a command line object from the [CLI](../cli/CLI.type.html). This object is intended to be used by\n the parser to set the argument and option values.\n")
  @TypeInfo("io.vertx.ceylon.core.cli::CommandLine")
  public CommandLine create(
    final @TypeInfo("io.vertx.ceylon.core.cli::CLI") @Name("cli") @DocAnnotation$annotation$(description = "the CLI definition\n") CLI cli) {
    io.vertx.core.cli.CLI arg_0 = io.vertx.ceylon.core.cli.CLI.TO_JAVA.safeConvert(cli);
    CommandLine ret = io.vertx.ceylon.core.cli.CommandLine.TO_CEYLON.converter().safeConvert(io.vertx.core.cli.CommandLine.create(arg_0));
    return ret;
  }

}
