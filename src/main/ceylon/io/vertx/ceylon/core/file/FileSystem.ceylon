import java.lang {
  Boolean_=Boolean,
  String_=String
}
import io.vertx.ceylon.core.file {
  AsyncFile,
  OpenOptions,
  FileSystemProps,
  FileProps
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
/* Generated from io.vertx.core.file.FileSystem */
shared abstract class FileSystem() {
  shared formal FileSystem(*<[String,String,Anything(Throwable?)]>) copy;
  shared formal FileSystem(*<[String,String]>) copyBlocking;
  shared formal FileSystem(*<[String,String,Boolean,Anything(Throwable?)]>) copyRecursive;
  shared formal FileSystem(*<[String,String,Boolean]>) copyRecursiveBlocking;
  shared formal FileSystem(*<[String,String,Anything(Throwable?)]>) move;
  shared formal FileSystem(*<[String,String]>) moveBlocking;
  shared formal FileSystem(*<[String,Integer,Anything(Throwable?)]>) truncate;
  shared formal FileSystem(*<[String,Integer]>) truncateBlocking;
  shared formal FileSystem(*<[String,String,Anything(Throwable?)]>) chmod;
  shared formal FileSystem(*<[String,String]>) chmodBlocking;
  shared formal FileSystem(*<[String,String,String,Anything(Throwable?)]>) chmodRecursive;
  shared formal FileSystem(*<[String,String,String]>) chmodRecursiveBlocking;
  shared formal FileSystem(*<[String,String,String,Anything(Throwable?)]>) chown;
  shared formal FileSystem(*<[String,String,String]>) chownBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable|FileProps)]>) props;
  shared formal FileProps(*<[String]>) propsBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable|FileProps)]>) lprops;
  shared formal FileProps(*<[String]>) lpropsBlocking;
  shared formal FileSystem(*<[String,String,Anything(Throwable?)]>) link;
  shared formal FileSystem(*<[String,String]>) linkBlocking;
  shared formal FileSystem(*<[String,String,Anything(Throwable?)]>) symlink;
  shared formal FileSystem(*<[String,String]>) symlinkBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable?)]>) unlink;
  shared formal FileSystem(*<[String]>) unlinkBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable|String)]>) readSymlink;
  shared formal String(*<[String]>) readSymlinkBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable?)]>) delete;
  shared formal FileSystem(*<[String]>) deleteBlocking;
  shared formal FileSystem(*<[String,Boolean,Anything(Throwable?)]>) deleteRecursive;
  shared formal FileSystem(*<[String,Boolean]>) deleteRecursiveBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) mkdir;
  shared formal FileSystem(*<[String]|[String,String]>) mkdirBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) mkdirs;
  shared formal FileSystem(*<[String]|[String,String]>) mkdirsBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable|List<String>)]|[String,String,Anything(Throwable|List<String>)]>) readDir;
  shared formal List<String>(*<[String]|[String,String]>) readDirBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable|Buffer)]>) readFile;
  shared formal Buffer(*<[String]>) readFileBlocking;
  shared formal FileSystem(*<[String,Buffer,Anything(Throwable?)]>) writeFile;
  shared formal FileSystem(*<[String,Buffer]>) writeFileBlocking;
  shared formal FileSystem(*<[String,OpenOptions,Anything(Throwable|AsyncFile)]>) open;
  shared formal AsyncFile(*<[String,OpenOptions]>) openBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) createFile;
  shared formal FileSystem(*<[String]|[String,String]>) createFileBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable|Boolean)]>) \iexists;
  shared formal Boolean(*<[String]>) existsBlocking;
  shared formal FileSystem(*<[String,Anything(Throwable|FileSystemProps)]>) fsProps;
  shared formal FileSystemProps(*<[String]>) fsPropsBlocking;
}
