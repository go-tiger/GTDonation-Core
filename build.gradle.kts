plugins {
    id("java-library")
    id("xyz.jpenilla.run-paper") version "2.3.1"
}

group = "dev.gotiger"
version = "0.1.0"
description = "gotiger Donation Core"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.20.1-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(17)
}

tasks {
    jar {
        archiveFileName = "GTDonation-Core-${version}.jar"
    }
    runServer {
        minecraftVersion("1.20")
    }
    processResources {
        val props = mapOf("version" to version, "description" to project.description)
        inputs.properties(props)
        filteringCharset = "UTF-8"
        filesMatching("plugin.yml") {
            expand(props)
        }
    }
    withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        options.release.set(17)
    }
}
