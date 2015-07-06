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
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  FileSystem_=FileSystem
}
/* Generated from io.vertx.core.file.FileSystem */
shared abstract class FileSystem(FileSystem_ delegate) satisfies Delegating {

  FileSystem copy_impl([String,String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,Anything(Throwable?)]>) copy = flatten(copy_impl);

  FileSystem copyBlocking_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String]>) copyBlocking = flatten(copyBlocking_impl);

  FileSystem copyRecursive_impl([String,String,Boolean,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,Boolean,Anything(Throwable?)]>) copyRecursive = flatten(copyRecursive_impl);

  FileSystem copyRecursiveBlocking_impl([String,String,Boolean] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,Boolean]>) copyRecursiveBlocking = flatten(copyRecursiveBlocking_impl);

  FileSystem move_impl([String,String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,Anything(Throwable?)]>) move = flatten(move_impl);

  FileSystem moveBlocking_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String]>) moveBlocking = flatten(moveBlocking_impl);

  FileSystem truncate_impl([String,Integer,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Integer,Anything(Throwable?)]>) truncate = flatten(truncate_impl);

  FileSystem truncateBlocking_impl([String,Integer] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Integer]>) truncateBlocking = flatten(truncateBlocking_impl);

  FileSystem chmod_impl([String,String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,Anything(Throwable?)]>) chmod = flatten(chmod_impl);

  FileSystem chmodBlocking_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String]>) chmodBlocking = flatten(chmodBlocking_impl);

  FileSystem chmodRecursive_impl([String,String,String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,String,Anything(Throwable?)]>) chmodRecursive = flatten(chmodRecursive_impl);

  FileSystem chmodRecursiveBlocking_impl([String,String,String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,String]>) chmodRecursiveBlocking = flatten(chmodRecursiveBlocking_impl);

  FileSystem chown_impl([String,String,String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,String,Anything(Throwable?)]>) chown = flatten(chown_impl);

  FileSystem chownBlocking_impl([String,String,String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,String]>) chownBlocking = flatten(chownBlocking_impl);

  FileSystem props_impl([String,Anything(Throwable|FileProps)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable|FileProps)]>) props = flatten(props_impl);

  FileProps propsBlocking_impl([String] args) {
    throw Exception("implement me");
  }

  shared  FileProps(*<[String]>) propsBlocking = flatten(propsBlocking_impl);

  FileSystem lprops_impl([String,Anything(Throwable|FileProps)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable|FileProps)]>) lprops = flatten(lprops_impl);

  FileProps lpropsBlocking_impl([String] args) {
    throw Exception("implement me");
  }

  shared  FileProps(*<[String]>) lpropsBlocking = flatten(lpropsBlocking_impl);

  FileSystem link_impl([String,String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,Anything(Throwable?)]>) link = flatten(link_impl);

  FileSystem linkBlocking_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String]>) linkBlocking = flatten(linkBlocking_impl);

  FileSystem symlink_impl([String,String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String,Anything(Throwable?)]>) symlink = flatten(symlink_impl);

  FileSystem symlinkBlocking_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,String]>) symlinkBlocking = flatten(symlinkBlocking_impl);

  FileSystem unlink_impl([String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable?)]>) unlink = flatten(unlink_impl);

  FileSystem unlinkBlocking_impl([String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String]>) unlinkBlocking = flatten(unlinkBlocking_impl);

  FileSystem readSymlink_impl([String,Anything(Throwable|String)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable|String)]>) readSymlink = flatten(readSymlink_impl);

  String readSymlinkBlocking_impl([String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String]>) readSymlinkBlocking = flatten(readSymlinkBlocking_impl);

  FileSystem delete_impl([String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable?)]>) delete = flatten(delete_impl);

  FileSystem deleteBlocking_impl([String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String]>) deleteBlocking = flatten(deleteBlocking_impl);

  FileSystem deleteRecursive_impl([String,Boolean,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Boolean,Anything(Throwable?)]>) deleteRecursive = flatten(deleteRecursive_impl);

  FileSystem deleteRecursiveBlocking_impl([String,Boolean] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Boolean]>) deleteRecursiveBlocking = flatten(deleteRecursiveBlocking_impl);

  FileSystem mkdir_impl([String,Anything(Throwable?)]|[String,String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) mkdir = flatten(mkdir_impl);

  FileSystem mkdirBlocking_impl([String]|[String,String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String]|[String,String]>) mkdirBlocking = flatten(mkdirBlocking_impl);

  FileSystem mkdirs_impl([String,Anything(Throwable?)]|[String,String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) mkdirs = flatten(mkdirs_impl);

  FileSystem mkdirsBlocking_impl([String]|[String,String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String]|[String,String]>) mkdirsBlocking = flatten(mkdirsBlocking_impl);

  FileSystem readDir_impl([String,Anything(Throwable|List<String>)]|[String,String,Anything(Throwable|List<String>)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable|List<String>)]|[String,String,Anything(Throwable|List<String>)]>) readDir = flatten(readDir_impl);

  List<String> readDirBlocking_impl([String]|[String,String] args) {
    throw Exception("implement me");
  }

  shared  List<String>(*<[String]|[String,String]>) readDirBlocking = flatten(readDirBlocking_impl);

  FileSystem readFile_impl([String,Anything(Throwable|Buffer)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable|Buffer)]>) readFile = flatten(readFile_impl);

  Buffer readFileBlocking_impl([String] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[String]>) readFileBlocking = flatten(readFileBlocking_impl);

  FileSystem writeFile_impl([String,Buffer,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Buffer,Anything(Throwable?)]>) writeFile = flatten(writeFile_impl);

  FileSystem writeFileBlocking_impl([String,Buffer] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Buffer]>) writeFileBlocking = flatten(writeFileBlocking_impl);

  FileSystem open_impl([String,OpenOptions,Anything(Throwable|AsyncFile)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,OpenOptions,Anything(Throwable|AsyncFile)]>) open = flatten(open_impl);

  AsyncFile openBlocking_impl([String,OpenOptions] args) {
    throw Exception("implement me");
  }

  shared  AsyncFile(*<[String,OpenOptions]>) openBlocking = flatten(openBlocking_impl);

  FileSystem createFile_impl([String,Anything(Throwable?)]|[String,String,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) createFile = flatten(createFile_impl);

  FileSystem createFileBlocking_impl([String]|[String,String] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String]|[String,String]>) createFileBlocking = flatten(createFileBlocking_impl);

  FileSystem \iexists_impl([String,Anything(Throwable|Boolean)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable|Boolean)]>) \iexists = flatten(\iexists_impl);

  Boolean existsBlocking_impl([String] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[String]>) existsBlocking = flatten(existsBlocking_impl);

  FileSystem fsProps_impl([String,Anything(Throwable|FileSystemProps)] args) {
    throw Exception("implement me");
  }

  shared  FileSystem(*<[String,Anything(Throwable|FileSystemProps)]>) fsProps = flatten(fsProps_impl);

  FileSystemProps fsPropsBlocking_impl([String] args) {
    throw Exception("implement me");
  }

  shared  FileSystemProps(*<[String]>) fsPropsBlocking = flatten(fsPropsBlocking_impl);

}
