import co.touchlab.faktory.artifactmanager.GithubReleaseArtifactManager

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    `maven-publish`
    id("co.touchlab.faktory.kmmbridge") version "1.1"
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

kmmbridge {
    timestampVersions()

    mavenPublishArtifacts()

    spm()
    cocoapods("git@gitlab.com:kickstart-testing/yes-this-is-awesome.git")
    versionPrefix.set("0.6")
}

val gitLabPrivateToken: String by project

publishing {
    repositories {
        maven {
            url = uri("https://gitlab.com/api/v4/projects/40398972/packages/maven")
            name = "GitLab"
            credentials(HttpHeaderCredentials::class) {
                name = "Private-Token"
                value = gitLabPrivateToken
            }
            authentication {
                create<HttpHeaderAuthentication>("header")
            }
        }
    }
}
