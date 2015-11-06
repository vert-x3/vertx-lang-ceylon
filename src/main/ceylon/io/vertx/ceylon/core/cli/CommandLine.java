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

@DocAnnotation$annotation$(description = "todo")
public class CommandLine {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(CommandLine.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.cli.CommandLine, CommandLine> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.cli.CommandLine, CommandLine>() {
    public CommandLine convert(io.vertx.core.cli.CommandLine src) {
      return new CommandLine(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<CommandLine, io.vertx.core.cli.CommandLine> TO_JAVA = new io.vertx.lang.ceylon.Converter<CommandLine, io.vertx.core.cli.CommandLine>() {
    public io.vertx.core.cli.CommandLine convert(CommandLine src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.cli.CommandLine delegate;

  public CommandLine(io.vertx.core.cli.CommandLine delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CommandLine")
  public static CommandLine create(
    final @TypeInfo("io.vertx.ceylon.core.cli::CLI") @Name("cli") @DocAnnotation$annotation$(description = "todo") CLI cli) {
    io.vertx.core.cli.CLI arg_0 = io.vertx.ceylon.core.cli.CLI.TO_JAVA.safeConvert(cli);
    CommandLine ret = io.vertx.ceylon.core.cli.CommandLine.TO_CEYLON.safeConvert(io.vertx.core.cli.CommandLine.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI cli() {
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.safeConvert(delegate.cli());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> allArguments() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.allArguments(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Object?")
  public Object getOptionValue(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    Object ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.getOptionValue(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Object?")
  public Object getArgumentValue(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    Object ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.getArgumentValue(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Object?")
  public Object getArgumentValue(
    final @TypeInfo("ceylon.language::Integer") @Name("index") @DocAnnotation$annotation$(description = "todo") long index) {
    int arg_0 = (int)index;
    Object ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.getArgumentValue(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isFlagEnabled(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    boolean ret = delegate.isFlagEnabled(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isOptionAssigned(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    boolean ret = delegate.isOptionAssigned(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> getRawValues(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.getRawValues(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> getRawValuesForOption(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.getRawValuesForOption(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> getRawValuesForArgument(
    final @TypeInfo("io.vertx.ceylon.core.cli::Argument") @Name("argument") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Argument argument) {
    io.vertx.core.cli.Argument arg_0 = argument == null ? null : new io.vertx.core.cli.Argument(io.vertx.lang.ceylon.ToJava.JsonObject.convert(argument.toJson()));
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.getRawValuesForArgument(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getRawValueForOption(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getRawValueForOption(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean acceptMoreValues(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    boolean ret = delegate.acceptMoreValues(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getRawValueForArgument(
    final @TypeInfo("io.vertx.ceylon.core.cli::Argument") @Name("arg") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Argument arg) {
    io.vertx.core.cli.Argument arg_0 = arg == null ? null : new io.vertx.core.cli.Argument(io.vertx.lang.ceylon.ToJava.JsonObject.convert(arg.toJson()));
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getRawValueForArgument(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isArgumentAssigned(
    final @TypeInfo("io.vertx.ceylon.core.cli::Argument") @Name("arg") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Argument arg) {
    io.vertx.core.cli.Argument arg_0 = arg == null ? null : new io.vertx.core.cli.Argument(io.vertx.lang.ceylon.ToJava.JsonObject.convert(arg.toJson()));
    boolean ret = delegate.isArgumentAssigned(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isSeenInCommandLine(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    boolean ret = delegate.isSeenInCommandLine(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isValid() {
    boolean ret = delegate.isValid();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isAskingForHelp() {
    boolean ret = delegate.isAskingForHelp();
    return ret;
  }

}
