plugins {
    alias(libs.plugins.flickfinder.android.library)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.shadowvault.movies.data"
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
    implementation(projects.core.data)
    implementation(libs.bundles.ktor)
    implementation(libs.bundles.koin)
    implementation(projects.core.domain)
    implementation(projects.movies.domain)
    implementation(libs.androidx.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}