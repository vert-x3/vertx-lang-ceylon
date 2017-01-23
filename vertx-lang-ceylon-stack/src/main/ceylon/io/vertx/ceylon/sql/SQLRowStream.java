package io.vertx.ceylon.sql;

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
import io.vertx.core.json.JsonArray;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A ReadStream of Rows from the underlying RDBMS. This class follows the ReadStream semantics and will automatically\n close the underlying resources if all returned rows are returned. For cases where the results are ignored before the\n full processing of the returned rows is complete the close method **MUST** be called in order to release underlying\n resources.\n\n The interface is minimal in order to support all SQL clients not just JDBC.\n")
public class SQLRowStream implements ReifiedType,  ReadStream<ceylon.json.Array> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLRowStream, SQLRowStream> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLRowStream, SQLRowStream>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLRowStream, SQLRowStream> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLRowStream, SQLRowStream>() {
        public SQLRowStream convert(io.vertx.ext.sql.SQLRowStream src) {
          return new SQLRowStream(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SQLRowStream, io.vertx.ext.sql.SQLRowStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<SQLRowStream, io.vertx.ext.sql.SQLRowStream>() {
    public io.vertx.ext.sql.SQLRowStream convert(SQLRowStream src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(SQLRowStream.class), io.vertx.ext.sql.SQLRowStream.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.sql.SQLRowStream delegate;

  public SQLRowStream(io.vertx.ext.sql.SQLRowStream delegate) {
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

  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<ceylon.json::Array>")
  public ReadStream<ceylon.json.Array> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("arg0") Callable<?> arg0) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = arg0 == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        arg0.$call$((Object)event);
      }
    };
    ReadStream<ceylon.json.Array> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter(ceylon.json.Array.$TypeDescriptor$).safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<ceylon.json::Array>")
  public ReadStream<ceylon.json.Array> handler(
    final @TypeInfo("ceylon.language::Anything(ceylon.json::Array)") @Name("arg0") Callable<?> arg0) {
    io.vertx.core.Handler<io.vertx.core.json.JsonArray> arg_0 = arg0 == null ? null : new io.vertx.core.Handler<io.vertx.core.json.JsonArray>() {
      public void handle(io.vertx.core.json.JsonArray event) {
        arg0.$call$((Object)io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event));
      }
    };
    ReadStream<ceylon.json.Array> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter(ceylon.json.Array.$TypeDescriptor$).safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<ceylon.json::Array>")
  public ReadStream<ceylon.json.Array> pause() {
    ReadStream<ceylon.json.Array> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter(ceylon.json.Array.$TypeDescriptor$).safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<ceylon.json::Array>")
  public ReadStream<ceylon.json.Array> resume() {
    ReadStream<ceylon.json.Array> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter(ceylon.json.Array.$TypeDescriptor$).safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<ceylon.json::Array>")
  public ReadStream<ceylon.json.Array> endHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("arg0") Callable<?> arg0) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = arg0 == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        arg0.$call$();
      }
    };
    ReadStream<ceylon.json.Array> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter(ceylon.json.Array.$TypeDescriptor$).safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Will convert the column name to the json array index.\n")
  @TypeInfo("ceylon.language::Integer")
  public long column(
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "the column name\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    long ret = delegate.column(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Event handler when a resultset is closed. This is useful to request for more results.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLRowStream")
  public SQLRowStream resultSetClosedHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    SQLRowStream ret = io.vertx.ceylon.sql.SQLRowStream.TO_CEYLON.converter().safeConvert(delegate.resultSetClosedHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Request for more results if available\n")
  @TypeInfo("ceylon.language::Anything")
  public void moreResults() {
    delegate.moreResults();
  }

  @DocAnnotation$annotation$(description = " Closes the stream/underlying cursor(s). The actual close happens asynchronously.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = " Closes the stream/underlying cursor(s). The actual close happens asynchronously.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler")@DocAnnotation$annotation$(description = "called when the stream/underlying cursor(s) is(are) closed\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.close(arg_0);
  }

}
