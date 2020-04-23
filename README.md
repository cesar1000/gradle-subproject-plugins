h1. Repro for https://github.com/gradle/gradle/issues/12878

```
cd gradle-configuration-plugin/
./gradlew :publishToMavenLocal
cd ../test-library/
./gradlew test
```

Check out `build.gradle.kts` and `test/build.gradle.kts` and comment/uncomment plugin registrations to see the issue.
