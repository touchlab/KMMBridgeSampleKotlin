pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://oss.sonatype.org/content/repositories/snapshots")
    }
}
rootProject.name = "KMMBridgeSampleKotlin"
include(":app" ,":shared")
