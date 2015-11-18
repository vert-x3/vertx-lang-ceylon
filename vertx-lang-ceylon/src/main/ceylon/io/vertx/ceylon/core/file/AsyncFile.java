package io.vertx.ceylon.core.file;

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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a file on the file-system which can be read from, or written to asynchronously.\n <p>\n This class also implements [ReadStream](../streams/ReadStream.type.html) and\n [WriteStream](../streams/WriteStream.type.html). This allows the data to be pumped to and from\n other streams, e.g. an [HttpClientRequest](../http/HttpClientRequest.type.html) instance,\n using the [Pump](../streams/Pump.type.html) class\n")
public class AsyncFile implements ReifiedType,  ReadStream<Buffer>,  WriteStream<Buffer> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.file.AsyncFile, AsyncFile> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.file.AsyncFile, AsyncFile>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.file.AsyncFile, AsyncFile> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.file.AsyncFile, AsyncFile>() {
        public AsyncFile convert(io.vertx.core.file.AsyncFile src) {
          return new AsyncFile(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<AsyncFile, io.vertx.core.file.AsyncFile> TO_JAVA = new io.vertx.lang.ceylon.Converter<AsyncFile, io.vertx.core.file.AsyncFile>() {
    public io.vertx.core.file.AsyncFile convert(AsyncFile src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(AsyncFile.class);
  @Ignore private final io.vertx.core.file.AsyncFile delegate;

  public AsyncFile(io.vertx.core.file.AsyncFile delegate) {
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

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [AsyncFile](../file/AsyncFile.type.html)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile pause() {
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile resume() {
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Close the file. The actual close happens asynchronously.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = " Close the file. The actual close happens asynchronously.\n The handler will be called when the close is complete, or an error occurs.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.close(arg_0);
  }

  @DocAnnotation$annotation$(description = " Write a [Buffer](../buffer/Buffer.type.html) to the file at position <code>position</code> in the file, asynchronously.\n <p>\n If <code>position</code> lies outside of the current size\n of the file, the file will be enlarged to encompass it.\n <p>\n When multiple writes are invoked on the same file\n there are no guarantees as to order in which those writes actually occur\n <p>\n The handler will be called when the write is complete, or if an error occurs.\n")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("buffer") @DocAnnotation$annotation$(description = "todo") Buffer buffer, 
    final @TypeInfo("ceylon.language::Integer") @Name("position") @DocAnnotation$annotation$(description = "todo") long position, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(buffer);
    long arg_1 = position;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.write(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Reads <code>length</code> bytes of data from the file at position <code>position</code> in the file, asynchronously.\n <p>\n The read data will be written into the specified <code>Buffer buffer</code> at position <code>offset</code>.\n <p>\n If data is read past the end of the file then zero bytes will be read.<p>\n When multiple reads are invoked on the same file there are no guarantees as to order in which those reads actually occur.\n <p>\n The handler will be called when the close is complete, or if an error occurs.\n")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile read(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("buffer") @DocAnnotation$annotation$(description = "todo") Buffer buffer, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset") @DocAnnotation$annotation$(description = "todo") long offset, 
    final @TypeInfo("ceylon.language::Integer") @Name("position") @DocAnnotation$annotation$(description = "todo") long position, 
    final @TypeInfo("ceylon.language::Integer") @Name("length") @DocAnnotation$annotation$(description = "todo") long length, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.buffer::Buffer)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(buffer);
    int arg_1 = (int)offset;
    long arg_2 = position;
    int arg_3 = (int)length;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> arg_4 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.buffer.Buffer>(handler) {
      public Object toCeylon(io.vertx.core.buffer.Buffer event) {
        return io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.read(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = " Flush any writes made to this file to underlying persistent storage.\n <p>\n If the file was opened with <code>flush</code> set to <code>true</code> then calling this method will have no effect.\n <p>\n The actual flush will happen asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile flush() {
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.flush());
    return this;
  }

  @DocAnnotation$annotation$(description = " Same as [AsyncFile](../file/AsyncFile.type.html) but the handler will be called when the flush is complete or if an error occurs\n")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile flush(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.flush(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the position from which data will be read from when using the file as a [ReadStream](../streams/ReadStream.type.html).\n")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile setReadPos(
    final @TypeInfo("ceylon.language::Integer") @Name("readPos") @DocAnnotation$annotation$(description = "todo") long readPos) {
    long arg_0 = readPos;
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.setReadPos(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the position from which data will be written when using the file as a [WriteStream](../streams/WriteStream.type.html).\n")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile setWritePos(
    final @TypeInfo("ceylon.language::Integer") @Name("writePos") @DocAnnotation$annotation$(description = "todo") long writePos) {
    long arg_0 = writePos;
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.setWritePos(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the buffer size that will be used to read the data from the file. Changing this value will impact how much\n the data will be read at a time from the file system.\n")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile setReadBufferSize(
    final @TypeInfo("ceylon.language::Integer") @Name("readBufferSize") @DocAnnotation$annotation$(description = "todo") long readBufferSize) {
    int arg_0 = (int)readBufferSize;
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.setReadBufferSize(arg_0));
    return this;
  }

}
