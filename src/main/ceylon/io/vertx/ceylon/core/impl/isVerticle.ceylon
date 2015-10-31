import ceylon.language.meta.declaration { OpenType, OpenClassType }
import io.vertx.ceylon.core { Verticle }

OpenType verticleDecl = `class Verticle`.openType;
Boolean isVerticle(OpenType classDecl) {
  if (is OpenClassType classDecl) {
    if (exists ext = classDecl.extendedType) {
      if (ext == verticleDecl) {
        return true;
      } else {
        return isVerticle(ext);
      }
    }
  }
  return false;
}
