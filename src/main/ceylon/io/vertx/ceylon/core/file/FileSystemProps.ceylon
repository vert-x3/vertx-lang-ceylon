import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  FileSystemProps_=FileSystemProps
}
/* Generated from io.vertx.core.file.FileSystemProps */
shared interface FileSystemProps  {

  shared formal Integer(*<[]>) totalSpace;
  shared formal Integer(*<[]>) unallocatedSpace;
  shared formal Integer(*<[]>) usableSpace;
}
/* Generated from io.vertx.core.file.FileSystemProps */

shared abstract class FileSystemProps_Impl(FileSystemProps_ delegate) satisfies FileSystemProps & Delegating<FileSystemProps_> {

  shared actual Integer(*<[]>) totalSpace => flatten(totalSpace_impl);
  shared actual Integer(*<[]>) unallocatedSpace => flatten(unallocatedSpace_impl);
  shared actual Integer(*<[]>) usableSpace => flatten(usableSpace_impl);

  Integer totalSpace_impl([] args) {
    Anything v = delegate.totalSpace();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer unallocatedSpace_impl([] args) {
    Anything v = delegate.unallocatedSpace();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer usableSpace_impl([] args) {
    Anything v = delegate.usableSpace();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
