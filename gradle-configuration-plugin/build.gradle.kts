/**
 * This module contains the Gradle Configuration Gradle plugin.
 */

plugins {
    `maven-publish`
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
	jcenter()
}

group = "com.twitter.gradle.test"
version = "0.0.1"

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}
