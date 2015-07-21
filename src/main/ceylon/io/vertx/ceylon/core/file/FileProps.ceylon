import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  FileProps_=FileProps
}
/* Generated from io.vertx.core.file.FileProps */
shared interface FileProps  {

  shared formal Integer(*<[]>) creationTime;
  shared formal Integer(*<[]>) lastAccessTime;
  shared formal Integer(*<[]>) lastModifiedTime;
  shared formal Boolean(*<[]>) isDirectory;
  shared formal Boolean(*<[]>) isOther;
  shared formal Boolean(*<[]>) isRegularFile;
  shared formal Boolean(*<[]>) isSymbolicLink;
  shared formal Integer(*<[]>) size;
}
/* Generated from io.vertx.core.file.FileProps */

shared abstract class FileProps_Impl(FileProps_ delegate) satisfies FileProps & Delegating<FileProps_> {

  shared actual Integer(*<[]>) creationTime => flatten(creationTime_impl);
  shared actual Integer(*<[]>) lastAccessTime => flatten(lastAccessTime_impl);
  shared actual Integer(*<[]>) lastModifiedTime => flatten(lastModifiedTime_impl);
  shared actual Boolean(*<[]>) isDirectory => flatten(isDirectory_impl);
  shared actual Boolean(*<[]>) isOther => flatten(isOther_impl);
  shared actual Boolean(*<[]>) isRegularFile => flatten(isRegularFile_impl);
  shared actual Boolean(*<[]>) isSymbolicLink => flatten(isSymbolicLink_impl);
  shared actual Integer(*<[]>) size => flatten(size_impl);

  Integer creationTime_impl([] args) {
    Anything v = delegate.creationTime();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer lastAccessTime_impl([] args) {
    Anything v = delegate.lastAccessTime();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer lastModifiedTime_impl([] args) {
    Anything v = delegate.lastModifiedTime();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isDirectory_impl([] args) {
    Anything v = delegate.directory;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isOther_impl([] args) {
    Anything v = delegate.other;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isRegularFile_impl([] args) {
    Anything v = delegate.regularFile;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isSymbolicLink_impl([] args) {
    Anything v = delegate.symbolicLink;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer size_impl([] args) {
    Anything v = delegate.size();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
