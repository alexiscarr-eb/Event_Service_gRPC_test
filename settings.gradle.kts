rootProject.name = "Event_Service_gRPC_test"

dependencyResolutionManagement {
    repositories {
        // TODO: double check we need maven local:
        // https://docs.gradle.org/current/userguide/declaring_repositories.html#sec:case-for-maven-local
        mavenLocal()
        google()
        jcenter()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
}

include("proto", "server", "client");
