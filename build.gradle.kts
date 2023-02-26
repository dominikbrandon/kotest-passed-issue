import org.gradle.api.tasks.testing.logging.TestLogEvent.*

plugins {
    kotlin("jvm") version "1.8.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:5.5.5")
}

tasks.withType<Test>().configureEach {
    testLogging {
        events = setOf(PASSED, SKIPPED, FAILED)
    }
    useJUnitPlatform()
}
