package io.vertx.ceylon.testmodel;

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
@DocAnnotation$annotation$(description = " todo:\n - Buffer support\n")
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

  @TypeInfo("io.vertx.ceylon.testmodel::DataObjectWithValues")
  public io.vertx.ceylon.testmodel.DataObjectWithValues $getDataObjectWithValues() {
    io.vertx.ceylon.testmodel.DataObjectWithValues ret = io.vertx.ceylon.testmodel.dataObjectWithValues_.get_().getToCeylon().safeConvert(delegate.getDataObjectWithValues());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void $setDataObjectWithValues(
    final @TypeInfo("io.vertx.ceylon.testmodel::DataObjectWithValues") @Name("dataObject")  io.vertx.ceylon.testmodel.DataObjectWithValues dataObject) {
    io.vertx.codegen.testmodel.DataObjectWithValues arg_0 = dataObject == null ? null : new io.vertx.codegen.testmodel.DataObjectWithValues(io.vertx.lang.ceylon.ToJava.JsonObject.convert(dataObject.toJson()));
    delegate.setDataObjectWithValues(arg_0);
  }

  @TypeInfo("io.vertx.ceylon.testmodel::DataObjectWithLists")
  public io.vertx.ceylon.testmodel.DataObjectWithLists $getDataObjectWithLists() {
    io.vertx.ceylon.testmodel.DataObjectWithLists ret = io.vertx.ceylon.testmodel.dataObjectWithLists_.get_().getToCeylon().safeConvert(delegate.getDataObjectWithLists());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void $setDataObjectWithLists(
    final @TypeInfo("io.vertx.ceylon.testmodel::DataObjectWithLists") @Name("dataObject")  io.vertx.ceylon.testmodel.DataObjectWithLists dataObject) {
    io.vertx.codegen.testmodel.DataObjectWithLists arg_0 = dataObject == null ? null : new io.vertx.codegen.testmodel.DataObjectWithLists(io.vertx.lang.ceylon.ToJava.JsonObject.convert(dataObject.toJson()));
    delegate.setDataObjectWithLists(arg_0);
  }

  @TypeInfo("io.vertx.ceylon.testmodel::DataObjectWithMaps")
  public io.vertx.ceylon.testmodel.DataObjectWithMaps $getDataObjectWithMaps() {
    io.vertx.ceylon.testmodel.DataObjectWithMaps ret = io.vertx.ceylon.testmodel.dataObjectWithMaps_.get_().getToCeylon().safeConvert(delegate.getDataObjectWithMaps());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void $setDataObjectWithMaps(
    final @TypeInfo("io.vertx.ceylon.testmodel::DataObjectWithMaps") @Name("dataObject")  io.vertx.ceylon.testmodel.DataObjectWithMaps dataObject) {
    io.vertx.codegen.testmodel.DataObjectWithMaps arg_0 = dataObject == null ? null : new io.vertx.codegen.testmodel.DataObjectWithMaps(io.vertx.lang.ceylon.ToJava.JsonObject.convert(dataObject.toJson()));
    delegate.setDataObjectWithMaps(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void methodWithOnlyJsonObjectConstructorDataObject(
    final @TypeInfo("io.vertx.ceylon.testmodel::DataObjectWithOnlyJsonObjectConstructor") @Name("dataObject")  io.vertx.ceylon.testmodel.DataObjectWithOnlyJsonObjectConstructor dataObject) {
    io.vertx.codegen.testmodel.DataObjectWithOnlyJsonObjectConstructor arg_0 = dataObject == null ? null : new io.vertx.codegen.testmodel.DataObjectWithOnlyJsonObjectConstructor(io.vertx.lang.ceylon.ToJava.JsonObject.convert(dataObject.toJson()));
    delegate.methodWithOnlyJsonObjectConstructorDataObject(arg_0);
  }

}
