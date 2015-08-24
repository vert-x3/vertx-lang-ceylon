package io.vertx.ceylon.core.parsetools;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.core.Handler;

public class RecordParser {

  private final io.vertx.core.parsetools.RecordParser delegate;

  public RecordParser(io.vertx.core.parsetools.RecordParser delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Anything")
  public void setOutput(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") Callable<?> output) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { output.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    delegate.setOutput(arg_0);
  }

  @TypeInfo("io.vertx.ceylon.core.parsetools::RecordParser")
  public static RecordParser newDelimited(
    final @TypeInfo("ceylon.language::String") ceylon.language.String delim, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") Callable<?> output) {
    java.lang.String arg_0 = delim.toString();
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_1 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { output.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    RecordParser ret = new io.vertx.ceylon.core.parsetools.RecordParser(io.vertx.core.parsetools.RecordParser.newDelimited(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.parsetools::RecordParser")
  public static RecordParser newDelimited(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer delim, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") Callable<?> output) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)delim.getDelegate();
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_1 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { output.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    RecordParser ret = new io.vertx.ceylon.core.parsetools.RecordParser(io.vertx.core.parsetools.RecordParser.newDelimited(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.parsetools::RecordParser")
  public static RecordParser newFixed(
    final @TypeInfo("ceylon.language::Integer") long size, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") Callable<?> output) {
    int arg_0 = (int)size;
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_1 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { output.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    RecordParser ret = new io.vertx.ceylon.core.parsetools.RecordParser(io.vertx.core.parsetools.RecordParser.newFixed(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void delimitedMode(
    final @TypeInfo("ceylon.language::String") ceylon.language.String delim) {
    java.lang.String arg_0 = delim.toString();
    delegate.delimitedMode(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void delimitedMode(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer delim) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)delim.getDelegate();
    delegate.delimitedMode(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void fixedSizeMode(
    final @TypeInfo("ceylon.language::Integer") long size) {
    int arg_0 = (int)size;
    delegate.fixedSizeMode(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer buffer) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)buffer.getDelegate();
    delegate.handle(arg_0);
  }

}
