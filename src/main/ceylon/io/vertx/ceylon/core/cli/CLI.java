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
@DocAnnotation$annotation$(description = "todo")
public class CLI implements ReifiedType {

  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.cli.CLI, CLI> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.cli.CLI, CLI>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.cli.CLI, CLI> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.cli.CLI, CLI>() {
        public CLI convert(io.vertx.core.cli.CLI src) {
          return new CLI(src);
        }
      };
    }
  };

  public static final io.vertx.lang.ceylon.Converter<CLI, io.vertx.core.cli.CLI> TO_JAVA = new io.vertx.lang.ceylon.Converter<CLI, io.vertx.core.cli.CLI>() {
    public io.vertx.core.cli.CLI convert(CLI src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(CLI.class);
  @Ignore private final io.vertx.core.cli.CLI delegate;

  public CLI(io.vertx.core.cli.CLI delegate) {
    this.delegate = delegate;
  }

  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CommandLine")
  public CommandLine parse(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @Name("arguments") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> arguments) {
    java.util.List<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(arguments, io.vertx.lang.ceylon.ToJava.String);
    CommandLine ret = io.vertx.ceylon.core.cli.CommandLine.TO_CEYLON.converter().safeConvert(delegate.parse(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CommandLine")
  public CommandLine parse(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @Name("arguments") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> arguments, 
    final @TypeInfo("ceylon.language::Boolean") @Name("validate") @DocAnnotation$annotation$(description = "todo") boolean validate) {
    java.util.List<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(arguments, io.vertx.lang.ceylon.ToJava.String);
    boolean arg_1 = validate;
    CommandLine ret = io.vertx.ceylon.core.cli.CommandLine.TO_CEYLON.converter().safeConvert(delegate.parse(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getName() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getName());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI setName(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.setName(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getDescription() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getDescription());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI setDescription(
    final @TypeInfo("ceylon.language::String") @Name("desc") @DocAnnotation$annotation$(description = "todo") ceylon.language.String desc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(desc);
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.setDescription(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getSummary() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getSummary());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI setSummary(
    final @TypeInfo("ceylon.language::String") @Name("summary") @DocAnnotation$annotation$(description = "todo") ceylon.language.String summary) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(summary);
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.setSummary(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isHidden() {
    boolean ret = delegate.isHidden();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI setHidden(
    final @TypeInfo("ceylon.language::Boolean") @Name("hidden") @DocAnnotation$annotation$(description = "todo") boolean hidden) {
    boolean arg_0 = hidden;
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.setHidden(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.core.cli::Option>")
  public ceylon.language.List<io.vertx.ceylon.core.cli.Option> getOptions() {
    ceylon.language.List<io.vertx.ceylon.core.cli.Option> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.core.cli.Option.$TypeDescriptor$, delegate.getOptions(), io.vertx.ceylon.core.cli.toCeylonOption_.get_());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI addOption(
    final @TypeInfo("io.vertx.ceylon.core.cli::Option") @Name("option") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Option option) {
    io.vertx.core.cli.Option arg_0 = option == null ? null : new io.vertx.core.cli.Option(io.vertx.lang.ceylon.ToJava.JsonObject.convert(option.toJson()));
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.addOption(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI addOptions(
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.core.cli::Option>") @Name("options") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<io.vertx.ceylon.core.cli.Option> options) {
    java.util.List<io.vertx.core.cli.Option> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(options, io.vertx.ceylon.core.cli.toJavaOption_.get_());
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.addOptions(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI setOptions(
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.core.cli::Option>") @Name("options") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<io.vertx.ceylon.core.cli.Option> options) {
    java.util.List<io.vertx.core.cli.Option> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(options, io.vertx.ceylon.core.cli.toJavaOption_.get_());
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.setOptions(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<io.vertx.ceylon.core.cli::Argument>")
  public ceylon.language.List<io.vertx.ceylon.core.cli.Argument> getArguments() {
    ceylon.language.List<io.vertx.ceylon.core.cli.Argument> ret = io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.core.cli.Argument.$TypeDescriptor$, delegate.getArguments(), io.vertx.ceylon.core.cli.toCeylonArgument_.get_());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI addArgument(
    final @TypeInfo("io.vertx.ceylon.core.cli::Argument") @Name("arg") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.cli.Argument arg) {
    io.vertx.core.cli.Argument arg_0 = arg == null ? null : new io.vertx.core.cli.Argument(io.vertx.lang.ceylon.ToJava.JsonObject.convert(arg.toJson()));
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.addArgument(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI addArguments(
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.core.cli::Argument>") @Name("args") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<io.vertx.ceylon.core.cli.Argument> args) {
    java.util.List<io.vertx.core.cli.Argument> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(args, io.vertx.ceylon.core.cli.toJavaArgument_.get_());
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.addArguments(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI setArguments(
    final @TypeInfo("ceylon.language::List<io.vertx.ceylon.core.cli::Argument>") @Name("args") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<io.vertx.ceylon.core.cli.Argument> args) {
    java.util.List<io.vertx.core.cli.Argument> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(args, io.vertx.ceylon.core.cli.toJavaArgument_.get_());
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.setArguments(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::Option?")
  public io.vertx.ceylon.core.cli.Option getOption(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.ceylon.core.cli.Option ret = io.vertx.ceylon.core.cli.toCeylonOption_.get_().safeConvert(delegate.getOption(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::Argument?")
  public io.vertx.ceylon.core.cli.Argument getArgument(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.ceylon.core.cli.Argument ret = io.vertx.ceylon.core.cli.toCeylonArgument_.get_().safeConvert(delegate.getArgument(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::Argument?")
  public io.vertx.ceylon.core.cli.Argument getArgument(
    final @TypeInfo("ceylon.language::Integer") @Name("index") @DocAnnotation$annotation$(description = "todo") long index) {
    int arg_0 = (int)index;
    io.vertx.ceylon.core.cli.Argument ret = io.vertx.ceylon.core.cli.toCeylonArgument_.get_().safeConvert(delegate.getArgument(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI removeOption(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.removeOption(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.cli::CLI")
  public CLI removeArgument(
    final @TypeInfo("ceylon.language::Integer") @Name("index") @DocAnnotation$annotation$(description = "todo") long index) {
    int arg_0 = (int)index;
    CLI ret = io.vertx.ceylon.core.cli.CLI.TO_CEYLON.converter().safeConvert(delegate.removeArgument(arg_0));
    return this;
  }

}
