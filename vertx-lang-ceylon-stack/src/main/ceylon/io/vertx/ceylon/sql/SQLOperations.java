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
public interface SQLOperations {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLOperations, SQLOperations> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLOperations, SQLOperations>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLOperations, SQLOperations> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLOperations, SQLOperations>() {
        public SQLOperations convert(io.vertx.ext.sql.SQLOperations src) {
          return new SQLOperations.Impl(src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<SQLOperations, io.vertx.ext.sql.SQLOperations> TO_JAVA = new io.vertx.lang.ceylon.Converter<SQLOperations, io.vertx.ext.sql.SQLOperations>() {
    public io.vertx.ext.sql.SQLOperations convert(SQLOperations src) {
      return (io.vertx.ext.sql.SQLOperations)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SQLOperations.class);
  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> statement which returns the results of the query.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations query(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler);

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> prepared statement which returns the results of the query.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations queryWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params")@DocAnnotation$annotation$(description = "these are the parameters to fill the statement.\n") ceylon.json.Array params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler);

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations queryStream(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::SQLRowStream)") @Name("handler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>.\n") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations queryStreamWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params")@DocAnnotation$annotation$(description = "these are the parameters to fill the statement.\n") ceylon.json.Array params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::SQLRowStream)") @Name("handler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>.\n") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Execute a one shot SQL statement that returns a single SQL row. This method will reduce the boilerplate code by\n getting a connection from the pool (this object) and return it back after the execution. Only the first result\n from the result set is returned.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations querySingle(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the statement to execute\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array?)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Execute a one shot SQL statement with arguments that returns a single SQL row. This method will reduce the\n boilerplate code by getting a connection from the pool (this object) and return it back after the execution.\n Only the first result from the result set is returned.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations querySingleWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the statement to execute\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("arguments")@DocAnnotation$annotation$(description = "the arguments\n") ceylon.json.Array arguments, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Array?)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Executes the given SQL statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>\n statement.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations update(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>INSERT INTO table ...</code>\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::UpdateResult)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes.\n") Callable<?> resultHandler);

