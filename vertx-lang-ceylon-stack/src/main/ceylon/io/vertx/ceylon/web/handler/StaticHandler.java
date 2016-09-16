package io.vertx.ceylon.web.handler;

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
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A handler for serving static resources from the file system or classpath.\n")
public class StaticHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.StaticHandler, StaticHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.StaticHandler, StaticHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.StaticHandler, StaticHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.StaticHandler, StaticHandler>() {
        public StaticHandler convert(io.vertx.ext.web.handler.StaticHandler src) {
          return new StaticHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<StaticHandler, io.vertx.ext.web.handler.StaticHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<StaticHandler, io.vertx.ext.web.handler.StaticHandler>() {
    public io.vertx.ext.web.handler.StaticHandler convert(StaticHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(StaticHandler.class);
  @Ignore private final io.vertx.ext.web.handler.StaticHandler delegate;

  public StaticHandler(io.vertx.ext.web.handler.StaticHandler delegate) {
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

  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0")  RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

  @DocAnnotation$annotation$(description = " Enable/Disable access to the root of the filesystem\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setAllowRootFileSystemAccess(
    final @TypeInfo("ceylon.language::Boolean") @Name("allowRootFileSystemAccess") @DocAnnotation$annotation$(description = "whether root access is allowed\n") boolean allowRootFileSystemAccess) {
    boolean arg_0 = allowRootFileSystemAccess;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setAllowRootFileSystemAccess(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the web root\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setWebRoot(
    final @TypeInfo("ceylon.language::String") @Name("webRoot") @DocAnnotation$annotation$(description = "the web root\n") ceylon.language.String webRoot) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(webRoot);
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setWebRoot(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set whether files are read-only and will never change\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setFilesReadOnly(
    final @TypeInfo("ceylon.language::Boolean") @Name("readOnly") @DocAnnotation$annotation$(description = "whether files are read-only\n") boolean readOnly) {
    boolean arg_0 = readOnly;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setFilesReadOnly(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set value for max age in caching headers\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setMaxAgeSeconds(
    final @TypeInfo("ceylon.language::Integer") @Name("maxAgeSeconds") @DocAnnotation$annotation$(description = "maximum time for browser to cache, in seconds\n") long maxAgeSeconds) {
    long arg_0 = maxAgeSeconds;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setMaxAgeSeconds(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set whether cache header handling is enabled\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setCachingEnabled(
    final @TypeInfo("ceylon.language::Boolean") @Name("enabled") @DocAnnotation$annotation$(description = "true if enabled\n") boolean enabled) {
    boolean arg_0 = enabled;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setCachingEnabled(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set whether directory listing is enabled\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setDirectoryListing(
    final @TypeInfo("ceylon.language::Boolean") @Name("directoryListing") @DocAnnotation$annotation$(description = "true if enabled\n") boolean directoryListing) {
    boolean arg_0 = directoryListing;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setDirectoryListing(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set whether hidden files should be served\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setIncludeHidden(
    final @TypeInfo("ceylon.language::Boolean") @Name("includeHidden") @DocAnnotation$annotation$(description = "true if hidden files should be served\n") boolean includeHidden) {
    boolean arg_0 = includeHidden;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setIncludeHidden(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the server cache entry timeout when caching is enabled\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setCacheEntryTimeout(
    final @TypeInfo("ceylon.language::Integer") @Name("timeout") @DocAnnotation$annotation$(description = "the timeout, in ms\n") long timeout) {
    long arg_0 = timeout;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setCacheEntryTimeout(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the index page\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setIndexPage(
    final @TypeInfo("ceylon.language::String") @Name("indexPage") @DocAnnotation$annotation$(description = "the index page\n") ceylon.language.String indexPage) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(indexPage);
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setIndexPage(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the max cache size, when caching is enabled\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setMaxCacheSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxCacheSize") @DocAnnotation$annotation$(description = "the max cache size\n") long maxCacheSize) {
    int arg_0 = (int)maxCacheSize;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setMaxCacheSize(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set whether async filesystem access should always be used\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setAlwaysAsyncFS(
    final @TypeInfo("ceylon.language::Boolean") @Name("alwaysAsyncFS") @DocAnnotation$annotation$(description = "true for always async FS access\n") boolean alwaysAsyncFS) {
    boolean arg_0 = alwaysAsyncFS;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setAlwaysAsyncFS(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set whether async/sync filesystem tuning should enabled\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setEnableFSTuning(
    final @TypeInfo("ceylon.language::Boolean") @Name("enableFSTuning") @DocAnnotation$annotation$(description = "true to enabled FS tuning\n") boolean enableFSTuning) {
    boolean arg_0 = enableFSTuning;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setEnableFSTuning(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the max serve time in ns, above which serves are considered slow\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setMaxAvgServeTimeNs(
    final @TypeInfo("ceylon.language::Integer") @Name("maxAvgServeTimeNanoSeconds") @DocAnnotation$annotation$(description = "max serve time, in ns\n") long maxAvgServeTimeNanoSeconds) {
    long arg_0 = maxAvgServeTimeNanoSeconds;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setMaxAvgServeTimeNs(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the directory template to be used when directory listing\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setDirectoryTemplate(
    final @TypeInfo("ceylon.language::String") @Name("directoryTemplate") @DocAnnotation$annotation$(description = "the directory template\n") ceylon.language.String directoryTemplate) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(directoryTemplate);
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setDirectoryTemplate(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set whether range requests (resumable downloads; media streaming) should be enabled.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setEnableRangeSupport(
    final @TypeInfo("ceylon.language::Boolean") @Name("enableRangeSupport") @DocAnnotation$annotation$(description = "true to enable range support\n") boolean enableRangeSupport) {
    boolean arg_0 = enableRangeSupport;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setEnableRangeSupport(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set whether vary header should be sent with response.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler setSendVaryHeader(
    final @TypeInfo("ceylon.language::Boolean") @Name("varyHeader") @DocAnnotation$annotation$(description = "true to sent vary header\n") boolean varyHeader) {
    boolean arg_0 = varyHeader;
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(delegate.setSendVaryHeader(arg_0));
    return this;
  }

}
