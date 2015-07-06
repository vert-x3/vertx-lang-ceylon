import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  FileProps_=FileProps
}
/* Generated from io.vertx.core.file.FileProps */
shared abstract class FileProps(FileProps_ delegate) satisfies Delegating {

  Integer creationTime_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) creationTime = flatten(creationTime_impl);

  Integer lastAccessTime_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) lastAccessTime = flatten(lastAccessTime_impl);

  Integer lastModifiedTime_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) lastModifiedTime = flatten(lastModifiedTime_impl);

  Boolean isDirectory_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isDirectory = flatten(isDirectory_impl);

  Boolean isOther_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isOther = flatten(isOther_impl);

  Boolean isRegularFile_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isRegularFile = flatten(isRegularFile_impl);

  Boolean isSymbolicLink_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isSymbolicLink = flatten(isSymbolicLink_impl);

  Integer size_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) size = flatten(size_impl);

}
