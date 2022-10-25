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

val gitLabPrivateToken: String by project

kmmbridge {
    timestampVersions()

    mavenPublishArtifacts()

    // cocoapods("https://psh1:${gitLabPrivateToken}@gitlab.com/kickstart-testing/sample-kotlin.git")

    spm()

    versionPrefix.set("0.6")
}

publishing {
    repositories {
        maven {
            url = uri("https://gitlab.com/api/v4/projects/40400272/packages/maven")
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
