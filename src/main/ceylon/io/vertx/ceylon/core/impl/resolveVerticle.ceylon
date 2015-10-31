import ceylon.language.meta.declaration { ClassDeclaration }
import java.util.concurrent { Callable }
import io.vertx.ceylon.core { Verticle }

Callable<Verticle>? resolveVerticle(ClassDeclaration classDecl) {
  if (isVerticle(classDecl.openType)) {
    object factory satisfies Callable<Verticle> {
      shared actual Verticle call() {
        value instance = classDecl.instantiate();
        assert (is Verticle instance);
        return instance;
      }
    }
    return factory;
  } else {
    return null;
  }
}
