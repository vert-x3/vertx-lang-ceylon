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
shared interface FileSystem  {

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
/* Generated from io.vertx.core.file.FileSystem */

shared abstract class FileSystem_Impl(FileSystem delegate) satisfies FileSystem & Delegating<FileSystem> {

  shared actual FileSystem(*<[String,String,Anything(Throwable?)]>) copy => flatten(copy_impl);
  shared actual FileSystem(*<[String,String]>) copyBlocking => flatten(copyBlocking_impl);
  shared actual FileSystem(*<[String,String,Boolean,Anything(Throwable?)]>) copyRecursive => flatten(copyRecursive_impl);
  shared actual FileSystem(*<[String,String,Boolean]>) copyRecursiveBlocking => flatten(copyRecursiveBlocking_impl);
  shared actual FileSystem(*<[String,String,Anything(Throwable?)]>) move => flatten(move_impl);
  shared actual FileSystem(*<[String,String]>) moveBlocking => flatten(moveBlocking_impl);
  shared actual FileSystem(*<[String,Integer,Anything(Throwable?)]>) truncate => flatten(truncate_impl);
  shared actual FileSystem(*<[String,Integer]>) truncateBlocking => flatten(truncateBlocking_impl);
  shared actual FileSystem(*<[String,String,Anything(Throwable?)]>) chmod => flatten(chmod_impl);
  shared actual FileSystem(*<[String,String]>) chmodBlocking => flatten(chmodBlocking_impl);
  shared actual FileSystem(*<[String,String,String,Anything(Throwable?)]>) chmodRecursive => flatten(chmodRecursive_impl);
  shared actual FileSystem(*<[String,String,String]>) chmodRecursiveBlocking => flatten(chmodRecursiveBlocking_impl);
  shared actual FileSystem(*<[String,String,String,Anything(Throwable?)]>) chown => flatten(chown_impl);
  shared actual FileSystem(*<[String,String,String]>) chownBlocking => flatten(chownBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable|FileProps)]>) props => flatten(props_impl);
  shared actual FileProps(*<[String]>) propsBlocking => flatten(propsBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable|FileProps)]>) lprops => flatten(lprops_impl);
  shared actual FileProps(*<[String]>) lpropsBlocking => flatten(lpropsBlocking_impl);
  shared actual FileSystem(*<[String,String,Anything(Throwable?)]>) link => flatten(link_impl);
  shared actual FileSystem(*<[String,String]>) linkBlocking => flatten(linkBlocking_impl);
  shared actual FileSystem(*<[String,String,Anything(Throwable?)]>) symlink => flatten(symlink_impl);
  shared actual FileSystem(*<[String,String]>) symlinkBlocking => flatten(symlinkBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable?)]>) unlink => flatten(unlink_impl);
  shared actual FileSystem(*<[String]>) unlinkBlocking => flatten(unlinkBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable|String)]>) readSymlink => flatten(readSymlink_impl);
  shared actual String(*<[String]>) readSymlinkBlocking => flatten(readSymlinkBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable?)]>) delete => flatten(delete_impl);
  shared actual FileSystem(*<[String]>) deleteBlocking => flatten(deleteBlocking_impl);
  shared actual FileSystem(*<[String,Boolean,Anything(Throwable?)]>) deleteRecursive => flatten(deleteRecursive_impl);
  shared actual FileSystem(*<[String,Boolean]>) deleteRecursiveBlocking => flatten(deleteRecursiveBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) mkdir => flatten(mkdir_impl);
  shared actual FileSystem(*<[String]|[String,String]>) mkdirBlocking => flatten(mkdirBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) mkdirs => flatten(mkdirs_impl);
  shared actual FileSystem(*<[String]|[String,String]>) mkdirsBlocking => flatten(mkdirsBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable|List<String>)]|[String,String,Anything(Throwable|List<String>)]>) readDir => flatten(readDir_impl);
  shared actual List<String>(*<[String]|[String,String]>) readDirBlocking => flatten(readDirBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable|Buffer)]>) readFile => flatten(readFile_impl);
  shared actual Buffer(*<[String]>) readFileBlocking => flatten(readFileBlocking_impl);
  shared actual FileSystem(*<[String,Buffer,Anything(Throwable?)]>) writeFile => flatten(writeFile_impl);
  shared actual FileSystem(*<[String,Buffer]>) writeFileBlocking => flatten(writeFileBlocking_impl);
  shared actual FileSystem(*<[String,OpenOptions,Anything(Throwable|AsyncFile)]>) open => flatten(open_impl);
  shared actual AsyncFile(*<[String,OpenOptions]>) openBlocking => flatten(openBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable?)]|[String,String,Anything(Throwable?)]>) createFile => flatten(createFile_impl);
  shared actual FileSystem(*<[String]|[String,String]>) createFileBlocking => flatten(createFileBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable|Boolean)]>) \iexists => flatten(\iexists_impl);
  shared actual Boolean(*<[String]>) existsBlocking => flatten(existsBlocking_impl);
  shared actual FileSystem(*<[String,Anything(Throwable|FileSystemProps)]>) fsProps => flatten(fsProps_impl);
  shared actual FileSystemProps(*<[String]>) fsPropsBlocking => flatten(fsPropsBlocking_impl);

  FileSystem copy_impl([String,String,Anything(Throwable?)] args) {
    Anything v = delegate.copy(args[0],args[1],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem copyBlocking_impl([String,String] args) {
    Anything v = delegate.copyBlocking(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem copyRecursive_impl([String,String,Boolean,Anything(Throwable?)] args) {
    Anything v = delegate.copyRecursive(args[0],args[1],args[2],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem copyRecursiveBlocking_impl([String,String,Boolean] args) {
    Anything v = delegate.copyRecursiveBlocking(args[0],args[1],args[2]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem move_impl([String,String,Anything(Throwable?)] args) {
    Anything v = delegate.move(args[0],args[1],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem moveBlocking_impl([String,String] args) {
    Anything v = delegate.moveBlocking(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem truncate_impl([String,Integer,Anything(Throwable?)] args) {
    Anything v = delegate.truncate(args[0],args[1],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem truncateBlocking_impl([String,Integer] args) {
    Anything v = delegate.truncateBlocking(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chmod_impl([String,String,Anything(Throwable?)] args) {
    Anything v = delegate.chmod(args[0],args[1],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chmodBlocking_impl([String,String] args) {
    Anything v = delegate.chmodBlocking(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chmodRecursive_impl([String,String,String,Anything(Throwable?)] args) {
    Anything v = delegate.chmodRecursive(args[0],args[1],args[2],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chmodRecursiveBlocking_impl([String,String,String] args) {
    Anything v = delegate.chmodRecursiveBlocking(args[0],args[1],args[2]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chown_impl([String,String,String,Anything(Throwable?)] args) {
    Anything v = delegate.chown(args[0],args[1],args[2],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem chownBlocking_impl([String,String,String] args) {
    Anything v = delegate.chownBlocking(args[0],args[1],args[2]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem props_impl([String,Anything(Throwable|FileProps)] args) {
    Anything v = delegate.props(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileProps propsBlocking_impl([String] args) {
    Anything v = delegate.propsBlocking(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem lprops_impl([String,Anything(Throwable|FileProps)] args) {
    Anything v = delegate.lprops(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileProps lpropsBlocking_impl([String] args) {
    Anything v = delegate.lpropsBlocking(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem link_impl([String,String,Anything(Throwable?)] args) {
    Anything v = delegate.link(args[0],args[1],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem linkBlocking_impl([String,String] args) {
    Anything v = delegate.linkBlocking(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem symlink_impl([String,String,Anything(Throwable?)] args) {
    Anything v = delegate.symlink(args[0],args[1],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem symlinkBlocking_impl([String,String] args) {
    Anything v = delegate.symlinkBlocking(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem unlink_impl([String,Anything(Throwable?)] args) {
    Anything v = delegate.unlink(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem unlinkBlocking_impl([String] args) {
    Anything v = delegate.unlinkBlocking(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem readSymlink_impl([String,Anything(Throwable|String)] args) {
    Anything v = delegate.readSymlink(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String readSymlinkBlocking_impl([String] args) {
    Anything v = delegate.readSymlinkBlocking(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem delete_impl([String,Anything(Throwable?)] args) {
    Anything v = delegate.delete(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem deleteBlocking_impl([String] args) {
    Anything v = delegate.deleteBlocking(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem deleteRecursive_impl([String,Boolean,Anything(Throwable?)] args) {
    Anything v = delegate.deleteRecursive(args[0],args[1],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem deleteRecursiveBlocking_impl([String,Boolean] args) {
    Anything v = delegate.deleteRecursiveBlocking(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem mkdir_impl([String,Anything(Throwable?)]|[String,String,Anything(Throwable?)] args) {
    if (is [String,Anything(Throwable?)] args) {
      Anything v = delegate.mkdir(args[0],nothing);
    }
    if (is [String,String,Anything(Throwable?)] args) {
      Anything v = delegate.mkdir(args[0],args[1],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem mkdirBlocking_impl([String]|[String,String] args) {
    if (is [String] args) {
      Anything v = delegate.mkdirBlocking(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.mkdirBlocking(args[0],args[1]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem mkdirs_impl([String,Anything(Throwable?)]|[String,String,Anything(Throwable?)] args) {
    if (is [String,Anything(Throwable?)] args) {
      Anything v = delegate.mkdirs(args[0],nothing);
    }
    if (is [String,String,Anything(Throwable?)] args) {
      Anything v = delegate.mkdirs(args[0],args[1],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem mkdirsBlocking_impl([String]|[String,String] args) {
    if (is [String] args) {
      Anything v = delegate.mkdirsBlocking(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.mkdirsBlocking(args[0],args[1]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem readDir_impl([String,Anything(Throwable|List<String>)]|[String,String,Anything(Throwable|List<String>)] args) {
    if (is [String,Anything(Throwable|List<String>)] args) {
      Anything v = delegate.readDir(args[0],nothing);
    }
    if (is [String,String,Anything(Throwable|List<String>)] args) {
      Anything v = delegate.readDir(args[0],args[1],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> readDirBlocking_impl([String]|[String,String] args) {
    if (is [String] args) {
      Anything v = delegate.readDirBlocking(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.readDirBlocking(args[0],args[1]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem readFile_impl([String,Anything(Throwable|Buffer)] args) {
    Anything v = delegate.readFile(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer readFileBlocking_impl([String] args) {
    Anything v = delegate.readFileBlocking(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem writeFile_impl([String,Buffer,Anything(Throwable?)] args) {
    assert(is Delegating<Buffer> arg_1 = args[1]);
    Anything v = delegate.writeFile(args[0],arg_1.delegate,nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem writeFileBlocking_impl([String,Buffer] args) {
    assert(is Delegating<Buffer> arg_1 = args[1]);
    Anything v = delegate.writeFileBlocking(args[0],arg_1.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem open_impl([String,OpenOptions,Anything(Throwable|AsyncFile)] args) {
    Anything v = delegate.open(args[0],nothing,nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  AsyncFile openBlocking_impl([String,OpenOptions] args) {
    Anything v = delegate.openBlocking(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem createFile_impl([String,Anything(Throwable?)]|[String,String,Anything(Throwable?)] args) {
    if (is [String,Anything(Throwable?)] args) {
      Anything v = delegate.createFile(args[0],nothing);
    }
    if (is [String,String,Anything(Throwable?)] args) {
      Anything v = delegate.createFile(args[0],args[1],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem createFileBlocking_impl([String]|[String,String] args) {
    if (is [String] args) {
      Anything v = delegate.createFileBlocking(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.createFileBlocking(args[0],args[1]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem \iexists_impl([String,Anything(Throwable|Boolean)] args) {
    Anything v = delegate.\iexists(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean existsBlocking_impl([String] args) {
    Anything v = delegate.existsBlocking(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystem fsProps_impl([String,Anything(Throwable|FileSystemProps)] args) {
    Anything v = delegate.fsProps(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  FileSystemProps fsPropsBlocking_impl([String] args) {
    Anything v = delegate.fsPropsBlocking(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
