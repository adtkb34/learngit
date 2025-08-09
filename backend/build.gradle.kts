buildscript {
    repositories {
        maven(url = "https://repo1.maven.org/maven2")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23")
        classpath("org.springframework.boot:spring-boot-gradle-plugin:3.2.4")
        classpath("io.spring.gradle:dependency-management-plugin:1.1.4")
    }
}

apply(plugin = "org.jetbrains.kotlin.jvm")
apply(plugin = "org.jetbrains.kotlin.plugin.spring")
apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    maven(url = "https://repo1.maven.org/maven2")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.4")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.2.4")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
