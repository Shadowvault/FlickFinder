plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.shadowvault.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain)
}