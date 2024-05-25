plugins {
    `kotlin-dsl`
}

group = "com.shadowvault.flickfinder.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "flickfinder.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "flickfinder.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
    }
}