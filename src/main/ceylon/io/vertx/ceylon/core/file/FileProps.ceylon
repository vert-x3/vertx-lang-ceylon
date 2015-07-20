import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  FileProps_=FileProps
}
/* Generated from io.vertx.core.file.FileProps */
shared abstract class FileProps(FileProps_ delegate) satisfies Delegating {

  shared  Integer(*<[]>) creationTime => flatten(creationTime_impl);

  shared  Integer(*<[]>) lastAccessTime => flatten(lastAccessTime_impl);

  shared  Integer(*<[]>) lastModifiedTime => flatten(lastModifiedTime_impl);

  shared  Boolean(*<[]>) isDirectory => flatten(isDirectory_impl);

  shared  Boolean(*<[]>) isOther => flatten(isOther_impl);

  shared  Boolean(*<[]>) isRegularFile => flatten(isRegularFile_impl);

  shared  Boolean(*<[]>) isSymbolicLink => flatten(isSymbolicLink_impl);

  shared  Integer(*<[]>) size => flatten(size_impl);

  Integer creationTime_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer lastAccessTime_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer lastModifiedTime_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isDirectory_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isOther_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isRegularFile_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isSymbolicLink_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer size_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
