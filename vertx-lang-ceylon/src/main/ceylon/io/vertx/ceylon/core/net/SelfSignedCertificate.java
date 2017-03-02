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
@DocAnnotation$annotation$(description = " A self-signed certificate helper for testing and development purposes.\n <p>\n While it helps for testing and development, it should never ever be used in production settings.\n")
public class SelfSignedCertificate implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.SelfSignedCertificate, SelfSignedCertificate> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.SelfSignedCertificate, SelfSignedCertificate>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.net.SelfSignedCertificate, SelfSignedCertificate> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.net.SelfSignedCertificate, SelfSignedCertificate>() {
        public SelfSignedCertificate convert(io.vertx.core.net.SelfSignedCertificate src) {
          return new SelfSignedCertificate(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SelfSignedCertificate, io.vertx.core.net.SelfSignedCertificate> TO_JAVA = new io.vertx.lang.ceylon.Converter<SelfSignedCertificate, io.vertx.core.net.SelfSignedCertificate>() {
    public io.vertx.core.net.SelfSignedCertificate convert(SelfSignedCertificate src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(SelfSignedCertificate.class), io.vertx.core.net.SelfSignedCertificate.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.net.SelfSignedCertificate delegate;

  public SelfSignedCertificate(io.vertx.core.net.SelfSignedCertificate delegate) {
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

  @DocAnnotation$annotation$(description = " Provides the `io.vertx.core.net.KeyCertOptions` RSA private key file in PEM format corresponding to the [privateKeyPath](../net/SelfSignedCertificate.type.html#privateKeyPath)\n")
  @TypeInfo("io.vertx.ceylon.core.net::PemKeyCertOptions")
  public io.vertx.ceylon.core.net.PemKeyCertOptions keyCertOptions() {
    io.vertx.ceylon.core.net.PemKeyCertOptions ret = io.vertx.ceylon.core.net.pemKeyCertOptions_.get_().getToCeylon().safeConvert(delegate.keyCertOptions());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Provides the `io.vertx.core.net.TrustOptions` X.509 certificate file in PEM format corresponding to the [certificatePath](../net/SelfSignedCertificate.type.html#certificatePath)\n")
  @TypeInfo("io.vertx.ceylon.core.net::PemTrustOptions")
  public io.vertx.ceylon.core.net.PemTrustOptions trustOptions() {
    io.vertx.ceylon.core.net.PemTrustOptions ret = io.vertx.ceylon.core.net.pemTrustOptions_.get_().getToCeylon().safeConvert(delegate.trustOptions());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Filesystem path to the RSA private key file in PEM format\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String privateKeyPath() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.privateKeyPath());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Filesystem path to the X.509 certificate file in PEM format .\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String certificatePath() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.certificatePath());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Delete the private key and certificate files.\n")
  @TypeInfo("ceylon.language::Anything")
  public void delete() {
    delegate.delete();
  }

}
