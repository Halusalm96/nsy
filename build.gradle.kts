import org.gradle.api.JavaVersion

plugins {
    `java`
    id("org.springframework.boot") version "2.5.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

group = "com.jojoldu.book"
version = "1.0-SNAPSHOT"
val sourceCompatibility: JavaVersion by project

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation(platform("org.junit:junit-bom:5.7.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.7.2")
}

tasks.test {
    useJUnitPlatform()
}
