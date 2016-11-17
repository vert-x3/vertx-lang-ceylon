package io.vertx.ceylon.core;

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
import io.vertx.ceylon.core.datagram.DatagramSocket;
import io.vertx.ceylon.core.http.HttpServer;
import io.vertx.ceylon.core.shareddata.SharedData;
import io.vertx.ceylon.core.eventbus.EventBus;
import io.vertx.core.AsyncResult;
import io.vertx.ceylon.core.net.NetClient;
import java.util.Set;
import io.vertx.ceylon.core.dns.DnsClient;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.ceylon.core.net.NetServer;
import io.vertx.ceylon.core.file.FileSystem;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.http.HttpClient;

@Ceylon(major = 8)
@Name("vertx")
@com.redhat.ceylon.compiler.java.metadata.Object
public class vertx_ implements ReifiedType {

  private static final vertx_ instance = new vertx_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(vertx_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core::vertx")
  public static vertx_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Creates a non clustered instance using default options.\n")
  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public Vertx vertx() {
    Vertx ret = io.vertx.ceylon.core.Vertx.TO_CEYLON.converter().safeConvert(io.vertx.core.Vertx.vertx());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Creates a non clustered instance using the specified options\n")
  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public Vertx vertx(
    final @TypeInfo("io.vertx.ceylon.core::VertxOptions") @Name("options")@DocAnnotation$annotation$(description = "the options to use\n") io.vertx.ceylon.core.VertxOptions options) {
    io.vertx.core.VertxOptions arg_0 = options == null ? null : new io.vertx.core.VertxOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    Vertx ret = io.vertx.ceylon.core.Vertx.TO_CEYLON.converter().safeConvert(io.vertx.core.Vertx.vertx(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Creates a clustered instance using the specified options.\n <p>\n The instance is created asynchronously and the resultHandler is called with the result when it is ready.\n")
  @TypeInfo("ceylon.language::Anything")
  public void clusteredVertx(
    final @TypeInfo("io.vertx.ceylon.core::VertxOptions") @Name("options")@DocAnnotation$annotation$(description = "the options to use\n") io.vertx.ceylon.core.VertxOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core::Vertx)") @Name("resultHandler")@DocAnnotation$annotation$(description = "the result handler that will receive the result\n") Callable<?> resultHandler) {
    io.vertx.core.VertxOptions arg_0 = options == null ? null : new io.vertx.core.VertxOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.Vertx>(resultHandler) {
      public Object toCeylon(io.vertx.core.Vertx event) {
        return io.vertx.ceylon.core.Vertx.TO_CEYLON.converter().safeConvert(event);
      }
    };
    io.vertx.core.Vertx.clusteredVertx(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Gets the current context\n")
  @TypeInfo("io.vertx.ceylon.core::Context?")
  public Context currentContext() {
    Context ret = io.vertx.ceylon.core.Context.TO_CEYLON.converter().safeConvert(io.vertx.core.Vertx.currentContext());
    return ret;
  }

}
