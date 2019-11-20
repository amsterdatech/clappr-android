// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
        jcenter()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.5.1")
        classpath("net.saliman:gradle-cobertura-plugin:2.2.5")
        classpath("org.kt3k.gradle.plugin:coveralls-gradle-plugin:2.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
    }
}

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
        jcenter()
        google()
    }
}
