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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class UpdateResult implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.UpdateResult, UpdateResult> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.UpdateResult, UpdateResult>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.UpdateResult, UpdateResult> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.UpdateResult, UpdateResult>() {
        public UpdateResult convert(io.vertx.ext.sql.UpdateResult src) {
          return new UpdateResult(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<UpdateResult, io.vertx.ext.sql.UpdateResult> TO_JAVA = new io.vertx.lang.ceylon.Converter<UpdateResult, io.vertx.ext.sql.UpdateResult>() {
    public io.vertx.ext.sql.UpdateResult convert(UpdateResult src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(UpdateResult.class);
  @Ignore private final io.vertx.ext.sql.UpdateResult delegate;

  public UpdateResult(io.vertx.ext.sql.UpdateResult delegate) {
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
  @TypeInfo("ceylon.language::Integer")
  public long getUpdated() {
    long ret = delegate.getUpdated();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long updated() {
    long ret = delegate.updated();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Array")
  public ceylon.json.Array getKeys() {
    ceylon.json.Array ret = io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(delegate.getKeys());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.json::Array")
  public ceylon.json.Array keys() {
    ceylon.json.Array ret = io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(delegate.keys());
    return ret;
  }

}
