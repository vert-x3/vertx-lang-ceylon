import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  FileSystemProps_=FileSystemProps
}
/* Generated from io.vertx.core.file.FileSystemProps */
shared abstract class FileSystemProps(FileSystemProps_ delegate) satisfies Delegating {
  shared formal Integer(*<[]>) totalSpace;
  shared formal Integer(*<[]>) unallocatedSpace;
  shared formal Integer(*<[]>) usableSpace;
}
