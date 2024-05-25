plugins {
    alias(libs.plugins.flickfinder.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}