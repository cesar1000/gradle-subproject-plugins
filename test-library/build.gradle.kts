/**
 * This module contains the Gradle Configuration Gradle plugin.
 */

plugins {
	id("com.twitter.test.root-configuration") version "0.0.1"
	id("com.twitter.test.publish") version "0.0.1" // this works
	// id("com.twitter.test.publish") // but this doesn't
	`java-library`
}
