plugins {
    kotlin("plugin.jpa") version "1.9.25" apply true
}

dependencies {
    implementation("org.flywaydb:flyway-mysql")
    implementation("org.flywaydb:flyway-core")
    implementation("org.mariadb.jdbc:mariadb-java-client")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}