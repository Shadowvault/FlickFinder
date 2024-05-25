import com.shadowvault.convention.configureKotlinJVM
import org.gradle.api.Plugin
import org.gradle.api.Project

class JVMLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("org.jetbrains.kotlin.jvm")
                configureKotlinJVM()
            }
        }
    }
}