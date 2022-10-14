pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenLocal()
        mavenCentral()
        maven("https://oss.sonatype.org/content/repositories/snapshots")
    }
}
rootProject.name = "KMMBridgeSampleKotlin"
include(":app" ,":shared")

includeBuild("../KMMBridge")