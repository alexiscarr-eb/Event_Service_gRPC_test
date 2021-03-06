import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val grpcVersion = "1.34.0"
val grpcKotlinVersion = "1.0.0"
val protobufVersion = "3.14.0"
val coroutinesVersion = "1.4.2"
val kotestVersion = "4.4.3"
val jacksonVersion = "2.12.3"


plugins {
    application
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(project(":proto"))
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:${jacksonVersion}")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation(platform("software.amazon.awssdk:bom:2.15.22"))
    implementation("software.amazon.awssdk:dynamodb-enhanced")
    runtimeOnly("io.grpc:grpc-netty-shaded:$grpcVersion")
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

application {
    mainClass.set("com.eventbrite.eventservice.server.EventServiceServerKt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
}
