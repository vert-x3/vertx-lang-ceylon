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
@DocAnnotation$annotation$(description = " The entry point into the Vert.x Core API.\n <p>\n You use an instance of this class for functionality including:\n <ul>\n   <li>Creating TCP clients and servers</li>\n   <li>Creating HTTP clients and servers</li>\n   <li>Creating DNS clients</li>\n   <li>Creating Datagram sockets</li>\n   <li>Setting and cancelling periodic and one-shot timers</li>\n   <li>Getting a reference to the event bus API</li>\n   <li>Getting a reference to the file system API</li>\n   <li>Getting a reference to the shared data API</li>\n   <li>Deploying and undeploying verticles</li>\n </ul>\n <p>\n Most functionality in Vert.x core is fairly low level.\n <p>\n To create an instance of this class you can use the static factory methods: [vertx](vertx.type.html#vertx),\n [vertx](vertx.type.html#vertx) and [clusteredVertx](vertx.type.html#clusteredVertx).\n <p>\n Please see the user manual for more detailed usage information.\n")
public class Vertx implements ReifiedType,  Measured {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.Vertx, Vertx> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.Vertx, Vertx>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.Vertx, Vertx> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.Vertx, Vertx>() {
        public Vertx convert(io.vertx.core.Vertx src) {
          return new Vertx(src);
        }
      };
    }
  };

  @Ignore
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

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = " Whether the metrics are enabled for this measured object\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets the current context, or creates one if there isn't one\n")
  @TypeInfo("io.vertx.ceylon.core::Context")
  public Context getOrCreateContext() {
    Context ret = io.vertx.ceylon.core.Context.TO_CEYLON.converter().safeConvert(delegate.getOrCreateContext());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a TCP/SSL server using the specified options\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer createNetServer(
    final @TypeInfo("io.vertx.ceylon.core.net::NetServerOptions") @Name("options") @DocAnnotation$annotation$(description = "the options to use\n") io.vertx.ceylon.core.net.NetServerOptions options) {
    io.vertx.core.net.NetServerOptions arg_0 = options == null ? null : new io.vertx.core.net.NetServerOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.createNetServer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a TCP/SSL server using default options\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer createNetServer() {
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.createNetServer());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a TCP/SSL client using the specified options\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient createNetClient(
    final @TypeInfo("io.vertx.ceylon.core.net::NetClientOptions") @Name("options") @DocAnnotation$annotation$(description = "the options to use\n") io.vertx.ceylon.core.net.NetClientOptions options) {
    io.vertx.core.net.NetClientOptions arg_0 = options == null ? null : new io.vertx.core.net.NetClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    NetClient ret = io.vertx.ceylon.core.net.NetClient.TO_CEYLON.converter().safeConvert(delegate.createNetClient(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a TCP/SSL client using default options\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient createNetClient() {
    NetClient ret = io.vertx.ceylon.core.net.NetClient.TO_CEYLON.converter().safeConvert(delegate.createNetClient());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP/HTTPS server using the specified options\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer createHttpServer(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpServerOptions") @Name("options") @DocAnnotation$annotation$(description = "the options to use\n") io.vertx.ceylon.core.http.HttpServerOptions options) {
    io.vertx.core.http.HttpServerOptions arg_0 = options == null ? null : new io.vertx.core.http.HttpServerOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.createHttpServer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP/HTTPS server using default options\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer createHttpServer() {
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.createHttpServer());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a HTTP/HTTPS client using the specified options\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient createHttpClient(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpClientOptions") @Name("options") @DocAnnotation$annotation$(description = "the options to use\n") io.vertx.ceylon.core.http.HttpClientOptions options) {
    io.vertx.core.http.HttpClientOptions arg_0 = options == null ? null : new io.vertx.core.http.HttpClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.createHttpClient(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a HTTP/HTTPS client using default options\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient createHttpClient() {
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.createHttpClient());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a datagram socket using the specified options\n")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket createDatagramSocket(
    final @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocketOptions") @Name("options") @DocAnnotation$annotation$(description = "the options to use\n") io.vertx.ceylon.core.datagram.DatagramSocketOptions options) {
    io.vertx.core.datagram.DatagramSocketOptions arg_0 = options == null ? null : new io.vertx.core.datagram.DatagramSocketOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.converter().safeConvert(delegate.createDatagramSocket(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a datagram socket using default options\n")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket createDatagramSocket() {
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.converter().safeConvert(delegate.createDatagramSocket());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the filesystem object. There is a single instance of FileSystem per Vertx instance.\n")
  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem fileSystem() {
    if (cached_fileSystem != null) {
      return cached_fileSystem;
    }
    FileSystem ret = io.vertx.ceylon.core.file.FileSystem.TO_CEYLON.converter().safeConvert(delegate.fileSystem());
    cached_fileSystem = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the event bus object. There is a single instance of EventBus per Vertx instance.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus eventBus() {
    if (cached_eventBus != null) {
      return cached_eventBus;
    }
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.eventBus());
    cached_eventBus = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a DNS client to connect to a DNS server at the specified host and port\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient createDnsClient(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "the port\n") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "the host\n") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.createDnsClient(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the shared data object. There is a single instance of SharedData per Vertx instance.\n")
  @TypeInfo("io.vertx.ceylon.core.shareddata::SharedData")
  public SharedData sharedData() {
    if (cached_sharedData != null) {
      return cached_sharedData;
    }
    SharedData ret = io.vertx.ceylon.core.shareddata.SharedData.TO_CEYLON.converter().safeConvert(delegate.sharedData());
    cached_sharedData = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set a one-shot timer to fire after <code>delay</code> milliseconds, at which point <code>handler</code> will be called with\n the id of the timer.\n")
  @TypeInfo("ceylon.language::Integer")
  public long setTimer(
    final @TypeInfo("ceylon.language::Integer") @Name("delay") @DocAnnotation$annotation$(description = "the delay in milliseconds, after which the timer will fire\n") long delay, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called with the timer ID when the timer fires\n") Callable<?> handler) {
    long arg_0 = delay;
    io.vertx.core.Handler<java.lang.Long> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Long>() {
      public void handle(java.lang.Long event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event));
      }
    };
    long ret = delegate.setTimer(arg_0, arg_1);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a one-shot timer as a read stream. The timer will be fired after <code>delay</code> milliseconds after\n the  has been called.\n")
  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream timerStream(
    final @TypeInfo("ceylon.language::Integer") @Name("delay") @DocAnnotation$annotation$(description = "the delay in milliseconds, after which the timer will fire\n") long delay) {
    long arg_0 = delay;
    TimeoutStream ret = io.vertx.ceylon.core.TimeoutStream.TO_CEYLON.converter().safeConvert(delegate.timerStream(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set a periodic timer to fire every <code>delay</code> milliseconds, at which point <code>handler</code> will be called with\n the id of the timer.\n")
  @TypeInfo("ceylon.language::Integer")
  public long setPeriodic(
    final @TypeInfo("ceylon.language::Integer") @Name("delay") @DocAnnotation$annotation$(description = "the delay in milliseconds, after which the timer will fire\n") long delay, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @Name("handler") @DocAnnotation$annotation$(description = "the handler that will be called with the timer ID when the timer fires\n") Callable<?> handler) {
    long arg_0 = delay;
    io.vertx.core.Handler<java.lang.Long> arg_1 = handler == null ? null : new io.vertx.core.Handler<java.lang.Long>() {
      public void handle(java.lang.Long event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Long.safeConvert(event));
      }
    };
    long ret = delegate.setPeriodic(arg_0, arg_1);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a periodic timer as a read stream. The timer will be fired every <code>delay</code> milliseconds after\n the  has been called.\n")
  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream periodicStream(
    final @TypeInfo("ceylon.language::Integer") @Name("delay") @DocAnnotation$annotation$(description = "the delay in milliseconds, after which the timer will fire\n") long delay) {
    long arg_0 = delay;
    TimeoutStream ret = io.vertx.ceylon.core.TimeoutStream.TO_CEYLON.converter().safeConvert(delegate.periodicStream(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Cancels the timer with the specified <code>id</code>.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean cancelTimer(
    final @TypeInfo("ceylon.language::Integer") @Name("id") @DocAnnotation$annotation$(description = "The id of the timer to cancel\n") long id) {
    long arg_0 = id;
    boolean ret = delegate.cancelTimer(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Puts the handler on the event queue for the current context so it will be run asynchronously ASAP after all\n preceeding events have been handled.\n")
  @TypeInfo("ceylon.language::Anything")
  public void runOnContext(
    final @TypeInfo("ceylon.language::Anything()") @Name("action") @DocAnnotation$annotation$(description = "- a handler representing the action to execute\n") Callable<?> action) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = action == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        action.$call$();
      }
    };
    delegate.runOnContext(arg_0);
  }

  @DocAnnotation$annotation$(description = " Stop the the Vertx instance and release any resources held by it.\n <p>\n The instance cannot be used after it has been closed.\n <p>\n The actual close is asynchronous and may not complete until after the call has returned.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = " Like [close](Vertx.type.html#close) but the completionHandler will be called when the close is complete\n")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "The handler will be notified when the close is complete.\n") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.close(arg_0);
  }

  @DocAnnotation$annotation$(description = " Deploy a verticle instance given a name.\n <p>\n Given the name, Vert.x selects a  instance to use to instantiate the verticle.\n <p>\n For the rules on how factories are selected please consult the user manual.\n")
  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name.\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    delegate.deployVerticle(arg_0);
  }

  @DocAnnotation$annotation$(description = " Like [deployVerticle](Vertx.type.html#deployVerticle) but the completionHandler will be notified when the deployment is complete.\n <p>\n If the deployment is successful the result will contain a String representing the unique deployment ID of the\n deployment.\n <p>\n This deployment ID can subsequently be used to undeploy the verticle.\n")
  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "The identifier\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @Name("completionHandler") @DocAnnotation$annotation$(description = "a handler which will be notified when the deployment is complete\n") Callable<?> completionHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(completionHandler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    delegate.deployVerticle(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Like [deployVerticle](Vertx.type.html#deployVerticle) but `io.vertx.core.DeploymentOptions` are provided to configure the\n deployment.\n")
  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name\n") ceylon.language.String name, 
    final @TypeInfo("io.vertx.ceylon.core::DeploymentOptions") @Name("options") @DocAnnotation$annotation$(description = "the deployment options.\n") io.vertx.ceylon.core.DeploymentOptions options) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.DeploymentOptions arg_1 = options == null ? null : new io.vertx.core.DeploymentOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    delegate.deployVerticle(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Like [deployVerticle](Vertx.type.html#deployVerticle) but `io.vertx.core.DeploymentOptions` are provided to configure the\n deployment.\n")
  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name\n") ceylon.language.String name, 
    final @TypeInfo("io.vertx.ceylon.core::DeploymentOptions") @Name("options") @DocAnnotation$annotation$(description = "the deployment options.\n") io.vertx.ceylon.core.DeploymentOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @Name("completionHandler") @DocAnnotation$annotation$(description = "a handler which will be notified when the deployment is complete\n") Callable<?> completionHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.DeploymentOptions arg_1 = options == null ? null : new io.vertx.core.DeploymentOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_2 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(completionHandler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    delegate.deployVerticle(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = " Undeploy a verticle deployment.\n <p>\n The actual undeployment happens asynchronously and may not complete until after the method has returned.\n")
  @TypeInfo("ceylon.language::Anything")
  public void undeploy(
    final @TypeInfo("ceylon.language::String") @Name("deploymentID") @DocAnnotation$annotation$(description = "the deployment ID\n") ceylon.language.String deploymentID) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(deploymentID);
    delegate.undeploy(arg_0);
  }

  @DocAnnotation$annotation$(description = " Like [#undeploy(String)](Vertx.type.html) but the completionHandler will be notified when the undeployment is complete.\n")
  @TypeInfo("ceylon.language::Anything")
  public void undeploy(
    final @TypeInfo("ceylon.language::String") @Name("deploymentID") @DocAnnotation$annotation$(description = "the deployment ID\n") ceylon.language.String deploymentID, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "a handler which will be notified when the undeployment is complete\n") Callable<?> completionHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(deploymentID);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.undeploy(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Return a Set of deployment IDs for the currently deployed deploymentIDs.\n")
  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> deploymentIDs() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertSet(ceylon.language.String.$TypeDescriptor$, delegate.deploymentIDs(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Is this Vert.x instance clustered?\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isClustered() {
    boolean ret = delegate.isClustered();
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Safely execute some blocking code.\n <p>\n Executes the blocking code in the handler <code>blockingCodeHandler</code> using a thread from the worker pool.\n <p>\n When the code is complete the handler <code>resultHandler</code> will be called with the result on the original context\n (e.g. on the original event loop of the caller).\n <p>\n A <code>Future</code> instance is passed into <code>blockingCodeHandler</code>. When the blocking code successfully completes,\n the handler should call the [complete](Future.type.html#complete) or [complete](Future.type.html#complete) method, or the [fail](Future.type.html#fail)\n method if it failed.\n")
  @TypeInfo("ceylon.language::Anything")
  public <T> void executeBlocking(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T>)") @Name("blockingCodeHandler") @DocAnnotation$annotation$(description = "handler representing the blocking code to run\n") Callable<?> blockingCodeHandler, 
    final @TypeInfo("ceylon.language::Boolean") @Name("ordered") @DocAnnotation$annotation$(description = "if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees\n") boolean ordered, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "handler that will be called when the blocking code is complete\n") Callable<?> resultHandler) {
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
  @DocAnnotation$annotation$(description = " Like [executeBlocking](Vertx.type.html#executeBlocking) called with ordered = true.\n")
  @TypeInfo("ceylon.language::Anything")
  public <T> void executeBlocking(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T>)") @Name("blockingCodeHandler")  Callable<?> blockingCodeHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T?)") @Name("resultHandler")  Callable<?> resultHandler) {
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
