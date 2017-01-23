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
import java.util.List;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a connection to a SQL database\n")
public class SQLConnection implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLConnection, SQLConnection> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLConnection, SQLConnection>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLConnection, SQLConnection> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLConnection, SQLConnection>() {
        public SQLConnection convert(io.vertx.ext.sql.SQLConnection src) {
          return new SQLConnection(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SQLConnection, io.vertx.ext.sql.SQLConnection> TO_JAVA = new io.vertx.lang.ceylon.Converter<SQLConnection, io.vertx.ext.sql.SQLConnection>() {
    public io.vertx.ext.sql.SQLConnection convert(SQLConnection src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(SQLConnection.class), io.vertx.ext.sql.SQLConnection.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.sql.SQLConnection delegate;

  public SQLConnection(io.vertx.ext.sql.SQLConnection delegate) {
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

  @DocAnnotation$annotation$(description = " Sets the auto commit flag for this connection. True by default.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection setAutoCommit(
    final @TypeInfo("ceylon.language::Boolean") @Name("autoCommit")@DocAnnotation$annotation$(description = "the autoCommit flag, true by default.\n") boolean autoCommit, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once this operation completes.\n") Callable<?> resultHandler) {
    boolean arg_0 = autoCommit;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.setAutoCommit(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Executes the given SQL statement\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection execute(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>CREATE TABLE IF EXISTS table ...</code>\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once this operation completes.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.execute(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> statement which returns the results of the query.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection query(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.ResultSet>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.ResultSet event) {
        return io.vertx.ceylon.sql.resultSet_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.query(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection queryStream(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>SELECT * FROM table ...</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::SQLRowStream)") @Name("handler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.SQLRowStream>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.SQLRowStream>(handler) {
      public Object toCeylon(io.vertx.ext.sql.SQLRowStream event) {
        return io.vertx.ceylon.sql.SQLRowStream.TO_CEYLON.converter().safeConvert(event);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.queryStream(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> prepared statement which returns the results of the query.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection queryWithParams(
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
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.queryWithParams(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection queryStreamWithParams(
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
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.queryStreamWithParams(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Executes the given SQL statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>\n statement.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection update(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>INSERT INTO table ...</code>\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::UpdateResult)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.UpdateResult>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.UpdateResult>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.UpdateResult event) {
        return io.vertx.ceylon.sql.updateResult_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.update(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Executes the given prepared statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>\n statement with the given parameters\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection updateWithParams(
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
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.updateWithParams(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection call(
    final @TypeInfo("ceylon.language::String") @Name("sql")@DocAnnotation$annotation$(description = "the SQL to execute. For example <code>{call getEmpName}</code>.\n") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the handler which is called once the operation completes. It will return a <code>ResultSet</code>.\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.ResultSet>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.ResultSet event) {
        return io.vertx.ceylon.sql.resultSet_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.call(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.\n\n The index of params and outputs are important for both arrays, for example when dealing with a prodecure that\n takes the first 2 arguments as input values and the 3 arg as an output then the arrays should be like:\n\n <pre>\n   params = [VALUE1, VALUE2, null]\n   outputs = [null, null, \"VARCHAR\"]\n </pre>\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection callWithParams(
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
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.callWithParams(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Closes the connection. Important to always close the connection when you are done so it's returned to the pool.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler")@DocAnnotation$annotation$(description = "the handler called when this operation completes.\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.close(arg_0);
  }

  @DocAnnotation$annotation$(description = " Closes the connection. Important to always close the connection when you are done so it's returned to the pool.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = " Commits all changes made since the previous commit/rollback.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection commit(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler")@DocAnnotation$annotation$(description = "the handler called when this operation completes.\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.commit(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Rolls back all changes made since the previous commit/rollback.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection rollback(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler")@DocAnnotation$annotation$(description = "the handler called when this operation completes.\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.rollback(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets a connection wide query timeout.\n\n It can be over written at any time and becomes active on the next query call.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection setQueryTimeout(
    final @TypeInfo("ceylon.language::Integer") @Name("timeoutInSeconds")@DocAnnotation$annotation$(description = "the max amount of seconds the query can take to execute.\n") long timeoutInSeconds) {
    int arg_0 = (int)timeoutInSeconds;
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.setQueryTimeout(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Batch simple SQL strings and execute the batch where the async result contains a array of Integers.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection batch(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @Name("sqlStatements")@DocAnnotation$annotation$(description = "sql statement\n") ceylon.language.List<ceylon.language.String> sqlStatements, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer>)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler) {
    java.util.List<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(sqlStatements, io.vertx.lang.ceylon.ToJava.String);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.batch(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Batch a prepared statement with all entries from the args list. Each entry is a batch.\n The operation completes with the execution of the batch where the async result contains a array of Integers.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection batchWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sqlStatement")@DocAnnotation$annotation$(description = "sql statement\n") ceylon.language.String sqlStatement, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Array>") @Name("args")@DocAnnotation$annotation$(description = "the prepared statement arguments\n") ceylon.language.List<ceylon.json.Array> args, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer>)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sqlStatement);
    java.util.List<io.vertx.core.json.JsonArray> arg_1 = io.vertx.lang.ceylon.ToJava.convertList(args, io.vertx.lang.ceylon.ToJava.JsonArray);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.batchWithParams(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Batch a callable statement with all entries from the args list. Each entry is a batch.\n The size of the lists inArgs and outArgs MUST be the equal.\n The operation completes with the execution of the batch where the async result contains a array of Integers.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection batchCallableWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sqlStatement")@DocAnnotation$annotation$(description = "sql statement\n") ceylon.language.String sqlStatement, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Array>") @Name("inArgs")@DocAnnotation$annotation$(description = "the callable statement input arguments\n") ceylon.language.List<ceylon.json.Array> inArgs, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Array>") @Name("outArgs")@DocAnnotation$annotation$(description = "the callable statement output arguments\n") ceylon.language.List<ceylon.json.Array> outArgs, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::Integer>)") @Name("handler")@DocAnnotation$annotation$(description = "the result handler\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sqlStatement);
    java.util.List<io.vertx.core.json.JsonArray> arg_1 = io.vertx.lang.ceylon.ToJava.convertList(inArgs, io.vertx.lang.ceylon.ToJava.JsonArray);
    java.util.List<io.vertx.core.json.JsonArray> arg_2 = io.vertx.lang.ceylon.ToJava.convertList(outArgs, io.vertx.lang.ceylon.ToJava.JsonArray);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.Integer>>> arg_3 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<java.lang.Integer>>(handler) {
      public Object toCeylon(java.util.List<java.lang.Integer> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.Integer.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.Integer);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.batchCallableWithParams(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Attempts to change the transaction isolation level for this Connection object to the one given.\n\n The constants defined in the interface Connection are the possible transaction isolation levels.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection setTransactionIsolation(
    final @TypeInfo("io.vertx.ceylon.sql::TransactionIsolation") @Name("isolation")@DocAnnotation$annotation$(description = "the level of isolation\n") io.vertx.ceylon.sql.TransactionIsolation isolation, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler")@DocAnnotation$annotation$(description = "the handler called when this operation completes.\n") Callable<?> handler) {
    io.vertx.ext.sql.TransactionIsolation arg_0 = io.vertx.ceylon.sql.transactionIsolation_.get_().getToJava().safeConvert(isolation);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.setTransactionIsolation(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Attempts to return the transaction isolation level for this Connection object to the one given.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection getTransactionIsolation(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::TransactionIsolation)") @Name("handler")@DocAnnotation$annotation$(description = "the handler called when this operation completes.\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.TransactionIsolation>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.TransactionIsolation>(handler) {
      public Object toCeylon(io.vertx.ext.sql.TransactionIsolation event) {
        return io.vertx.ceylon.sql.transactionIsolation_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.getTransactionIsolation(arg_0));
    return this;
  }

}
