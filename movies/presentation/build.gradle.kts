plugins {
    alias(libs.plugins.flickfinder.android.feature.ui)
}

android {
    namespace = "com.shadowvault.movies.presentation"
}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.movies.domain)
}