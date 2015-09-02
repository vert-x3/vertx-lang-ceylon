package io.vertx.ceylon.core.file;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class AsyncFile implements ReadStream<Buffer>, WriteStream<Buffer> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(AsyncFile.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.file.AsyncFile, AsyncFile> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.file.AsyncFile, AsyncFile>() {
    public AsyncFile convert(io.vertx.core.file.AsyncFile src) {
      return new AsyncFile(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<AsyncFile, io.vertx.core.file.AsyncFile> TO_JAVA = new io.vertx.lang.ceylon.Converter<AsyncFile, io.vertx.core.file.AsyncFile>() {
    public io.vertx.core.file.AsyncFile convert(AsyncFile src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.file.AsyncFile delegate;

  public AsyncFile(io.vertx.core.file.AsyncFile delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(event)); } };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile pause() {
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.pause());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile resume() {
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.convert(data);
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile drainHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$(); } };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.drainHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.close(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer buffer, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long position, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.convert(buffer);
    long arg_1 = position;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) { public Object toCeylon(java.lang.Void event) { return null; } };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.write(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile read(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer buffer, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long offset, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long position, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long length, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.buffer::Buffer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.convert(buffer);
    int arg_1 = (int)offset;
    long arg_2 = position;
    int arg_3 = (int)length;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> arg_4 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.buffer.Buffer>(handler) { public Object toCeylon(io.vertx.core.buffer.Buffer event) { return io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(event); } };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.read(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile flush() {
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.flush());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile flush(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) { public Object toCeylon(java.lang.Void event) { return null; } };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.flush(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile setReadPos(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long readPos) {
    long arg_0 = readPos;
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.setReadPos(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile setWritePos(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long writePos) {
    long arg_0 = writePos;
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.convert(delegate.setWritePos(arg_0));
    return this;
  }

}
