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
import io.vertx.core.json.JsonObject;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class ResultSet implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.ResultSet, ResultSet> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.ResultSet, ResultSet>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.ResultSet, ResultSet> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.ResultSet, ResultSet>() {
        public ResultSet convert(io.vertx.ext.sql.ResultSet src) {
          return new ResultSet(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<ResultSet, io.vertx.ext.sql.ResultSet> TO_JAVA = new io.vertx.lang.ceylon.Converter<ResultSet, io.vertx.ext.sql.ResultSet>() {
    public io.vertx.ext.sql.ResultSet convert(ResultSet src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ResultSet.class);
  @Ignore private final io.vertx.ext.sql.ResultSet delegate;

  public ResultSet(io.vertx.ext.sql.ResultSet delegate) {
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
  @TypeInfo("ceylon.language::List<ceylon.json::Array>")
  public ceylon.language.List<ceylon.json.Array> getResults() {
    ceylon.language.List<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, delegate.getResults(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Array>")
  public ceylon.language.List<ceylon.json.Array> results() {
    ceylon.language.List<ceylon.json.Array> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Array.$TypeDescriptor$, delegate.results(), io.vertx.lang.ceylon.ToCeylon.JsonArray);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> getColumnNames() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.getColumnNames(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> columnNames() {
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.columnNames(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Object>")
  public ceylon.language.List<ceylon.json.Object> getRows() {
    ceylon.language.List<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, delegate.getRows(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.json::Object>")
  public ceylon.language.List<ceylon.json.Object> rows() {
    ceylon.language.List<ceylon.json.Object> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.json.Object.$TypeDescriptor$, delegate.rows(), io.vertx.lang.ceylon.ToCeylon.JsonObject);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getNumRows() {
    long ret = delegate.getNumRows();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long numRows() {
    long ret = delegate.numRows();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getNumColumns() {
    long ret = delegate.getNumColumns();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long numColumns() {
    long ret = delegate.numColumns();
    return ret;
  }

}
