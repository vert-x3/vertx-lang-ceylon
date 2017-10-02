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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a SQL query interface to a database\n")
public interface SQLQuery {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLQuery, SQLQuery> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLQuery, SQLQuery>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLQuery, SQLQuery> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLQuery, SQLQuery>() {
        public SQLQuery convert(io.vertx.ext.sql.SQLQuery src) {
          return new SQLQuery.Impl(src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<SQLQuery, io.vertx.ext.sql.SQLQuery> TO_JAVA = new io.vertx.lang.ceylon.Converter<SQLQuery, io.vertx.ext.sql.SQLQuery>() {
    public io.vertx.ext.sql.SQLQuery convert(SQLQuery src) {
      return (io.vertx.ext.sql.SQLQuery)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SQLQuery.class);
  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> statement which returns the results of the query.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLQuery")
  public SQLQuery query(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler);

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> prepared statement which returns the results of the query.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLQuery")
  public SQLQuery queryWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params")@DocAnnotation$annotation$(description = "these are the parameters to fill the statement.\n") ceylon.json.Array params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler);

  @DocAnnotation$annotation$(description = " Execute a one shot SQL statement that returns a single SQL row. This method will reduce the boilerplate code by\n getting a connection from the pool (this object) and return it back after the execution. Only the first result\n from the result set is returned.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLQuery")
  public SQLQuery querySingle(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the statement to execute\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Execute a one shot SQL statement with arguments that returns a single SQL row. This method will reduce the\n boilerplate code by getting a connection from the pool (this object) and return it back after the execution.\n Only the first result from the result set is returned.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLQuery")
  public SQLQuery querySingleWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the statement to execute\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("arguments")@DocAnnotation$annotation$(description = "the arguments\n") ceylon.json.Array arguments, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler);

  @Ignore
  public class Impl implements SQLQuery {
    @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(SQLQuery.class), io.vertx.ext.sql.SQLQuery.class, TO_JAVA, TO_CEYLON);
    @Ignore private final io.vertx.ext.sql.SQLQuery delegate;

    public Impl(io.vertx.ext.sql.SQLQuery delegate) {
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

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> statement which returns the results of the query.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLQuery")
  public SQLQuery query(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.ResultSet>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.ResultSet event) {
        return io.vertx.ceylon.sql.resultSet_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLQuery ret = io.vertx.ceylon.sql.SQLQuery.TO_CEYLON.converter().safeConvert(delegate.query(arg_0, arg_1));
      return this;
    }

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> prepared statement which returns the results of the query.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLQuery")
  public SQLQuery queryWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params")@DocAnnotation$annotation$(description = "these are the parameters to fill the statement.\n") ceylon.json.Array params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(params);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.ResultSet>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.ResultSet event) {
        return io.vertx.ceylon.sql.resultSet_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLQuery ret = io.vertx.ceylon.sql.SQLQuery.TO_CEYLON.converter().safeConvert(delegate.queryWithParams(arg_0, arg_1, arg_2));
      return this;
    }

  @DocAnnotation$annotation$(description = " Execute a one shot SQL statement that returns a single SQL row. This method will reduce the boilerplate code by\n getting a connection from the pool (this object) and return it back after the execution. Only the first result\n from the result set is returned.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLQuery")
  public SQLQuery querySingle(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the statement to execute\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.json.JsonArray>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonArray event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event);
      }
    };
    SQLQuery ret = io.vertx.ceylon.sql.SQLQuery.TO_CEYLON.converter().safeConvert(delegate.querySingle(arg_0, arg_1));
      return this;
    }

  @DocAnnotation$annotation$(description = " Execute a one shot SQL statement with arguments that returns a single SQL row. This method will reduce the\n boilerplate code by getting a connection from the pool (this object) and return it back after the execution.\n Only the first result from the result set is returned.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLQuery")
  public SQLQuery querySingleWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the statement to execute\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("arguments")@DocAnnotation$annotation$(description = "the arguments\n") ceylon.json.Array arguments, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(arguments);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonArray>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.json.JsonArray>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonArray event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(event);
      }
    };
    SQLQuery ret = io.vertx.ceylon.sql.SQLQuery.TO_CEYLON.converter().safeConvert(delegate.querySingleWithParams(arg_0, arg_1, arg_2));
      return this;
    }
  }

}
