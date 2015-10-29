package io.vertx.ceylon.core.file;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.List;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class FileSystem {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(FileSystem.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.file.FileSystem, FileSystem> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.file.FileSystem, FileSystem>() {
    public FileSystem convert(io.vertx.core.file.FileSystem src) {
      return new FileSystem(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<FileSystem, io.vertx.core.file.FileSystem> TO_JAVA = new io.vertx.lang.ceylon.Converter<FileSystem, io.vertx.core.file.FileSystem>() {
    public io.vertx.core.file.FileSystem convert(FileSystem src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.file.FileSystem delegate;

  public FileSystem(io.vertx.core.file.FileSystem delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem copy(
    final @TypeInfo("ceylon.language::String") @Name("from") @DocAnnotation$annotation$(description = "todo") ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to") @DocAnnotation$annotation$(description = "todo") ceylon.language.String to, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.copy(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem copyBlocking(
    final @TypeInfo("ceylon.language::String") @Name("from") @DocAnnotation$annotation$(description = "todo") ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to") @DocAnnotation$annotation$(description = "todo") ceylon.language.String to) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.copyBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem copyRecursive(
    final @TypeInfo("ceylon.language::String") @Name("from") @DocAnnotation$annotation$(description = "todo") ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to") @DocAnnotation$annotation$(description = "todo") ceylon.language.String to, 
    final @TypeInfo("ceylon.language::Boolean") @Name("recursive") @DocAnnotation$annotation$(description = "todo") boolean recursive, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    boolean arg_2 = recursive;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.copyRecursive(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem copyRecursiveBlocking(
    final @TypeInfo("ceylon.language::String") @Name("from") @DocAnnotation$annotation$(description = "todo") ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to") @DocAnnotation$annotation$(description = "todo") ceylon.language.String to, 
    final @TypeInfo("ceylon.language::Boolean") @Name("recursive") @DocAnnotation$annotation$(description = "todo") boolean recursive) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    boolean arg_2 = recursive;
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.copyRecursiveBlocking(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem move(
    final @TypeInfo("ceylon.language::String") @Name("from") @DocAnnotation$annotation$(description = "todo") ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to") @DocAnnotation$annotation$(description = "todo") ceylon.language.String to, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.move(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem moveBlocking(
    final @TypeInfo("ceylon.language::String") @Name("from") @DocAnnotation$annotation$(description = "todo") ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to") @DocAnnotation$annotation$(description = "todo") ceylon.language.String to) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.moveBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem truncate(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Integer") @Name("len") @DocAnnotation$annotation$(description = "todo") long len, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    long arg_1 = len;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.truncate(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem truncateBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Integer") @Name("len") @DocAnnotation$annotation$(description = "todo") long len) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    long arg_1 = len;
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.truncateBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chmod(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.chmod(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chmodBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String perms) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.chmodBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chmodRecursive(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::String") @Name("dirPerms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String dirPerms, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(dirPerms);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.chmodRecursive(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chmodRecursiveBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::String") @Name("dirPerms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String dirPerms) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(dirPerms);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.chmodRecursiveBlocking(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chown(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String?") @Name("user") @DocAnnotation$annotation$(description = "todo") ceylon.language.String user, 
    final @TypeInfo("ceylon.language::String?") @Name("group") @DocAnnotation$annotation$(description = "todo") ceylon.language.String group, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(user);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(group);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.chown(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chownBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String?") @Name("user") @DocAnnotation$annotation$(description = "todo") ceylon.language.String user, 
    final @TypeInfo("ceylon.language::String?") @Name("group") @DocAnnotation$annotation$(description = "todo") ceylon.language.String group) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(user);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(group);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.chownBlocking(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem props(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.file::FileProps)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.file.FileProps>(handler) {
      public Object toCeylon(io.vertx.core.file.FileProps event) {
        return io.vertx.ceylon.core.file.FileProps.TO_CEYLON.safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.props(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileProps")
  public FileProps propsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileProps ret = io.vertx.ceylon.core.file.FileProps.TO_CEYLON.safeConvert(delegate.propsBlocking(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem lprops(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.file::FileProps)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.file.FileProps>(handler) {
      public Object toCeylon(io.vertx.core.file.FileProps event) {
        return io.vertx.ceylon.core.file.FileProps.TO_CEYLON.safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.lprops(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileProps")
  public FileProps lpropsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileProps ret = io.vertx.ceylon.core.file.FileProps.TO_CEYLON.safeConvert(delegate.lpropsBlocking(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem link(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "todo") ceylon.language.String link, 
    final @TypeInfo("ceylon.language::String") @Name("existing") @DocAnnotation$annotation$(description = "todo") ceylon.language.String existing, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(existing);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.link(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem linkBlocking(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "todo") ceylon.language.String link, 
    final @TypeInfo("ceylon.language::String") @Name("existing") @DocAnnotation$annotation$(description = "todo") ceylon.language.String existing) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(existing);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.linkBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem symlink(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "todo") ceylon.language.String link, 
    final @TypeInfo("ceylon.language::String") @Name("existing") @DocAnnotation$annotation$(description = "todo") ceylon.language.String existing, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(existing);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.symlink(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem symlinkBlocking(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "todo") ceylon.language.String link, 
    final @TypeInfo("ceylon.language::String") @Name("existing") @DocAnnotation$annotation$(description = "todo") ceylon.language.String existing) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(existing);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.symlinkBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem unlink(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "todo") ceylon.language.String link, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.unlink(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem unlinkBlocking(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "todo") ceylon.language.String link) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.unlinkBlocking(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem readSymlink(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "todo") ceylon.language.String link, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.readSymlink(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String readSymlinkBlocking(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "todo") ceylon.language.String link) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.readSymlinkBlocking(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem delete(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.delete(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem deleteBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.deleteBlocking(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem deleteRecursive(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Boolean") @Name("recursive") @DocAnnotation$annotation$(description = "todo") boolean recursive, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    boolean arg_1 = recursive;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.deleteRecursive(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem deleteRecursiveBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Boolean") @Name("recursive") @DocAnnotation$annotation$(description = "todo") boolean recursive) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    boolean arg_1 = recursive;
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.deleteRecursiveBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdir(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.mkdir(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.mkdirBlocking(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdir(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.mkdir(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String perms) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.mkdirBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirs(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.mkdirs(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.mkdirsBlocking(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirs(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.mkdirs(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String perms) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.mkdirsBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem readDir(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.readDir(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> readDirBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.readDirBlocking(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem readDir(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("filter") @DocAnnotation$annotation$(description = "todo") ceylon.language.String filter, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filter);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.readDir(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> readDirBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("filter") @DocAnnotation$annotation$(description = "todo") ceylon.language.String filter) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filter);
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.readDirBlocking(arg_0, arg_1), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem readFile(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.buffer::Buffer)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.buffer.Buffer>(handler) {
      public Object toCeylon(io.vertx.core.buffer.Buffer event) {
        return io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.readFile(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer readFileBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(delegate.readFileBlocking(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem writeFile(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.buffer.Buffer arg_1 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.writeFile(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem writeFileBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.buffer.Buffer arg_1 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.writeFileBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem open(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("io.vertx.ceylon.core.file::OpenOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.file.OpenOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.file::AsyncFile)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.file.OpenOptions arg_1 = options == null ? null : new io.vertx.core.file.OpenOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.file.AsyncFile>(handler) {
      public Object toCeylon(io.vertx.core.file.AsyncFile event) {
        return io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.open(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile openBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("io.vertx.ceylon.core.file::OpenOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.file.OpenOptions options) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.file.OpenOptions arg_1 = options == null ? null : new io.vertx.core.file.OpenOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.safeConvert(delegate.openBlocking(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem createFile(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.createFile(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem createFileBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.createFileBlocking(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem createFile(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.createFile(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem createFileBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "todo") ceylon.language.String perms) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.createFileBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem exists(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(handler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.exists(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean existsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    boolean ret = delegate.existsBlocking(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem fsProps(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.file::FileSystemProps)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.file.FileSystemProps>(handler) {
      public Object toCeylon(io.vertx.core.file.FileSystemProps event) {
        return io.vertx.ceylon.core.file.FileSystemProps.TO_CEYLON.safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.safeConvert(delegate.fsProps(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystemProps")
  public FileSystemProps fsPropsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileSystemProps ret = io.vertx.ceylon.core.file.FileSystemProps.TO_CEYLON.safeConvert(delegate.fsPropsBlocking(arg_0));
    return ret;
  }

}
