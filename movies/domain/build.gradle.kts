plugins {
    alias(libs.plugins.flickfinder.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
    implementation(libs.kotlinx.coroutines.core)
}