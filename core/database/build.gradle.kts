plugins {
    alias(libs.plugins.flickfinder.android.library)
    alias(libs.plugins.flickfinder.android.room)
}

android {
    namespace = "com.shadowvault.core.database"
}

dependencies {
    implementation(libs.bundles.koin)
    implementation(projects.core.domain)
}