import com.diffplug.gradle.spotless.SpotlessExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.application") version "8.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.diffplug.spotless") version "6.23.3"
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("com.google.firebase:firebase-crashlytics-gradle:3.0.1")
        classpath("com.google.firebase:perf-plugin:1.4.2")
        classpath("com.google.gms:google-services:4.4.2")
    }
}

subprojects {
    apply { plugin("com.diffplug.spotless") }
    configure<SpotlessExtension> {
        kotlin {
            target("**/*.kt")
            ktlint("1.0.1")
                .editorConfigOverride(
                    mapOf(
                        "ktlint_standard_filename" to "disabled",
                        "ktlint_standard_property-naming" to "disabled",
                        "ktlint_standard_function-naming" to "disabled",
                        "ktlint_standard_trailing-comma-on-declaration-site" to "disabled",
                        "ktlint_standard_trailing-comma-on-call-site" to "disabled"
                    )
                )
        }
    }

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions.allWarningsAsErrors = false
        kotlinOptions.freeCompilerArgs += listOf(
            "-opt-in=androidx.compose.material.ExperimentalMaterialApi",
            "-opt-in=androidx.compose.material3.ExperimentalMaterial3Api",
            "-opt-in=androidx.compose.ui.ExperimentalComposeUiApi",
            "-opt-in=androidx.compose.animation.ExperimentalAnimationApi",
            "-opt-in=com.google.accompanist.permissions.ExperimentalPermissionsApi",
            "-opt-in=androidx.compose.foundation.ExperimentalFoundationApi"
        )
    }
}