ceylon import-jar --descriptor=descriptors/com.fasterxml.jackson.core.jackson-core.properties com.fasterxml.jackson.core.jackson-core/2.6.1 target/jars/jackson-core-2.6.1.jar
ceylon import-jar --descriptor=descriptors/com.fasterxml.jackson.core.jackson-annotations.properties com.fasterxml.jackson.core.jackson-annotations/2.6.0 target/jars/jackson-annotations-2.6.0.jar
ceylon import-jar --descriptor=descriptors/com.fasterxml.jackson.core.jackson-databind.properties com.fasterxml.jackson.core.jackson-databind/2.6.1 target/jars/jackson-databind-2.6.1.jar
ceylon import-jar --descriptor=descriptors/io.netty.netty-common.properties io.netty.netty-common/4.0.31.Final target/jars/netty-common-4.0.31.Final.jar
ceylon import-jar --descriptor=descriptors/io.netty.netty-buffer.properties io.netty.netty-buffer/4.0.31.Final target/jars/netty-buffer-4.0.31.Final.jar
ceylon import-jar --descriptor=descriptors/io.netty.netty-transport.properties io.netty.netty-transport/4.0.31.Final target/jars/netty-transport-4.0.31.Final.jar
ceylon import-jar --force --descriptor=descriptors/io.netty.netty-codec.properties io.netty.netty-codec/4.0.31.Final target/jars/netty-codec-4.0.31.Final.jar
ceylon import-jar --force --descriptor=descriptors/io.netty.netty-handler.properties io.netty.netty-handler/4.0.31.Final target/jars/netty-handler-4.0.31.Final.jar
ceylon import-jar --descriptor=descriptors/io.netty.netty-codec-http.properties io.netty.netty-codec-http/4.0.31.Final target/jars/netty-codec-http-4.0.31.Final.jar
ceylon import-jar --force --descriptor=descriptors/io.vertx.vertx-codegen.properties io.vertx.vertx-codegen/3.2.0-SNAPSHOT target/jars/vertx-codegen-3.2.0-SNAPSHOT.jar
ceylon import-jar --force --descriptor=descriptors/io.vertx.vertx-core.properties io.vertx.vertx-core/3.2.0-SNAPSHOT target/jars/vertx-core-3.2.0-SNAPSHOT.jar
ceylon import-jar --force --descriptor=descriptors/com.hazelcast.hazelcast.properties com.hazelcast.hazelcast/3.5.2 target/jars/hazelcast-3.5.2.jar
ceylon import-jar --force --descriptor=descriptors/io.vertx.vertx-hazelcast.properties io.vertx.vertx-hazelcast/3.2.0-SNAPSHOT target/jars/vertx-hazelcast-3.2.0-SNAPSHOT.jar

ceylon import-jar --descriptor=descriptors/org.hamcrest.hamcrest-core.properties org.hamcrest.hamcrest-core/1.3 target/jars/hamcrest-core-1.3.jar
ceylon import-jar --descriptor=descriptors/junit.junit.properties junit.junit/4.11 target/jars/junit-4.11.jar
ceylon import-jar --descriptor=descriptors/io.vertx.vertx-codegen-tck.properties io.vertx.vertx-codegen-tck/3.2.0-SNAPSHOT target/jars/vertx-codegen-3.2.0-SNAPSHOT-tck.jar
