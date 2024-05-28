plugins {
    alias(libs.plugins.flickfinder.android.library)
}

android {
    namespace = "com.shadowvault.movies.data"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}