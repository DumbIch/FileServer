val kotlinVersion: String by project
val ktorVersion: String by project
val logbackVersion: String by project


plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "ru.dumdumbich"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    // Ktor
    implementation("io.ktor:ktor-server-core-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-netty-jvm:$ktorVersion")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktorVersion")

    // LogBack
    implementation("ch.qos.logback:logback-classic:$logbackVersion")

    // Kotlin
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")

    // Test
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("ru.dumdumbich.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "ru.dumdumbich.ApplicationKt"
    }
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}