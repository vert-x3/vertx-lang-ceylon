import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  FileProps_=FileProps
}
/* Generated from io.vertx.core.file.FileProps */
shared abstract class FileProps(FileProps_ delegate) satisfies Delegating {
  shared formal Integer(*<[]>) creationTime;
  shared formal Integer(*<[]>) lastAccessTime;
  shared formal Integer(*<[]>) lastModifiedTime;
  shared formal Boolean(*<[]>) isDirectory;
  shared formal Boolean(*<[]>) isOther;
  shared formal Boolean(*<[]>) isRegularFile;
  shared formal Boolean(*<[]>) isSymbolicLink;
  shared formal Integer(*<[]>) size;
}
