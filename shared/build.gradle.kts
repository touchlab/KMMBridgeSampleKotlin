plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("co.touchlab.faktory.kmmbridge") version "0.3.1"
    `maven-publish`
    kotlin("native.cocoapods")
}

version = "0.1"
kotlin {
    android()
    ios()
    // Note: iosSimulatorArm64 target requires that all dependencies have M1 support
    iosSimulatorArm64()
    cocoapods {
        summary = "KMMBridgeSampleKotlin"
        homepage = "https://touchlab.dev"
        ios.deploymentTarget = "13"
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

publishing {
    repositories {
        maven {
            // change to point to your repo, e.g. http://my.org/repo
            val USERNAME: String? by project
            val PASSWORD: String? by project
            name = "Artifactory"
            url = uri("https://touchlabtest.jfrog.io/artifactory/faktorygradle")
            credentials {
                this.username = USERNAME
                this.password = PASSWORD
            }
        }
    }
}

kmmbridge {
    mavenPublishArtifacts()
    githubReleaseVersions()
    spm()
    cocoapods("git@github.com:touchlab/PublicPodspecs.git")
    versionPrefix.set("0.8")
}