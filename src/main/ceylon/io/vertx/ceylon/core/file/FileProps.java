package io.vertx.ceylon.core.file;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class FileProps {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(FileProps.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.file.FileProps, FileProps> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.file.FileProps, FileProps>() {
    public FileProps convert(io.vertx.core.file.FileProps src) {
      return new FileProps(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<FileProps, io.vertx.core.file.FileProps> TO_JAVA = new io.vertx.lang.ceylon.Converter<FileProps, io.vertx.core.file.FileProps>() {
    public io.vertx.core.file.FileProps convert(FileProps src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.file.FileProps delegate;

  public FileProps(io.vertx.core.file.FileProps delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long creationTime() {
    long ret = delegate.creationTime();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long lastAccessTime() {
    long ret = delegate.lastAccessTime();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long lastModifiedTime() {
    long ret = delegate.lastModifiedTime();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isDirectory() {
    boolean ret = delegate.isDirectory();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isOther() {
    boolean ret = delegate.isOther();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isRegularFile() {
    boolean ret = delegate.isRegularFile();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isSymbolicLink() {
    boolean ret = delegate.isSymbolicLink();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

}
