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

  shared  FileSystem(*<[String,String,Anything(Throwable?)]>) copy => flatten(copy_impl);

  shared  FileSystem(*<[String,String]>) copyBlocking => flatten(copyBlocking_impl);

  shared  FileSystem(*<[String,String,Boolean,Anything(Throwable?)]>) copyRecursive => flatten(copyRecursive_impl);

  shared  FileSystem(*<[String,String,Boolean]>) copyRecursiveBlocking => flatten(copyRecursiveBlocking_impl);

  shared  FileSystem(*<[String,String,Anything(Throwable?)]>) move => flatten(move_impl);

  shared  FileSystem(*<[String,String]>) moveBlocking => flatten(moveBlocking_impl);

  shared  FileSystem(*<[String,Integer,Anything(Throwable?)]>) truncate => flatten(truncate_impl);

  shared  FileSystem(*<[String,Integer]>) truncateBlocking => flatten(truncateBlocking_impl);

  shared  FileSystem(*<[String,String,Anything(Throwable?)]>) chmod => flatten(chmod_impl);

  shared  FileSystem(*<[String,String]>) chmodBlocking => flatten(chmodBlocking_impl);

  shared  FileSystem(*<[String,String,String,Anything(Throwable?)]>) chmodRecursive => flatten(chmodRecursive_impl);

  shared  FileSystem(*<[String,String,String]>) chmodRecursiveBlocking => flatten(chmodRecursiveBlocking_impl);

  shared  FileSystem(*<[String,String,String,Anything(Throwable?)]>) chown => flatten(chown_impl);

  shared  FileSystem(*<[String,String,String]>) chownBlocking => flatten(chownBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable|FileProps)]>) props => flatten(props_impl);

  shared  FileProps(*<[String]>) propsBlocking => flatten(propsBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable|FileProps)]>) lprops => flatten(lprops_impl);

  shared  FileProps(*<[String]>) lpropsBlocking => flatten(lpropsBlocking_impl);

  shared  FileSystem(*<[String,String,Anything(Throwable?)]>) link => flatten(link_impl);

  shared  FileSystem(*<[String,String]>) linkBlocking => flatten(linkBlocking_impl);

  shared  FileSystem(*<[String,String,Anything(Throwable?)]>) symlink => flatten(symlink_impl);

  shared  FileSystem(*<[String,String]>) symlinkBlocking => flatten(symlinkBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable?)]>) unlink => flatten(unlink_impl);

  shared  FileSystem(*<[String]>) unlinkBlocking => flatten(unlinkBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable|String)]>) readSymlink => flatten(readSymlink_impl);

  shared  String(*<[String]>) readSymlinkBlocking => flatten(readSymlinkBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable?)]>) delete => flatten(delete_impl);

  shared  FileSystem(*<[String]>) deleteBlocking => flatten(deleteBlocking_impl);

  shared  FileSystem(*<[String,Boolean,Anything(Throwable?)]>) deleteRecursive => flatten(deleteRecursive_impl);

  shared  FileSystem(*<[String,Boolean]>) deleteRecursiveBlocking => flatten(deleteRecursiveBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) mkdir => flatten(mkdir_impl);

  shared  FileSystem(*<[String]|[String,String]>) mkdirBlocking => flatten(mkdirBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) mkdirs => flatten(mkdirs_impl);

  shared  FileSystem(*<[String]|[String,String]>) mkdirsBlocking => flatten(mkdirsBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable|List<String>)]|[String,String,Anything(Throwable|List<String>)]>) readDir => flatten(readDir_impl);

  shared  List<String>(*<[String]|[String,String]>) readDirBlocking => flatten(readDirBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable|Buffer)]>) readFile => flatten(readFile_impl);

  shared  Buffer(*<[String]>) readFileBlocking => flatten(readFileBlocking_impl);

  shared  FileSystem(*<[String,Buffer,Anything(Throwable?)]>) writeFile => flatten(writeFile_impl);

  shared  FileSystem(*<[String,Buffer]>) writeFileBlocking => flatten(writeFileBlocking_impl);

  shared  FileSystem(*<[String,OpenOptions,Anything(Throwable|AsyncFile)]>) open => flatten(open_impl);

  shared  AsyncFile(*<[String,OpenOptions]>) openBlocking => flatten(openBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) createFile => flatten(createFile_impl);

  shared  FileSystem(*<[String]|[String,String]>) createFileBlocking => flatten(createFileBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable|Boolean)]>) \iexists => flatten(\iexists_impl);

  shared  Boolean(*<[String]>) existsBlocking => flatten(existsBlocking_impl);

  shared  FileSystem(*<[String,Anything(Throwable|FileSystemProps)]>) fsProps => flatten(fsProps_impl);

  shared  FileSystemProps(*<[String]>) fsPropsBlocking => flatten(fsPropsBlocking_impl);

  FileSystem copy_impl([String,String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem copyBlocking_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem copyRecursive_impl([String,String,Boolean,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem copyRecursiveBlocking_impl([String,String,Boolean] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem move_impl([String,String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem moveBlocking_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem truncate_impl([String,Integer,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem truncateBlocking_impl([String,Integer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chmod_impl([String,String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chmodBlocking_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chmodRecursive_impl([String,String,String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chmodRecursiveBlocking_impl([String,String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chown_impl([String,String,String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chownBlocking_impl([String,String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem props_impl([String,Anything(Throwable|FileProps)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileProps propsBlocking_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem lprops_impl([String,Anything(Throwable|FileProps)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileProps lpropsBlocking_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem link_impl([String,String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem linkBlocking_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem symlink_impl([String,String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem symlinkBlocking_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem unlink_impl([String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem unlinkBlocking_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem readSymlink_impl([String,Anything(Throwable|String)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String readSymlinkBlocking_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem delete_impl([String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem deleteBlocking_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem deleteRecursive_impl([String,Boolean,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem deleteRecursiveBlocking_impl([String,Boolean] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem mkdir_impl([String,Anything(Throwable?)]|[String,String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem mkdirBlocking_impl([String]|[String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem mkdirs_impl([String,Anything(Throwable?)]|[String,String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem mkdirsBlocking_impl([String]|[String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem readDir_impl([String,Anything(Throwable|List<String>)]|[String,String,Anything(Throwable|List<String>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> readDirBlocking_impl([String]|[String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem readFile_impl([String,Anything(Throwable|Buffer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer readFileBlocking_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem writeFile_impl([String,Buffer,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem writeFileBlocking_impl([String,Buffer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem open_impl([String,OpenOptions,Anything(Throwable|AsyncFile)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile openBlocking_impl([String,OpenOptions] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem createFile_impl([String,Anything(Throwable?)]|[String,String,Anything(Throwable?)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem createFileBlocking_impl([String]|[String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem \iexists_impl([String,Anything(Throwable|Boolean)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean existsBlocking_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem fsProps_impl([String,Anything(Throwable|FileSystemProps)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystemProps fsPropsBlocking_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
