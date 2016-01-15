package io.vertx.ceylon.core.file;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.List;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Contains a broad set of operations for manipulating files on the file system.\n <p>\n A (potential) blocking and non blocking version of each operation is provided.\n <p>\n The non blocking versions take a handler which is called when the operation completes or an error occurs.\n <p>\n The blocking versions are named <code>xxxBlocking</code> and return the results, or throw exceptions directly.\n In many cases, depending on the operating system and file system some of the potentially blocking operations\n can return quickly, which is why we provide them, but it's highly recommended that you test how long they take to\n return in your particular application before using them on an event loop.\n <p>\n Please consult the documentation for more information on file system support.\n")
public class FileSystem implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.file.FileSystem, FileSystem> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.file.FileSystem, FileSystem>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.file.FileSystem, FileSystem> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.file.FileSystem, FileSystem>() {
        public FileSystem convert(io.vertx.core.file.FileSystem src) {
          return new FileSystem(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<FileSystem, io.vertx.core.file.FileSystem> TO_JAVA = new io.vertx.lang.ceylon.Converter<FileSystem, io.vertx.core.file.FileSystem>() {
    public io.vertx.core.file.FileSystem convert(FileSystem src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(FileSystem.class);
  @Ignore private final io.vertx.core.file.FileSystem delegate;

  public FileSystem(io.vertx.core.file.FileSystem delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = " Copy a file from the path <code>from</code> to path <code>to</code>, asynchronously.\n <p>\n The copy will fail if the destination already exists.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem copy(
    final @TypeInfo("ceylon.language::String") @Name("from") @DocAnnotation$annotation$(description = "the path to copy from\n") ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to") @DocAnnotation$annotation$(description = "the path to copy to\n") ceylon.language.String to, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.copy(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [copy](../file/FileSystem.type.html#copy)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem copyBlocking(
    final @TypeInfo("ceylon.language::String") @Name("from")  ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to")  ceylon.language.String to) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.copyBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Copy a file from the path <code>from</code> to path <code>to</code>, asynchronously.\n <p>\n If <code>recursive</code> is <code>true</code> and <code>from</code> represents a directory, then the directory and its contents\n will be copied recursively to the destination <code>to</code>.\n <p>\n The copy will fail if the destination if the destination already exists.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem copyRecursive(
    final @TypeInfo("ceylon.language::String") @Name("from") @DocAnnotation$annotation$(description = "the path to copy from\n") ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to") @DocAnnotation$annotation$(description = "the path to copy to\n") ceylon.language.String to, 
    final @TypeInfo("ceylon.language::Boolean") @Name("recursive")  boolean recursive, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    boolean arg_2 = recursive;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.copyRecursive(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [copyRecursive](../file/FileSystem.type.html#copyRecursive)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem copyRecursiveBlocking(
    final @TypeInfo("ceylon.language::String") @Name("from")  ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to")  ceylon.language.String to, 
    final @TypeInfo("ceylon.language::Boolean") @Name("recursive")  boolean recursive) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    boolean arg_2 = recursive;
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.copyRecursiveBlocking(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Move a file from the path <code>from</code> to path <code>to</code>, asynchronously.\n <p>\n The move will fail if the destination already exists.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem move(
    final @TypeInfo("ceylon.language::String") @Name("from") @DocAnnotation$annotation$(description = "the path to copy from\n") ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to") @DocAnnotation$annotation$(description = "the path to copy to\n") ceylon.language.String to, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.move(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [move](../file/FileSystem.type.html#move)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem moveBlocking(
    final @TypeInfo("ceylon.language::String") @Name("from")  ceylon.language.String from, 
    final @TypeInfo("ceylon.language::String") @Name("to")  ceylon.language.String to) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(from);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(to);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.moveBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Truncate the file represented by <code>path</code> to length <code>len</code> in bytes, asynchronously.\n <p>\n The operation will fail if the file does not exist or <code>len</code> is less than <code>zero</code>.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem truncate(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "the path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Integer") @Name("len") @DocAnnotation$annotation$(description = "the length to truncate it to\n") long len, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    long arg_1 = len;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.truncate(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [truncate](../file/FileSystem.type.html#truncate)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem truncateBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Integer") @Name("len")  long len) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    long arg_1 = len;
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.truncateBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Change the permissions on the file represented by <code>path</code> to <code>perms</code>, asynchronously.\n <p>\n The permission String takes the form rwxr-x--- as\n specified <a href=\"http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html\">here</a>.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chmod(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "the path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "the permissions string\n") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.chmod(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [#chmod(String, String, Handler)](../file/FileSystem.type.html)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chmodBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms")  ceylon.language.String perms) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.chmodBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Change the permissions on the file represented by <code>path</code> to <code>perms</code>, asynchronously.<p>\n The permission String takes the form rwxr-x--- as\n specified in {<a href=\"http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html\">here</a>}.\n <p>\n If the file is directory then all contents will also have their permissions changed recursively. Any directory permissions will\n be set to <code>dirPerms</code>, whilst any normal file permissions will be set to <code>perms</code>.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chmodRecursive(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "the path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "the permissions string\n") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::String") @Name("dirPerms") @DocAnnotation$annotation$(description = "the directory permissions\n") ceylon.language.String dirPerms, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(dirPerms);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.chmodRecursive(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [chmodRecursive](../file/FileSystem.type.html#chmodRecursive)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chmodRecursiveBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms")  ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::String") @Name("dirPerms")  ceylon.language.String dirPerms) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(dirPerms);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.chmodRecursiveBlocking(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Change the ownership on the file represented by <code>path</code> to <code>user</code> and {code group}, asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chown(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "the path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String?") @Name("user") @DocAnnotation$annotation$(description = "the user name, <code>null</code> will not change the user name\n") ceylon.language.String user, 
    final @TypeInfo("ceylon.language::String?") @Name("group") @DocAnnotation$annotation$(description = "the user group, <code>null</code> will not change the user group name\n") ceylon.language.String group, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(user);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(group);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.chown(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of \n\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem chownBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String?") @Name("user")  ceylon.language.String user, 
    final @TypeInfo("ceylon.language::String?") @Name("group")  ceylon.language.String group) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(user);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(group);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.chownBlocking(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Obtain properties for the file represented by <code>path</code>, asynchronously.\n <p>\n If the file is a link, the link will be followed.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem props(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "the path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.file::FileProps)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.file.FileProps>(handler) {
      public Object toCeylon(io.vertx.core.file.FileProps event) {
        return io.vertx.ceylon.core.file.FileProps.TO_CEYLON.converter().safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.props(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [props](../file/FileSystem.type.html#props)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileProps")
  public FileProps propsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileProps ret = io.vertx.ceylon.core.file.FileProps.TO_CEYLON.converter().safeConvert(delegate.propsBlocking(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Obtain properties for the link represented by <code>path</code>, asynchronously.\n <p>\n The link will not be followed.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem lprops(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "the path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.file::FileProps)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.file.FileProps>(handler) {
      public Object toCeylon(io.vertx.core.file.FileProps event) {
        return io.vertx.ceylon.core.file.FileProps.TO_CEYLON.converter().safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.lprops(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [lprops](../file/FileSystem.type.html#lprops)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileProps")
  public FileProps lpropsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileProps ret = io.vertx.ceylon.core.file.FileProps.TO_CEYLON.converter().safeConvert(delegate.lpropsBlocking(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a hard link on the file system from <code>link</code> to <code>existing</code>, asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem link(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "the link\n") ceylon.language.String link, 
    final @TypeInfo("ceylon.language::String") @Name("existing") @DocAnnotation$annotation$(description = "the link destination\n") ceylon.language.String existing, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(existing);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.link(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [link](../file/FileSystem.type.html#link)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem linkBlocking(
    final @TypeInfo("ceylon.language::String") @Name("link")  ceylon.language.String link, 
    final @TypeInfo("ceylon.language::String") @Name("existing")  ceylon.language.String existing) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(existing);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.linkBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Create a symbolic link on the file system from <code>link</code> to <code>existing</code>, asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem symlink(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "the link\n") ceylon.language.String link, 
    final @TypeInfo("ceylon.language::String") @Name("existing") @DocAnnotation$annotation$(description = "the link destination\n") ceylon.language.String existing, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(existing);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.symlink(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [link](../file/FileSystem.type.html#link)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem symlinkBlocking(
    final @TypeInfo("ceylon.language::String") @Name("link")  ceylon.language.String link, 
    final @TypeInfo("ceylon.language::String") @Name("existing")  ceylon.language.String existing) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(existing);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.symlinkBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Unlinks the link on the file system represented by the path <code>link</code>, asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem unlink(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "the link\n") ceylon.language.String link, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.unlink(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [unlink](../file/FileSystem.type.html#unlink)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem unlinkBlocking(
    final @TypeInfo("ceylon.language::String") @Name("link")  ceylon.language.String link) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.unlinkBlocking(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Returns the path representing the file that the symbolic link specified by <code>link</code> points to, asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem readSymlink(
    final @TypeInfo("ceylon.language::String") @Name("link") @DocAnnotation$annotation$(description = "the link\n") ceylon.language.String link, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.readSymlink(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [readSymlink](../file/FileSystem.type.html#readSymlink)\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String readSymlinkBlocking(
    final @TypeInfo("ceylon.language::String") @Name("link")  ceylon.language.String link) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(link);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.readSymlinkBlocking(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Deletes the file represented by the specified <code>path</code>, asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem delete(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.delete(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [delete](../file/FileSystem.type.html#delete)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem deleteBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.deleteBlocking(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Deletes the file represented by the specified <code>path</code>, asynchronously.\n <p>\n If the path represents a directory and <code>recursive = true</code> then the directory and its contents will be\n deleted recursively.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem deleteRecursive(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Boolean") @Name("recursive") @DocAnnotation$annotation$(description = "delete recursively?\n") boolean recursive, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    boolean arg_1 = recursive;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.deleteRecursive(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [deleteRecursive](../file/FileSystem.type.html#deleteRecursive)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem deleteRecursiveBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Boolean") @Name("recursive")  boolean recursive) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    boolean arg_1 = recursive;
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.deleteRecursiveBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Create the directory represented by <code>path</code>, asynchronously.\n <p>\n The operation will fail if the directory already exists.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdir(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.mkdir(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [mkdir](../file/FileSystem.type.html#mkdir)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.mkdirBlocking(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Create the directory represented by <code>path</code>, asynchronously.\n <p>\n The new directory will be created with permissions as specified by <code>perms</code>.\n <p>\n The permission String takes the form rwxr-x--- as specified\n in <a href=\"http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html\">here</a>.\n <p>\n The operation will fail if the directory already exists.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdir(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "the permissions string\n") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.mkdir(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [mkdir](../file/FileSystem.type.html#mkdir)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms")  ceylon.language.String perms) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.mkdirBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Create the directory represented by <code>path</code> and any non existent parents, asynchronously.\n <p>\n The operation will fail if the directory already exists.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirs(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.mkdirs(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [mkdirs](../file/FileSystem.type.html#mkdirs)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.mkdirsBlocking(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Create the directory represented by <code>path</code> and any non existent parents, asynchronously.\n <p>\n The new directory will be created with permissions as specified by <code>perms</code>.\n <p>\n The permission String takes the form rwxr-x--- as specified\n in <a href=\"http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html\">here</a>.\n <p>\n The operation will fail if the directory already exists.<p>\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirs(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "the permissions string\n") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.mkdirs(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [mkdirs](../file/FileSystem.type.html#mkdirs)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem mkdirsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms")  ceylon.language.String perms) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.mkdirsBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Read the contents of the directory specified by <code>path</code>, asynchronously.\n <p>\n The result is an array of String representing the paths of the files inside the directory.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem readDir(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.readDir(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [readDir](../file/FileSystem.type.html#readDir)\n")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> readDirBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.readDirBlocking(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Read the contents of the directory specified by <code>path</code>, asynchronously.\n <p>\n The parameter <code>filter</code> is a regular expression. If <code>filter</code> is specified then only the paths that\n match  @{filter}will be returned.\n <p>\n The result is an array of String representing the paths of the files inside the directory.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem readDir(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the directory\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("filter") @DocAnnotation$annotation$(description = "the filter expression\n") ceylon.language.String filter, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filter);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.readDir(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [readDir](../file/FileSystem.type.html#readDir)\n")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> readDirBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("filter")  ceylon.language.String filter) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filter);
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.readDirBlocking(arg_0, arg_1), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Reads the entire file as represented by the path <code>path</code> as a , asynchronously.\n <p>\n Do not user this method to read very large files or you risk running out of available RAM.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem readFile(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.buffer::Buffer)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.buffer.Buffer>(handler) {
      public Object toCeylon(io.vertx.core.buffer.Buffer event) {
        return io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.readFile(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [readFile](../file/FileSystem.type.html#readFile)\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer readFileBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.readFileBlocking(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Creates the file, and writes the specified <code>Buffer data</code> to the file represented by the path <code>path</code>,\n asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem writeFile(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")  Buffer data, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.buffer.Buffer arg_1 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.writeFile(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [writeFile](../file/FileSystem.type.html#writeFile)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem writeFileBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")  Buffer data) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.buffer.Buffer arg_1 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.writeFileBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Open the file represented by <code>path</code>, asynchronously.\n <p>\n The file is opened for both reading and writing. If the file does not already exist it will be created.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem open(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("io.vertx.ceylon.core.file::OpenOptions") @Name("options") @DocAnnotation$annotation$(description = "options describing how the file should be opened\n") io.vertx.ceylon.core.file.OpenOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.file::AsyncFile)") @Name("handler")  Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.file.OpenOptions arg_1 = options == null ? null : new io.vertx.core.file.OpenOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.file.AsyncFile>(handler) {
      public Object toCeylon(io.vertx.core.file.AsyncFile event) {
        return io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.open(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [open](../file/FileSystem.type.html#open)\n")
  @TypeInfo("io.vertx.ceylon.core.file::AsyncFile")
  public AsyncFile openBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("io.vertx.ceylon.core.file::OpenOptions") @Name("options")  io.vertx.ceylon.core.file.OpenOptions options) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.file.OpenOptions arg_1 = options == null ? null : new io.vertx.core.file.OpenOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    AsyncFile ret = io.vertx.ceylon.core.file.AsyncFile.TO_CEYLON.converter().safeConvert(delegate.openBlocking(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Creates an empty file with the specified <code>path</code>, asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem createFile(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.createFile(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [createFile](../file/FileSystem.type.html#createFile)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem createFileBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.createFileBlocking(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Creates an empty file with the specified <code>path</code> and permissions <code>perms</code>, asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem createFile(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms") @DocAnnotation$annotation$(description = "the permissions string\n") ceylon.language.String perms, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.createFile(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [createFile](../file/FileSystem.type.html#createFile)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem createFileBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path, 
    final @TypeInfo("ceylon.language::String") @Name("perms")  ceylon.language.String perms) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(perms);
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.createFileBlocking(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Determines whether the file as specified by the path <code>path</code> exists, asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem exists(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to the file\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Boolean>(handler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.exists(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [exists](../file/FileSystem.type.html#exists)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean existsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    boolean ret = delegate.existsBlocking(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns properties of the file-system being used by the specified <code>path</code>, asynchronously.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem fsProps(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "path to anywhere on the filesystem\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.file::FileSystemProps)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called on completion\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.file.FileSystemProps>(handler) {
      public Object toCeylon(io.vertx.core.file.FileSystemProps event) {
        return io.vertx.ceylon.core.file.FileSystemProps.TO_CEYLON.converter().safeConvert(event);
      }
    };
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.fsProps(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Blocking version of [fsProps](../file/FileSystem.type.html#fsProps)\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystemProps")
  public FileSystemProps fsPropsBlocking(
    final @TypeInfo("ceylon.language::String") @Name("path")  ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FileSystemProps ret = io.vertx.ceylon.core.file.FileSystemProps.TO_CEYLON.converter().safeConvert(delegate.fsPropsBlocking(arg_0));
    return ret;
  }

}
