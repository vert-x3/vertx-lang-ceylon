package io.vertx.ceylon.core.file;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

public class FileSystemProps {

  private final io.vertx.core.file.FileSystemProps delegate;

  public FileSystemProps(io.vertx.core.file.FileSystemProps delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Integer")
  public long totalSpace() {
    long ret = delegate.totalSpace();
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long unallocatedSpace() {
    long ret = delegate.unallocatedSpace();
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long usableSpace() {
    long ret = delegate.usableSpace();
    return ret;
  }

}
