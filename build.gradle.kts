plugins {
    kotlin("jvm") version "1.7.22"
    kotlin("plugin.allopen") version "1.7.22"
    id("io.quarkus")
}

repositories {
    mavenCentral()
    mavenLocal()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:quarkus-kogito-bom:${quarkusPlatformVersion}"))
    implementation("org.kie.kogito:kogito-addons-quarkus-events-decisions")
    implementation("io.quarkus:quarkus-rest-client-reactive-kotlin-serialization")
    implementation("io.quarkiverse.minio:quarkus-minio:2.10.3")
    implementation("org.kie.kogito:kogito-quarkus-decisions")
    implementation("io.quarkus:quarkus-smallrye-jwt")
    implementation("io.quarkus:quarkus-smallrye-graphql")
    implementation("org.kie.kogito:kogito-addons-quarkus-persistence-filesystem")
    implementation("io.quarkiverse.dapr:quarkus-dapr:1.0.4")
    implementation("io.quarkus:quarkus-smallrye-openapi")
    implementation("org.kie.kogito:kogito-quarkus-rules")
    implementation("org.kie.kogito:kogito-addons-quarkus-events-predictions")
    implementation("io.quarkus:quarkus-smallrye-reactive-messaging-kafka")
    implementation("io.quarkus:quarkus-smallrye-graphql-client")
    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.kie.kogito:kogito-addons-quarkus-jobs-management")
    implementation("io.quarkus:quarkus-kafka-streams")
    implementation("org.kie.kogito:kogito-quarkus-serverless-workflow")
    implementation("io.quarkus:quarkus-reactive-routes")
    implementation("org.kie.kogito:kogito-quarkus-predictions")
    implementation("org.kie.kogito:kogito-quarkus-serverless-workflow-devui")
    implementation("org.kie.kogito:kogito-addons-quarkus-events-rules")
    implementation("org.kie.kogito:kogito-quarkus-processes")
    implementation("org.kie.kogito:kogito-addons-quarkus-events-process")
    implementation("io.quarkus:quarkus-kafka-client")
    implementation("io.quarkus:quarkus-avro")
    implementation("io.quarkus:quarkus-vertx-graphql")
    implementation("io.quarkiverse.vault:quarkus-vault")
    implementation("org.kie.kogito:kogito-addons-quarkus-persistence-kafka")
    implementation("io.quarkiverse.jooq:quarkus-jooq:0.4.0")
    implementation("io.quarkus:quarkus-websockets-client")
    implementation("io.quarkus:quarkus-logging-gelf")
    implementation("io.quarkus:quarkus-csrf-reactive")
    implementation("io.quarkus:quarkus-websockets")
    implementation("io.quarkus:quarkus-oidc")
    implementation("io.quarkus:quarkus-liquibase")
    implementation("io.quarkus:quarkus-redis-client")
    implementation("io.quarkiverse.authzed:quarkus-authzed-client:0.2.1")
    implementation("io.quarkus:quarkus-rest-client-reactive-jsonb")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-resteasy-reactive")
    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured")
}

group = "org.acme"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}
allOpen {
    annotation("javax.ws.rs.Path")
    annotation("javax.enterprise.context.ApplicationScoped")
    annotation("io.quarkus.test.junit.QuarkusTest")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    kotlinOptions.javaParameters = true
}