  @DocAnnotation$annotation$(description = " Executes the given prepared statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>\n statement with the given parameters\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations updateWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>INSERT INTO table ...</code>\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params")@DocAnnotation$annotation$(description = "these are the parameters to fill the statement.\n") ceylon.json.Array params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::UpdateResult)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes.\n") Callable<?> resultHandler);

  @DocAnnotation$annotation$(description = " Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations call(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>{call getEmpName}</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler);

  @DocAnnotation$annotation$(description = " Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.\n\n The index of params and outputs are important for both arrays, for example when dealing with a prodecure that\n takes the first 2 arguments as input values and the 3 arg as an output then the arrays should be like:\n\n <pre>\n   params = [VALUE1, VALUE2, null]\n   outputs = [null, null, \"VARCHAR\"]\n </pre>\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations callWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>{call getEmpName (?, ?)}</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params")@DocAnnotation$annotation$(description = "these are the parameters to fill the statement.\n") ceylon.json.Array params, 
    final @TypeInfo("ceylon.json::Array") @Name("outputs")@DocAnnotation$annotation$(description = "these are the outputs to fill the statement.\n") ceylon.json.Array outputs, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler);

  @Ignore
  public class Impl implements SQLOperations {
    @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(SQLOperations.class), io.vertx.ext.sql.SQLOperations.class, TO_JAVA, TO_CEYLON);
    @Ignore private final io.vertx.ext.sql.SQLOperations delegate;

    public Impl(io.vertx.ext.sql.SQLOperations delegate) {
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
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations query(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.ResultSet>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.ResultSet event) {
        return io.vertx.ceylon.sql.resultSet_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLOperations ret = io.vertx.ceylon.sql.SQLOperations.TO_CEYLON.converter().safeConvert(delegate.query(arg_0, arg_1));
      return this;
    }

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> prepared statement which returns the results of the query.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations queryWithParams(
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
    SQLOperations ret = io.vertx.ceylon.sql.SQLOperations.TO_CEYLON.converter().safeConvert(delegate.queryWithParams(arg_0, arg_1, arg_2));
      return this;
    }

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations queryStream(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::SQLRowStream)") @Name("handler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.SQLRowStream>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.SQLRowStream>(handler) {
      public Object toCeylon(io.vertx.ext.sql.SQLRowStream event) {
        return io.vertx.ceylon.sql.SQLRowStream.TO_CEYLON.converter().safeConvert(event);
      }
    };
    SQLOperations ret = io.vertx.ceylon.sql.SQLOperations.TO_CEYLON.converter().safeConvert(delegate.queryStream(arg_0, arg_1));
      return this;
    }

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations queryStreamWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params")@DocAnnotation$annotation$(description = "these are the parameters to fill the statement.\n") ceylon.json.Array params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::SQLRowStream)") @Name("handler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(params);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.SQLRowStream>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.SQLRowStream>(handler) {
      public Object toCeylon(io.vertx.ext.sql.SQLRowStream event) {
        return io.vertx.ceylon.sql.SQLRowStream.TO_CEYLON.converter().safeConvert(event);
      }
    };
    SQLOperations ret = io.vertx.ceylon.sql.SQLOperations.TO_CEYLON.converter().safeConvert(delegate.queryStreamWithParams(arg_0, arg_1, arg_2));
      return this;
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

  @DocAnnotation$annotation$(description = " Executes the given SQL statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>\n statement.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations update(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>INSERT INTO table ...</code>\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::UpdateResult)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.UpdateResult>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.UpdateResult>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.UpdateResult event) {
        return io.vertx.ceylon.sql.updateResult_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLOperations ret = io.vertx.ceylon.sql.SQLOperations.TO_CEYLON.converter().safeConvert(delegate.update(arg_0, arg_1));
      return this;
    }

  @DocAnnotation$annotation$(description = " Executes the given prepared statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>\n statement with the given parameters\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations updateWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>INSERT INTO table ...</code>\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params")@DocAnnotation$annotation$(description = "these are the parameters to fill the statement.\n") ceylon.json.Array params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::UpdateResult)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(params);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.UpdateResult>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.UpdateResult>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.UpdateResult event) {
        return io.vertx.ceylon.sql.updateResult_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLOperations ret = io.vertx.ceylon.sql.SQLOperations.TO_CEYLON.converter().safeConvert(delegate.updateWithParams(arg_0, arg_1, arg_2));
      return this;
    }

  @DocAnnotation$annotation$(description = " Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations call(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>{call getEmpName}</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.ResultSet>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.ResultSet event) {
        return io.vertx.ceylon.sql.resultSet_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLOperations ret = io.vertx.ceylon.sql.SQLOperations.TO_CEYLON.converter().safeConvert(delegate.call(arg_0, arg_1));
      return this;
    }

  @DocAnnotation$annotation$(description = " Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.\n\n The index of params and outputs are important for both arrays, for example when dealing with a prodecure that\n takes the first 2 arguments as input values and the 3 arg as an output then the arrays should be like:\n\n <pre>\n   params = [VALUE1, VALUE2, null]\n   outputs = [null, null, \"VARCHAR\"]\n </pre>\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLOperations")
  public SQLOperations callWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>{call getEmpName (?, ?)}</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params")@DocAnnotation$annotation$(description = "these are the parameters to fill the statement.\n") ceylon.json.Array params, 
    final @TypeInfo("ceylon.json::Array") @Name("outputs")@DocAnnotation$annotation$(description = "these are the outputs to fill the statement.\n") ceylon.json.Array outputs, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(params);
    io.vertx.core.json.JsonArray arg_2 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(outputs);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>> arg_3 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.ResultSet>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.ResultSet event) {
        return io.vertx.ceylon.sql.resultSet_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLOperations ret = io.vertx.ceylon.sql.SQLOperations.TO_CEYLON.converter().safeConvert(delegate.callWithParams(arg_0, arg_1, arg_2, arg_3));
      return this;
    }
  }

}
