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

@Ceylon(major = 8)@DocAnnotation$annotation$(description = "todo")
public class Vertx implements ReifiedType,  Measured {

  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.Vertx, Vertx> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.Vertx, Vertx>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.Vertx, Vertx> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.Vertx, Vertx>() {
        public Vertx convert(io.vertx.core.Vertx src) {
          return new Vertx(src);
        }
      };
    }
  };

  public static final io.vertx.lang.ceylon.Converter<Vertx, io.vertx.core.Vertx> TO_JAVA = new io.vertx.lang.ceylon.Converter<Vertx, io.vertx.core.Vertx>() {
    public io.vertx.core.Vertx convert(Vertx src) {
      return src.delegate;
    }
  };

  @Ignore private FileSystem cached_fileSystem;
  @Ignore private EventBus cached_eventBus;
  @Ignore private SharedData cached_sharedData;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Vertx.class);
  @Ignore private final io.vertx.core.Vertx delegate;

  public Vertx(io.vertx.core.Vertx delegate) {
    this.delegate = delegate;
  }

  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::Context")
  public Context getOrCreateContext() {
    Context ret = io.vertx.ceylon.core.Context.TO_CEYLON.converter().safeConvert(delegate.getOrCreateContext());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer createNetServer(
    final @TypeInfo("io.vertx.ceylon.core.net::NetServerOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.net.NetServerOptions options) {
    io.vertx.core.net.NetServerOptions arg_0 = options == null ? null : new io.vertx.core.net.NetServerOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.createNetServer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer createNetServer() {
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.createNetServer());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient createNetClient(
    final @TypeInfo("io.vertx.ceylon.core.net::NetClientOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.net.NetClientOptions options) {
    io.vertx.core.net.NetClientOptions arg_0 = options == null ? null : new io.vertx.core.net.NetClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    NetClient ret = io.vertx.ceylon.core.net.NetClient.TO_CEYLON.converter().safeConvert(delegate.createNetClient(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient createNetClient() {
    NetClient ret = io.vertx.ceylon.core.net.NetClient.TO_CEYLON.converter().safeConvert(delegate.createNetClient());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer createHttpServer(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpServerOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpServerOptions options) {
    io.vertx.core.http.HttpServerOptions arg_0 = options == null ? null : new io.vertx.core.http.HttpServerOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.createHttpServer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer createHttpServer() {
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.createHttpServer());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient createHttpClient(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpClientOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpClientOptions options) {
    io.vertx.core.http.HttpClientOptions arg_0 = options == null ? null : new io.vertx.core.http.HttpClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.createHttpClient(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient createHttpClient() {
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.createHttpClient());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket createDatagramSocket(
    final @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocketOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.datagram.DatagramSocketOptions options) {
    io.vertx.core.datagram.DatagramSocketOptions arg_0 = options == null ? null : new io.vertx.core.datagram.DatagramSocketOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.converter().safeConvert(delegate.createDatagramSocket(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket createDatagramSocket() {
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.converter().safeConvert(delegate.createDatagramSocket());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem fileSystem() {
    if (cached_fileSystem != null) {
      return cached_fileSystem;
    }
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.fileSystem());
    cached_fileSystem = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus eventBus() {
    if (cached_eventBus != null) {
      return cached_eventBus;
    }
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.eventBus());
    cached_eventBus = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient createDnsClient(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.createDnsClient(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.shareddata::SharedData")
  public SharedData sharedData() {
    if (cached_sharedData != null) {
      return cached_sharedData;
    }
    SharedData ret = io.vertx.ceylon.core.shareddata.SharedData.TO_CEYLON.converter().safeConvert(delegate.sharedData());
    cached_sharedData = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long setTimer(
    final @TypeInfo("ceylon.language::Integer") @Name("delay") @DocAnnotation$annotation$(description = "todo") long delay, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    long arg_0 = delay;
    io.vertx.core.Handler<java.lang.Long> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Long>() {
      public void handle(java.lang.Long event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event));
      }
    };
    long ret = delegate.setTimer(arg_0, arg_1);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream timerStream(
    final @TypeInfo("ceylon.language::Integer") @Name("delay") @DocAnnotation$annotation$(description = "todo") long delay) {
    long arg_0 = delay;
    TimeoutStream ret = io.vertx.ceylon.core.TimeoutStream.TO_CEYLON.converter().safeConvert(delegate.timerStream(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long setPeriodic(
    final @TypeInfo("ceylon.language::Integer") @Name("delay") @DocAnnotation$annotation$(description = "todo") long delay, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    long arg_0 = delay;
    io.vertx.core.Handler<java.lang.Long> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Long>() {
      public void handle(java.lang.Long event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event));
      }
    };
    long ret = delegate.setPeriodic(arg_0, arg_1);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream periodicStream(
    final @TypeInfo("ceylon.language::Integer") @Name("delay") @DocAnnotation$annotation$(description = "todo") long delay) {
    long arg_0 = delay;
    TimeoutStream ret = io.vertx.ceylon.core.TimeoutStream.TO_CEYLON.converter().safeConvert(delegate.periodicStream(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean cancelTimer(
    final @TypeInfo("ceylon.language::Integer") @Name("id") @DocAnnotation$annotation$(description = "todo") long id) {
    long arg_0 = id;
    boolean ret = delegate.cancelTimer(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void runOnContext(
    final @TypeInfo("ceylon.language::Anything()") @Name("action") @DocAnnotation$annotation$(description = "todo") Callable<?> action) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = action == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        action.$call$();
      }
    };
    delegate.runOnContext(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.close(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    delegate.deployVerticle(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @Name("completionHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(completionHandler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    delegate.deployVerticle(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("io.vertx.ceylon.core::DeploymentOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.DeploymentOptions options) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.DeploymentOptions arg_1 = options == null ? null : new io.vertx.core.DeploymentOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    delegate.deployVerticle(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("io.vertx.ceylon.core::DeploymentOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.DeploymentOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @Name("completionHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.DeploymentOptions arg_1 = options == null ? null : new io.vertx.core.DeploymentOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_2 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(completionHandler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    delegate.deployVerticle(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void undeploy(
    final @TypeInfo("ceylon.language::String") @Name("deploymentID") @DocAnnotation$annotation$(description = "todo") ceylon.language.String deploymentID) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(deploymentID);
    delegate.undeploy(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void undeploy(
    final @TypeInfo("ceylon.language::String") @Name("deploymentID") @DocAnnotation$annotation$(description = "todo") ceylon.language.String deploymentID, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(deploymentID);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.undeploy(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> deploymentIDs() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, delegate.deploymentIDs(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isClustered() {
    boolean ret = delegate.isClustered();
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <T> void executeBlocking(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T>)") @Name("blockingCodeHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> blockingCodeHandler, 
    final @TypeInfo("ceylon.language::Boolean") @Name("ordered") @DocAnnotation$annotation$(description = "todo") boolean ordered, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>> arg_0 = blockingCodeHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.$call$((Object)io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$T).safeConvert(event));
      }
    };
    boolean arg_1 = ordered;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.executeBlocking(arg_0, arg_1, arg_2);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <T> void executeBlocking(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T>)") @Name("blockingCodeHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> blockingCodeHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>> arg_0 = blockingCodeHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.$call$((Object)io.vertx.ceylon.core.Future.TO_CEYLON.converter($reified$T).safeConvert(event));
      }
    };
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) {
      public Object toCeylon(java.lang.Object event) {
        return io.vertx.lang.ceylon.ToCeylon.object(event);
      }
    };
    delegate.executeBlocking(arg_0, arg_1);
  }

}
