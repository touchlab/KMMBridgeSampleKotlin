import org.jfrog.gradle.plugin.artifactory.dsl.DoubleDelegateWrapper
import org.jfrog.gradle.plugin.artifactory.dsl.PublisherConfig

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("co.touchlab.faktory.kmmbridge") version "0.2.6-SNAPSHOT"
    id("maven-publish")
    id("com.jfrog.artifactory") version "4.13.0"
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

//artifactory {
//    setContextUrl("https://touchlabtest.jfrog.io/artifactory")
//    publish(delegateClosureOf<PublisherConfig> {
//        repository(delegateClosureOf<DoubleDelegateWrapper> {
//            setProperty("repoKey", "faktorygradle")
//            setProperty("username", "UNAME")
//            setProperty("password", "TOKEN")
//            setProperty("maven", true)
//        })
//        defaults(delegateClosureOf<groovy.lang.GroovyObject> {
//            invokeMethod(
//                "publications",
//                arrayOf("jvm", "js", "native", "kotlinMultiplatform", "metadata")
//            )
//        })
//    })
//}
publishing {
    repositories {
        maven {
            // change to point to your repo, e.g. http://my.org/repo
            url = uri("https://touchlabtest.jfrog.io/artifactory/faktorygradle")
            credentials {
                this.username = "UNAME"
                this.password = "TOKEN"
            }
        }
    }
}

kmmbridge {
    mavenPublishArtifacts("https://touchlabtest.jfrog.io/artifactory/faktorygradle")
    timestampVersions()
//    githubReleaseArtifacts()
    spm()
//    cocoapods("git@github.com:touchlab/PublicPodspecs.git")
    versionPrefix.set("0.6")
}