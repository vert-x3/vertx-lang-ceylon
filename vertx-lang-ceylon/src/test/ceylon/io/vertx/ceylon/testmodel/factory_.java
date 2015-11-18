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
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("factory")
@com.redhat.ceylon.compiler.java.metadata.Object
public class factory_ implements ReifiedType {

  private static final factory_ instance = new factory_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(factory_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.testmodel::factory")
  public static factory_ get_() {
    return instance;
  }


  @TypeInfo("io.vertx.ceylon.testmodel::ConcreteHandlerUserType")
  public ConcreteHandlerUserType createConcreteHandlerUserType(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::RefedInterface1)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1>() {
      public void handle(io.vertx.codegen.testmodel.RefedInterface1 event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(event));
      }
    };
    ConcreteHandlerUserType ret = io.vertx.ceylon.testmodel.ConcreteHandlerUserType.TO_CEYLON.converter().safeConvert(io.vertx.codegen.testmodel.Factory.createConcreteHandlerUserType(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::AbstractHandlerUserType")
  public AbstractHandlerUserType createAbstractHandlerUserType(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::RefedInterface1)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1>() {
      public void handle(io.vertx.codegen.testmodel.RefedInterface1 event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(event));
      }
    };
    AbstractHandlerUserType ret = io.vertx.ceylon.testmodel.AbstractHandlerUserType.TO_CEYLON.converter().safeConvert(io.vertx.codegen.testmodel.Factory.createAbstractHandlerUserType(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::ConcreteHandlerUserTypeExtension")
  public ConcreteHandlerUserTypeExtension createConcreteHandlerUserTypeExtension(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.testmodel::RefedInterface1)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.codegen.testmodel.RefedInterface1>() {
      public void handle(io.vertx.codegen.testmodel.RefedInterface1 event) {
        handler.$call$((Object)io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(event));
      }
    };
    ConcreteHandlerUserTypeExtension ret = io.vertx.ceylon.testmodel.ConcreteHandlerUserTypeExtension.TO_CEYLON.converter().safeConvert(io.vertx.codegen.testmodel.Factory.createConcreteHandlerUserTypeExtension(arg_0));
    return ret;
  }

}
