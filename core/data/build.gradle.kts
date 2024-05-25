plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.shadowvault.core.data"
}

dependencies {

    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}