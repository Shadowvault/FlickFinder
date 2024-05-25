import com.android.build.api.dsl.ApplicationExtension
import com.shadowvault.convention.configureKotlinAndroid
import com.shadowvault.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }
            extensions.configure<ApplicationExtension> {
                defaultConfig {
                    applicationId = libs.find("projectApplicationId").get().toString()
                    targetSdk = libs.find("projectTargetSdkVersion").get().toString().toInt()

                    versionCode = libs.find("projectVersionCode").get().toString().toInt()
                    versionName = libs.find("projectVersionName").get().toString()
                }

                configureKotlinAndroid(this)
            }
        }
    }
}