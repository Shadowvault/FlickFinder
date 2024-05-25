plugins {
    alias(libs.plugins.flickfinder.android.feature.ui)
}

android {
    namespace = "com.shadowvault.details.presentation"
}

dependencies {
    implementation(projects.core.domain)
}