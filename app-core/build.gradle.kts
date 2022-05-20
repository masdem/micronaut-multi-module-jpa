plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
    id("org.jetbrains.kotlin.kapt") version "1.6.10"
    id("io.micronaut.library") version "3.3.0"
}

dependencies {
    kapt("io.micronaut:micronaut-inject:3.4.4")
    kapt("io.micronaut.data:micronaut-data-processor:3.4.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")
    implementation("javax.persistence:javax.persistence-api:2.2")

    implementation("io.micronaut.data:micronaut-data-hibernate-jpa:3.3.0")
//    implementation("io.micronaut.beanvalidation:micronaut-hibernate-validator")
    implementation("org.mindrot:jbcrypt:0.4")

    runtimeOnly("io.micronaut.data:micronaut-data-jdbc:3.1.2")
}
