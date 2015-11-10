package io.vertx.ceylon.codegen.testmodel;

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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class DataObjectTCK implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.DataObjectTCK, DataObjectTCK> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.DataObjectTCK, DataObjectTCK>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.DataObjectTCK, DataObjectTCK> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.DataObjectTCK, DataObjectTCK>() {
        public DataObjectTCK convert(io.vertx.codegen.testmodel.DataObjectTCK src) {
          return new DataObjectTCK(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<DataObjectTCK, io.vertx.codegen.testmodel.DataObjectTCK> TO_JAVA = new io.vertx.lang.ceylon.Converter<DataObjectTCK, io.vertx.codegen.testmodel.DataObjectTCK>() {
    public io.vertx.codegen.testmodel.DataObjectTCK convert(DataObjectTCK src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(DataObjectTCK.class);
  @Ignore private final io.vertx.codegen.testmodel.DataObjectTCK delegate;

  public DataObjectTCK(io.vertx.codegen.testmodel.DataObjectTCK delegate) {
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
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::DataObjectCollection")
  public io.vertx.ceylon.codegen.testmodel.DataObjectCollection getDataObjectCollection() {
    io.vertx.ceylon.codegen.testmodel.DataObjectCollection ret = io.vertx.ceylon.codegen.testmodel.dataObjectCollection_.get_().getToCeylon().safeConvert(delegate.getDataObjectCollection());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void setDataObjectCollection(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::DataObjectCollection") @Name("dataObject") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.codegen.testmodel.DataObjectCollection dataObject) {
    io.vertx.codegen.testmodel.DataObjectCollection arg_0 = dataObject == null ? null : new io.vertx.codegen.testmodel.DataObjectCollection(io.vertx.lang.ceylon.ToJava.JsonObject.convert(dataObject.toJson()));
    delegate.setDataObjectCollection(arg_0);
  }

}
