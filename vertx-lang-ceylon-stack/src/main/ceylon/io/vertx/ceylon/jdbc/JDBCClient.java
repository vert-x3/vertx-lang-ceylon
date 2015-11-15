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
import io.vertx.ceylon.core.Vertx;
import io.vertx.ceylon.sql.SQLConnection;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class JDBCClient implements ReifiedType {

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

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(JDBCClient.class);
  @Ignore private final io.vertx.ext.jdbc.JDBCClient delegate;

  public JDBCClient(io.vertx.ext.jdbc.JDBCClient delegate) {
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.jdbc::JDBCClient")
  public JDBCClient getConnection(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::SQLConnection)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.SQLConnection>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.ext.sql.SQLConnection>(handler) {
      public Object toCeylon(io.vertx.ext.sql.SQLConnection event) {
        return io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(event);
      }
    };
    JDBCClient ret = io.vertx.ceylon.jdbc.JDBCClient.TO_CEYLON.converter().safeConvert(delegate.getConnection(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
