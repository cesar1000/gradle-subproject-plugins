/**
 * This module contains the Gradle Configuration Gradle plugin.
 */

plugins {
	// Here the behavior is reversed
	// id("com.twitter.test.publish") version "0.0.1" // this DOESN'T work
	id("com.twitter.test.publish") // but this works
}
