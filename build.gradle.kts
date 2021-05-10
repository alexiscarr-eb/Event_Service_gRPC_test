import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.ofSourceSet
import com.google.protobuf.gradle.plugins
import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val grpcVersion = "1.34.0"
val grpcKotlinVersion = "1.0.0"
val protobufVersion = "3.14.0"
val coroutinesVersion = "1.4.2"
val kotestVersion = "4.4.3"
val jacksonVersion = "2.15.22"

plugins {
    kotlin("jvm") version "1.4.31" apply false
    id("com.google.protobuf") version "0.8.14" apply false
    kotlin("plugin.spring") version "1.3.61" apply false
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0" apply false
    id("org.springframework.boot") version "2.4.5" apply false
    id("io.spring.dependency-management") version "1.0.8.RELEASE" apply false
}




