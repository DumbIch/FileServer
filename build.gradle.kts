val kotlinVersion: String by project
val ktorVersion: String by project
val logbackVersion: String by project


plugins {
    kotlin("jvm") version "1.8.0"
    application
    kotlin("plugin.serialization") version "1.8.0"
    id("io.ktor.plugin") version "2.2.4"
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
    implementation("io.ktor:ktor-server-resources:$ktorVersion")
    implementation("io.ktor:ktor-server-html-builder:$ktorVersion")
    implementation("io.ktor:ktor-server-default-headers:$ktorVersion")
    implementation("io.ktor:ktor-server-freemarker:$ktorVersion")
    implementation("io.ktor:ktor-server-call-logging:$ktorVersion")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktorVersion")

    // LogBack
    implementation("ch.qos.logback:logback-classic:$logbackVersion")

    // Kotlin
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("commons-io:commons-io:2.11.0")
    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlinVersion")
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