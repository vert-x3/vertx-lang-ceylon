import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  FileSystemProps_=FileSystemProps
}
/* Generated from io.vertx.core.file.FileSystemProps */
shared abstract class FileSystemProps(FileSystemProps_ delegate) satisfies Delegating {

  Integer totalSpace_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) totalSpace = flatten(totalSpace_impl);

  Integer unallocatedSpace_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) unallocatedSpace = flatten(unallocatedSpace_impl);

  Integer usableSpace_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) usableSpace = flatten(usableSpace_impl);

}
