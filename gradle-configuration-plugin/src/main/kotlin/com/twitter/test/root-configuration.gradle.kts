/**
 * Standard configuration to apply to the root project.
 */

package com.twitter.test

println("ROOT CONFIGURATION")

plugins {
    // Make all other plugins available without the need for explicit versioning.
    id("com.twitter.test.kotlin-library-config") apply false
    id("com.twitter.test.publish") apply false
}
