package io.vertx.ceylon.core.net;

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

@Ceylon(major = 8)
@Name("socketAddress")
@com.redhat.ceylon.compiler.java.metadata.Object
public class socketAddress_ implements ReifiedType {

  private static final socketAddress_ instance = new socketAddress_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(socketAddress_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.net::socketAddress")
  public static socketAddress_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a inet socket address, <code>host</code> must be non <code>null</code> and <code>port</code> must be between <code>0</code>\n and <code>65536</code>.\n")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress inetSocketAddress(
    final @TypeInfo("ceylon.language::Integer") @Name("port")@DocAnnotation$annotation$(description = "the address port\n") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host")@DocAnnotation$annotation$(description = "the address host\n") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(io.vertx.core.net.SocketAddress.inetSocketAddress(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a domain socket address.\n")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress domainSocketAddress(
    final @TypeInfo("ceylon.language::String") @Name("path")@DocAnnotation$annotation$(description = "the address path\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(io.vertx.core.net.SocketAddress.domainSocketAddress(arg_0));
    return ret;
  }

}
