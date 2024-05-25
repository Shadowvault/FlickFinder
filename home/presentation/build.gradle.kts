plugins {
    alias(libs.plugins.flickfinder.android.feature.ui)
}

android {
    namespace = "com.shadowvault.home.presentation"
}

dependencies {

    implementation(projects.core.domain)
}