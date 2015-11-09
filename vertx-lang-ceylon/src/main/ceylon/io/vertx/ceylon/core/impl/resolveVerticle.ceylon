import ceylon.language.meta.declaration { ClassDeclaration }
import java.util.concurrent { Callable }
import io.vertx.ceylon.core { Verticle }
import io.vertx.core { Verticle_=Verticle }

Callable<Verticle_>? resolveVerticle(ClassDeclaration classDecl) {
  if (isVerticle(classDecl.openType)) {
    object factory satisfies Callable<Verticle_> {
      shared actual Verticle_ call() {
        value instance = classDecl.instantiate();
        assert (is Verticle instance);
        return instance.nativeVerticle;
      }
    }
    return factory;
  } else {
    return null;
  }
}
