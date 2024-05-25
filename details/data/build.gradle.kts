plugins {
    alias(libs.plugins.flickfinder.android.library)
    alias(libs.plugins.flickfinder.jvm.ktor)
}

android {
    namespace = "com.shadowvault.details.data"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}