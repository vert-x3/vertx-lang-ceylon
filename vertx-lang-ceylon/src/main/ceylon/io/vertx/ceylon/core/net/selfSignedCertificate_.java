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
@Name("selfSignedCertificate")
@com.redhat.ceylon.compiler.java.metadata.Object
public class selfSignedCertificate_ implements ReifiedType {

  private static final selfSignedCertificate_ instance = new selfSignedCertificate_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(selfSignedCertificate_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.net::selfSignedCertificate")
  public static selfSignedCertificate_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a new <code>SelfSignedCertificate</code> instance.\n")
  @TypeInfo("io.vertx.ceylon.core.net::SelfSignedCertificate")
  public SelfSignedCertificate create() {
    SelfSignedCertificate ret = io.vertx.ceylon.core.net.SelfSignedCertificate.TO_CEYLON.converter().safeConvert(io.vertx.core.net.SelfSignedCertificate.create());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a new <code>SelfSignedCertificate</code> instance with a fully-qualified domain name,\n")
  @TypeInfo("io.vertx.ceylon.core.net::SelfSignedCertificate")
  public SelfSignedCertificate create(
    final @TypeInfo("ceylon.language::String") @Name("fqdn")@DocAnnotation$annotation$(description = "a fully qualified domain name.\n") ceylon.language.String fqdn) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(fqdn);
    SelfSignedCertificate ret = io.vertx.ceylon.core.net.SelfSignedCertificate.TO_CEYLON.converter().safeConvert(io.vertx.core.net.SelfSignedCertificate.create(arg_0));
    return ret;
  }

}
