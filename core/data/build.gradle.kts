plugins {
    alias(libs.plugins.flickfinder.android.library)
    alias(libs.plugins.flickfinder.jvm.ktor)
}

android {
    namespace = "com.shadowvault.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}