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
  shared formal Anything(*<[String,String,Anything(Throwable?)]>) copy;
  shared formal Anything(*<[String,String]>) copyBlocking;
  shared formal Anything(*<[String,String,Boolean,Anything(Throwable?)]>) copyRecursive;
  shared formal Anything(*<[String,String,Boolean]>) copyRecursiveBlocking;
  shared formal Anything(*<[String,String,Anything(Throwable?)]>) move;
  shared formal Anything(*<[String,String]>) moveBlocking;
  shared formal Anything(*<[String,Integer,Anything(Throwable?)]>) truncate;
  shared formal Anything(*<[String,Integer]>) truncateBlocking;
  shared formal Anything(*<[String,String,Anything(Throwable?)]>) chmod;
  shared formal Anything(*<[String,String]>) chmodBlocking;
  shared formal Anything(*<[String,String,String,Anything(Throwable?)]>) chmodRecursive;
  shared formal Anything(*<[String,String,String]>) chmodRecursiveBlocking;
  shared formal Anything(*<[String,String,String,Anything(Throwable?)]>) chown;
  shared formal Anything(*<[String,String,String]>) chownBlocking;
  shared formal Anything(*<[String,Anything(Throwable|FileProps)]>) props;
  shared formal Anything(*<[String]>) propsBlocking;
  shared formal Anything(*<[String,Anything(Throwable|FileProps)]>) lprops;
  shared formal Anything(*<[String]>) lpropsBlocking;
  shared formal Anything(*<[String,String,Anything(Throwable?)]>) link;
  shared formal Anything(*<[String,String]>) linkBlocking;
  shared formal Anything(*<[String,String,Anything(Throwable?)]>) symlink;
  shared formal Anything(*<[String,String]>) symlinkBlocking;
  shared formal Anything(*<[String,Anything(Throwable?)]>) unlink;
  shared formal Anything(*<[String]>) unlinkBlocking;
  shared formal Anything(*<[String,Anything(Throwable|String)]>) readSymlink;
  shared formal Anything(*<[String]>) readSymlinkBlocking;
  shared formal Anything(*<[String,Anything(Throwable?)]>) delete;
  shared formal Anything(*<[String]>) deleteBlocking;
  shared formal Anything(*<[String,Boolean,Anything(Throwable?)]>) deleteRecursive;
  shared formal Anything(*<[String,Boolean]>) deleteRecursiveBlocking;
  shared formal Anything(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) mkdir;
  shared formal Anything(*<[String]|[String,String]>) mkdirBlocking;
  shared formal Anything(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) mkdirs;
  shared formal Anything(*<[String]|[String,String]>) mkdirsBlocking;
  shared formal Anything(*<[String,Anything(Throwable|List<String>)]|[String,String,Anything(Throwable|List<String>)]>) readDir;
  shared formal Anything(*<[String]|[String,String]>) readDirBlocking;
  shared formal Anything(*<[String,Anything(Throwable|Buffer)]>) readFile;
  shared formal Anything(*<[String]>) readFileBlocking;
  shared formal Anything(*<[String,Buffer,Anything(Throwable?)]>) writeFile;
  shared formal Anything(*<[String,Buffer]>) writeFileBlocking;
  shared formal Anything(*<[String,OpenOptions,Anything(Throwable|AsyncFile)]>) open;
  shared formal Anything(*<[String,OpenOptions]>) openBlocking;
  shared formal Anything(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) createFile;
  shared formal Anything(*<[String]|[String,String]>) createFileBlocking;
  shared formal Anything(*<[String,Anything(Throwable|Boolean)]>) \iexists;
  shared formal Anything(*<[String]>) existsBlocking;
  shared formal Anything(*<[String,Anything(Throwable|FileSystemProps)]>) fsProps;
  shared formal Anything(*<[String]>) fsPropsBlocking;
}
