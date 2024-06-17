import java.util.Properties

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}


android {
    namespace = "com.example.currencyconverter"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.currencyconverter"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    lint {
        textReport = true
        lintConfig = rootProject.file("lint.xml")
        checkDependencies = true
        checkTestSources = true
        explainIssues = true
        checkReleaseBuilds = true
        abortOnError = true
        disable += listOf(
            "UnusedIds", // Can give false positives
            "StaticFieldLeak", //  So you can inject app context in viewModels without a warning
            "UnusedResources", // Can give false positives as it does not always recognize resources used in databindings
            "ObsoleteLintCustomCheck", // false positives
            "ComposableNaming"
        )
    }

    val javaVersion = JavaVersion.VERSION_17

    compileOptions {
        sourceCompatibility = javaVersion
        targetCompatibility = javaVersion
    }

    kotlinOptions {
        jvmTarget = javaVersion.toString()
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }

    packaging {
        resources.excludes.add("META-INF/AL2.0")
        resources.excludes.add("META-INF/LGPL2.1")
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.runtime.android)
    implementation(libs.androidx.foundation.layout.android)
    implementation(libs.androidx.ui.android)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.ui.tooling.preview.android)
    implementation(libs.androidx.activity.compose)
    implementation (libs.logging.interceptor)
    implementation (libs.logging.interceptor.v490)
    implementation (libs.retrofit2.kotlin.coroutines.adapter)
    implementation(libs.converter.simplexml)
    implementation (libs.converter.jaxb)

    // retrofit
    implementation (libs.retrofit)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    debugImplementation(libs.androidx.ui.tooling)
}