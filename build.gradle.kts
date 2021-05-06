import com.google.protobuf.gradle.*
import org.gradle.kotlin.dsl.provider.gradleKotlinDslOf

plugins {
    java
    idea
    kotlin("jvm") version "1.4.32"
    id("com.google.protobuf") version "0.8.8"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://plugins.gradle.org/m2/")
}

sourceSets{
    create("sample"){
        proto {
            srcDir("src/sample/protobuf")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))

    compile("com.google.protobuf:protobuf-java:3.6.1")
    compile("io.grpc:grpc-stub:1.15.1")
    compile("io.grpc:grpc-protobuf:1.15.1")
    if (JavaVersion.current().isJava9Compatible) {
        // Workaround for @javax.annotation.Generated
        // see: https://github.com/grpc/grpc-java/issues/3633
        compile("javax.annotation:javax.annotation-api:1.3.1")
    }


    // Adding dependency for configuration from custom sourceSet
    "sampleProtobuf"(files("ext/"))

    testCompile("junit:junit:4.12")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
}

protobuf {
    protoc {
        // The artifact spec for the Protobuf Compiler
        artifact = "com.google.protobuf:protoc:3.6.1"
    }
    plugins {
        // Optional: an artifact spec for a protoc plugin, with "grpc" as
        // the identifier, which can be referred to in the "plugins"
        // container of the "generateProtoTasks" closure.
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.15.1"
        }
    }
    generateProtoTasks {
        ofSourceSet("main").forEach {
            it.plugins {
                // Apply the "grpc" plugin whose spec is defined above, without options.
                id("grpc")
            }
        }
    }
}

