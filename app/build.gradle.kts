plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("org.jetbrains.compose")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "app.mnr"
    compileSdk = 34
    defaultConfig {
        applicationId = "app.mnr"
        minSdk = 26
        targetSdk = 34
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    buildToolsVersion = "34.0.0"
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")

    // KSP (use latest stable version for compatibility)
    implementation("com.google.devtools.ksp:symbol-processing-api:1.9.10-1.0.13")

    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.10")

    // Material Components dependency
    implementation("com.google.android.material:material:1.12.0")

    // Jetpack Compose dependencies
    implementation("androidx.compose.ui:ui:1.5.1")
    implementation("androidx.compose.material:material:1.7.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.7.1")
    implementation(platform("androidx.compose:compose-bom:2024.09.00"))
    debugImplementation("androidx.compose.ui:ui-tooling")

    // Jetpack Compose LiveData integration
    implementation("androidx.compose.runtime:runtime-livedata:1.7.1")

    // Lifecycle and ViewModel support for Compose
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")

    // Dagger Hilt Core
    implementation("com.google.dagger:hilt-android:2.48.1")
    ksp("com.google.dagger:hilt-android-compiler:2.48.1")

    // Hilt ViewModel
    ksp("androidx.hilt:hilt-compiler:1.0.0")

    // Hilt integration with Jetpack Compose
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    // Room (latest stable version compatible with KSP)
    implementation("androidx.room:room-runtime:2.6.0")
    ksp("androidx.room:room-compiler:2.6.0")

    // LiveData support
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.5")

    // Navigation
    implementation("androidx.navigation:navigation-compose:2.8.0")

    // Retrofit & Gson
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")

    // Coil: AsyncImage
    implementation("io.coil-kt:coil-compose:2.7.0")
    implementation("io.coil-kt:coil-svg:2.2.2")

    // Mockito
    testImplementation("org.mockito:mockito-core:5.13.0")
    testImplementation("org.mockito:mockito-inline:5.2.0")
}
