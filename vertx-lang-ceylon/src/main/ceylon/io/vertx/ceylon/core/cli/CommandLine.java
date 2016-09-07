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
@DocAnnotation$annotation$(description = " The parser transforms a CLI (a model) into an [CommandLine](../cli/CommandLine.type.html). This [CommandLine](../cli/CommandLine.type.html)\n has stored the argument and option values. Only  instance of parser should create\n objects of this type.\n")
public class CommandLine implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.cli.CommandLine, CommandLine> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.cli.CommandLine, CommandLine>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.cli.CommandLine, CommandLine> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.cli.CommandLine, CommandLine>() {
        public CommandLine convert(io.vertx.core.cli.CommandLine src) {
          return new CommandLine(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<CommandLine, io.vertx.core.cli.CommandLine> TO_JAVA = new io.vertx.lang.ceylon.Converter<CommandLine, io.vertx.core.cli.CommandLine>() {
    public io.vertx.core.cli.CommandLine convert(CommandLine src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(CommandLine.class);
  @Ignore private final io.vertx.core.cli.CommandLine delegate;

  public CommandLine(io.vertx.core.cli.CommandLine delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI cli() {
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.cli());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> allArguments() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.allArguments(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Gets the value of an option with the matching name (can be the long name, short name or arg name).\n")
  @TypeInfo("T?")
  public <T> T getOptionValue(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.getOptionValue(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Gets the value of an argument with the matching name (arg name).\n")
  @TypeInfo("T?")
  public <T> T getArgumentValue(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.getArgumentValue(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Gets the value of an argument with the given index.\n")
  @TypeInfo("T?")
  public <T> T getArgumentValue(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Integer") @Name("index") @DocAnnotation$annotation$(description = "the index\n") long index) {
    int arg_0 = (int)index;
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.getArgumentValue(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets the value of an option marked as a flag.\n <p/>\n Calling this method an a non-flag option throws an `java.lang.IllegalStateException`.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isFlagEnabled(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the option name\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    boolean ret = delegate.isFlagEnabled(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Checks whether or not the given option has been assigned in the command line.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isOptionAssigned(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "the option\n") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    boolean ret = delegate.isOptionAssigned(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets the raw values of the given option. Raw values are simple \"String\", not converted to the option type.\n")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> getRawValues(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "the option\n") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.getRawValues(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets the raw values of the given option. Raw values are simple \"String\", not converted to the option type.\n")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> getRawValuesForOption(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "the option\n") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.getRawValuesForOption(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets the raw values of the given argument. Raw values are simple \"String\", not converted to the argument type.\n")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> getRawValuesForArgument(
    final @TypeInfo("io.vertx.ceylon.core.cli::Argument") @Name("argument") @DocAnnotation$annotation$(description = "the argument\n") io.vertx.ceylon.core.cli.Argument argument) {
    io.vertx.core.cli.Argument arg_0 = argument == null ? null : new io.vertx.core.cli.Argument(io.vertx.lang.ceylon.ToJava.JsonObject.convert(argument.toJson()));
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.getRawValuesForArgument(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets the raw value of the given option. Raw values are the values as given in the user command line.\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getRawValueForOption(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "the option\n") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getRawValueForOption(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Checks whether or not the given option accept more values.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean acceptMoreValues(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "the option\n") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    boolean ret = delegate.acceptMoreValues(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets the raw value of the given argument. Raw values are the values as given in the user command line.\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getRawValueForArgument(
    final @TypeInfo("io.vertx.ceylon.core.cli::Argument") @Name("arg") @DocAnnotation$annotation$(description = "the argument\n") io.vertx.ceylon.core.cli.Argument arg) {
    io.vertx.core.cli.Argument arg_0 = arg == null ? null : new io.vertx.core.cli.Argument(io.vertx.lang.ceylon.ToJava.JsonObject.convert(arg.toJson()));
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getRawValueForArgument(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Checks whether or not the given argument has been assigned in the command line.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isArgumentAssigned(
    final @TypeInfo("io.vertx.ceylon.core.cli::Argument") @Name("arg") @DocAnnotation$annotation$(description = "the argument\n") io.vertx.ceylon.core.cli.Argument arg) {
    io.vertx.core.cli.Argument arg_0 = arg == null ? null : new io.vertx.core.cli.Argument(io.vertx.lang.ceylon.ToJava.JsonObject.convert(arg.toJson()));
    boolean ret = delegate.isArgumentAssigned(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Checks whether or not the given option has been seen in the user command line.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isSeenInCommandLine(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "the option\n") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    boolean ret = delegate.isSeenInCommandLine(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Checks whether or not the command line is valid, i.e. all constraints from arguments and options have been\n satisfied. This method is used when the parser validation is disabled.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isValid() {
    boolean ret = delegate.isValid();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Checks whether or not the user has passed a \"help\" option and is asking for help.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isAskingForHelp() {
    boolean ret = delegate.isAskingForHelp();
    return ret;
  }

}
