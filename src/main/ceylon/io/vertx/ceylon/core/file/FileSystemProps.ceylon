import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  FileSystemProps_=FileSystemProps
}
/* Generated from io.vertx.core.file.FileSystemProps */
shared abstract class FileSystemProps(FileSystemProps_ delegate) satisfies Delegating {

  shared  Integer(*<[]>) totalSpace => flatten(totalSpace_impl);

  shared  Integer(*<[]>) unallocatedSpace => flatten(unallocatedSpace_impl);

  shared  Integer(*<[]>) usableSpace => flatten(usableSpace_impl);

  Integer totalSpace_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer unallocatedSpace_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer usableSpace_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
