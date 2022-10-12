plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("co.touchlab.faktory.kmmbridge") version "0.2.4"
//    kotlin("native.cocoapods")
}

version = "0.1"
kotlin {
    android()
    ios()
    // Note: iosSimulatorArm64 target requires that all dependencies have M1 support
    iosSimulatorArm64()
    targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget>()
        .filter { it.konanTarget.family.isAppleFamily }
        .forEach { target ->
            target.binaries.framework {
                baseName = "Mike"
            }
        }
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

kmmbridge {
    githubReleaseArtifacts()
    githubReleaseVersions()
    spm("Mike")
//    cocoapods("git@github.com:touchlab/PublicPodspecs.git")
    versionPrefix.set("0.6")
}