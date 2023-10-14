// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.2.2")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.48.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21")


        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0-RC" apply false
    id ("com.google.dagger.hilt.android") version "2.48.1" apply false

}
