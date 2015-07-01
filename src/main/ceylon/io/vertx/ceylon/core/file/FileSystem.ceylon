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
  shared formal Anything(*<[]>) copy;
  shared formal Anything(*<[]>) copyBlocking;
  shared formal Anything(*<[]>) copyRecursive;
  shared formal Anything(*<[]>) copyRecursiveBlocking;
  shared formal Anything(*<[]>) move;
  shared formal Anything(*<[]>) moveBlocking;
  shared formal Anything(*<[]>) truncate;
  shared formal Anything(*<[]>) truncateBlocking;
  shared formal Anything(*<[]>) chmod;
  shared formal Anything(*<[]>) chmodBlocking;
  shared formal Anything(*<[]>) chmodRecursive;
  shared formal Anything(*<[]>) chmodRecursiveBlocking;
  shared formal Anything(*<[]>) chown;
  shared formal Anything(*<[]>) chownBlocking;
  shared formal Anything(*<[]>) props;
  shared formal Anything(*<[]>) propsBlocking;
  shared formal Anything(*<[]>) lprops;
  shared formal Anything(*<[]>) lpropsBlocking;
  shared formal Anything(*<[]>) link;
  shared formal Anything(*<[]>) linkBlocking;
  shared formal Anything(*<[]>) symlink;
  shared formal Anything(*<[]>) symlinkBlocking;
  shared formal Anything(*<[]>) unlink;
  shared formal Anything(*<[]>) unlinkBlocking;
  shared formal Anything(*<[]>) readSymlink;
  shared formal Anything(*<[]>) readSymlinkBlocking;
  shared formal Anything(*<[]>) delete;
  shared formal Anything(*<[]>) deleteBlocking;
  shared formal Anything(*<[]>) deleteRecursive;
  shared formal Anything(*<[]>) deleteRecursiveBlocking;
  shared formal Anything(*<[]|[]>) mkdir;
  shared formal Anything(*<[]|[]>) mkdirBlocking;
  shared formal Anything(*<[]|[]>) mkdirs;
  shared formal Anything(*<[]|[]>) mkdirsBlocking;
  shared formal Anything(*<[]|[]>) readDir;
  shared formal Anything(*<[]|[]>) readDirBlocking;
  shared formal Anything(*<[]>) readFile;
  shared formal Anything(*<[]>) readFileBlocking;
  shared formal Anything(*<[]>) writeFile;
  shared formal Anything(*<[]>) writeFileBlocking;
  shared formal Anything(*<[]>) open;
  shared formal Anything(*<[]>) openBlocking;
  shared formal Anything(*<[]|[]>) createFile;
  shared formal Anything(*<[]|[]>) createFileBlocking;
  shared formal Anything(*<[]>) \iexists;
  shared formal Anything(*<[]>) existsBlocking;
  shared formal Anything(*<[]>) fsProps;
  shared formal Anything(*<[]>) fsPropsBlocking;
}
