group = "com.sharkbaitextraordinaire.birthday"
version = "0.0.3-SNAPSHOT"
description = "Is It Their Birthday Today?"

plugins {
    id("org.springframework.boot") version("3.5.6")
    id("java")
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.5.6")
    implementation("org.springframework.boot:spring-boot-starter-actuator:3.5.6")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:3.5.6")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.5.6")
    implementation("jakarta.validation:jakarta.validation-api:3.1.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.5.6")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:6.0.1")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
