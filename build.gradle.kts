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

plugins {
    application
    idea
    kotlin("jvm") version "1.4.31"
    id("com.google.protobuf") version "0.8.14"
    kotlin("plugin.spring") version "1.3.61"
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
    id("org.springframework.boot") version "2.4.5"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

repositories {
    mavenLocal()
    google()
    jcenter()
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
}

sourceSets{
    create("sample"){
        proto {
            srcDir("src/main/proto/samples")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation(platform("software.amazon.awssdk:bom:2.15.22"))
    implementation("software.amazon.awssdk:dynamodb-enhanced")
    runtimeOnly("io.grpc:grpc-netty-shaded:$grpcVersion")
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

idea {
    module {
        generatedSourceDirs.add(file("build/generated/source/proto/main/grpc"))
        generatedSourceDirs.add(file("build/generated/source/proto/main/grpckt"))
        generatedSourceDirs.add(file("build/generated/source/proto/main/java"))
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:$protobufVersion"
    }
    generatedFilesBaseDir = "$projectDir/src/main/kotlin/com/eventbrite/eventservice"
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:$grpcVersion"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:$grpcKotlinVersion:jdk7@jar"
        }
    }
    generateProtoTasks {
        ofSourceSet("main").forEach {
            it.plugins {
                id("grpc")
                id("grpckt")
            }
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

tasks.withType<Test> {
    useJUnitPlatform()
}

application {
    mainClass.set("com.eventbrite.eventservice.EventServiceServerKt")
}

tasks.register<JavaExec>("EventServiceClient") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    main = "com.eventbrite.eventservice.EventServiceClientKt"
}

val otherStartScripts = tasks.register<CreateStartScripts>("otherStartScripts") {
    mainClassName = "com.eventbrite.eventservice.EventServiceClientKt"
    applicationName = "EventServiceClientKt"
    outputDir = tasks.named<CreateStartScripts>("startScripts").get().outputDir
    classpath = tasks.named<CreateStartScripts>("startScripts").get().classpath
}

tasks.named("startScripts") {
    dependsOn(otherStartScripts)
}

