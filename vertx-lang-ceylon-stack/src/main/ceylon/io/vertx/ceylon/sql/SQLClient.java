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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A common asynchronous client interface for interacting with SQL compliant database\n")
public class SQLClient implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLClient, SQLClient> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLClient, SQLClient>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLClient, SQLClient> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLClient, SQLClient>() {
        public SQLClient convert(io.vertx.ext.sql.SQLClient src) {
          return new SQLClient(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SQLClient, io.vertx.ext.sql.SQLClient> TO_JAVA = new io.vertx.lang.ceylon.Converter<SQLClient, io.vertx.ext.sql.SQLClient>() {
    public io.vertx.ext.sql.SQLClient convert(SQLClient src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(SQLClient.class), io.vertx.ext.sql.SQLClient.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.sql.SQLClient delegate;

  public SQLClient(io.vertx.ext.sql.SQLClient delegate) {
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

  @DocAnnotation$annotation$(description = " Returns a connection that can be used to perform SQL operations on. It's important to remember\n to close the connection when you are done, so it is returned to the pool.\n")
  @TypeInfo("io.vertx.ceylon.sql::SQLClient")
  public SQLClient getConnection(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::SQLConnection)") @Name("handler")@DocAnnotation$annotation$(description = "the handler which is called when the <code>JdbcConnection</code> object is ready for use.\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.SQLConnection>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.sql.SQLConnection>(handler) {
      public Object toCeylon(io.vertx.ext.sql.SQLConnection event) {
        return io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(event);
      }
    };
    SQLClient ret = io.vertx.ceylon.sql.SQLClient.TO_CEYLON.converter().safeConvert(delegate.getConnection(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Close the client and release all resources.\n Call the handler when close is complete.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler")@DocAnnotation$annotation$(description = "the handler that will be called when close is complete\n") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = completionHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.close(arg_0);
  }

  @DocAnnotation$annotation$(description = " Close the client\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
