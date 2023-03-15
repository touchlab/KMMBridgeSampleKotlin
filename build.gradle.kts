plugins {
    kotlin("multiplatform") version "1.8.10" apply false
    id("com.android.library") version "7.4.1" apply false
}

allprojects {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
