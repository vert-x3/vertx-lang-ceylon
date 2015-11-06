package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
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

@Name("vertx")
@com.redhat.ceylon.compiler.java.metadata.Object
public class vertx_ {

  private static final vertx_ instance = new vertx_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.core::vertx")
  public static vertx_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public static Vertx vertx() {
    Vertx ret = io.vertx.ceylon.core.Vertx.TO_CEYLON.safeConvert(io.vertx.core.Vertx.vertx());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public static Vertx vertx(
    final @TypeInfo("io.vertx.ceylon.core::VertxOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.VertxOptions options) {
    io.vertx.core.VertxOptions arg_0 = options == null ? null : new io.vertx.core.VertxOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    Vertx ret = io.vertx.ceylon.core.Vertx.TO_CEYLON.safeConvert(io.vertx.core.Vertx.vertx(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public static void clusteredVertx(
    final @TypeInfo("io.vertx.ceylon.core::VertxOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.VertxOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core::Vertx)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.VertxOptions arg_0 = options == null ? null : new io.vertx.core.VertxOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.Vertx>(resultHandler) {
      public Object toCeylon(io.vertx.core.Vertx event) {
        return io.vertx.ceylon.core.Vertx.TO_CEYLON.safeConvert(event);
      }
    };
    io.vertx.core.Vertx.clusteredVertx(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Context?")
  public static Context currentContext() {
    Context ret = io.vertx.ceylon.core.Context.TO_CEYLON.safeConvert(io.vertx.core.Vertx.currentContext());
    return ret;
  }

}
