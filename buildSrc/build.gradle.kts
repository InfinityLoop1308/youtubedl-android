plugins {
    `kotlin-dsl`
    id("maven-publish")
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.android.tools.build:gradle:7.3.0")
    implementation(gradleApi())
    implementation(localGroovy())
}

gradlePlugin {
    plugins {
        create("PublishPlugin") {
            id = "com.yausername.youtubedl_android"
            implementationClass = "com.yausername.youtubedl_android.PublishPlugin"
        }
    }
}

//kotlin {
//    jvmToolchain {
//        languageVersion.set(JavaLanguageVersion.of(17))
//    }
//}