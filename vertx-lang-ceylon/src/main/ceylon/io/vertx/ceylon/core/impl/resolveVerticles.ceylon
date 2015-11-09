import ceylon.language.meta { modules }
import ceylon.language.meta.declaration { Module, ClassDeclaration }
import java.util { Map_=Map, LinkedHashMap_=LinkedHashMap }
import java.util.concurrent { Callable_=Callable }
import java.lang { String_=String }
import io.vertx.ceylon.core { Verticle }
import io.vertx.core { Verticle_=Verticle }

"Find the verticles for the specified module and return a list of verticle factories. This method is called
 by the Vert.x module to discover the existing Verticles and is somewhat reserved for internal use."
shared Map_<String_,Callable_<Verticle_>> resolveVerticles(
  "The name of the module to introspect"
  String_ moduleName,
  "The optional verticle name to return"
  String_? verticleName) {
  value verticles = LinkedHashMap_<String_,Callable_<Verticle_>>();
  value mods = modules.list.filter((Module elem) => moduleName == String_(elem.name));
  for (mod in mods) {
    for (pkg in mod.members) {
      {ClassDeclaration*} classDecls;
      if (exists verticleName) {
        classDecls = pkg.members<ClassDeclaration>().filter((ClassDeclaration classDecl) => classDecl.qualifiedName == verticleName.string);
      } else {
        classDecls = pkg.members<ClassDeclaration>();
      }
      for (classDecl in classDecls) {
        value verticle = resolveVerticle(classDecl);
        if (exists verticle) {
          verticles.put(String_(classDecl.qualifiedName), verticle);
        }
      }
    }
  }
  return verticles;
}
