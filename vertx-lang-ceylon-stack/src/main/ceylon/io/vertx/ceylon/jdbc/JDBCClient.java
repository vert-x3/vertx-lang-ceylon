package io.vertx.ceylon.jdbc;

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
import io.vertx.ceylon.sql.SQLRowStream;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonArray;
import io.vertx.ceylon.sql.SQLConnection;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.ceylon.sql.SQLClient;
import io.vertx.core.Handler;
import io.vertx.ceylon.sql.SQLOperations;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " An asynchronous client interface for interacting with a JDBC compliant database\n")
public class JDBCClient extends SQLClient implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.jdbc.JDBCClient, JDBCClient> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.jdbc.JDBCClient, JDBCClient>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.jdbc.JDBCClient, JDBCClient> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.jdbc.JDBCClient, JDBCClient>() {
        public JDBCClient convert(io.vertx.ext.jdbc.JDBCClient src) {
          return new JDBCClient(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<JDBCClient, io.vertx.ext.jdbc.JDBCClient> TO_JAVA = new io.vertx.lang.ceylon.Converter<JDBCClient, io.vertx.ext.jdbc.JDBCClient>() {
    public io.vertx.ext.jdbc.JDBCClient convert(JDBCClient src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(JDBCClient.class), io.vertx.ext.jdbc.JDBCClient.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.jdbc.JDBCClient delegate;

  public JDBCClient(io.vertx.ext.jdbc.JDBCClient delegate) {
    super(delegate);
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

  @DocAnnotation$annotation$(description = " Execute a one shot SQL statement that returns a single SQL row. This method will reduce the boilerplate code by\n getting a connection from the pool (this object) and return it back after the execution. Only the first result\n from the result set is returned.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations querySingle(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the statement to execute\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array?)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.json.JsonArray>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonArray event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event);
      }
    };
    SQLOperations ret = io.vertx.ceylon.sql.SQLOperations.TO_CEYLON.converter().safeConvert(delegate.querySingle(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Execute a one shot SQL statement with arguments that returns a single SQL row. This method will reduce the\n boilerplate code by getting a connection from the pool (this object) and return it back after the execution.\n Only the first result from the result set is returned.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations querySingleWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the statement to execute\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("arguments")@DocAnnotation$annotation$(description = "the arguments\n") ceylon.json.Array arguments, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array?)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(arguments);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.json.JsonArray>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonArray event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event);
      }
    };
    SQLOperations ret = io.vertx.ceylon.sql.SQLOperations.TO_CEYLON.converter().safeConvert(delegate.querySingleWithParams(arg_0, arg_1, arg_2));
    return this;
  }

}
